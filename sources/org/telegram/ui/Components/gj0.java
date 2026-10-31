package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class gj0 extends s4.s0 {
    public boolean f26384a;
    public boolean f26385b;
    public ValueAnimator f26386c;
    public ValueAnimator d;
    public final mj0 e;

    public gj0(mj0 mj0Var) {
        this.e = mj0Var;
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
        mj0 mj0Var = this.e;
        org.telegram.ui.br brVar = mj0Var.W;
        boolean z11 = false;
        if (brVar.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (z10 != this.f26384a) {
            ValueAnimator valueAnimator = this.f26386c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = mj0Var.f28529r;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f26386c = c(f11, f7, new q0.a(this) {
                public final gj0 f25819b;

                {
                    this.f25819b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f12 = (Float) obj;
                    switch (r2) {
                        case 0:
                            mj0 mj0Var2 = this.f25819b.e;
                            Paint paint = mj0Var2.h;
                            float floatValue = f12.floatValue();
                            mj0Var2.f28529r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            mj0Var2.invalidate();
                            return;
                        default:
                            mj0 mj0Var3 = this.f25819b.e;
                            Paint paint2 = mj0Var3.f28524n;
                            float floatValue2 = f12.floatValue();
                            mj0Var3.f28531s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            mj0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final gj0 f26095b;

                {
                    this.f26095b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f26095b.f26386c = null;
                            return;
                        default:
                            this.f26095b.d = null;
                            return;
                    }
                }
            });
            this.f26384a = z10;
        }
        if (brVar.N0() != mj0Var.f28498a0.b() - 1) {
            z11 = true;
        }
        if (z11 != this.f26385b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f12 = mj0Var.f28531s;
            if (z11) {
                f10 = 1.0f;
            }
            this.d = c(f12, f10, new q0.a(this) {
                public final gj0 f25819b;

                {
                    this.f25819b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f122 = (Float) obj;
                    switch (r2) {
                        case 0:
                            mj0 mj0Var2 = this.f25819b.e;
                            Paint paint = mj0Var2.h;
                            float floatValue = f122.floatValue();
                            mj0Var2.f28529r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            mj0Var2.invalidate();
                            return;
                        default:
                            mj0 mj0Var3 = this.f25819b.e;
                            Paint paint2 = mj0Var3.f28524n;
                            float floatValue2 = f122.floatValue();
                            mj0Var3.f28531s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            mj0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final gj0 f26095b;

                {
                    this.f26095b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f26095b.f26386c = null;
                            return;
                        default:
                            this.f26095b.d = null;
                            return;
                    }
                }
            });
            this.f26385b = z11;
        }
    }
}
