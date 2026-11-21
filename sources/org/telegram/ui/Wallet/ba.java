package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
public final class ba {
    public final float f44000a;
    public final float f44001b;
    public final float f44002c;
    public final float d;
    public final float f44003e;
    public final boolean f44004f;
    public final long f44005g;
    public final ca h;

    public ba(ca caVar, ba baVar, float f10, boolean z10) {
        float z11;
        this.h = caVar;
        this.f44004f = z10;
        this.f44001b = f10;
        this.f44000a = baVar != null ? baVar.f44000a : f10;
        this.f44005g = (baVar == null || z10) ? SystemClock.uptimeMillis() : baVar.f44005g;
        float f11 = 0.0f;
        float a10 = (baVar == null || !z10) ? 0.0f : baVar.a();
        if (baVar != null) {
            float f12 = baVar.f44002c;
            f11 = com.google.android.gms.internal.vision.e2.z(1.0f, f12, a10, f12);
        }
        this.f44002c = f11;
        if (baVar == null) {
            z11 = caVar.P;
        } else {
            float f13 = baVar.d;
            z11 = com.google.android.gms.internal.vision.e2.z(1.0f, f13, a10, f13);
        }
        this.d = z11;
        this.f44003e = baVar == null ? (-org.telegram.messenger.g0.N(44.0f)) * 0.1f : baVar.f44003e * (1.0f - a10);
    }

    public final float a() {
        if (this.h.J >= 1.0f) {
            return 1.0f;
        }
        return ca.T.getInterpolation(Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f44005g)) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f10, int i7) {
        float f11;
        float f12;
        float a10 = a();
        float f13 = 1.0f;
        boolean z10 = this.f44004f;
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        float f14 = this.f44002c;
        float z11 = com.google.android.gms.internal.vision.e2.z(f11, f14, a10, f14);
        if (z11 <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f10;
        float f15 = i7;
        float f16 = this.f44003e;
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
        float f10 = this.f44001b;
        float f11 = this.f44000a;
        return (ca.T.getInterpolation(this.h.J) * (f10 - f11)) + f11;
    }

    public ba(ca caVar, float f10) {
        this.h = caVar;
        this.f44004f = false;
        this.f44001b = f10;
        this.f44000a = f10;
        this.f44002c = 1.0f;
        this.d = 1.0f;
        this.f44003e = 0.0f;
        this.f44005g = SystemClock.uptimeMillis();
    }

    public ba(ca caVar, float f10, ba baVar) {
        this.h = caVar;
        this.f44004f = baVar.f44004f;
        this.f44001b = f10;
        this.f44000a = f10;
        this.f44002c = baVar.f44002c;
        this.d = baVar.d;
        this.f44003e = baVar.f44003e;
        this.f44005g = baVar.f44005g;
    }
}
