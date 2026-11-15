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
import org.telegram.ui.Components.ra0;
import org.telegram.ui.yb1;
public final class b1 extends TextView {
    public final int f40516a = 1;
    public final Object f40517b;
    public final Object f40518c;
    public final FrameLayout d;

    public b1(l2 l2Var, Activity activity, m1 m1Var) {
        super(activity);
        this.d = l2Var;
        this.f40518c = m1Var;
        this.f40517b = new RectF();
        m1Var.a(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10 = this.f40516a;
        Object obj = this.f40518c;
        FrameLayout frameLayout = this.d;
        Object obj2 = this.f40517b;
        switch (i10) {
            case 0:
                Paint paint = (Paint) obj2;
                yb1 yb1Var = (yb1) frameLayout;
                b1 b1Var = yb1Var.f40543c;
                yb1Var.Q.k(-getX(), -getY(), yb1Var.getWidth() - getX(), yb1Var.getHeight() - getY());
                yb1Var.R.k(-getX(), -getY(), yb1Var.getWidth() - getX(), yb1Var.getHeight() - getY());
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) obj;
                paintArr[yb1Var.f40549w].setAlpha(255);
                float L = org.telegram.messenger.g0.L(8.0f) + ((int) ((1.0f - yb1Var.E) * (org.telegram.messenger.g0.L(26.0f) - org.telegram.messenger.g0.L(8.0f))));
                canvas.drawRoundRect(rectF, L, L, paintArr[yb1Var.f40549w]);
                float f10 = yb1Var.f40548s;
                if (f10 > 0.0f && (i7 = yb1Var.f40549w + 1) < paintArr.length) {
                    paintArr[i7].setAlpha((int) (f10 * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paintArr[yb1Var.f40549w + 1]);
                }
                float f11 = yb1Var.E;
                if (f11 < 1.0f) {
                    paint.setAlpha((int) ((1.0f - f11) * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paint);
                }
                super.onDraw(canvas);
                if (yb1Var.P) {
                    canvas.drawText(hd.M0(2131743240, null), getWidth() / 2, (int) ((getHeight() / 2) - ((b1Var.getPaint().ascent() + b1Var.getPaint().descent()) / 2.0f)), b1Var.getPaint());
                    return;
                }
                return;
            default:
                RectF rectF2 = (RectF) obj2;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                l2 l2Var = (l2) frameLayout;
                m1 m1Var = (m1) obj;
                m1Var.d(((View) l2Var.getParent()).getX() + l2Var.getX() + ((View) getParent()).getX() + getX(), ((View) l2Var.getParent()).getY() + l2Var.getY() + ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), m1Var.b());
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f40516a) {
            case 0:
                yb1 yb1Var = (yb1) this.d;
                b8 b8Var = yb1Var.Q;
                super.onSizeChanged(i7, i10, i11, i12);
                int i13 = 0;
                while (true) {
                    Paint[] paintArr = (Paint[]) this.f40518c;
                    if (i13 < paintArr.length) {
                        if (i13 == 0) {
                            paintArr[i13] = (Paint) b8Var.f341a;
                        } else if (i13 == 1) {
                            paintArr[i13] = (Paint) yb1Var.R.f341a;
                        } else {
                            paintArr[i13] = (Paint) b8Var.f341a;
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

    public b1(yb1 yb1Var, Context context) {
        super(context);
        this.d = yb1Var;
        Paint paint = new Paint();
        this.f40517b = paint;
        this.f40518c = new Paint[yb1Var.f40544e.length];
        ra0 ra0Var = yb1Var.S;
        ra0Var.setBounds(0, 0, 80, 80);
        ra0 ra0Var2 = yb1Var.T;
        ra0Var2.setBounds(0, 0, 80, 80);
        b8 b8Var = yb1Var.Q;
        b8Var.k(0.0f, 0.0f, 80.0f, 80.0f);
        b8 b8Var2 = yb1Var.R;
        b8Var2.k(0.0f, 0.0f, 80.0f, 80.0f);
        ra0Var.setAlpha(255);
        ra0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) b8Var.f342b).drawColor(0, mode);
        ((Canvas) b8Var2.f342b).drawColor(0, mode);
        ra0Var.draw((Canvas) b8Var.f342b);
        ra0Var2.draw((Canvas) b8Var2.f342b);
        paint.setColor(-1);
    }
}
