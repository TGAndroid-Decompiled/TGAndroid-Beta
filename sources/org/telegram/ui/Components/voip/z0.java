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
import org.telegram.ui.Components.yc0;
import org.telegram.ui.hh1;
public final class z0 extends TextView {
    public final Paint f32028a;
    public final Paint[] f32029b;
    public final hh1 f32030c;

    public z0(hh1 hh1Var, Context context) {
        super(context);
        this.f32030c = hh1Var;
        Paint paint = new Paint();
        this.f32028a = paint;
        this.f32029b = new Paint[hh1Var.e.length];
        yc0 yc0Var = hh1Var.R;
        yc0Var.setBounds(0, 0, 80, 80);
        yc0 yc0Var2 = hh1Var.S;
        yc0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.l lVar = hh1Var.P;
        lVar.w(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.l lVar2 = hh1Var.Q;
        lVar2.w(0.0f, 0.0f, 80.0f, 80.0f);
        yc0Var.setAlpha(255);
        yc0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) lVar.f7658b).drawColor(0, mode);
        ((Canvas) lVar2.f7658b).drawColor(0, mode);
        yc0Var.draw((Canvas) lVar.f7658b);
        yc0Var2.draw((Canvas) lVar2.f7658b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        hh1 hh1Var = this.f32030c;
        z0 z0Var = hh1Var.f31534c;
        hh1Var.P.w(-getX(), -getY(), hh1Var.getWidth() - getX(), hh1Var.getHeight() - getY());
        hh1Var.Q.w(-getX(), -getY(), hh1Var.getWidth() - getX(), hh1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = hh1Var.v;
        Paint[] paintArr = this.f32029b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - hh1Var.f31541y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[hh1Var.v]);
        float f7 = hh1Var.f31538s;
        if (f7 > 0.0f && (i10 = hh1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[hh1Var.v + 1]);
        }
        float f10 = hh1Var.f31541y;
        if (f10 < 1.0f) {
            Paint paint = this.f32028a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (hh1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((z0Var.getPaint().ascent() + z0Var.getPaint().descent()) / 2.0f)), z0Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        hh1 hh1Var = this.f32030c;
        com.google.firebase.messaging.l lVar = hh1Var.P;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f32029b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) lVar.f7657a;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) hh1Var.Q.f7657a;
                } else {
                    paintArr[i14] = (Paint) lVar.f7657a;
                }
                i14++;
            } else {
                return;
            }
        }
    }
}
