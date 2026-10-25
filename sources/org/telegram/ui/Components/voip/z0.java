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
import org.telegram.ui.Components.uc0;
import org.telegram.ui.ih1;
public final class z0 extends TextView {
    public final Paint f34224a;
    public final Paint[] f34225b;
    public final ih1 f34226c;

    public z0(ih1 ih1Var, Context context) {
        super(context);
        this.f34226c = ih1Var;
        Paint paint = new Paint();
        this.f34224a = paint;
        this.f34225b = new Paint[ih1Var.e.length];
        uc0 uc0Var = ih1Var.R;
        uc0Var.setBounds(0, 0, 80, 80);
        uc0 uc0Var2 = ih1Var.S;
        uc0Var2.setBounds(0, 0, 80, 80);
        aa.m0 m0Var = ih1Var.P;
        m0Var.w(0.0f, 0.0f, 80.0f, 80.0f);
        aa.m0 m0Var2 = ih1Var.Q;
        m0Var2.w(0.0f, 0.0f, 80.0f, 80.0f);
        uc0Var.setAlpha(255);
        uc0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) m0Var.f1151b).drawColor(0, mode);
        ((Canvas) m0Var2.f1151b).drawColor(0, mode);
        uc0Var.draw((Canvas) m0Var.f1151b);
        uc0Var2.draw((Canvas) m0Var2.f1151b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        ih1 ih1Var = this.f34226c;
        z0 z0Var = ih1Var.f33733c;
        ih1Var.P.w(-getX(), -getY(), ih1Var.getWidth() - getX(), ih1Var.getHeight() - getY());
        ih1Var.Q.w(-getX(), -getY(), ih1Var.getWidth() - getX(), ih1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = ih1Var.v;
        Paint[] paintArr = this.f34225b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - ih1Var.f33740y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[ih1Var.v]);
        float f7 = ih1Var.f33737s;
        if (f7 > 0.0f && (i10 = ih1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[ih1Var.v + 1]);
        }
        float f10 = ih1Var.f33740y;
        if (f10 < 1.0f) {
            Paint paint = this.f34224a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (ih1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((z0Var.getPaint().ascent() + z0Var.getPaint().descent()) / 2.0f)), z0Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        ih1 ih1Var = this.f34226c;
        aa.m0 m0Var = ih1Var.P;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f34225b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) m0Var.f1150a;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) ih1Var.Q.f1150a;
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
