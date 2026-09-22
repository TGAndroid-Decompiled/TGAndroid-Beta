package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class je1 extends org.telegram.ui.Cells.t1 {
    public final Path Ge;
    public final Paint He;
    public final int Ie;
    public final int Je;
    public final int Ke;
    public final le1 Le;

    public je1(le1 le1Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, e6Var);
        this.Le = le1Var;
        this.Ie = i11;
        this.Je = i12;
        this.Ke = i13;
        this.Ge = new Path();
        this.He = new Paint(1);
    }

    @Override
    public final void Y1(Canvas canvas) {
        this.f21073i6 = 0;
        this.f21087j6 = this.Y5.size() - 1;
        super.Y1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int O2 = O2(this.Ie);
        float H2 = H2(O2);
        float G2 = G2(O2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), H2, getPollButtonsRight(), G2);
        Path path = this.Ge;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.He;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.i6.l1(this.Le.f35461x * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.clipPath(path);
        S1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.Je, this.Ke);
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
