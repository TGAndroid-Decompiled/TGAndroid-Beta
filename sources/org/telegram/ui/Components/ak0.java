package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class ak0 extends s4.s0 {
    public boolean f22461a;
    public boolean f22462b;
    public ValueAnimator f22463c;
    public ValueAnimator d;
    public final gk0 e;

    public ak0(gk0 gk0Var) {
        this.e = gk0Var;
    }

    public static ValueAnimator c(float f7, float f10, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(Math.abs(f10 - f7) * 150.0f);
        duration.addUpdateListener(new i70(aVar, 8));
        duration.addListener(new org.telegram.ui.r0(1, runnable));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        gk0 gk0Var = this.e;
        gg.j0 j0Var = gk0Var.W;
        boolean z11 = false;
        if (j0Var.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (z10 != this.f22461a) {
            ValueAnimator valueAnimator = this.f22463c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = gk0Var.f24349r;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f22463c = c(f11, f7, new q0.a(this) {
                public final ak0 f30303b;

                {
                    this.f30303b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f12 = (Float) obj;
                    switch (r2) {
                        case 0:
                            gk0 gk0Var2 = this.f30303b.e;
                            Paint paint = gk0Var2.h;
                            float floatValue = f12.floatValue();
                            gk0Var2.f24349r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            gk0Var2.invalidate();
                            return;
                        default:
                            gk0 gk0Var3 = this.f30303b.e;
                            Paint paint2 = gk0Var3.f24344n;
                            float floatValue2 = f12.floatValue();
                            gk0Var3.f24351s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            gk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final ak0 f30614b;

                {
                    this.f30614b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f30614b.f22463c = null;
                            return;
                        default:
                            this.f30614b.d = null;
                            return;
                    }
                }
            });
            this.f22461a = z10;
        }
        if (j0Var.N0() != gk0Var.f24319a0.h() - 1) {
            z11 = true;
        }
        if (z11 != this.f22462b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f12 = gk0Var.f24351s;
            if (z11) {
                f10 = 1.0f;
            }
            this.d = c(f12, f10, new q0.a(this) {
                public final ak0 f30303b;

                {
                    this.f30303b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f122 = (Float) obj;
                    switch (r2) {
                        case 0:
                            gk0 gk0Var2 = this.f30303b.e;
                            Paint paint = gk0Var2.h;
                            float floatValue = f122.floatValue();
                            gk0Var2.f24349r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            gk0Var2.invalidate();
                            return;
                        default:
                            gk0 gk0Var3 = this.f30303b.e;
                            Paint paint2 = gk0Var3.f24344n;
                            float floatValue2 = f122.floatValue();
                            gk0Var3.f24351s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            gk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final ak0 f30614b;

                {
                    this.f30614b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f30614b.f22463c = null;
                            return;
                        default:
                            this.f30614b.d = null;
                            return;
                    }
                }
            });
            this.f22462b = z11;
        }
    }
}
