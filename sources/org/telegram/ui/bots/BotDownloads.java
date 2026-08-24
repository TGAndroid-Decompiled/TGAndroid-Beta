package org.telegram.ui.bots;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LoadingSpan;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.LaunchActivity;

public class BotDownloads {
    public final long botId;
    public final Context context;
    public final int currentAccount;
    private FileDownload currentFile;
    public final DownloadManager downloadManager;
    private final ArrayList files = new ArrayList();
    private static final HashMap instances = new HashMap();
    private static HashMap cachedMimeAndSizes = new HashMap();

    public static BotDownloads get(Context context, int i, long j) {
        Pair pair = new Pair(Integer.valueOf(i), Long.valueOf(j));
        HashMap map = instances;
        BotDownloads botDownloads = (BotDownloads) map.get(pair);
        if (botDownloads != null) {
            return botDownloads;
        }
        BotDownloads botDownloads2 = new BotDownloads(context, i, j);
        map.put(pair, botDownloads2);
        return botDownloads2;
    }

    private BotDownloads(Context context, int i, long j) {
        this.context = context;
        this.currentAccount = i;
        this.botId = j;
        this.downloadManager = (DownloadManager) context.getSystemService("download");
        Set<String> stringSet = context.getSharedPreferences("botdownloads_" + i, 0).getStringSet("" + j, null);
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    FileDownload fileDownload = new FileDownload(new JSONObject(it.next()));
                    File file = fileDownload.file;
                    if (file != null && file.exists()) {
                        this.files.add(fileDownload);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public FileDownload getCached(String str) {
        ArrayList arrayList = this.files;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            FileDownload fileDownload = (FileDownload) obj;
            if (TextUtils.equals(fileDownload.url, str) && fileDownload.done) {
                return fileDownload;
            }
        }
        return null;
    }

    public FileDownload download(String str, String str2) {
        FileDownload cached = getCached(str);
        if (cached != null) {
            this.currentFile = cached;
            cached.resaved = true;
            postNotify();
            return cached;
        }
        FileDownload fileDownload = new FileDownload(str, str2);
        this.currentFile = fileDownload;
        fileDownload.shown = false;
        this.files.add(fileDownload);
        save();
        postNotify();
        return fileDownload;
    }

    public FileDownload getCurrent() {
        return this.currentFile;
    }

    public boolean isDownloading() {
        ArrayList arrayList = this.files;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((FileDownload) obj).isDownloading()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFiles() {
        return !this.files.isEmpty();
    }

    public ArrayList getFiles() {
        return this.files;
    }

    public void cancel(FileDownload fileDownload) {
        if (fileDownload == null) {
            return;
        }
        fileDownload.cancelled = true;
        Long l = fileDownload.id;
        if (l != null) {
            this.downloadManager.remove(l.longValue());
            fileDownload.id = null;
        }
        this.files.remove(fileDownload);
        postNotify();
    }

    public void save() {
        int i = 0;
        SharedPreferences.Editor editorEdit = this.context.getSharedPreferences("botdownloads_" + this.currentAccount, 0).edit();
        editorEdit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.files;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hashSet.add(((FileDownload) obj).toJSON().toString());
        }
        editorEdit.putStringSet("" + this.botId, hashSet);
        editorEdit.apply();
    }

    public void postNotify() {
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.botDownloadsUpdate, new Object[0]);
    }

