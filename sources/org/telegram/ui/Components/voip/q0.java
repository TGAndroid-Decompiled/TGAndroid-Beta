package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.pr;
public final class q0 {
    public float f31751a;
    public float f31752b;
    public float f31753c;
    public boolean f31754e;
    public final j3 f31755f;
    public final j3 f31756g;
    public ValueAnimator f31758j;
    public int f31759k;
    public float d = 0.0f;
    public boolean h = false;
    public float f31757i = 1.0f;

    public q0(int i10, int i11, int i12, int i13) {
        ?? caVar = new ca(i13 - 1);
        this.f31755f = caVar;
        ?? caVar2 = new ca(i13);
        this.f31756g = caVar2;
        caVar.f24954a = i10;
        caVar.f24955b = i11;
        caVar2.f24954a = i10 - i12;
        caVar2.f24955b = i11 - i12;
        caVar.b();
        caVar2.b();
        caVar.d.setColor(-1);
        caVar.d.setAlpha(20);
        caVar2.d.setColor(-1);
        caVar2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f7, float f10, View view) {
        float f11 = (this.f31751a * 0.4f) + 0.8f;
        if (this.f31754e || this.d != 0.0f) {
            canvas.save();
            float interpolation = pr.f29494f.getInterpolation(this.d) * f11;
            canvas.scale(interpolation, interpolation, f7, f10);
            float f12 = this.f31751a;
            float f13 = this.f31757i;
            j3 j3Var = this.f31755f;
            j3Var.g(f12, f13);
            Paint paint = j3Var.d;
            j3Var.a(f7, f10, canvas, paint);
            float f14 = this.f31751a;
            float f15 = this.f31757i;
            j3 j3Var2 = this.f31756g;
            j3Var2.g(f14, f15);
            j3Var2.a(f7, f10, canvas, paint);
            canvas.restore();
        }
        if (!this.h || this.f31759k != 0) {
            int i10 = this.f31759k;
            if (i10 != 0) {
                this.f31759k = i10 - 1;
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final void b(double d) {
        float f7 = ((float) d) / 80.0f;
        float f10 = 0.0f;
        if (!this.f31754e) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f10 = 1.0f;
        } else if (f7 >= 0.0f) {
            f10 = f7;
        }
        this.f31752b = f10;
        this.f31753c = (f10 - this.f31751a) / 200.0f;
    }

    public final void c() {
        float f7 = this.f31752b;
        float f10 = this.f31751a;
        if (f7 != f10) {
            float f11 = this.f31753c;
            float f12 = (16.0f * f11) + f10;
            this.f31751a = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f31751a = f7;
                }
            } else if (f12 < f7) {
                this.f31751a = f7;
            }
        }
        boolean z10 = this.f31754e;
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
