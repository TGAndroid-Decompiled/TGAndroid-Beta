package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class g8 {
    public final float f34939a;
    public final float f34940b;
    public final float f34941c;
    public final float d;
    public final float f34942e;
    public final boolean f34943f;
    public final long f34944g;
    public final h8 h;

    public g8(h8 h8Var, g8 g8Var, float f7, boolean z10) {
        float y3;
        this.h = h8Var;
        this.f34943f = z10;
        this.f34940b = f7;
        this.f34939a = g8Var != null ? g8Var.f34939a : f7;
        this.f34944g = (g8Var == null || z10) ? SystemClock.uptimeMillis() : g8Var.f34944g;
        float f10 = 0.0f;
        float a2 = (g8Var == null || !z10) ? 0.0f : g8Var.a();
        if (g8Var != null) {
            float f11 = g8Var.f34941c;
            f10 = com.google.android.gms.internal.vision.e2.y(1.0f, f11, a2, f11);
        }
        this.f34941c = f10;
        if (g8Var == null) {
            y3 = h8Var.N;
        } else {
            float f12 = g8Var.d;
            y3 = com.google.android.gms.internal.vision.e2.y(1.0f, f12, a2, f12);
        }
        this.d = y3;
        this.f34942e = g8Var == null ? (-AndroidUtilities.dpf2(44.0f)) * 0.1f : g8Var.f34942e * (1.0f - a2);
    }

    public final float a() {
        if (this.h.H >= 1.0f) {
            return 1.0f;
        }
        return h8.R.getInterpolation(Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f34944g)) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f7, int i10) {
        float f10;
        float f11;
        float a2 = a();
        float f12 = 1.0f;
        boolean z10 = this.f34943f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        float f13 = this.f34941c;
        float y3 = com.google.android.gms.internal.vision.e2.y(f10, f13, a2, f13);
        if (y3 <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f7;
        float f14 = i10;
        float f15 = this.f34942e;
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

    public final g8 c() {
        h8 h8Var = this.h;
        if (h8Var.H >= 1.0f) {
            return new g8(h8Var, d());
        }
        return new g8(h8Var, d(), this);
    }

    public final float d() {
        float f7 = this.f34940b;
        float f10 = this.f34939a;
        return (h8.R.getInterpolation(this.h.H) * (f7 - f10)) + f10;
    }

    public g8(h8 h8Var, float f7) {
        this.h = h8Var;
        this.f34943f = false;
        this.f34940b = f7;
        this.f34939a = f7;
        this.f34941c = 1.0f;
        this.d = 1.0f;
        this.f34942e = 0.0f;
        this.f34944g = SystemClock.uptimeMillis();
    }

    public g8(h8 h8Var, float f7, g8 g8Var) {
        this.h = h8Var;
        this.f34943f = g8Var.f34943f;
        this.f34940b = f7;
        this.f34939a = f7;
        this.f34941c = g8Var.f34941c;
        this.d = g8Var.d;
        this.f34942e = g8Var.f34942e;
        this.f34944g = g8Var.f34944g;
    }
}
