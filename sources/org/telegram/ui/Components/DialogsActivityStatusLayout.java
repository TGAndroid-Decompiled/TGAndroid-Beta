package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;

public final class DialogsActivityStatusLayout extends View {
    public final RectF animatingRectF;
    public final BoolAnimator animatorStatusBarVisible;
    public final Paint fillingPaint;
    public final Bulletin$2$$ExternalSyntheticLambda1 justForTestR;
    public final RectF statusBarRectF;
    public final RectF telegramLogoRectF;

    public DialogsActivityStatusLayout(Context context) {
        super(context);
        this.animatorStatusBarVisible = new BoolAnimator(380L, this, CubicBezierInterpolator.EASE_OUT_QUINT);
        Paint paint = new Paint(1);
        this.fillingPaint = paint;
        this.statusBarRectF = new RectF();
        this.telegramLogoRectF = new RectF();
        this.animatingRectF = new RectF();
        this.justForTestR = new Bulletin$2$$ExternalSyntheticLambda1(this, 25);
        paint.setColor(Theme.getColor(null, Theme.key_telegram_color, false));
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.justForTestR, 3000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.justForTestR);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f = this.animatorStatusBarVisible.floatValue;
        RectF rectF = this.telegramLogoRectF;
        RectF rectF2 = this.statusBarRectF;
        RectF rectF3 = this.animatingRectF;
        AndroidUtilities.lerp(rectF, rectF2, f, rectF3);
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), 0, f);
        canvas.drawRoundRect(rectF3, fLerp, fLerp, this.fillingPaint);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, 1073741824));
        this.statusBarRectF.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        int iDp = ((currentActionBarHeight / 2) + paddingTop) - AndroidUtilities.dp(15.0f);
        this.telegramLogoRectF.set(AndroidUtilities.dp(12.0f), iDp, AndroidUtilities.dp(30.0f) + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(30.0f) + iDp);
    }
}
