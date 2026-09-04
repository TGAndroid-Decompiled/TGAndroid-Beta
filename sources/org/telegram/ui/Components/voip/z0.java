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
import org.telegram.ui.ni1;
public final class z0 extends TextView {
    public final Paint f31951a;
    public final Paint[] f31952b;
    public final ni1 f31953c;

    public z0(ni1 ni1Var, Context context) {
        super(context);
        this.f31953c = ni1Var;
        Paint paint = new Paint();
        this.f31951a = paint;
        this.f31952b = new Paint[ni1Var.f31417e.length];
        dc0 dc0Var = ni1Var.R;
        dc0Var.setBounds(0, 0, 80, 80);
        dc0 dc0Var2 = ni1Var.S;
        dc0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.n nVar = ni1Var.P;
        nVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.n nVar2 = ni1Var.Q;
        nVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        dc0Var.setAlpha(255);
        dc0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) nVar.f6375b).drawColor(0, mode);
        ((Canvas) nVar2.f6375b).drawColor(0, mode);
        dc0Var.draw((Canvas) nVar.f6375b);
        dc0Var2.draw((Canvas) nVar2.f6375b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        ni1 ni1Var = this.f31953c;
        z0 z0Var = ni1Var.f31416c;
        ni1Var.P.z(-getX(), -getY(), ni1Var.getWidth() - getX(), ni1Var.getHeight() - getY());
        ni1Var.Q.z(-getX(), -getY(), ni1Var.getWidth() - getX(), ni1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = ni1Var.v;
        Paint[] paintArr = this.f31952b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - ni1Var.f31424y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[ni1Var.v]);
        float f7 = ni1Var.f31421s;
        if (f7 > 0.0f && (i10 = ni1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[ni1Var.v + 1]);
        }
        float f10 = ni1Var.f31424y;
        if (f10 < 1.0f) {
            Paint paint = this.f31951a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (ni1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((z0Var.getPaint().ascent() + z0Var.getPaint().descent()) / 2.0f)), z0Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        ni1 ni1Var = this.f31953c;
        com.google.firebase.messaging.n nVar = ni1Var.P;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f31952b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) nVar.f6374a;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) ni1Var.Q.f6374a;
                } else {
                    paintArr[i14] = (Paint) nVar.f6374a;
                }
                i14++;
            } else {
                return;
            }
        }
    }
}
