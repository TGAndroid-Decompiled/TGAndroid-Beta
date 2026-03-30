package org.telegram.ui.Components.poll.buttons;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RadialProgress;

public class PollInstantButtonDrawable extends PollButtonDrawableBase {
    private final BoolAnimator animatorProgressVisible;
    private final AnimatedTextView.AnimatedTextDrawable buttonTextAnimatedDrawable;
    private float offsetY;
    private final RadialProgress radialProgress;

    public PollInstantButtonDrawable(View view, Theme.ResourcesProvider resourcesProvider) {
        super(resourcesProvider);
        RadialProgress radialProgress = new RadialProgress(view);
        this.radialProgress = radialProgress;
        radialProgress.setBackground(null, true, false);
        radialProgress.setRotationTime(650.0f);
        radialProgress.setProgress(0.69f, false);
        radialProgress.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.animatorProgressVisible = new BoolAnimator(view, CubicBezierInterpolator.EASE_OUT_QUINT, 260L);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, false, false);
        this.buttonTextAnimatedDrawable = animatedTextDrawable;
        animatedTextDrawable.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(13.0f));
        animatedTextDrawable.setGravity(17);
        setSelectorsColor(Theme.getColor(Theme.key_listSelector, resourcesProvider));
    }

    public void setButtonText(CharSequence charSequence, boolean z) {
        this.buttonTextAnimatedDrawable.setText(charSequence, z);
    }

    public void setButtonTextColor(int i) {
        this.buttonTextAnimatedDrawable.setTextColor(i);
        this.radialProgress.setProgressColor(i);
    }

    public void setTextOffsetY(float f) {
        if (this.offsetY != f) {
            this.offsetY = f;
            checkBounds(getBounds());
        }
    }

    public void setLoading(boolean z, boolean z2) {
        if (this.animatorProgressVisible.getValue() != z) {
            this.animatorProgressVisible.setValue(z, z2);
        }
    }

    public float getProgressFactor() {
        return this.animatorProgressVisible.getFloatValue();
    }

    @Override
    public void draw(Canvas canvas) {
        float floatValue = this.animatorProgressVisible.getFloatValue();
        if (floatValue < 1.0f) {
            DrawableUtils.drawWithScale(canvas, this.buttonTextAnimatedDrawable, 1.0f - floatValue);
        }
        if (floatValue > 0.0f) {
            float fExactCenterX = getBounds().exactCenterX();
            float fExactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(floatValue, floatValue, fExactCenterX, fExactCenterY);
            this.radialProgress.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        checkBounds(getBounds());
        int iDp = AndroidUtilities.dp(11.0f);
        int iCenterX = rect.centerX();
        int iCenterY = rect.centerY();
        this.radialProgress.setProgressRect(iCenterX - iDp, iCenterY - iDp, iCenterX + iDp, iCenterY + iDp);
    }

    private void checkBounds(Rect rect) {
        int i = (int) this.offsetY;
        this.buttonTextAnimatedDrawable.setBounds(rect.left, rect.top + i, rect.right, rect.bottom + i);
    }

    @Override
    public void setupCallbacks(Drawable.Callback callback) {
        super.setupCallbacks(callback);
        this.buttonTextAnimatedDrawable.setCallback(callback);
    }

    @Override
    protected void onAlphaChanged(int i) {
        super.onAlphaChanged(i);
        this.buttonTextAnimatedDrawable.setAlpha(i);
    }
}
