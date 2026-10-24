package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zr;
public final class q0 {
    public float f31788a;
    public float f31789b;
    public float f31790c;
    public boolean e;
    public final j3 f31791f;
    public final j3 f31792g;
    public ValueAnimator f31794j;
    public int f31795k;
    public float d = 0.0f;
    public boolean h = false;
    public float f31793i = 1.0f;

    public q0(int i10, int i11, int i12, int i13) {
        ?? z9Var = new z9(i13 - 1);
        this.f31791f = z9Var;
        ?? z9Var2 = new z9(i13);
        this.f31792g = z9Var2;
        z9Var.f33181a = i10;
        z9Var.f33182b = i11;
        z9Var2.f33181a = i10 - i12;
        z9Var2.f33182b = i11 - i12;
        z9Var.b();
        z9Var2.b();
        z9Var.d.setColor(-1);
        z9Var.d.setAlpha(20);
        z9Var2.d.setColor(-1);
        z9Var2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f7, float f10, View view) {
        float f11 = (this.f31788a * 0.4f) + 0.8f;
        if (this.e || this.d != 0.0f) {
            canvas.save();
            float interpolation = zr.f33337f.getInterpolation(this.d) * f11;
            canvas.scale(interpolation, interpolation, f7, f10);
            float f12 = this.f31788a;
            float f13 = this.f31793i;
            j3 j3Var = this.f31791f;
            j3Var.g(f12, f13);
            Paint paint = j3Var.d;
            j3Var.a(f7, f10, canvas, paint);
            float f14 = this.f31788a;
            float f15 = this.f31793i;
            j3 j3Var2 = this.f31792g;
            j3Var2.g(f14, f15);
            j3Var2.a(f7, f10, canvas, paint);
            canvas.restore();
        }
        if (!this.h || this.f31795k != 0) {
            int i10 = this.f31795k;
            if (i10 != 0) {
                this.f31795k = i10 - 1;
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
        this.f31789b = f10;
        this.f31790c = (f10 - this.f31788a) / 200.0f;
    }

    public final void c() {
        float f7 = this.f31789b;
        float f10 = this.f31788a;
        if (f7 != f10) {
            float f11 = this.f31790c;
            float f12 = (16.0f * f11) + f10;
            this.f31788a = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f31788a = f7;
                }
            } else if (f12 < f7) {
                this.f31788a = f7;
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
