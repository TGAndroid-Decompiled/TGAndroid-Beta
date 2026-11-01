package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
public final class p9 {
    public final float f35044a;
    public final float f35045b;
    public final float f35046c;
    public final float d;
    public final float e;
    public final boolean f35047f;
    public final long f35048g;
    public final q9 h;

    public p9(q9 q9Var, p9 p9Var, float f7, boolean z10) {
        float z11;
        this.h = q9Var;
        this.f35047f = z10;
        this.f35045b = f7;
        this.f35044a = p9Var != null ? p9Var.f35044a : f7;
        this.f35048g = (p9Var == null || z10) ? SystemClock.uptimeMillis() : p9Var.f35048g;
        float f10 = 0.0f;
        float a2 = (p9Var == null || !z10) ? 0.0f : p9Var.a();
        if (p9Var != null) {
            float f11 = p9Var.f35046c;
            f10 = c3.i0.z(1.0f, f11, a2, f11);
        }
        this.f35046c = f10;
        if (p9Var == null) {
            z11 = q9Var.O;
        } else {
            float f12 = p9Var.d;
            z11 = c3.i0.z(1.0f, f12, a2, f12);
        }
        this.d = z11;
        this.e = p9Var == null ? (-org.telegram.messenger.i0.N(44.0f)) * 0.1f : p9Var.e * (1.0f - a2);
    }

    public final float a() {
        if (this.h.I >= 1.0f) {
            return 1.0f;
        }
        return q9.S.getInterpolation(Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f35048g)) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f7, int i10) {
        float f10;
        float f11;
        float a2 = a();
        float f12 = 1.0f;
        boolean z10 = this.f35047f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        float f13 = this.f35046c;
        float z11 = c3.i0.z(f10, f13, a2, f13);
        if (z11 <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f7;
        float f14 = i10;
        float f15 = this.e;
        float f16 = f14 + f15;
        if (z10) {
            f11 = org.telegram.messenger.i0.N(44.0f) * 0.1f;
        } else {
            f11 = 0.0f;
        }
        canvas.translate(d, c3.i0.z(f11, f15, a2, f16));
        if (z10) {
            f12 = this.h.O;
        }
        float f17 = this.d;
        float z12 = c3.i0.z(f12, f17, a2, f17);
        canvas.scale(z12, z12, measureText / 2.0f, (paint.descent() + paint.ascent()) / 2.0f);
        paint.setAlpha(Math.round(alpha * z11));
        canvas.drawText(str, 0.0f, 0.0f, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final p9 c() {
        q9 q9Var = this.h;
        if (q9Var.I >= 1.0f) {
            return new p9(q9Var, d());
        }
        return new p9(q9Var, d(), this);
    }

    public final float d() {
        float f7 = this.f35045b;
        float f10 = this.f35044a;
        return (q9.S.getInterpolation(this.h.I) * (f7 - f10)) + f10;
    }

    public p9(q9 q9Var, float f7) {
        this.h = q9Var;
        this.f35047f = false;
        this.f35045b = f7;
        this.f35044a = f7;
        this.f35046c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f35048g = SystemClock.uptimeMillis();
    }

    public p9(q9 q9Var, float f7, p9 p9Var) {
        this.h = q9Var;
        this.f35047f = p9Var.f35047f;
        this.f35045b = f7;
        this.f35044a = f7;
        this.f35046c = p9Var.f35046c;
        this.d = p9Var.d;
        this.e = p9Var.e;
        this.f35048g = p9Var.f35048g;
    }
}
