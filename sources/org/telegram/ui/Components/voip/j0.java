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
import org.telegram.messenger.cd;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.ud1;
public final class j0 extends TextView {
    public final int f31483a = 1;
    public final Object f31484b;
    public final Object f31485c;
    public final FrameLayout d;

    public j0(v1 v1Var, Activity activity, x0 x0Var) {
        super(activity);
        this.d = v1Var;
        this.f31485c = x0Var;
        this.f31484b = new RectF();
        x0Var.a(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11 = this.f31483a;
        Object obj = this.f31485c;
        FrameLayout frameLayout = this.d;
        Object obj2 = this.f31484b;
        switch (i11) {
            case 0:
                Paint paint = (Paint) obj2;
                ud1 ud1Var = (ud1) frameLayout;
                j0 j0Var = ud1Var.f31514c;
                ud1Var.P.x(-getX(), -getY(), ud1Var.getWidth() - getX(), ud1Var.getHeight() - getY());
                ud1Var.Q.x(-getX(), -getY(), ud1Var.getWidth() - getX(), ud1Var.getHeight() - getY());
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) obj;
                paintArr[ud1Var.f31519w].setAlpha(255);
                float L = org.telegram.messenger.i0.L(8.0f) + ((int) ((1.0f - ud1Var.D) * (org.telegram.messenger.i0.L(26.0f) - org.telegram.messenger.i0.L(8.0f))));
                canvas.drawRoundRect(rectF, L, L, paintArr[ud1Var.f31519w]);
                float f7 = ud1Var.f31518s;
                if (f7 > 0.0f && (i10 = ud1Var.f31519w + 1) < paintArr.length) {
                    paintArr[i10].setAlpha((int) (f7 * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paintArr[ud1Var.f31519w + 1]);
                }
                float f10 = ud1Var.D;
                if (f10 < 1.0f) {
                    paint.setAlpha((int) ((1.0f - f10) * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paint);
                }
                super.onDraw(canvas);
                if (ud1Var.O) {
                    canvas.drawText(cd.L0(2131743266, null), getWidth() / 2, (int) ((getHeight() / 2) - ((j0Var.getPaint().ascent() + j0Var.getPaint().descent()) / 2.0f)), j0Var.getPaint());
                    return;
                }
                return;
            default:
                RectF rectF2 = (RectF) obj2;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                v1 v1Var = (v1) frameLayout;
                x0 x0Var = (x0) obj;
                x0Var.d(((View) v1Var.getParent()).getX() + v1Var.getX() + ((View) getParent()).getX() + getX(), ((View) v1Var.getParent()).getY() + v1Var.getY() + ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), x0Var.b());
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f31483a) {
            case 0:
                ud1 ud1Var = (ud1) this.d;
                j2.f fVar = ud1Var.P;
                super.onSizeChanged(i10, i11, i12, i13);
                int i14 = 0;
                while (true) {
                    Paint[] paintArr = (Paint[]) this.f31485c;
                    if (i14 < paintArr.length) {
                        if (i14 == 0) {
                            paintArr[i14] = (Paint) fVar.f9347a;
                        } else if (i14 == 1) {
                            paintArr[i14] = (Paint) ud1Var.Q.f9347a;
                        } else {
                            paintArr[i14] = (Paint) fVar.f9347a;
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

    public j0(ud1 ud1Var, Context context) {
        super(context);
        this.d = ud1Var;
        Paint paint = new Paint();
        this.f31484b = paint;
        this.f31485c = new Paint[ud1Var.e.length];
        jb0 jb0Var = ud1Var.R;
        jb0Var.setBounds(0, 0, 80, 80);
        jb0 jb0Var2 = ud1Var.S;
        jb0Var2.setBounds(0, 0, 80, 80);
        j2.f fVar = ud1Var.P;
        fVar.x(0.0f, 0.0f, 80.0f, 80.0f);
        j2.f fVar2 = ud1Var.Q;
        fVar2.x(0.0f, 0.0f, 80.0f, 80.0f);
        jb0Var.setAlpha(255);
        jb0Var2.setAlpha(255);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        ((Canvas) fVar.f9348b).drawColor(0, mode);
        ((Canvas) fVar2.f9348b).drawColor(0, mode);
        jb0Var.draw((Canvas) fVar.f9348b);
        jb0Var2.draw((Canvas) fVar2.f9348b);
        paint.setColor(-1);
    }
}
