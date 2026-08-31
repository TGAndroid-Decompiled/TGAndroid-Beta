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
import org.telegram.ui.vh1;
public final class z0 extends TextView {
    public final Paint f32489a;
    public final Paint[] f32490b;
    public final vh1 f32491c;

    public z0(vh1 vh1Var, Context context) {
        super(context);
        this.f32491c = vh1Var;
        Paint paint = new Paint();
        this.f32489a = paint;
        this.f32490b = new Paint[vh1Var.f31968e.length];
        fc0 fc0Var = vh1Var.O;
        fc0Var.setBounds(0, 0, 80, 80);
        fc0 fc0Var2 = vh1Var.P;
        fc0Var2.setBounds(0, 0, 80, 80);
        a9.a aVar = vh1Var.M;
        aVar.x(0.0f, 0.0f, 80.0f, 80.0f);
        a9.a aVar2 = vh1Var.N;
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
        vh1 vh1Var = this.f32491c;
        z0 z0Var = vh1Var.f31967c;
        vh1Var.M.x(-getX(), -getY(), vh1Var.getWidth() - getX(), vh1Var.getHeight() - getY());
        vh1Var.N.x(-getX(), -getY(), vh1Var.getWidth() - getX(), vh1Var.getHeight() - getY());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i11 = vh1Var.v;
        Paint[] paintArr = this.f32490b;
        paintArr[i11].setAlpha(255);
        float dp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - vh1Var.f31975y) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
        canvas.drawRoundRect(rectF, dp, dp, paintArr[vh1Var.v]);
        float f10 = vh1Var.f31972s;
        if (f10 > 0.0f && (i10 = vh1Var.v + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f10 * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paintArr[vh1Var.v + 1]);
        }
        float f11 = vh1Var.f31975y;
        if (f11 < 1.0f) {
            Paint paint = this.f32489a;
            paint.setAlpha((int) ((1.0f - f11) * 255.0f));
            canvas.drawRoundRect(rectF, dp, dp, paint);
        }
        super.onDraw(canvas);
        if (vh1Var.L) {
            canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((z0Var.getPaint().ascent() + z0Var.getPaint().descent()) / 2.0f)), z0Var.getPaint());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        vh1 vh1Var = this.f32491c;
        a9.a aVar = vh1Var.M;
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = 0;
        while (true) {
            Paint[] paintArr = this.f32490b;
            if (i14 < paintArr.length) {
                if (i14 == 0) {
                    paintArr[i14] = (Paint) aVar.f155a;
                } else if (i14 == 1) {
                    paintArr[i14] = (Paint) vh1Var.N.f155a;
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
