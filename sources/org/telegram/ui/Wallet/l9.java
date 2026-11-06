package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
public final class l9 {
    public final float f42719a;
    public final float f42720b;
    public final float f42721c;
    public final float d;
    public final float f42722e;
    public final boolean f42723f;
    public final long f42724g;
    public final m9 h;

    public l9(m9 m9Var, l9 l9Var, float f10, boolean z9) {
        float z10;
        this.h = m9Var;
        this.f42723f = z9;
        this.f42720b = f10;
        this.f42719a = l9Var != null ? l9Var.f42719a : f10;
        this.f42724g = (l9Var == null || z9) ? SystemClock.uptimeMillis() : l9Var.f42724g;
        float f11 = 0.0f;
        float a10 = (l9Var == null || !z9) ? 0.0f : l9Var.a();
        if (l9Var != null) {
            float f12 = l9Var.f42721c;
            f11 = com.google.android.recaptcha.internal.a.z(1.0f, f12, a10, f12);
        }
        this.f42721c = f11;
        if (l9Var == null) {
            z10 = m9Var.O;
        } else {
            float f13 = l9Var.d;
            z10 = com.google.android.recaptcha.internal.a.z(1.0f, f13, a10, f13);
        }
        this.d = z10;
        this.f42722e = l9Var == null ? (-org.telegram.messenger.g0.N(44.0f)) * 0.1f : l9Var.f42722e * (1.0f - a10);
    }

    public final float a() {
        if (this.h.I >= 1.0f) {
            return 1.0f;
        }
        return m9.S.getInterpolation(Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f42724g)) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f10, int i7) {
        float f11;
        float f12;
        float a10 = a();
        float f13 = 1.0f;
        boolean z9 = this.f42723f;
        if (z9) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        float f14 = this.f42721c;
        float z10 = com.google.android.recaptcha.internal.a.z(f11, f14, a10, f14);
        if (z10 <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f10;
        float f15 = i7;
        float f16 = this.f42722e;
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

    public final l9 c() {
        m9 m9Var = this.h;
        if (m9Var.I >= 1.0f) {
            return new l9(m9Var, d());
        }
        return new l9(m9Var, d(), this);
    }

    public final float d() {
        float f10 = this.f42720b;
        float f11 = this.f42719a;
        return (m9.S.getInterpolation(this.h.I) * (f10 - f11)) + f11;
    }

    public l9(m9 m9Var, float f10) {
        this.h = m9Var;
        this.f42723f = false;
        this.f42720b = f10;
        this.f42719a = f10;
        this.f42721c = 1.0f;
        this.d = 1.0f;
        this.f42722e = 0.0f;
        this.f42724g = SystemClock.uptimeMillis();
    }

    public l9(m9 m9Var, float f10, l9 l9Var) {
        this.h = m9Var;
        this.f42723f = l9Var.f42723f;
        this.f42720b = f10;
        this.f42719a = f10;
        this.f42721c = l9Var.f42721c;
        this.d = l9Var.d;
        this.f42722e = l9Var.f42722e;
        this.f42724g = l9Var.f42724g;
    }
}
