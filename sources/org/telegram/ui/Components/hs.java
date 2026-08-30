package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class hs extends View {
    public final xd.a f25481a;
    public final Paint f25482b;
    public final RectF f25483c;
    public final RectF d;
    public final RectF e;
    public final vp f25484f;

    public hs(Context context) {
        super(context);
        this.f25481a = new xd.a(this, nr.h, 380L);
        Paint paint = new Paint(1);
        this.f25482b = paint;
        this.f25483c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f25484f = new vp(this, 5);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hl, false));
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f25484f, 3000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f25484f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10 = this.f25481a.e;
        RectF rectF = this.d;
        RectF rectF2 = this.f25483c;
        RectF rectF3 = this.e;
        AndroidUtilities.lerp(rectF, rectF2, f10, rectF3);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), 0, f10);
        canvas.drawRoundRect(rectF3, lerp, lerp, this.f25482b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, 1073741824));
        this.f25483c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        int dp = ((currentActionBarHeight / 2) + paddingTop) - AndroidUtilities.dp(15.0f);
        int dp2 = AndroidUtilities.dp(12.0f);
        this.d.set(AndroidUtilities.dp(12.0f), dp, AndroidUtilities.dp(30.0f) + dp2, AndroidUtilities.dp(30.0f) + dp);
    }
}
