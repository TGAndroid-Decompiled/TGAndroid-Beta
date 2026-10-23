package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class xk0 extends s4.r0 {
    public boolean f32447a;
    public boolean f32448b;
    public ValueAnimator f32449c;
    public ValueAnimator d;
    public final dl0 e;

    public xk0(dl0 dl0Var) {
        this.e = dl0Var;
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
        dl0 dl0Var = this.e;
        hg.i0 i0Var = dl0Var.W;
        boolean z11 = false;
        if (i0Var.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (z10 != this.f32447a) {
            ValueAnimator valueAnimator = this.f32449c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = dl0Var.f25557r;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f32449c = c(f11, f7, new q0.a(this) {
                public final xk0 f31306b;

                {
                    this.f31306b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f12 = (Float) obj;
                    switch (r2) {
                        case 0:
                            dl0 dl0Var2 = this.f31306b.e;
                            Paint paint = dl0Var2.h;
                            float floatValue = f12.floatValue();
                            dl0Var2.f25557r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            dl0Var2.invalidate();
                            return;
                        default:
                            dl0 dl0Var3 = this.f31306b.e;
                            Paint paint2 = dl0Var3.f25552n;
                            float floatValue2 = f12.floatValue();
                            dl0Var3.f25559s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            dl0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final xk0 f32151b;

                {
                    this.f32151b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f32151b.f32449c = null;
                            return;
                        default:
                            this.f32151b.d = null;
                            return;
                    }
                }
            });
            this.f32447a = z10;
        }
        if (i0Var.N0() != dl0Var.f25527a0.h() - 1) {
            z11 = true;
        }
        if (z11 != this.f32448b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f12 = dl0Var.f25559s;
            if (z11) {
                f10 = 1.0f;
            }
            this.d = c(f12, f10, new q0.a(this) {
                public final xk0 f31306b;

                {
                    this.f31306b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f122 = (Float) obj;
                    switch (r2) {
                        case 0:
                            dl0 dl0Var2 = this.f31306b.e;
                            Paint paint = dl0Var2.h;
                            float floatValue = f122.floatValue();
                            dl0Var2.f25557r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            dl0Var2.invalidate();
                            return;
                        default:
                            dl0 dl0Var3 = this.f31306b.e;
                            Paint paint2 = dl0Var3.f25552n;
                            float floatValue2 = f122.floatValue();
                            dl0Var3.f25559s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            dl0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final xk0 f32151b;

                {
                    this.f32151b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f32151b.f32449c = null;
                            return;
                        default:
                            this.f32151b.d = null;
                            return;
                    }
                }
            });
            this.f32448b = z11;
        }
    }
}
