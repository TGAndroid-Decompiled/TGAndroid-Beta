package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gf;
import org.telegram.ui.Components.tl;
import org.telegram.ui.Components.xq;
public final class m5 extends org.telegram.ui.Components.l9 {
    public final Paint G;
    public long H;
    public Drawable I;
    public Drawable J;
    public final q5 K;

    public m5(q5 q5Var, Context context) {
        super(context);
        this.K = q5Var;
        this.G = new Paint(1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        gf gfVar;
        Drawable drawable;
        float floatValue;
        org.telegram.ui.Components.i5 i5Var = this.f35603e;
        if (i5Var != null) {
            imageReceiver = i5Var.f34541k;
        } else {
            imageReceiver = this.f35600a;
        }
        if (imageReceiver != null) {
            if (this.f35602c != -1 && this.d != -1) {
                int height = getHeight();
                int i7 = this.d;
                imageReceiver.y0((getWidth() - this.f35602c) / 2, (height - i7) / 2, this.f35602c, i7);
                int height2 = getHeight();
                int i10 = this.d;
                this.f35601b.y0((getWidth() - this.f35602c) / 2, (height2 - i10) / 2, this.f35602c, i10);
            } else {
                imageReceiver.y0(0.0f, 0.0f, getWidth(), getHeight());
                this.f35601b.y0(0.0f, 0.0f, getWidth(), getHeight());
            }
            imageReceiver.h(canvas, null);
            q5 q5Var = this.K;
            if (q5Var.O) {
                Rect rect = q5.f30131b0;
                this.f35601b.h(canvas, null);
                if (q5Var.N == null) {
                    if (q5Var.M == null) {
                        xh.f fVar = new xh.f();
                        q5Var.M = fVar;
                        fVar.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                    }
                    q5Var.M.setBounds(0, 0, getWidth(), getHeight());
                    q5Var.M.draw(canvas);
                }
                invalidate();
            }
            float f10 = q5Var.U;
            int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i11 != 0 && q5Var.S != null) {
                Paint paint = this.G;
                paint.setAlpha((int) (xq.f40366f.getInterpolation(1.0f - f10) * 255.0f));
                canvas.drawBitmap(q5Var.S, 0.0f, 0.0f, paint);
                long min = Math.min(16L, System.currentTimeMillis() - this.H);
                Float f11 = q5Var.T;
                if (f11 == null) {
                    floatValue = 250.0f;
                } else {
                    floatValue = f11.floatValue();
                }
                q5Var.U = f1.e((float) min, floatValue, q5Var.U, 1.0f);
                this.H = System.currentTimeMillis();
                invalidate();
                if (q5Var.N != null) {
                    q5Var.f30134b.invalidate();
                }
            } else if (i11 == 0 && (bitmap = q5Var.S) != null) {
                bitmap.recycle();
                q5Var.S = null;
                q5Var.T = null;
                invalidate();
            }
            if (q5Var.f30140s) {
                o5 o5Var = q5Var.V;
                if ((o5Var == null || !((tl) ((org.telegram.ui.Components.u) o5Var).f38469b).f38385s) && (gfVar = q5Var.H) != null && gfVar.i() && q5Var.H.d()) {
                    if (q5Var.H.j()) {
                        if (this.J == null) {
                            this.J = getContext().getResources().getDrawable(2131231746).mutate();
                        }
                        drawable = this.J;
                    } else {
                        if (this.I == null) {
                            this.I = getContext().getResources().getDrawable(2131231747).mutate();
                        }
                        drawable = this.I;
                    }
                    drawable.setBounds((int) (imageReceiver.K0 + org.telegram.messenger.g0.L(8.0f)), (int) (imageReceiver.L0 + org.telegram.messenger.g0.L(8.0f)), (int) (imageReceiver.K0 + org.telegram.messenger.g0.L(30.0f)), (int) (imageReceiver.L0 + org.telegram.messenger.g0.L(26.0f)));
                    drawable.draw(canvas);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9;
        super.onMeasure(i7, i10);
        q5 q5Var = this.K;
        gf gfVar = q5Var.H;
        if (gfVar != null && gfVar.M) {
            z9 = true;
        } else {
            z9 = false;
        }
        q5Var.h(z9);
    }
}
