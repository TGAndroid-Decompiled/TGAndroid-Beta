package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class kk0 extends s4.s0 {
    public boolean f25809a;
    public boolean f25810b;
    public ValueAnimator f25811c;
    public ValueAnimator d;
    public final qk0 e;

    public kk0(qk0 qk0Var) {
        this.e = qk0Var;
    }

    public static ValueAnimator c(float f7, float f10, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(Math.abs(f10 - f7) * 150.0f);
        duration.addUpdateListener(new s70(aVar, 8));
        duration.addListener(new org.telegram.ui.r0(1, runnable));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        qk0 qk0Var = this.e;
        gg.j0 j0Var = qk0Var.W;
        boolean z11 = false;
        if (j0Var.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (z10 != this.f25809a) {
            ValueAnimator valueAnimator = this.f25811c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = qk0Var.f27683r;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f25811c = c(f11, f7, new q0.a(this) {
                public final kk0 f25105b;

                {
                    this.f25105b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f12 = (Float) obj;
                    switch (r2) {
                        case 0:
                            qk0 qk0Var2 = this.f25105b.e;
                            Paint paint = qk0Var2.h;
                            float floatValue = f12.floatValue();
                            qk0Var2.f27683r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            qk0Var2.invalidate();
                            return;
                        default:
                            qk0 qk0Var3 = this.f25105b.e;
                            Paint paint2 = qk0Var3.f27678n;
                            float floatValue2 = f12.floatValue();
                            qk0Var3.f27685s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            qk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final kk0 f25443b;

                {
                    this.f25443b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f25443b.f25811c = null;
                            return;
                        default:
                            this.f25443b.d = null;
                            return;
                    }
                }
            });
            this.f25809a = z10;
        }
        if (j0Var.N0() != qk0Var.f27653a0.h() - 1) {
            z11 = true;
        }
        if (z11 != this.f25810b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f12 = qk0Var.f27685s;
            if (z11) {
                f10 = 1.0f;
            }
            this.d = c(f12, f10, new q0.a(this) {
                public final kk0 f25105b;

                {
                    this.f25105b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f122 = (Float) obj;
                    switch (r2) {
                        case 0:
                            qk0 qk0Var2 = this.f25105b.e;
                            Paint paint = qk0Var2.h;
                            float floatValue = f122.floatValue();
                            qk0Var2.f27683r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            qk0Var2.invalidate();
                            return;
                        default:
                            qk0 qk0Var3 = this.f25105b.e;
                            Paint paint2 = qk0Var3.f27678n;
                            float floatValue2 = f122.floatValue();
                            qk0Var3.f27685s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            qk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final kk0 f25443b;

                {
                    this.f25443b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f25443b.f25811c = null;
                            return;
                        default:
                            this.f25443b.d = null;
                            return;
                    }
                }
            });
            this.f25810b = z11;
        }
    }
}
