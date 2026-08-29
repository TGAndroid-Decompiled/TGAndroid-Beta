package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class dd1 extends org.telegram.ui.Cells.s1 {
    public final Path Be;
    public final Paint Ce;
    public final int De;
    public final int Ee;
    public final int Fe;
    public final fd1 Ge;

    public dd1(fd1 fd1Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, c6Var);
        this.Ge = fd1Var;
        this.De = i11;
        this.Ee = i12;
        this.Fe = i13;
        this.Be = new Path();
        this.Ce = new Paint(1);
    }

    @Override
    public final void Y1(Canvas canvas) {
        this.f25327e6 = 0;
        this.f25343f6 = this.U5.size() - 1;
        super.Y1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int O2 = O2(this.De);
        float H2 = H2(O2);
        float G2 = G2(O2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), H2, getPollButtonsRight(), G2);
        Path path = this.Be;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.Ce;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.g6.l1(this.Ge.f38118x * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.clipPath(path);
        S1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.Ee, this.Fe);
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
