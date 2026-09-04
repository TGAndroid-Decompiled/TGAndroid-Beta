package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class hs extends View {
    public final le.b f26828a;
    public final Paint f26829b;
    public final RectF f26830c;
    public final RectF d;
    public final RectF f26831e;
    public final wp f26832f;

    public hs(Context context) {
        super(context);
        this.f26828a = new le.b(this, pr.h, 380L);
        Paint paint = new Paint(1);
        this.f26829b = paint;
        this.f26830c = new RectF();
        this.d = new RectF();
        this.f26831e = new RectF();
        this.f26832f = new wp(this, 5);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hl, false));
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f26832f, 3000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f26832f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7 = this.f26828a.f15368e;
        RectF rectF = this.d;
        RectF rectF2 = this.f26830c;
        RectF rectF3 = this.f26831e;
        AndroidUtilities.lerp(rectF, rectF2, f7, rectF3);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), 0, f7);
        canvas.drawRoundRect(rectF3, lerp, lerp, this.f26829b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, 1073741824));
        this.f26830c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        int dp = ((currentActionBarHeight / 2) + paddingTop) - AndroidUtilities.dp(15.0f);
        int dp2 = AndroidUtilities.dp(12.0f);
        this.d.set(AndroidUtilities.dp(12.0f), dp, AndroidUtilities.dp(30.0f) + dp2, AndroidUtilities.dp(30.0f) + dp);
    }
}
