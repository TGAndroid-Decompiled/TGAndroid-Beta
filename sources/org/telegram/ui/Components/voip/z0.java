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
import org.telegram.ui.Components.vc0;
import org.telegram.ui.kh1;
public final class z0 extends TextView {
    public final Paint f34332a;
    public final Paint[] f34333b;
    public final kh1 f34334c;

    public z0(kh1 kh1Var, Context context) {
        super(context);
        this.f34334c = kh1Var;
        Paint paint = new Paint();
        this.f34332a = paint;
        this.f34333b = new Paint[kh1Var.e.length];
        vc0 vc0Var = kh1Var.R;
        vc0Var.setBounds(0, 0, 80, 80);
        vc0 vc0Var2 = kh1Var.S;
        vc0Var2.setBounds(0, 0, 80, 80);
        aa.m0 m0Var = kh1Var.P;
        m0Var.w(0.0f, 0.0f, 80.0f, 80.0f);
        aa.m0 m0Var2 = kh1Var.Q;
        m0Var2.w(0.0f, 0.0f, 80.0f, 80.0f);
        vc0Var.setAlpha(255);
        vc0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) m0Var.f1151b).drawColor(0, mode);
        ((Canvas) m0Var2.f1151b).drawColor(0, mode);
        vc0Var.draw((Canvas) m0Var.f1151b);
        vc0Var2.draw((Canvas) m0Var2.f1151b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        kh1 kh1Var = this.f34334c;
        z0 z0Var = kh1Var.f33841c;
        kh1Var.P.w(-getX(), -getY(), kh1Var.getWidth() - getX(), kh1Var.getHeight() - getY());
        kh1Var.Q.w(-getX(), -getY(), kh1Var.getWidth() - getX(), kh1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = kh1Var.v;
        Paint[] paintArr = this.f34333b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - kh1Var.f33848y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[kh1Var.v]);
        float f7 = kh1Var.f33845s;
        if (f7 > 0.0f && (i10 = kh1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[kh1Var.v + 1]);
        }
        float f10 = kh1Var.f33848y;
        if (f10 < 1.0f) {
            Paint paint = this.f34332a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (kh1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((z0Var.getPaint().ascent() + z0Var.getPaint().descent()) / 2.0f)), z0Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        kh1 kh1Var = this.f34334c;
        aa.m0 m0Var = kh1Var.P;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f34333b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) m0Var.f1150a;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) kh1Var.Q.f1150a;
                } else {
                    paintArr[i14] = (Paint) m0Var.f1150a;
                }
                i14++;
            } else {
                return;
            }
        }
    }
}
