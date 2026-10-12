package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class hl0 extends s4.t0 {
    public boolean f26795a;
    public boolean f26796b;
    public ValueAnimator f26797c;
    public ValueAnimator d;
    public final nl0 f26798e;

    public hl0(nl0 nl0Var) {
        this.f26798e = nl0Var;
    }

    public static ValueAnimator c(float f7, float f10, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(Math.abs(f10 - f7) * 150.0f);
        duration.addUpdateListener(new m80(aVar, 9));
        duration.addListener(new org.telegram.ui.r0(1, runnable));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        nl0 nl0Var = this.f26798e;
        gg.i0 i0Var = nl0Var.W;
        boolean z11 = false;
        if (i0Var.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (z10 != this.f26795a) {
            ValueAnimator valueAnimator = this.f26797c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = nl0Var.f28856r;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f26797c = c(f11, f7, new q0.a(this) {
                public final hl0 f26139b;

                {
                    this.f26139b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f12 = (Float) obj;
                    switch (r2) {
                        case 0:
                            nl0 nl0Var2 = this.f26139b.f26798e;
                            Paint paint = nl0Var2.h;
                            float floatValue = f12.floatValue();
                            nl0Var2.f28856r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            nl0Var2.invalidate();
                            return;
                        default:
                            nl0 nl0Var3 = this.f26139b.f26798e;
                            Paint paint2 = nl0Var3.f28851n;
                            float floatValue2 = f12.floatValue();
                            nl0Var3.f28858s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            nl0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final hl0 f26453b;

                {
                    this.f26453b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f26453b.f26797c = null;
                            return;
                        default:
                            this.f26453b.d = null;
                            return;
                    }
                }
            });
            this.f26795a = z10;
        }
        if (i0Var.N0() != nl0Var.f28825a0.h() - 1) {
            z11 = true;
        }
        if (z11 != this.f26796b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f12 = nl0Var.f28858s;
            if (z11) {
                f10 = 1.0f;
            }
            this.d = c(f12, f10, new q0.a(this) {
                public final hl0 f26139b;

                {
                    this.f26139b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f122 = (Float) obj;
                    switch (r2) {
                        case 0:
                            nl0 nl0Var2 = this.f26139b.f26798e;
                            Paint paint = nl0Var2.h;
                            float floatValue = f122.floatValue();
                            nl0Var2.f28856r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            nl0Var2.invalidate();
                            return;
                        default:
                            nl0 nl0Var3 = this.f26139b.f26798e;
                            Paint paint2 = nl0Var3.f28851n;
                            float floatValue2 = f122.floatValue();
                            nl0Var3.f28858s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            nl0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final hl0 f26453b;

                {
                    this.f26453b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f26453b.f26797c = null;
                            return;
                        default:
                            this.f26453b.d = null;
                            return;
                    }
                }
            });
            this.f26796b = z11;
        }
    }
}
