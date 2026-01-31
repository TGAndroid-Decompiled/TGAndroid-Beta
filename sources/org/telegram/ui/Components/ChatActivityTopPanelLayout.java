package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import me.vkryl.android.animator.ListAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;

public class ChatActivityTopPanelLayout extends AnimatedLinearLayout {
    BlurredBackgroundDrawable backgroundDrawable;
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
        return super.dispatchTouchEvent(motionEvent) || (motionEvent.getAction() == 0 && (blurredBackgroundDrawable = this.backgroundDrawable) != null && blurredBackgroundDrawable.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()));
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

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (getMetadata().getTotalVisibility() == 0.0f) {
            return;
        }
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.draw(canvas);
        }
        canvas.save();
        canvas.clipPath(this.clipPath);
        int entriesCount = getEntriesCount();
        for (int i = 0; i < entriesCount; i++) {
            ListAnimator.Entry entry = getEntry(i);
            float paddingTop = getPaddingTop() + entry.getRectF().top;
            float visibility = entry.getVisibility() * Math.min(1.0f, entry.getPosition());
            int alpha = Theme.dividerPaint.getAlpha();
            Theme.dividerPaint.setAlpha((int) (alpha * visibility));
            float f = 1.0f - visibility;
            canvas.drawLine(getPaddingLeft() + (AndroidUtilities.dp(16.0f) * f), paddingTop, getWidth() - (getPaddingRight() + (AndroidUtilities.dp(16.0f) * f)), paddingTop, Theme.dividerPaint);
            Theme.dividerPaint.setAlpha(alpha);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
