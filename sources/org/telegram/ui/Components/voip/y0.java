package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.bi1;
public final class y0 extends TextView {
    public final Paint f30010a;
    public final Paint[] f30011b;
    public final bi1 f30012c;

    public y0(bi1 bi1Var, Context context) {
        super(context);
        this.f30012c = bi1Var;
        Paint paint = new Paint();
        this.f30010a = paint;
        this.f30011b = new Paint[bi1Var.e.length];
        ec0 ec0Var = bi1Var.O;
        ec0Var.setBounds(0, 0, 80, 80);
        ec0 ec0Var2 = bi1Var.P;
        ec0Var2.setBounds(0, 0, 80, 80);
        a9.a aVar = bi1Var.M;
        aVar.w(0.0f, 0.0f, 80.0f, 80.0f);
        a9.a aVar2 = bi1Var.N;
        aVar2.w(0.0f, 0.0f, 80.0f, 80.0f);
        ec0Var.setAlpha(255);
        ec0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) aVar.f143b).drawColor(0, mode);
        ((Canvas) aVar2.f143b).drawColor(0, mode);
        ec0Var.draw((Canvas) aVar.f143b);
        ec0Var2.draw((Canvas) aVar2.f143b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        bi1 bi1Var = this.f30012c;
        y0 y0Var = bi1Var.f29527c;
        bi1Var.M.w(-getX(), -getY(), bi1Var.getWidth() - getX(), bi1Var.getHeight() - getY());
        bi1Var.N.w(-getX(), -getY(), bi1Var.getWidth() - getX(), bi1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = bi1Var.v;
        Paint[] paintArr = this.f30011b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - bi1Var.f29534y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[bi1Var.v]);
        float f10 = bi1Var.f29531s;
        if (f10 > 0.0f && (i10 = bi1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f10 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[bi1Var.v + 1]);
        }
        float f11 = bi1Var.f29534y;
        if (f11 < 1.0f) {
            Paint paint = this.f30010a;
            paint.setAlpha((int) ((1.0f - f11) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (bi1Var.L) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((y0Var.getPaint().ascent() + y0Var.getPaint().descent()) / 2.0f)), y0Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        bi1 bi1Var = this.f30012c;
        a9.a aVar = bi1Var.M;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f30011b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) aVar.f142a;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) bi1Var.N.f142a;
                } else {
                    paintArr[i14] = (Paint) aVar.f142a;
                }
                i14++;
            } else {
                return;
            }
        }
    }
}
