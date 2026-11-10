package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
public final class as0 extends org.telegram.ui.Cells.q1 {
    public final Path f43808ld;
    public final Paint f43809md;
    public final byte[] f43810nd;
    public final int f43811od;
    public final int f43812pd;
    public final cs0 f43813qd;

    public as0(cs0 cs0Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, byte[] bArr, int i10, int i11) {
        super(context, i7, false, null, h6Var);
        this.f43813qd = cs0Var;
        this.f43810nd = bArr;
        this.f43811od = i10;
        this.f43812pd = i11;
        this.f43808ld = new Path();
        this.f43809md = new Paint(1);
    }

    @Override
    public final void j1(Canvas canvas) {
        this.R4 = 0;
        this.S4 = this.P4.size() - 1;
        this.T4 = (-org.telegram.messenger.g0.L(7.0f)) * this.f43813qd.D;
        super.j1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        canvas.save();
        int V1 = V1(this.f43810nd);
        float U1 = U1(V1);
        float T1 = T1(V1);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPollButtonsLeft(), U1, getPollButtonsRight(), T1);
        float f11 = rectF.top;
        float L = org.telegram.messenger.g0.L(3.0f);
        cs0 cs0Var = this.f43813qd;
        if (cs0Var.V) {
            f10 = -org.telegram.messenger.g0.L(3.0f);
        } else {
            f10 = 0.0f;
        }
        rectF.top = org.telegram.messenger.g0.T1(L, f10, cs0Var.D) + f11;
        float f12 = rectF.bottom;
        boolean z9 = cs0Var.V;
        float L2 = org.telegram.messenger.g0.L(3.0f);
        if (!z9) {
            L2 = org.telegram.messenger.g0.T1(L2, 0.0f, cs0Var.D);
        }
        rectF.bottom = f12 + L2;
        Path path = this.f43808ld;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
        Paint paint = this.f43809md;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.m6.r1(cs0Var.D * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        canvas.clipPath(path);
        d1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(this.f43811od, this.f43812pd);
    }

    @Override
    public final void setPressed(boolean z9) {
    }
}
