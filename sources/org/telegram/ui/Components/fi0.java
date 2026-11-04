package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class fi0 extends u4.t0 {
    public boolean f33806a;
    public boolean f33807b;
    public ValueAnimator f33808c;
    public ValueAnimator d;
    public final li0 f33809e;

    public fi0(li0 li0Var) {
        this.f33809e = li0Var;
    }

    public static ValueAnimator c(float f10, float f11, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(Math.abs(f11 - f10) * 150.0f);
        duration.addUpdateListener(new y50(aVar, 8));
        duration.addListener(new a60(runnable, 13));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        boolean z10;
        float f10;
        li0 li0Var = this.f33809e;
        kg.f0 f0Var = li0Var.f35734a0;
        boolean z11 = false;
        if (f0Var.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f11 = 0.0f;
        if (z10 != this.f33806a) {
            ValueAnimator valueAnimator = this.f33808c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f12 = li0Var.f35766r;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f33808c = c(f12, f10, new q0.a(this) {
                public final fi0 f33109b;

                {
                    this.f33109b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f13 = (Float) obj;
                    switch (r2) {
                        case 0:
                            li0 li0Var2 = this.f33109b.f33809e;
                            Paint paint = li0Var2.h;
                            float floatValue = f13.floatValue();
                            li0Var2.f35766r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            li0Var2.invalidate();
                            return;
                        default:
                            li0 li0Var3 = this.f33109b.f33809e;
                            Paint paint2 = li0Var3.f35761n;
                            float floatValue2 = f13.floatValue();
                            li0Var3.f35768s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            li0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final fi0 f33403b;

                {
                    this.f33403b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f33403b.f33808c = null;
                            return;
                        default:
                            this.f33403b.d = null;
                            return;
                    }
                }
            });
            this.f33806a = z10;
        }
        if (f0Var.N0() != li0Var.f35737b0.b() - 1) {
            z11 = true;
        }
        if (z11 != this.f33807b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f13 = li0Var.f35768s;
            if (z11) {
                f11 = 1.0f;
            }
            this.d = c(f13, f11, new q0.a(this) {
                public final fi0 f33109b;

                {
                    this.f33109b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f132 = (Float) obj;
                    switch (r2) {
                        case 0:
                            li0 li0Var2 = this.f33109b.f33809e;
                            Paint paint = li0Var2.h;
                            float floatValue = f132.floatValue();
                            li0Var2.f35766r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            li0Var2.invalidate();
                            return;
                        default:
                            li0 li0Var3 = this.f33109b.f33809e;
                            Paint paint2 = li0Var3.f35761n;
                            float floatValue2 = f132.floatValue();
                            li0Var3.f35768s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            li0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final fi0 f33403b;

                {
                    this.f33403b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f33403b.f33808c = null;
                            return;
                        default:
                            this.f33403b.d = null;
                            return;
                    }
                }
            });
            this.f33807b = z11;
        }
    }
}
