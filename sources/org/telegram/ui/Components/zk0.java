package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class zk0 extends s4.r0 {
    public boolean f33286a;
    public boolean f33287b;
    public ValueAnimator f33288c;
    public ValueAnimator d;
    public final fl0 e;

    public zk0(fl0 fl0Var) {
        this.e = fl0Var;
    }

    public static ValueAnimator c(float f7, float f10, q0.a aVar, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(Math.abs(f10 - f7) * 150.0f);
        duration.addUpdateListener(new b80(aVar, 9));
        duration.addListener(new org.telegram.ui.s0(1, runnable));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        fl0 fl0Var = this.e;
        hg.i0 i0Var = fl0Var.W;
        boolean z11 = false;
        if (i0Var.L0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (z10 != this.f33286a) {
            ValueAnimator valueAnimator = this.f33288c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = fl0Var.f26378r;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f33288c = c(f11, f7, new q0.a(this) {
                public final zk0 f32631b;

                {
                    this.f32631b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f12 = (Float) obj;
                    switch (r2) {
                        case 0:
                            fl0 fl0Var2 = this.f32631b.e;
                            Paint paint = fl0Var2.h;
                            float floatValue = f12.floatValue();
                            fl0Var2.f26378r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            fl0Var2.invalidate();
                            return;
                        default:
                            fl0 fl0Var3 = this.f32631b.e;
                            Paint paint2 = fl0Var3.f26373n;
                            float floatValue2 = f12.floatValue();
                            fl0Var3.f26380s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            fl0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final zk0 f32974b;

                {
                    this.f32974b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f32974b.f33288c = null;
                            return;
                        default:
                            this.f32974b.d = null;
                            return;
                    }
                }
            });
            this.f33286a = z10;
        }
        if (i0Var.N0() != fl0Var.f26347a0.h() - 1) {
            z11 = true;
        }
        if (z11 != this.f33287b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f12 = fl0Var.f26380s;
            if (z11) {
                f10 = 1.0f;
            }
            this.d = c(f12, f10, new q0.a(this) {
                public final zk0 f32631b;

                {
                    this.f32631b = this;
                }

                @Override
                public final void accept(Object obj) {
                    Float f122 = (Float) obj;
                    switch (r2) {
                        case 0:
                            fl0 fl0Var2 = this.f32631b.e;
                            Paint paint = fl0Var2.h;
                            float floatValue = f122.floatValue();
                            fl0Var2.f26378r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            fl0Var2.invalidate();
                            return;
                        default:
                            fl0 fl0Var3 = this.f32631b.e;
                            Paint paint2 = fl0Var3.f26373n;
                            float floatValue2 = f122.floatValue();
                            fl0Var3.f26380s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            fl0Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final zk0 f32974b;

                {
                    this.f32974b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f32974b.f33288c = null;
                            return;
                        default:
                            this.f32974b.d = null;
                            return;
                    }
                }
            });
            this.f33287b = z11;
        }
    }
}
