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
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.kr;
public final class n5 extends org.telegram.ui.Components.p9 {
    public final Paint H;
    public long I;
    public Drawable J;
    public Drawable K;
    public final r5 L;

    public n5(r5 r5Var, Context context) {
        super(context);
        this.L = r5Var;
        this.H = new Paint(1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        ef efVar;
        Drawable drawable;
        float floatValue;
        org.telegram.ui.Components.o5 o5Var = this.f38432e;
        if (o5Var != null) {
            imageReceiver = o5Var.f38028k;
        } else {
            imageReceiver = this.f38429a;
        }
        if (imageReceiver != null) {
            if (this.f38431c != -1 && this.d != -1) {
                int height = getHeight();
                int i7 = this.d;
                imageReceiver.z0((getWidth() - this.f38431c) / 2, (height - i7) / 2, this.f38431c, i7);
                int height2 = getHeight();
                int i10 = this.d;
                this.f38430b.z0((getWidth() - this.f38431c) / 2, (height2 - i10) / 2, this.f38431c, i10);
            } else {
                imageReceiver.z0(0.0f, 0.0f, getWidth(), getHeight());
                this.f38430b.z0(0.0f, 0.0f, getWidth(), getHeight());
            }
            imageReceiver.h(canvas, null);
            r5 r5Var = this.L;
            if (r5Var.P) {
                Rect rect = r5.f31782c0;
                this.f38430b.h(canvas, null);
                if (r5Var.O == null) {
                    if (r5Var.N == null) {
                        xh.f fVar = new xh.f();
                        r5Var.N = fVar;
                        fVar.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                    }
                    r5Var.N.setBounds(0, 0, getWidth(), getHeight());
                    r5Var.N.draw(canvas);
                }
                invalidate();
            }
            float f10 = r5Var.V;
            int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i11 != 0 && r5Var.T != null) {
                Paint paint = this.H;
                paint.setAlpha((int) (kr.f36858f.getInterpolation(1.0f - f10) * 255.0f));
                canvas.drawBitmap(r5Var.T, 0.0f, 0.0f, paint);
                long min = Math.min(16L, System.currentTimeMillis() - this.I);
                Float f11 = r5Var.U;
                if (f11 == null) {
                    floatValue = 250.0f;
                } else {
                    floatValue = f11.floatValue();
                }
                r5Var.V = c0.f((float) min, floatValue, r5Var.V, 1.0f);
                this.I = System.currentTimeMillis();
                invalidate();
                if (r5Var.O != null) {
                    r5Var.f31785b.invalidate();
                }
            } else if (i11 == 0 && (bitmap = r5Var.T) != null) {
                bitmap.recycle();
                r5Var.T = null;
                r5Var.U = null;
                invalidate();
            }
            if (r5Var.f31792s) {
                p5 p5Var = r5Var.W;
                if ((p5Var == null || !((hm) ((org.telegram.ui.Components.b0) p5Var).f33590b).f35770s) && (efVar = r5Var.I) != null && efVar.i() && r5Var.I.d()) {
                    if (r5Var.I.j()) {
                        if (this.K == null) {
                            this.K = getContext().getResources().getDrawable(2131231750).mutate();
                        }
                        drawable = this.K;
                    } else {
                        if (this.J == null) {
                            this.J = getContext().getResources().getDrawable(2131231751).mutate();
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
        r5 r5Var = this.L;
        ef efVar = r5Var.I;
        if (efVar != null && efVar.M) {
            z10 = true;
        } else {
            z10 = false;
        }
        r5Var.h(z10);
    }
}
