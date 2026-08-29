package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ds extends View {
    public final vd.a f27864a;
    public final Paint f27865b;
    public final RectF f27866c;
    public final RectF d;
    public final RectF f27867e;
    public final rp f27868f;

    public ds(Context context) {
        super(context);
        this.f27864a = new vd.a(this, jr.h, 380L);
        Paint paint = new Paint(1);
        this.f27865b = paint;
        this.f27866c = new RectF();
        this.d = new RectF();
        this.f27867e = new RectF();
        this.f27868f = new rp(this, 5);
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hl, false));
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f27868f, 3000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f27868f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9 = this.f27864a.f49505e;
        RectF rectF = this.d;
        RectF rectF2 = this.f27866c;
        RectF rectF3 = this.f27867e;
        AndroidUtilities.lerp(rectF, rectF2, f9, rectF3);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), 0, f9);
        canvas.drawRoundRect(rectF3, lerp, lerp, this.f27865b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, 1073741824));
        this.f27866c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        int dp = ((currentActionBarHeight / 2) + paddingTop) - AndroidUtilities.dp(15.0f);
        int dp2 = AndroidUtilities.dp(12.0f);
        this.d.set(AndroidUtilities.dp(12.0f), dp, AndroidUtilities.dp(30.0f) + dp2, AndroidUtilities.dp(30.0f) + dp);
    }
}
