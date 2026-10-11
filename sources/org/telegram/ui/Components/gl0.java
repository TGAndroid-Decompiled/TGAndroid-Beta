package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class gl0 extends s4.t0 {
    public boolean f26765a;
    public boolean f26766b;
    public ValueAnimator f26767c;
    public ValueAnimator d;
    public final ml0 f26768e;

    public gl0(ml0 ml0Var) {
        this.f26768e = ml0Var;
    }

    public static ValueAnimator c(float f7, float f10, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(Math.abs(f10 - f7) * 150.0f);
        duration.addUpdateListener(new k80(aVar, 9));
        duration.addListener(new org.telegram.ui.q0(1, runnable));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        ml0 ml0Var = this.f26768e;
        gg.i0 i0Var = ml0Var.W;
        boolean z11 = false;
        if (i0Var.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (z10 != this.f26765a) {
            ValueAnimator valueAnimator = this.f26767c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = ml0Var.f28782r;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f26767c = c(f11, f7, new q0.a(this) {
                public final gl0 f26074b;

                {
                    this.f26074b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f12 = (Float) obj;
                    switch (r2) {
                        case 0:
                            ml0 ml0Var2 = this.f26074b.f26768e;
                            Paint paint = ml0Var2.h;
                            float floatValue = f12.floatValue();
                            ml0Var2.f28782r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            ml0Var2.invalidate();
                            return;
                        default:
                            ml0 ml0Var3 = this.f26074b.f26768e;
                            Paint paint2 = ml0Var3.f28777n;
                            float floatValue2 = f12.floatValue();
                            ml0Var3.f28784s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            ml0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final gl0 f26372b;

                {
                    this.f26372b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f26372b.f26767c = null;
                            return;
                        default:
                            this.f26372b.d = null;
                            return;
                    }
                }
            });
            this.f26765a = z10;
        }
        if (i0Var.N0() != ml0Var.f28751a0.h() - 1) {
            z11 = true;
        }
        if (z11 != this.f26766b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f12 = ml0Var.f28784s;
            if (z11) {
                f10 = 1.0f;
            }
            this.d = c(f12, f10, new q0.a(this) {
                public final gl0 f26074b;

                {
                    this.f26074b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f122 = (Float) obj;
                    switch (r2) {
                        case 0:
                            ml0 ml0Var2 = this.f26074b.f26768e;
                            Paint paint = ml0Var2.h;
                            float floatValue = f122.floatValue();
                            ml0Var2.f28782r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            ml0Var2.invalidate();
                            return;
                        default:
                            ml0 ml0Var3 = this.f26074b.f26768e;
                            Paint paint2 = ml0Var3.f28777n;
                            float floatValue2 = f122.floatValue();
                            ml0Var3.f28784s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            ml0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final gl0 f26372b;

                {
                    this.f26372b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f26372b.f26767c = null;
                            return;
                        default:
                            this.f26372b.d = null;
                            return;
                    }
                }
            });
            this.f26766b = z11;
        }
    }
}
