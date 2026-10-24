package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class h9 {
    public final float f34584a;
    public final float f34585b;
    public final float f34586c;
    public final float d;
    public final float e;
    public final boolean f34587f;
    public final long f34588g;
    public final i9 h;

    public h9(i9 i9Var, h9 h9Var, float f7, boolean z10) {
        float y3;
        this.h = i9Var;
        this.f34587f = z10;
        this.f34585b = f7;
        this.f34584a = h9Var != null ? h9Var.f34584a : f7;
        this.f34588g = (h9Var == null || z10) ? SystemClock.uptimeMillis() : h9Var.f34588g;
        float f10 = 0.0f;
        float a2 = (h9Var == null || !z10) ? 0.0f : h9Var.a();
        if (h9Var != null) {
            float f11 = h9Var.f34586c;
            f10 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f11, a2, f11);
        }
        this.f34586c = f10;
        if (h9Var == null) {
            y3 = i9Var.O;
        } else {
            float f12 = h9Var.d;
            y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f12, a2, f12);
        }
        this.d = y3;
        this.e = h9Var == null ? (-AndroidUtilities.dpf2(44.0f)) * 0.1f : h9Var.e * (1.0f - a2);
    }

    public final float a() {
        if (this.h.I >= 1.0f) {
            return 1.0f;
        }
        return i9.S.getInterpolation(Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f34588g)) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f7, int i10) {
        float f10;
        float f11;
        float a2 = a();
        float f12 = 1.0f;
        boolean z10 = this.f34587f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        float f13 = this.f34586c;
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
            f12 = this.h.O;
        }
        float f17 = this.d;
        float y10 = com.google.android.gms.internal.play_billing.k3.y(f12, f17, a2, f17);
        canvas.scale(y10, y10, measureText / 2.0f, (paint.descent() + paint.ascent()) / 2.0f);
        paint.setAlpha(Math.round(alpha * y3));
        canvas.drawText(str, 0.0f, 0.0f, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final h9 c() {
        i9 i9Var = this.h;
        if (i9Var.I >= 1.0f) {
            return new h9(i9Var, d());
        }
        return new h9(i9Var, d(), this);
    }

    public final float d() {
        float f7 = this.f34585b;
        float f10 = this.f34584a;
        return (i9.S.getInterpolation(this.h.I) * (f7 - f10)) + f10;
    }

    public h9(i9 i9Var, float f7) {
        this.h = i9Var;
        this.f34587f = false;
        this.f34585b = f7;
        this.f34584a = f7;
        this.f34586c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f34588g = SystemClock.uptimeMillis();
    }

    public h9(i9 i9Var, float f7, h9 h9Var) {
        this.h = i9Var;
        this.f34587f = h9Var.f34587f;
        this.f34585b = f7;
        this.f34584a = f7;
        this.f34586c = h9Var.f34586c;
        this.d = h9Var.d;
        this.e = h9Var.e;
        this.f34588g = h9Var.f34588g;
    }
}
