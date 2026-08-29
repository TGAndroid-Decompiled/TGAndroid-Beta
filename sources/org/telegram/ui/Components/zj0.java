package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class zj0 extends f2.a1 {
    public boolean f35356a;
    public boolean f35357b;
    public ValueAnimator f35358c;
    public ValueAnimator d;
    public final fk0 f35359e;

    public zj0(fk0 fk0Var) {
        this.f35359e = fk0Var;
    }

    public static ValueAnimator c(float f9, float f10, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f9, f10).setDuration(Math.abs(f10 - f9) * 150.0f);
        duration.addUpdateListener(new d70(aVar, 8));
        duration.addListener(new org.telegram.ui.u0(1, runnable));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f9;
        fk0 fk0Var = this.f35359e;
        org.telegram.ui.vq vqVar = fk0Var.S;
        boolean z11 = false;
        if (vqVar.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (z10 != this.f35356a) {
            ValueAnimator valueAnimator = this.f35358c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = fk0Var.f28459r;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            this.f35358c = c(f11, f9, new q0.a(this) {
                public final zj0 f34767b;

                {
                    this.f34767b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f12 = (Float) obj;
                    switch (r2) {
                        case 0:
                            fk0 fk0Var2 = this.f34767b.f35359e;
                            Paint paint = fk0Var2.h;
                            float floatValue = f12.floatValue();
                            fk0Var2.f28459r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            fk0Var2.invalidate();
                            return;
                        default:
                            fk0 fk0Var3 = this.f34767b.f35359e;
                            Paint paint2 = fk0Var3.f28454n;
                            float floatValue2 = f12.floatValue();
                            fk0Var3.f28461s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            fk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final zj0 f35084b;

                {
                    this.f35084b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f35084b.f35358c = null;
                            return;
                        default:
                            this.f35084b.d = null;
                            return;
                    }
                }
            });
            this.f35356a = z10;
        }
        if (vqVar.N0() != fk0Var.T.h() - 1) {
            z11 = true;
        }
        if (z11 != this.f35357b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f12 = fk0Var.f28461s;
            if (z11) {
                f10 = 1.0f;
            }
            this.d = c(f12, f10, new q0.a(this) {
                public final zj0 f34767b;

                {
                    this.f34767b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f122 = (Float) obj;
                    switch (r2) {
                        case 0:
                            fk0 fk0Var2 = this.f34767b.f35359e;
                            Paint paint = fk0Var2.h;
                            float floatValue = f122.floatValue();
                            fk0Var2.f28459r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            fk0Var2.invalidate();
                            return;
                        default:
                            fk0 fk0Var3 = this.f34767b.f35359e;
                            Paint paint2 = fk0Var3.f28454n;
                            float floatValue2 = f122.floatValue();
                            fk0Var3.f28461s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            fk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final zj0 f35084b;

                {
                    this.f35084b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f35084b.f35358c = null;
                            return;
                        default:
                            this.f35084b.d = null;
                            return;
                    }
                }
            });
            this.f35357b = z11;
        }
    }
}
