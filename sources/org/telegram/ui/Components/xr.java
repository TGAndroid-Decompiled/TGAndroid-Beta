package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class xr extends View {

    public final ud.a f34684a;

    public final Paint f34685b;

    public final RectF f34686c;
    public final RectF d;

    public final RectF f34687e;

    public final lp f34688f;

    public xr(Context context) {
        super(context);
        this.f34684a = new ud.a(this, er.h, 380L);
        Paint paint = new Paint(1);
        this.f34685b = paint;
        this.f34686c = new RectF();
        this.d = new RectF();
        this.f34687e = new RectF();
        this.f34688f = new lp(this, 5);
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hl, false));
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f34688f, 3000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f34688f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10 = this.f34684a.f48497e;
        RectF rectF = this.d;
        RectF rectF2 = this.f34686c;
        RectF rectF3 = this.f34687e;
        AndroidUtilities.lerp(rectF, rectF2, f10, rectF3);
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), 0, f10);
        canvas.drawRoundRect(rectF3, fLerp, fLerp, this.f34685b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, 1073741824));
        this.f34686c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        int iDp = ((currentActionBarHeight / 2) + paddingTop) - AndroidUtilities.dp(15.0f);
        this.d.set(AndroidUtilities.dp(12.0f), iDp, AndroidUtilities.dp(30.0f) + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(30.0f) + iDp);
    }
}
