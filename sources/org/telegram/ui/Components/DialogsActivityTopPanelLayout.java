package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import androidx.core.graphics.ColorUtils;
import me.vkryl.android.animator.ListAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;

public class DialogsActivityTopPanelLayout extends AnimatedLinearLayout {
    BlurredBackgroundDrawable backgroundDrawable;
    private final Path clipPath;
    private final RectF clipRectF;
    private final GradientDrawable fadeDrawable;

    public DialogsActivityTopPanelLayout(Context context) {
        super(context);
        this.clipPath = new Path();
        this.clipRectF = new RectF();
        setOrientation(1);
        this.fadeDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
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
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        BlurredBackgroundDrawable blurredBackgroundDrawable;
        return super.dispatchTouchEvent(motionEvent) || (motionEvent.getAction() == 0 && (blurredBackgroundDrawable = this.backgroundDrawable) != null && blurredBackgroundDrawable.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()));
    }

    private void checkBoundsAndClipping() {
        float totalHeight = getMetadata().getTotalHeight();
        float totalVisibility = getMetadata().getTotalVisibility();
        this.clipRectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getPaddingTop() + totalHeight);
        float fMin = Math.min(AndroidUtilities.dp(24.0f), Math.min(this.clipRectF.width(), this.clipRectF.height()) / 2.0f);
        this.clipPath.rewind();
        this.clipPath.addRoundRect(this.clipRectF, fMin, fMin, Path.Direction.CW);
        int i = (int) totalHeight;
        this.fadeDrawable.setBounds(0, AndroidUtilities.dp(14.0f), getMeasuredWidth(), AndroidUtilities.dp(14.0f) + Math.min(AndroidUtilities.dp(30.0f), i));
        int i2 = (int) (totalVisibility * 255.0f);
        this.fadeDrawable.setAlpha(i2);
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setAlpha(i2);
            this.backgroundDrawable.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), ((getPaddingTop() + getPaddingBottom()) + i) - AndroidUtilities.dp(14.0f));
            this.backgroundDrawable.setRadius(Math.min(AndroidUtilities.dp(24.0f), totalHeight / 2.0f));
        }
    }

    public void updateColors() {
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.updateColors();
        }
        int color = Theme.getColor(Theme.key_windowBackgroundWhite);
        int iAlpha = Color.alpha(color);
        this.fadeDrawable.setColors(new int[]{ColorUtils.setAlphaComponent(color, (iAlpha * 232) / 255), ColorUtils.setAlphaComponent(color, (iAlpha * 192) / 255), ColorUtils.setAlphaComponent(color, (iAlpha * 144) / 255), ColorUtils.setAlphaComponent(color, 0)});
        invalidate();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        this.fadeDrawable.draw(canvas);
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
            Theme.dividerPaint.setAlpha((int) (255.0f * visibility));
            float f = 1.0f - visibility;
            canvas.drawLine((AndroidUtilities.dp(16.0f) * f) + getPaddingLeft(), paddingTop, getWidth() - (getPaddingRight() + (AndroidUtilities.dp(16.0f) * f)), paddingTop, Theme.dividerPaint);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
