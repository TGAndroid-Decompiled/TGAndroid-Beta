package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.w9;
public final class o0 {
    public float f41230a;
    public float f41231b;
    public float f41232c;
    public boolean f41233e;
    public final f3 f41234f;
    public final f3 f41235g;
    public ValueAnimator f41237j;
    public int f41238k;
    public float d = 0.0f;
    public boolean h = false;
    public float f41236i = 1.0f;

    public o0(int i7, int i10, int i11, int i12) {
        ?? w9Var = new w9(i12 - 1);
        this.f41234f = w9Var;
        ?? w9Var2 = new w9(i12);
        this.f41235g = w9Var2;
        w9Var.f41712a = i7;
        w9Var.f41713b = i10;
        w9Var2.f41712a = i7 - i11;
        w9Var2.f41713b = i10 - i11;
        w9Var.b();
        w9Var2.b();
        w9Var.d.setColor(-1);
        w9Var.d.setAlpha(20);
        w9Var2.d.setColor(-1);
        w9Var2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f10, float f11, View view) {
        float f12 = (this.f41230a * 0.4f) + 0.8f;
        if (this.f41233e || this.d != 0.0f) {
            canvas.save();
            float interpolation = nr.f37960f.getInterpolation(this.d) * f12;
            canvas.scale(interpolation, interpolation, f10, f11);
            float f13 = this.f41230a;
            float f14 = this.f41236i;
            f3 f3Var = this.f41234f;
            f3Var.g(f13, f14);
            Paint paint = f3Var.d;
            f3Var.a(f10, f11, canvas, paint);
            float f15 = this.f41230a;
            float f16 = this.f41236i;
            f3 f3Var2 = this.f41235g;
            f3Var2.g(f15, f16);
            f3Var2.a(f10, f11, canvas, paint);
            canvas.restore();
        }
        if (!this.h || this.f41238k != 0) {
            int i7 = this.f41238k;
            if (i7 != 0) {
                this.f41238k = i7 - 1;
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final void b(double d) {
        float f10 = ((float) d) / 80.0f;
        float f11 = 0.0f;
        if (!this.f41233e) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f11 = 1.0f;
        } else if (f10 >= 0.0f) {
            f11 = f10;
        }
        this.f41231b = f11;
        this.f41232c = (f11 - this.f41230a) / 200.0f;
    }

    public final void c() {
        float f10 = this.f41231b;
        float f11 = this.f41230a;
        if (f10 != f11) {
            float f12 = this.f41232c;
            float f13 = (16.0f * f12) + f11;
            this.f41230a = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f41230a = f10;
                }
            } else if (f13 < f10) {
                this.f41230a = f10;
            }
        }
        boolean z10 = this.f41233e;
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
