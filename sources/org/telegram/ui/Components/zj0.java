package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class zj0 extends s4.s0 {
    public boolean f30601a;
    public boolean f30602b;
    public ValueAnimator f30603c;
    public ValueAnimator d;
    public final fk0 e;

    public zj0(fk0 fk0Var) {
        this.e = fk0Var;
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
        fk0 fk0Var = this.e;
        gg.j0 j0Var = fk0Var.W;
        boolean z11 = false;
        if (j0Var.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (z10 != this.f30601a) {
            ValueAnimator valueAnimator = this.f30603c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = fk0Var.f23996r;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f30603c = c(f11, f7, new q0.a(this) {
                public final zj0 f29988b;

                {
                    this.f29988b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f12 = (Float) obj;
                    switch (r2) {
                        case 0:
                            fk0 fk0Var2 = this.f29988b.e;
                            Paint paint = fk0Var2.h;
                            float floatValue = f12.floatValue();
                            fk0Var2.f23996r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            fk0Var2.invalidate();
                            return;
                        default:
                            fk0 fk0Var3 = this.f29988b.e;
                            Paint paint2 = fk0Var3.f23991n;
                            float floatValue2 = f12.floatValue();
                            fk0Var3.f23998s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            fk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final zj0 f30271b;

                {
                    this.f30271b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f30271b.f30603c = null;
                            return;
                        default:
                            this.f30271b.d = null;
                            return;
                    }
                }
            });
            this.f30601a = z10;
        }
        if (j0Var.N0() != fk0Var.f23966a0.h() - 1) {
            z11 = true;
        }
        if (z11 != this.f30602b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f12 = fk0Var.f23998s;
            if (z11) {
                f10 = 1.0f;
            }
            this.d = c(f12, f10, new q0.a(this) {
                public final zj0 f29988b;

                {
                    this.f29988b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f122 = (Float) obj;
                    switch (r2) {
                        case 0:
                            fk0 fk0Var2 = this.f29988b.e;
                            Paint paint = fk0Var2.h;
                            float floatValue = f122.floatValue();
                            fk0Var2.f23996r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            fk0Var2.invalidate();
                            return;
                        default:
                            fk0 fk0Var3 = this.f29988b.e;
                            Paint paint2 = fk0Var3.f23991n;
                            float floatValue2 = f122.floatValue();
                            fk0Var3.f23998s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            fk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final zj0 f30271b;

                {
                    this.f30271b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f30271b.f30603c = null;
                            return;
                        default:
                            this.f30271b.d = null;
                            return;
                    }
                }
            });
            this.f30602b = z11;
        }
    }
}
