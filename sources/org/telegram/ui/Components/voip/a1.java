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
import org.telegram.ui.Components.lc0;
import org.telegram.ui.si1;
public final class a1 extends TextView {
    public final Paint f28047a;
    public final Paint[] f28048b;
    public final si1 f28049c;

    public a1(si1 si1Var, Context context) {
        super(context);
        this.f28049c = si1Var;
        Paint paint = new Paint();
        this.f28047a = paint;
        this.f28048b = new Paint[si1Var.e.length];
        lc0 lc0Var = si1Var.R;
        lc0Var.setBounds(0, 0, 80, 80);
        lc0 lc0Var2 = si1Var.S;
        lc0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.n nVar = si1Var.P;
        nVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.n nVar2 = si1Var.Q;
        nVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        lc0Var.setAlpha(255);
        lc0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) nVar.f6104b).drawColor(0, mode);
        ((Canvas) nVar2.f6104b).drawColor(0, mode);
        lc0Var.draw((Canvas) nVar.f6104b);
        lc0Var2.draw((Canvas) nVar2.f6104b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        si1 si1Var = this.f28049c;
        a1 a1Var = si1Var.f28068c;
        si1Var.P.z(-getX(), -getY(), si1Var.getWidth() - getX(), si1Var.getHeight() - getY());
        si1Var.Q.z(-getX(), -getY(), si1Var.getWidth() - getX(), si1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = si1Var.v;
        Paint[] paintArr = this.f28048b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - si1Var.f28075y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[si1Var.v]);
        float f7 = si1Var.f28072s;
        if (f7 > 0.0f && (i10 = si1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[si1Var.v + 1]);
        }
        float f10 = si1Var.f28075y;
        if (f10 < 1.0f) {
            Paint paint = this.f28047a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (si1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((a1Var.getPaint().ascent() + a1Var.getPaint().descent()) / 2.0f)), a1Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        si1 si1Var = this.f28049c;
        com.google.firebase.messaging.n nVar = si1Var.P;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f28048b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) nVar.f6103a;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) si1Var.Q.f6103a;
                } else {
                    paintArr[i14] = (Paint) nVar.f6103a;
                }
                i14++;
            } else {
                return;
            }
        }
    }
}
