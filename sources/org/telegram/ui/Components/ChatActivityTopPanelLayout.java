package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import me.vkryl.android.animator.ListAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;

public class ChatActivityTopPanelLayout extends AnimatedLinearLayout {
    BlurredBackgroundDrawable backgroundDrawable;
    private FragmentContextView callFragmentContextView;
    private final Path clipPath;
    private final RectF clipRectF;

    public ChatActivityTopPanelLayout(Context context) {
        super(context);
        this.clipPath = new Path();
        this.clipRectF = new RectF();
        setOrientation(1);
        updateColors();
    }

    private void checkBoundsAndClipping() {
        float f = getMetadata().totalHeight.now;
        float f2 = getMetadata().totalVisibility.now;
        this.clipRectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getPaddingTop() + f);
        float fMin = Math.min(AndroidUtilities.dp(18.0f), Math.min(this.clipRectF.width(), this.clipRectF.height()) / 2.0f);
        this.clipPath.rewind();
        this.clipPath.addRoundRect(this.clipRectF, fMin, fMin, Path.Direction.CW);
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setAlpha((int) (f2 * 255.0f));
            this.backgroundDrawable.setBounds(getPaddingLeft() - AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f) + (getMeasuredWidth() - getPaddingRight()), getPaddingBottom() + getPaddingTop() + ((int) f));
            this.backgroundDrawable.setRadius(Math.min(AndroidUtilities.dp(18.0f), f / 2.0f));
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z;
        Canvas canvas2;
        FragmentContextView fragmentContextView;
        int currentStyle;
        FragmentContextView fragmentContextView2;
        if (getMetadata().totalVisibility.now == 0.0f) {
            return;
        }
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.draw(canvas);
        }
        FragmentContextView fragmentContextView3 = this.callFragmentContextView;
        int i = 0;
        if (fragmentContextView3 == null || !((currentStyle = fragmentContextView3.getCurrentStyle()) == 3 || currentStyle == 1)) {
            z = false;
        } else {
            int entriesCount = getEntriesCount();
            z = false;
            for (int i2 = 0; i2 < entriesCount; i2++) {
                ListAnimator.Entry entry = getEntry(i2);
                float paddingTop = getPaddingTop() + entry.getRectF().top;
                View view = ((AnimatedLinearLayout.Holder) entry.item).view;
                float visibility = entry.getVisibility();
                if (visibility > 0.0f && ((fragmentContextView2 = this.callFragmentContextView) == view || fragmentContextView2.getParent() == view)) {
                    CapsuleBlobDrawable capsuleBlobDrawable = this.callFragmentContextView.getCapsuleBlobDrawable();
                    int requiredInset = capsuleBlobDrawable.getRequiredInset();
                    int i3 = -requiredInset;
                    capsuleBlobDrawable.setBounds(getPaddingLeft() - requiredInset, i3, (getMeasuredWidth() - getPaddingRight()) + requiredInset, (requiredInset * 2) + AndroidUtilities.dp(36.0f) + i3);
                    capsuleBlobDrawable.setAlpha((int) (visibility * 255.0f));
                    canvas.save();
                    canvas.translate(0.0f, paddingTop);
                    capsuleBlobDrawable.draw(canvas);
                    canvas.restore();
                    z = true;
                }
            }
        }
        canvas.save();
        canvas.clipPath(this.clipPath);
        int entriesCount2 = getEntriesCount();
        while (i < entriesCount2) {
            ListAnimator.Entry entry2 = getEntry(i);
            float paddingTop2 = getPaddingTop() + entry2.getRectF().top;
            View view2 = ((AnimatedLinearLayout.Holder) entry2.item).view;
            float fMin = Math.min(1.0f, entry2.position.now) * entry2.getVisibility();
            if (fMin > 0.0f && !(z && (fragmentContextView = this.callFragmentContextView) != null && (fragmentContextView == view2 || fragmentContextView.getParent() == view2))) {
                int alpha = Theme.dividerPaint.getAlpha();
                Theme.dividerPaint.setAlpha((int) (alpha * fMin));
                float f = 1.0f - fMin;
                float fDp = (AndroidUtilities.dp(16.0f) * f) + getPaddingLeft();
                float fDp2 = (AndroidUtilities.dp(16.0f) * f) + getPaddingRight();
                canvas2 = canvas;
                canvas2.drawLine(fDp, paddingTop2, getWidth() - fDp2, paddingTop2, Theme.dividerPaint);
                Theme.dividerPaint.setAlpha(alpha);
            } else {
                canvas2 = canvas;
            }
            i++;
            canvas = canvas2;
        }
        Canvas canvas3 = canvas;
        super.dispatchDraw(canvas3);
        canvas3.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        BlurredBackgroundDrawable blurredBackgroundDrawable;
        if (super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return motionEvent.getAction() == 0 && (blurredBackgroundDrawable = this.backgroundDrawable) != null && blurredBackgroundDrawable.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override
    public void onItemsChanged() {
        super.onItemsChanged();
        checkBoundsAndClipping();
        invalidate();
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        checkBoundsAndClipping();
    }

    public void setBlurredBackground(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.backgroundDrawable = blurredBackgroundDrawable;
    }

    public void setCallFragmentContextView(FragmentContextView fragmentContextView) {
        this.callFragmentContextView = fragmentContextView;
        fragmentContextView.getCapsuleBlobDrawable().setCallback(this);
    }

    @Override
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        checkBoundsAndClipping();
        invalidate();
    }

    public void updateColors() {
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.updateColors();
        }
        Color.alpha(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        FragmentContextView fragmentContextView = this.callFragmentContextView;
        return fragmentContextView != null && fragmentContextView.getCapsuleBlobDrawable() == drawable;
    }
}
