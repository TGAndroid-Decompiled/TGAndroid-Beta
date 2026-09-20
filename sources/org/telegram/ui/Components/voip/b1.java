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
import org.telegram.ui.Components.kc0;
import org.telegram.ui.mi1;
public final class b1 extends TextView {
    public final Paint f29282a;
    public final Paint[] f29283b;
    public final mi1 f29284c;

    public b1(mi1 mi1Var, Context context) {
        super(context);
        this.f29284c = mi1Var;
        Paint paint = new Paint();
        this.f29282a = paint;
        this.f29283b = new Paint[mi1Var.e.length];
        kc0 kc0Var = mi1Var.R;
        kc0Var.setBounds(0, 0, 80, 80);
        kc0 kc0Var2 = mi1Var.S;
        kc0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.n nVar = mi1Var.P;
        nVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.n nVar2 = mi1Var.Q;
        nVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        kc0Var.setAlpha(255);
        kc0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) nVar.f7331b).drawColor(0, mode);
        ((Canvas) nVar2.f7331b).drawColor(0, mode);
        kc0Var.draw((Canvas) nVar.f7331b);
        kc0Var2.draw((Canvas) nVar2.f7331b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        mi1 mi1Var = this.f29284c;
        b1 b1Var = mi1Var.f29310c;
        mi1Var.P.z(-getX(), -getY(), mi1Var.getWidth() - getX(), mi1Var.getHeight() - getY());
        mi1Var.Q.z(-getX(), -getY(), mi1Var.getWidth() - getX(), mi1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = mi1Var.v;
        Paint[] paintArr = this.f29283b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - mi1Var.f29317y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[mi1Var.v]);
        float f7 = mi1Var.f29314s;
        if (f7 > 0.0f && (i10 = mi1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[mi1Var.v + 1]);
        }
        float f10 = mi1Var.f29317y;
        if (f10 < 1.0f) {
            Paint paint = this.f29282a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (mi1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((b1Var.getPaint().ascent() + b1Var.getPaint().descent()) / 2.0f)), b1Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        mi1 mi1Var = this.f29284c;
        com.google.firebase.messaging.n nVar = mi1Var.P;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f29283b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) nVar.f7330a;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) mi1Var.Q.f7330a;
                } else {
                    paintArr[i14] = (Paint) nVar.f7330a;
                }
                i14++;
            } else {
                return;
            }
        }
    }
}
