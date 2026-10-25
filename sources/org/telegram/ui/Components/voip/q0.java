package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.fa;
public final class q0 {
    public float f34019a;
    public float f34020b;
    public float f34021c;
    public boolean e;
    public final m3 f34022f;
    public final m3 f34023g;
    public ValueAnimator f34025j;
    public int f34026k;
    public float d = 0.0f;
    public boolean h = false;
    public float f34024i = 1.0f;

    public q0(int i10, int i11, int i12, int i13) {
        ?? faVar = new fa(i13 - 1);
        this.f34022f = faVar;
        ?? faVar2 = new fa(i13);
        this.f34023g = faVar2;
        faVar.f28109a = i10;
        faVar.f28110b = i11;
        faVar2.f28109a = i10 - i12;
        faVar2.f28110b = i11 - i12;
        faVar.b();
        faVar2.b();
        faVar.d.setColor(-1);
        faVar.d.setAlpha(20);
        faVar2.d.setColor(-1);
        faVar2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f7, float f10, View view) {
        float f11 = (this.f34019a * 0.4f) + 0.8f;
        if (this.e || this.d != 0.0f) {
            canvas.save();
            float interpolation = ds.f27584f.getInterpolation(this.d) * f11;
            canvas.scale(interpolation, interpolation, f7, f10);
            float f12 = this.f34019a;
            float f13 = this.f34024i;
            m3 m3Var = this.f34022f;
            m3Var.g(f12, f13);
            Paint paint = m3Var.d;
            m3Var.a(f7, f10, canvas, paint);
            float f14 = this.f34019a;
            float f15 = this.f34024i;
            m3 m3Var2 = this.f34023g;
            m3Var2.g(f14, f15);
            m3Var2.a(f7, f10, canvas, paint);
            canvas.restore();
        }
        if (!this.h || this.f34026k != 0) {
            int i10 = this.f34026k;
            if (i10 != 0) {
                this.f34026k = i10 - 1;
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
        this.f34020b = f10;
        this.f34021c = (f10 - this.f34019a) / 200.0f;
    }

    public final void c() {
        float f7 = this.f34020b;
        float f10 = this.f34019a;
        if (f7 != f10) {
            float f11 = this.f34021c;
            float f12 = (16.0f * f11) + f10;
            this.f34019a = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f34019a = f7;
                }
            } else if (f12 < f7) {
                this.f34019a = f7;
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
