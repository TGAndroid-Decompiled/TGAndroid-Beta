package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ys extends View {
    public final me.b f33337a;
    public final Paint f33338b;
    public final RectF f33339c;
    public final RectF d;
    public final RectF f33340e;
    public final nq f33341f;

    public ys(Context context) {
        super(context);
        this.f33337a = new me.b(this, hs.h, 380L);
        Paint paint = new Paint(1);
        this.f33338b = paint;
        this.f33339c = new RectF();
        this.d = new RectF();
        this.f33340e = new RectF();
        this.f33341f = new nq(this, 5);
        paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.hl, false));
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f33341f, 3000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f33341f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7 = this.f33337a.f16337e;
        RectF rectF = this.d;
        RectF rectF2 = this.f33339c;
        RectF rectF3 = this.f33340e;
        AndroidUtilities.lerp(rectF, rectF2, f7, rectF3);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), 0, f7);
        canvas.drawRoundRect(rectF3, lerp, lerp, this.f33338b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, 1073741824));
        this.f33339c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        int dp = ((currentActionBarHeight / 2) + paddingTop) - AndroidUtilities.dp(15.0f);
        int dp2 = AndroidUtilities.dp(12.0f);
        this.d.set(AndroidUtilities.dp(12.0f), dp, AndroidUtilities.dp(30.0f) + dp2, AndroidUtilities.dp(30.0f) + dp);
    }
}
