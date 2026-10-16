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
import org.telegram.ui.vi1;
public final class z0 extends TextView {
    public final Paint f30280a;
    public final Paint[] f30281b;
    public final vi1 f30282c;

    public z0(vi1 vi1Var, Context context) {
        super(context);
        this.f30282c = vi1Var;
        Paint paint = new Paint();
        this.f30280a = paint;
        this.f30281b = new Paint[vi1Var.e.length];
        cd0 cd0Var = vi1Var.R;
        cd0Var.setBounds(0, 0, 80, 80);
        cd0 cd0Var2 = vi1Var.S;
        cd0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.m mVar = vi1Var.P;
        mVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.m mVar2 = vi1Var.Q;
        mVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        cd0Var.setAlpha(255);
        cd0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) mVar.f6195b).drawColor(0, mode);
        ((Canvas) mVar2.f6195b).drawColor(0, mode);
        cd0Var.draw((Canvas) mVar.f6195b);
        cd0Var2.draw((Canvas) mVar2.f6195b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        vi1 vi1Var = this.f30282c;
        z0 z0Var = vi1Var.f29776c;
        vi1Var.P.z(-getX(), -getY(), vi1Var.getWidth() - getX(), vi1Var.getHeight() - getY());
        vi1Var.Q.z(-getX(), -getY(), vi1Var.getWidth() - getX(), vi1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = vi1Var.v;
        Paint[] paintArr = this.f30281b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - vi1Var.f29783y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[vi1Var.v]);
        float f7 = vi1Var.f29780s;
        if (f7 > 0.0f && (i10 = vi1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[vi1Var.v + 1]);
        }
        float f10 = vi1Var.f29783y;
        if (f10 < 1.0f) {
            Paint paint = this.f30280a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (vi1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((z0Var.getPaint().ascent() + z0Var.getPaint().descent()) / 2.0f)), z0Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        vi1 vi1Var = this.f30282c;
        com.google.firebase.messaging.m mVar = vi1Var.P;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f30281b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) mVar.f6194a;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) vi1Var.Q.f6194a;
                } else {
                    paintArr[i14] = (Paint) mVar.f6194a;
                }
                i14++;
            } else {
                return;
            }
        }
    }
}
