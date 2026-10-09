package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class el0 extends s4.t0 {
    public boolean f26106a;
    public boolean f26107b;
    public ValueAnimator f26108c;
    public ValueAnimator d;
    public final kl0 f26109e;

    public el0(kl0 kl0Var) {
        this.f26109e = kl0Var;
    }

    public static ValueAnimator c(float f7, float f10, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(Math.abs(f10 - f7) * 150.0f);
        duration.addUpdateListener(new j80(aVar, 9));
        duration.addListener(new org.telegram.ui.r0(1, runnable));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        kl0 kl0Var = this.f26109e;
        gg.i0 i0Var = kl0Var.W;
        boolean z11 = false;
        if (i0Var.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (z10 != this.f26106a) {
            ValueAnimator valueAnimator = this.f26108c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = kl0Var.f28096r;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f26108c = c(f11, f7, new q0.a(this) {
                public final el0 f25434b;

                {
                    this.f25434b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f12 = (Float) obj;
                    switch (r2) {
                        case 0:
                            kl0 kl0Var2 = this.f25434b.f26109e;
                            Paint paint = kl0Var2.h;
                            float floatValue = f12.floatValue();
                            kl0Var2.f28096r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            kl0Var2.invalidate();
                            return;
                        default:
                            kl0 kl0Var3 = this.f25434b.f26109e;
                            Paint paint2 = kl0Var3.f28091n;
                            float floatValue2 = f12.floatValue();
                            kl0Var3.f28098s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            kl0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final el0 f25738b;

                {
                    this.f25738b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f25738b.f26108c = null;
                            return;
                        default:
                            this.f25738b.d = null;
                            return;
                    }
                }
            });
            this.f26106a = z10;
        }
        if (i0Var.N0() != kl0Var.f28065a0.h() - 1) {
            z11 = true;
        }
        if (z11 != this.f26107b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f12 = kl0Var.f28098s;
            if (z11) {
                f10 = 1.0f;
            }
            this.d = c(f12, f10, new q0.a(this) {
                public final el0 f25434b;

                {
                    this.f25434b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f122 = (Float) obj;
                    switch (r2) {
                        case 0:
                            kl0 kl0Var2 = this.f25434b.f26109e;
                            Paint paint = kl0Var2.h;
                            float floatValue = f122.floatValue();
                            kl0Var2.f28096r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            kl0Var2.invalidate();
                            return;
                        default:
                            kl0 kl0Var3 = this.f25434b.f26109e;
                            Paint paint2 = kl0Var3.f28091n;
                            float floatValue2 = f122.floatValue();
                            kl0Var3.f28098s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            kl0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final el0 f25738b;

                {
                    this.f25738b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f25738b.f26108c = null;
                            return;
                        default:
                            this.f25738b.d = null;
                            return;
                    }
                }
            });
            this.f26107b = z11;
        }
    }
}
