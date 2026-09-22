package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class mk0 extends s4.s0 {
    public boolean f26462a;
    public boolean f26463b;
    public ValueAnimator f26464c;
    public ValueAnimator d;
    public final sk0 e;

    public mk0(sk0 sk0Var) {
        this.e = sk0Var;
    }

    public static ValueAnimator c(float f7, float f10, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(Math.abs(f10 - f7) * 150.0f);
        duration.addUpdateListener(new s70(aVar, 8));
        duration.addListener(new org.telegram.ui.q0(1, runnable));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        sk0 sk0Var = this.e;
        gg.j0 j0Var = sk0Var.W;
        boolean z11 = false;
        if (j0Var.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (z10 != this.f26462a) {
            ValueAnimator valueAnimator = this.f26464c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = sk0Var.f28257r;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f26464c = c(f11, f7, new q0.a(this) {
                public final mk0 f25752b;

                {
                    this.f25752b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f12 = (Float) obj;
                    switch (r2) {
                        case 0:
                            sk0 sk0Var2 = this.f25752b.e;
                            Paint paint = sk0Var2.h;
                            float floatValue = f12.floatValue();
                            sk0Var2.f28257r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            sk0Var2.invalidate();
                            return;
                        default:
                            sk0 sk0Var3 = this.f25752b.e;
                            Paint paint2 = sk0Var3.f28252n;
                            float floatValue2 = f12.floatValue();
                            sk0Var3.f28259s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            sk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final mk0 f26134b;

                {
                    this.f26134b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f26134b.f26464c = null;
                            return;
                        default:
                            this.f26134b.d = null;
                            return;
                    }
                }
            });
            this.f26462a = z10;
        }
        if (j0Var.N0() != sk0Var.f28227a0.h() - 1) {
            z11 = true;
        }
        if (z11 != this.f26463b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f12 = sk0Var.f28259s;
            if (z11) {
                f10 = 1.0f;
            }
            this.d = c(f12, f10, new q0.a(this) {
                public final mk0 f25752b;

                {
                    this.f25752b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f122 = (Float) obj;
                    switch (r2) {
                        case 0:
                            sk0 sk0Var2 = this.f25752b.e;
                            Paint paint = sk0Var2.h;
                            float floatValue = f122.floatValue();
                            sk0Var2.f28257r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            sk0Var2.invalidate();
                            return;
                        default:
                            sk0 sk0Var3 = this.f25752b.e;
                            Paint paint2 = sk0Var3.f28252n;
                            float floatValue2 = f122.floatValue();
                            sk0Var3.f28259s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            sk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final mk0 f26134b;

                {
                    this.f26134b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f26134b.f26464c = null;
                            return;
                        default:
                            this.f26134b.d = null;
                            return;
                    }
                }
            });
            this.f26463b = z11;
        }
    }
}
