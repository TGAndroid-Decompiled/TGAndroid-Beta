package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t9;
public final class p0 {
    public float f33740a;
    public float f33741b;
    public float f33742c;
    public boolean f33743e;
    public final k3 f33744f;
    public final k3 f33745g;
    public ValueAnimator f33747j;
    public int f33748k;
    public float d = 0.0f;
    public boolean h = false;
    public float f33746i = 1.0f;

    public p0(int i9, int i10, int i11, int i12) {
        ?? t9Var = new t9(i12 - 1);
        this.f33744f = t9Var;
        ?? t9Var2 = new t9(i12);
        this.f33745g = t9Var2;
        t9Var.f32647a = i9;
        t9Var.f32648b = i10;
        t9Var2.f32647a = i9 - i11;
        t9Var2.f32648b = i10 - i11;
        t9Var.b();
        t9Var2.b();
        t9Var.d.setColor(-1);
        t9Var.d.setAlpha(20);
        t9Var2.d.setColor(-1);
        t9Var2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f10, float f11, View view) {
        float f12 = (this.f33740a * 0.4f) + 0.8f;
        if (this.f33743e || this.d != 0.0f) {
            canvas.save();
            float interpolation = gr.f28844f.getInterpolation(this.d) * f12;
            canvas.scale(interpolation, interpolation, f10, f11);
            float f13 = this.f33740a;
            float f14 = this.f33746i;
            k3 k3Var = this.f33744f;
            k3Var.g(f13, f14);
            Paint paint = k3Var.d;
            k3Var.a(f10, f11, canvas, paint);
            float f15 = this.f33740a;
            float f16 = this.f33746i;
            k3 k3Var2 = this.f33745g;
            k3Var2.g(f15, f16);
            k3Var2.a(f10, f11, canvas, paint);
            canvas.restore();
        }
        if (!this.h || this.f33748k != 0) {
            int i9 = this.f33748k;
            if (i9 != 0) {
                this.f33748k = i9 - 1;
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final void b(double d) {
        float f10 = ((float) d) / 80.0f;
        float f11 = 0.0f;
        if (!this.f33743e) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f11 = 1.0f;
        } else if (f10 >= 0.0f) {
            f11 = f10;
        }
        this.f33741b = f11;
        this.f33742c = (f11 - this.f33740a) / 200.0f;
    }

    public final void c() {
        float f10 = this.f33741b;
        float f11 = this.f33740a;
        if (f10 != f11) {
            float f12 = this.f33742c;
            float f13 = (16.0f * f12) + f11;
            this.f33740a = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f33740a = f10;
                }
            } else if (f13 < f10) {
                this.f33740a = f10;
            }
        }
        boolean z10 = this.f33743e;
        if (z10) {
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
        if (!z10) {
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
