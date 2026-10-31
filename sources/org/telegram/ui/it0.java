package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
public final class it0 extends org.telegram.ui.Cells.q1 {
    public final Path f38343hd;
    public final Paint f38344id;
    public final byte[] f38345jd;
    public final int f38346kd;
    public final int f38347ld;
    public final kt0 f38348md;

    public it0(kt0 kt0Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, byte[] bArr, int i11, int i12) {
        super(context, i10, false, null, p6Var);
        this.f38348md = kt0Var;
        this.f38345jd = bArr;
        this.f38346kd = i11;
        this.f38347ld = i12;
        this.f38343hd = new Path();
        this.f38344id = new Paint(1);
    }

    @Override
    public final void h1(Canvas canvas) {
        this.Q4 = 0;
        this.R4 = this.O4.size() - 1;
        this.S4 = (-org.telegram.messenger.i0.L(7.0f)) * this.f38348md.D;
        super.h1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        canvas.save();
        int T1 = T1(this.f38345jd);
        float S1 = S1(T1);
        float R1 = R1(T1);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(getPollButtonsLeft(), S1, getPollButtonsRight(), R1);
        float f10 = rectF.top;
        float L = org.telegram.messenger.i0.L(3.0f);
        kt0 kt0Var = this.f38348md;
        if (kt0Var.V) {
            f7 = -org.telegram.messenger.i0.L(3.0f);
        } else {
            f7 = 0.0f;
        }
        rectF.top = org.telegram.messenger.i0.T1(L, f7, kt0Var.D) + f10;
        float f11 = rectF.bottom;
        boolean z10 = kt0Var.V;
        float L2 = org.telegram.messenger.i0.L(3.0f);
        if (!z10) {
            L2 = org.telegram.messenger.i0.T1(L2, 0.0f, kt0Var.D);
        }
        rectF.bottom = f11 + L2;
        Path path = this.f38343hd;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), Path.Direction.CW);
        Paint paint = this.f38344id;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.i0.L(2.0f), 0.0f, org.telegram.messenger.i0.L(0.66f), org.telegram.ui.ActionBar.t6.r1(kt0Var.D * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint);
        canvas.clipPath(path);
        b1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.f38346kd, this.f38347ld);
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
