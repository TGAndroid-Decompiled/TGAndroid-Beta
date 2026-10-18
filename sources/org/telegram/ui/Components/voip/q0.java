package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.bs;
public final class q0 {
    public float f31672a;
    public float f31673b;
    public float f31674c;
    public boolean e;
    public final j3 f31675f;
    public final j3 f31676g;
    public ValueAnimator f31678j;
    public int f31679k;
    public float d = 0.0f;
    public boolean h = false;
    public float f31677i = 1.0f;

    public q0(int i10, int i11, int i12, int i13) {
        ?? baVar = new ba(i13 - 1);
        this.f31675f = baVar;
        ?? baVar2 = new ba(i13);
        this.f31676g = baVar2;
        baVar.f24872a = i10;
        baVar.f24873b = i11;
        baVar2.f24872a = i10 - i12;
        baVar2.f24873b = i11 - i12;
        baVar.b();
        baVar2.b();
        baVar.d.setColor(-1);
        baVar.d.setAlpha(20);
        baVar2.d.setColor(-1);
        baVar2.d.setAlpha(36);
    }

    public final void a(Canvas canvas, float f7, float f10, View view) {
        float f11 = (this.f31672a * 0.4f) + 0.8f;
        if (this.e || this.d != 0.0f) {
            canvas.save();
            float interpolation = bs.f25030f.getInterpolation(this.d) * f11;
            canvas.scale(interpolation, interpolation, f7, f10);
            float f12 = this.f31672a;
            float f13 = this.f31677i;
            j3 j3Var = this.f31675f;
            j3Var.g(f12, f13);
            Paint paint = j3Var.d;
            j3Var.a(f7, f10, canvas, paint);
            float f14 = this.f31672a;
            float f15 = this.f31677i;
            j3 j3Var2 = this.f31676g;
            j3Var2.g(f14, f15);
            j3Var2.a(f7, f10, canvas, paint);
            canvas.restore();
        }
        if (!this.h || this.f31679k != 0) {
            int i10 = this.f31679k;
            if (i10 != 0) {
                this.f31679k = i10 - 1;
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
        this.f31673b = f10;
        this.f31674c = (f10 - this.f31672a) / 200.0f;
    }

    public final void c() {
        float f7 = this.f31673b;
        float f10 = this.f31672a;
        if (f7 != f10) {
            float f11 = this.f31674c;
            float f12 = (16.0f * f11) + f10;
            this.f31672a = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f31672a = f7;
                }
            } else if (f12 < f7) {
                this.f31672a = f7;
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
