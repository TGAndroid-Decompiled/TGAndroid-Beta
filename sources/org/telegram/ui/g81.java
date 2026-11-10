package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
public final class g81 extends org.telegram.ui.Cells.q1 {
    public final Path f46042ld;
    public final Paint f46043md;
    public final int f46044nd;
    public final int f46045od;
    public final int f46046pd;
    public final i81 f46047qd;

    public g81(i81 i81Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10, int i11, int i12) {
        super(context, i7, false, null, h6Var);
        this.f46047qd = i81Var;
        this.f46044nd = i10;
        this.f46045od = i11;
        this.f46046pd = i12;
        this.f46042ld = new Path();
        this.f46043md = new Paint(1);
    }

    @Override
    public final void j1(Canvas canvas) {
        this.R4 = 0;
        this.S4 = this.P4.size() - 1;
        super.j1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int b22 = b2(this.f46044nd);
        float U1 = U1(b22);
        float T1 = T1(b22);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPollButtonsLeft(), U1, getPollButtonsRight(), T1);
        Path path = this.f46042ld;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
        Paint paint = this.f46043md;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.m6.r1(this.f46047qd.f46573y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        canvas.clipPath(path);
        d1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(this.f46045od, this.f46046pd);
    }

    @Override
    public final void setPressed(boolean z9) {
    }
}
