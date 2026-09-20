package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class jk0 extends s4.s0 {
    public boolean f25387a;
    public boolean f25388b;
    public ValueAnimator f25389c;
    public ValueAnimator d;
    public final pk0 e;

    public jk0(pk0 pk0Var) {
        this.e = pk0Var;
    }

    public static ValueAnimator c(float f7, float f10, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(Math.abs(f10 - f7) * 150.0f);
        duration.addUpdateListener(new p70(aVar, 8));
        duration.addListener(new org.telegram.ui.q0(1, runnable));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        pk0 pk0Var = this.e;
        gg.j0 j0Var = pk0Var.W;
        boolean z11 = false;
        if (j0Var.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (z10 != this.f25387a) {
            ValueAnimator valueAnimator = this.f25389c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = pk0Var.f27366r;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f25389c = c(f11, f7, new q0.a(this) {
                public final jk0 f24715b;

                {
                    this.f24715b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f12 = (Float) obj;
                    switch (r2) {
                        case 0:
                            pk0 pk0Var2 = this.f24715b.e;
                            Paint paint = pk0Var2.h;
                            float floatValue = f12.floatValue();
                            pk0Var2.f27366r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            pk0Var2.invalidate();
                            return;
                        default:
                            pk0 pk0Var3 = this.f24715b.e;
                            Paint paint2 = pk0Var3.f27361n;
                            float floatValue2 = f12.floatValue();
                            pk0Var3.f27368s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            pk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final jk0 f25070b;

                {
                    this.f25070b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f25070b.f25389c = null;
                            return;
                        default:
                            this.f25070b.d = null;
                            return;
                    }
                }
            });
            this.f25387a = z10;
        }
        if (j0Var.N0() != pk0Var.f27336a0.h() - 1) {
            z11 = true;
        }
        if (z11 != this.f25388b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f12 = pk0Var.f27368s;
            if (z11) {
                f10 = 1.0f;
            }
            this.d = c(f12, f10, new q0.a(this) {
                public final jk0 f24715b;

                {
                    this.f24715b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f122 = (Float) obj;
                    switch (r2) {
                        case 0:
                            pk0 pk0Var2 = this.f24715b.e;
                            Paint paint = pk0Var2.h;
                            float floatValue = f122.floatValue();
                            pk0Var2.f27366r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            pk0Var2.invalidate();
                            return;
                        default:
                            pk0 pk0Var3 = this.f24715b.e;
                            Paint paint2 = pk0Var3.f27361n;
                            float floatValue2 = f122.floatValue();
                            pk0Var3.f27368s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            pk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final jk0 f25070b;

                {
                    this.f25070b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f25070b.f25389c = null;
                            return;
                        default:
                            this.f25070b.d = null;
                            return;
                    }
                }
            });
            this.f25388b = z11;
        }
    }
}
