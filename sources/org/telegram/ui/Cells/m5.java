package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ff;
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.er;
public final class m5 extends org.telegram.ui.Components.i9 {
    public final Paint H;
    public long I;
    public Drawable J;
    public Drawable K;
    public final q5 L;

    public m5(q5 q5Var, Context context) {
        super(context);
        this.L = q5Var;
        this.H = new Paint(1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        ff ffVar;
        Drawable drawable;
        float floatValue;
        org.telegram.ui.Components.g5 g5Var = this.f35502e;
        if (g5Var != null) {
            imageReceiver = g5Var.f34813k;
        } else {
            imageReceiver = this.f35499a;
        }
        if (imageReceiver != null) {
            if (this.f35501c != -1 && this.d != -1) {
                int height = getHeight();
                int i7 = this.d;
                imageReceiver.y0((getWidth() - this.f35501c) / 2, (height - i7) / 2, this.f35501c, i7);
                int height2 = getHeight();
                int i10 = this.d;
                this.f35500b.y0((getWidth() - this.f35501c) / 2, (height2 - i10) / 2, this.f35501c, i10);
            } else {
                imageReceiver.y0(0.0f, 0.0f, getWidth(), getHeight());
                this.f35500b.y0(0.0f, 0.0f, getWidth(), getHeight());
            }
            imageReceiver.h(canvas, null);
            q5 q5Var = this.L;
            if (q5Var.P) {
                Rect rect = q5.f31279c0;
                this.f35500b.h(canvas, null);
                if (q5Var.O == null) {
                    if (q5Var.N == null) {
                        xh.f fVar = new xh.f();
                        q5Var.N = fVar;
                        fVar.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                    }
                    q5Var.N.setBounds(0, 0, getWidth(), getHeight());
                    q5Var.N.draw(canvas);
                }
                invalidate();
            }
            float f10 = q5Var.V;
            int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i11 != 0 && q5Var.T != null) {
                Paint paint = this.H;
                paint.setAlpha((int) (er.f34419f.getInterpolation(1.0f - f10) * 255.0f));
                canvas.drawBitmap(q5Var.T, 0.0f, 0.0f, paint);
                long min = Math.min(16L, System.currentTimeMillis() - this.I);
                Float f11 = q5Var.U;
                if (f11 == null) {
                    floatValue = 250.0f;
                } else {
                    floatValue = f11.floatValue();
                }
                q5Var.V = y0.e((float) min, floatValue, q5Var.V, 1.0f);
                this.I = System.currentTimeMillis();
                invalidate();
                if (q5Var.O != null) {
                    q5Var.f31282b.invalidate();
                }
            } else if (i11 == 0 && (bitmap = q5Var.T) != null) {
                bitmap.recycle();
                q5Var.T = null;
                q5Var.U = null;
                invalidate();
            }
            if (q5Var.f31289s) {
                o5 o5Var = q5Var.W;
                if ((o5Var == null || !((am) ((org.telegram.ui.Components.s) o5Var).f39116b).f33022s) && (ffVar = q5Var.I) != null && ffVar.i() && q5Var.I.d()) {
                    if (q5Var.I.j()) {
                        if (this.K == null) {
                            this.K = getContext().getResources().getDrawable(2131231746).mutate();
                        }
                        drawable = this.K;
                    } else {
                        if (this.J == null) {
                            this.J = getContext().getResources().getDrawable(2131231747).mutate();
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
        q5 q5Var = this.L;
        ff ffVar = q5Var.I;
        if (ffVar != null && ffVar.M) {
            z10 = true;
        } else {
            z10 = false;
        }
        q5Var.h(z10);
    }
}
