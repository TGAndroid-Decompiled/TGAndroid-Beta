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
import org.telegram.ui.Components.nb0;
import org.telegram.ui.eh1;

public final class y0 extends TextView {

    public final Paint f33994a;

    public final Paint[] f33995b;

    public final eh1 f33996c;

    public y0(eh1 eh1Var, Context context) {
        super(context);
        this.f33996c = eh1Var;
        Paint paint = new Paint();
        this.f33994a = paint;
        this.f33995b = new Paint[eh1Var.f33478e.length];
        nb0 nb0Var = eh1Var.N;
        nb0Var.setBounds(0, 0, 80, 80);
        nb0 nb0Var2 = eh1Var.O;
        nb0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.m mVar = eh1Var.L;
        mVar.w(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.m mVar2 = eh1Var.M;
        mVar2.w(0.0f, 0.0f, 80.0f, 80.0f);
        nb0Var.setAlpha(255);
        nb0Var2.setAlpha(255);
        Canvas canvas = (Canvas) mVar.f4603b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas.drawColor(0, mode);
        ((Canvas) mVar2.f4603b).drawColor(0, mode);
        nb0Var.draw((Canvas) mVar.f4603b);
        nb0Var2.draw((Canvas) mVar2.f4603b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        eh1 eh1Var = this.f33996c;
        y0 y0Var = eh1Var.f33477c;
        eh1Var.L.w(-getX(), -getY(), eh1Var.getWidth() - getX(), eh1Var.getHeight() - getY());
        eh1Var.M.w(-getX(), -getY(), eh1Var.getWidth() - getX(), eh1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = eh1Var.v;
        Paint[] paintArr = this.f33995b;
        paintArr[i11].setAlpha(255);
        float fDp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - eh1Var.f33485y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, fDp, fDp, paintArr[eh1Var.v]);
        float f10 = eh1Var.f33482s;
        if (f10 > 0.0f && (i10 = eh1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f10 * 255.0f));
            canvas.drawRoundRect(rectF, fDp, fDp, paintArr[eh1Var.v + 1]);
        }
        float f11 = eh1Var.f33485y;
        if (f11 < 1.0f) {
            Paint paint = this.f33994a;
            paint.setAlpha((int) ((1.0f - f11) * 255.0f));
            canvas.drawRoundRect(rectF, fDp, fDp, paint);
        }
        super.onDraw(canvas);
        if (eh1Var.K) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((y0Var.getPaint().ascent() + y0Var.getPaint().descent()) / 2.0f)), y0Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        eh1 eh1Var = this.f33996c;
        com.google.firebase.messaging.m mVar = eh1Var.L;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f33995b;
            if (i14 >= paintArr.length) {
                return;
            }
            if (i14 == 0) {
                paintArr[i14] = (Paint) mVar.f4602a;
            } else if (i14 == 1) {
                paintArr[i14] = (Paint) eh1Var.M.f4602a;
            } else {
                paintArr[i14] = (Paint) mVar.f4602a;
            }
            i14++;
        }
    }
}
