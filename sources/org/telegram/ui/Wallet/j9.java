package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
public final class j9 {
    public final float f42633a;
    public final float f42634b;
    public final float f42635c;
    public final float d;
    public final float f42636e;
    public final boolean f42637f;
    public final long f42638g;
    public final k9 h;

    public j9(k9 k9Var, j9 j9Var, float f10, boolean z9) {
        float z10;
        this.h = k9Var;
        this.f42637f = z9;
        this.f42634b = f10;
        this.f42633a = j9Var != null ? j9Var.f42633a : f10;
        this.f42638g = (j9Var == null || z9) ? SystemClock.uptimeMillis() : j9Var.f42638g;
        float f11 = 0.0f;
        float a10 = (j9Var == null || !z9) ? 0.0f : j9Var.a();
        if (j9Var != null) {
            float f12 = j9Var.f42635c;
            f11 = com.google.android.recaptcha.internal.a.z(1.0f, f12, a10, f12);
        }
        this.f42635c = f11;
        if (j9Var == null) {
            z10 = k9Var.O;
        } else {
            float f13 = j9Var.d;
            z10 = com.google.android.recaptcha.internal.a.z(1.0f, f13, a10, f13);
        }
        this.d = z10;
        this.f42636e = j9Var == null ? (-org.telegram.messenger.g0.N(44.0f)) * 0.1f : j9Var.f42636e * (1.0f - a10);
    }

    public final float a() {
        if (this.h.I >= 1.0f) {
            return 1.0f;
        }
        return k9.S.getInterpolation(Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f42638g)) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f10, int i7) {
        float f11;
        float f12;
        float a10 = a();
        float f13 = 1.0f;
        boolean z9 = this.f42637f;
        if (z9) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        float f14 = this.f42635c;
        float z10 = com.google.android.recaptcha.internal.a.z(f11, f14, a10, f14);
        if (z10 <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f10;
        float f15 = i7;
        float f16 = this.f42636e;
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

    public final j9 c() {
        k9 k9Var = this.h;
        if (k9Var.I >= 1.0f) {
            return new j9(k9Var, d());
        }
        return new j9(k9Var, d(), this);
    }

    public final float d() {
        float f10 = this.f42634b;
        float f11 = this.f42633a;
        return (k9.S.getInterpolation(this.h.I) * (f10 - f11)) + f11;
    }

    public j9(k9 k9Var, float f10) {
        this.h = k9Var;
        this.f42637f = false;
        this.f42634b = f10;
        this.f42633a = f10;
        this.f42635c = 1.0f;
        this.d = 1.0f;
        this.f42636e = 0.0f;
        this.f42638g = SystemClock.uptimeMillis();
    }

    public j9(k9 k9Var, float f10, j9 j9Var) {
        this.h = k9Var;
        this.f42637f = j9Var.f42637f;
        this.f42634b = f10;
        this.f42633a = f10;
        this.f42635c = j9Var.f42635c;
        this.d = j9Var.d;
        this.f42636e = j9Var.f42636e;
        this.f42638g = j9Var.f42638g;
    }
}
