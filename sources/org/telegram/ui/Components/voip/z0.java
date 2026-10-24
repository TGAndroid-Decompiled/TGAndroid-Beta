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
import org.telegram.ui.gh1;
public final class z0 extends TextView {
    public final Paint f31998a;
    public final Paint[] f31999b;
    public final gh1 f32000c;

    public z0(gh1 gh1Var, Context context) {
        super(context);
        this.f32000c = gh1Var;
        Paint paint = new Paint();
        this.f31998a = paint;
        this.f31999b = new Paint[gh1Var.e.length];
        wc0 wc0Var = gh1Var.R;
        wc0Var.setBounds(0, 0, 80, 80);
        wc0 wc0Var2 = gh1Var.S;
        wc0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.l lVar = gh1Var.P;
        lVar.w(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.l lVar2 = gh1Var.Q;
        lVar2.w(0.0f, 0.0f, 80.0f, 80.0f);
        wc0Var.setAlpha(255);
        wc0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) lVar.f7658b).drawColor(0, mode);
        ((Canvas) lVar2.f7658b).drawColor(0, mode);
        wc0Var.draw((Canvas) lVar.f7658b);
        wc0Var2.draw((Canvas) lVar2.f7658b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        gh1 gh1Var = this.f32000c;
        z0 z0Var = gh1Var.f31504c;
        gh1Var.P.w(-getX(), -getY(), gh1Var.getWidth() - getX(), gh1Var.getHeight() - getY());
        gh1Var.Q.w(-getX(), -getY(), gh1Var.getWidth() - getX(), gh1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = gh1Var.v;
        Paint[] paintArr = this.f31999b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - gh1Var.f31511y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[gh1Var.v]);
        float f7 = gh1Var.f31508s;
        if (f7 > 0.0f && (i10 = gh1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[gh1Var.v + 1]);
        }
        float f10 = gh1Var.f31511y;
        if (f10 < 1.0f) {
            Paint paint = this.f31998a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (gh1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((z0Var.getPaint().ascent() + z0Var.getPaint().descent()) / 2.0f)), z0Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        gh1 gh1Var = this.f32000c;
        com.google.firebase.messaging.l lVar = gh1Var.P;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f31999b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) lVar.f7657a;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) gh1Var.Q.f7657a;
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
