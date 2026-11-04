package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
public final class nr0 extends org.telegram.ui.Cells.q1 {
    public final Path f48116kd;
    public final Paint f48117ld;
    public final byte[] f48118md;
    public final int f48119nd;
    public final int f48120od;
    public final pr0 f48121pd;

    public nr0(pr0 pr0Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var, byte[] bArr, int i10, int i11) {
        super(context, i3, false, null, e6Var);
        this.f48121pd = pr0Var;
        this.f48118md = bArr;
        this.f48119nd = i10;
        this.f48120od = i11;
        this.f48116kd = new Path();
        this.f48117ld = new Paint(1);
    }

    @Override
    public final void j1(Canvas canvas) {
        this.R4 = 0;
        this.S4 = this.P4.size() - 1;
        this.T4 = (-org.telegram.messenger.g0.L(7.0f)) * this.f48121pd.E;
        super.j1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        canvas.save();
        int V1 = V1(this.f48118md);
        float U1 = U1(V1);
        float T1 = T1(V1);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPollButtonsLeft(), U1, getPollButtonsRight(), T1);
        float f11 = rectF.top;
        float L = org.telegram.messenger.g0.L(3.0f);
        pr0 pr0Var = this.f48121pd;
        if (pr0Var.W) {
            f10 = -org.telegram.messenger.g0.L(3.0f);
        } else {
            f10 = 0.0f;
        }
        rectF.top = org.telegram.messenger.g0.T1(L, f10, pr0Var.E) + f11;
        float f12 = rectF.bottom;
        boolean z10 = pr0Var.W;
        float L2 = org.telegram.messenger.g0.L(3.0f);
        if (!z10) {
            L2 = org.telegram.messenger.g0.T1(L2, 0.0f, pr0Var.E);
        }
        rectF.bottom = f12 + L2;
        Path path = this.f48116kd;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
        Paint paint = this.f48117ld;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.k6.r1(pr0Var.E * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        canvas.clipPath(path);
        d1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(this.f48119nd, this.f48120od);
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
