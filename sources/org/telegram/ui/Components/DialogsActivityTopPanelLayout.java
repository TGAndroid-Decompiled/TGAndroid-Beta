package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import me.vkryl.android.animator.ListAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;

public class DialogsActivityTopPanelLayout extends AnimatedLinearLayout {
    BlurredBackgroundDrawable backgroundDrawable;
    private FragmentContextView callFragmentContextView;
    private final Path clipPath;
    private final RectF clipRectF;
    private int defaultRadiusDp;
    private boolean exceptCall;
    private boolean onlyCall;

    public DialogsActivityTopPanelLayout(Context context) {
        super(context);
        this.clipPath = new Path();
        this.clipRectF = new RectF();
        this.defaultRadiusDp = 24;
        setOrientation(1);
        updateColors();
    }

    private void checkBoundsAndClipping() {
        float f = getMetadata().totalHeight.now;
        float f2 = getMetadata().totalVisibility.now;
        this.clipRectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getPaddingTop() + f);
        float fMin = Math.min(AndroidUtilities.dp(this.defaultRadiusDp), Math.min(this.clipRectF.width(), this.clipRectF.height()) / 2.0f);
        this.clipPath.rewind();
        this.clipPath.addRoundRect(this.clipRectF, fMin, fMin, Path.Direction.CW);
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setAlpha((int) (f2 * 255.0f));
            this.backgroundDrawable.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), ((getPaddingBottom() + getPaddingTop()) + ((int) f)) - AndroidUtilities.dp(14.0f));
            this.backgroundDrawable.setRadius(Math.min(AndroidUtilities.dp(this.defaultRadiusDp), f / 2.0f));
        }
    }

    private boolean isCallView(View view) {
        FragmentContextView fragmentContextView = this.callFragmentContextView;
        if (fragmentContextView != null) {
            return fragmentContextView == view || fragmentContextView.getParent() == view;
        }
        return false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int currentStyle;
        Canvas canvas2 = canvas;
        if (getMetadata().totalVisibility.now == 0.0f) {
            return;
        }
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.draw(canvas2);
        }
        FragmentContextView fragmentContextView = this.callFragmentContextView;
        View view = null;
        if (fragmentContextView != null && ((currentStyle = fragmentContextView.getCurrentStyle()) == 3 || currentStyle == 1)) {
            int entriesCount = getEntriesCount();
            for (int i = 0; i < entriesCount; i++) {
                ListAnimator.Entry entry = getEntry(i);
                float paddingTop = getPaddingTop() + entry.getRectF().top;
                View view2 = ((AnimatedLinearLayout.Holder) entry.item).view;
                float visibility = entry.getVisibility();
                if (visibility > 0.0f && isCallView(view2)) {
                    CapsuleBlobDrawable capsuleBlobDrawable = this.callFragmentContextView.getCapsuleBlobDrawable();
                    int requiredInset = capsuleBlobDrawable.getRequiredInset();
                    int i2 = -requiredInset;
                    capsuleBlobDrawable.setBounds(getPaddingLeft() - requiredInset, i2, (getMeasuredWidth() - getPaddingRight()) + requiredInset, (requiredInset * 2) + AndroidUtilities.dp(36.0f) + i2);
                    capsuleBlobDrawable.setAlpha((int) (visibility * 255.0f));
                    canvas2.save();
                    canvas2.translate(0.0f, paddingTop);
                    capsuleBlobDrawable.draw(canvas2);
                    canvas2.restore();
                    view = view2;
                }
            }
        }
        View view3 = view;
        canvas2.save();
        canvas2.clipPath(this.clipPath);
        int entriesCount2 = getEntriesCount();
        int i3 = 0;
        while (i3 < entriesCount2) {
            ListAnimator.Entry entry2 = getEntry(i3);
            float paddingTop2 = getPaddingTop() + entry2.getRectF().top;
            View view4 = ((AnimatedLinearLayout.Holder) entry2.item).view;
            float fMin = Math.min(1.0f, entry2.position.now) * entry2.getVisibility();
            if (fMin > 0.0f && view3 != view4) {
                int alpha = Theme.dividerPaint.getAlpha();
                Theme.dividerPaint.setAlpha((int) (alpha * fMin));
                float f = 1.0f - fMin;
                canvas2.drawLine(getPaddingLeft() + (AndroidUtilities.dp(16.0f) * f), paddingTop2, getWidth() - ((AndroidUtilities.dp(16.0f) * f) + getPaddingRight()), paddingTop2, Theme.dividerPaint);
                Theme.dividerPaint.setAlpha(alpha);
            }
            i3++;
            canvas2 = canvas;
        }
        this.exceptCall = view3 != null;
        this.onlyCall = false;
        super.dispatchDraw(canvas);
        canvas.restore();
        if (view3 != null) {
            this.onlyCall = true;
            this.exceptCall = false;
            super.dispatchDraw(canvas);
        }
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
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean zIsCallView = isCallView(view);
        if (zIsCallView && this.exceptCall) {
            return false;
        }
        if (zIsCallView || !this.onlyCall) {
            return super.drawChild(canvas, view, j);
        }
        return false;
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

    public void setDefaultRadiusDp(int i) {
        this.defaultRadiusDp = i;
    }

    public void updateColors() {
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.updateColors();
        }
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
