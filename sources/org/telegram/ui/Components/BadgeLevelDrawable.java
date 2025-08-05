package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedTextView;

public class BadgeLevelDrawable extends Drawable implements Drawable.Callback {
    private static int[] res;
    private final Context context;
    private Drawable inner;
    private int innerColor;
    private int lastLevelIndex;
    private int level;
    private Drawable outer;
    private int outerColor;
    private final AnimatedTextView.AnimatedTextDrawable text;
    private int textColor;

    public BadgeLevelDrawable(Context context) {
        this.context = context;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
        this.text = animatedTextDrawable;
        animatedTextDrawable.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        animatedTextDrawable.setAnimationProperties(0.2f, 0L, 160L, CubicBezierInterpolator.EASE_OUT_QUINT);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(10.0f));
        animatedTextDrawable.setGravity(17);
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.centerY = true;
        init();
    }

    private void checkBounds() {
        Drawable drawable = this.inner;
        if (drawable != null) {
            drawable.setBounds(getBounds());
        }
        Drawable drawable2 = this.outer;
        if (drawable2 != null) {
            drawable2.setBounds(getBounds());
        }
    }

    private static int getIndexByLevel(int i) {
        if (i < 0) {
            return 18;
        }
        return MathUtils.clamp(i <= 10 ? i - 1 : (i / 10) + 8, 0, 17);
    }

    private static void init() {
        if (res != null) {
            return;
        }
        res = new int[]{R.drawable.profile_level1_inner, R.drawable.profile_level1_outer, R.drawable.profile_level2_inner, R.drawable.profile_level2_outer, R.drawable.profile_level3_inner, R.drawable.profile_level3_outer, R.drawable.profile_level4_inner, R.drawable.profile_level4_outer, R.drawable.profile_level5_inner, R.drawable.profile_level5_outer, R.drawable.profile_level6_inner, R.drawable.profile_level6_outer, R.drawable.profile_level7_inner, R.drawable.profile_level7_outer, R.drawable.profile_level8_inner, R.drawable.profile_level8_outer, R.drawable.profile_level9_inner, R.drawable.profile_level9_outer, R.drawable.profile_level10_inner, R.drawable.profile_level10_outer, R.drawable.profile_level20_inner, R.drawable.profile_level20_outer, R.drawable.profile_level30_inner, R.drawable.profile_level30_outer, R.drawable.profile_level40_inner, R.drawable.profile_level40_outer, R.drawable.profile_level50_inner, R.drawable.profile_level50_outer, R.drawable.profile_level60_inner, R.drawable.profile_level60_outer, R.drawable.profile_level70_inner, R.drawable.profile_level70_outer, R.drawable.profile_level80_inner, R.drawable.profile_level80_outer, R.drawable.profile_level90_inner, R.drawable.profile_level90_outer, R.drawable.profile_level_minus_inner, R.drawable.profile_level_minus_outer};
    }

    private void setLevelIndex(int i) {
        if (this.lastLevelIndex != i || this.inner == null || this.outer == null) {
            int i2 = i * 2;
            Drawable mutate = this.context.getResources().getDrawable(res[i2]).mutate();
            this.inner = mutate;
            int i3 = this.innerColor;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(i3, mode);
            Drawable mutate2 = this.context.getResources().getDrawable(res[i2 + 1]).mutate();
            this.outer = mutate2;
            mutate2.setColorFilter(this.outerColor, mode);
            this.lastLevelIndex = i;
            checkBounds();
        }
    }

    public void debugUpdateStart() {
    }

    public void debugUpdateStop() {
    }

    @Override
    public void draw(Canvas canvas) {
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
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    protected void onBoundsChange(android.graphics.Rect rect) {
        checkBounds();
    }

    @Override
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override
    public void setAlpha(int i) {
        setInnerColor(ColorUtils.setAlphaComponent(this.innerColor, i));
        setOuterColor(ColorUtils.setAlphaComponent(this.outerColor, i));
        setTextColor(ColorUtils.setAlphaComponent(this.textColor, i));
    }

    public void setBadgeLevel(int i, boolean z) {
        if (this.level != i || this.inner == null || this.outer == null) {
            this.text.setText(i >= 0 ? Integer.toString(i) : "!", z);
            this.level = i;
            setLevelIndex(getIndexByLevel(i));
            invalidateSelf();
        }
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setInnerColor(int i) {
        if (this.innerColor != i) {
            this.innerColor = i;
            Drawable drawable = this.inner;
            if (drawable != null) {
                drawable.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
    }

    public void setOuterColor(int i) {
        if (this.outerColor != i) {
            this.outerColor = i;
            if (this.inner != null) {
                this.outer.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
    }

    public void setTextColor(int i) {
        if (this.textColor != i) {
            this.textColor = i;
            this.text.setTextColor(i, false);
            invalidateSelf();
        }
    }

    @Override
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
