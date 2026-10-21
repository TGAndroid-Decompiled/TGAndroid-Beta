package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class g9 {
    public final float f34263a;
    public final float f34264b;
    public final float f34265c;
    public final float d;
    public final float e;
    public final boolean f34266f;
    public final long f34267g;
    public final h9 h;

    public g9(h9 h9Var, g9 g9Var, float f7, boolean z10) {
        float y3;
        this.h = h9Var;
        this.f34266f = z10;
        this.f34264b = f7;
        this.f34263a = g9Var != null ? g9Var.f34263a : f7;
        this.f34267g = (g9Var == null || z10) ? SystemClock.uptimeMillis() : g9Var.f34267g;
        float f10 = 0.0f;
        float a2 = (g9Var == null || !z10) ? 0.0f : g9Var.a();
        if (g9Var != null) {
            float f11 = g9Var.f34265c;
            f10 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f11, a2, f11);
        }
        this.f34265c = f10;
        if (g9Var == null) {
            y3 = h9Var.N;
        } else {
            float f12 = g9Var.d;
            y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f12, a2, f12);
        }
        this.d = y3;
        this.e = g9Var == null ? (-AndroidUtilities.dpf2(44.0f)) * 0.1f : g9Var.e * (1.0f - a2);
    }

    public final float a() {
        if (this.h.H >= 1.0f) {
            return 1.0f;
        }
        return h9.R.getInterpolation(Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f34267g)) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f7, int i10) {
        float f10;
        float f11;
        float a2 = a();
        float f12 = 1.0f;
        boolean z10 = this.f34266f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        float f13 = this.f34265c;
        float y3 = com.google.android.gms.internal.play_billing.k3.y(f10, f13, a2, f13);
        if (y3 <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f7;
        float f14 = i10;
        float f15 = this.e;
        float f16 = f14 + f15;
        if (z10) {
            f11 = AndroidUtilities.dpf2(44.0f) * 0.1f;
        } else {
            f11 = 0.0f;
        }
        canvas.translate(d, com.google.android.gms.internal.play_billing.k3.y(f11, f15, a2, f16));
        if (z10) {
            f12 = this.h.N;
        }
        float f17 = this.d;
        float y10 = com.google.android.gms.internal.play_billing.k3.y(f12, f17, a2, f17);
        canvas.scale(y10, y10, measureText / 2.0f, (paint.descent() + paint.ascent()) / 2.0f);
        paint.setAlpha(Math.round(alpha * y3));
        canvas.drawText(str, 0.0f, 0.0f, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final g9 c() {
        h9 h9Var = this.h;
        if (h9Var.H >= 1.0f) {
            return new g9(h9Var, d());
        }
        return new g9(h9Var, d(), this);
    }

    public final float d() {
        float f7 = this.f34264b;
        float f10 = this.f34263a;
        return (h9.R.getInterpolation(this.h.H) * (f7 - f10)) + f10;
    }

    public g9(h9 h9Var, float f7) {
        this.h = h9Var;
        this.f34266f = false;
        this.f34264b = f7;
        this.f34263a = f7;
        this.f34265c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f34267g = SystemClock.uptimeMillis();
    }

    public g9(h9 h9Var, float f7, g9 g9Var) {
        this.h = h9Var;
        this.f34266f = g9Var.f34266f;
        this.f34264b = f7;
        this.f34263a = f7;
        this.f34265c = g9Var.f34265c;
        this.d = g9Var.d;
        this.e = g9Var.e;
        this.f34267g = g9Var.f34267g;
    }
}
