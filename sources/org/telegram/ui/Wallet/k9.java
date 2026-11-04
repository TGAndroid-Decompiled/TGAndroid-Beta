package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
public final class k9 {
    public final float f42756a;
    public final float f42757b;
    public final float f42758c;
    public final float d;
    public final float f42759e;
    public final boolean f42760f;
    public final long f42761g;
    public final l9 h;

    public k9(l9 l9Var, k9 k9Var, float f10, boolean z10) {
        float y9;
        this.h = l9Var;
        this.f42760f = z10;
        this.f42757b = f10;
        this.f42756a = k9Var != null ? k9Var.f42756a : f10;
        this.f42761g = (k9Var == null || z10) ? SystemClock.uptimeMillis() : k9Var.f42761g;
        float f11 = 0.0f;
        float a10 = (k9Var == null || !z10) ? 0.0f : k9Var.a();
        if (k9Var != null) {
            float f12 = k9Var.f42758c;
            f11 = com.google.android.recaptcha.internal.a.y(1.0f, f12, a10, f12);
        }
        this.f42758c = f11;
        if (k9Var == null) {
            y9 = l9Var.P;
        } else {
            float f13 = k9Var.d;
            y9 = com.google.android.recaptcha.internal.a.y(1.0f, f13, a10, f13);
        }
        this.d = y9;
        this.f42759e = k9Var == null ? (-org.telegram.messenger.g0.N(44.0f)) * 0.1f : k9Var.f42759e * (1.0f - a10);
    }

    public final float a() {
        if (this.h.J >= 1.0f) {
            return 1.0f;
        }
        return l9.T.getInterpolation(Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f42761g)) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f10, int i3) {
        float f11;
        float f12;
        float a10 = a();
        float f13 = 1.0f;
        boolean z10 = this.f42760f;
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        float f14 = this.f42758c;
        float y9 = com.google.android.recaptcha.internal.a.y(f11, f14, a10, f14);
        if (y9 <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f10;
        float f15 = i3;
        float f16 = this.f42759e;
        float f17 = f15 + f16;
        if (z10) {
            f12 = org.telegram.messenger.g0.N(44.0f) * 0.1f;
        } else {
            f12 = 0.0f;
        }
        canvas.translate(d, com.google.android.recaptcha.internal.a.y(f12, f16, a10, f17));
        if (z10) {
            f13 = this.h.P;
        }
        float f18 = this.d;
        float y10 = com.google.android.recaptcha.internal.a.y(f13, f18, a10, f18);
        canvas.scale(y10, y10, measureText / 2.0f, (paint.descent() + paint.ascent()) / 2.0f);
        paint.setAlpha(Math.round(alpha * y9));
        canvas.drawText(str, 0.0f, 0.0f, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final k9 c() {
        l9 l9Var = this.h;
        if (l9Var.J >= 1.0f) {
            return new k9(l9Var, d());
        }
        return new k9(l9Var, d(), this);
    }

    public final float d() {
        float f10 = this.f42757b;
        float f11 = this.f42756a;
        return (l9.T.getInterpolation(this.h.J) * (f10 - f11)) + f11;
    }

    public k9(l9 l9Var, float f10) {
        this.h = l9Var;
        this.f42760f = false;
        this.f42757b = f10;
        this.f42756a = f10;
        this.f42758c = 1.0f;
        this.d = 1.0f;
        this.f42759e = 0.0f;
        this.f42761g = SystemClock.uptimeMillis();
    }

    public k9(l9 l9Var, float f10, k9 k9Var) {
        this.h = l9Var;
        this.f42760f = k9Var.f42760f;
        this.f42757b = f10;
        this.f42756a = f10;
        this.f42758c = k9Var.f42758c;
        this.d = k9Var.d;
        this.f42759e = k9Var.f42759e;
        this.f42761g = k9Var.f42761g;
    }
}
