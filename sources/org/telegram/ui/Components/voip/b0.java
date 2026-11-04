package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.xq;
public final class b0 {
    public float f39230a;
    public float f39231b;
    public float f39232c;
    public boolean f39233e;
    public final r2 f39234f;
    public final r2 f39235g;
    public ValueAnimator f39237j;
    public int f39238k;
    public float d = 0.0f;
    public boolean h = false;
    public float f39236i = 1.0f;

    public b0(int i3, int i10, int i11, int i12) {
        ?? q9Var = new q9(i12 - 1);
        this.f39234f = q9Var;
        ?? q9Var2 = new q9(i12);
        this.f39235g = q9Var2;
        q9Var.f37381a = i3;
        q9Var.f37382b = i10;
        q9Var2.f37381a = i3 - i11;
        q9Var2.f37382b = i10 - i11;
        q9Var.b();
        q9Var2.b();
        q9Var.d.setColor(-1);
        q9Var.d.setAlpha(20);
        q9Var2.d.setColor(-1);
        q9Var2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f10, float f11, View view) {
        float f12 = (this.f39230a * 0.4f) + 0.8f;
        if (this.f39233e || this.d != 0.0f) {
            canvas.save();
            float interpolation = xq.f40452f.getInterpolation(this.d) * f12;
            canvas.scale(interpolation, interpolation, f10, f11);
            float f13 = this.f39230a;
            float f14 = this.f39236i;
            r2 r2Var = this.f39234f;
            r2Var.g(f13, f14);
            Paint paint = r2Var.d;
            r2Var.a(f10, f11, canvas, paint);
            float f15 = this.f39230a;
            float f16 = this.f39236i;
            r2 r2Var2 = this.f39235g;
            r2Var2.g(f15, f16);
            r2Var2.a(f10, f11, canvas, paint);
            canvas.restore();
        }
        if (!this.h || this.f39238k != 0) {
            int i3 = this.f39238k;
            if (i3 != 0) {
                this.f39238k = i3 - 1;
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final void b(double d) {
        float f10 = ((float) d) / 80.0f;
        float f11 = 0.0f;
        if (!this.f39233e) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f11 = 1.0f;
        } else if (f10 >= 0.0f) {
            f11 = f10;
        }
        this.f39231b = f11;
        this.f39232c = (f11 - this.f39230a) / 200.0f;
    }

    public final void c() {
        float f10 = this.f39231b;
        float f11 = this.f39230a;
        if (f10 != f11) {
            float f12 = this.f39232c;
            float f13 = (16.0f * f12) + f11;
            this.f39230a = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f39230a = f10;
                }
            } else if (f13 < f10) {
                this.f39230a = f10;
            }
        }
        boolean z10 = this.f39233e;
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
