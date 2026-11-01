package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class hj0 extends s4.s0 {
    public boolean f26809a;
    public boolean f26810b;
    public ValueAnimator f26811c;
    public ValueAnimator d;
    public final nj0 e;

    public hj0(nj0 nj0Var) {
        this.e = nj0Var;
    }

    public static ValueAnimator c(float f7, float f10, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(Math.abs(f10 - f7) * 150.0f);
        duration.addUpdateListener(new r60(aVar, 8));
        duration.addListener(new t60(runnable, 13));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        nj0 nj0Var = this.e;
        org.telegram.ui.br brVar = nj0Var.W;
        boolean z11 = false;
        if (brVar.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (z10 != this.f26809a) {
            ValueAnimator valueAnimator = this.f26811c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = nj0Var.f28890r;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f26811c = c(f11, f7, new q0.a(this) {
                public final hj0 f26179b;

                {
                    this.f26179b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f12 = (Float) obj;
                    switch (r2) {
                        case 0:
                            nj0 nj0Var2 = this.f26179b.e;
                            Paint paint = nj0Var2.h;
                            float floatValue = f12.floatValue();
                            nj0Var2.f28890r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            nj0Var2.invalidate();
                            return;
                        default:
                            nj0 nj0Var3 = this.f26179b.e;
                            Paint paint2 = nj0Var3.f28885n;
                            float floatValue2 = f12.floatValue();
                            nj0Var3.f28892s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            nj0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final hj0 f26467b;

                {
                    this.f26467b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f26467b.f26811c = null;
                            return;
                        default:
                            this.f26467b.d = null;
                            return;
                    }
                }
            });
            this.f26809a = z10;
        }
        if (brVar.N0() != nj0Var.f28859a0.b() - 1) {
            z11 = true;
        }
        if (z11 != this.f26810b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f12 = nj0Var.f28892s;
            if (z11) {
                f10 = 1.0f;
            }
            this.d = c(f12, f10, new q0.a(this) {
                public final hj0 f26179b;

                {
                    this.f26179b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f122 = (Float) obj;
                    switch (r2) {
                        case 0:
                            nj0 nj0Var2 = this.f26179b.e;
                            Paint paint = nj0Var2.h;
                            float floatValue = f122.floatValue();
                            nj0Var2.f28890r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            nj0Var2.invalidate();
                            return;
                        default:
                            nj0 nj0Var3 = this.f26179b.e;
                            Paint paint2 = nj0Var3.f28885n;
                            float floatValue2 = f122.floatValue();
                            nj0Var3.f28892s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            nj0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final hj0 f26467b;

                {
                    this.f26467b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f26467b.f26811c = null;
                            return;
                        default:
                            this.f26467b.d = null;
                            return;
                    }
                }
            });
            this.f26810b = z11;
        }
    }
}
