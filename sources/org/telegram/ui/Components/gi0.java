package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class gi0 extends v4.t0 {
    public boolean f34991a;
    public boolean f34992b;
    public ValueAnimator f34993c;
    public ValueAnimator d;
    public final mi0 f34994e;

    public gi0(mi0 mi0Var) {
        this.f34994e = mi0Var;
    }

    public static ValueAnimator c(float f10, float f11, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(Math.abs(f11 - f10) * 150.0f);
        duration.addUpdateListener(new f60(aVar, 7));
        duration.addListener(new h60(runnable, 13));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z10;
        float f10;
        mi0 mi0Var = this.f34994e;
        jg.i0 i0Var = mi0Var.f37256a0;
        boolean z11 = false;
        if (i0Var.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f11 = 0.0f;
        if (z10 != this.f34991a) {
            ValueAnimator valueAnimator = this.f34993c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f12 = mi0Var.f37288r;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f34993c = c(f12, f10, new q0.a(this) {
                public final gi0 f34324b;

                {
                    this.f34324b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f13 = (Float) obj;
                    switch (r2) {
                        case 0:
                            mi0 mi0Var2 = this.f34324b.f34994e;
                            Paint paint = mi0Var2.h;
                            float floatValue = f13.floatValue();
                            mi0Var2.f37288r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            mi0Var2.invalidate();
                            return;
                        default:
                            mi0 mi0Var3 = this.f34324b.f34994e;
                            Paint paint2 = mi0Var3.f37283n;
                            float floatValue2 = f13.floatValue();
                            mi0Var3.f37290s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            mi0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final gi0 f34618b;

                {
                    this.f34618b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f34618b.f34993c = null;
                            return;
                        default:
                            this.f34618b.d = null;
                            return;
                    }
                }
            });
            this.f34991a = z10;
        }
        if (i0Var.N0() != mi0Var.f37259b0.b() - 1) {
            z11 = true;
        }
        if (z11 != this.f34992b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f13 = mi0Var.f37290s;
            if (z11) {
                f11 = 1.0f;
            }
            this.d = c(f13, f11, new q0.a(this) {
                public final gi0 f34324b;

                {
                    this.f34324b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f132 = (Float) obj;
                    switch (r2) {
                        case 0:
                            mi0 mi0Var2 = this.f34324b.f34994e;
                            Paint paint = mi0Var2.h;
                            float floatValue = f132.floatValue();
                            mi0Var2.f37288r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            mi0Var2.invalidate();
                            return;
                        default:
                            mi0 mi0Var3 = this.f34324b.f34994e;
                            Paint paint2 = mi0Var3.f37283n;
                            float floatValue2 = f132.floatValue();
                            mi0Var3.f37290s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            mi0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final gi0 f34618b;

                {
                    this.f34618b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f34618b.f34993c = null;
                            return;
                        default:
                            this.f34618b.d = null;
                            return;
                    }
                }
            });
            this.f34992b = z11;
        }
    }
}
