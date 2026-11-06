package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.r9;
import org.telegram.ui.Components.xq;
public final class o0 {
    public float f39394a;
    public float f39395b;
    public float f39396c;
    public boolean f39397e;
    public final c3 f39398f;
    public final c3 f39399g;
    public ValueAnimator f39401j;
    public int f39402k;
    public float d = 0.0f;
    public boolean h = false;
    public float f39400i = 1.0f;

    public o0(int i7, int i10, int i11, int i12) {
        ?? r9Var = new r9(i12 - 1);
        this.f39398f = r9Var;
        ?? r9Var2 = new r9(i12);
        this.f39399g = r9Var2;
        r9Var.f37552a = i7;
        r9Var.f37553b = i10;
        r9Var2.f37552a = i7 - i11;
        r9Var2.f37553b = i10 - i11;
        r9Var.b();
        r9Var2.b();
        r9Var.d.setColor(-1);
        r9Var.d.setAlpha(20);
        r9Var2.d.setColor(-1);
        r9Var2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f10, float f11, View view) {
        float f12 = (this.f39394a * 0.4f) + 0.8f;
        if (this.f39397e || this.d != 0.0f) {
            canvas.save();
            float interpolation = xq.f40345f.getInterpolation(this.d) * f12;
            canvas.scale(interpolation, interpolation, f10, f11);
            float f13 = this.f39394a;
            float f14 = this.f39400i;
            c3 c3Var = this.f39398f;
            c3Var.g(f13, f14);
            Paint paint = c3Var.d;
            c3Var.a(f10, f11, canvas, paint);
            float f15 = this.f39394a;
            float f16 = this.f39400i;
            c3 c3Var2 = this.f39399g;
            c3Var2.g(f15, f16);
            c3Var2.a(f10, f11, canvas, paint);
            canvas.restore();
        }
        if (!this.h || this.f39402k != 0) {
            int i7 = this.f39402k;
            if (i7 != 0) {
                this.f39402k = i7 - 1;
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final void b(double d) {
        float f10 = ((float) d) / 80.0f;
        float f11 = 0.0f;
        if (!this.f39397e) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f11 = 1.0f;
        } else if (f10 >= 0.0f) {
            f11 = f10;
        }
        this.f39395b = f11;
        this.f39396c = (f11 - this.f39394a) / 200.0f;
    }

    public final void c() {
        float f10 = this.f39395b;
        float f11 = this.f39394a;
        if (f10 != f11) {
            float f12 = this.f39396c;
            float f13 = (16.0f * f12) + f11;
            this.f39394a = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f39394a = f10;
                }
            } else if (f13 < f10) {
                this.f39394a = f10;
            }
        }
        boolean z9 = this.f39397e;
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
