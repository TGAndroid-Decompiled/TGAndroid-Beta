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
import org.telegram.ui.Components.gd0;
import org.telegram.ui.qi1;
public final class c1 extends TextView {
    public final Paint f31622a;
    public final Paint[] f31623b;
    public final qi1 f31624c;

    public c1(qi1 qi1Var, Context context) {
        super(context);
        this.f31624c = qi1Var;
        Paint paint = new Paint();
        this.f31622a = paint;
        this.f31623b = new Paint[qi1Var.f31662e.length];
        gd0 gd0Var = qi1Var.R;
        gd0Var.setBounds(0, 0, 80, 80);
        gd0 gd0Var2 = qi1Var.S;
        gd0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.n nVar = qi1Var.P;
        nVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.n nVar2 = qi1Var.Q;
        nVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        gd0Var.setAlpha(255);
        gd0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) nVar.f7951b).drawColor(0, mode);
        ((Canvas) nVar2.f7951b).drawColor(0, mode);
        gd0Var.draw((Canvas) nVar.f7951b);
        gd0Var2.draw((Canvas) nVar2.f7951b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        qi1 qi1Var = this.f31624c;
        c1 c1Var = qi1Var.f31661c;
        qi1Var.P.z(-getX(), -getY(), qi1Var.getWidth() - getX(), qi1Var.getHeight() - getY());
        qi1Var.Q.z(-getX(), -getY(), qi1Var.getWidth() - getX(), qi1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = qi1Var.v;
        Paint[] paintArr = this.f31623b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - qi1Var.f31669y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[qi1Var.v]);
        float f7 = qi1Var.f31666s;
        if (f7 > 0.0f && (i10 = qi1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[qi1Var.v + 1]);
        }
        float f10 = qi1Var.f31669y;
        if (f10 < 1.0f) {
            Paint paint = this.f31622a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (qi1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((c1Var.getPaint().ascent() + c1Var.getPaint().descent()) / 2.0f)), c1Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        qi1 qi1Var = this.f31624c;
        com.google.firebase.messaging.n nVar = qi1Var.P;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f31623b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) nVar.f7950a;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) qi1Var.Q.f7950a;
                } else {
                    paintArr[i14] = (Paint) nVar.f7950a;
                }
                i14++;
            } else {
                return;
            }
        }
    }
}
