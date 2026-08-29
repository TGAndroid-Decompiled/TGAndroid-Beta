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
import org.telegram.ui.Components.yb0;
import org.telegram.ui.hh1;
public final class z0 extends TextView {
    public final Paint f34147a;
    public final Paint[] f34148b;
    public final hh1 f34149c;

    public z0(hh1 hh1Var, Context context) {
        super(context);
        this.f34149c = hh1Var;
        Paint paint = new Paint();
        this.f34147a = paint;
        this.f34148b = new Paint[hh1Var.f33623e.length];
        yb0 yb0Var = hh1Var.N;
        yb0Var.setBounds(0, 0, 80, 80);
        yb0 yb0Var2 = hh1Var.O;
        yb0Var2.setBounds(0, 0, 80, 80);
        bg.c2 c2Var = hh1Var.L;
        c2Var.w(0.0f, 0.0f, 80.0f, 80.0f);
        bg.c2 c2Var2 = hh1Var.M;
        c2Var2.w(0.0f, 0.0f, 80.0f, 80.0f);
        yb0Var.setAlpha(255);
        yb0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) c2Var.f2118a).drawColor(0, mode);
        ((Canvas) c2Var2.f2118a).drawColor(0, mode);
        yb0Var.draw((Canvas) c2Var.f2118a);
        yb0Var2.draw((Canvas) c2Var2.f2118a);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        hh1 hh1Var = this.f34149c;
        z0 z0Var = hh1Var.f33622c;
        hh1Var.L.w(-getX(), -getY(), hh1Var.getWidth() - getX(), hh1Var.getHeight() - getY());
        hh1Var.M.w(-getX(), -getY(), hh1Var.getWidth() - getX(), hh1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = hh1Var.v;
        Paint[] paintArr = this.f34148b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - hh1Var.f33630y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[hh1Var.v]);
        float f9 = hh1Var.f33627s;
        if (f9 > 0.0f && (i10 = hh1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f9 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[hh1Var.v + 1]);
        }
        float f10 = hh1Var.f33630y;
        if (f10 < 1.0f) {
            Paint paint = this.f34147a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (hh1Var.K) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((z0Var.getPaint().ascent() + z0Var.getPaint().descent()) / 2.0f)), z0Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        hh1 hh1Var = this.f34149c;
        bg.c2 c2Var = hh1Var.L;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f34148b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) c2Var.d;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) hh1Var.M.d;
                } else {
                    paintArr[i14] = (Paint) c2Var.d;
                }
                i14++;
            } else {
                return;
            }
        }
    }
}
