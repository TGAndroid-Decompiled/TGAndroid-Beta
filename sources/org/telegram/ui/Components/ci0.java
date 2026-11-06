package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class ci0 extends v4.s0 {
    public boolean f32570a;
    public boolean f32571b;
    public ValueAnimator f32572c;
    public ValueAnimator d;
    public final ii0 f32573e;

    public ci0(ii0 ii0Var) {
        this.f32573e = ii0Var;
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
        ii0 ii0Var = this.f32573e;
        jg.i0 i0Var = ii0Var.W;
        boolean z10 = false;
        if (i0Var.L0() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        float f11 = 0.0f;
        if (z9 != this.f32570a) {
            ValueAnimator valueAnimator = this.f32572c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f12 = ii0Var.f34668r;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f32572c = c(f12, f10, new q0.a(this) {
                public final ci0 f31830b;

                {
                    this.f31830b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f13 = (Float) obj;
                    switch (r2) {
                        case 0:
                            ii0 ii0Var2 = this.f31830b.f32573e;
                            Paint paint = ii0Var2.h;
                            float floatValue = f13.floatValue();
                            ii0Var2.f34668r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            ii0Var2.invalidate();
                            return;
                        default:
                            ii0 ii0Var3 = this.f31830b.f32573e;
                            Paint paint2 = ii0Var3.f34663n;
                            float floatValue2 = f13.floatValue();
                            ii0Var3.f34670s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            ii0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final ci0 f32186b;

                {
                    this.f32186b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f32186b.f32572c = null;
                            return;
                        default:
                            this.f32186b.d = null;
                            return;
                    }
                }
            });
            this.f32570a = z9;
        }
        if (i0Var.N0() != ii0Var.f34636a0.b() - 1) {
            z10 = true;
        }
        if (z10 != this.f32571b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f13 = ii0Var.f34670s;
            if (z10) {
                f11 = 1.0f;
            }
            this.d = c(f13, f11, new q0.a(this) {
                public final ci0 f31830b;

                {
                    this.f31830b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f132 = (Float) obj;
                    switch (r2) {
                        case 0:
                            ii0 ii0Var2 = this.f31830b.f32573e;
                            Paint paint = ii0Var2.h;
                            float floatValue = f132.floatValue();
                            ii0Var2.f34668r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            ii0Var2.invalidate();
                            return;
                        default:
                            ii0 ii0Var3 = this.f31830b.f32573e;
                            Paint paint2 = ii0Var3.f34663n;
                            float floatValue2 = f132.floatValue();
                            ii0Var3.f34670s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            ii0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final ci0 f32186b;

                {
                    this.f32186b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f32186b.f32572c = null;
                            return;
                        default:
                            this.f32186b.d = null;
                            return;
                    }
                }
            });
            this.f32571b = z10;
        }
    }
}
