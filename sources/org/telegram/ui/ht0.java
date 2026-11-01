package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
public final class ht0 extends org.telegram.ui.Cells.q1 {
    public final Path f37861hd;
    public final Paint f37862id;
    public final byte[] f37863jd;
    public final int f37864kd;
    public final int f37865ld;
    public final jt0 f37866md;

    public ht0(jt0 jt0Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, byte[] bArr, int i11, int i12) {
        super(context, i10, false, null, p6Var);
        this.f37866md = jt0Var;
        this.f37863jd = bArr;
        this.f37864kd = i11;
        this.f37865ld = i12;
        this.f37861hd = new Path();
        this.f37862id = new Paint(1);
    }

    @Override
    public final void h1(Canvas canvas) {
        this.Q4 = 0;
        this.R4 = this.O4.size() - 1;
        this.S4 = (-org.telegram.messenger.i0.L(7.0f)) * this.f37866md.D;
        super.h1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        canvas.save();
        int T1 = T1(this.f37863jd);
        float S1 = S1(T1);
        float R1 = R1(T1);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(getPollButtonsLeft(), S1, getPollButtonsRight(), R1);
        float f10 = rectF.top;
        float L = org.telegram.messenger.i0.L(3.0f);
        jt0 jt0Var = this.f37866md;
        if (jt0Var.V) {
            f7 = -org.telegram.messenger.i0.L(3.0f);
        } else {
            f7 = 0.0f;
        }
        rectF.top = org.telegram.messenger.i0.T1(L, f7, jt0Var.D) + f10;
        float f11 = rectF.bottom;
        boolean z10 = jt0Var.V;
        float L2 = org.telegram.messenger.i0.L(3.0f);
        if (!z10) {
            L2 = org.telegram.messenger.i0.T1(L2, 0.0f, jt0Var.D);
        }
        rectF.bottom = f11 + L2;
        Path path = this.f37861hd;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), Path.Direction.CW);
        Paint paint = this.f37862id;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.i0.L(2.0f), 0.0f, org.telegram.messenger.i0.L(0.66f), org.telegram.ui.ActionBar.t6.r1(jt0Var.D * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint);
        canvas.clipPath(path);
        b1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.f37864kd, this.f37865ld);
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
