package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class ri0 extends v4.u0 {
    public boolean f39246a;
    public boolean f39247b;
    public ValueAnimator f39248c;
    public ValueAnimator d;
    public final xi0 f39249e;

    public ri0(xi0 xi0Var) {
        this.f39249e = xi0Var;
    }

    public static ValueAnimator c(float f10, float f11, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(Math.abs(f11 - f10) * 150.0f);
        duration.addUpdateListener(new h60(aVar, 9));
        duration.addListener(new s60(runnable, 13));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z10;
        float f10;
        xi0 xi0Var = this.f39249e;
        jg.i0 i0Var = xi0Var.f42103a0;
        boolean z11 = false;
        if (i0Var.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f11 = 0.0f;
        if (z10 != this.f39246a) {
            ValueAnimator valueAnimator = this.f39248c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f12 = xi0Var.f42135r;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f39248c = c(f12, f10, new q0.a(this) {
                public final ri0 f38604b;

                {
                    this.f38604b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f13 = (Float) obj;
                    switch (r2) {
                        case 0:
                            xi0 xi0Var2 = this.f38604b.f39249e;
                            Paint paint = xi0Var2.h;
                            float floatValue = f13.floatValue();
                            xi0Var2.f42135r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            xi0Var2.invalidate();
                            return;
                        default:
                            xi0 xi0Var3 = this.f38604b.f39249e;
                            Paint paint2 = xi0Var3.f42130n;
                            float floatValue2 = f13.floatValue();
                            xi0Var3.f42137s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            xi0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final ri0 f38934b;

                {
                    this.f38934b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f38934b.f39248c = null;
                            return;
                        default:
                            this.f38934b.d = null;
                            return;
                    }
                }
            });
            this.f39246a = z10;
        }
        if (i0Var.N0() != xi0Var.f42106b0.b() - 1) {
            z11 = true;
        }
        if (z11 != this.f39247b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f13 = xi0Var.f42137s;
            if (z11) {
                f11 = 1.0f;
            }
            this.d = c(f13, f11, new q0.a(this) {
                public final ri0 f38604b;

                {
                    this.f38604b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f132 = (Float) obj;
                    switch (r2) {
                        case 0:
                            xi0 xi0Var2 = this.f38604b.f39249e;
                            Paint paint = xi0Var2.h;
                            float floatValue = f132.floatValue();
                            xi0Var2.f42135r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            xi0Var2.invalidate();
                            return;
                        default:
                            xi0 xi0Var3 = this.f38604b.f39249e;
                            Paint paint2 = xi0Var3.f42130n;
                            float floatValue2 = f132.floatValue();
                            xi0Var3.f42137s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            xi0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final ri0 f38934b;

                {
                    this.f38934b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f38934b.f39248c = null;
                            return;
                        default:
                            this.f38934b.d = null;
                            return;
                    }
                }
            });
            this.f39247b = z11;
        }
    }
}
