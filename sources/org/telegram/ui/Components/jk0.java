package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class jk0 extends s4.s0 {
    public boolean f24432a;
    public boolean f24433b;
    public ValueAnimator f24434c;
    public ValueAnimator d;
    public final pk0 e;

    public jk0(pk0 pk0Var) {
        this.e = pk0Var;
    }

    public static ValueAnimator c(float f7, float f10, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(Math.abs(f10 - f7) * 150.0f);
        duration.addUpdateListener(new q70(aVar, 8));
        duration.addListener(new org.telegram.ui.r0(1, runnable));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        pk0 pk0Var = this.e;
        fg.i0 i0Var = pk0Var.W;
        boolean z11 = false;
        if (i0Var.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (z10 != this.f24432a) {
            ValueAnimator valueAnimator = this.f24434c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = pk0Var.f26189r;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f24434c = c(f11, f7, new q0.a(this) {
                public final jk0 f23681b;

                {
                    this.f23681b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f12 = (Float) obj;
                    switch (r2) {
                        case 0:
                            pk0 pk0Var2 = this.f23681b.e;
                            Paint paint = pk0Var2.h;
                            float floatValue = f12.floatValue();
                            pk0Var2.f26189r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            pk0Var2.invalidate();
                            return;
                        default:
                            pk0 pk0Var3 = this.f23681b.e;
                            Paint paint2 = pk0Var3.f26184n;
                            float floatValue2 = f12.floatValue();
                            pk0Var3.f26191s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            pk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final jk0 f24040b;

                {
                    this.f24040b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f24040b.f24434c = null;
                            return;
                        default:
                            this.f24040b.d = null;
                            return;
                    }
                }
            });
            this.f24432a = z10;
        }
        if (i0Var.N0() != pk0Var.f26159a0.h() - 1) {
            z11 = true;
        }
        if (z11 != this.f24433b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f12 = pk0Var.f26191s;
            if (z11) {
                f10 = 1.0f;
            }
            this.d = c(f12, f10, new q0.a(this) {
                public final jk0 f23681b;

                {
                    this.f23681b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f122 = (Float) obj;
                    switch (r2) {
                        case 0:
                            pk0 pk0Var2 = this.f23681b.e;
                            Paint paint = pk0Var2.h;
                            float floatValue = f122.floatValue();
                            pk0Var2.f26189r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            pk0Var2.invalidate();
                            return;
                        default:
                            pk0 pk0Var3 = this.f23681b.e;
                            Paint paint2 = pk0Var3.f26184n;
                            float floatValue2 = f122.floatValue();
                            pk0Var3.f26191s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            pk0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final jk0 f24040b;

                {
                    this.f24040b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f24040b.f24434c = null;
                            return;
                        default:
                            this.f24040b.d = null;
                            return;
                    }
                }
            });
            this.f24433b = z11;
        }
    }
}
