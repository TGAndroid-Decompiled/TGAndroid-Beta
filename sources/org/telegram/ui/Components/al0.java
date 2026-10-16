package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class al0 extends s4.r0 {
    public boolean f23265a;
    public boolean f23266b;
    public ValueAnimator f23267c;
    public ValueAnimator d;
    public final gl0 e;

    public al0(gl0 gl0Var) {
        this.e = gl0Var;
    }

    public static ValueAnimator c(float f7, float f10, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(Math.abs(f10 - f7) * 150.0f);
        duration.addUpdateListener(new f80(aVar, 9));
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
        if (z10 != this.f23265a) {
            ValueAnimator valueAnimator = this.f23267c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = gl0Var.f25037r;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f23267c = c(f11, f7, new q0.a(this) {
                public final al0 f31323b;

                {
                    this.f31323b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f12 = (Float) obj;
                    switch (r2) {
                        case 0:
                            gl0 gl0Var2 = this.f31323b.e;
                            Paint paint = gl0Var2.h;
                            float floatValue = f12.floatValue();
                            gl0Var2.f25037r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            gl0Var2.invalidate();
                            return;
                        default:
                            gl0 gl0Var3 = this.f31323b.e;
                            Paint paint2 = gl0Var3.f25032n;
                            float floatValue2 = f12.floatValue();
                            gl0Var3.f25039s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            gl0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final al0 f31585b;

                {
                    this.f31585b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f31585b.f23267c = null;
                            return;
                        default:
                            this.f31585b.d = null;
                            return;
                    }
                }
            });
            this.f23265a = z10;
        }
        if (i0Var.N0() != gl0Var.f25007a0.h() - 1) {
            z11 = true;
        }
        if (z11 != this.f23266b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f12 = gl0Var.f25039s;
            if (z11) {
                f10 = 1.0f;
            }
            this.d = c(f12, f10, new q0.a(this) {
                public final al0 f31323b;

                {
                    this.f31323b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f122 = (Float) obj;
                    switch (r2) {
                        case 0:
                            gl0 gl0Var2 = this.f31323b.e;
                            Paint paint = gl0Var2.h;
                            float floatValue = f122.floatValue();
                            gl0Var2.f25037r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            gl0Var2.invalidate();
                            return;
                        default:
                            gl0 gl0Var3 = this.f31323b.e;
                            Paint paint2 = gl0Var3.f25032n;
                            float floatValue2 = f122.floatValue();
                            gl0Var3.f25039s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            gl0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final al0 f31585b;

                {
                    this.f31585b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f31585b.f23267c = null;
                            return;
                        default:
                            this.f31585b.d = null;
                            return;
                    }
                }
            });
            this.f23266b = z11;
        }
    }
}
