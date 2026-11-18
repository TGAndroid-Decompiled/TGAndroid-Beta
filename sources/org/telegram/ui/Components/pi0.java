package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class pi0 extends v4.u0 {
    public boolean f38452a;
    public boolean f38453b;
    public ValueAnimator f38454c;
    public ValueAnimator d;
    public final vi0 f38455e;

    public pi0(vi0 vi0Var) {
        this.f38455e = vi0Var;
    }

    public static ValueAnimator c(float f10, float f11, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(Math.abs(f11 - f10) * 150.0f);
        duration.addUpdateListener(new e60(aVar, 9));
        duration.addListener(new q60(runnable, 13));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z10;
        float f10;
        vi0 vi0Var = this.f38455e;
        jg.i0 i0Var = vi0Var.f40639a0;
        boolean z11 = false;
        if (i0Var.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f11 = 0.0f;
        if (z10 != this.f38452a) {
            ValueAnimator valueAnimator = this.f38454c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f12 = vi0Var.f40671r;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f38454c = c(f12, f10, new q0.a(this) {
                public final pi0 f37795b;

                {
                    this.f37795b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f13 = (Float) obj;
                    switch (r2) {
                        case 0:
                            vi0 vi0Var2 = this.f37795b.f38455e;
                            Paint paint = vi0Var2.h;
                            float floatValue = f13.floatValue();
                            vi0Var2.f40671r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            vi0Var2.invalidate();
                            return;
                        default:
                            vi0 vi0Var3 = this.f37795b.f38455e;
                            Paint paint2 = vi0Var3.f40666n;
                            float floatValue2 = f13.floatValue();
                            vi0Var3.f40673s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            vi0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final pi0 f38114b;

                {
                    this.f38114b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f38114b.f38454c = null;
                            return;
                        default:
                            this.f38114b.d = null;
                            return;
                    }
                }
            });
            this.f38452a = z10;
        }
        if (i0Var.N0() != vi0Var.f40642b0.b() - 1) {
            z11 = true;
        }
        if (z11 != this.f38453b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f13 = vi0Var.f40673s;
            if (z11) {
                f11 = 1.0f;
            }
            this.d = c(f13, f11, new q0.a(this) {
                public final pi0 f37795b;

                {
                    this.f37795b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f132 = (Float) obj;
                    switch (r2) {
                        case 0:
                            vi0 vi0Var2 = this.f37795b.f38455e;
                            Paint paint = vi0Var2.h;
                            float floatValue = f132.floatValue();
                            vi0Var2.f40671r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            vi0Var2.invalidate();
                            return;
                        default:
                            vi0 vi0Var3 = this.f37795b.f38455e;
                            Paint paint2 = vi0Var3.f40666n;
                            float floatValue2 = f132.floatValue();
                            vi0Var3.f40673s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            vi0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final pi0 f38114b;

                {
                    this.f38114b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f38114b.f38454c = null;
                            return;
                        default:
                            this.f38114b.d = null;
                            return;
                    }
                }
            });
            this.f38453b = z11;
        }
    }
}
