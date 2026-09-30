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
import org.telegram.ui.Components.pc0;
import org.telegram.ui.fi1;
public final class b1 extends TextView {
    public final Paint f29200a;
    public final Paint[] f29201b;
    public final fi1 f29202c;

    public b1(fi1 fi1Var, Context context) {
        super(context);
        this.f29202c = fi1Var;
        Paint paint = new Paint();
        this.f29200a = paint;
        this.f29201b = new Paint[fi1Var.e.length];
        pc0 pc0Var = fi1Var.R;
        pc0Var.setBounds(0, 0, 80, 80);
        pc0 pc0Var2 = fi1Var.S;
        pc0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.n nVar = fi1Var.P;
        nVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.n nVar2 = fi1Var.Q;
        nVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        pc0Var.setAlpha(255);
        pc0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) nVar.f7325b).drawColor(0, mode);
        ((Canvas) nVar2.f7325b).drawColor(0, mode);
        pc0Var.draw((Canvas) nVar.f7325b);
        pc0Var2.draw((Canvas) nVar2.f7325b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        fi1 fi1Var = this.f29202c;
        b1 b1Var = fi1Var.f29221c;
        fi1Var.P.z(-getX(), -getY(), fi1Var.getWidth() - getX(), fi1Var.getHeight() - getY());
        fi1Var.Q.z(-getX(), -getY(), fi1Var.getWidth() - getX(), fi1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = fi1Var.v;
        Paint[] paintArr = this.f29201b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - fi1Var.f29228y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[fi1Var.v]);
        float f7 = fi1Var.f29225s;
        if (f7 > 0.0f && (i10 = fi1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[fi1Var.v + 1]);
        }
        float f10 = fi1Var.f29228y;
        if (f10 < 1.0f) {
            Paint paint = this.f29200a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (fi1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((b1Var.getPaint().ascent() + b1Var.getPaint().descent()) / 2.0f)), b1Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        fi1 fi1Var = this.f29202c;
        com.google.firebase.messaging.n nVar = fi1Var.P;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f29201b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) nVar.f7324a;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) fi1Var.Q.f7324a;
                } else {
                    paintArr[i14] = (Paint) nVar.f7324a;
                }
                i14++;
            } else {
                return;
            }
        }
    }
}
