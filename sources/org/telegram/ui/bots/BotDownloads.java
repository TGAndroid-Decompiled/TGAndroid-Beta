package org.telegram.ui.bots;

import android.app.DownloadManager;
import android.content.Context;
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
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_language_id_common.zzij;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.VoIPFragment$8$$ExternalSyntheticLambda1;

public final class BotDownloads {
    public final long botId;
    public final Context context;
    public final int currentAccount;
    public FileDownload currentFile;
    public final DownloadManager downloadManager;
    public final ArrayList files = new ArrayList();
    public static final HashMap instances = new HashMap();
    public static final HashMap cachedMimeAndSizes = new HashMap();

    public final class DownloadBulletin extends Bulletin.ButtonLayout {
        public final BackgroundDrawable background;
        public int currentButtonType;
        public FileDownload file;
        public final Theme.ResourcesProvider resourcesProvider;
        public final StatusDrawable status;
        public final TextView subtitleView;
        public final TextView titleView;

        public final class BackgroundDrawable extends Drawable {
            public boolean arrow;
            public int arrowMargin;
            public final AnimatedFloat arrowProgress;
            public final AnimatedFloat arrowX;
            public final Path path;
            public final int r;
            public final Paint paint = new Paint(1);
            public final RectF rect = new RectF();

            public BackgroundDrawable(int i) {
                Path path = new Path();
                this.path = path;
                VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda1 = new VoIPFragment$8$$ExternalSyntheticLambda1(this, 4);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                this.arrowProgress = new AnimatedFloat(voIPFragment$8$$ExternalSyntheticLambda1, 320L, cubicBezierInterpolator, 0);
                this.arrowX = new AnimatedFloat(new VoIPFragment$8$$ExternalSyntheticLambda1(this, 4), 320L, cubicBezierInterpolator, 0);
                this.r = i;
                path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
                path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
                path.lineTo(0.0f, -AndroidUtilities.dp(6.16f));
                path.close();
            }

            @Override
            public final void draw(Canvas canvas) {
                RectF rectF = this.rect;
                rectF.set(getBounds());
                rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                float f = this.r;
                Paint paint = this.paint;
                canvas.drawRoundRect(rectF, f, f, paint);
                float f2 = this.arrowProgress.set(this.arrow);
                float fDp = (rectF.right + AndroidUtilities.dp(8.0f)) - this.arrowX.set(this.arrowMargin, false);
                if (f2 > 0.0f) {
                    canvas.save();
                    canvas.translate(fDp, DiffUtil.m(1.0f, f2, AndroidUtilities.dp(6.16f), AndroidUtilities.dp(8.0f)));
                    canvas.drawPath(this.path, paint);
                    canvas.restore();
                }
            }

            @Override
            public final int getOpacity() {
                return -2;
            }

            @Override
            public final void setAlpha(int i) {
            }

            @Override
            public final void setColorFilter(ColorFilter colorFilter) {
            }
        }

        public final class StatusDrawable extends Drawable {
            public final AnimatedFloat animatedDone;
            public final AnimatedFloat animatedHasPercent;
            public final AnimatedFloat animatedProgress;
            public final Drawable doc;
            public boolean done;
            public RLottieDrawable doneDrawable;
            public boolean hasPercent;
            public float progress;
            public final RectF rect;
            public final long start;
            public final Paint strokePaint;
            public final ImageView view;

            public StatusDrawable(Context context, ImageView imageView) {
                Paint paint = new Paint(1);
                this.strokePaint = paint;
                this.rect = new RectF();
                this.done = false;
                int i = 5;
                VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda1 = new VoIPFragment$8$$ExternalSyntheticLambda1(this, i);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                this.animatedHasPercent = new AnimatedFloat(voIPFragment$8$$ExternalSyntheticLambda1, 320L, cubicBezierInterpolator, 0);
                this.animatedProgress = new AnimatedFloat(new VoIPFragment$8$$ExternalSyntheticLambda1(this, i), 320L, cubicBezierInterpolator, 0);
                this.animatedDone = new AnimatedFloat(new VoIPFragment$8$$ExternalSyntheticLambda1(this, i), 320L, cubicBezierInterpolator, 0);
                this.view = imageView;
                this.start = System.currentTimeMillis();
                this.doc = context.getResources().getDrawable(R.drawable.search_files_filled).mutate();
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
            }

