package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
public final class d81 extends org.telegram.ui.Cells.q1 {
    public final Path f44997kd;
    public final Paint f44998ld;
    public final int f44999md;
    public final int f45000nd;
    public final int f45001od;
    public final f81 f45002pd;

    public d81(f81 f81Var, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11, int i12) {
        super(context, i7, false, null, f6Var);
        this.f45002pd = f81Var;
        this.f44999md = i10;
        this.f45000nd = i11;
        this.f45001od = i12;
        this.f44997kd = new Path();
        this.f44998ld = new Paint(1);
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
        int b22 = b2(this.f44999md);
        float U1 = U1(b22);
        float T1 = T1(b22);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPollButtonsLeft(), U1, getPollButtonsRight(), T1);
        Path path = this.f44997kd;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
        Paint paint = this.f44998ld;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.k6.r1(this.f45002pd.f45566y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        canvas.clipPath(path);
        d1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(this.f45000nd, this.f45001od);
    }

    @Override
    public final void setPressed(boolean z9) {
    }
}
