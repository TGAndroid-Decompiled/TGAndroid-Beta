package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
public final class ca {
    public final float f44143a;
    public final float f44144b;
    public final float f44145c;
    public final float d;
    public final float f44146e;
    public final boolean f44147f;
    public final long f44148g;
    public final da h;

    public ca(da daVar, ca caVar, float f10, boolean z10) {
        float z11;
        this.h = daVar;
        this.f44147f = z10;
        this.f44144b = f10;
        this.f44143a = caVar != null ? caVar.f44143a : f10;
        this.f44148g = (caVar == null || z10) ? SystemClock.uptimeMillis() : caVar.f44148g;
        float f11 = 0.0f;
        float a10 = (caVar == null || !z10) ? 0.0f : caVar.a();
        if (caVar != null) {
            float f12 = caVar.f44145c;
            f11 = com.google.android.gms.internal.vision.e2.z(1.0f, f12, a10, f12);
        }
        this.f44145c = f11;
        if (caVar == null) {
            z11 = daVar.P;
        } else {
            float f13 = caVar.d;
            z11 = com.google.android.gms.internal.vision.e2.z(1.0f, f13, a10, f13);
        }
        this.d = z11;
        this.f44146e = caVar == null ? (-org.telegram.messenger.g0.N(44.0f)) * 0.1f : caVar.f44146e * (1.0f - a10);
    }

    public final float a() {
        if (this.h.J >= 1.0f) {
            return 1.0f;
        }
        return da.T.getInterpolation(Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f44148g)) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f10, int i7) {
        float f11;
        float f12;
        float a10 = a();
        float f13 = 1.0f;
        boolean z10 = this.f44147f;
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        float f14 = this.f44145c;
        float z11 = com.google.android.gms.internal.vision.e2.z(f11, f14, a10, f14);
        if (z11 <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f10;
        float f15 = i7;
        float f16 = this.f44146e;
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

    public final ca c() {
        da daVar = this.h;
        if (daVar.J >= 1.0f) {
            return new ca(daVar, d());
        }
        return new ca(daVar, d(), this);
    }

    public final float d() {
        float f10 = this.f44144b;
        float f11 = this.f44143a;
        return (da.T.getInterpolation(this.h.J) * (f10 - f11)) + f11;
    }

    public ca(da daVar, float f10) {
        this.h = daVar;
        this.f44147f = false;
        this.f44144b = f10;
        this.f44143a = f10;
        this.f44145c = 1.0f;
        this.d = 1.0f;
        this.f44146e = 0.0f;
        this.f44148g = SystemClock.uptimeMillis();
    }

    public ca(da daVar, float f10, ca caVar) {
        this.h = daVar;
        this.f44147f = caVar.f44147f;
        this.f44144b = f10;
        this.f44143a = f10;
        this.f44145c = caVar.f44145c;
        this.d = caVar.d;
        this.f44146e = caVar.f44146e;
        this.f44148g = caVar.f44148g;
    }
}
