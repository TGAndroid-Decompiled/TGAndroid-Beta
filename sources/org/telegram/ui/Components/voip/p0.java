package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.er;

public final class p0 {

    public float f33790a;

    public float f33791b;

    public float f33792c;

    public boolean f33793e;

    public final k3 f33794f;

    public final k3 f33795g;

    public ValueAnimator f33797j;

    public int f33798k;
    public float d = 0.0f;
    public boolean h = false;

    public float f33796i = 1.0f;

    public p0(int i10, int i11, int i12, int i13) {
        k3 k3Var = new k3(i13 - 1);
        this.f33794f = k3Var;
        k3 k3Var2 = new k3(i13);
        this.f33795g = k3Var2;
        k3Var.f32356a = i10;
        k3Var.f32357b = i11;
        k3Var2.f32356a = i10 - i12;
        k3Var2.f32357b = i11 - i12;
        k3Var.b();
        k3Var2.b();
        k3Var.d.setColor(-1);
        k3Var.d.setAlpha(20);
        k3Var2.d.setColor(-1);
        k3Var2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f10, float f11, View view) {
        float f12 = (this.f33790a * 0.4f) + 0.8f;
        if (this.f33793e || this.d != 0.0f) {
            canvas.save();
            float interpolation = er.f28122f.getInterpolation(this.d) * f12;
            canvas.scale(interpolation, interpolation, f10, f11);
            float f13 = this.f33790a;
            float f14 = this.f33796i;
            k3 k3Var = this.f33794f;
            k3Var.g(f13, f14);
            Paint paint = k3Var.d;
            k3Var.a(f10, f11, canvas, paint);
            float f15 = this.f33790a;
            float f16 = this.f33796i;
            k3 k3Var2 = this.f33795g;
            k3Var2.g(f15, f16);
            k3Var2.a(f10, f11, canvas, paint);
            canvas.restore();
        }
        if (this.h && this.f33798k == 0) {
            return;
        }
        int i10 = this.f33798k;
        if (i10 != 0) {
            this.f33798k = i10 - 1;
        }
        if (this.d != 0.0f) {
            view.invalidate();
        }
    }

    public final void b(double d) {
        float f10 = ((float) d) / 80.0f;
        float f11 = 0.0f;
        if (!this.f33793e) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f11 = 1.0f;
        } else if (f10 >= 0.0f) {
            f11 = f10;
        }
        this.f33791b = f11;
        this.f33792c = (f11 - this.f33790a) / 200.0f;
    }

    public final void c() {
        float f10 = this.f33791b;
        float f11 = this.f33790a;
        if (f10 != f11) {
            float f12 = this.f33792c;
            float f13 = (16.0f * f12) + f11;
            this.f33790a = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f33790a = f10;
                }
            } else if (f13 < f10) {
                this.f33790a = f10;
            }
        }
        boolean z10 = this.f33793e;
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
        if (z10) {
            return;
        }
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
