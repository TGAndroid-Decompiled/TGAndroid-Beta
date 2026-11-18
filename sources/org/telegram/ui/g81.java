package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
public final class g81 extends org.telegram.ui.Cells.q1 {
    public final Paint Ad;
    public final int Bd;
    public final int Cd;
    public final int Dd;
    public final i81 Ed;
    public final Path f48002zd;

    public g81(i81 i81Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, int i10, int i11, int i12) {
        super(context, i7, false, null, i6Var);
        this.Ed = i81Var;
        this.Bd = i10;
        this.Cd = i11;
        this.Dd = i12;
        this.f48002zd = new Path();
        this.Ad = new Paint(1);
    }

    @Override
    public final void j1(Canvas canvas) {
        this.S4 = 0;
        this.T4 = this.Q4.size() - 1;
        super.j1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int c22 = c2(this.Bd);
        float V1 = V1(c22);
        float U1 = U1(c22);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPollButtonsLeft(), V1, getPollButtonsRight(), U1);
        Path path = this.f48002zd;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
        Paint paint = this.Ad;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.n6.r1(this.Ed.f48653y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        canvas.clipPath(path);
        d1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(this.Cd, this.Dd);
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
