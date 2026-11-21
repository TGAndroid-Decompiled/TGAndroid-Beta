package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ef;
import org.telegram.ui.Components.jm;
import org.telegram.ui.Components.nr;
public final class o5 extends org.telegram.ui.Components.q9 {
    public final Paint H;
    public long I;
    public Drawable J;
    public Drawable K;
    public final s5 L;

    public o5(s5 s5Var, Context context) {
        super(context);
        this.L = s5Var;
        this.H = new Paint(1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        ef efVar;
        Drawable drawable;
        float floatValue;
        org.telegram.ui.Components.p5 p5Var = this.f38845e;
        if (p5Var != null) {
            imageReceiver = p5Var.f38501k;
        } else {
            imageReceiver = this.f38842a;
        }
        if (imageReceiver != null) {
            if (this.f38844c != -1 && this.d != -1) {
                int height = getHeight();
                int i7 = this.d;
                imageReceiver.y0((getWidth() - this.f38844c) / 2, (height - i7) / 2, this.f38844c, i7);
                int height2 = getHeight();
                int i10 = this.d;
                this.f38843b.y0((getWidth() - this.f38844c) / 2, (height2 - i10) / 2, this.f38844c, i10);
            } else {
                imageReceiver.y0(0.0f, 0.0f, getWidth(), getHeight());
                this.f38843b.y0(0.0f, 0.0f, getWidth(), getHeight());
            }
            imageReceiver.h(canvas, null);
            s5 s5Var = this.L;
            if (s5Var.P) {
                Rect rect = s5.f31780c0;
                this.f38843b.h(canvas, null);
                if (s5Var.O == null) {
                    if (s5Var.N == null) {
                        xh.f fVar = new xh.f();
                        s5Var.N = fVar;
                        fVar.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                    }
                    s5Var.N.setBounds(0, 0, getWidth(), getHeight());
                    s5Var.N.draw(canvas);
                }
                invalidate();
            }
            float f10 = s5Var.V;
            int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i11 != 0 && s5Var.T != null) {
                Paint paint = this.H;
                paint.setAlpha((int) (nr.f37956f.getInterpolation(1.0f - f10) * 255.0f));
                canvas.drawBitmap(s5Var.T, 0.0f, 0.0f, paint);
                long min = Math.min(16L, System.currentTimeMillis() - this.I);
                Float f11 = s5Var.U;
                if (f11 == null) {
                    floatValue = 250.0f;
                } else {
                    floatValue = f11.floatValue();
                }
                s5Var.V = c0.f((float) min, floatValue, s5Var.V, 1.0f);
                this.I = System.currentTimeMillis();
                invalidate();
                if (s5Var.O != null) {
                    s5Var.f31783b.invalidate();
                }
            } else if (i11 == 0 && (bitmap = s5Var.T) != null) {
                bitmap.recycle();
                s5Var.T = null;
                s5Var.U = null;
                invalidate();
            }
            if (s5Var.f31790s) {
                q5 q5Var = s5Var.W;
                if ((q5Var == null || !((jm) ((org.telegram.ui.Components.c0) q5Var).f33958b).f36565s) && (efVar = s5Var.I) != null && efVar.i() && s5Var.I.d()) {
                    if (s5Var.I.j()) {
                        if (this.K == null) {
                            this.K = getContext().getResources().getDrawable(2131231747).mutate();
                        }
                        drawable = this.K;
                    } else {
                        if (this.J == null) {
                            this.J = getContext().getResources().getDrawable(2131231748).mutate();
                        }
                        drawable = this.J;
                    }
                    drawable.setBounds((int) (imageReceiver.L0 + org.telegram.messenger.g0.L(8.0f)), (int) (imageReceiver.M0 + org.telegram.messenger.g0.L(8.0f)), (int) (imageReceiver.L0 + org.telegram.messenger.g0.L(30.0f)), (int) (imageReceiver.M0 + org.telegram.messenger.g0.L(26.0f)));
                    drawable.draw(canvas);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        super.onMeasure(i7, i10);
        s5 s5Var = this.L;
        ef efVar = s5Var.I;
        if (efVar != null && efVar.M) {
            z10 = true;
        } else {
            z10 = false;
        }
        s5Var.h(z10);
    }
}
