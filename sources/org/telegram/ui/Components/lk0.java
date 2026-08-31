package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class lk0 extends f2.a1 {
    public boolean f28761a;
    public boolean f28762b;
    public ValueAnimator f28763c;
    public ValueAnimator d;
    public final rk0 f28764e;

    public lk0(rk0 rk0Var) {
        this.f28764e = rk0Var;
    }

    public static ValueAnimator c(float f10, float f11, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(Math.abs(f11 - f10) * 150.0f);
        duration.addUpdateListener(new k70(aVar, 8));
        duration.addListener(new org.telegram.ui.s0(1, runnable));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z4;
        float f10;
        rk0 rk0Var = this.f28764e;
        org.telegram.ui.cr crVar = rk0Var.T;
        boolean z10 = false;
        if (crVar.L0() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        float f11 = 0.0f;
        if (z4 != this.f28761a) {
            ValueAnimator valueAnimator = this.f28763c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f12 = rk0Var.f30781r;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f28763c = c(f12, f10, new q0.a(this) {
                public final lk0 f28149b;

                {
                    this.f28149b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f13 = (Float) obj;
                    switch (r2) {
                        case 0:
                            rk0 rk0Var2 = this.f28149b.f28764e;
                            Paint paint = rk0Var2.h;
                            float floatValue = f13.floatValue();
                            rk0Var2.f30781r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            rk0Var2.invalidate();
                            return;
                        default:
                            rk0 rk0Var3 = this.f28149b.f28764e;
                            Paint paint2 = rk0Var3.f30776n;
                            float floatValue2 = f13.floatValue();
                            rk0Var3.f30783s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            rk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final lk0 f28410b;

                {
                    this.f28410b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f28410b.f28763c = null;
                            return;
                        default:
                            this.f28410b.d = null;
                            return;
                    }
                }
            });
            this.f28761a = z4;
        }
        if (crVar.N0() != rk0Var.U.h() - 1) {
            z10 = true;
        }
        if (z10 != this.f28762b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f13 = rk0Var.f30783s;
            if (z10) {
                f11 = 1.0f;
            }
            this.d = c(f13, f11, new q0.a(this) {
                public final lk0 f28149b;

                {
                    this.f28149b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f132 = (Float) obj;
                    switch (r2) {
                        case 0:
                            rk0 rk0Var2 = this.f28149b.f28764e;
                            Paint paint = rk0Var2.h;
                            float floatValue = f132.floatValue();
                            rk0Var2.f30781r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            rk0Var2.invalidate();
                            return;
                        default:
                            rk0 rk0Var3 = this.f28149b.f28764e;
                            Paint paint2 = rk0Var3.f30776n;
                            float floatValue2 = f132.floatValue();
                            rk0Var3.f30783s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            rk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final lk0 f28410b;

                {
                    this.f28410b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f28410b.f28763c = null;
                            return;
                        default:
                            this.f28410b.d = null;
                            return;
                    }
                }
            });
            this.f28762b = z10;
        }
    }
}
