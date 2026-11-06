package org.telegram.ui.Components.voip;

import a8.b8;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.yb1;
public final class x0 extends TextView {
    public final int f39558a = 1;
    public final Object f39559b;
    public final Object f39560c;
    public final FrameLayout d;

    public x0(h2 h2Var, Activity activity, i1 i1Var) {
        super(activity);
        this.d = h2Var;
        this.f39560c = i1Var;
        this.f39559b = new RectF();
        i1Var.a(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10 = this.f39558a;
        Object obj = this.f39560c;
        FrameLayout frameLayout = this.d;
        Object obj2 = this.f39559b;
        switch (i10) {
            case 0:
                Paint paint = (Paint) obj2;
                yb1 yb1Var = (yb1) frameLayout;
                x0 x0Var = yb1Var.f39615c;
                yb1Var.P.k(-getX(), -getY(), yb1Var.getWidth() - getX(), yb1Var.getHeight() - getY());
                yb1Var.Q.k(-getX(), -getY(), yb1Var.getWidth() - getX(), yb1Var.getHeight() - getY());
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) obj;
                paintArr[yb1Var.f39621w].setAlpha(255);
                float L = org.telegram.messenger.g0.L(8.0f) + ((int) ((1.0f - yb1Var.D) * (org.telegram.messenger.g0.L(26.0f) - org.telegram.messenger.g0.L(8.0f))));
                canvas.drawRoundRect(rectF, L, L, paintArr[yb1Var.f39621w]);
                float f10 = yb1Var.f39620s;
                if (f10 > 0.0f && (i7 = yb1Var.f39621w + 1) < paintArr.length) {
                    paintArr[i7].setAlpha((int) (f10 * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paintArr[yb1Var.f39621w + 1]);
                }
                float f11 = yb1Var.D;
                if (f11 < 1.0f) {
                    paint.setAlpha((int) ((1.0f - f11) * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paint);
                }
                super.onDraw(canvas);
                if (yb1Var.O) {
                    canvas.drawText(hd.M0(2131743241, null), getWidth() / 2, (int) ((getHeight() / 2) - ((x0Var.getPaint().ascent() + x0Var.getPaint().descent()) / 2.0f)), x0Var.getPaint());
                    return;
                }
                return;
            default:
                RectF rectF2 = (RectF) obj2;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                h2 h2Var = (h2) frameLayout;
                i1 i1Var = (i1) obj;
                i1Var.d(((View) h2Var.getParent()).getX() + h2Var.getX() + ((View) getParent()).getX() + getX(), ((View) h2Var.getParent()).getY() + h2Var.getY() + ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), i1Var.b());
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f39558a) {
            case 0:
                yb1 yb1Var = (yb1) this.d;
                b8 b8Var = yb1Var.P;
                super.onSizeChanged(i7, i10, i11, i12);
                int i13 = 0;
                while (true) {
                    Paint[] paintArr = (Paint[]) this.f39560c;
                    if (i13 < paintArr.length) {
                        if (i13 == 0) {
                            paintArr[i13] = (Paint) b8Var.f335a;
                        } else if (i13 == 1) {
                            paintArr[i13] = (Paint) yb1Var.Q.f335a;
                        } else {
                            paintArr[i13] = (Paint) b8Var.f335a;
                        }
                        i13++;
                    } else {
                        return;
                    }
                }
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    public x0(yb1 yb1Var, Context context) {
        super(context);
        this.d = yb1Var;
        Paint paint = new Paint();
        this.f39559b = paint;
        this.f39560c = new Paint[yb1Var.f39616e.length];
        qa0 qa0Var = yb1Var.R;
        qa0Var.setBounds(0, 0, 80, 80);
        qa0 qa0Var2 = yb1Var.S;
        qa0Var2.setBounds(0, 0, 80, 80);
        b8 b8Var = yb1Var.P;
        b8Var.k(0.0f, 0.0f, 80.0f, 80.0f);
        b8 b8Var2 = yb1Var.Q;
        b8Var2.k(0.0f, 0.0f, 80.0f, 80.0f);
        qa0Var.setAlpha(255);
        qa0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) b8Var.f336b).drawColor(0, mode);
        ((Canvas) b8Var2.f336b).drawColor(0, mode);
        qa0Var.draw((Canvas) b8Var.f336b);
        qa0Var2.draw((Canvas) b8Var2.f336b);
        paint.setColor(-1);
    }
}
