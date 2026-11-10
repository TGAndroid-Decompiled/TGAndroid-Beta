package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.wq;
public final class o0 {
    public float f39438a;
    public float f39439b;
    public float f39440c;
    public boolean f39441e;
    public final c3 f39442f;
    public final c3 f39443g;
    public ValueAnimator f39445j;
    public int f39446k;
    public float d = 0.0f;
    public boolean h = false;
    public float f39444i = 1.0f;

    public o0(int i7, int i10, int i11, int i12) {
        ?? q9Var = new q9(i12 - 1);
        this.f39442f = q9Var;
        ?? q9Var2 = new q9(i12);
        this.f39443g = q9Var2;
        q9Var.f37178a = i7;
        q9Var.f37179b = i10;
        q9Var2.f37178a = i7 - i11;
        q9Var2.f37179b = i10 - i11;
        q9Var.b();
        q9Var2.b();
        q9Var.d.setColor(-1);
        q9Var.d.setAlpha(20);
        q9Var2.d.setColor(-1);
        q9Var2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f10, float f11, View view) {
        float f12 = (this.f39438a * 0.4f) + 0.8f;
        if (this.f39441e || this.d != 0.0f) {
            canvas.save();
            float interpolation = wq.f40046f.getInterpolation(this.d) * f12;
            canvas.scale(interpolation, interpolation, f10, f11);
            float f13 = this.f39438a;
            float f14 = this.f39444i;
            c3 c3Var = this.f39442f;
            c3Var.g(f13, f14);
            Paint paint = c3Var.d;
            c3Var.a(f10, f11, canvas, paint);
            float f15 = this.f39438a;
            float f16 = this.f39444i;
            c3 c3Var2 = this.f39443g;
            c3Var2.g(f15, f16);
            c3Var2.a(f10, f11, canvas, paint);
            canvas.restore();
        }
        if (!this.h || this.f39446k != 0) {
            int i7 = this.f39446k;
            if (i7 != 0) {
                this.f39446k = i7 - 1;
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final void b(double d) {
        float f10 = ((float) d) / 80.0f;
        float f11 = 0.0f;
        if (!this.f39441e) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f11 = 1.0f;
        } else if (f10 >= 0.0f) {
            f11 = f10;
        }
        this.f39439b = f11;
        this.f39440c = (f11 - this.f39438a) / 200.0f;
    }

    public final void c() {
        float f10 = this.f39439b;
        float f11 = this.f39438a;
        if (f10 != f11) {
            float f12 = this.f39440c;
            float f13 = (16.0f * f12) + f11;
            this.f39438a = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f39438a = f10;
                }
            } else if (f13 < f10) {
                this.f39438a = f10;
            }
        }
        boolean z9 = this.f39441e;
        if (z9) {
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
        if (!z9) {
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
