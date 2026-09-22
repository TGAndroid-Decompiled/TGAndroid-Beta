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
import org.telegram.ui.Components.cc0;
import org.telegram.ui.ni1;
public final class b1 extends TextView {
    public final Paint f28876a;
    public final Paint[] f28877b;
    public final ni1 f28878c;

    public b1(ni1 ni1Var, Context context) {
        super(context);
        this.f28878c = ni1Var;
        Paint paint = new Paint();
        this.f28876a = paint;
        this.f28877b = new Paint[ni1Var.e.length];
        cc0 cc0Var = ni1Var.R;
        cc0Var.setBounds(0, 0, 80, 80);
        cc0 cc0Var2 = ni1Var.S;
        cc0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.n nVar = ni1Var.P;
        nVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.n nVar2 = ni1Var.Q;
        nVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        cc0Var.setAlpha(255);
        cc0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) nVar.f7334b).drawColor(0, mode);
        ((Canvas) nVar2.f7334b).drawColor(0, mode);
        cc0Var.draw((Canvas) nVar.f7334b);
        cc0Var2.draw((Canvas) nVar2.f7334b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        ni1 ni1Var = this.f28878c;
        b1 b1Var = ni1Var.f28904c;
        ni1Var.P.z(-getX(), -getY(), ni1Var.getWidth() - getX(), ni1Var.getHeight() - getY());
        ni1Var.Q.z(-getX(), -getY(), ni1Var.getWidth() - getX(), ni1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = ni1Var.v;
        Paint[] paintArr = this.f28877b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - ni1Var.f28911y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[ni1Var.v]);
        float f7 = ni1Var.f28908s;
        if (f7 > 0.0f && (i10 = ni1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[ni1Var.v + 1]);
        }
        float f10 = ni1Var.f28911y;
        if (f10 < 1.0f) {
            Paint paint = this.f28876a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (ni1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((b1Var.getPaint().ascent() + b1Var.getPaint().descent()) / 2.0f)), b1Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        ni1 ni1Var = this.f28878c;
        com.google.firebase.messaging.n nVar = ni1Var.P;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f28877b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) nVar.f7333a;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) ni1Var.Q.f7333a;
                } else {
                    paintArr[i14] = (Paint) nVar.f7333a;
                }
                i14++;
            } else {
                return;
            }
        }
    }
}
