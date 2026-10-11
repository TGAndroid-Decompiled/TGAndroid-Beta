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
import org.telegram.ui.ni1;
public final class c1 extends TextView {
    public final Paint f31985a;
    public final Paint[] f31986b;
    public final ni1 f31987c;

    public c1(ni1 ni1Var, Context context) {
        super(context);
        this.f31987c = ni1Var;
        Paint paint = new Paint();
        this.f31985a = paint;
        this.f31986b = new Paint[ni1Var.f32025e.length];
        cd0 cd0Var = ni1Var.R;
        cd0Var.setBounds(0, 0, 80, 80);
        cd0 cd0Var2 = ni1Var.S;
        cd0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.n nVar = ni1Var.P;
        nVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.n nVar2 = ni1Var.Q;
        nVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        cd0Var.setAlpha(255);
        cd0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) nVar.f7954b).drawColor(0, mode);
        ((Canvas) nVar2.f7954b).drawColor(0, mode);
        cd0Var.draw((Canvas) nVar.f7954b);
        cd0Var2.draw((Canvas) nVar2.f7954b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        ni1 ni1Var = this.f31987c;
        c1 c1Var = ni1Var.f32024c;
        ni1Var.P.z(-getX(), -getY(), ni1Var.getWidth() - getX(), ni1Var.getHeight() - getY());
        ni1Var.Q.z(-getX(), -getY(), ni1Var.getWidth() - getX(), ni1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = ni1Var.v;
        Paint[] paintArr = this.f31986b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - ni1Var.f32032y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[ni1Var.v]);
        float f7 = ni1Var.f32029s;
        if (f7 > 0.0f && (i10 = ni1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[ni1Var.v + 1]);
        }
        float f10 = ni1Var.f32032y;
        if (f10 < 1.0f) {
            Paint paint = this.f31985a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (ni1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((c1Var.getPaint().ascent() + c1Var.getPaint().descent()) / 2.0f)), c1Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        ni1 ni1Var = this.f31987c;
        com.google.firebase.messaging.n nVar = ni1Var.P;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f31986b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) nVar.f7953a;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) ni1Var.Q.f7953a;
                } else {
                    paintArr[i14] = (Paint) nVar.f7953a;
                }
                i14++;
            } else {
                return;
            }
        }
    }
}
