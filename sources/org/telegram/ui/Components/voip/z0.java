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
import org.telegram.ui.Components.wc0;
import org.telegram.ui.ah1;
public final class z0 extends TextView {
    public final Paint f31842a;
    public final Paint[] f31843b;
    public final ah1 f31844c;

    public z0(ah1 ah1Var, Context context) {
        super(context);
        this.f31844c = ah1Var;
        Paint paint = new Paint();
        this.f31842a = paint;
        this.f31843b = new Paint[ah1Var.e.length];
        wc0 wc0Var = ah1Var.R;
        wc0Var.setBounds(0, 0, 80, 80);
        wc0 wc0Var2 = ah1Var.S;
        wc0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.l lVar = ah1Var.P;
        lVar.E(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.l lVar2 = ah1Var.Q;
        lVar2.E(0.0f, 0.0f, 80.0f, 80.0f);
        wc0Var.setAlpha(255);
        wc0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) lVar.f7646b).drawColor(0, mode);
        ((Canvas) lVar2.f7646b).drawColor(0, mode);
        wc0Var.draw((Canvas) lVar.f7646b);
        wc0Var2.draw((Canvas) lVar2.f7646b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        ah1 ah1Var = this.f31844c;
        z0 z0Var = ah1Var.f31348c;
        ah1Var.P.E(-getX(), -getY(), ah1Var.getWidth() - getX(), ah1Var.getHeight() - getY());
        ah1Var.Q.E(-getX(), -getY(), ah1Var.getWidth() - getX(), ah1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = ah1Var.v;
        Paint[] paintArr = this.f31843b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - ah1Var.f31355y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[ah1Var.v]);
        float f7 = ah1Var.f31352s;
        if (f7 > 0.0f && (i10 = ah1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[ah1Var.v + 1]);
        }
        float f10 = ah1Var.f31355y;
        if (f10 < 1.0f) {
            Paint paint = this.f31842a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (ah1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((z0Var.getPaint().ascent() + z0Var.getPaint().descent()) / 2.0f)), z0Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        ah1 ah1Var = this.f31844c;
        com.google.firebase.messaging.l lVar = ah1Var.P;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f31843b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) lVar.f7645a;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) ah1Var.Q.f7645a;
                } else {
                    paintArr[i14] = (Paint) lVar.f7645a;
                }
                i14++;
            } else {
                return;
            }
        }
    }
}
