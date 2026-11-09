package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class di0 extends v4.s0 {
    public boolean f33078a;
    public boolean f33079b;
    public ValueAnimator f33080c;
    public ValueAnimator d;
    public final ji0 f33081e;

    public di0(ji0 ji0Var) {
        this.f33081e = ji0Var;
    }

    public static ValueAnimator c(float f10, float f11, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(Math.abs(f11 - f10) * 150.0f);
        duration.addUpdateListener(new d60(aVar, 7));
        duration.addListener(new f60(runnable, 13));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z9;
        float f10;
        ji0 ji0Var = this.f33081e;
        jg.i0 i0Var = ji0Var.W;
        boolean z10 = false;
        if (i0Var.L0() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        float f11 = 0.0f;
        if (z9 != this.f33078a) {
            ValueAnimator valueAnimator = this.f33080c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f12 = ji0Var.f35058r;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f33080c = c(f12, f10, new q0.a(this) {
                public final di0 f32263b;

                {
                    this.f32263b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f13 = (Float) obj;
                    switch (r2) {
                        case 0:
                            ji0 ji0Var2 = this.f32263b.f33081e;
                            Paint paint = ji0Var2.h;
                            float floatValue = f13.floatValue();
                            ji0Var2.f35058r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            ji0Var2.invalidate();
                            return;
                        default:
                            ji0 ji0Var3 = this.f32263b.f33081e;
                            Paint paint2 = ji0Var3.f35053n;
                            float floatValue2 = f13.floatValue();
                            ji0Var3.f35060s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            ji0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final di0 f32699b;

                {
                    this.f32699b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f32699b.f33080c = null;
                            return;
                        default:
                            this.f32699b.d = null;
                            return;
                    }
                }
            });
            this.f33078a = z9;
        }
        if (i0Var.N0() != ji0Var.f35026a0.b() - 1) {
            z10 = true;
        }
        if (z10 != this.f33079b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f13 = ji0Var.f35060s;
            if (z10) {
                f11 = 1.0f;
            }
            this.d = c(f13, f11, new q0.a(this) {
                public final di0 f32263b;

                {
                    this.f32263b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f132 = (Float) obj;
                    switch (r2) {
                        case 0:
                            ji0 ji0Var2 = this.f32263b.f33081e;
                            Paint paint = ji0Var2.h;
                            float floatValue = f132.floatValue();
                            ji0Var2.f35058r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            ji0Var2.invalidate();
                            return;
                        default:
                            ji0 ji0Var3 = this.f32263b.f33081e;
                            Paint paint2 = ji0Var3.f35053n;
                            float floatValue2 = f132.floatValue();
                            ji0Var3.f35060s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            ji0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final di0 f32699b;

                {
                    this.f32699b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f32699b.f33080c = null;
                            return;
                        default:
                            this.f32699b.d = null;
                            return;
                    }
                }
            });
            this.f33079b = z10;
        }
    }
}
