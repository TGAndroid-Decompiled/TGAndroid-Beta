package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class kk0 extends s4.s0 {
    public boolean f25810a;
    public boolean f25811b;
    public ValueAnimator f25812c;
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
        if (z10 != this.f25810a) {
            ValueAnimator valueAnimator = this.f25812c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = qk0Var.f27684r;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f25812c = c(f11, f7, new q0.a(this) {
                public final kk0 f25106b;

                {
                    this.f25106b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f12 = (Float) obj;
                    switch (r2) {
                        case 0:
                            qk0 qk0Var2 = this.f25106b.e;
                            Paint paint = qk0Var2.h;
                            float floatValue = f12.floatValue();
                            qk0Var2.f27684r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            qk0Var2.invalidate();
                            return;
                        default:
                            qk0 qk0Var3 = this.f25106b.e;
                            Paint paint2 = qk0Var3.f27679n;
                            float floatValue2 = f12.floatValue();
                            qk0Var3.f27686s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            qk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final kk0 f25444b;

                {
                    this.f25444b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f25444b.f25812c = null;
                            return;
                        default:
                            this.f25444b.d = null;
                            return;
                    }
                }
            });
            this.f25810a = z10;
        }
        if (j0Var.N0() != qk0Var.f27654a0.h() - 1) {
            z11 = true;
        }
        if (z11 != this.f25811b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f12 = qk0Var.f27686s;
            if (z11) {
                f10 = 1.0f;
            }
            this.d = c(f12, f10, new q0.a(this) {
                public final kk0 f25106b;

                {
                    this.f25106b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f122 = (Float) obj;
                    switch (r2) {
                        case 0:
                            qk0 qk0Var2 = this.f25106b.e;
                            Paint paint = qk0Var2.h;
                            float floatValue = f122.floatValue();
                            qk0Var2.f27684r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            qk0Var2.invalidate();
                            return;
                        default:
                            qk0 qk0Var3 = this.f25106b.e;
                            Paint paint2 = qk0Var3.f27679n;
                            float floatValue2 = f122.floatValue();
                            qk0Var3.f27686s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            qk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final kk0 f25444b;

                {
                    this.f25444b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f25444b.f25812c = null;
                            return;
                        default:
                            this.f25444b.d = null;
                            return;
                    }
                }
            });
            this.f25811b = z11;
        }
    }
}
