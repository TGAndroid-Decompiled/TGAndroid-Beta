package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.is;
public final class s0 {
    public float f32263a;
    public float f32264b;
    public float f32265c;
    public boolean f32266e;
    public final l3 f32267f;
    public final l3 f32268g;
    public ValueAnimator f32270j;
    public int f32271k;
    public float d = 0.0f;
    public boolean h = false;
    public float f32269i = 1.0f;

    public s0(int i10, int i11, int i12, int i13) {
        ?? daVar = new da(i13 - 1);
        this.f32267f = daVar;
        ?? daVar2 = new da(i13);
        this.f32268g = daVar2;
        daVar.f25605a = i10;
        daVar.f25606b = i11;
        daVar2.f25605a = i10 - i12;
        daVar2.f25606b = i11 - i12;
        daVar.b();
        daVar2.b();
        daVar.d.setColor(-1);
        daVar.d.setAlpha(20);
        daVar2.d.setColor(-1);
        daVar2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f7, float f10, View view) {
        float f11 = (this.f32263a * 0.4f) + 0.8f;
        if (this.f32266e || this.d != 0.0f) {
            canvas.save();
            float interpolation = is.f27443f.getInterpolation(this.d) * f11;
            canvas.scale(interpolation, interpolation, f7, f10);
            float f12 = this.f32263a;
            float f13 = this.f32269i;
            l3 l3Var = this.f32267f;
            l3Var.g(f12, f13);
            Paint paint = l3Var.d;
            l3Var.a(f7, f10, canvas, paint);
            float f14 = this.f32263a;
            float f15 = this.f32269i;
            l3 l3Var2 = this.f32268g;
            l3Var2.g(f14, f15);
            l3Var2.a(f7, f10, canvas, paint);
            canvas.restore();
        }
        if (!this.h || this.f32271k != 0) {
            int i10 = this.f32271k;
            if (i10 != 0) {
                this.f32271k = i10 - 1;
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final void b(double d) {
        float f7 = ((float) d) / 80.0f;
        float f10 = 0.0f;
        if (!this.f32266e) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f10 = 1.0f;
        } else if (f7 >= 0.0f) {
            f10 = f7;
        }
        this.f32264b = f10;
        this.f32265c = (f10 - this.f32263a) / 200.0f;
    }

    public final void c() {
        float f7 = this.f32264b;
        float f10 = this.f32263a;
        if (f7 != f10) {
            float f11 = this.f32265c;
            float f12 = (16.0f * f11) + f10;
            this.f32263a = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f32263a = f7;
                }
            } else if (f12 < f7) {
                this.f32263a = f7;
            }
        }
        boolean z10 = this.f32266e;
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
