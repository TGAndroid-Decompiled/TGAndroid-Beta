package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

public final class bd1 extends org.telegram.ui.Cells.s1 {
    public final Path Be;
    public final Paint Ce;
    public final int De;
    public final int Ee;
    public final int Fe;
    public final dd1 Ge;

    public bd1(dd1 dd1Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, c6Var);
        this.Ge = dd1Var;
        this.De = i11;
        this.Ee = i12;
        this.Fe = i13;
        this.Be = new Path();
        this.Ce = new Paint(1);
    }

    @Override
    public final void X1(Canvas canvas) {
        this.f25316e6 = 0;
        this.f25331f6 = this.U5.size() - 1;
        super.X1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int iN2 = N2(this.De);
        float fG2 = G2(iN2);
        float fF2 = F2(iN2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), fG2, getPollButtonsRight(), fF2);
        Path path = this.Be;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.Ce;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.g6.l1(this.Ge.f37373x * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.clipPath(path);
        R1(canvas);
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
