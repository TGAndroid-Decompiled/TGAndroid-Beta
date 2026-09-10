package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class ne1 extends org.telegram.ui.Cells.t1 {
    public final Path Fe;
    public final Paint Ge;
    public final int He;
    public final int Ie;
    public final int Je;
    public final pe1 Ke;

    public ne1(pe1 pe1Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, f6Var);
        this.Ke = pe1Var;
        this.He = i11;
        this.Ie = i12;
        this.Je = i13;
        this.Fe = new Path();
        this.Ge = new Paint(1);
    }

    @Override
    public final void Y1(Canvas canvas) {
        this.f20171i6 = 0;
        this.f20185j6 = this.Y5.size() - 1;
        super.Y1(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int O2 = O2(this.He);
        float H2 = H2(O2);
        float G2 = G2(O2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), H2, getPollButtonsRight(), G2);
        Path path = this.Fe;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.Ge;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.j6.l1(this.Ke.f35821x * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.clipPath(path);
        S1(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.Ie, this.Je);
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
