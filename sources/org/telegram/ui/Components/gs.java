package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gs extends View {
    public final xd.a f25229a;
    public final Paint f25230b;
    public final RectF f25231c;
    public final RectF d;
    public final RectF e;
    public final up f25232f;

    public gs(Context context) {
        super(context);
        this.f25229a = new xd.a(this, mr.h, 380L);
        Paint paint = new Paint(1);
        this.f25230b = paint;
        this.f25231c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f25232f = new up(this, 5);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hl, false));
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f25232f, 3000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f25232f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10 = this.f25229a.e;
        RectF rectF = this.d;
        RectF rectF2 = this.f25231c;
        RectF rectF3 = this.e;
        AndroidUtilities.lerp(rectF, rectF2, f10, rectF3);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), 0, f10);
        canvas.drawRoundRect(rectF3, lerp, lerp, this.f25230b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, 1073741824));
        this.f25231c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        int dp = ((currentActionBarHeight / 2) + paddingTop) - AndroidUtilities.dp(15.0f);
        int dp2 = AndroidUtilities.dp(12.0f);
        this.d.set(AndroidUtilities.dp(12.0f), dp, AndroidUtilities.dp(30.0f) + dp2, AndroidUtilities.dp(30.0f) + dp);
    }
}
