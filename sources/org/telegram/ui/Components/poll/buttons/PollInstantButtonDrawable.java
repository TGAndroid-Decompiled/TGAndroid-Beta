package org.telegram.ui.Components.poll.buttons;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RadialProgress;

public final class PollInstantButtonDrawable extends PollButtonDrawableBase {
    public final BoolAnimator animatorProgressVisible;
    public final AnimatedTextView.AnimatedTextDrawable buttonTextAnimatedDrawable;
    public float offsetY;
    public final RadialProgress radialProgress;

    public PollInstantButtonDrawable(ChatMessageCell chatMessageCell, Theme.ResourcesProvider resourcesProvider) {
        super(resourcesProvider);
        RadialProgress radialProgress = new RadialProgress(chatMessageCell);
        this.radialProgress = radialProgress;
        radialProgress.setBackground(null, true, false);
        radialProgress.rotationSpeed = 650.0f;
        radialProgress.setProgress(0.69f, false);
        radialProgress.progressPaint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.animatorProgressVisible = new BoolAnimator(260L, chatMessageCell, CubicBezierInterpolator.EASE_OUT_QUINT);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, false, false, false);
        this.buttonTextAnimatedDrawable = animatedTextDrawable;
        animatedTextDrawable.textPaint.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(13.0f));
        animatedTextDrawable.gravity = 17;
        int color = Theme.getColor(Theme.key_listSelector, resourcesProvider);
        if (this.selectorDrawableColor != color) {
            Theme.setSelectorDrawableColor(this.selectorDrawable, color, false);
            this.selectorDrawableColor = color;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f = this.animatorProgressVisible.floatValue;
        if (f < 1.0f) {
            DrawableUtils.drawWithScale(canvas, this.buttonTextAnimatedDrawable, 1.0f - f);
        }
        if (f > 0.0f) {
            float fExactCenterX = getBounds().exactCenterX();
            float fExactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(f, f, fExactCenterX, fExactCenterY);
            this.radialProgress.draw(canvas);
            canvas.restore();
        }
    }

    public final float getProgressFactor() {
        return this.animatorProgressVisible.floatValue;
    }

    @Override
    public final void onAlphaChanged(int i) {
        this.selectorDrawable.setAlpha(i);
        this.buttonTextAnimatedDrawable.alpha = i;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect bounds = getBounds();
        int i = (int) this.offsetY;
        this.buttonTextAnimatedDrawable.setBounds(bounds.left, bounds.top + i, bounds.right, bounds.bottom + i);
        int iDp = AndroidUtilities.dp(11.0f);
        int iCenterX = rect.centerX();
        int iCenterY = rect.centerY();
        this.radialProgress.setProgressRect(iCenterX - iDp, iCenterY - iDp, iCenterX + iDp, iCenterY + iDp);
    }

    public final void setButtonTextColor(int i) {
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.buttonTextAnimatedDrawable;
        animatedTextDrawable.textPaint.setColor(i);
        animatedTextDrawable.alpha = Color.alpha(i);
        this.radialProgress.progressColor = i;
    }

    public final void setTextOffsetY(float f) {
        if (this.offsetY != f) {
            this.offsetY = f;
            Rect bounds = getBounds();
            int i = (int) this.offsetY;
            this.buttonTextAnimatedDrawable.setBounds(bounds.left, bounds.top + i, bounds.right, bounds.bottom + i);
        }
    }

    @Override
    public final void setupCallbacks(ChatMessageCell chatMessageCell) {
        setCallback(chatMessageCell);
        this.selectorDrawable.setCallback(chatMessageCell);
        this.buttonTextAnimatedDrawable.setCallback(chatMessageCell);
    }
}
