package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zr extends View {
    public final td.a f35360a;
    public final Paint f35361b;
    public final RectF f35362c;
    public final RectF d;
    public final RectF f35363e;
    public final np f35364f;

    public zr(Context context) {
        super(context);
        this.f35360a = new td.a(this, gr.h, 380L);
        Paint paint = new Paint(1);
        this.f35361b = paint;
        this.f35362c = new RectF();
        this.d = new RectF();
        this.f35363e = new RectF();
        this.f35364f = new np(this, 5);
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hl, false));
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f35364f, 3000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f35364f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10 = this.f35360a.f47775e;
        RectF rectF = this.d;
        RectF rectF2 = this.f35362c;
        RectF rectF3 = this.f35363e;
        AndroidUtilities.lerp(rectF, rectF2, f10, rectF3);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), 0, f10);
        canvas.drawRoundRect(rectF3, lerp, lerp, this.f35361b);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, 1073741824));
        this.f35362c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        int dp = ((currentActionBarHeight / 2) + paddingTop) - AndroidUtilities.dp(15.0f);
        int dp2 = AndroidUtilities.dp(12.0f);
        this.d.set(AndroidUtilities.dp(12.0f), dp, AndroidUtilities.dp(30.0f) + dp2, AndroidUtilities.dp(30.0f) + dp);
    }
}
