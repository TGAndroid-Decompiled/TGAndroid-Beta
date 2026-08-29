package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.y9;
public final class q0 {
    public float f33930a;
    public float f33931b;
    public float f33932c;
    public boolean f33933e;
    public final n3 f33934f;
    public final n3 f33935g;
    public ValueAnimator f33937j;
    public int f33938k;
    public float d = 0.0f;
    public boolean h = false;
    public float f33936i = 1.0f;

    public q0(int i10, int i11, int i12, int i13) {
        ?? y9Var = new y9(i13 - 1);
        this.f33934f = y9Var;
        ?? y9Var2 = new y9(i13);
        this.f33935g = y9Var2;
        y9Var.f34975a = i10;
        y9Var.f34976b = i11;
        y9Var2.f34975a = i10 - i12;
        y9Var2.f34976b = i11 - i12;
        y9Var.b();
        y9Var2.b();
        y9Var.d.setColor(-1);
        y9Var.d.setAlpha(20);
        y9Var2.d.setColor(-1);
        y9Var2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f9, float f10, View view) {
        float f11 = (this.f33930a * 0.4f) + 0.8f;
        if (this.f33933e || this.d != 0.0f) {
            canvas.save();
            float interpolation = jr.f29800f.getInterpolation(this.d) * f11;
            canvas.scale(interpolation, interpolation, f9, f10);
            float f12 = this.f33930a;
            float f13 = this.f33936i;
            n3 n3Var = this.f33934f;
            n3Var.g(f12, f13);
            Paint paint = n3Var.d;
            n3Var.a(f9, f10, canvas, paint);
            float f14 = this.f33930a;
            float f15 = this.f33936i;
            n3 n3Var2 = this.f33935g;
            n3Var2.g(f14, f15);
            n3Var2.a(f9, f10, canvas, paint);
            canvas.restore();
        }
        if (!this.h || this.f33938k != 0) {
            int i10 = this.f33938k;
            if (i10 != 0) {
                this.f33938k = i10 - 1;
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final void b(double d) {
        float f9 = ((float) d) / 80.0f;
        float f10 = 0.0f;
        if (!this.f33933e) {
            f9 = 0.0f;
        }
        if (f9 > 1.0f) {
            f10 = 1.0f;
        } else if (f9 >= 0.0f) {
            f10 = f9;
        }
        this.f33931b = f10;
        this.f33932c = (f10 - this.f33930a) / 200.0f;
    }

    public final void c() {
        float f9 = this.f33931b;
        float f10 = this.f33930a;
        if (f9 != f10) {
            float f11 = this.f33932c;
            float f12 = (16.0f * f11) + f10;
            this.f33930a = f12;
            if (f11 > 0.0f) {
                if (f12 > f9) {
                    this.f33930a = f9;
                }
            } else if (f12 < f9) {
                this.f33930a = f9;
            }
        }
        boolean z10 = this.f33933e;
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
