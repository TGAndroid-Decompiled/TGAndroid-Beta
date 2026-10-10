package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class fl0 extends s4.t0 {
    public boolean f26435a;
    public boolean f26436b;
    public ValueAnimator f26437c;
    public ValueAnimator d;
    public final ll0 f26438e;

    public fl0(ll0 ll0Var) {
        this.f26438e = ll0Var;
    }

    public static ValueAnimator c(float f7, float f10, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(Math.abs(f10 - f7) * 150.0f);
        duration.addUpdateListener(new k80(aVar, 9));
        duration.addListener(new org.telegram.ui.r0(1, runnable));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        ll0 ll0Var = this.f26438e;
        gg.i0 i0Var = ll0Var.W;
        boolean z11 = false;
        if (i0Var.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (z10 != this.f26435a) {
            ValueAnimator valueAnimator = this.f26437c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = ll0Var.f28411r;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f26437c = c(f11, f7, new q0.a(this) {
                public final fl0 f25762b;

                {
                    this.f25762b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f12 = (Float) obj;
                    switch (r2) {
                        case 0:
                            ll0 ll0Var2 = this.f25762b.f26438e;
                            Paint paint = ll0Var2.h;
                            float floatValue = f12.floatValue();
                            ll0Var2.f28411r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            ll0Var2.invalidate();
                            return;
                        default:
                            ll0 ll0Var3 = this.f25762b.f26438e;
                            Paint paint2 = ll0Var3.f28406n;
                            float floatValue2 = f12.floatValue();
                            ll0Var3.f28413s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            ll0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final fl0 f26077b;

                {
                    this.f26077b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f26077b.f26437c = null;
                            return;
                        default:
                            this.f26077b.d = null;
                            return;
                    }
                }
            });
            this.f26435a = z10;
        }
        if (i0Var.N0() != ll0Var.f28380a0.h() - 1) {
            z11 = true;
        }
        if (z11 != this.f26436b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f12 = ll0Var.f28413s;
            if (z11) {
                f10 = 1.0f;
            }
            this.d = c(f12, f10, new q0.a(this) {
                public final fl0 f25762b;

                {
                    this.f25762b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f122 = (Float) obj;
                    switch (r2) {
                        case 0:
                            ll0 ll0Var2 = this.f25762b.f26438e;
                            Paint paint = ll0Var2.h;
                            float floatValue = f122.floatValue();
                            ll0Var2.f28411r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            ll0Var2.invalidate();
                            return;
                        default:
                            ll0 ll0Var3 = this.f25762b.f26438e;
                            Paint paint2 = ll0Var3.f28406n;
                            float floatValue2 = f122.floatValue();
                            ll0Var3.f28413s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            ll0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final fl0 f26077b;

                {
                    this.f26077b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f26077b.f26437c = null;
                            return;
                        default:
                            this.f26077b.d = null;
                            return;
                    }
                }
            });
            this.f26436b = z11;
        }
    }
}
