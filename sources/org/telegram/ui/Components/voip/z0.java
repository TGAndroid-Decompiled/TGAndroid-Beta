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
import org.telegram.ui.wi1;
public final class z0 extends TextView {
    public final Paint f30611a;
    public final Paint[] f30612b;
    public final wi1 f30613c;

    public z0(wi1 wi1Var, Context context) {
        super(context);
        this.f30613c = wi1Var;
        Paint paint = new Paint();
        this.f30611a = paint;
        this.f30612b = new Paint[wi1Var.e.length];
        cd0 cd0Var = wi1Var.R;
        cd0Var.setBounds(0, 0, 80, 80);
        cd0 cd0Var2 = wi1Var.S;
        cd0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.m mVar = wi1Var.P;
        mVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.m mVar2 = wi1Var.Q;
        mVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        cd0Var.setAlpha(255);
        cd0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) mVar.f6192b).drawColor(0, mode);
        ((Canvas) mVar2.f6192b).drawColor(0, mode);
        cd0Var.draw((Canvas) mVar.f6192b);
        cd0Var2.draw((Canvas) mVar2.f6192b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        wi1 wi1Var = this.f30613c;
        z0 z0Var = wi1Var.f30107c;
        wi1Var.P.z(-getX(), -getY(), wi1Var.getWidth() - getX(), wi1Var.getHeight() - getY());
        wi1Var.Q.z(-getX(), -getY(), wi1Var.getWidth() - getX(), wi1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = wi1Var.v;
        Paint[] paintArr = this.f30612b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - wi1Var.f30114y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[wi1Var.v]);
        float f7 = wi1Var.f30111s;
        if (f7 > 0.0f && (i10 = wi1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[wi1Var.v + 1]);
        }
        float f10 = wi1Var.f30114y;
        if (f10 < 1.0f) {
            Paint paint = this.f30611a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (wi1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((z0Var.getPaint().ascent() + z0Var.getPaint().descent()) / 2.0f)), z0Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        wi1 wi1Var = this.f30613c;
        com.google.firebase.messaging.m mVar = wi1Var.P;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f30612b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) mVar.f6191a;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) wi1Var.Q.f6191a;
                } else {
                    paintArr[i14] = (Paint) mVar.f6191a;
                }
                i14++;
            } else {
                return;
            }
        }
    }
}
