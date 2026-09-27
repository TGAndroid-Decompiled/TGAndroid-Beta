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
import org.telegram.ui.Components.nc0;
import org.telegram.ui.di1;
public final class b1 extends TextView {
    public final Paint f29225a;
    public final Paint[] f29226b;
    public final di1 f29227c;

    public b1(di1 di1Var, Context context) {
        super(context);
        this.f29227c = di1Var;
        Paint paint = new Paint();
        this.f29225a = paint;
        this.f29226b = new Paint[di1Var.e.length];
        nc0 nc0Var = di1Var.R;
        nc0Var.setBounds(0, 0, 80, 80);
        nc0 nc0Var2 = di1Var.S;
        nc0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.n nVar = di1Var.P;
        nVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.n nVar2 = di1Var.Q;
        nVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        nc0Var.setAlpha(255);
        nc0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) nVar.f7321b).drawColor(0, mode);
        ((Canvas) nVar2.f7321b).drawColor(0, mode);
        nc0Var.draw((Canvas) nVar.f7321b);
        nc0Var2.draw((Canvas) nVar2.f7321b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        di1 di1Var = this.f29227c;
        b1 b1Var = di1Var.f29246c;
        di1Var.P.z(-getX(), -getY(), di1Var.getWidth() - getX(), di1Var.getHeight() - getY());
        di1Var.Q.z(-getX(), -getY(), di1Var.getWidth() - getX(), di1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = di1Var.v;
        Paint[] paintArr = this.f29226b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - di1Var.f29253y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[di1Var.v]);
        float f7 = di1Var.f29250s;
        if (f7 > 0.0f && (i10 = di1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[di1Var.v + 1]);
        }
        float f10 = di1Var.f29253y;
        if (f10 < 1.0f) {
            Paint paint = this.f29225a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (di1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((b1Var.getPaint().ascent() + b1Var.getPaint().descent()) / 2.0f)), b1Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        di1 di1Var = this.f29227c;
        com.google.firebase.messaging.n nVar = di1Var.P;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f29226b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) nVar.f7320a;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) di1Var.Q.f7320a;
                } else {
                    paintArr[i14] = (Paint) nVar.f7320a;
                }
                i14++;
            } else {
                return;
            }
        }
    }
}
