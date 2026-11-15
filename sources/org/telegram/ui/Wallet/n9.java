package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
public final class n9 {
    public final float f44200a;
    public final float f44201b;
    public final float f44202c;
    public final float d;
    public final float f44203e;
    public final boolean f44204f;
    public final long f44205g;
    public final o9 h;

    public n9(o9 o9Var, n9 n9Var, float f10, boolean z10) {
        float z11;
        this.h = o9Var;
        this.f44204f = z10;
        this.f44201b = f10;
        this.f44200a = n9Var != null ? n9Var.f44200a : f10;
        this.f44205g = (n9Var == null || z10) ? SystemClock.uptimeMillis() : n9Var.f44205g;
        float f11 = 0.0f;
        float a10 = (n9Var == null || !z10) ? 0.0f : n9Var.a();
        if (n9Var != null) {
            float f12 = n9Var.f44202c;
            f11 = com.google.android.gms.internal.vision.e2.z(1.0f, f12, a10, f12);
        }
        this.f44202c = f11;
        if (n9Var == null) {
            z11 = o9Var.P;
        } else {
            float f13 = n9Var.d;
            z11 = com.google.android.gms.internal.vision.e2.z(1.0f, f13, a10, f13);
        }
        this.d = z11;
        this.f44203e = n9Var == null ? (-org.telegram.messenger.g0.N(44.0f)) * 0.1f : n9Var.f44203e * (1.0f - a10);
    }

    public final float a() {
        if (this.h.J >= 1.0f) {
            return 1.0f;
        }
        return o9.T.getInterpolation(Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f44205g)) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f10, int i7) {
        float f11;
        float f12;
        float a10 = a();
        float f13 = 1.0f;
        boolean z10 = this.f44204f;
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        float f14 = this.f44202c;
        float z11 = com.google.android.gms.internal.vision.e2.z(f11, f14, a10, f14);
        if (z11 <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f10;
        float f15 = i7;
        float f16 = this.f44203e;
        float f17 = f15 + f16;
        if (z10) {
            f12 = org.telegram.messenger.g0.N(44.0f) * 0.1f;
        } else {
            f12 = 0.0f;
        }
        canvas.translate(d, com.google.android.gms.internal.vision.e2.z(f12, f16, a10, f17));
        if (z10) {
            f13 = this.h.P;
        }
        float f18 = this.d;
        float z12 = com.google.android.gms.internal.vision.e2.z(f13, f18, a10, f18);
        canvas.scale(z12, z12, measureText / 2.0f, (paint.descent() + paint.ascent()) / 2.0f);
        paint.setAlpha(Math.round(alpha * z11));
        canvas.drawText(str, 0.0f, 0.0f, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final n9 c() {
        o9 o9Var = this.h;
        if (o9Var.J >= 1.0f) {
            return new n9(o9Var, d());
        }
        return new n9(o9Var, d(), this);
    }

    public final float d() {
        float f10 = this.f44201b;
        float f11 = this.f44200a;
        return (o9.T.getInterpolation(this.h.J) * (f10 - f11)) + f11;
    }

    public n9(o9 o9Var, float f10) {
        this.h = o9Var;
        this.f44204f = false;
        this.f44201b = f10;
        this.f44200a = f10;
        this.f44202c = 1.0f;
        this.d = 1.0f;
        this.f44203e = 0.0f;
        this.f44205g = SystemClock.uptimeMillis();
    }

    public n9(o9 o9Var, float f10, n9 n9Var) {
        this.h = o9Var;
        this.f44204f = n9Var.f44204f;
        this.f44201b = f10;
        this.f44200a = f10;
        this.f44202c = n9Var.f44202c;
        this.d = n9Var.d;
        this.f44203e = n9Var.f44203e;
        this.f44205g = n9Var.f44205g;
    }
}
