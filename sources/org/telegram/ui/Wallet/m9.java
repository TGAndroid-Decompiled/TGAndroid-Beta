package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class m9 {
    public final float f34609a;
    public final float f34610b;
    public final float f34611c;
    public final float d;
    public final float e;
    public final boolean f34612f;
    public final long f34613g;
    public final n9 h;

    public m9(n9 n9Var, m9 m9Var, float f7, boolean z10) {
        float y3;
        this.h = n9Var;
        this.f34612f = z10;
        this.f34610b = f7;
        this.f34609a = m9Var != null ? m9Var.f34609a : f7;
        this.f34613g = (m9Var == null || z10) ? SystemClock.uptimeMillis() : m9Var.f34613g;
        float f10 = 0.0f;
        float a2 = (m9Var == null || !z10) ? 0.0f : m9Var.a();
        if (m9Var != null) {
            float f11 = m9Var.f34611c;
            f10 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f11, a2, f11);
        }
        this.f34611c = f10;
        if (m9Var == null) {
            y3 = n9Var.N;
        } else {
            float f12 = m9Var.d;
            y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f12, a2, f12);
        }
        this.d = y3;
        this.e = m9Var == null ? (-AndroidUtilities.dpf2(44.0f)) * 0.1f : m9Var.e * (1.0f - a2);
    }

    public final float a() {
        if (this.h.H >= 1.0f) {
            return 1.0f;
        }
        return n9.R.getInterpolation(Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f34613g)) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f7, int i10) {
        float f10;
        float f11;
        float a2 = a();
        float f12 = 1.0f;
        boolean z10 = this.f34612f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        float f13 = this.f34611c;
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

    public final m9 c() {
        n9 n9Var = this.h;
        if (n9Var.H >= 1.0f) {
            return new m9(n9Var, d());
        }
        return new m9(n9Var, d(), this);
    }

    public final float d() {
        float f7 = this.f34610b;
        float f10 = this.f34609a;
        return (n9.R.getInterpolation(this.h.H) * (f7 - f10)) + f10;
    }

    public m9(n9 n9Var, float f7) {
        this.h = n9Var;
        this.f34612f = false;
        this.f34610b = f7;
        this.f34609a = f7;
        this.f34611c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f34613g = SystemClock.uptimeMillis();
    }

    public m9(n9 n9Var, float f7, m9 m9Var) {
        this.h = n9Var;
        this.f34612f = m9Var.f34612f;
        this.f34610b = f7;
        this.f34609a = f7;
        this.f34611c = m9Var.f34611c;
        this.d = m9Var.d;
        this.e = m9Var.e;
        this.f34613g = m9Var.f34613g;
    }
}
