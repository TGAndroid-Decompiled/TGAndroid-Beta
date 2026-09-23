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
import org.telegram.ui.Components.bc0;
import org.telegram.ui.fi1;
public final class b1 extends TextView {
    public final Paint f28850a;
    public final Paint[] f28851b;
    public final fi1 f28852c;

    public b1(fi1 fi1Var, Context context) {
        super(context);
        this.f28852c = fi1Var;
        Paint paint = new Paint();
        this.f28850a = paint;
        this.f28851b = new Paint[fi1Var.e.length];
        bc0 bc0Var = fi1Var.R;
        bc0Var.setBounds(0, 0, 80, 80);
        bc0 bc0Var2 = fi1Var.S;
        bc0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.n nVar = fi1Var.P;
        nVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.n nVar2 = fi1Var.Q;
        nVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        bc0Var.setAlpha(255);
        bc0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) nVar.f7320b).drawColor(0, mode);
        ((Canvas) nVar2.f7320b).drawColor(0, mode);
        bc0Var.draw((Canvas) nVar.f7320b);
        bc0Var2.draw((Canvas) nVar2.f7320b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        fi1 fi1Var = this.f28852c;
        b1 b1Var = fi1Var.f28878c;
        fi1Var.P.z(-getX(), -getY(), fi1Var.getWidth() - getX(), fi1Var.getHeight() - getY());
        fi1Var.Q.z(-getX(), -getY(), fi1Var.getWidth() - getX(), fi1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = fi1Var.v;
        Paint[] paintArr = this.f28851b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - fi1Var.f28885y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[fi1Var.v]);
        float f7 = fi1Var.f28882s;
        if (f7 > 0.0f && (i10 = fi1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[fi1Var.v + 1]);
        }
        float f10 = fi1Var.f28885y;
        if (f10 < 1.0f) {
            Paint paint = this.f28850a;
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
        fi1 fi1Var = this.f28852c;
        com.google.firebase.messaging.n nVar = fi1Var.P;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f28851b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) nVar.f7319a;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) fi1Var.Q.f7319a;
                } else {
                    paintArr[i14] = (Paint) nVar.f7319a;
                }
                i14++;
            } else {
                return;
            }
        }
    }
}
