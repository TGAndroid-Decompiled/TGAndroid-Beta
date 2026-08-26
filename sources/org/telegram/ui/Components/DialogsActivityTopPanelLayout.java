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

public final class DialogsActivityTopPanelLayout extends AnimatedLinearLayout {
    public BlurredBackgroundDrawable backgroundDrawable;
    public FragmentContextView callFragmentContextView;
    public final Path clipPath;
    public final RectF clipRectF;
    public int defaultRadiusDp;
    public boolean exceptCall;
    public boolean onlyCall;

    public DialogsActivityTopPanelLayout(Context context) {
        super(context);
        this.clipPath = new Path();
        this.clipRectF = new RectF();
        this.defaultRadiusDp = 24;
        setOrientation(1);
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.updateColors();
        }
        invalidate();
    }

    public final void checkBoundsAndClipping$1() {
        float f = getMetadata().totalHeight.now;
        float f2 = getMetadata().totalVisibility.now;
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float measuredWidth = getMeasuredWidth() - getPaddingRight();
        float paddingTop2 = getPaddingTop() + f;
        RectF rectF = this.clipRectF;
        rectF.set(paddingLeft, paddingTop, measuredWidth, paddingTop2);
        float fMin = Math.min(AndroidUtilities.dp(this.defaultRadiusDp), Math.min(rectF.width(), rectF.height()) / 2.0f);
        Path path = this.clipPath;
        path.rewind();
        path.addRoundRect(rectF, fMin, fMin, Path.Direction.CW);
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setAlpha((int) (f2 * 255.0f));
            this.backgroundDrawable.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), ((getPaddingBottom() + getPaddingTop()) + ((int) f)) - AndroidUtilities.dp(14.0f));
            this.backgroundDrawable.setRadius(Math.min(AndroidUtilities.dp(this.defaultRadiusDp), f / 2.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int currentStyle;
        FragmentContextView fragmentContextView;
        Canvas canvas2 = canvas;
        if (getMetadata().totalVisibility.now == 0.0f) {
            return;
        }
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.draw(canvas2);
        }
        FragmentContextView fragmentContextView2 = this.callFragmentContextView;
        ListAnimator listAnimator = this.listAnimator;
        View view = null;
        if (fragmentContextView2 != null && ((currentStyle = fragmentContextView2.getCurrentStyle()) == 3 || currentStyle == 1)) {
            int entriesCount = getEntriesCount();
            for (int i = 0; i < entriesCount; i++) {
                ListAnimator.Entry entry = (ListAnimator.Entry) listAnimator.entries.get(i);
                float paddingTop = getPaddingTop() + entry.getRectF().top;
                View view2 = ((AnimatedLinearLayout.Holder) entry.item).view;
                float visibility = entry.getVisibility();
                if (visibility > 0.0f && (fragmentContextView = this.callFragmentContextView) != null && (fragmentContextView == view2 || fragmentContextView.getParent() == view2)) {
                    CapsuleBlobDrawable capsuleBlobDrawable = this.callFragmentContextView.getCapsuleBlobDrawable();
                    CapsuleBlobDrawable.Layer layer = capsuleBlobDrawable.big;
                    float f = layer.pushMax;
                    float f2 = layer.breathScale;
                    float f3 = capsuleBlobDrawable.breathDepth;
                    float f4 = (f2 * f3) + f;
                    float f5 = layer.waveScale;
                    float f6 = capsuleBlobDrawable.waveDepth;
                    float f7 = (f5 * f6) + f4;
                    CapsuleBlobDrawable.Layer layer2 = capsuleBlobDrawable.small;
                    int iDp = AndroidUtilities.dp(1.0f) + ((int) Math.max(f7, (f6 * layer2.waveScale) + (f3 * layer2.breathScale) + layer2.pushMax));
                    int i2 = -iDp;
                    capsuleBlobDrawable.setBounds(getPaddingLeft() - iDp, i2, (getMeasuredWidth() - getPaddingRight()) + iDp, (iDp * 2) + AndroidUtilities.dp(36.0f) + i2);
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
            ListAnimator.Entry entry2 = (ListAnimator.Entry) listAnimator.entries.get(i3);
            float paddingTop2 = getPaddingTop() + entry2.getRectF().top;
            View view4 = ((AnimatedLinearLayout.Holder) entry2.item).view;
            float fMin = Math.min(1.0f, entry2.position.now) * entry2.getVisibility();
            if (fMin > 0.0f && view3 != view4) {
                int alpha = Theme.dividerPaint.getAlpha();
                Theme.dividerPaint.setAlpha((int) (alpha * fMin));
                float f8 = 1.0f - fMin;
                canvas2.drawLine(getPaddingLeft() + (AndroidUtilities.dp(16.0f) * f8), paddingTop2, getWidth() - ((AndroidUtilities.dp(16.0f) * f8) + getPaddingRight()), paddingTop2, Theme.dividerPaint);
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
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        BlurredBackgroundDrawable blurredBackgroundDrawable;
        if (super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return motionEvent.getAction() == 0 && (blurredBackgroundDrawable = this.backgroundDrawable) != null && blurredBackgroundDrawable.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        FragmentContextView fragmentContextView = this.callFragmentContextView;
        boolean z = fragmentContextView != null && (fragmentContextView == view || fragmentContextView.getParent() == view);
        if (!(z && this.exceptCall) && (z || !this.onlyCall)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override
    public final void onItemsChanged() {
        checkBoundsAndClipping$1();
        invalidate();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        checkBoundsAndClipping$1();
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

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        FragmentContextView fragmentContextView = this.callFragmentContextView;
        return fragmentContextView != null && fragmentContextView.getCapsuleBlobDrawable() == drawable;
    }
}
