package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.v9;
public final class p0 {
    public float f41126a;
    public float f41127b;
    public float f41128c;
    public boolean f41129e;
    public final g3 f41130f;
    public final g3 f41131g;
    public ValueAnimator f41133j;
    public int f41134k;
    public float d = 0.0f;
    public boolean h = false;
    public float f41132i = 1.0f;

    public p0(int i7, int i10, int i11, int i12) {
        ?? v9Var = new v9(i12 - 1);
        this.f41130f = v9Var;
        ?? v9Var2 = new v9(i12);
        this.f41131g = v9Var2;
        v9Var.f40595a = i7;
        v9Var.f40596b = i10;
        v9Var2.f40595a = i7 - i11;
        v9Var2.f40596b = i10 - i11;
        v9Var.b();
        v9Var2.b();
        v9Var.d.setColor(-1);
        v9Var.d.setAlpha(20);
        v9Var2.d.setColor(-1);
        v9Var2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f10, float f11, View view) {
        float f12 = (this.f41126a * 0.4f) + 0.8f;
        if (this.f41129e || this.d != 0.0f) {
            canvas.save();
            float interpolation = kr.f36858f.getInterpolation(this.d) * f12;
            canvas.scale(interpolation, interpolation, f10, f11);
            float f13 = this.f41126a;
            float f14 = this.f41132i;
            g3 g3Var = this.f41130f;
            g3Var.g(f13, f14);
            Paint paint = g3Var.d;
            g3Var.a(f10, f11, canvas, paint);
            float f15 = this.f41126a;
            float f16 = this.f41132i;
            g3 g3Var2 = this.f41131g;
            g3Var2.g(f15, f16);
            g3Var2.a(f10, f11, canvas, paint);
            canvas.restore();
        }
        if (!this.h || this.f41134k != 0) {
            int i7 = this.f41134k;
            if (i7 != 0) {
                this.f41134k = i7 - 1;
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final void b(double d) {
        float f10 = ((float) d) / 80.0f;
        float f11 = 0.0f;
        if (!this.f41129e) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f11 = 1.0f;
        } else if (f10 >= 0.0f) {
            f11 = f10;
        }
        this.f41127b = f11;
        this.f41128c = (f11 - this.f41126a) / 200.0f;
    }

    public final void c() {
        float f10 = this.f41127b;
        float f11 = this.f41126a;
        if (f10 != f11) {
            float f12 = this.f41128c;
            float f13 = (16.0f * f12) + f11;
            this.f41126a = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f41126a = f10;
                }
            } else if (f13 < f10) {
                this.f41126a = f10;
            }
        }
        boolean z10 = this.f41129e;
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
