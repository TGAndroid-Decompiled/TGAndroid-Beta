package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class id1 extends org.telegram.ui.Cells.s1 {
    public final Path He;
    public final Paint Ie;
    public final int Je;
    public final int Ke;
    public final int Le;
    public final kd1 Me;

    public id1(kd1 kd1Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, u6Var);
        this.Me = kd1Var;
        this.Je = i11;
        this.Ke = i12;
        this.Le = i13;
        this.He = new Path();
        this.Ie = new Paint(1);
    }

    @Override
    public final void Y1(Canvas canvas) {
        this.f25136i6 = 0;
        this.f25149j6 = this.Y5.size() - 1;
        super.Y1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int O2 = O2(this.Je);
        float H2 = H2(O2);
        float G2 = G2(O2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), H2, getPollButtonsRight(), G2);
        Path path = this.He;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.Ie;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.y6.o1(this.Me.f40751x * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.clipPath(path);
        S1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.Ke, this.Le);
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
