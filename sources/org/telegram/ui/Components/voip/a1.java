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
import org.telegram.messenger.gd;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.bc1;
public final class a1 extends TextView {
    public final int f40896a = 1;
    public final Object f40897b;
    public final Object f40898c;
    public final FrameLayout d;

    public a1(k2 k2Var, Activity activity, l1 l1Var) {
        super(activity);
        this.d = k2Var;
        this.f40898c = l1Var;
        this.f40897b = new RectF();
        l1Var.a(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10 = this.f40896a;
        Object obj = this.f40898c;
        FrameLayout frameLayout = this.d;
        Object obj2 = this.f40897b;
        switch (i10) {
            case 0:
                Paint paint = (Paint) obj2;
                bc1 bc1Var = (bc1) frameLayout;
                a1 a1Var = bc1Var.f40925c;
                bc1Var.Q.k(-getX(), -getY(), bc1Var.getWidth() - getX(), bc1Var.getHeight() - getY());
                bc1Var.R.k(-getX(), -getY(), bc1Var.getWidth() - getX(), bc1Var.getHeight() - getY());
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) obj;
                paintArr[bc1Var.f40931w].setAlpha(255);
                float L = org.telegram.messenger.g0.L(8.0f) + ((int) ((1.0f - bc1Var.E) * (org.telegram.messenger.g0.L(26.0f) - org.telegram.messenger.g0.L(8.0f))));
                canvas.drawRoundRect(rectF, L, L, paintArr[bc1Var.f40931w]);
                float f10 = bc1Var.f40930s;
                if (f10 > 0.0f && (i7 = bc1Var.f40931w + 1) < paintArr.length) {
                    paintArr[i7].setAlpha((int) (f10 * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paintArr[bc1Var.f40931w + 1]);
                }
                float f11 = bc1Var.E;
                if (f11 < 1.0f) {
                    paint.setAlpha((int) ((1.0f - f11) * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paint);
                }
                super.onDraw(canvas);
                if (bc1Var.P) {
                    canvas.drawText(gd.N0(2131742997, null), getWidth() / 2, (int) ((getHeight() / 2) - ((a1Var.getPaint().ascent() + a1Var.getPaint().descent()) / 2.0f)), a1Var.getPaint());
                    return;
                }
                return;
            default:
                RectF rectF2 = (RectF) obj2;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                k2 k2Var = (k2) frameLayout;
                l1 l1Var = (l1) obj;
                l1Var.d(((View) k2Var.getParent()).getX() + k2Var.getX() + ((View) getParent()).getX() + getX(), ((View) k2Var.getParent()).getY() + k2Var.getY() + ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), l1Var.b());
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f40896a) {
            case 0:
                bc1 bc1Var = (bc1) this.d;
                b8 b8Var = bc1Var.Q;
                super.onSizeChanged(i7, i10, i11, i12);
                int i13 = 0;
                while (true) {
                    Paint[] paintArr = (Paint[]) this.f40898c;
                    if (i13 < paintArr.length) {
                        if (i13 == 0) {
                            paintArr[i13] = (Paint) b8Var.f341a;
                        } else if (i13 == 1) {
                            paintArr[i13] = (Paint) bc1Var.R.f341a;
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

    public a1(bc1 bc1Var, Context context) {
        super(context);
        this.d = bc1Var;
        Paint paint = new Paint();
        this.f40897b = paint;
        this.f40898c = new Paint[bc1Var.f40926e.length];
        cb0 cb0Var = bc1Var.S;
        cb0Var.setBounds(0, 0, 80, 80);
        cb0 cb0Var2 = bc1Var.T;
        cb0Var2.setBounds(0, 0, 80, 80);
        b8 b8Var = bc1Var.Q;
        b8Var.k(0.0f, 0.0f, 80.0f, 80.0f);
        b8 b8Var2 = bc1Var.R;
        b8Var2.k(0.0f, 0.0f, 80.0f, 80.0f);
        cb0Var.setAlpha(255);
        cb0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) b8Var.f342b).drawColor(0, mode);
        ((Canvas) b8Var2.f342b).drawColor(0, mode);
        cb0Var.draw((Canvas) b8Var.f342b);
        cb0Var2.draw((Canvas) b8Var2.f342b);
        paint.setColor(-1);
    }
}
