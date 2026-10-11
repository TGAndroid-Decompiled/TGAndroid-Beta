package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.is;
public final class t0 {
    public float f32321a;
    public float f32322b;
    public float f32323c;
    public boolean f32324e;
    public final m3 f32325f;
    public final m3 f32326g;
    public ValueAnimator f32328j;
    public int f32329k;
    public float d = 0.0f;
    public boolean h = false;
    public float f32327i = 1.0f;

    public t0(int i10, int i11, int i12, int i13) {
        ?? daVar = new da(i13 - 1);
        this.f32325f = daVar;
        ?? daVar2 = new da(i13);
        this.f32326g = daVar2;
        daVar.f25702a = i10;
        daVar.f25703b = i11;
        daVar2.f25702a = i10 - i12;
        daVar2.f25703b = i11 - i12;
        daVar.b();
        daVar2.b();
        daVar.d.setColor(-1);
        daVar.d.setAlpha(20);
        daVar2.d.setColor(-1);
        daVar2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f7, float f10, View view) {
        float f11 = (this.f32321a * 0.4f) + 0.8f;
        if (this.f32324e || this.d != 0.0f) {
            canvas.save();
            float interpolation = is.f27500f.getInterpolation(this.d) * f11;
            canvas.scale(interpolation, interpolation, f7, f10);
            float f12 = this.f32321a;
            float f13 = this.f32327i;
            m3 m3Var = this.f32325f;
            m3Var.g(f12, f13);
            Paint paint = m3Var.d;
            m3Var.a(f7, f10, canvas, paint);
            float f14 = this.f32321a;
            float f15 = this.f32327i;
            m3 m3Var2 = this.f32326g;
            m3Var2.g(f14, f15);
            m3Var2.a(f7, f10, canvas, paint);
            canvas.restore();
        }
        if (!this.h || this.f32329k != 0) {
            int i10 = this.f32329k;
            if (i10 != 0) {
                this.f32329k = i10 - 1;
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final void b(double d) {
        float f7 = ((float) d) / 80.0f;
        float f10 = 0.0f;
        if (!this.f32324e) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f10 = 1.0f;
        } else if (f7 >= 0.0f) {
            f10 = f7;
        }
        this.f32322b = f10;
        this.f32323c = (f10 - this.f32321a) / 200.0f;
    }

    public final void c() {
        float f7 = this.f32322b;
        float f10 = this.f32321a;
        if (f7 != f10) {
            float f11 = this.f32323c;
            float f12 = (16.0f * f11) + f10;
            this.f32321a = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f32321a = f7;
                }
            } else if (f12 < f7) {
                this.f32321a = f7;
            }
        }
        boolean z10 = this.f32324e;
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
