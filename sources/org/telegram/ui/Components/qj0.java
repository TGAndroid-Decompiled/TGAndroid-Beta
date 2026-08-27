package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;

public final class qj0 extends f2.b1 {

    public boolean f31915a;

    public boolean f31916b;

    public ValueAnimator f31917c;
    public ValueAnimator d;

    public final wj0 f31918e;

    public qj0(wj0 wj0Var) {
        this.f31918e = wj0Var;
    }

    public static ValueAnimator c(float f10, float f11, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration((long) (Math.abs(f11 - f10) * 150.0f));
        duration.addUpdateListener(new v60(aVar, 8));
        duration.addListener(new org.telegram.ui.u0(1, runnable));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        wj0 wj0Var = this.f31918e;
        org.telegram.ui.vq vqVar = wj0Var.S;
        boolean z10 = vqVar.L0() != 0;
        if (z10 != this.f31915a) {
            ValueAnimator valueAnimator = this.f31917c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            final int i12 = 0;
            final int i13 = 0;
            this.f31917c = c(wj0Var.f34261r, z10 ? 1.0f : 0.0f, new q0.a(this) {

                public final qj0 f31344b;

                {
                    this.f31344b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f10 = (Float) obj;
                    switch (i12) {
                        case 0:
                            wj0 wj0Var2 = this.f31344b.f31918e;
                            Paint paint = wj0Var2.h;
                            float fFloatValue = f10.floatValue();
                            wj0Var2.f34261r = fFloatValue;
                            paint.setAlpha((int) (fFloatValue * 255.0f));
                            wj0Var2.invalidate();
                            break;
                        default:
                            wj0 wj0Var3 = this.f31344b.f31918e;
                            Paint paint2 = wj0Var3.f34256n;
                            float fFloatValue2 = f10.floatValue();
                            wj0Var3.f34263s = fFloatValue2;
                            paint2.setAlpha((int) (fFloatValue2 * 255.0f));
                            wj0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) {

                public final qj0 f31622b;

                {
                    this.f31622b = this;
                }

                @Override
                public final void run() {
                    switch (i13) {
                        case 0:
                            this.f31622b.f31917c = null;
                            break;
                        default:
                            this.f31622b.d = null;
                            break;
                    }
                }
            });
            this.f31915a = z10;
        }
        boolean z11 = vqVar.N0() != wj0Var.T.h() - 1;
        if (z11 != this.f31916b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            final int i14 = 1;
            final int i15 = 1;
            this.d = c(wj0Var.f34263s, z11 ? 1.0f : 0.0f, new q0.a(this) {

                public final qj0 f31344b;

                {
                    this.f31344b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f10 = (Float) obj;
                    switch (i14) {
                        case 0:
                            wj0 wj0Var2 = this.f31344b.f31918e;
                            Paint paint = wj0Var2.h;
                            float fFloatValue = f10.floatValue();
                            wj0Var2.f34261r = fFloatValue;
                            paint.setAlpha((int) (fFloatValue * 255.0f));
                            wj0Var2.invalidate();
                            break;
                        default:
                            wj0 wj0Var3 = this.f31344b.f31918e;
                            Paint paint2 = wj0Var3.f34256n;
                            float fFloatValue2 = f10.floatValue();
                            wj0Var3.f34263s = fFloatValue2;
                            paint2.setAlpha((int) (fFloatValue2 * 255.0f));
                            wj0Var3.invalidate();
                            break;
                    }
                }
            }, new Runnable(this) {

                public final qj0 f31622b;

                {
                    this.f31622b = this;
                }

                @Override
                public final void run() {
                    switch (i15) {
                        case 0:
                            this.f31622b.f31917c = null;
                            break;
                        default:
                            this.f31622b.d = null;
                            break;
                    }
                }
            });
            this.f31916b = z11;
        }
    }
}
