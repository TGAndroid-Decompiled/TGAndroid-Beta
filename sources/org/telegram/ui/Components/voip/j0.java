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
import org.telegram.messenger.bd;
import org.telegram.ui.Components.la0;
import org.telegram.ui.sb1;
public final class j0 extends TextView {
    public final int f39416a = 1;
    public final Object f39417b;
    public final Object f39418c;
    public final FrameLayout d;

    public j0(w1 w1Var, Activity activity, x0 x0Var) {
        super(activity);
        this.d = w1Var;
        this.f39418c = x0Var;
        this.f39417b = new RectF();
        x0Var.a(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        int i10 = this.f39416a;
        Object obj = this.f39418c;
        FrameLayout frameLayout = this.d;
        Object obj2 = this.f39417b;
        switch (i10) {
            case 0:
                Paint paint = (Paint) obj2;
                sb1 sb1Var = (sb1) frameLayout;
                j0 j0Var = sb1Var.f39447c;
                sb1Var.Q.m(-getX(), -getY(), sb1Var.getWidth() - getX(), sb1Var.getHeight() - getY());
                sb1Var.R.m(-getX(), -getY(), sb1Var.getWidth() - getX(), sb1Var.getHeight() - getY());
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) obj;
                paintArr[sb1Var.f39453w].setAlpha(255);
                float L = org.telegram.messenger.g0.L(8.0f) + ((int) ((1.0f - sb1Var.E) * (org.telegram.messenger.g0.L(26.0f) - org.telegram.messenger.g0.L(8.0f))));
                canvas.drawRoundRect(rectF, L, L, paintArr[sb1Var.f39453w]);
                float f10 = sb1Var.f39452s;
                if (f10 > 0.0f && (i3 = sb1Var.f39453w + 1) < paintArr.length) {
                    paintArr[i3].setAlpha((int) (f10 * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paintArr[sb1Var.f39453w + 1]);
                }
                float f11 = sb1Var.E;
                if (f11 < 1.0f) {
                    paint.setAlpha((int) ((1.0f - f11) * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paint);
                }
                super.onDraw(canvas);
                if (sb1Var.P) {
                    canvas.drawText(bd.M0(2131743250, null), getWidth() / 2, (int) ((getHeight() / 2) - ((j0Var.getPaint().ascent() + j0Var.getPaint().descent()) / 2.0f)), j0Var.getPaint());
                    return;
                }
                return;
            default:
                RectF rectF2 = (RectF) obj2;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                w1 w1Var = (w1) frameLayout;
                x0 x0Var = (x0) obj;
                x0Var.d(((View) w1Var.getParent()).getX() + w1Var.getX() + ((View) getParent()).getX() + getX(), ((View) w1Var.getParent()).getY() + w1Var.getY() + ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), x0Var.b());
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.f39416a) {
            case 0:
                sb1 sb1Var = (sb1) this.d;
                l2.e eVar = sb1Var.Q;
                super.onSizeChanged(i3, i10, i11, i12);
                int i13 = 0;
                while (true) {
                    Paint[] paintArr = (Paint[]) this.f39418c;
                    if (i13 < paintArr.length) {
                        if (i13 == 0) {
                            paintArr[i13] = (Paint) eVar.f17689a;
                        } else if (i13 == 1) {
                            paintArr[i13] = (Paint) sb1Var.R.f17689a;
                        } else {
                            paintArr[i13] = (Paint) eVar.f17689a;
                        }
                        i13++;
                    } else {
                        return;
                    }
                }
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                return;
        }
    }

    public j0(sb1 sb1Var, Context context) {
        super(context);
        this.d = sb1Var;
        Paint paint = new Paint();
        this.f39417b = paint;
        this.f39418c = new Paint[sb1Var.f39448e.length];
        la0 la0Var = sb1Var.S;
        la0Var.setBounds(0, 0, 80, 80);
        la0 la0Var2 = sb1Var.T;
        la0Var2.setBounds(0, 0, 80, 80);
        l2.e eVar = sb1Var.Q;
        eVar.m(0.0f, 0.0f, 80.0f, 80.0f);
        l2.e eVar2 = sb1Var.R;
        eVar2.m(0.0f, 0.0f, 80.0f, 80.0f);
        la0Var.setAlpha(255);
        la0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) eVar.f17690b).drawColor(0, mode);
        ((Canvas) eVar2.f17690b).drawColor(0, mode);
        la0Var.draw((Canvas) eVar.f17690b);
        la0Var2.draw((Canvas) eVar2.f17690b);
        paint.setColor(-1);
    }
}