    public class FileDownload {
        public boolean cancelled;
        public boolean done;
        public File file;
        public String file_name;
        public Long id;
        public long last_progress_time;
        public long loaded_size;
        public String mime;
        public boolean resaved;
        public boolean shown;
        public long size;
        private final Runnable updateProgressRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.updateProgress();
            }
        };
        public String url;

        public FileDownload(String str, String str2) {
            String str3;
            this.url = str;
            this.file_name = str2;
            TLRPC.User user = MessagesController.getInstance(BotDownloads.this.currentAccount).getUser(Long.valueOf(BotDownloads.this.botId));
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setTitle(UserObject.getUserName(user));
            if (TextUtils.isEmpty(str2)) {
                str3 = "Downloading file...";
            } else {
                str3 = "Downloading " + str2 + "...";
            }
            request.setDescription(str3);
            request.setNotificationVisibility(0);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
            this.id = Long.valueOf(BotDownloads.this.downloadManager.enqueue(request));
        }

        public FileDownload(JSONObject jSONObject) {
            this.url = jSONObject.optString("url");
            this.file_name = jSONObject.optString("file_name");
            this.size = jSONObject.optLong("size");
            this.done = jSONObject.optBoolean("done");
            this.mime = jSONObject.optString("mime");
            String strOptString = jSONObject.optString("path");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            this.file = new File(strOptString);
        }

        public JSONObject toJSON() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", this.url);
                jSONObject.put("file_name", this.file_name);
                jSONObject.put("size", this.size);
                File file = this.file;
                jSONObject.put("path", file == null ? null : file.getAbsolutePath());
                jSONObject.put("done", this.done);
                jSONObject.put("mime", this.mime);
                return jSONObject;
            } catch (Exception e) {
                FileLog.e(e);
                return jSONObject;
            }
        }

        public void updateProgress() {
            if (this.done || this.cancelled) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(this.updateProgressRunnable);
            this.last_progress_time = System.currentTimeMillis();
            DownloadManager.Query query = new DownloadManager.Query();
            query.setFilterById(this.id.longValue());
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = BotDownloads.this.downloadManager.query(query);
                    if (cursorQuery.moveToFirst()) {
                        int i = cursorQuery.getInt(cursorQuery.getColumnIndex("status"));
                        if (i == 8) {
                            File file = new File(Uri.parse(cursorQuery.getString(cursorQuery.getColumnIndex("local_uri"))).getPath());
                            this.file = file;
                            this.done = true;
                            long length = file.length();
                            this.size = length;
                            if (length <= 0) {
                                cancel();
                            }
                            BotDownloads.this.save();
                        } else if (i == 16) {
                            cancel();
                            cursorQuery.close();
                            return;
                        } else {
                            this.loaded_size = cursorQuery.getLong(cursorQuery.getColumnIndex("bytes_so_far"));
                            this.size = cursorQuery.getLong(cursorQuery.getColumnIndex("total_size"));
                            AndroidUtilities.runOnUIThread(this.updateProgressRunnable, 160L);
                        }
                    } else if (!this.done) {
                        cancel();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    if (0 != 0) {
                    }
                    BotDownloads.this.postNotify();
                }
                cursorQuery.close();
                BotDownloads.this.postNotify();
            } catch (Throwable th) {
                if (0 != 0) {
                    cursorQuery.close();
                }
                throw th;
            }
        }

        public Pair getProgress() {
            if (this.done) {
                return new Pair(Long.valueOf(this.size), Long.valueOf(this.size));
            }
            if (this.id == null || this.cancelled) {
                return new Pair(Long.valueOf(this.loaded_size), Long.valueOf(this.size));
            }
            if (System.currentTimeMillis() - this.last_progress_time < 150) {
                return new Pair(Long.valueOf(this.loaded_size), Long.valueOf(this.size));
            }
            updateProgress();
            return new Pair(Long.valueOf(this.loaded_size), Long.valueOf(this.size));
        }

        public void cancel() {
            BotDownloads.this.cancel(this);
        }

        public void open() {
            File file = this.file;
            if (file == null || !file.exists()) {
                return;
            }
            File file2 = this.file;
            AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.instance, null, true);
        }

        public boolean isDownloading() {
            return (this.done || this.id == null) ? false : true;
        }
    }

    public static void getMimeAndSize(final String str, final Utilities.Callback2 callback2) {
        if (cachedMimeAndSizes.containsKey(str)) {
            Pair pair = (Pair) cachedMimeAndSizes.get(str);
            callback2.run((String) pair.first, (Long) pair.second);
        } else {
            new AsyncTask() {
                String mime;
                long size;

                @Override
                public String doInBackground(String... strArr) {
                    try {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                        httpURLConnection.setRequestMethod("GET");
                        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                        httpURLConnection.setConnectTimeout(1000);
                        httpURLConnection.setReadTimeout(1000);
                        httpURLConnection.setUseCaches(false);
                        httpURLConnection.setDefaultUseCaches(false);
                        httpURLConnection.setDoOutput(false);
                        httpURLConnection.setDoInput(false);
                        httpURLConnection.getResponseCode();
                        if (Build.VERSION.SDK_INT >= 24) {
                            this.size = httpURLConnection.getContentLengthLong();
                        } else {
                            this.size = httpURLConnection.getContentLength();
                        }
                        String contentType = httpURLConnection.getContentType();
                        this.mime = contentType;
                        if (contentType.contains("; ")) {
                            String str2 = this.mime;
                            this.mime = str2.substring(0, str2.indexOf("; "));
                        }
                        httpURLConnection.getInputStream().close();
                        return null;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return null;
                    }
                }

                @Override
                public void onPostExecute(String str2) {
                    BotDownloads.cachedMimeAndSizes.put(str, new Pair(this.mime, Long.valueOf(this.size)));
                    Utilities.Callback2 callback3 = callback2;
                    if (callback3 != null) {
                        callback3.run(this.mime, Long.valueOf(this.size));
                    }
                }
            }.execute(str);
        }
    }

    public static void showAlert(Context context, String str, String str2, String str3, Utilities.Callback callback) {
        if (callback == null) {
            return;
        }
        showAlert(context, str, str2, str3, callback, 0L, "");
    }

    public static AlertDialog showAlert(Context context, String str, String str2, String str3, final Utilities.Callback callback, long j, String str4) {
        if (callback == null) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(LocaleController.getString(R.string.BotDownloadFileTitle));
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotDownloadFileText, str3)));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(44.0f), Theme.getColor(Theme.key_featuredStickers_addButton)));
        imageView.setImageResource(R.drawable.msg_round_file_s);
        linearLayout.addView(imageView, LayoutHelper.createLinear(44, 44, 19, 0, 0, 10, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(str2);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlue2));
        linearLayout2.addView(textView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 3.0f));
        final AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, true);
        animatedTextView.setTextSize(AndroidUtilities.dp(12.0f));
        SpannableString spannableString = new SpannableString("l");
        LoadingSpan loadingSpan = new LoadingSpan(animatedTextView, AndroidUtilities.dp(55.0f));
        int i = Theme.key_chat_inFileInfoText;
        loadingSpan.setColors(Theme.multAlpha(Theme.getColor(i), 0.35f), Theme.multAlpha(Theme.getColor(i), 0.075f));
        spannableString.setSpan(loadingSpan, 0, 1, 33);
        animatedTextView.setText(spannableString);
        getMimeAndSize(str, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                BotDownloads.$r8$lambda$Hqq6I3GomsJ5IjmnhzIfOGWibtc(animatedTextView, (String) obj, (Long) obj2);
            }
        });
        animatedTextView.setTextColor(Theme.getColor(i));
        linearLayout2.addView(animatedTextView, LayoutHelper.createLinear(-1, 15));
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 23, 0, 0, 0, 2));
        builder.setView(linearLayout);
        final boolean[] zArr = new boolean[1];
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                BotDownloads.$r8$lambda$SvY6Nau02KUegIqZhFcTpXoUtaQ(zArr, callback, alertDialog, i2);
            }
        });
        builder.setPositiveButton(LocaleController.getString(R.string.BotDownloadFileDownload), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                BotDownloads.m4813$r8$lambda$0V5vVA5p02uOzaqNbeUDVEoiqw(zArr, callback, alertDialog, i2);
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                BotDownloads.$r8$lambda$OQh7ybzxESYhklG32SuXfFcyUBY(zArr, callback, dialogInterface);
            }
        });
        alertDialogCreate.show();
        return alertDialogCreate;
    }

    public static void $r8$lambda$Hqq6I3GomsJ5IjmnhzIfOGWibtc(AnimatedTextView animatedTextView, String str, Long l) {
        StringBuilder sb = new StringBuilder();
        if (l.longValue() > 0) {
            sb.append("~");
            sb.append(AndroidUtilities.formatFileSize(l.longValue()));
        }
        String upperCase = str == null ? null : getExt(str).toUpperCase();
        if (!TextUtils.isEmpty(upperCase)) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(upperCase.toUpperCase());
        }
        if (sb.length() <= 0) {
            sb.append(LocaleController.getString(R.string.AttachDocument));
        }
        animatedTextView.setText(sb);
    }

    public static void $r8$lambda$SvY6Nau02KUegIqZhFcTpXoUtaQ(boolean[] zArr, Utilities.Callback callback, AlertDialog alertDialog, int i) {
        if (zArr[0]) {
            return;
        }
        callback.run(Boolean.FALSE);
        zArr[0] = true;
    }

    public static void m4813$r8$lambda$0V5vVA5p02uOzaqNbeUDVEoiqw(boolean[] zArr, Utilities.Callback callback, AlertDialog alertDialog, int i) {
        if (zArr[0]) {
            return;
        }
        callback.run(Boolean.TRUE);
        zArr[0] = true;
    }

    public static void $r8$lambda$OQh7ybzxESYhklG32SuXfFcyUBY(boolean[] zArr, Utilities.Callback callback, DialogInterface dialogInterface) {
        if (zArr[0]) {
            return;
        }
        callback.run(Boolean.FALSE);
        zArr[0] = true;
    }

    public static String getExt(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        switch (str) {
            case "application/epub+zip":
                return "epub";
            case "application/vnd.oasis.opendocument.text":
                return "odt";
            case "video/3gpp":
            case "audio/3gpp":
                return "3gp";
            case "application/vnd.ms-fontobject":
                return "eot";
            case "application/x-cdf":
                return "cda";
            case "application/x-csh":
                return "csh";
            case "video/x-msvideo":
                return "avi";
            case "application/vnd.openxmlformats-officedocument.presentationml.presentation":
                return "pptx";
            case "application/vnd.ms-powerpoint":
                return "ppt";
            case "application/vnd.openxmlformats-officedocument.wordprocessingml.document":
                return "docx";
            case "audio/x-midi":
                return "midi";
            case "text/calendar":
                return "ics";
            case "application/x-httpd-php":
                return "php";
            case "audio/3gpp2":
            case "video/3gpp2":
                return "3g2";
            case "application/vnd.apple.installer+xml":
                return "mpkg";
            case "application/vnd.ms-excel":
                return "xls";
            case "application/gzip":
            case "application/x-gzip":
                return "gz";
            case "application/x-sh":
                return "sh";
            case "audio/ogg":
                return "opus";
            case "text/plain":
                return "txt";
            case "application/x-abiword":
                return "abw";
            case "application/ld+json":
                return "jsonld";
            case "application/msword":
                return "doc";
            case "application/x-bzip":
                return "bz";
            case "application/octet-stream":
                return "bin";
            case "application/x-bzip2":
                return "bz2";
            case "application/vnd.oasis.opendocument.presentation":
                return "odp";
            case "application/x-7z-compressed":
                return "7z";
            case "application/x-freearc":
                return "arc";
            case "audio/mpeg":
                return "mp3";
            case "application/vnd.rar":
                return "rar";
            case "image/vnd.microsoft.icon":
                return "ico";
            case "application/vnd.oasis.opendocument.spreadsheet":
                return "ods";
            case "application/vnd.amazon.ebook":
                return "azw";
            case "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet":
                return "xlsx";
            case "application/java-archive":
                return "jar";
            case "text/javascript":
                return "js";
            default:
                if (str.contains("/")) {
                    str = str.substring(str.indexOf("/") + 1);
                }
                if (str.contains("-")) {
                    str = str.substring(str.indexOf("-") + 1);
                }
                if (str.contains("+")) {
                    str = str.substring(0, str.indexOf("+"));
                }
                return str.toLowerCase();
        }
    }

    public static class DownloadBulletin extends Bulletin.ButtonLayout {
        public final BackgroundDrawable background;
        private int currentButtonType;
        private FileDownload file;
        private final ImageView imageView;
        private final Theme.ResourcesProvider resourcesProvider;
        public final StatusDrawable status;
        private final TextView subtitleView;
        private final LinearLayout textLayout;
        private final TextView titleView;

        public DownloadBulletin(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            this.currentButtonType = 0;
            this.resourcesProvider = resourcesProvider;
            BackgroundDrawable color = new BackgroundDrawable(AndroidUtilities.dp(10.0f)).setColor(Theme.getColor(Theme.key_undo_background, resourcesProvider));
            this.background = color;
            setBackground(color);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            StatusDrawable statusDrawable = new StatusDrawable(context, imageView);
            this.status = statusDrawable;
            imageView.setImageDrawable(statusDrawable);
            addView(imageView, LayoutHelper.createFrame(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            this.textLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 14.0f);
            int i = Theme.key_undo_infoColor;
            textView.setTextColor(Theme.getColor(i, resourcesProvider));
            textView.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 2));
            TextView textView2 = new TextView(context);
            this.subtitleView = textView2;
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(Theme.getColor(i, resourcesProvider));
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 0));
        }

        public boolean set(FileDownload fileDownload) {
            if (this.file != fileDownload) {
                this.status.reset();
            }
            this.file = fileDownload;
            this.titleView.setText(fileDownload.file_name);
            if (fileDownload.isDownloading()) {
                Pair progress = fileDownload.getProgress();
                this.status.setProgress(progress);
                if (((Long) progress.first).longValue() <= 0) {
                    this.subtitleView.setText(LocaleController.getString(R.string.BotFileDownloading));
                } else if (((Long) progress.second).longValue() <= 0) {
                    this.subtitleView.setText(AndroidUtilities.formatFileSize(((Long) progress.first).longValue()));
                } else {
                    this.subtitleView.setText(AndroidUtilities.formatFileSize(((Long) progress.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) progress.second).longValue()));
                }
                setButton(1);
            } else {
                if (fileDownload.cancelled) {
                    Bulletin bulletin = getBulletin();
                    if (bulletin != null) {
                        bulletin.hide();
                    }
                    return true;
                }
                if (fileDownload.done) {
                    this.subtitleView.setText(LocaleController.getString(R.string.BotFileDownloaded));
                    setButton(2);
                    this.status.setDone(false);
                    Bulletin bulletin2 = getBulletin();
                    if (bulletin2 != null) {
                        bulletin2.setCanHide(false);
                        bulletin2.setDuration(5000);
                        bulletin2.setCanHide(true);
                    }
                }
            }
            return false;
        }

        private void setButton(int i) {
            if (this.currentButtonType == i) {
                return;
            }
            this.currentButtonType = i;
            if (i == 0) {
                setButton((Bulletin.Button) null);
                return;
            }
            if (i == 1) {
                Bulletin.UndoButton undoAction = new Bulletin.UndoButton(getContext(), true, this.resourcesProvider).setText(LocaleController.getString(R.string.BotFileDownloadCancel)).setUndoAction(new Runnable() {
                    @Override
                    public final void run() {
                        BotDownloads.DownloadBulletin.$r8$lambda$64rnEAyYJPUBjhVIPF4b0eiCgHE(this.f$0);
                    }
                });
                if (getBulletin() != null) {
                    undoAction.onAttach(this, getBulletin());
                }
                setButton(undoAction);
                return;
            }
            if (i == 2) {
                Bulletin.UndoButton undoAction2 = new Bulletin.UndoButton(getContext(), true, this.resourcesProvider).setText(LocaleController.getString(R.string.BotFileDownloadOpen)).setUndoAction(new Runnable() {
                    @Override
                    public final void run() {
                        BotDownloads.DownloadBulletin.$r8$lambda$Kfwamuy1Zso0VXiVoUsH0oAvFt4(this.f$0);
                    }
                });
                if (getBulletin() != null) {
                    undoAction2.onAttach(this, getBulletin());
                }
                setButton(undoAction2);
            }
        }

        public static void $r8$lambda$64rnEAyYJPUBjhVIPF4b0eiCgHE(DownloadBulletin downloadBulletin) {
            Bulletin bulletin = downloadBulletin.getBulletin();
            if (bulletin != null) {
                bulletin.setDuration(2750);
                bulletin.setCanHide(true);
            }
            FileDownload fileDownload = downloadBulletin.file;
            if (fileDownload != null) {
                fileDownload.cancel();
            }
        }

        public static void $r8$lambda$Kfwamuy1Zso0VXiVoUsH0oAvFt4(DownloadBulletin downloadBulletin) {
            Bulletin bulletin = downloadBulletin.getBulletin();
            if (bulletin != null) {
                bulletin.hide();
            }
            FileDownload fileDownload = downloadBulletin.file;
            if (fileDownload != null) {
                fileDownload.open();
            }
        }

        public void setArrow(int i) {
            this.background.setArrow(i);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(68.0f), 1073741824));
        }

        private static class StatusDrawable extends Drawable {
            private AnimatedFloat animatedDone;
            private AnimatedFloat animatedHasPercent;
            private AnimatedFloat animatedProgress;
            private boolean cancelled;
            private final Drawable doc;
            private boolean done;
            private RLottieDrawable doneDrawable;
            private boolean hasPercent;
            private float progress;
            private final RectF rect;
            private final long start;
            private final Paint strokePaint;
            private final View view;

            @Override
            public int getOpacity() {
                return -2;
            }

            @Override
            public void setAlpha(int i) {
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }

            public StatusDrawable(Context context, View view) {
                Paint paint = new Paint(1);
                this.strokePaint = paint;
                this.rect = new RectF();
                this.done = false;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.invalidateSelf();
                    }
                };
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                this.animatedHasPercent = new AnimatedFloat(runnable, 0L, 320L, cubicBezierInterpolator);
                this.animatedProgress = new AnimatedFloat(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.invalidateSelf();
                    }
                }, 0L, 320L, cubicBezierInterpolator);
                this.animatedDone = new AnimatedFloat(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.invalidateSelf();
                    }
                }, 0L, 320L, cubicBezierInterpolator);
                this.view = view;
                this.start = System.currentTimeMillis();
                this.doc = context.getResources().getDrawable(R.drawable.search_files_filled).mutate();
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
            }

            public void reset() {
                AnimatedFloat animatedFloat = this.animatedDone;
                this.done = false;
                animatedFloat.set(false, true);
                this.cancelled = false;
                RLottieDrawable rLottieDrawable = this.doneDrawable;
                if (rLottieDrawable != null) {
                    rLottieDrawable.recycle(true);
                    this.doneDrawable = null;
                }
                AnimatedFloat animatedFloat2 = this.animatedHasPercent;
                this.hasPercent = false;
                animatedFloat2.set(false, true);
            }

            public void setProgress(Pair pair) {
                boolean z = pair != null && ((Long) pair.second).longValue() > 0;
                this.hasPercent = z;
                if (z) {
                    this.progress = Utilities.clamp(((Long) pair.first).longValue() / ((Long) pair.second).longValue(), 1.0f, 0.0f);
                }
                invalidateSelf();
            }

            public void setDone(boolean z) {
                if (this.done) {
                    return;
                }
                this.done = true;
                this.cancelled = z;
                RLottieDrawable rLottieDrawable = new RLottieDrawable(z ? R.raw.error : R.raw.contact_check, z ? "error" : "contact_check", AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                this.doneDrawable = rLottieDrawable;
                rLottieDrawable.setMasterParent(this.view);
                this.doneDrawable.setAllowDecodeSingleFrame(true);
                this.doneDrawable.start();
                if (z) {
                    return;
                }
                this.progress = 1.0f;
            }

            @Override
            public void draw(Canvas canvas) {
                float f;
                float f2;
                Canvas canvas2 = canvas;
                Rect bounds = getBounds();
                int iCenterX = bounds.centerX();
                int iCenterY = bounds.centerY();
                float f3 = this.animatedDone.set(this.done);
                if (f3 < 1.0f) {
                    float f4 = 1.0f - f3;
                    float f5 = (f4 * 0.4f) + 0.6f;
                    canvas2.save();
                    float f6 = iCenterX;
                    float f7 = iCenterY;
                    canvas2.scale(f5, f5, f6, f7);
                    Drawable drawable = this.doc;
                    f = 255.0f;
                    drawable.setBounds(iCenterX - (drawable.getIntrinsicWidth() / 2), iCenterY - (this.doc.getIntrinsicHeight() / 2), (this.doc.getIntrinsicWidth() / 2) + iCenterX, (this.doc.getIntrinsicHeight() / 2) + iCenterY);
                    this.doc.setAlpha((int) (f4 * 255.0f));
                    this.doc.draw(canvas2);
                    float fDp = AndroidUtilities.dp(14.0f);
                    this.strokePaint.setColor(Theme.multAlpha(-1, 0.2f * f4));
                    canvas2.drawCircle(f6, f7, fDp, this.strokePaint);
                    float f8 = f4 * 1.0f;
                    this.strokePaint.setColor(Theme.multAlpha(-1, f8));
                    f2 = 0.6f;
                    this.rect.set(f6 - fDp, f7 - fDp, f6 + fDp, f7 + fDp);
                    float f9 = this.animatedHasPercent.set(this.hasPercent);
                    this.strokePaint.setColor(Theme.multAlpha(-1, f4 * 0.15f * (1.0f - f9)));
                    canvas2.drawArc(this.rect, (-(((((System.currentTimeMillis() - this.start) % 600) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, this.strokePaint);
                    float fCurrentTimeMillis = ((System.currentTimeMillis() - this.start) * 0.45f) % 5400.0f;
                    float fMax = Math.max(0.0f, ((1520.0f * fCurrentTimeMillis) / 5400.0f) - 20.0f);
                    for (int i = 0; i < 4; i++) {
                        FastOutSlowInInterpolator fastOutSlowInInterpolator = CircularProgressDrawable.interpolator;
                        int i2 = i * 1350;
                        fastOutSlowInInterpolator.getInterpolation((fCurrentTimeMillis - i2) / 667.0f);
                        fMax += fastOutSlowInInterpolator.getInterpolation((fCurrentTimeMillis - (i2 + 667)) / 667.0f) * 250.0f;
                    }
                    this.strokePaint.setColor(Theme.multAlpha(-1, f8));
                    canvas2 = canvas;
                    canvas2.drawArc(this.rect, (-90.0f) - fMax, Math.max(0.02f, this.animatedProgress.set(this.progress)) * (-360.0f) * f9, false, this.strokePaint);
                    invalidateSelf();
                    canvas2.restore();
                } else {
                    f = 255.0f;
                    f2 = 0.6f;
                }
                if (f3 > 0.0f) {
                    float f10 = (0.4f * f3) + f2;
                    if (this.cancelled) {
                        canvas2.save();
                        canvas2.scale(f10, f10, iCenterX, iCenterY);
                    }
                    RLottieDrawable rLottieDrawable = this.doneDrawable;
                    if (rLottieDrawable != null) {
                        rLottieDrawable.setBounds(iCenterX - (rLottieDrawable.getIntrinsicWidth() / 2), iCenterY - (this.doneDrawable.getIntrinsicHeight() / 2), iCenterX + (this.doneDrawable.getIntrinsicWidth() / 2), iCenterY + (this.doneDrawable.getIntrinsicHeight() / 2));
                        this.doneDrawable.setAlpha((int) (f3 * f));
                        this.doneDrawable.draw(canvas2);
                    }
                    if (this.cancelled) {
                        canvas2.restore();
                    }
                }
            }

            @Override
            public int getIntrinsicWidth() {
                return AndroidUtilities.dp(40.0f);
            }

            @Override
            public int getIntrinsicHeight() {
                return AndroidUtilities.dp(40.0f);
            }
        }

        private static class BackgroundDrawable extends Drawable {
            private boolean arrow;
            private int arrowMargin;
            private final AnimatedFloat arrowProgress;
            private final AnimatedFloat arrowX;
            private final Path path;
            private final int r;
            private final Paint paint = new Paint(1);
            private final RectF rect = new RectF();

            @Override
            public int getOpacity() {
                return -2;
            }

            @Override
            public void setAlpha(int i) {
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }

            public BackgroundDrawable(int i) {
                Path path = new Path();
                this.path = path;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.invalidateSelf();
                    }
                };
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                this.arrowProgress = new AnimatedFloat(runnable, 0L, 320L, cubicBezierInterpolator);
                this.arrowX = new AnimatedFloat(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.invalidateSelf();
                    }
                }, 0L, 320L, cubicBezierInterpolator);
                this.r = i;
                path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
                path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
                path.lineTo(0.0f, -AndroidUtilities.dp(6.16f));
                path.close();
            }

            public void setArrow(int i) {
                boolean z = i >= 0;
                this.arrow = z;
                if (z) {
                    this.arrowMargin = i;
                }
                invalidateSelf();
            }

            public BackgroundDrawable setColor(int i) {
                this.paint.setColor(i);
                return this;
            }

            @Override
            public void draw(Canvas canvas) {
                this.rect.set(getBounds());
                this.rect.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                RectF rectF = this.rect;
                float f = this.r;
                canvas.drawRoundRect(rectF, f, f, this.paint);
                float f2 = this.arrowProgress.set(this.arrow);
                float fDp = (this.rect.right + AndroidUtilities.dp(8.0f)) - this.arrowX.set(this.arrowMargin);
                if (f2 > 0.0f) {
                    canvas.save();
                    canvas.translate(fDp, AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(6.16f) * (1.0f - f2)));
                    canvas.drawPath(this.path, this.paint);
                    canvas.restore();
                }
            }
        }
    }

    public static void clear() {
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return;
        }
        for (int i = 0; i < 4; i++) {
            context.getSharedPreferences("botdownloads_" + i, 0).edit().clear().apply();
        }
        instances.clear();
    }
}
