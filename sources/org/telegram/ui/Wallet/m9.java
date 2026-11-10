package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
public final class m9 {
    public final float f42831a;
    public final float f42832b;
    public final float f42833c;
    public final float d;
    public final float f42834e;
    public final boolean f42835f;
    public final long f42836g;
    public final n9 h;

    public m9(n9 n9Var, m9 m9Var, float f10, boolean z9) {
        float z10;
        this.h = n9Var;
        this.f42835f = z9;
        this.f42832b = f10;
        this.f42831a = m9Var != null ? m9Var.f42831a : f10;
        this.f42836g = (m9Var == null || z9) ? SystemClock.uptimeMillis() : m9Var.f42836g;
        float f11 = 0.0f;
        float a10 = (m9Var == null || !z9) ? 0.0f : m9Var.a();
        if (m9Var != null) {
            float f12 = m9Var.f42833c;
            f11 = com.google.android.recaptcha.internal.a.z(1.0f, f12, a10, f12);
        }
        this.f42833c = f11;
        if (m9Var == null) {
            z10 = n9Var.O;
        } else {
            float f13 = m9Var.d;
            z10 = com.google.android.recaptcha.internal.a.z(1.0f, f13, a10, f13);
        }
        this.d = z10;
        this.f42834e = m9Var == null ? (-org.telegram.messenger.g0.N(44.0f)) * 0.1f : m9Var.f42834e * (1.0f - a10);
    }

    public final float a() {
        if (this.h.I >= 1.0f) {
            return 1.0f;
        }
        return n9.S.getInterpolation(Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f42836g)) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f10, int i7) {
        float f11;
        float f12;
        float a10 = a();
        float f13 = 1.0f;
        boolean z9 = this.f42835f;
        if (z9) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        float f14 = this.f42833c;
        float z10 = com.google.android.recaptcha.internal.a.z(f11, f14, a10, f14);
        if (z10 <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f10;
        float f15 = i7;
        float f16 = this.f42834e;
        float f17 = f15 + f16;
        if (z9) {
            f12 = org.telegram.messenger.g0.N(44.0f) * 0.1f;
        } else {
            f12 = 0.0f;
        }
        canvas.translate(d, com.google.android.recaptcha.internal.a.z(f12, f16, a10, f17));
        if (z9) {
            f13 = this.h.O;
        }
        float f18 = this.d;
        float z11 = com.google.android.recaptcha.internal.a.z(f13, f18, a10, f18);
        canvas.scale(z11, z11, measureText / 2.0f, (paint.descent() + paint.ascent()) / 2.0f);
        paint.setAlpha(Math.round(alpha * z10));
        canvas.drawText(str, 0.0f, 0.0f, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final m9 c() {
        n9 n9Var = this.h;
        if (n9Var.I >= 1.0f) {
            return new m9(n9Var, d());
        }
        return new m9(n9Var, d(), this);
    }

    public final float d() {
        float f10 = this.f42832b;
        float f11 = this.f42831a;
        return (n9.S.getInterpolation(this.h.I) * (f10 - f11)) + f11;
    }

    public m9(n9 n9Var, float f10) {
        this.h = n9Var;
        this.f42835f = false;
        this.f42832b = f10;
        this.f42831a = f10;
        this.f42833c = 1.0f;
        this.d = 1.0f;
        this.f42834e = 0.0f;
        this.f42836g = SystemClock.uptimeMillis();
    }

    public m9(n9 n9Var, float f10, m9 m9Var) {
        this.h = n9Var;
        this.f42835f = m9Var.f42835f;
        this.f42832b = f10;
        this.f42831a = f10;
        this.f42833c = m9Var.f42833c;
        this.d = m9Var.d;
        this.f42834e = m9Var.f42834e;
        this.f42836g = m9Var.f42836g;
    }
}
