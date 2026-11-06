package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class ci0 extends v4.s0 {
    public boolean f32579a;
    public boolean f32580b;
    public ValueAnimator f32581c;
    public ValueAnimator d;
    public final ii0 f32582e;

    public ci0(ii0 ii0Var) {
        this.f32582e = ii0Var;
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
        ii0 ii0Var = this.f32582e;
        jg.i0 i0Var = ii0Var.W;
        boolean z10 = false;
        if (i0Var.L0() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        float f11 = 0.0f;
        if (z9 != this.f32579a) {
            ValueAnimator valueAnimator = this.f32581c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f12 = ii0Var.f34675r;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f32581c = c(f12, f10, new q0.a(this) {
                public final ci0 f31822b;

                {
                    this.f31822b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f13 = (Float) obj;
                    switch (r2) {
                        case 0:
                            ii0 ii0Var2 = this.f31822b.f32582e;
                            Paint paint = ii0Var2.h;
                            float floatValue = f13.floatValue();
                            ii0Var2.f34675r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            ii0Var2.invalidate();
                            return;
                        default:
                            ii0 ii0Var3 = this.f31822b.f32582e;
                            Paint paint2 = ii0Var3.f34670n;
                            float floatValue2 = f13.floatValue();
                            ii0Var3.f34677s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            ii0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final ci0 f32158b;

                {
                    this.f32158b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f32158b.f32581c = null;
                            return;
                        default:
                            this.f32158b.d = null;
                            return;
                    }
                }
            });
            this.f32579a = z9;
        }
        if (i0Var.N0() != ii0Var.f34643a0.b() - 1) {
            z10 = true;
        }
        if (z10 != this.f32580b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f13 = ii0Var.f34677s;
            if (z10) {
                f11 = 1.0f;
            }
            this.d = c(f13, f11, new q0.a(this) {
                public final ci0 f31822b;

                {
                    this.f31822b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f132 = (Float) obj;
                    switch (r2) {
                        case 0:
                            ii0 ii0Var2 = this.f31822b.f32582e;
                            Paint paint = ii0Var2.h;
                            float floatValue = f132.floatValue();
                            ii0Var2.f34675r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            ii0Var2.invalidate();
                            return;
                        default:
                            ii0 ii0Var3 = this.f31822b.f32582e;
                            Paint paint2 = ii0Var3.f34670n;
                            float floatValue2 = f132.floatValue();
                            ii0Var3.f34677s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            ii0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final ci0 f32158b;

                {
                    this.f32158b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f32158b.f32581c = null;
                            return;
                        default:
                            this.f32158b.d = null;
                            return;
                    }
                }
            });
            this.f32580b = z10;
        }
    }
}
