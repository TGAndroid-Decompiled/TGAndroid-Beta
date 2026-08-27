package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

public final class hv0 extends org.telegram.ui.Cells.s1 {
    public final Path Be;
    public final Paint Ce;
    public final byte[] De;
    public final int Ee;
    public final int Fe;
    public final jv0 Ge;

    public hv0(jv0 jv0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, byte[] bArr, int i11, int i12) {
        super(context, i10, false, null, c6Var);
        this.Ge = jv0Var;
        this.De = bArr;
        this.Ee = i11;
        this.Fe = i12;
        this.Be = new Path();
        this.Ce = new Paint(1);
    }

    @Override
    public final void X1(Canvas canvas) {
        this.f25316e6 = 0;
        this.f25331f6 = this.U5.size() - 1;
        this.f25345g6 = (-AndroidUtilities.dp(7.0f)) * this.Ge.f39526y;
        super.X1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int iH2 = H2(this.De);
        float fG2 = G2(iH2);
        float fF2 = F2(iH2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), fG2, getPollButtonsRight(), fF2);
        float f10 = rectF.top;
        float fDp = AndroidUtilities.dp(3.0f);
        jv0 jv0Var = this.Ge;
        rectF.top = AndroidUtilities.lerp(fDp, jv0Var.R ? -AndroidUtilities.dp(3.0f) : 0.0f, jv0Var.f39526y) + f10;
        float f11 = rectF.bottom;
        boolean z10 = jv0Var.R;
        float fDp2 = AndroidUtilities.dp(3.0f);
        if (!z10) {
            fDp2 = AndroidUtilities.lerp(fDp2, 0.0f, jv0Var.f39526y);
        }
        rectF.bottom = f11 + fDp2;
        Path path = this.Be;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.Ce;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.g6.l1(jv0Var.f39526y * 0.2f, -16777216));
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
