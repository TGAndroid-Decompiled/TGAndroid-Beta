package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class jk0 extends f2.z0 {
    public boolean f25976a;
    public boolean f25977b;
    public ValueAnimator f25978c;
    public ValueAnimator d;
    public final pk0 e;

    public jk0(pk0 pk0Var) {
        this.e = pk0Var;
    }

    public static ValueAnimator c(float f10, float f11, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(Math.abs(f11 - f10) * 150.0f);
        duration.addUpdateListener(new j70(aVar, 8));
        duration.addListener(new org.telegram.ui.u0(1, runnable));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z4;
        float f10;
        pk0 pk0Var = this.e;
        org.telegram.ui.dr drVar = pk0Var.T;
        boolean z10 = false;
        if (drVar.L0() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        float f11 = 0.0f;
        if (z4 != this.f25976a) {
            ValueAnimator valueAnimator = this.f25978c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f12 = pk0Var.f27908r;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f25978c = c(f12, f10, new q0.a(this) {
                public final jk0 f25442b;

                {
                    this.f25442b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f13 = (Float) obj;
                    switch (r2) {
                        case 0:
                            pk0 pk0Var2 = this.f25442b.e;
                            Paint paint = pk0Var2.h;
                            float floatValue = f13.floatValue();
                            pk0Var2.f27908r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            pk0Var2.invalidate();
                            return;
                        default:
                            pk0 pk0Var3 = this.f25442b.e;
                            Paint paint2 = pk0Var3.f27903n;
                            float floatValue2 = f13.floatValue();
                            pk0Var3.f27910s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            pk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final jk0 f25737b;

                {
                    this.f25737b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f25737b.f25978c = null;
                            return;
                        default:
                            this.f25737b.d = null;
                            return;
                    }
                }
            });
            this.f25976a = z4;
        }
        if (drVar.N0() != pk0Var.U.h() - 1) {
            z10 = true;
        }
        if (z10 != this.f25977b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f13 = pk0Var.f27910s;
            if (z10) {
                f11 = 1.0f;
            }
            this.d = c(f13, f11, new q0.a(this) {
                public final jk0 f25442b;

                {
                    this.f25442b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f132 = (Float) obj;
                    switch (r2) {
                        case 0:
                            pk0 pk0Var2 = this.f25442b.e;
                            Paint paint = pk0Var2.h;
                            float floatValue = f132.floatValue();
                            pk0Var2.f27908r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            pk0Var2.invalidate();
                            return;
                        default:
                            pk0 pk0Var3 = this.f25442b.e;
                            Paint paint2 = pk0Var3.f27903n;
                            float floatValue2 = f132.floatValue();
                            pk0Var3.f27910s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            pk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final jk0 f25737b;

                {
                    this.f25737b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f25737b.f25978c = null;
                            return;
                        default:
                            this.f25737b.d = null;
                            return;
                    }
                }
            });
            this.f25977b = z10;
        }
    }
}
