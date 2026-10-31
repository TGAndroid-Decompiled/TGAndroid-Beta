package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.m9;
public final class a0 {
    public float f31306a;
    public float f31307b;
    public float f31308c;
    public boolean e;
    public final s2 f31309f;
    public final s2 f31310g;
    public ValueAnimator f31312j;
    public int f31313k;
    public float d = 0.0f;
    public boolean h = false;
    public float f31311i = 1.0f;

    public a0(int i10, int i11, int i12, int i13) {
        ?? m9Var = new m9(i13 - 1);
        this.f31309f = m9Var;
        ?? m9Var2 = new m9(i13);
        this.f31310g = m9Var2;
        m9Var.f28380a = i10;
        m9Var.f28381b = i11;
        m9Var2.f28380a = i10 - i12;
        m9Var2.f28381b = i11 - i12;
        m9Var.b();
        m9Var2.b();
        m9Var.d.setColor(-1);
        m9Var.d.setAlpha(20);
        m9Var2.d.setColor(-1);
        m9Var2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f7, float f10, View view) {
        float f11 = (this.f31306a * 0.4f) + 0.8f;
        if (this.e || this.d != 0.0f) {
            canvas.save();
            float interpolation = gr.f26495f.getInterpolation(this.d) * f11;
            canvas.scale(interpolation, interpolation, f7, f10);
            float f12 = this.f31306a;
            float f13 = this.f31311i;
            s2 s2Var = this.f31309f;
            s2Var.g(f12, f13);
            Paint paint = s2Var.d;
            s2Var.a(f7, f10, canvas, paint);
            float f14 = this.f31306a;
            float f15 = this.f31311i;
            s2 s2Var2 = this.f31310g;
            s2Var2.g(f14, f15);
            s2Var2.a(f7, f10, canvas, paint);
            canvas.restore();
        }
        if (!this.h || this.f31313k != 0) {
            int i10 = this.f31313k;
            if (i10 != 0) {
                this.f31313k = i10 - 1;
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final void b(double d) {
        float f7 = ((float) d) / 80.0f;
        float f10 = 0.0f;
        if (!this.e) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f10 = 1.0f;
        } else if (f7 >= 0.0f) {
            f10 = f7;
        }
        this.f31307b = f10;
        this.f31308c = (f10 - this.f31306a) / 200.0f;
    }

    public final void c() {
        float f7 = this.f31307b;
        float f10 = this.f31306a;
        if (f7 != f10) {
            float f11 = this.f31308c;
            float f12 = (16.0f * f11) + f10;
            this.f31306a = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f31306a = f7;
                }
            } else if (f12 < f7) {
                this.f31306a = f7;
            }
        }
        boolean z10 = this.e;
        if (z10) {
            float f13 = this.d;
            if (f13 != 1.0f) {
                float f14 = f13 + 0.045714285f;
                this.d = f14;
                if (f14 > 1.0f) {
                    this.d = 1.0f;
                    return;
                }
                return;
            }
        }
        if (!z10) {
            float f15 = this.d;
            if (f15 != 0.0f) {
                float f16 = f15 - 0.045714285f;
                this.d = f16;
                if (f16 < 0.0f) {
                    this.d = 0.0f;
                }
            }
        }
    }
}
