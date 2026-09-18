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
import org.telegram.ui.Components.lc0;
import org.telegram.ui.li1;
public final class b1 extends TextView {
    public final Paint f29175a;
    public final Paint[] f29176b;
    public final li1 f29177c;

    public b1(li1 li1Var, Context context) {
        super(context);
        this.f29177c = li1Var;
        Paint paint = new Paint();
        this.f29175a = paint;
        this.f29176b = new Paint[li1Var.e.length];
        lc0 lc0Var = li1Var.R;
        lc0Var.setBounds(0, 0, 80, 80);
        lc0 lc0Var2 = li1Var.S;
        lc0Var2.setBounds(0, 0, 80, 80);
        com.google.firebase.messaging.n nVar = li1Var.P;
        nVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        com.google.firebase.messaging.n nVar2 = li1Var.Q;
        nVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        lc0Var.setAlpha(255);
        lc0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) nVar.f7330b).drawColor(0, mode);
        ((Canvas) nVar2.f7330b).drawColor(0, mode);
        lc0Var.draw((Canvas) nVar.f7330b);
        lc0Var2.draw((Canvas) nVar2.f7330b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        li1 li1Var = this.f29177c;
        b1 b1Var = li1Var.f29203c;
        li1Var.P.z(-getX(), -getY(), li1Var.getWidth() - getX(), li1Var.getHeight() - getY());
        li1Var.Q.z(-getX(), -getY(), li1Var.getWidth() - getX(), li1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = li1Var.v;
        Paint[] paintArr = this.f29176b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - li1Var.f29210y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[li1Var.v]);
        float f7 = li1Var.f29207s;
        if (f7 > 0.0f && (i10 = li1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[li1Var.v + 1]);
        }
        float f10 = li1Var.f29210y;
        if (f10 < 1.0f) {
            Paint paint = this.f29175a;
            paint.setAlpha((int) ((1.0f - f10) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (li1Var.O) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((b1Var.getPaint().ascent() + b1Var.getPaint().descent()) / 2.0f)), b1Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        li1 li1Var = this.f29177c;
        com.google.firebase.messaging.n nVar = li1Var.P;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f29176b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) nVar.f7329a;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) li1Var.Q.f7329a;
                } else {
                    paintArr[i14] = (Paint) nVar.f7329a;
                }
                i14++;
            } else {
                return;
            }
        }
    }
}
