package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class al0 extends s4.r0 {
    public boolean f23575a;
    public boolean f23576b;
    public ValueAnimator f23577c;
    public ValueAnimator d;
    public final gl0 e;

    public al0(gl0 gl0Var) {
        this.e = gl0Var;
    }

    public static ValueAnimator c(float f7, float f10, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(Math.abs(f10 - f7) * 150.0f);
        duration.addUpdateListener(new g80(aVar, 9));
        duration.addListener(new org.telegram.ui.s0(1, runnable));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        gl0 gl0Var = this.e;
        hg.i0 i0Var = gl0Var.W;
        boolean z11 = false;
        if (i0Var.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (z10 != this.f23575a) {
            ValueAnimator valueAnimator = this.f23577c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = gl0Var.f25348r;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f23577c = c(f11, f7, new q0.a(this) {
                public final al0 f31639b;

                {
                    this.f31639b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f12 = (Float) obj;
                    switch (r2) {
                        case 0:
                            gl0 gl0Var2 = this.f31639b.e;
                            Paint paint = gl0Var2.h;
                            float floatValue = f12.floatValue();
                            gl0Var2.f25348r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            gl0Var2.invalidate();
                            return;
                        default:
                            gl0 gl0Var3 = this.f31639b.e;
                            Paint paint2 = gl0Var3.f25343n;
                            float floatValue2 = f12.floatValue();
                            gl0Var3.f25350s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            gl0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final al0 f31894b;

                {
                    this.f31894b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f31894b.f23577c = null;
                            return;
                        default:
                            this.f31894b.d = null;
                            return;
                    }
                }
            });
            this.f23575a = z10;
        }
        if (i0Var.N0() != gl0Var.f25318a0.h() - 1) {
            z11 = true;
        }
        if (z11 != this.f23576b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f12 = gl0Var.f25350s;
            if (z11) {
                f10 = 1.0f;
            }
            this.d = c(f12, f10, new q0.a(this) {
                public final al0 f31639b;

                {
                    this.f31639b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f122 = (Float) obj;
                    switch (r2) {
                        case 0:
                            gl0 gl0Var2 = this.f31639b.e;
                            Paint paint = gl0Var2.h;
                            float floatValue = f122.floatValue();
                            gl0Var2.f25348r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            gl0Var2.invalidate();
                            return;
                        default:
                            gl0 gl0Var3 = this.f31639b.e;
                            Paint paint2 = gl0Var3.f25343n;
                            float floatValue2 = f122.floatValue();
                            gl0Var3.f25350s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            gl0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final al0 f31894b;

                {
                    this.f31894b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f31894b.f23577c = null;
                            return;
                        default:
                            this.f31894b.d = null;
                            return;
                    }
                }
            });
            this.f23576b = z11;
        }
    }
}
