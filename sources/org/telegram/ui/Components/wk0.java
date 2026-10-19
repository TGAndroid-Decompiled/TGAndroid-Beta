package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class wk0 extends s4.r0 {
    public boolean f32146a;
    public boolean f32147b;
    public ValueAnimator f32148c;
    public ValueAnimator d;
    public final cl0 e;

    public wk0(cl0 cl0Var) {
        this.e = cl0Var;
    }

    public static ValueAnimator c(float f7, float f10, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(Math.abs(f10 - f7) * 150.0f);
        duration.addUpdateListener(new b80(aVar, 9));
        duration.addListener(new org.telegram.ui.t0(1, runnable));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        cl0 cl0Var = this.e;
        hg.i0 i0Var = cl0Var.W;
        boolean z11 = false;
        if (i0Var.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (z10 != this.f32146a) {
            ValueAnimator valueAnimator = this.f32148c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = cl0Var.f25266r;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f32148c = c(f11, f7, new q0.a(this) {
                public final wk0 f31013b;

                {
                    this.f31013b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f12 = (Float) obj;
                    switch (r2) {
                        case 0:
                            cl0 cl0Var2 = this.f31013b.e;
                            Paint paint = cl0Var2.h;
                            float floatValue = f12.floatValue();
                            cl0Var2.f25266r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            cl0Var2.invalidate();
                            return;
                        default:
                            cl0 cl0Var3 = this.f31013b.e;
                            Paint paint2 = cl0Var3.f25261n;
                            float floatValue2 = f12.floatValue();
                            cl0Var3.f25268s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            cl0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final wk0 f31319b;

                {
                    this.f31319b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f31319b.f32148c = null;
                            return;
                        default:
                            this.f31319b.d = null;
                            return;
                    }
                }
            });
            this.f32146a = z10;
        }
        if (i0Var.N0() != cl0Var.f25236a0.h() - 1) {
            z11 = true;
        }
        if (z11 != this.f32147b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f12 = cl0Var.f25268s;
            if (z11) {
                f10 = 1.0f;
            }
            this.d = c(f12, f10, new q0.a(this) {
                public final wk0 f31013b;

                {
                    this.f31013b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f122 = (Float) obj;
                    switch (r2) {
                        case 0:
                            cl0 cl0Var2 = this.f31013b.e;
                            Paint paint = cl0Var2.h;
                            float floatValue = f122.floatValue();
                            cl0Var2.f25266r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            cl0Var2.invalidate();
                            return;
                        default:
                            cl0 cl0Var3 = this.f31013b.e;
                            Paint paint2 = cl0Var3.f25261n;
                            float floatValue2 = f122.floatValue();
                            cl0Var3.f25268s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            cl0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final wk0 f31319b;

                {
                    this.f31319b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f31319b.f32148c = null;
                            return;
                        default:
                            this.f31319b.d = null;
                            return;
                    }
                }
            });
            this.f32147b = z11;
        }
    }
}
