package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.js;
public final class t0 {
    public float f31943a;
    public float f31944b;
    public float f31945c;
    public boolean f31946e;
    public final m3 f31947f;
    public final m3 f31948g;
    public ValueAnimator f31950j;
    public int f31951k;
    public float d = 0.0f;
    public boolean h = false;
    public float f31949i = 1.0f;

    public t0(int i10, int i11, int i12, int i13) {
        ?? daVar = new da(i13 - 1);
        this.f31947f = daVar;
        ?? daVar2 = new da(i13);
        this.f31948g = daVar2;
        daVar.f25264a = i10;
        daVar.f25265b = i11;
        daVar2.f25264a = i10 - i12;
        daVar2.f25265b = i11 - i12;
        daVar.b();
        daVar2.b();
        daVar.d.setColor(-1);
        daVar.d.setAlpha(20);
        daVar2.d.setColor(-1);
        daVar2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f7, float f10, View view) {
        float f11 = (this.f31943a * 0.4f) + 0.8f;
        if (this.f31946e || this.d != 0.0f) {
            canvas.save();
            float interpolation = js.f27634f.getInterpolation(this.d) * f11;
            canvas.scale(interpolation, interpolation, f7, f10);
            float f12 = this.f31943a;
            float f13 = this.f31949i;
            m3 m3Var = this.f31947f;
            m3Var.g(f12, f13);
            Paint paint = m3Var.d;
            m3Var.a(f7, f10, canvas, paint);
            float f14 = this.f31943a;
            float f15 = this.f31949i;
            m3 m3Var2 = this.f31948g;
            m3Var2.g(f14, f15);
            m3Var2.a(f7, f10, canvas, paint);
            canvas.restore();
        }
        if (!this.h || this.f31951k != 0) {
            int i10 = this.f31951k;
            if (i10 != 0) {
                this.f31951k = i10 - 1;
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final void b(double d) {
        float f7 = ((float) d) / 80.0f;
        float f10 = 0.0f;
        if (!this.f31946e) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f10 = 1.0f;
        } else if (f7 >= 0.0f) {
            f10 = f7;
        }
        this.f31944b = f10;
        this.f31945c = (f10 - this.f31943a) / 200.0f;
    }

    public final void c() {
        float f7 = this.f31944b;
        float f10 = this.f31943a;
        if (f7 != f10) {
            float f11 = this.f31945c;
            float f12 = (16.0f * f11) + f10;
            this.f31943a = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f31943a = f7;
                }
            } else if (f12 < f7) {
                this.f31943a = f7;
            }
        }
        boolean z10 = this.f31946e;
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
