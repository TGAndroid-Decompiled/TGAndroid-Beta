package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class i8 {
    public final float f35090a;
    public final float f35091b;
    public final float f35092c;
    public final float d;
    public final float f35093e;
    public final boolean f35094f;
    public final long f35095g;
    public final j8 h;

    public i8(j8 j8Var, i8 i8Var, float f7, boolean z10) {
        float y3;
        this.h = j8Var;
        this.f35094f = z10;
        this.f35091b = f7;
        this.f35090a = i8Var != null ? i8Var.f35090a : f7;
        this.f35095g = (i8Var == null || z10) ? SystemClock.uptimeMillis() : i8Var.f35095g;
        float f10 = 0.0f;
        float a2 = (i8Var == null || !z10) ? 0.0f : i8Var.a();
        if (i8Var != null) {
            float f11 = i8Var.f35092c;
            f10 = com.google.android.gms.internal.vision.e2.y(1.0f, f11, a2, f11);
        }
        this.f35092c = f10;
        if (i8Var == null) {
            y3 = j8Var.N;
        } else {
            float f12 = i8Var.d;
            y3 = com.google.android.gms.internal.vision.e2.y(1.0f, f12, a2, f12);
        }
        this.d = y3;
        this.f35093e = i8Var == null ? (-AndroidUtilities.dpf2(44.0f)) * 0.1f : i8Var.f35093e * (1.0f - a2);
    }

    public final float a() {
        if (this.h.H >= 1.0f) {
            return 1.0f;
        }
        return j8.R.getInterpolation(Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f35095g)) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f7, int i10) {
        float f10;
        float f11;
        float a2 = a();
        float f12 = 1.0f;
        boolean z10 = this.f35094f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        float f13 = this.f35092c;
        float y3 = com.google.android.gms.internal.vision.e2.y(f10, f13, a2, f13);
        if (y3 <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f7;
        float f14 = i10;
        float f15 = this.f35093e;
        float f16 = f14 + f15;
        if (z10) {
            f11 = AndroidUtilities.dpf2(44.0f) * 0.1f;
        } else {
            f11 = 0.0f;
        }
        canvas.translate(d, com.google.android.gms.internal.vision.e2.y(f11, f15, a2, f16));
        if (z10) {
            f12 = this.h.N;
        }
        float f17 = this.d;
        float y10 = com.google.android.gms.internal.vision.e2.y(f12, f17, a2, f17);
        canvas.scale(y10, y10, measureText / 2.0f, (paint.descent() + paint.ascent()) / 2.0f);
        paint.setAlpha(Math.round(alpha * y3));
        canvas.drawText(str, 0.0f, 0.0f, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final i8 c() {
        j8 j8Var = this.h;
        if (j8Var.H >= 1.0f) {
            return new i8(j8Var, d());
        }
        return new i8(j8Var, d(), this);
    }

    public final float d() {
        float f7 = this.f35091b;
        float f10 = this.f35090a;
        return (j8.R.getInterpolation(this.h.H) * (f7 - f10)) + f10;
    }

    public i8(j8 j8Var, float f7) {
        this.h = j8Var;
        this.f35094f = false;
        this.f35091b = f7;
        this.f35090a = f7;
        this.f35092c = 1.0f;
        this.d = 1.0f;
        this.f35093e = 0.0f;
        this.f35095g = SystemClock.uptimeMillis();
    }

    public i8(j8 j8Var, float f7, i8 i8Var) {
        this.h = j8Var;
        this.f35094f = i8Var.f35094f;
        this.f35091b = f7;
        this.f35090a = f7;
        this.f35092c = i8Var.f35092c;
        this.d = i8Var.d;
        this.f35093e = i8Var.f35093e;
        this.f35095g = i8Var.f35095g;
    }
}
