package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class gv0 extends org.telegram.ui.Cells.s1 {
    public final Path Be;
    public final Paint Ce;
    public final byte[] De;
    public final int Ee;
    public final int Fe;
    public final iv0 Ge;

    public gv0(iv0 iv0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, byte[] bArr, int i11, int i12) {
        super(context, i10, false, null, c6Var);
        this.Ge = iv0Var;
        this.De = bArr;
        this.Ee = i11;
        this.Fe = i12;
        this.Be = new Path();
        this.Ce = new Paint(1);
    }

    @Override
    public final void Y1(Canvas canvas) {
        this.f25327e6 = 0;
        this.f25343f6 = this.U5.size() - 1;
        this.f25357g6 = (-AndroidUtilities.dp(7.0f)) * this.Ge.f39354y;
        super.Y1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        canvas.save();
        int I2 = I2(this.De);
        float H2 = H2(I2);
        float G2 = G2(I2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), H2, getPollButtonsRight(), G2);
        float f10 = rectF.top;
        float dp = AndroidUtilities.dp(3.0f);
        iv0 iv0Var = this.Ge;
        if (iv0Var.R) {
            f9 = -AndroidUtilities.dp(3.0f);
        } else {
            f9 = 0.0f;
        }
        rectF.top = AndroidUtilities.lerp(dp, f9, iv0Var.f39354y) + f10;
        float f11 = rectF.bottom;
        boolean z10 = iv0Var.R;
        float dp2 = AndroidUtilities.dp(3.0f);
        if (!z10) {
            dp2 = AndroidUtilities.lerp(dp2, 0.0f, iv0Var.f39354y);
        }
        rectF.bottom = f11 + dp2;
        Path path = this.Be;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.Ce;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.g6.l1(iv0Var.f39354y * 0.2f, -16777216));
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
