package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.er;

public final class z3 {

    public float f26022a;

    public float f26023b;

    public float f26024c;

    public boolean f26025e;

    public final org.telegram.ui.Components.s9 f26026f;

    public final org.telegram.ui.Components.s9 f26027g;
    public boolean h;

    public int f26028i;
    public float d = 0.0f;

    public float f26029j = 0.0f;

    public z3(int i10, int i11) {
        org.telegram.ui.Components.s9 s9Var = new org.telegram.ui.Components.s9(6);
        this.f26026f = s9Var;
        org.telegram.ui.Components.s9 s9Var2 = new org.telegram.ui.Components.s9(8);
        this.f26027g = s9Var2;
        float f10 = i10;
        s9Var.f32356a = f10;
        float f11 = i11;
        s9Var.f32357b = f11;
        s9Var2.f32356a = f10;
        s9Var2.f32357b = f11;
        s9Var.b();
        s9Var2.b();
        int i12 = org.telegram.ui.ActionBar.g6.f23292qg;
        s9Var.d.setColor(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i12, false), 38));
        s9Var2.d.setColor(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i12, false), 38));
    }

    public final void a(Canvas canvas, float f10, float f11, View view) {
        float f12;
        float f13;
        if (LiteMode.isEnabled(512)) {
            float f14 = (this.f26022a * 0.4f) + 0.8f;
            if (this.f26025e || this.d != 0.0f) {
                canvas.save();
                float interpolation = er.f28122f.getInterpolation(this.d) * f14;
                canvas.scale(interpolation, interpolation, f10, f11);
                boolean z10 = this.h;
                org.telegram.ui.Components.s9 s9Var = this.f26026f;
                if (!z10) {
                    int i10 = this.f26028i;
                    if (i10 != 1) {
                        float f15 = this.f26029j;
                        if (f15 != 1.0f) {
                            float f16 = f15 + 0.10666667f;
                            this.f26029j = f16;
                            if (f16 > 1.0f) {
                                this.f26029j = 1.0f;
                            }
                        } else if (i10 == 1) {
                            f12 = this.f26029j;
                            if (f12 != 0.0f) {
                                f13 = f12 - 0.10666667f;
                                this.f26029j = f13;
                                if (f13 < 0.0f) {
                                    this.f26029j = 0.0f;
                                }
                            }
                        }
                    } else if (i10 == 1) {
                        f12 = this.f26029j;
                        if (f12 != 0.0f) {
                            f13 = f12 - 0.10666667f;
                            this.f26029j = f13;
                            if (f13 < 0.0f) {
                                this.f26029j = 0.0f;
                            }
                        }
                    }
                    s9Var.d.setColor(i0.b.k(i0.b.d(this.f26029j, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23292qg, false), org.telegram.ui.ActionBar.g6.w0(null, this.f26028i == 2 ? org.telegram.ui.ActionBar.g6.f23330sg : org.telegram.ui.ActionBar.g6.f23275pg, false)), 38));
                }
                s9Var.e(this.f26022a, 1.0f);
                Paint paint = s9Var.d;
                s9Var.a(f10, f11, canvas, paint);
                float f17 = this.f26022a;
                org.telegram.ui.Components.s9 s9Var2 = this.f26027g;
                s9Var2.e(f17, 1.0f);
                s9Var2.a(f10, f11, canvas, paint);
                canvas.restore();
            }
            if (this.d != 0.0f) {
                view.invalidate();
            }
        }
    }

    public final float b() {
        float f10 = (this.f26022a * 0.2f) + 0.9f;
        float interpolation = er.f28123g.getInterpolation(this.d);
        return com.google.android.recaptcha.internal.a.z(1.0f, interpolation, 1.0f, f10 * interpolation);
    }

    public final void c(double d) {
        float f10 = ((float) d) / 80.0f;
        float f11 = 0.0f;
        if (!this.f26025e) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f11 = 1.0f;
        } else if (f10 >= 0.0f) {
            f11 = f10;
        }
        this.f26023b = f11;
        this.f26024c = (f11 - this.f26022a) / 200.0f;
    }

    public final void d(int i10) {
        this.h = true;
        this.f26026f.d.setColor(i10);
    }

    public final void e(View view, boolean z10) {
        if (this.f26025e != z10) {
            view.invalidate();
        }
        this.f26025e = z10;
    }

    public final void f() {
        float f10 = this.f26023b;
        float f11 = this.f26022a;
        if (f10 != f11) {
            float f12 = this.f26024c;
            float f13 = (16.0f * f12) + f11;
            this.f26022a = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f26022a = f10;
                }
            } else if (f13 < f10) {
                this.f26022a = f10;
            }
        }
        boolean z10 = this.f26025e;
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
        if (z10) {
            return;
        }
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
