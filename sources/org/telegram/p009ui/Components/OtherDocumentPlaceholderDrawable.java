package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.C1010R;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$Message;

public class OtherDocumentPlaceholderDrawable extends RecyclableDrawable implements DownloadController.FileDownloadProgressListener {
    private int TAG;
    private String ext;
    private String fileName;
    private String fileSize;
    private boolean loaded;
    private boolean loading;
    private MessageObject parentMessageObject;
    private View parentView;
    private String progress;
    private boolean progressVisible;
    private Drawable thumbDrawable;
    private static Paint paint = new Paint();
    private static Paint progressPaint = new Paint(1);
    private static TextPaint docPaint = new TextPaint(1);
    private static TextPaint namePaint = new TextPaint(1);
    private static TextPaint sizePaint = new TextPaint(1);
    private static TextPaint buttonPaint = new TextPaint(1);
    private static TextPaint percentPaint = new TextPaint(1);
    private static TextPaint openPaint = new TextPaint(1);
    private static DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
    private long lastUpdateTime = 0;
    private float currentProgress = 0.0f;
    private float animationProgressStart = 0.0f;
    private long currentProgressTime = 0;
    private float animatedProgressValue = 0.0f;
    private float animatedAlphaValue = 1.0f;

    @Override
    public int getOpacity() {
        return -1;
    }

