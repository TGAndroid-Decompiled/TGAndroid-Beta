package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.u9;
public final class p0 {
    public float f29845a;
    public float f29846b;
    public float f29847c;
    public boolean e;
    public final l3 f29848f;
    public final l3 f29849g;
    public ValueAnimator f29851j;
    public int f29852k;
    public float d = 0.0f;
    public boolean h = false;
    public float f29850i = 1.0f;

    public p0(int i10, int i11, int i12, int i13) {
        ?? u9Var = new u9(i13 - 1);
        this.f29848f = u9Var;
        ?? u9Var2 = new u9(i13);
        this.f29849g = u9Var2;
        u9Var.f29131a = i10;
        u9Var.f29132b = i11;
        u9Var2.f29131a = i10 - i12;
        u9Var2.f29132b = i11 - i12;
        u9Var.b();
        u9Var2.b();
        u9Var.d.setColor(-1);
        u9Var.d.setAlpha(20);
        u9Var2.d.setColor(-1);
        u9Var2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f10, float f11, View view) {
        float f12 = (this.f29845a * 0.4f) + 0.8f;
        if (this.e || this.d != 0.0f) {
            canvas.save();
            float interpolation = nr.f27346f.getInterpolation(this.d) * f12;
            canvas.scale(interpolation, interpolation, f10, f11);
            float f13 = this.f29845a;
            float f14 = this.f29850i;
            l3 l3Var = this.f29848f;
            l3Var.g(f13, f14);
            Paint paint = l3Var.d;
            l3Var.a(f10, f11, canvas, paint);
            float f15 = this.f29845a;
            float f16 = this.f29850i;
            l3 l3Var2 = this.f29849g;
            l3Var2.g(f15, f16);
            l3Var2.a(f10, f11, canvas, paint);
            canvas.restore();
        }
        if (!this.h || this.f29852k != 0) {
            int i10 = this.f29852k;
            if (i10 != 0) {
                this.f29852k = i10 - 1;
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final void b(double d) {
        float f10 = ((float) d) / 80.0f;
        float f11 = 0.0f;
        if (!this.e) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f11 = 1.0f;
        } else if (f10 >= 0.0f) {
            f11 = f10;
        }
        this.f29846b = f11;
        this.f29847c = (f11 - this.f29845a) / 200.0f;
    }

    public final void c() {
        float f10 = this.f29846b;
        float f11 = this.f29845a;
        if (f10 != f11) {
            float f12 = this.f29847c;
            float f13 = (16.0f * f12) + f11;
            this.f29845a = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f29845a = f10;
                }
            } else if (f13 < f10) {
                this.f29845a = f10;
            }
        }
        boolean z4 = this.e;
        if (z4) {
            float f14 = this.d;
            if (f14 != 1.0f) {
                float f15 = f14 + 0.045714285f;
                this.d = f15;
                if (f15 > 1.0f) {
                    this.d = 1.0f;
                    return;
                }
                return;
            }
        }
        if (!z4) {
            float f16 = this.d;
            if (f16 != 0.0f) {
                float f17 = f16 - 0.045714285f;
                this.d = f17;
                if (f17 < 0.0f) {
                    this.d = 0.0f;
                }
            }
        }
    }
}
