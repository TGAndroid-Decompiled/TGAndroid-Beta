package org.telegram.ui.Components;

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
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;

public final class OtherDocumentPlaceholderDrawable extends RecyclableDrawable implements DownloadController.FileDownloadProgressListener {
    public static final TextPaint buttonPaint;
    public static final DecelerateInterpolator decelerateInterpolator;
    public static final TextPaint docPaint;
    public static final TextPaint namePaint;
    public static final TextPaint openPaint;
    public static final Paint paint;
    public static final TextPaint percentPaint;
    public static final Paint progressPaint;
    public static final TextPaint sizePaint;
    public final int TAG;
    public final String ext;
    public final String fileName;
    public final String fileSize;
    public boolean loaded;
    public boolean loading;
    public MessageObject parentMessageObject;
    public View parentView;
    public String progress;
    public boolean progressVisible;
    public final Drawable thumbDrawable;
    public long lastUpdateTime = 0;
    public float currentProgress = 0.0f;
    public float animationProgressStart = 0.0f;
    public long currentProgressTime = 0;
    public float animatedProgressValue = 0.0f;
    public float animatedAlphaValue = 1.0f;

    static {
        Paint paint2 = new Paint();
        paint = paint2;
        Paint paint3 = new Paint(1);
        progressPaint = paint3;
        TextPaint textPaint = new TextPaint(1);
        docPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        namePaint = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        sizePaint = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        buttonPaint = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        percentPaint = textPaint5;
        TextPaint textPaint6 = new TextPaint(1);
        openPaint = textPaint6;
        decelerateInterpolator = new DecelerateInterpolator();
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-14209998);
        textPaint.setColor(-1);
        textPaint2.setColor(-1);
        textPaint3.setColor(-10327179);
        textPaint4.setColor(-10327179);
        textPaint5.setColor(-1);
        textPaint6.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint4.setTypeface(AndroidUtilities.bold());
        textPaint5.setTypeface(AndroidUtilities.bold());
        textPaint6.setTypeface(AndroidUtilities.bold());
    }

    public OtherDocumentPlaceholderDrawable(Context context, View view, MessageObject messageObject) {
        TextPaint textPaint = docPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        TextPaint textPaint2 = namePaint;
        textPaint2.setTextSize(AndroidUtilities.dp(19.0f));
        sizePaint.setTextSize(AndroidUtilities.dp(15.0f));
        buttonPaint.setTextSize(AndroidUtilities.dp(15.0f));
        percentPaint.setTextSize(AndroidUtilities.dp(15.0f));
        openPaint.setTextSize(AndroidUtilities.dp(15.0f));
        progressPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.parentView = view;
        this.parentMessageObject = messageObject;
        this.TAG = DownloadController.getInstance(messageObject.currentAccount).generateObserverTag();
        TLRPC.Document document = messageObject.getDocument();
        if (document != null) {
            String documentFileName = FileLoader.getDocumentFileName(messageObject.getDocument());
            this.fileName = documentFileName;
            if (TextUtils.isEmpty(documentFileName)) {
                this.fileName = "name";
            }
            int iLastIndexOf = this.fileName.lastIndexOf(46);
            String upperCase = iLastIndexOf == -1 ? "" : this.fileName.substring(iLastIndexOf + 1).toUpperCase();
            this.ext = upperCase;
            if (((int) Math.ceil(textPaint.measureText(upperCase))) > AndroidUtilities.dp(40.0f)) {
                this.ext = TextUtils.ellipsize(upperCase, textPaint, AndroidUtilities.dp(40.0f), TextUtils.TruncateAt.END).toString();
            }
            this.thumbDrawable = context.getResources().getDrawable(AndroidUtilities.getThumbForNameOrMime(this.fileName, messageObject.getDocument().mime_type, true)).mutate();
            this.fileSize = AndroidUtilities.formatFileSize(document.size);
            if (((int) Math.ceil(textPaint2.measureText(this.fileName))) > AndroidUtilities.dp(320.0f)) {
                this.fileName = TextUtils.ellipsize(this.fileName, textPaint2, AndroidUtilities.dp(320.0f), TextUtils.TruncateAt.END).toString();
            }
        }
        checkFileExist();
    }

    public final void checkFileExist() {
        MessageObject messageObject = this.parentMessageObject;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message.media != null) {
                String attachFileName = ((TextUtils.isEmpty(message.attachPath) || !new File(this.parentMessageObject.messageOwner.attachPath).exists()) && !FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(this.parentMessageObject.messageOwner).exists()) ? FileLoader.getAttachFileName(this.parentMessageObject.getDocument()) : null;
                this.loaded = false;
                if (attachFileName == null) {
                    this.progressVisible = false;
                    this.loading = false;
                    this.loaded = true;
                    DownloadController.getInstance(this.parentMessageObject.currentAccount).removeLoadingFileObserver(this);
                } else {
                    DownloadController.getInstance(this.parentMessageObject.currentAccount).addLoadingFileObserver(attachFileName, this);
                    boolean zIsLoadingFile = FileLoader.getInstance(this.parentMessageObject.currentAccount).isLoadingFile(attachFileName);
                    this.loading = zIsLoadingFile;
                    if (zIsLoadingFile) {
                        this.progressVisible = true;
                        Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                        if (fileProgress == null) {
                            fileProgress = Float.valueOf(0.0f);
                        }
                        setProgress(fileProgress.floatValue(), false);
                    } else {
                        this.progressVisible = false;
                    }
                }
            } else {
                this.loading = false;
                this.loaded = true;
                this.progressVisible = false;
                setProgress(0.0f, false);
                DownloadController.getInstance(this.parentMessageObject.currentAccount).removeLoadingFileObserver(this);
            }
        } else {
            this.loading = false;
            this.loaded = true;
            this.progressVisible = false;
            setProgress(0.0f, false);
            DownloadController.getInstance(this.parentMessageObject.currentAccount).removeLoadingFileObserver(this);
        }
        this.parentView.invalidate();
    }

    @Override
    public final void draw(Canvas canvas) {
        String upperCase;
        int iDp;
        TextPaint textPaint;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        canvas.drawRect(0.0f, 0.0f, iWidth, iHeight, paint);
        int iM$2 = OKLCH.m$2(240.0f, iHeight, 2);
        int iM$3 = OKLCH.m$2(48.0f, iWidth, 2);
        int iDp2 = AndroidUtilities.dp(48.0f) + iM$3;
        int iDp3 = AndroidUtilities.dp(48.0f) + iM$2;
        Drawable drawable = this.thumbDrawable;
        drawable.setBounds(iM$3, iM$2, iDp2, iDp3);
        drawable.draw(canvas);
        TextPaint textPaint2 = docPaint;
        String str = this.ext;
        canvas.drawText(str, (iWidth - ((int) Math.ceil(textPaint2.measureText(str)))) / 2, AndroidUtilities.dp(31.0f) + iM$2, textPaint2);
        TextPaint textPaint3 = namePaint;
        String str2 = this.fileName;
        canvas.drawText(str2, (iWidth - ((int) Math.ceil(textPaint3.measureText(str2)))) / 2, AndroidUtilities.dp(96.0f) + iM$2, textPaint3);
        TextPaint textPaint4 = sizePaint;
        String str3 = this.fileSize;
        canvas.drawText(str3, (iWidth - ((int) Math.ceil(textPaint4.measureText(str3)))) / 2, AndroidUtilities.dp(125.0f) + iM$2, textPaint4);
        if (this.loaded) {
            upperCase = LocaleController.getString(R.string.OpenFile);
            textPaint = openPaint;
            iDp = 0;
        } else {
            upperCase = this.loading ? LocaleController.getString(R.string.Cancel).toUpperCase() : LocaleController.getString(R.string.TapToDownload);
            iDp = AndroidUtilities.dp(28.0f);
            textPaint = buttonPaint;
        }
        canvas.drawText(upperCase, (iWidth - ((int) Math.ceil(textPaint.measureText(upperCase)))) / 2, RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(iM$2, 235.0f, iDp), textPaint);
        if (this.progressVisible) {
            String str4 = this.progress;
            if (str4 != null) {
                TextPaint textPaint5 = percentPaint;
                canvas.drawText(this.progress, (iWidth - ((int) Math.ceil(textPaint5.measureText(str4)))) / 2, AndroidUtilities.dp(210.0f) + iM$2, textPaint5);
            }
            int iM$4 = OKLCH.m$2(240.0f, iWidth, 2);
            int iDp4 = AndroidUtilities.dp(232.0f) + iM$2;
            Paint paint2 = progressPaint;
            paint2.setColor(-10327179);
            paint2.setAlpha((int) (this.animatedAlphaValue * 255.0f));
            float f = iDp4;
            canvas.drawRect(((int) (AndroidUtilities.dp(240.0f) * this.animatedProgressValue)) + iM$4, f, AndroidUtilities.dp(240.0f) + iM$4, AndroidUtilities.dp(2.0f) + iDp4, paint2);
            paint2.setColor(-1);
            paint2.setAlpha((int) (this.animatedAlphaValue * 255.0f));
            float f2 = iM$4;
            canvas.drawRect(f2, f, (AndroidUtilities.dp(240.0f) * this.animatedProgressValue) + f2, AndroidUtilities.dp(2.0f) + iDp4, paint2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.lastUpdateTime;
            this.lastUpdateTime = jCurrentTimeMillis;
            float f3 = this.animatedProgressValue;
            if (f3 != 1.0f) {
                float f4 = this.currentProgress;
                if (f3 != f4) {
                    float f5 = this.animationProgressStart;
                    float f6 = f4 - f5;
                    if (f6 > 0.0f) {
                        long j2 = this.currentProgressTime + j;
                        this.currentProgressTime = j2;
                        if (j2 >= 300) {
                            this.animatedProgressValue = f4;
                            this.animationProgressStart = f4;
                            this.currentProgressTime = 0L;
                        } else {
                            this.animatedProgressValue = (decelerateInterpolator.getInterpolation(j2 / 300.0f) * f6) + f5;
                        }
                    }
                    this.parentView.invalidate();
                }
            }
            float f7 = this.animatedProgressValue;
            if (f7 >= 1.0f && f7 == 1.0f) {
                float f8 = this.animatedAlphaValue;
                if (f8 != 0.0f) {
                    float f9 = f8 - (j / 200.0f);
                    this.animatedAlphaValue = f9;
                    if (f9 <= 0.0f) {
                        this.animatedAlphaValue = 0.0f;
                    }
                    this.parentView.invalidate();
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.parentView.getMeasuredHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.parentView.getMeasuredWidth();
    }

    @Override
    public final int getMinimumHeight() {
        return this.parentView.getMeasuredHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.parentView.getMeasuredWidth();
    }

    @Override
    public final int getObserverTag() {
        return this.TAG;
    }

    @Override
    public final int getOpacity() {
        return -1;
    }

    @Override
    public final void onFailedDownload(String str, boolean z) {
        checkFileExist();
    }

    @Override
    public final void onProgressDownload(String str, long j, long j2) {
        if (!this.progressVisible) {
            checkFileExist();
        }
        setProgress(Math.min(1.0f, j / j2), true);
    }

    @Override
    public final void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    @Override
    public final void onSuccessDownload(String str) {
        setProgress(1.0f, true);
        checkFileExist();
    }

    @Override
    public final void setAlpha(int i) {
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
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setProgress(float f, boolean z) {
        if (z) {
            this.animationProgressStart = this.animatedProgressValue;
        } else {
            this.animatedProgressValue = f;
            this.animationProgressStart = f;
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
