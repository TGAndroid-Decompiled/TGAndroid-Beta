package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class g9 {
    public final float f36634a;
    public final float f36635b;
    public final float f36636c;
    public final float d;
    public final float e;
    public final boolean f36637f;
    public final long f36638g;
    public final h9 h;

    public g9(h9 h9Var, g9 g9Var, float f7, boolean z10) {
        float z11;
        this.h = h9Var;
        this.f36637f = z10;
        this.f36635b = f7;
        this.f36634a = g9Var != null ? g9Var.f36634a : f7;
        this.f36638g = (g9Var == null || z10) ? SystemClock.uptimeMillis() : g9Var.f36638g;
        float f10 = 0.0f;
        float a2 = (g9Var == null || !z10) ? 0.0f : g9Var.a();
        if (g9Var != null) {
            float f11 = g9Var.f36636c;
            f10 = c3.h0.z(1.0f, f11, a2, f11);
        }
        this.f36636c = f10;
        if (g9Var == null) {
            z11 = h9Var.O;
        } else {
            float f12 = g9Var.d;
            z11 = c3.h0.z(1.0f, f12, a2, f12);
        }
        this.d = z11;
        this.e = g9Var == null ? (-AndroidUtilities.dpf2(44.0f)) * 0.1f : g9Var.e * (1.0f - a2);
    }

    public final float a() {
        if (this.h.I >= 1.0f) {
            return 1.0f;
        }
        return h9.S.getInterpolation(Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f36638g)) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f7, int i10) {
        float f10;
        float f11;
        float a2 = a();
        float f12 = 1.0f;
        boolean z10 = this.f36637f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        float f13 = this.f36636c;
        float z11 = c3.h0.z(f10, f13, a2, f13);
        if (z11 <= 0.0f) {
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
        canvas.translate(d, c3.h0.z(f11, f15, a2, f16));
        if (z10) {
            f12 = this.h.O;
        }
        float f17 = this.d;
        float z12 = c3.h0.z(f12, f17, a2, f17);
        canvas.scale(z12, z12, measureText / 2.0f, (paint.descent() + paint.ascent()) / 2.0f);
        paint.setAlpha(Math.round(alpha * z11));
        canvas.drawText(str, 0.0f, 0.0f, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final g9 c() {
        h9 h9Var = this.h;
        if (h9Var.I >= 1.0f) {
            return new g9(h9Var, d());
        }
        return new g9(h9Var, d(), this);
    }

    public final float d() {
        float f7 = this.f36635b;
        float f10 = this.f36634a;
        return (h9.S.getInterpolation(this.h.I) * (f7 - f10)) + f10;
    }

    public g9(h9 h9Var, float f7) {
        this.h = h9Var;
        this.f36637f = false;
        this.f36635b = f7;
        this.f36634a = f7;
        this.f36636c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f36638g = SystemClock.uptimeMillis();
    }

    public g9(h9 h9Var, float f7, g9 g9Var) {
        this.h = h9Var;
        this.f36637f = g9Var.f36637f;
        this.f36635b = f7;
        this.f36634a = f7;
        this.f36636c = g9Var.f36636c;
        this.d = g9Var.d;
        this.e = g9Var.e;
        this.f36638g = g9Var.f36638g;
    }
}
