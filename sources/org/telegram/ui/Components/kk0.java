package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class kk0 extends f2.a1 {
    public boolean f28434a;
    public boolean f28435b;
    public ValueAnimator f28436c;
    public ValueAnimator d;
    public final qk0 f28437e;

    public kk0(qk0 qk0Var) {
        this.f28437e = qk0Var;
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
        qk0 qk0Var = this.f28437e;
        org.telegram.ui.cr crVar = qk0Var.T;
        boolean z10 = false;
        if (crVar.L0() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        float f11 = 0.0f;
        if (z4 != this.f28434a) {
            ValueAnimator valueAnimator = this.f28436c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f12 = qk0Var.f30452r;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f28436c = c(f12, f10, new q0.a(this) {
                public final kk0 f27850b;

                {
                    this.f27850b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f13 = (Float) obj;
                    switch (r2) {
                        case 0:
                            qk0 qk0Var2 = this.f27850b.f28437e;
                            Paint paint = qk0Var2.h;
                            float floatValue = f13.floatValue();
                            qk0Var2.f30452r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            qk0Var2.invalidate();
                            return;
                        default:
                            qk0 qk0Var3 = this.f27850b.f28437e;
                            Paint paint2 = qk0Var3.f30447n;
                            float floatValue2 = f13.floatValue();
                            qk0Var3.f30454s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            qk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final kk0 f28138b;

                {
                    this.f28138b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f28138b.f28436c = null;
                            return;
                        default:
                            this.f28138b.d = null;
                            return;
                    }
                }
            });
            this.f28434a = z4;
        }
        if (crVar.N0() != qk0Var.U.h() - 1) {
            z10 = true;
        }
        if (z10 != this.f28435b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f13 = qk0Var.f30454s;
            if (z10) {
                f11 = 1.0f;
            }
            this.d = c(f13, f11, new q0.a(this) {
                public final kk0 f27850b;

                {
                    this.f27850b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f132 = (Float) obj;
                    switch (r2) {
                        case 0:
                            qk0 qk0Var2 = this.f27850b.f28437e;
                            Paint paint = qk0Var2.h;
                            float floatValue = f132.floatValue();
                            qk0Var2.f30452r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            qk0Var2.invalidate();
                            return;
                        default:
                            qk0 qk0Var3 = this.f27850b.f28437e;
                            Paint paint2 = qk0Var3.f30447n;
                            float floatValue2 = f132.floatValue();
                            qk0Var3.f30454s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            qk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final kk0 f28138b;

                {
                    this.f28138b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f28138b.f28436c = null;
                            return;
                        default:
                            this.f28138b.d = null;
                            return;
                    }
                }
            });
            this.f28435b = z10;
        }
    }
}
