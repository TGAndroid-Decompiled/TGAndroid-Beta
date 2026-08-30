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
import org.telegram.ui.Components.dc0;
import org.telegram.ui.th1;
public final class y0 extends TextView {
    public final Paint f30038a;
    public final Paint[] f30039b;
    public final th1 f30040c;

    public y0(th1 th1Var, Context context) {
        super(context);
        this.f30040c = th1Var;
        Paint paint = new Paint();
        this.f30038a = paint;
        this.f30039b = new Paint[th1Var.e.length];
        dc0 dc0Var = th1Var.O;
        dc0Var.setBounds(0, 0, 80, 80);
        dc0 dc0Var2 = th1Var.P;
        dc0Var2.setBounds(0, 0, 80, 80);
        a9.a aVar = th1Var.M;
        aVar.w(0.0f, 0.0f, 80.0f, 80.0f);
        a9.a aVar2 = th1Var.N;
        aVar2.w(0.0f, 0.0f, 80.0f, 80.0f);
        dc0Var.setAlpha(255);
        dc0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) aVar.f144b).drawColor(0, mode);
        ((Canvas) aVar2.f144b).drawColor(0, mode);
        dc0Var.draw((Canvas) aVar.f144b);
        dc0Var2.draw((Canvas) aVar2.f144b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        th1 th1Var = this.f30040c;
        y0 y0Var = th1Var.f29555c;
        th1Var.M.w(-getX(), -getY(), th1Var.getWidth() - getX(), th1Var.getHeight() - getY());
        th1Var.N.w(-getX(), -getY(), th1Var.getWidth() - getX(), th1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = th1Var.v;
        Paint[] paintArr = this.f30039b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - th1Var.f29562y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[th1Var.v]);
        float f10 = th1Var.f29559s;
        if (f10 > 0.0f && (i10 = th1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f10 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[th1Var.v + 1]);
        }
        float f11 = th1Var.f29562y;
        if (f11 < 1.0f) {
            Paint paint = this.f30038a;
            paint.setAlpha((int) ((1.0f - f11) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (th1Var.L) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((y0Var.getPaint().ascent() + y0Var.getPaint().descent()) / 2.0f)), y0Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        th1 th1Var = this.f30040c;
        a9.a aVar = th1Var.M;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f30039b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) aVar.f143a;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) th1Var.N.f143a;
                } else {
                    paintArr[i14] = (Paint) aVar.f143a;
                }
                i14++;
            } else {
                return;
            }
        }
    }
}
