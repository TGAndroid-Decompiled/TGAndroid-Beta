package org.telegram.ui.Stories.recorder;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.DiffUtil;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RLottieDrawable;

public final class DownloadButton extends ImageView {
    public BuildingVideo buildingVideo;
    public final FrameLayout container;
    public final int currentAccount;
    public StoryEntry currentEntry;
    public boolean downloading;
    public boolean downloadingVideo;
    public final StoryRecorder$$ExternalSyntheticLambda14 prepare;
    public boolean preparing;
    public final CircularProgressDrawable progressDrawable;
    public Uri savedToGalleryUri;
    public PreparingVideoToast toast;
    public boolean wasImageDownloading;
    public boolean wasVideoDownloading;

    public final class BuildingVideo implements NotificationCenter.NotificationCenterDelegate {
        public final int currentAccount;
        public final File file;
        public MessageObject messageObject;
        public final DownloadButton$$ExternalSyntheticLambda4 onCancel;
        public final DownloadButton$$ExternalSyntheticLambda6 onDone;
        public final DownloadButton$$ExternalSyntheticLambda7 onProgress;

        public BuildingVideo(int i, StoryEntry storyEntry, File file, DownloadButton$$ExternalSyntheticLambda6 downloadButton$$ExternalSyntheticLambda6, DownloadButton$$ExternalSyntheticLambda7 downloadButton$$ExternalSyntheticLambda7, DownloadButton$$ExternalSyntheticLambda4 downloadButton$$ExternalSyntheticLambda4) {
            this.currentAccount = i;
            this.file = file;
            this.onDone = downloadButton$$ExternalSyntheticLambda6;
            this.onProgress = downloadButton$$ExternalSyntheticLambda7;
            this.onCancel = downloadButton$$ExternalSyntheticLambda4;
            if (this.messageObject != null) {
                return;
            }
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.fileNewChunkAvailable);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.filePreparingFailed);
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 1;
            tL_message.attachPath = file.getAbsolutePath();
            this.messageObject = new MessageObject(i, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
            storyEntry.getVideoEditedInfo(new HintView2$$ExternalSyntheticLambda0(this, 3));
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.filePreparingStarted) {
                return;
            }
            if (i != NotificationCenter.fileNewChunkAvailable) {
                if (i == NotificationCenter.filePreparingFailed && ((MessageObject) objArr[0]) == this.messageObject) {
                    stop(false);
                    try {
                        File file = this.file;
                        if (file != null) {
                            file.delete();
                        }
                    } catch (Exception unused) {
                    }
                    this.onCancel.run();
                    return;
                }
                return;
            }
            if (((MessageObject) objArr[0]) == this.messageObject) {
                ((Long) objArr[2]).getClass();
                long jLongValue = ((Long) objArr[3]).longValue();
                Float f = (Float) objArr[4];
                f.getClass();
                this.onProgress.run(f);
                if (jLongValue > 0) {
                    this.onDone.run();
                    VideoEncodingService.stop();
                    stop(false);
                }
            }
        }

        public final void stop(boolean z) {
            if (this.messageObject == null) {
                return;
            }
            int i = this.currentAccount;
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.filePreparingFailed);
            if (z) {
                MediaController.getInstance().cancelVideoConvert(this.messageObject);
            }
            this.messageObject = null;
        }
    }

    public final class PreparingVideoToast extends View {
        public final Paint backgroundPaint;
        public final ButtonBounce cancelButton;
        public final RectF currentRect;
        public boolean deleted;
        public final Paint dimPaint;
        public StaticLayout doneLayout;
        public float doneLayoutLeft;
        public float doneLayoutWidth;
        public final Paint greyPaint;
        public final RectF hiddenRect;
        public DownloadButton$PreparingVideoToast$$ExternalSyntheticLambda0 hideRunnable;
        public RLottieDrawable lottieDrawable;
        public Runnable onCancel;
        public final RectF prepareRect;
        public boolean preparing;
        public final StaticLayout preparingLayout;
        public final float preparingLayoutLeft;
        public final float preparingLayoutWidth;
        public float progress;
        public final AnimatedFloat progressT;
        public final AnimatedFloat showT;
        public boolean shown;
        public final AnimatedFloat t;
        public final TextPaint textPaint;
        public final TextPaint textPaint2;
        public final RectF toastRect;
        public final Paint whitePaint;

        public PreparingVideoToast(Context context, String str) {
            super(context);
            Paint paint = new Paint(1);
            this.dimPaint = paint;
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            TextPaint textPaint2 = new TextPaint(1);
            this.textPaint2 = textPaint2;
            Paint paint2 = new Paint(1);
            this.backgroundPaint = paint2;
            Paint paint3 = new Paint(1);
            this.whitePaint = paint3;
            Paint paint4 = new Paint(1);
            this.greyPaint = paint4;
            this.cancelButton = new ButtonBounce(this);
            this.shown = false;
            this.showT = new AnimatedFloat(0.0f, this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.preparing = true;
            this.progress = 0.0f;
            this.t = new AnimatedFloat(this);
            this.progressT = new AnimatedFloat(this);
            this.prepareRect = new RectF();
            this.toastRect = new RectF();
            this.currentRect = new RectF();
            this.hiddenRect = new RectF();
            paint.setColor(1509949440);
            textPaint.setColor(-1);
            textPaint2.setColor(-1);
            paint2.setColor(-869783512);
            paint3.setColor(-1);
            paint4.setColor(872415231);
            Paint.Style style = Paint.Style.STROKE;
            paint3.setStyle(style);
            Paint.Cap cap = Paint.Cap.ROUND;
            paint3.setStrokeCap(cap);
            paint3.setStrokeWidth(AndroidUtilities.dp(4.0f));
            paint4.setStyle(style);
            paint4.setStrokeCap(cap);
            paint4.setStrokeWidth(AndroidUtilities.dp(4.0f));
            textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            textPaint2.setTextSize(AndroidUtilities.dpf2(14.66f));
            StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.preparingLayout = staticLayout;
            this.preparingLayoutWidth = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
            this.preparingLayoutLeft = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
            this.shown = true;
            invalidate();
        }

        public final void hide() {
            DownloadButton$PreparingVideoToast$$ExternalSyntheticLambda0 downloadButton$PreparingVideoToast$$ExternalSyntheticLambda0 = this.hideRunnable;
            if (downloadButton$PreparingVideoToast$$ExternalSyntheticLambda0 != null) {
                AndroidUtilities.cancelRunOnUIThread(downloadButton$PreparingVideoToast$$ExternalSyntheticLambda0);
                this.hideRunnable = null;
            }
            this.shown = false;
            invalidate();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float f;
            RectF rectF;
            float f2;
            int saveCount = canvas.getSaveCount();
            float f3 = this.showT.set(this.shown ? 1.0f : 0.0f);
            float f4 = this.t.set(this.preparing ? 0.0f : 1.0f);
            Paint paint = this.dimPaint;
            float f5 = 1.0f - f4;
            paint.setAlpha((int) (90.0f * f5 * f3));
            Canvas canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            float fMax = Math.max(this.preparingLayoutWidth, AndroidUtilities.dp(54.0f)) + AndroidUtilities.dp(42.0f);
            int iDp = AndroidUtilities.dp(111.0f);
            StaticLayout staticLayout = this.preparingLayout;
            float height = staticLayout.getHeight() + iDp;
            RectF rectF2 = this.prepareRect;
            rectF2.set((getWidth() - fMax) / 2.0f, (getHeight() - height) / 2.0f, (getWidth() + fMax) / 2.0f, (getHeight() + height) / 2.0f);
            float fDp = AndroidUtilities.dp(74.0f) + this.doneLayoutWidth;
            float fDp2 = AndroidUtilities.dp(48.0f);
            RectF rectF3 = this.toastRect;
            rectF3.set((getWidth() - fDp) / 2.0f, (getHeight() - fDp2) / 2.0f, (getWidth() + fDp) / 2.0f, (getHeight() + fDp2) / 2.0f);
            RectF rectF4 = this.currentRect;
            AndroidUtilities.lerp(rectF2, rectF3, f4, rectF4);
            if (f3 >= 1.0f || !this.preparing) {
                f = 42.0f;
            } else {
                RectF rectF5 = this.hiddenRect;
                f = 42.0f;
                rectF5.set(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 2.0f, getHeight() / 2.0f);
                AndroidUtilities.lerp(rectF5, rectF4, f3, rectF4);
            }
            if (f3 < 1.0f && !this.preparing) {
                canvas2.scale(AndroidUtilities.lerp(0.8f, 1.0f, f3), AndroidUtilities.lerp(0.8f, 1.0f, f3), rectF4.centerX(), rectF4.centerY());
            }
            Paint paint2 = this.backgroundPaint;
            paint2.setAlpha((int) (204.0f * f3));
            canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
            canvas2.save();
            canvas2.clipRect(rectF4);
            if (f4 < 1.0f) {
                float f6 = f5 * f3;
                float f7 = this.progressT.set(this.progress);
                float fCenterX = rectF2.centerX();
                float fDp3 = rectF2.top + AndroidUtilities.dp(48.0f);
                float fDp4 = AndroidUtilities.dp(25.0f);
                Paint paint3 = this.greyPaint;
                paint3.setAlpha((int) (51.0f * f6));
                canvas2.drawCircle(fCenterX, fDp3, fDp4, paint3);
                RectF rectF6 = AndroidUtilities.rectTmp;
                f2 = 255.0f;
                rectF6.set(fCenterX - fDp4, fDp3 - fDp4, fCenterX + fDp4, fDp4 + fDp3);
                Paint paint4 = this.whitePaint;
                int i = (int) (f6 * 255.0f);
                paint4.setAlpha(i);
                paint4.setStrokeWidth(AndroidUtilities.dp(4.0f));
                rectF = rectF3;
                canvas.drawArc(rectF6, -90.0f, f7 * 360.0f, false, paint4);
                float scale = this.cancelButton.getScale(0.15f);
                canvas.save();
                canvas.scale(scale, scale, fCenterX, fDp3);
                paint4.setStrokeWidth(AndroidUtilities.dp(3.4f));
                canvas.drawLine(fCenterX - AndroidUtilities.dp(7.0f), fDp3 - AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f) + fCenterX, AndroidUtilities.dp(7.0f) + fDp3, paint4);
                canvas2 = canvas;
                canvas2.drawLine(fCenterX - AndroidUtilities.dp(7.0f), fDp3 + AndroidUtilities.dp(7.0f), fCenterX + AndroidUtilities.dp(7.0f), fDp3 - AndroidUtilities.dp(7.0f), paint4);
                canvas2.restore();
                canvas2.save();
                canvas2.translate((rectF2.left + AndroidUtilities.dp(21.0f)) - this.preparingLayoutLeft, (rectF2.bottom - AndroidUtilities.dp(18.0f)) - staticLayout.getHeight());
                this.textPaint.setAlpha(i);
                staticLayout.draw(canvas2);
                canvas2.restore();
            } else {
                rectF = rectF3;
                f2 = 255.0f;
            }
            if (f4 > 0.0f) {
                float f8 = f4 * f3;
                RLottieDrawable rLottieDrawable = this.lottieDrawable;
                if (rLottieDrawable != null) {
                    rLottieDrawable.setAlpha((int) (f8 * f2));
                    this.lottieDrawable.setBounds((int) (rectF.left + AndroidUtilities.dp(9.0f)), (int) (rectF.top + AndroidUtilities.dp(6.0f)), (int) (rectF.left + AndroidUtilities.dp(45.0f)), (int) (rectF.top + AndroidUtilities.dp(f)));
                    this.lottieDrawable.draw(canvas2);
                }
                if (this.doneLayout != null) {
                    canvas2.save();
                    canvas2.translate((rectF.left + AndroidUtilities.dp(52.0f)) - this.doneLayoutLeft, rectF.centerY() - (this.doneLayout.getHeight() / 2.0f));
                    this.textPaint2.setAlpha((int) (f8 * f2));
                    this.doneLayout.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            if (f3 > 0.0f || this.shown || this.deleted) {
                return;
            }
            this.deleted = true;
            post(new DownloadButton$PreparingVideoToast$$ExternalSyntheticLambda0(this, 1));
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean zContains = this.currentRect.contains(motionEvent.getX(), motionEvent.getY());
            int action = motionEvent.getAction();
            ButtonBounce buttonBounce = this.cancelButton;
            if (action == 0 && (this.preparing || zContains)) {
                buttonBounce.setPressed(zContains);
                return true;
            }
            if (motionEvent.getAction() == 1) {
                if (buttonBounce.isPressed()) {
                    if (zContains) {
                        if (this.preparing) {
                            Runnable runnable = this.onCancel;
                            if (runnable != null) {
                                runnable.run();
                            }
                        } else {
                            hide();
                        }
                    }
                    buttonBounce.setPressed(false);
                    return true;
                }
            } else if (motionEvent.getAction() == 3) {
                buttonBounce.setPressed(false);
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }

        public final void setDone(int i, int i2, String str) {
            RLottieDrawable rLottieDrawable = this.lottieDrawable;
            if (rLottieDrawable != null) {
                rLottieDrawable.setCallback(null);
                this.lottieDrawable.recycle(true);
            }
            RLottieDrawable rLottieDrawable2 = new RLottieDrawable(i, DiffUtil.m(i, ""), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            this.lottieDrawable = rLottieDrawable2;
            rLottieDrawable2.setCallback(this);
            this.lottieDrawable.start();
            StaticLayout staticLayout = new StaticLayout(str, this.textPaint2, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.doneLayout = staticLayout;
            this.doneLayoutWidth = staticLayout.getLineCount() > 0 ? this.doneLayout.getLineWidth(0) : 0.0f;
            this.doneLayoutLeft = this.doneLayout.getLineCount() > 0 ? this.doneLayout.getLineLeft(0) : 0.0f;
            this.preparing = false;
            invalidate();
            DownloadButton$PreparingVideoToast$$ExternalSyntheticLambda0 downloadButton$PreparingVideoToast$$ExternalSyntheticLambda0 = this.hideRunnable;
            if (downloadButton$PreparingVideoToast$$ExternalSyntheticLambda0 != null) {
                AndroidUtilities.cancelRunOnUIThread(downloadButton$PreparingVideoToast$$ExternalSyntheticLambda0);
            }
            DownloadButton$PreparingVideoToast$$ExternalSyntheticLambda0 downloadButton$PreparingVideoToast$$ExternalSyntheticLambda1 = new DownloadButton$PreparingVideoToast$$ExternalSyntheticLambda0(this, 0);
            this.hideRunnable = downloadButton$PreparingVideoToast$$ExternalSyntheticLambda1;
            AndroidUtilities.runOnUIThread(downloadButton$PreparingVideoToast$$ExternalSyntheticLambda1, i2);
        }

        public void setOnCancelListener(Runnable runnable) {
            this.onCancel = runnable;
        }

        public void setProgress(float f) {
            this.progress = f;
            invalidate();
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            return drawable == this.lottieDrawable || super.verifyDrawable(drawable);
        }
    }

    public DownloadButton(Activity activity, StoryRecorder$$ExternalSyntheticLambda14 storyRecorder$$ExternalSyntheticLambda14, int i, FrameLayout frameLayout) {
        super(activity);
        this.wasImageDownloading = true;
        this.wasVideoDownloading = true;
        this.prepare = storyRecorder$$ExternalSyntheticLambda14;
        this.currentAccount = i;
        this.container = frameLayout;
        setScaleType(ImageView.ScaleType.CENTER);
        setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        setBackground(Theme.createSelectorDrawable(553648127, 1, -1));
        setVisibility(8);
        setAlpha(0.0f);
        setOnClickListener(new PaintView$$ExternalSyntheticLambda63(this, 3));
        this.progressDrawable = new CircularProgressDrawable(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        updateImage();
    }

    public final void onClickInternal() {
        StoryEntry storyEntry;
        if (!this.preparing || (storyEntry = this.currentEntry) == null) {
            return;
        }
        this.preparing = false;
        if (storyEntry.wouldBeVideo()) {
            this.downloadingVideo = true;
            PreparingVideoToast preparingVideoToast = new PreparingVideoToast(getContext(), LocaleController.getString(R.string.PreparingVideo));
            this.toast = preparingVideoToast;
            preparingVideoToast.setOnCancelListener(new DownloadButton$$ExternalSyntheticLambda4(this, 1));
            this.container.addView(this.toast);
            File fileGenerateVideoPath = AndroidUtilities.generateVideoPath();
            int i = 0;
            this.buildingVideo = new BuildingVideo(this.currentAccount, this.currentEntry, fileGenerateVideoPath, new DownloadButton$$ExternalSyntheticLambda6(this, fileGenerateVideoPath, i), new DownloadButton$$ExternalSyntheticLambda7(this, i), new DownloadButton$$ExternalSyntheticLambda4(this, 2));
        } else {
            this.downloadingVideo = false;
            File fileGeneratePicturePath = AndroidUtilities.generatePicturePath(false, "png");
            if (fileGeneratePicturePath == null) {
                this.toast.setDone(R.raw.error, 3500, LocaleController.getString("UnknownError"));
                this.downloading = false;
                updateImage();
                return;
            }
            Utilities.themeQueue.postRunnable(new DownloadButton$$ExternalSyntheticLambda6(this, fileGeneratePicturePath, 2));
        }
        updateImage();
    }

    public void setEntry(StoryEntry storyEntry) {
        this.savedToGalleryUri = null;
        this.currentEntry = storyEntry;
        BuildingVideo buildingVideo = this.buildingVideo;
        if (buildingVideo != null) {
            buildingVideo.stop(true);
            this.buildingVideo = null;
        }
        PreparingVideoToast preparingVideoToast = this.toast;
        if (preparingVideoToast != null) {
            preparingVideoToast.hide();
            this.toast = null;
        }
        if (storyEntry == null) {
            this.downloading = false;
            updateImage();
        }
    }

    public final void showToast(int i, String str) {
        PreparingVideoToast preparingVideoToast = this.toast;
        if (preparingVideoToast != null) {
            preparingVideoToast.hide();
            this.toast = null;
        }
        PreparingVideoToast preparingVideoToast2 = new PreparingVideoToast(getContext(), LocaleController.getString(R.string.PreparingVideo));
        this.toast = preparingVideoToast2;
        preparingVideoToast2.setDone(i, 3500, str);
        this.container.addView(this.toast);
    }

    public final void updateImage() {
        boolean z = this.wasImageDownloading;
        boolean z2 = this.downloading;
        boolean z3 = false;
        if (z != (z2 && !this.downloadingVideo)) {
            boolean z4 = z2 && !this.downloadingVideo;
            this.wasImageDownloading = z4;
            if (z4) {
                AndroidUtilities.updateImageViewImageAnimated(this, this.progressDrawable);
            } else {
                AndroidUtilities.updateImageViewImageAnimated(this, R.drawable.media_download);
            }
        }
        if (this.wasVideoDownloading != (this.downloading && this.downloadingVideo)) {
            clearAnimation();
            ViewPropertyAnimator viewPropertyAnimatorAnimate = animate();
            if (this.downloading && this.downloadingVideo) {
                z3 = true;
            }
            this.wasVideoDownloading = z3;
            viewPropertyAnimatorAnimate.alpha(z3 ? 0.4f : 1.0f).start();
        }
    }
}
