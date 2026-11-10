package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class ci0 extends v4.s0 {
    public boolean f32679a;
    public boolean f32680b;
    public ValueAnimator f32681c;
    public ValueAnimator d;
    public final ii0 f32682e;

    public ci0(ii0 ii0Var) {
        this.f32682e = ii0Var;
    }

    public static ValueAnimator c(float f10, float f11, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(Math.abs(f11 - f10) * 150.0f);
        duration.addUpdateListener(new c60(aVar, 7));
        duration.addListener(new e60(runnable, 13));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z9;
        float f10;
        ii0 ii0Var = this.f32682e;
        jg.i0 i0Var = ii0Var.W;
        boolean z10 = false;
        if (i0Var.L0() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        float f11 = 0.0f;
        if (z9 != this.f32679a) {
            ValueAnimator valueAnimator = this.f32681c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f12 = ii0Var.f34667r;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f32681c = c(f12, f10, new q0.a(this) {
                public final ci0 f31866b;

                {
                    this.f31866b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f13 = (Float) obj;
                    switch (r2) {
                        case 0:
                            ii0 ii0Var2 = this.f31866b.f32682e;
                            Paint paint = ii0Var2.h;
                            float floatValue = f13.floatValue();
                            ii0Var2.f34667r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            ii0Var2.invalidate();
                            return;
                        default:
                            ii0 ii0Var3 = this.f31866b.f32682e;
                            Paint paint2 = ii0Var3.f34662n;
                            float floatValue2 = f13.floatValue();
                            ii0Var3.f34669s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            ii0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final ci0 f32275b;

                {
                    this.f32275b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f32275b.f32681c = null;
                            return;
                        default:
                            this.f32275b.d = null;
                            return;
                    }
                }
            });
            this.f32679a = z9;
        }
        if (i0Var.N0() != ii0Var.f34635a0.b() - 1) {
            z10 = true;
        }
        if (z10 != this.f32680b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f13 = ii0Var.f34669s;
            if (z10) {
                f11 = 1.0f;
            }
            this.d = c(f13, f11, new q0.a(this) {
                public final ci0 f31866b;

                {
                    this.f31866b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f132 = (Float) obj;
                    switch (r2) {
                        case 0:
                            ii0 ii0Var2 = this.f31866b.f32682e;
                            Paint paint = ii0Var2.h;
                            float floatValue = f132.floatValue();
                            ii0Var2.f34667r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            ii0Var2.invalidate();
                            return;
                        default:
                            ii0 ii0Var3 = this.f31866b.f32682e;
                            Paint paint2 = ii0Var3.f34662n;
                            float floatValue2 = f132.floatValue();
                            ii0Var3.f34669s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            ii0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final ci0 f32275b;

                {
                    this.f32275b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f32275b.f32681c = null;
                            return;
                        default:
                            this.f32275b.d = null;
                            return;
                    }
                }
            });
            this.f32680b = z10;
        }
    }
}
