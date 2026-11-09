package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
public final class f81 extends org.telegram.ui.Cells.q1 {
    public final Path f45658ld;
    public final Paint f45659md;
    public final int f45660nd;
    public final int f45661od;
    public final int f45662pd;
    public final h81 f45663qd;

    public f81(h81 h81Var, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var, int i10, int i11, int i12) {
        super(context, i7, false, null, g6Var);
        this.f45663qd = h81Var;
        this.f45660nd = i10;
        this.f45661od = i11;
        this.f45662pd = i12;
        this.f45658ld = new Path();
        this.f45659md = new Paint(1);
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
        int b22 = b2(this.f45660nd);
        float U1 = U1(b22);
        float T1 = T1(b22);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPollButtonsLeft(), U1, getPollButtonsRight(), T1);
        Path path = this.f45658ld;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
        Paint paint = this.f45659md;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.l6.r1(this.f45663qd.f46260y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        canvas.clipPath(path);
        d1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(this.f45661od, this.f45662pd);
    }

    @Override
    public final void setPressed(boolean z9) {
    }
}
