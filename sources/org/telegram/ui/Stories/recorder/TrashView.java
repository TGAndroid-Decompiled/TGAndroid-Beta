package org.telegram.ui.Stories.recorder;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RLottieDrawable;

public final class TrashView extends View {
    public final ButtonBounce bounce;
    public final Paint circlePaint;
    public boolean dragged;
    public final AnimatedFloat draggedT;
    public final RLottieDrawable drawable;
    public final Paint greyPaint;
    public final AnimatedTextView.AnimatedTextDrawable textDrawable;

    public TrashView(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.circlePaint = paint;
        Paint paint2 = new Paint(1);
        this.greyPaint = paint2;
        this.bounce = new ButtonBounce(this, 1.0f, 5.0f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.draggedT = new AnimatedFloat(this, 0L, 240L, cubicBezierInterpolator);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dp(1.66f), 805306368);
        paint2.setColor(855638016);
        int i = R.raw.group_pip_delete_icon;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i, SurfaceContainer$$ExternalSyntheticOutline0.m(i, ""), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.drawable = rLottieDrawable;
        rLottieDrawable.masterParent = this;
        rLottieDrawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        rLottieDrawable.playInDirectionOfCustomEndFrame = true;
        rLottieDrawable.setCustomEndFrame(0);
        rLottieDrawable.decodeSingleFrame = true;
        rLottieDrawable.scheduleNextGetFrame();
        rLottieDrawable.start();
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, false, false);
        this.textDrawable = animatedTextDrawable;
        animatedTextDrawable.moveAmplitude = 0.3f;
        animatedTextDrawable.animateDuration = 250L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        animatedTextDrawable.overrideFullWidth = AndroidUtilities.displaySize.x;
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(14.0f));
        animatedTextDrawable.textPaint.setColor(-1);
        animatedTextDrawable.alpha = Color.alpha(-1);
        animatedTextDrawable.setShadowLayer(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dp(1.0f), 1073741824);
        animatedTextDrawable.setText(LocaleController.getString(R.string.TrashHintDrag), true, true);
        animatedTextDrawable.gravity = 17;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float fDp = AndroidUtilities.dp(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float fDp2 = (this.draggedT.set(this.dragged) * AndroidUtilities.dp(3.0f)) + fDp;
        canvas.drawCircle(width, height, fDp2, this.greyPaint);
        canvas.drawCircle(width, height, fDp2, this.circlePaint);
        float fDp3 = AndroidUtilities.dp(48.0f);
        RLottieDrawable rLottieDrawable = this.drawable;
        float f = fDp3 / 2.0f;
        rLottieDrawable.setBounds((int) (width - f), (int) (height - f), (int) (width + f), (int) (f + height));
        rLottieDrawable.draw(canvas);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.textDrawable;
        animatedTextDrawable.setBounds(0, (int) (height + fDp + AndroidUtilities.dp(7.0f)), getWidth(), getHeight());
        animatedTextDrawable.draw(canvas);
    }

    public final void onDragInfo(boolean z, boolean z2) {
        this.bounce.setPressed(z);
        this.textDrawable.setText(LocaleController.getString((z || z2) ? R.string.TrashHintRelease : R.string.TrashHintDrag), true, true);
        boolean z3 = z && !z2;
        this.dragged = z3;
        RLottieDrawable rLottieDrawable = this.drawable;
        if (z3) {
            if (rLottieDrawable.currentFrame > 34) {
                rLottieDrawable.setCurrentFrame(0, false, false);
            }
            rLottieDrawable.setCustomEndFrame(33);
            rLottieDrawable.start();
        } else {
            rLottieDrawable.setCustomEndFrame(z2 ? 66 : 0);
            rLottieDrawable.start();
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(i, AndroidUtilities.dp(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.textDrawable || super.verifyDrawable(drawable);
    }
}
