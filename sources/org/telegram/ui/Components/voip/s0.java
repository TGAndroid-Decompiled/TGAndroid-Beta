package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.z9;
public final class s0 {
    public float f29169a;
    public float f29170b;
    public float f29171c;
    public boolean e;
    public final l3 f29172f;
    public final l3 f29173g;
    public ValueAnimator f29175j;
    public int f29176k;
    public float d = 0.0f;
    public boolean h = false;
    public float f29174i = 1.0f;

    public s0(int i10, int i11, int i12, int i13) {
        ?? z9Var = new z9(i13 - 1);
        this.f29172f = z9Var;
        ?? z9Var2 = new z9(i13);
        this.f29173g = z9Var2;
        z9Var.f30427a = i10;
        z9Var.f30428b = i11;
        z9Var2.f30427a = i10 - i12;
        z9Var2.f30428b = i11 - i12;
        z9Var.b();
        z9Var2.b();
        z9Var.d.setColor(-1);
        z9Var.d.setAlpha(20);
        z9Var2.d.setColor(-1);
        z9Var2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f7, float f10, View view) {
        float f11 = (this.f29169a * 0.4f) + 0.8f;
        if (this.e || this.d != 0.0f) {
            canvas.save();
            float interpolation = qr.f27380f.getInterpolation(this.d) * f11;
            canvas.scale(interpolation, interpolation, f7, f10);
            float f12 = this.f29169a;
            float f13 = this.f29174i;
            l3 l3Var = this.f29172f;
            l3Var.g(f12, f13);
            Paint paint = l3Var.d;
            l3Var.a(f7, f10, canvas, paint);
            float f14 = this.f29169a;
            float f15 = this.f29174i;
            l3 l3Var2 = this.f29173g;
            l3Var2.g(f14, f15);
            l3Var2.a(f7, f10, canvas, paint);
            canvas.restore();
        }
        if (!this.h || this.f29176k != 0) {
            int i10 = this.f29176k;
            if (i10 != 0) {
                this.f29176k = i10 - 1;
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
        this.f29170b = f10;
        this.f29171c = (f10 - this.f29169a) / 200.0f;
    }

    public final void c() {
        float f7 = this.f29170b;
        float f10 = this.f29169a;
        if (f7 != f10) {
            float f11 = this.f29171c;
            float f12 = (16.0f * f11) + f10;
            this.f29169a = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f29169a = f7;
                }
            } else if (f12 < f7) {
                this.f29169a = f7;
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
