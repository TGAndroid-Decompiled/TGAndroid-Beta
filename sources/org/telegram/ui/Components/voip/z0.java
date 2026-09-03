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
import org.telegram.ui.Components.fc0;
import org.telegram.ui.bi1;
public final class z0 extends TextView {
    public final Paint f32494a;
    public final Paint[] f32495b;
    public final bi1 f32496c;

    public z0(bi1 bi1Var, Context context) {
        super(context);
        this.f32496c = bi1Var;
        Paint paint = new Paint();
        this.f32494a = paint;
        this.f32495b = new Paint[bi1Var.f31973e.length];
        fc0 fc0Var = bi1Var.O;
        fc0Var.setBounds(0, 0, 80, 80);
        fc0 fc0Var2 = bi1Var.P;
        fc0Var2.setBounds(0, 0, 80, 80);
        a9.a aVar = bi1Var.M;
        aVar.x(0.0f, 0.0f, 80.0f, 80.0f);
        a9.a aVar2 = bi1Var.N;
        aVar2.x(0.0f, 0.0f, 80.0f, 80.0f);
        fc0Var.setAlpha(255);
        fc0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) aVar.f156b).drawColor(0, mode);
        ((Canvas) aVar2.f156b).drawColor(0, mode);
        fc0Var.draw((Canvas) aVar.f156b);
        fc0Var2.draw((Canvas) aVar2.f156b);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        bi1 bi1Var = this.f32496c;
        z0 z0Var = bi1Var.f31972c;
        bi1Var.M.x(-getX(), -getY(), bi1Var.getWidth() - getX(), bi1Var.getHeight() - getY());
        bi1Var.N.x(-getX(), -getY(), bi1Var.getWidth() - getX(), bi1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = bi1Var.v;
        Paint[] paintArr = this.f32495b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - bi1Var.f31980y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[bi1Var.v]);
        float f10 = bi1Var.f31977s;
        if (f10 > 0.0f && (i10 = bi1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f10 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[bi1Var.v + 1]);
        }
        float f11 = bi1Var.f31980y;
        if (f11 < 1.0f) {
            Paint paint = this.f32494a;
            paint.setAlpha((int) ((1.0f - f11) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (bi1Var.L) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((z0Var.getPaint().ascent() + z0Var.getPaint().descent()) / 2.0f)), z0Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        bi1 bi1Var = this.f32496c;
        a9.a aVar = bi1Var.M;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f32495b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) aVar.f155a;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) bi1Var.N.f155a;
                } else {
                    paintArr[i14] = (Paint) aVar.f155a;
                }
                i14++;
            } else {
                return;
            }
        }
    }
}
