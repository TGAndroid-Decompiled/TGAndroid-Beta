package org.telegram.ui.Stories.recorder;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;

public final class VideoTimerView extends View implements FlashViews.Invertable {
    public final Paint backgroundPaint;
    public final Paint recordPaint;
    public boolean recording;
    public final AnimatedFloat recordingT;
    public final AnimatedTextView.AnimatedTextDrawable textDrawable;

    public VideoTimerView(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        Paint paint2 = new Paint(1);
        this.recordPaint = paint2;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.recordingT = new AnimatedFloat(this, 0L, 250L, cubicBezierInterpolator);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
        this.textDrawable = animatedTextDrawable;
        animatedTextDrawable.setAnimationProperties(0.3f, 0L, 250L, cubicBezierInterpolator);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(13.0f));
        animatedTextDrawable.setTextColor(-1);
        animatedTextDrawable.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.setGravity(1);
        setDuration(0L, false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.recordingT.set(this.recording ? 1.0f : 0.0f);
        float fDp = AndroidUtilities.dp(12.66f) * f;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.textDrawable;
        float currentWidth = animatedTextDrawable.getCurrentWidth() + fDp;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(((getWidth() - currentWidth) / 2.0f) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(18.0f), ((getWidth() + currentWidth) / 2.0f) + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(40.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.backgroundPaint);
        if (f > 0.0f) {
            long jCurrentTimeMillis = System.currentTimeMillis() % 2000;
            Paint paint = this.recordPaint;
            paint.setAlpha((int) (Utilities.clamp((((float) Math.sin(((double) (jCurrentTimeMillis / 1000.0f)) * 3.141592653589793d)) / 4.0f) + 0.75f, 1.0f, 0.0f) * 255.0f));
            invalidate();
            canvas.drawCircle(rectF.left + AndroidUtilities.dp(10.66f), rectF.centerY(), AndroidUtilities.dp(4.0f) * f, paint);
        }
        animatedTextDrawable.setBounds((int) (rectF.left + fDp), ((int) rectF.top) - AndroidUtilities.dp(1.0f), (int) rectF.right, (int) rectF.bottom);
        animatedTextDrawable.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), 1073741824));
    }

    public final void setDuration(long j, boolean z) {
        long j2 = j % 60;
        long j3 = (j - j2) / 60;
        StringBuilder sb = new StringBuilder(5);
        if (j3 < 10) {
            sb.append('0');
        }
        sb.append(j3);
        sb.append(':');
        if (j2 < 10) {
            sb.append('0');
        }
        sb.append(j2);
        this.textDrawable.setText(sb, z);
    }

    @Override
    public void setInvert(float f) {
        this.backgroundPaint.setColor(ColorUtils.blendARGB(f, 1056964608, 268435456));
        this.textDrawable.setTextColor(ColorUtils.blendARGB(f, -1, -16777216));
    }

    public final void setRecording(boolean z, boolean z2) {
        this.recording = z;
        if (!z2) {
            this.recordingT.set(z ? 1.0f : 0.0f, true);
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.textDrawable == drawable || super.verifyDrawable(drawable);
    }
}
