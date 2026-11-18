package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
public final class ba {
    public final float f43966a;
    public final float f43967b;
    public final float f43968c;
    public final float d;
    public final float f43969e;
    public final boolean f43970f;
    public final long f43971g;
    public final ca h;

    public ba(ca caVar, ba baVar, float f10, boolean z10) {
        float z11;
        this.h = caVar;
        this.f43970f = z10;
        this.f43967b = f10;
        this.f43966a = baVar != null ? baVar.f43966a : f10;
        this.f43971g = (baVar == null || z10) ? SystemClock.uptimeMillis() : baVar.f43971g;
        float f11 = 0.0f;
        float a10 = (baVar == null || !z10) ? 0.0f : baVar.a();
        if (baVar != null) {
            float f12 = baVar.f43968c;
            f11 = com.google.android.gms.internal.vision.e2.z(1.0f, f12, a10, f12);
        }
        this.f43968c = f11;
        if (baVar == null) {
            z11 = caVar.P;
        } else {
            float f13 = baVar.d;
            z11 = com.google.android.gms.internal.vision.e2.z(1.0f, f13, a10, f13);
        }
        this.d = z11;
        this.f43969e = baVar == null ? (-org.telegram.messenger.g0.N(44.0f)) * 0.1f : baVar.f43969e * (1.0f - a10);
    }

    public final float a() {
        if (this.h.J >= 1.0f) {
            return 1.0f;
        }
        return ca.T.getInterpolation(Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f43971g)) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f10, int i7) {
        float f11;
        float f12;
        float a10 = a();
        float f13 = 1.0f;
        boolean z10 = this.f43970f;
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        float f14 = this.f43968c;
        float z11 = com.google.android.gms.internal.vision.e2.z(f11, f14, a10, f14);
        if (z11 <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f10;
        float f15 = i7;
        float f16 = this.f43969e;
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

    public final ba c() {
        ca caVar = this.h;
        if (caVar.J >= 1.0f) {
            return new ba(caVar, d());
        }
        return new ba(caVar, d(), this);
    }

    public final float d() {
        float f10 = this.f43967b;
        float f11 = this.f43966a;
        return (ca.T.getInterpolation(this.h.J) * (f10 - f11)) + f11;
    }

    public ba(ca caVar, float f10) {
        this.h = caVar;
        this.f43970f = false;
        this.f43967b = f10;
        this.f43966a = f10;
        this.f43968c = 1.0f;
        this.d = 1.0f;
        this.f43969e = 0.0f;
        this.f43971g = SystemClock.uptimeMillis();
    }

    public ba(ca caVar, float f10, ba baVar) {
        this.h = caVar;
        this.f43970f = baVar.f43970f;
        this.f43967b = f10;
        this.f43966a = f10;
        this.f43968c = baVar.f43968c;
        this.d = baVar.d;
        this.f43969e = baVar.f43969e;
        this.f43971g = baVar.f43971g;
    }
}
