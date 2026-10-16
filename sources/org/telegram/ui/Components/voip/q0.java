package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.ea;
import org.telegram.ui.Components.es;
public final class q0 {
    public float f30070a;
    public float f30071b;
    public float f30072c;
    public boolean e;
    public final k3 f30073f;
    public final k3 f30074g;
    public ValueAnimator f30076j;
    public int f30077k;
    public float d = 0.0f;
    public boolean h = false;
    public float f30075i = 1.0f;

    public q0(int i10, int i11, int i12, int i13) {
        ?? eaVar = new ea(i13 - 1);
        this.f30073f = eaVar;
        ?? eaVar2 = new ea(i13);
        this.f30074g = eaVar2;
        eaVar.f24333a = i10;
        eaVar.f24334b = i11;
        eaVar2.f24333a = i10 - i12;
        eaVar2.f24334b = i11 - i12;
        eaVar.b();
        eaVar2.b();
        eaVar.d.setColor(-1);
        eaVar.d.setAlpha(20);
        eaVar2.d.setColor(-1);
        eaVar2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f7, float f10, View view) {
        float f11 = (this.f30070a * 0.4f) + 0.8f;
        if (this.e || this.d != 0.0f) {
            canvas.save();
            float interpolation = es.f24465f.getInterpolation(this.d) * f11;
            canvas.scale(interpolation, interpolation, f7, f10);
            float f12 = this.f30070a;
            float f13 = this.f30075i;
            k3 k3Var = this.f30073f;
            k3Var.g(f12, f13);
            Paint paint = k3Var.d;
            k3Var.a(f7, f10, canvas, paint);
            float f14 = this.f30070a;
            float f15 = this.f30075i;
            k3 k3Var2 = this.f30074g;
            k3Var2.g(f14, f15);
            k3Var2.a(f7, f10, canvas, paint);
            canvas.restore();
        }
        if (!this.h || this.f30077k != 0) {
            int i10 = this.f30077k;
            if (i10 != 0) {
                this.f30077k = i10 - 1;
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
        this.f30071b = f10;
        this.f30072c = (f10 - this.f30070a) / 200.0f;
    }

    public final void c() {
        float f7 = this.f30071b;
        float f10 = this.f30070a;
        if (f7 != f10) {
            float f11 = this.f30072c;
            float f12 = (16.0f * f11) + f10;
            this.f30070a = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f30070a = f7;
                }
            } else if (f12 < f7) {
                this.f30070a = f7;
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
