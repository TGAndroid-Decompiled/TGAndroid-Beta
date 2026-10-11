package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.is;
public final class t0 {
    public float f32257a;
    public float f32258b;
    public float f32259c;
    public boolean f32260e;
    public final m3 f32261f;
    public final m3 f32262g;
    public ValueAnimator f32264j;
    public int f32265k;
    public float d = 0.0f;
    public boolean h = false;
    public float f32263i = 1.0f;

    public t0(int i10, int i11, int i12, int i13) {
        ?? daVar = new da(i13 - 1);
        this.f32261f = daVar;
        ?? daVar2 = new da(i13);
        this.f32262g = daVar2;
        daVar.f25498a = i10;
        daVar.f25499b = i11;
        daVar2.f25498a = i10 - i12;
        daVar2.f25499b = i11 - i12;
        daVar.b();
        daVar2.b();
        daVar.d.setColor(-1);
        daVar.d.setAlpha(20);
        daVar2.d.setColor(-1);
        daVar2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f7, float f10, View view) {
        float f11 = (this.f32257a * 0.4f) + 0.8f;
        if (this.f32260e || this.d != 0.0f) {
            canvas.save();
            float interpolation = is.f27451f.getInterpolation(this.d) * f11;
            canvas.scale(interpolation, interpolation, f7, f10);
            float f12 = this.f32257a;
            float f13 = this.f32263i;
            m3 m3Var = this.f32261f;
            m3Var.g(f12, f13);
            Paint paint = m3Var.d;
            m3Var.a(f7, f10, canvas, paint);
            float f14 = this.f32257a;
            float f15 = this.f32263i;
            m3 m3Var2 = this.f32262g;
            m3Var2.g(f14, f15);
            m3Var2.a(f7, f10, canvas, paint);
            canvas.restore();
        }
        if (!this.h || this.f32265k != 0) {
            int i10 = this.f32265k;
            if (i10 != 0) {
                this.f32265k = i10 - 1;
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final void b(double d) {
        float f7 = ((float) d) / 80.0f;
        float f10 = 0.0f;
        if (!this.f32260e) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f10 = 1.0f;
        } else if (f7 >= 0.0f) {
            f10 = f7;
        }
        this.f32258b = f10;
        this.f32259c = (f10 - this.f32257a) / 200.0f;
    }

    public final void c() {
        float f7 = this.f32258b;
        float f10 = this.f32257a;
        if (f7 != f10) {
            float f11 = this.f32259c;
            float f12 = (16.0f * f11) + f10;
            this.f32257a = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f32257a = f7;
                }
            } else if (f12 < f7) {
                this.f32257a = f7;
            }
        }
        boolean z10 = this.f32260e;
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
