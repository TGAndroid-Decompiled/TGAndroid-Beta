package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class gv0 extends org.telegram.ui.Cells.t1 {
    public final Path Be;
    public final Paint Ce;
    public final byte[] De;
    public final int Ee;
    public final int Fe;
    public final iv0 Ge;

    public gv0(iv0 iv0Var, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, byte[] bArr, int i10, int i11) {
        super(context, i9, false, null, b6Var);
        this.Ge = iv0Var;
        this.De = bArr;
        this.Ee = i10;
        this.Fe = i11;
        this.Be = new Path();
        this.Ce = new Paint(1);
    }

    @Override
    public final void Y1(Canvas canvas) {
        this.f25363e6 = 0;
        this.f25378f6 = this.U5.size() - 1;
        this.f25392g6 = (-AndroidUtilities.dp(7.0f)) * this.Ge.f39308y;
        super.Y1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        canvas.save();
        int I2 = I2(this.De);
        float H2 = H2(I2);
        float G2 = G2(I2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), H2, getPollButtonsRight(), G2);
        float f11 = rectF.top;
        float dp = AndroidUtilities.dp(3.0f);
        iv0 iv0Var = this.Ge;
        if (iv0Var.R) {
            f10 = -AndroidUtilities.dp(3.0f);
        } else {
            f10 = 0.0f;
        }
        rectF.top = AndroidUtilities.lerp(dp, f10, iv0Var.f39308y) + f11;
        float f12 = rectF.bottom;
        boolean z10 = iv0Var.R;
        float dp2 = AndroidUtilities.dp(3.0f);
        if (!z10) {
            dp2 = AndroidUtilities.lerp(dp2, 0.0f, iv0Var.f39308y);
        }
        rectF.bottom = f12 + dp2;
        Path path = this.Be;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.Ce;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.f6.l1(iv0Var.f39308y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.clipPath(path);
        S1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(this.Ee, this.Fe);
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
