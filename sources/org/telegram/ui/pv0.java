package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class pv0 extends org.telegram.ui.Cells.t1 {
    public final Path Ce;
    public final Paint De;
    public final byte[] Ee;
    public final int Fe;
    public final int Ge;
    public final rv0 He;

    public pv0(rv0 rv0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, byte[] bArr, int i11, int i12) {
        super(context, i10, false, null, f6Var);
        this.He = rv0Var;
        this.Ee = bArr;
        this.Fe = i11;
        this.Ge = i12;
        this.Ce = new Path();
        this.De = new Paint(1);
    }

    @Override
    public final void Y1(Canvas canvas) {
        this.f22046f6 = 0;
        this.f22060g6 = this.V5.size() - 1;
        this.f22075h6 = (-AndroidUtilities.dp(7.0f)) * this.He.f38130y;
        super.Y1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        canvas.save();
        int I2 = I2(this.Ee);
        float H2 = H2(I2);
        float G2 = G2(I2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), H2, getPollButtonsRight(), G2);
        float f11 = rectF.top;
        float dp = AndroidUtilities.dp(3.0f);
        rv0 rv0Var = this.He;
        if (rv0Var.S) {
            f10 = -AndroidUtilities.dp(3.0f);
        } else {
            f10 = 0.0f;
        }
        rectF.top = AndroidUtilities.lerp(dp, f10, rv0Var.f38130y) + f11;
        float f12 = rectF.bottom;
        boolean z4 = rv0Var.S;
        float dp2 = AndroidUtilities.dp(3.0f);
        if (!z4) {
            dp2 = AndroidUtilities.lerp(dp2, 0.0f, rv0Var.f38130y);
        }
        rectF.bottom = f12 + dp2;
        Path path = this.Ce;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.De;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.j6.l1(rv0Var.f38130y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.clipPath(path);
        S1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.Fe, this.Ge);
    }

    @Override
    public final void setPressed(boolean z4) {
    }
}
