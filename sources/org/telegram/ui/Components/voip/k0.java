package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.sd1;
public final class k0 extends TextView {
    public final int f31564a = 1;
    public final Object f31565b;
    public final Object f31566c;
    public final FrameLayout d;

    public k0(w1 w1Var, Activity activity, y0 y0Var) {
        super(activity);
        this.d = w1Var;
        this.f31566c = y0Var;
        this.f31565b = new RectF();
        y0Var.a(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11 = this.f31564a;
        Object obj = this.f31566c;
        FrameLayout frameLayout = this.d;
        Object obj2 = this.f31565b;
        switch (i11) {
            case 0:
                Paint paint = (Paint) obj2;
                sd1 sd1Var = (sd1) frameLayout;
                k0 k0Var = sd1Var.f31593c;
                sd1Var.P.x(-getX(), -getY(), sd1Var.getWidth() - getX(), sd1Var.getHeight() - getY());
                sd1Var.Q.x(-getX(), -getY(), sd1Var.getWidth() - getX(), sd1Var.getHeight() - getY());
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) obj;
                paintArr[sd1Var.f31598w].setAlpha(255);
                float L = org.telegram.messenger.i0.L(8.0f) + ((int) ((1.0f - sd1Var.D) * (org.telegram.messenger.i0.L(26.0f) - org.telegram.messenger.i0.L(8.0f))));
                canvas.drawRoundRect(rectF, L, L, paintArr[sd1Var.f31598w]);
                float f7 = sd1Var.f31597s;
                if (f7 > 0.0f && (i10 = sd1Var.f31598w + 1) < paintArr.length) {
                    paintArr[i10].setAlpha((int) (f7 * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paintArr[sd1Var.f31598w + 1]);
                }
                float f10 = sd1Var.D;
                if (f10 < 1.0f) {
                    paint.setAlpha((int) ((1.0f - f10) * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paint);
                }
                super.onDraw(canvas);
                if (sd1Var.O) {
                    canvas.drawText(dd.L0(2131743266, null), getWidth() / 2, (int) ((getHeight() / 2) - ((k0Var.getPaint().ascent() + k0Var.getPaint().descent()) / 2.0f)), k0Var.getPaint());
                    return;
                }
                return;
            default:
                RectF rectF2 = (RectF) obj2;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                w1 w1Var = (w1) frameLayout;
                y0 y0Var = (y0) obj;
                y0Var.d(((View) w1Var.getParent()).getX() + w1Var.getX() + ((View) getParent()).getX() + getX(), ((View) w1Var.getParent()).getY() + w1Var.getY() + ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), y0Var.b());
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f31564a) {
            case 0:
                sd1 sd1Var = (sd1) this.d;
                j2.f fVar = sd1Var.P;
                super.onSizeChanged(i10, i11, i12, i13);
                int i14 = 0;
                while (true) {
                    Paint[] paintArr = (Paint[]) this.f31566c;
                    if (i14 < paintArr.length) {
                        if (i14 == 0) {
                            paintArr[i14] = (Paint) fVar.f9348a;
                        } else if (i14 == 1) {
                            paintArr[i14] = (Paint) sd1Var.Q.f9348a;
                        } else {
                            paintArr[i14] = (Paint) fVar.f9348a;
                        }
                        i14++;
                    } else {
                        return;
                    }
                }
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    public k0(sd1 sd1Var, Context context) {
        super(context);
        this.d = sd1Var;
        Paint paint = new Paint();
        this.f31565b = paint;
        this.f31566c = new Paint[sd1Var.e.length];
        jb0 jb0Var = sd1Var.R;
        jb0Var.setBounds(0, 0, 80, 80);
        jb0 jb0Var2 = sd1Var.S;
        jb0Var2.setBounds(0, 0, 80, 80);
        j2.f fVar = sd1Var.P;
        fVar.x(0.0f, 0.0f, 80.0f, 80.0f);
        j2.f fVar2 = sd1Var.Q;
        fVar2.x(0.0f, 0.0f, 80.0f, 80.0f);
        jb0Var.setAlpha(255);
        jb0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) fVar.f9349b).drawColor(0, mode);
        ((Canvas) fVar2.f9349b).drawColor(0, mode);
        jb0Var.draw((Canvas) fVar.f9349b);
        jb0Var2.draw((Canvas) fVar2.f9349b);
        paint.setColor(-1);
    }
}
