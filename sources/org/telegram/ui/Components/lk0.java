package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class lk0 extends s4.s0 {
    public boolean f26101a;
    public boolean f26102b;
    public ValueAnimator f26103c;
    public ValueAnimator d;
    public final rk0 e;

    public lk0(rk0 rk0Var) {
        this.e = rk0Var;
    }

    public static ValueAnimator c(float f7, float f10, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(Math.abs(f10 - f7) * 150.0f);
        duration.addUpdateListener(new t70(aVar, 8));
        duration.addListener(new org.telegram.ui.r0(1, runnable));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        rk0 rk0Var = this.e;
        gg.j0 j0Var = rk0Var.W;
        boolean z11 = false;
        if (j0Var.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (z10 != this.f26101a) {
            ValueAnimator valueAnimator = this.f26103c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = rk0Var.f27979r;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f26103c = c(f11, f7, new q0.a(this) {
                public final lk0 f25459b;

                {
                    this.f25459b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f12 = (Float) obj;
                    switch (r2) {
                        case 0:
                            rk0 rk0Var2 = this.f25459b.e;
                            Paint paint = rk0Var2.h;
                            float floatValue = f12.floatValue();
                            rk0Var2.f27979r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            rk0Var2.invalidate();
                            return;
                        default:
                            rk0 rk0Var3 = this.f25459b.e;
                            Paint paint2 = rk0Var3.f27974n;
                            float floatValue2 = f12.floatValue();
                            rk0Var3.f27981s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            rk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final lk0 f25750b;

                {
                    this.f25750b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f25750b.f26103c = null;
                            return;
                        default:
                            this.f25750b.d = null;
                            return;
                    }
                }
            });
            this.f26101a = z10;
        }
        if (j0Var.N0() != rk0Var.f27949a0.h() - 1) {
            z11 = true;
        }
        if (z11 != this.f26102b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f12 = rk0Var.f27981s;
            if (z11) {
                f10 = 1.0f;
            }
            this.d = c(f12, f10, new q0.a(this) {
                public final lk0 f25459b;

                {
                    this.f25459b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f122 = (Float) obj;
                    switch (r2) {
                        case 0:
                            rk0 rk0Var2 = this.f25459b.e;
                            Paint paint = rk0Var2.h;
                            float floatValue = f122.floatValue();
                            rk0Var2.f27979r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            rk0Var2.invalidate();
                            return;
                        default:
                            rk0 rk0Var3 = this.f25459b.e;
                            Paint paint2 = rk0Var3.f27974n;
                            float floatValue2 = f122.floatValue();
                            rk0Var3.f27981s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            rk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final lk0 f25750b;

                {
                    this.f25750b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f25750b.f26103c = null;
                            return;
                        default:
                            this.f25750b.d = null;
                            return;
                    }
                }
            });
            this.f26102b = z11;
        }
    }
}
