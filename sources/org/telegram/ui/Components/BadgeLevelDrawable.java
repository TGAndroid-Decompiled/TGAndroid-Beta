package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class BadgeLevelDrawable extends Drawable implements Drawable.Callback {
    public static int[] res;
    public final Context context;
    public Drawable inner;
    public int innerColor;
    public int lastLevelIndex;
    public int level;
    public Drawable outer;
    public int outerColor;
    public final AnimatedTextView.AnimatedTextDrawable text;
    public int textColor;

    public BadgeLevelDrawable(Context context) {
        this.context = context;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, false, false, false);
        this.text = animatedTextDrawable;
        animatedTextDrawable.textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        animatedTextDrawable.moveAmplitude = 0.2f;
        animatedTextDrawable.animateDuration = 160L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(10.0f));
        animatedTextDrawable.gravity = 17;
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.centerY = true;
        if (res != null) {
            return;
        }
        res = new int[]{R.drawable.profile_level1_inner, R.drawable.profile_level1_outer, R.drawable.profile_level2_inner, R.drawable.profile_level2_outer, R.drawable.profile_level3_inner, R.drawable.profile_level3_outer, R.drawable.profile_level4_inner, R.drawable.profile_level4_outer, R.drawable.profile_level5_inner, R.drawable.profile_level5_outer, R.drawable.profile_level6_inner, R.drawable.profile_level6_outer, R.drawable.profile_level7_inner, R.drawable.profile_level7_outer, R.drawable.profile_level8_inner, R.drawable.profile_level8_outer, R.drawable.profile_level9_inner, R.drawable.profile_level9_outer, R.drawable.profile_level10_inner, R.drawable.profile_level10_outer, R.drawable.profile_level20_inner, R.drawable.profile_level20_outer, R.drawable.profile_level30_inner, R.drawable.profile_level30_outer, R.drawable.profile_level40_inner, R.drawable.profile_level40_outer, R.drawable.profile_level50_inner, R.drawable.profile_level50_outer, R.drawable.profile_level60_inner, R.drawable.profile_level60_outer, R.drawable.profile_level70_inner, R.drawable.profile_level70_outer, R.drawable.profile_level80_inner, R.drawable.profile_level80_outer, R.drawable.profile_level90_inner, R.drawable.profile_level90_outer, R.drawable.profile_level_minus_inner, R.drawable.profile_level_minus_outer};
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.outer;
        if (drawable == null || this.inner == null) {
            return;
        }
        drawable.draw(canvas);
        this.inner.draw(canvas);
        canvas.save();
        canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
        this.text.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.inner;
        if (drawable != null) {
            drawable.setBounds(getBounds());
        }
        Drawable drawable2 = this.outer;
        if (drawable2 != null) {
            drawable2.setBounds(getBounds());
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override
    public final void setAlpha(int i) {
        int alphaComponent = ColorUtils.setAlphaComponent(this.innerColor, i);
        if (this.innerColor != alphaComponent) {
            this.innerColor = alphaComponent;
            Drawable drawable = this.inner;
            if (drawable != null) {
                drawable.setColorFilter(alphaComponent, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int alphaComponent2 = ColorUtils.setAlphaComponent(this.outerColor, i);
        if (this.outerColor != alphaComponent2) {
            this.outerColor = alphaComponent2;
            if (this.inner != null) {
                this.outer.setColorFilter(alphaComponent2, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int alphaComponent3 = ColorUtils.setAlphaComponent(this.textColor, i);
        if (this.textColor != alphaComponent3) {
            this.textColor = alphaComponent3;
            this.text.setTextColor(alphaComponent3, false);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
