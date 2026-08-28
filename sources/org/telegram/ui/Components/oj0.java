package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class oj0 extends f2.d1 {
    public boolean f31402a;
    public boolean f31403b;
    public ValueAnimator f31404c;
    public ValueAnimator d;
    public final uj0 f31405e;

    public oj0(uj0 uj0Var) {
        this.f31405e = uj0Var;
    }

    public static ValueAnimator c(float f10, float f11, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(Math.abs(f11 - f10) * 150.0f);
        duration.addUpdateListener(new q60(aVar, 8));
        duration.addListener(new org.telegram.ui.t0(1, runnable));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        boolean z10;
        float f10;
        uj0 uj0Var = this.f31405e;
        of.g0 g0Var = uj0Var.S;
        boolean z11 = false;
        if (g0Var.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f11 = 0.0f;
        if (z10 != this.f31402a) {
            ValueAnimator valueAnimator = this.f31404c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f12 = uj0Var.f33070r;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f31404c = c(f12, f10, new q0.a(this) {
                public final oj0 f30879b;

                {
                    this.f30879b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f13 = (Float) obj;
                    switch (r2) {
                        case 0:
                            uj0 uj0Var2 = this.f30879b.f31405e;
                            Paint paint = uj0Var2.h;
                            float floatValue = f13.floatValue();
                            uj0Var2.f33070r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            uj0Var2.invalidate();
                            return;
                        default:
                            uj0 uj0Var3 = this.f30879b.f31405e;
                            Paint paint2 = uj0Var3.f33065n;
                            float floatValue2 = f13.floatValue();
                            uj0Var3.f33072s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            uj0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final oj0 f31120b;

                {
                    this.f31120b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f31120b.f31404c = null;
                            return;
                        default:
                            this.f31120b.d = null;
                            return;
                    }
                }
            });
            this.f31402a = z10;
        }
        if (g0Var.N0() != uj0Var.T.h() - 1) {
            z11 = true;
        }
        if (z11 != this.f31403b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f13 = uj0Var.f33072s;
            if (z11) {
                f11 = 1.0f;
            }
            this.d = c(f13, f11, new q0.a(this) {
                public final oj0 f30879b;

                {
                    this.f30879b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f132 = (Float) obj;
                    switch (r2) {
                        case 0:
                            uj0 uj0Var2 = this.f30879b.f31405e;
                            Paint paint = uj0Var2.h;
                            float floatValue = f132.floatValue();
                            uj0Var2.f33070r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            uj0Var2.invalidate();
                            return;
                        default:
                            uj0 uj0Var3 = this.f30879b.f31405e;
                            Paint paint2 = uj0Var3.f33065n;
                            float floatValue2 = f132.floatValue();
                            uj0Var3.f33072s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            uj0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final oj0 f31120b;

                {
                    this.f31120b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f31120b.f31404c = null;
                            return;
                        default:
                            this.f31120b.d = null;
                            return;
                    }
                }
            });
            this.f31403b = z11;
        }
    }
}
