package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.u9;
public final class q0 {
    public float f32279a;
    public float f32280b;
    public float f32281c;
    public boolean f32282e;
    public final m3 f32283f;
    public final m3 f32284g;
    public ValueAnimator f32286j;
    public int f32287k;
    public float d = 0.0f;
    public boolean h = false;
    public float f32285i = 1.0f;

    public q0(int i10, int i11, int i12, int i13) {
        ?? u9Var = new u9(i13 - 1);
        this.f32283f = u9Var;
        ?? u9Var2 = new u9(i13);
        this.f32284g = u9Var2;
        u9Var.f31606a = i10;
        u9Var.f31607b = i11;
        u9Var2.f31606a = i10 - i12;
        u9Var2.f31607b = i11 - i12;
        u9Var.b();
        u9Var2.b();
        u9Var.d.setColor(-1);
        u9Var.d.setAlpha(20);
        u9Var2.d.setColor(-1);
        u9Var2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f10, float f11, View view) {
        float f12 = (this.f32279a * 0.4f) + 0.8f;
        if (this.f32282e || this.d != 0.0f) {
            canvas.save();
            float interpolation = pr.f30183f.getInterpolation(this.d) * f12;
            canvas.scale(interpolation, interpolation, f10, f11);
            float f13 = this.f32279a;
            float f14 = this.f32285i;
            m3 m3Var = this.f32283f;
            m3Var.g(f13, f14);
            Paint paint = m3Var.d;
            m3Var.a(f10, f11, canvas, paint);
            float f15 = this.f32279a;
            float f16 = this.f32285i;
            m3 m3Var2 = this.f32284g;
            m3Var2.g(f15, f16);
            m3Var2.a(f10, f11, canvas, paint);
            canvas.restore();
        }
        if (!this.h || this.f32287k != 0) {
            int i10 = this.f32287k;
            if (i10 != 0) {
                this.f32287k = i10 - 1;
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final void b(double d) {
        float f10 = ((float) d) / 80.0f;
        float f11 = 0.0f;
        if (!this.f32282e) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f11 = 1.0f;
        } else if (f10 >= 0.0f) {
            f11 = f10;
        }
        this.f32280b = f11;
        this.f32281c = (f11 - this.f32279a) / 200.0f;
    }

    public final void c() {
        float f10 = this.f32280b;
        float f11 = this.f32279a;
        if (f10 != f11) {
            float f12 = this.f32281c;
            float f13 = (16.0f * f12) + f11;
            this.f32279a = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f32279a = f10;
                }
            } else if (f13 < f10) {
                this.f32279a = f10;
            }
        }
        boolean z4 = this.f32282e;
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
