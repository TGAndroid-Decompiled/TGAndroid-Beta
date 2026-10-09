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
import org.telegram.ui.Components.cd0;
import org.telegram.ui.pi1;
public final class b1 extends TextView {
    public final Paint f31861a;
    public final Paint[] f31862b;
    public final pi1 f31863c;

    public b1(pi1 pi1Var, Context context) {
        super(context);
        this.f31863c = pi1Var;
        Paint paint = new Paint();
        this.f31861a = paint;
        this.f31862b = new Paint[pi1Var.f31892e.length];
        cd0 cd0Var = pi1Var.R;
        cd0Var.setBounds(0, 0, 80, 80);
        cd0 cd0Var2 = pi1Var.S;
        cd0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.n nVar = pi1Var.P;
        nVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.n nVar2 = pi1Var.Q;
        nVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        cd0Var.setAlpha(255);
        cd0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) nVar.f7955b).drawColor(0, mode);
        ((Canvas) nVar2.f7955b).drawColor(0, mode);
        cd0Var.draw((Canvas) nVar.f7955b);
        cd0Var2.draw((Canvas) nVar2.f7955b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        pi1 pi1Var = this.f31863c;
        b1 b1Var = pi1Var.f31891c;
        pi1Var.P.z(-getX(), -getY(), pi1Var.getWidth() - getX(), pi1Var.getHeight() - getY());
        pi1Var.Q.z(-getX(), -getY(), pi1Var.getWidth() - getX(), pi1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = pi1Var.v;
        Paint[] paintArr = this.f31862b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - pi1Var.f31899y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[pi1Var.v]);
        float f7 = pi1Var.f31896s;
        if (f7 > 0.0f && (i10 = pi1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[pi1Var.v + 1]);
        }
        float f10 = pi1Var.f31899y;
        if (f10 < 1.0f) {
            Paint paint = this.f31861a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (pi1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((b1Var.getPaint().ascent() + b1Var.getPaint().descent()) / 2.0f)), b1Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        pi1 pi1Var = this.f31863c;
        com.google.firebase.messaging.n nVar = pi1Var.P;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f31862b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) nVar.f7954a;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) pi1Var.Q.f7954a;
                } else {
                    paintArr[i14] = (Paint) nVar.f7954a;
                }
                i14++;
            } else {
                return;
            }
        }
    }
}
