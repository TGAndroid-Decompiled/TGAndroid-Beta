package org.telegram.ui.Stories.recorder;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Paint.Views.RoundView;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda4;
import org.telegram.ui.WebviewActivity;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda8;

public abstract class RoundVideoRecorder extends FrameLayout {
    public float alpha;
    public final AnonymousClass1 cameraView;
    public ValueAnimator cameraViewAnimator;
    public boolean cancelled;
    public ValueAnimator destroyAnimator;
    public float destroyT;
    public final File file;
    public CaptionStory$$ExternalSyntheticLambda0 onDestroyCallback;
    public BotBiometry$$ExternalSyntheticLambda8 onDoneCallback;
    public final Paint progressPaint;
    public long recordingStarted;
    public long recordingStopped;
    public RoundView roundView;
    public final Paint shadowPaint;
    public final RoundVideoRecorder$$ExternalSyntheticLambda0 stopRunnable;

    public RoundVideoRecorder(Context context) {
        super(context);
        this.recordingStarted = -1L;
        this.recordingStopped = -1L;
        this.shadowPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.progressPaint = paint;
        CaptionStory.AnonymousClass1 anonymousClass1 = (CaptionStory.AnonymousClass1) this;
        this.stopRunnable = new RoundVideoRecorder$$ExternalSyntheticLambda0(anonymousClass1, 0);
        this.alpha = 1.0f;
        this.cancelled = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.file = StoryEntry.makeCacheFile(UserConfig.selectedAccount, "mp4");
        final CaptionStory.AnonymousClass1 anonymousClass2 = (CaptionStory.AnonymousClass1) this;
        ?? r0 = new CameraView(context) {
            public final Path circlePath = new Path();

            @Override
            public final void dispatchDraw(Canvas canvas) {
                canvas.save();
                Path path = this.circlePath;
                path.rewind();
                path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
            }

            @Override
            public final void receivedAmplitude(double d) {
                CaptionStory.this.setAmplitude(d);
            }

            @Override
            public final boolean square() {
                return true;
            }
        };
        this.cameraView = r0;
        r0.setScaleX(0.0f);
        r0.setScaleY(0.0f);
        addView(r0);
        r0.setDelegate(new RoundVideoRecorder$$ExternalSyntheticLambda1(anonymousClass1));
        r0.initTexture();
        setWillNotDraw(false);
    }

    public final void destroy(boolean z) {
        CaptionStory$$ExternalSyntheticLambda0 captionStory$$ExternalSyntheticLambda0 = this.onDestroyCallback;
        if (captionStory$$ExternalSyntheticLambda0 != null) {
            captionStory$$ExternalSyntheticLambda0.run();
            this.onDestroyCallback = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.stopRunnable);
        destroy(true, null);
        try {
            this.file.delete();
        } catch (Exception unused) {
        }
        if (z) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.destroyAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.destroyT, 1.0f);
        this.destroyAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda4(this, 13));
        this.destroyAnimator.addListener(new WebviewActivity.AnonymousClass3.AnonymousClass1(this, 4));
        this.destroyAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.destroyAnimator.setDuration(280L);
        this.destroyAnimator.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        long jMin;
        RectF rectF = AndroidUtilities.rectTmp;
        AnonymousClass1 anonymousClass1 = this.cameraView;
        rectF.set(((1.0f - anonymousClass1.getScaleX()) * (anonymousClass1.getWidth() / 2.0f)) + anonymousClass1.getX(), ((1.0f - anonymousClass1.getScaleY()) * (anonymousClass1.getHeight() / 2.0f)) + anonymousClass1.getY(), (anonymousClass1.getX() + anonymousClass1.getWidth()) - ((1.0f - anonymousClass1.getScaleX()) * (anonymousClass1.getWidth() / 2.0f)), (anonymousClass1.getY() + anonymousClass1.getHeight()) - ((1.0f - anonymousClass1.getScaleY()) * (anonymousClass1.getHeight() / 2.0f)));
        Paint paint = this.shadowPaint;
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), Theme.multAlpha(this.alpha, 536870912));
        paint.setAlpha((int) (this.alpha * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        RoundView roundView = this.roundView;
        if (roundView != null && roundView.getWidth() > 0 && this.roundView.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.roundView.getWidth(), rectF.height() / this.roundView.getHeight());
            float alpha = this.roundView.getAlpha();
            this.roundView.setDraw(true);
            this.roundView.setAlpha(1.0f - this.alpha);
            this.roundView.draw(canvas);
            this.roundView.setAlpha(alpha);
            this.roundView.setDraw(false);
            canvas.restore();
        }
        long j = this.recordingStarted;
        if (j > 0) {
            if (j < 0) {
                jMin = 0;
            } else {
                long jCurrentTimeMillis = this.recordingStopped;
                if (jCurrentTimeMillis < 0) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
                jMin = Math.min(59500L, jCurrentTimeMillis - this.recordingStarted);
            }
            float fClamp = Utilities.clamp(jMin / 59500.0f, 1.0f, 0.0f);
            Paint paint2 = this.progressPaint;
            paint2.setStrokeWidth(AndroidUtilities.dp(3.33f));
            paint2.setColor(Theme.multAlpha(this.alpha, -1090519041));
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.33f), Theme.multAlpha(this.alpha, 536870912));
            rectF.inset(-AndroidUtilities.dp(7.665f), -AndroidUtilities.dp(7.665f));
            canvas.drawArc(rectF, -90.0f, fClamp * 360.0f, false, paint2);
            if (this.recordingStopped <= 0) {
                invalidate();
            }
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AnonymousClass1 anonymousClass1 = this.cameraView;
        int measuredWidth = ((i3 - i) - anonymousClass1.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
        int iDp = AndroidUtilities.dp(72.0f);
        anonymousClass1.layout(measuredWidth, iDp, anonymousClass1.getMeasuredWidth() + measuredWidth, anonymousClass1.getMeasuredHeight() + iDp);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int iMin = (int) (Math.min(size, size2) * 0.43f);
        measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