            @Override
            public final void draw(Canvas canvas) {
                float f;
                float f2;
                RLottieDrawable rLottieDrawable;
                Canvas canvas2 = canvas;
                Rect bounds = getBounds();
                int iCenterX = bounds.centerX();
                int iCenterY = bounds.centerY();
                float f3 = this.animatedDone.set(this.done);
                if (f3 < 1.0f) {
                    float f4 = 1.0f - f3;
                    float f5 = (0.4f * f4) + 0.6f;
                    canvas2.save();
                    float f6 = iCenterX;
                    float f7 = iCenterY;
                    canvas2.scale(f5, f5, f6, f7);
                    Drawable drawable = this.doc;
                    drawable.setBounds(zzle.m(iCenterX, drawable), iCenterY - (drawable.getIntrinsicHeight() / 2), (drawable.getIntrinsicWidth() / 2) + iCenterX, (drawable.getIntrinsicHeight() / 2) + iCenterY);
                    drawable.setAlpha((int) (f4 * 255.0f));
                    drawable.draw(canvas2);
                    float fDp = AndroidUtilities.dp(14.0f);
                    Paint paint = this.strokePaint;
                    paint.setColor(Theme.multAlpha(0.2f * f4, -1));
                    canvas2.drawCircle(f6, f7, fDp, paint);
                    float f8 = f4 * 1.0f;
                    paint.setColor(Theme.multAlpha(f8, -1));
                    RectF rectF = this.rect;
                    f = 255.0f;
                    rectF.set(f6 - fDp, f7 - fDp, f6 + fDp, f7 + fDp);
                    float f9 = this.animatedHasPercent.set(this.hasPercent);
                    paint.setColor(Theme.multAlpha((1.0f - f9) * f4 * 0.15f, -1));
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = this.start;
                    canvas2.drawArc(rectF, (-(((((jCurrentTimeMillis - j) % 600) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
                    float fCurrentTimeMillis = ((System.currentTimeMillis() - j) * 0.45f) % 5400.0f;
                    float fMax = Math.max(0.0f, ((1520.0f * fCurrentTimeMillis) / 5400.0f) - 20.0f);
                    for (int i = 0; i < 4; i++) {
                        FastOutSlowInInterpolator fastOutSlowInInterpolator = CircularProgressDrawable.interpolator;
                        int i2 = i * 1350;
                        fastOutSlowInInterpolator.getInterpolation((fCurrentTimeMillis - i2) / 667.0f);
                        fMax += fastOutSlowInInterpolator.getInterpolation((fCurrentTimeMillis - (i2 + 667)) / 667.0f) * 250.0f;
                    }
                    f2 = 0.0f;
                    paint.setColor(Theme.multAlpha(f8, -1));
                    canvas2 = canvas;
                    canvas2.drawArc(rectF, (-90.0f) - fMax, Math.max(0.02f, this.animatedProgress.set(this.progress, false)) * (-360.0f) * f9, false, paint);
                    invalidateSelf();
                    canvas2.restore();
                } else {
                    f = 255.0f;
                    f2 = 0.0f;
                }
                if (f3 <= f2 || (rLottieDrawable = this.doneDrawable) == null) {
                    return;
                }
                int i3 = rLottieDrawable.width / 2;
                int i4 = rLottieDrawable.height / 2;
                rLottieDrawable.setBounds(iCenterX - i3, iCenterY - i4, i3 + iCenterX, i4 + iCenterY);
                this.doneDrawable.setAlpha((int) (f3 * f));
                this.doneDrawable.draw(canvas2);
            }

            @Override
            public final int getIntrinsicHeight() {
                return AndroidUtilities.dp(40.0f);
            }

            @Override
            public final int getIntrinsicWidth() {
                return AndroidUtilities.dp(40.0f);
            }

            @Override
            public final int getOpacity() {
                return -2;
            }

            @Override
            public final void setAlpha(int i) {
            }

            @Override
            public final void setColorFilter(ColorFilter colorFilter) {
            }
        }

        public DownloadBulletin(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            this.currentButtonType = 0;
            this.resourcesProvider = resourcesProvider;
            BackgroundDrawable backgroundDrawable = new BackgroundDrawable(AndroidUtilities.dp(10.0f));
            backgroundDrawable.paint.setColor(Theme.getColor(Theme.key_undo_background, resourcesProvider));
            this.background = backgroundDrawable;
            setBackground(backgroundDrawable);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            StatusDrawable statusDrawable = new StatusDrawable(context, imageView);
            this.status = statusDrawable;
            imageView.setImageDrawable(statusDrawable);
            addView(imageView, LayoutHelper.createFrame(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 14.0f);
            int i = Theme.key_undo_infoColor;
            textView.setTextColor(Theme.getColor(i, resourcesProvider));
            textView.setTypeface(AndroidUtilities.bold());
            TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayout, textView, LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 2), context);
            this.subtitleView = textViewM;
            textViewM.setTextSize(1, 13.0f);
            textViewM.setTextColor(Theme.getColor(i, resourcesProvider));
            linearLayout.addView(textViewM, LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 0));
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
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (i == 1) {
                Bulletin.UndoButton undoButton = new Bulletin.UndoButton(getContext(), resourcesProvider, true, false);
                String string = LocaleController.getString(R.string.BotFileDownloadCancel);
                TextView textView = undoButton.undoTextView;
                if (textView != null) {
                    textView.setText(string);
                }
                final int i2 = 0;
                undoButton.undoAction = new Runnable(this) {
                    public final BotDownloads.DownloadBulletin f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (i2) {
                            case 0:
                                BotDownloads.DownloadBulletin downloadBulletin = this.f$0;
                                Bulletin bulletin = downloadBulletin.getBulletin();
                                if (bulletin != null) {
                                    bulletin.duration = 2750;
                                    bulletin.setCanHide(true);
                                }
                                BotDownloads.FileDownload fileDownload = downloadBulletin.file;
                                if (fileDownload != null) {
                                    BotDownloads.this.cancel(fileDownload);
                                }
                                break;
                            default:
                                BotDownloads.DownloadBulletin downloadBulletin2 = this.f$0;
                                Bulletin bulletin2 = downloadBulletin2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.hide();
                                }
                                BotDownloads.FileDownload fileDownload2 = downloadBulletin2.file;
                                if (fileDownload2 != null && (file = fileDownload2.file) != null && file.exists()) {
                                    File file2 = fileDownload2.file;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.instance, null, true);
                                    break;
                                }
                                break;
                        }
                    }
                };
                if (getBulletin() != null) {
                    undoButton.bulletin = getBulletin();
                }
                setButton(undoButton);
                return;
            }
            if (i == 2) {
                Bulletin.UndoButton undoButton2 = new Bulletin.UndoButton(getContext(), resourcesProvider, true, false);
                String string2 = LocaleController.getString(R.string.BotFileDownloadOpen);
                TextView textView2 = undoButton2.undoTextView;
                if (textView2 != null) {
                    textView2.setText(string2);
                }
                final int i3 = 1;
                undoButton2.undoAction = new Runnable(this) {
                    public final BotDownloads.DownloadBulletin f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (i3) {
                            case 0:
                                BotDownloads.DownloadBulletin downloadBulletin = this.f$0;
                                Bulletin bulletin = downloadBulletin.getBulletin();
                                if (bulletin != null) {
                                    bulletin.duration = 2750;
                                    bulletin.setCanHide(true);
                                }
                                BotDownloads.FileDownload fileDownload = downloadBulletin.file;
                                if (fileDownload != null) {
                                    BotDownloads.this.cancel(fileDownload);
                                }
                                break;
                            default:
                                BotDownloads.DownloadBulletin downloadBulletin2 = this.f$0;
                                Bulletin bulletin2 = downloadBulletin2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.hide();
                                }
                                BotDownloads.FileDownload fileDownload2 = downloadBulletin2.file;
                                if (fileDownload2 != null && (file = fileDownload2.file) != null && file.exists()) {
                                    File file2 = fileDownload2.file;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.instance, null, true);
                                    break;
                                }
                                break;
                        }
                    }
                };
                if (getBulletin() != null) {
                    undoButton2.bulletin = getBulletin();
                }
                setButton(undoButton2);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(68.0f), 1073741824));
        }

        public final boolean set(FileDownload fileDownload) {
            FileDownload fileDownload2 = this.file;
            StatusDrawable statusDrawable = this.status;
            if (fileDownload2 != fileDownload) {
                AnimatedFloat animatedFloat = statusDrawable.animatedDone;
                statusDrawable.done = false;
                animatedFloat.getClass();
                animatedFloat.set(0.0f, true);
                RLottieDrawable rLottieDrawable = statusDrawable.doneDrawable;
                if (rLottieDrawable != null) {
                    rLottieDrawable.recycle(true);
                    statusDrawable.doneDrawable = null;
                }
                statusDrawable.hasPercent = false;
                AnimatedFloat animatedFloat2 = statusDrawable.animatedHasPercent;
                animatedFloat2.getClass();
                animatedFloat2.set(0.0f, true);
            }
            this.file = fileDownload;
            this.titleView.setText(fileDownload.file_name);
            boolean zIsDownloading = fileDownload.isDownloading();
            TextView textView = this.subtitleView;
            if (zIsDownloading) {
                Pair progress = fileDownload.getProgress();
                statusDrawable.getClass();
                boolean z = ((Long) progress.second).longValue() > 0;
                statusDrawable.hasPercent = z;
                if (z) {
                    statusDrawable.progress = Utilities.clamp(((Long) progress.first).longValue() / ((Long) progress.second).longValue(), 1.0f, 0.0f);
                }
                statusDrawable.invalidateSelf();
                if (((Long) progress.first).longValue() <= 0) {
                    textView.setText(LocaleController.getString(R.string.BotFileDownloading));
                } else if (((Long) progress.second).longValue() <= 0) {
                    textView.setText(AndroidUtilities.formatFileSize(((Long) progress.first).longValue()));
                } else {
                    textView.setText(AndroidUtilities.formatFileSize(((Long) progress.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) progress.second).longValue()));
                }
                setButton(1);
                return false;
            }
            if (fileDownload.cancelled) {
                Bulletin bulletin = getBulletin();
                if (bulletin != null) {
                    bulletin.hide();
                }
                return true;
            }
            if (fileDownload.done) {
                textView.setText(LocaleController.getString(R.string.BotFileDownloaded));
                setButton(2);
                if (!statusDrawable.done) {
                    statusDrawable.done = true;
                    RLottieDrawable rLottieDrawable2 = new RLottieDrawable(R.raw.contact_check, "contact_check", AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
                    statusDrawable.doneDrawable = rLottieDrawable2;
                    rLottieDrawable2.masterParent = statusDrawable.view;
                    rLottieDrawable2.decodeSingleFrame = true;
                    rLottieDrawable2.scheduleNextGetFrame();
                    statusDrawable.doneDrawable.start();
                    statusDrawable.progress = 1.0f;
                }
                Bulletin bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.setCanHide(false);
                    bulletin2.duration = 5000;
                    bulletin2.setCanHide(true);
                }
            }
            return false;
        }

        public void setArrow(int i) {
            BackgroundDrawable backgroundDrawable = this.background;
            backgroundDrawable.getClass();
            boolean z = i >= 0;
            backgroundDrawable.arrow = z;
            if (z) {
                backgroundDrawable.arrowMargin = i;
            }
            backgroundDrawable.invalidateSelf();
        }
    }

    public BotDownloads(Context context, int i, long j) {
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

    public final void cancel(FileDownload fileDownload) {
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
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botDownloadsUpdate, new Object[0]);
    }

    public final void save() {
        int i = 0;
        SharedPreferences.Editor editorEdit = this.context.getSharedPreferences("botdownloads_" + this.currentAccount, 0).edit();
        editorEdit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.files;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            FileDownload fileDownload = (FileDownload) obj;
            fileDownload.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", fileDownload.url);
                jSONObject.put("file_name", fileDownload.file_name);
                jSONObject.put("size", fileDownload.size);
                File file = fileDownload.file;
                jSONObject.put("path", file == null ? null : file.getAbsolutePath());
                jSONObject.put("done", fileDownload.done);
                jSONObject.put("mime", fileDownload.mime);
            } catch (Exception e) {
                FileLog.e(e);
            }
            hashSet.add(jSONObject.toString());
        }
        editorEdit.putStringSet("" + this.botId, hashSet);
        editorEdit.apply();
    }

    public final class FileDownload {
        public boolean cancelled;
        public boolean done;
        public File file;
        public final String file_name;
        public Long id;
        public long last_progress_time;
        public long loaded_size;
        public final String mime;
        public boolean resaved;
        public boolean shown;
        public long size;
        public final Runnable updateProgressRunnable = new VoIPFragment$8$$ExternalSyntheticLambda1(this, 6);
        public final String url;

        public FileDownload(String str, String str2) {
            this.url = str;
            this.file_name = str2;
            TLRPC.User user = MessagesController.getInstance(BotDownloads.this.currentAccount).getUser(Long.valueOf(BotDownloads.this.botId));
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setTitle(UserObject.getUserName(user));
            request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : zzij.m("Downloading ", str2, "..."));
            request.setNotificationVisibility(0);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
            this.id = Long.valueOf(BotDownloads.this.downloadManager.enqueue(request));
        }

        public final Pair getProgress() {
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

        public final boolean isDownloading() {
            return (this.done || this.id == null) ? false : true;
        }

        public final void updateProgress() {
            BotDownloads botDownloads = BotDownloads.this;
            if (this.done || this.cancelled) {
                return;
            }
            Runnable runnable = this.updateProgressRunnable;
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.last_progress_time = System.currentTimeMillis();
            DownloadManager.Query query = new DownloadManager.Query();
            query.setFilterById(this.id.longValue());
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = botDownloads.downloadManager.query(query);
                    if (cursorQuery.moveToFirst()) {
                        int i = cursorQuery.getInt(cursorQuery.getColumnIndex("status"));
                        if (i == 8) {
                            File file = new File(Uri.parse(cursorQuery.getString(cursorQuery.getColumnIndex("local_uri"))).getPath());
                            this.file = file;
                            this.done = true;
                            long length = file.length();
                            this.size = length;
                            if (length <= 0) {
                                botDownloads.cancel(this);
                            }
                            botDownloads.save();
                        } else if (i == 16) {
                            botDownloads.cancel(this);
                            cursorQuery.close();
                            return;
                        } else {
                            this.loaded_size = cursorQuery.getLong(cursorQuery.getColumnIndex("bytes_so_far"));
                            this.size = cursorQuery.getLong(cursorQuery.getColumnIndex("total_size"));
                            AndroidUtilities.runOnUIThread(runnable, 160L);
                        }
                    } else if (!this.done) {
                        botDownloads.cancel(this);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    if (0 != 0) {
                    }
                    NotificationCenter.getInstance(botDownloads.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botDownloadsUpdate, new Object[0]);
                }
                cursorQuery.close();
                NotificationCenter.getInstance(botDownloads.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botDownloadsUpdate, new Object[0]);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursorQuery.close();
                }
                throw th;
            }
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
    }
}
