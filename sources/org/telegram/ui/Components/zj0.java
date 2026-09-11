package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class zj0 extends s4.s0 {
    public boolean f33166a;
    public boolean f33167b;
    public ValueAnimator f33168c;
    public ValueAnimator d;
    public final fk0 f33169e;

    public zj0(fk0 fk0Var) {
        this.f33169e = fk0Var;
    }

    public static ValueAnimator c(float f7, float f10, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(Math.abs(f10 - f7) * 150.0f);
        duration.addUpdateListener(new h70(aVar, 8));
        duration.addListener(new org.telegram.ui.q0(1, runnable));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        fk0 fk0Var = this.f33169e;
        hg.j0 j0Var = fk0Var.W;
        boolean z11 = false;
        if (j0Var.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (z10 != this.f33166a) {
            ValueAnimator valueAnimator = this.f33168c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = fk0Var.f26109r;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f33168c = c(f11, f7, new q0.a(this) {
                public final zj0 f32598b;

                {
                    this.f32598b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f12 = (Float) obj;
                    switch (r2) {
                        case 0:
                            fk0 fk0Var2 = this.f32598b.f33169e;
                            Paint paint = fk0Var2.h;
                            float floatValue = f12.floatValue();
                            fk0Var2.f26109r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            fk0Var2.invalidate();
                            return;
                        default:
                            fk0 fk0Var3 = this.f32598b.f33169e;
                            Paint paint2 = fk0Var3.f26104n;
                            float floatValue2 = f12.floatValue();
                            fk0Var3.f26111s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            fk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final zj0 f32938b;

                {
                    this.f32938b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f32938b.f33168c = null;
                            return;
                        default:
                            this.f32938b.d = null;
                            return;
                    }
                }
            });
            this.f33166a = z10;
        }
        if (j0Var.N0() != fk0Var.f26078a0.h() - 1) {
            z11 = true;
        }
        if (z11 != this.f33167b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f12 = fk0Var.f26111s;
            if (z11) {
                f10 = 1.0f;
            }
            this.d = c(f12, f10, new q0.a(this) {
                public final zj0 f32598b;

                {
                    this.f32598b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f122 = (Float) obj;
                    switch (r2) {
                        case 0:
                            fk0 fk0Var2 = this.f32598b.f33169e;
                            Paint paint = fk0Var2.h;
                            float floatValue = f122.floatValue();
                            fk0Var2.f26109r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            fk0Var2.invalidate();
                            return;
                        default:
                            fk0 fk0Var3 = this.f32598b.f33169e;
                            Paint paint2 = fk0Var3.f26104n;
                            float floatValue2 = f122.floatValue();
                            fk0Var3.f26111s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            fk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final zj0 f32938b;

                {
                    this.f32938b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f32938b.f33168c = null;
                            return;
                        default:
                            this.f32938b.d = null;
                            return;
                    }
                }
            });
            this.f33167b = z11;
        }
    }
}
