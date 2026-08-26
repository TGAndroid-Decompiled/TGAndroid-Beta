package org.telegram.ui.Components.Premium.boosts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class GradientButtonWithCounterView extends ButtonWithCounterView {
    public final CellFlickerDrawable flickerDrawable;
    public boolean incGradient;
    public float progress;
    public final RectF rect;

    public GradientButtonWithCounterView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider, true);
        this.rect = new RectF();
        CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable(64, 204, 160);
        this.flickerDrawable = cellFlickerDrawable;
        cellFlickerDrawable.animationSpeedScale = 1.2f;
        cellFlickerDrawable.drawFrame = false;
        cellFlickerDrawable.repeatProgress = 4.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.incGradient) {
            float f = this.progress + 0.016f;
            this.progress = f;
            if (f > 3.0f) {
                this.incGradient = false;
            }
        } else {
            float f2 = this.progress - 0.016f;
            this.progress = f2;
            if (f2 < 1.0f) {
                this.incGradient = true;
            }
        }
        RectF rectF = this.rect;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        PremiumGradient premiumGradient = PremiumGradient.getInstance();
        premiumGradient.mainGradient.gradientMatrix(0, (-getMeasuredWidth()) * 0.1f * this.progress, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), PremiumGradient.getInstance().getMainGradientPaint());
        int measuredWidth = getMeasuredWidth();
        CellFlickerDrawable cellFlickerDrawable = this.flickerDrawable;
        cellFlickerDrawable.parentWidth = measuredWidth;
        cellFlickerDrawable.draw(AndroidUtilities.dp(8.0f), canvas, rectF, null);
        super.onDraw(canvas);
        invalidate();
    }
}