    @Override
    public void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    static {
        progressPaint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-14209998);
        docPaint.setColor(-1);
        namePaint.setColor(-1);
        sizePaint.setColor(-10327179);
        buttonPaint.setColor(-10327179);
        percentPaint.setColor(-1);
        openPaint.setColor(-1);
        docPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        namePaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        buttonPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        percentPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        openPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
    }

    public OtherDocumentPlaceholderDrawable(Context context, View view, MessageObject messageObject) {
        docPaint.setTextSize(AndroidUtilities.m35dp(14.0f));
        namePaint.setTextSize(AndroidUtilities.m35dp(19.0f));
        sizePaint.setTextSize(AndroidUtilities.m35dp(15.0f));
        buttonPaint.setTextSize(AndroidUtilities.m35dp(15.0f));
        percentPaint.setTextSize(AndroidUtilities.m35dp(15.0f));
        openPaint.setTextSize(AndroidUtilities.m35dp(15.0f));
        progressPaint.setStrokeWidth(AndroidUtilities.m35dp(2.0f));
        this.parentView = view;
        this.parentMessageObject = messageObject;
        this.TAG = DownloadController.getInstance(messageObject.currentAccount).generateObserverTag();
        TLRPC$Document document = messageObject.getDocument();
        if (document != null) {
            String documentFileName = FileLoader.getDocumentFileName(messageObject.getDocument());
            this.fileName = documentFileName;
            if (TextUtils.isEmpty(documentFileName)) {
                this.fileName = "name";
            }
            int lastIndexOf = this.fileName.lastIndexOf(46);
            String upperCase = lastIndexOf == -1 ? BuildConfig.APP_CENTER_HASH : this.fileName.substring(lastIndexOf + 1).toUpperCase();
            this.ext = upperCase;
            if (((int) Math.ceil(docPaint.measureText(upperCase))) > AndroidUtilities.m35dp(40.0f)) {
                this.ext = TextUtils.ellipsize(this.ext, docPaint, AndroidUtilities.m35dp(40.0f), TextUtils.TruncateAt.END).toString();
            }
            this.thumbDrawable = context.getResources().getDrawable(AndroidUtilities.getThumbForNameOrMime(this.fileName, messageObject.getDocument().mime_type, true)).mutate();
            this.fileSize = AndroidUtilities.formatFileSize(document.size);
            if (((int) Math.ceil(namePaint.measureText(this.fileName))) > AndroidUtilities.m35dp(320.0f)) {
                this.fileName = TextUtils.ellipsize(this.fileName, namePaint, AndroidUtilities.m35dp(320.0f), TextUtils.TruncateAt.END).toString();
            }
        }
        checkFileExist();
    }

    @Override
    public void setAlpha(int i) {
        Drawable drawable = this.thumbDrawable;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        paint.setAlpha(i);
        docPaint.setAlpha(i);
        namePaint.setAlpha(i);
        sizePaint.setAlpha(i);
        buttonPaint.setAlpha(i);
        percentPaint.setAlpha(i);
        openPaint.setAlpha(i);
    }

    @Override
    public void draw(Canvas canvas) {
        String string;
        int m35dp;
        TextPaint textPaint;
        String str;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        canvas.drawRect(0.0f, 0.0f, width, height, paint);
        int m35dp2 = (height - AndroidUtilities.m35dp(240.0f)) / 2;
        int m35dp3 = (width - AndroidUtilities.m35dp(48.0f)) / 2;
        this.thumbDrawable.setBounds(m35dp3, m35dp2, AndroidUtilities.m35dp(48.0f) + m35dp3, AndroidUtilities.m35dp(48.0f) + m35dp2);
        this.thumbDrawable.draw(canvas);
        canvas.drawText(this.ext, (width - ((int) Math.ceil(docPaint.measureText(this.ext)))) / 2, AndroidUtilities.m35dp(31.0f) + m35dp2, docPaint);
        canvas.drawText(this.fileName, (width - ((int) Math.ceil(namePaint.measureText(this.fileName)))) / 2, AndroidUtilities.m35dp(96.0f) + m35dp2, namePaint);
        canvas.drawText(this.fileSize, (width - ((int) Math.ceil(sizePaint.measureText(this.fileSize)))) / 2, AndroidUtilities.m35dp(125.0f) + m35dp2, sizePaint);
        if (this.loaded) {
            string = LocaleController.getString("OpenFile", C1010R.string.OpenFile);
            textPaint = openPaint;
            m35dp = 0;
        } else {
            if (this.loading) {
                string = LocaleController.getString("Cancel", C1010R.string.Cancel).toUpperCase();
            } else {
                string = LocaleController.getString("TapToDownload", C1010R.string.TapToDownload);
            }
            m35dp = AndroidUtilities.m35dp(28.0f);
            textPaint = buttonPaint;
        }
        canvas.drawText(string, (width - ((int) Math.ceil(textPaint.measureText(string)))) / 2, AndroidUtilities.m35dp(235.0f) + m35dp2 + m35dp, textPaint);
        if (this.progressVisible) {
            if (this.progress != null) {
                canvas.drawText(this.progress, (width - ((int) Math.ceil(percentPaint.measureText(str)))) / 2, AndroidUtilities.m35dp(210.0f) + m35dp2, percentPaint);
            }
            int m35dp4 = (width - AndroidUtilities.m35dp(240.0f)) / 2;
            int m35dp5 = m35dp2 + AndroidUtilities.m35dp(232.0f);
            progressPaint.setColor(-10327179);
            progressPaint.setAlpha((int) (this.animatedAlphaValue * 255.0f));
            float f = m35dp5;
            canvas.drawRect(((int) (AndroidUtilities.m35dp(240.0f) * this.animatedProgressValue)) + m35dp4, f, AndroidUtilities.m35dp(240.0f) + m35dp4, AndroidUtilities.m35dp(2.0f) + m35dp5, progressPaint);
            progressPaint.setColor(-1);
            progressPaint.setAlpha((int) (this.animatedAlphaValue * 255.0f));
            float f2 = m35dp4;
            canvas.drawRect(f2, f, f2 + (AndroidUtilities.m35dp(240.0f) * this.animatedProgressValue), m35dp5 + AndroidUtilities.m35dp(2.0f), progressPaint);
            updateAnimation();
        }
        canvas.restore();
    }

    @Override
    public int getIntrinsicWidth() {
        return this.parentView.getMeasuredWidth();
    }

    @Override
    public int getIntrinsicHeight() {
        return this.parentView.getMeasuredHeight();
    }

    @Override
    public int getMinimumWidth() {
        return this.parentView.getMeasuredWidth();
    }

    @Override
    public int getMinimumHeight() {
        return this.parentView.getMeasuredHeight();
    }

    @Override
    public void onFailedDownload(String str, boolean z) {
        checkFileExist();
    }

    @Override
    public void onSuccessDownload(String str) {
        setProgress(1.0f, true);
        checkFileExist();
    }

    @Override
    public void onProgressDownload(String str, long j, long j2) {
        if (!this.progressVisible) {
            checkFileExist();
        }
        setProgress(Math.min(1.0f, ((float) j) / ((float) j2)), true);
    }

    @Override
    public int getObserverTag() {
        return this.TAG;
    }

    @Override
    public void recycle() {
        DownloadController.getInstance(this.parentMessageObject.currentAccount).removeLoadingFileObserver(this);
        this.parentView = null;
        this.parentMessageObject = null;
    }

    public void checkFileExist() {
        MessageObject messageObject = this.parentMessageObject;
        if (messageObject != null) {
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            if (tLRPC$Message.media != null) {
                String str = null;
                if ((TextUtils.isEmpty(tLRPC$Message.attachPath) || !new File(this.parentMessageObject.messageOwner.attachPath).exists()) && !FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(this.parentMessageObject.messageOwner).exists()) {
                    str = FileLoader.getAttachFileName(this.parentMessageObject.getDocument());
                }
                this.loaded = false;
                if (str == null) {
                    this.progressVisible = false;
                    this.loading = false;
                    this.loaded = true;
                    DownloadController.getInstance(this.parentMessageObject.currentAccount).removeLoadingFileObserver(this);
                } else {
                    DownloadController.getInstance(this.parentMessageObject.currentAccount).addLoadingFileObserver(str, this);
                    boolean isLoadingFile = FileLoader.getInstance(this.parentMessageObject.currentAccount).isLoadingFile(str);
                    this.loading = isLoadingFile;
                    if (isLoadingFile) {
                        this.progressVisible = true;
                        Float fileProgress = ImageLoader.getInstance().getFileProgress(str);
                        if (fileProgress == null) {
                            fileProgress = Float.valueOf(0.0f);
                        }
                        setProgress(fileProgress.floatValue(), false);
                    } else {
                        this.progressVisible = false;
                    }
                }
                this.parentView.invalidate();
            }
        }
        this.loading = false;
        this.loaded = true;
        this.progressVisible = false;
        setProgress(0.0f, false);
        DownloadController.getInstance(this.parentMessageObject.currentAccount).removeLoadingFileObserver(this);
        this.parentView.invalidate();
    }

    private void updateAnimation() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.lastUpdateTime;
        this.lastUpdateTime = currentTimeMillis;
        float f = this.animatedProgressValue;
        if (f != 1.0f) {
            float f2 = this.currentProgress;
            if (f != f2) {
                float f3 = this.animationProgressStart;
                float f4 = f2 - f3;
                if (f4 > 0.0f) {
                    long j2 = this.currentProgressTime + j;
                    this.currentProgressTime = j2;
                    if (j2 >= 300) {
                        this.animatedProgressValue = f2;
                        this.animationProgressStart = f2;
                        this.currentProgressTime = 0L;
                    } else {
                        this.animatedProgressValue = f3 + (f4 * decelerateInterpolator.getInterpolation(((float) j2) / 300.0f));
                    }
                }
                this.parentView.invalidate();
            }
        }
        float f5 = this.animatedProgressValue;
        if (f5 < 1.0f || f5 != 1.0f) {
            return;
        }
        float f6 = this.animatedAlphaValue;
        if (f6 != 0.0f) {
            float f7 = f6 - (((float) j) / 200.0f);
            this.animatedAlphaValue = f7;
            if (f7 <= 0.0f) {
                this.animatedAlphaValue = 0.0f;
            }
            this.parentView.invalidate();
        }
    }

    public void setProgress(float f, boolean z) {
        if (!z) {
            this.animatedProgressValue = f;
            this.animationProgressStart = f;
        } else {
            this.animationProgressStart = this.animatedProgressValue;
        }
        this.progress = String.format("%d%%", Integer.valueOf((int) (100.0f * f)));
        if (f != 1.0f) {
            this.animatedAlphaValue = 1.0f;
        }
        this.currentProgress = f;
        this.currentProgressTime = 0L;
        this.lastUpdateTime = System.currentTimeMillis();
        this.parentView.invalidate();
    }
}
