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

    public void setBlurredBackground(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.backgroundDrawable = blurredBackgroundDrawable;
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        checkBoundsAndClipping();
    }

    @Override
    protected void onItemsChanged() {
        super.onItemsChanged();
        checkBoundsAndClipping();
        invalidate();
    }

    @Override
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        checkBoundsAndClipping();
        invalidate();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        BlurredBackgroundDrawable blurredBackgroundDrawable;
        if (super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return motionEvent.getAction() == 0 && (blurredBackgroundDrawable = this.backgroundDrawable) != null && blurredBackgroundDrawable.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    private void checkBoundsAndClipping() {
        float totalHeight = getMetadata().getTotalHeight();
        float totalVisibility = getMetadata().getTotalVisibility();
        this.clipRectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getPaddingTop() + totalHeight);
        float fMin = Math.min(AndroidUtilities.dp(18.0f), Math.min(this.clipRectF.width(), this.clipRectF.height()) / 2.0f);
        this.clipPath.rewind();
        this.clipPath.addRoundRect(this.clipRectF, fMin, fMin, Path.Direction.CW);
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setAlpha((int) (totalVisibility * 255.0f));
            this.backgroundDrawable.setBounds(getPaddingLeft() - AndroidUtilities.dp(7.0f), 0, (getMeasuredWidth() - getPaddingRight()) + AndroidUtilities.dp(7.0f), getPaddingTop() + getPaddingBottom() + ((int) totalHeight));
            this.backgroundDrawable.setRadius(Math.min(AndroidUtilities.dp(18.0f), totalHeight / 2.0f));
        }
    }

    public void updateColors() {
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.updateColors();
        }
        Color.alpha(Theme.getColor(Theme.key_windowBackgroundWhite));
        invalidate();
    }

    public void setCallFragmentContextView(FragmentContextView fragmentContextView) {
        this.callFragmentContextView = fragmentContextView;
        fragmentContextView.getCapsuleBlobDrawable().setCallback(this);
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        FragmentContextView fragmentContextView = this.callFragmentContextView;
        return fragmentContextView != null && fragmentContextView.getCapsuleBlobDrawable() == drawable;
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        boolean z;
        Canvas canvas2;
        FragmentContextView fragmentContextView;
        int currentStyle;
        FragmentContextView fragmentContextView2;
        if (getMetadata().getTotalVisibility() == 0.0f) {
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
                    capsuleBlobDrawable.setBounds(getPaddingLeft() - requiredInset, i3, (getMeasuredWidth() - getPaddingRight()) + requiredInset, AndroidUtilities.dp(36.0f) + (requiredInset * 2) + i3);
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
            float visibility2 = entry2.getVisibility() * Math.min(1.0f, entry2.getPosition());
            if (visibility2 > 0.0f && !(z && (fragmentContextView = this.callFragmentContextView) != null && (fragmentContextView == view2 || fragmentContextView.getParent() == view2))) {
                int alpha = Theme.dividerPaint.getAlpha();
                Theme.dividerPaint.setAlpha((int) (alpha * visibility2));
                float f = 1.0f - visibility2;
                float paddingLeft = getPaddingLeft() + (AndroidUtilities.dp(16.0f) * f);
                float paddingRight = getPaddingRight() + (AndroidUtilities.dp(16.0f) * f);
                canvas2 = canvas;
                canvas2.drawLine(paddingLeft, paddingTop2, getWidth() - paddingRight, paddingTop2, Theme.dividerPaint);
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
}
