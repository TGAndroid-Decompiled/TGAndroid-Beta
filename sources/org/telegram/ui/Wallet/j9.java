package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class j9 {
    public final float f34368a;
    public final float f34369b;
    public final float f34370c;
    public final float d;
    public final float e;
    public final boolean f34371f;
    public final long f34372g;
    public final k9 h;

    public j9(k9 k9Var, j9 j9Var, float f7, boolean z10) {
        float x10;
        this.h = k9Var;
        this.f34371f = z10;
        this.f34369b = f7;
        this.f34368a = j9Var != null ? j9Var.f34368a : f7;
        this.f34372g = (j9Var == null || z10) ? SystemClock.uptimeMillis() : j9Var.f34372g;
        float f10 = 0.0f;
        float a2 = (j9Var == null || !z10) ? 0.0f : j9Var.a();
        if (j9Var != null) {
            float f11 = j9Var.f34370c;
            f10 = com.google.android.gms.internal.cast.a6.x(1.0f, f11, a2, f11);
        }
        this.f34370c = f10;
        if (j9Var == null) {
            x10 = k9Var.N;
        } else {
            float f12 = j9Var.d;
            x10 = com.google.android.gms.internal.cast.a6.x(1.0f, f12, a2, f12);
        }
        this.d = x10;
        this.e = j9Var == null ? (-AndroidUtilities.dpf2(44.0f)) * 0.1f : j9Var.e * (1.0f - a2);
    }

    public final float a() {
        if (this.h.H >= 1.0f) {
            return 1.0f;
        }
        return k9.R.getInterpolation(Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f34372g)) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f7, int i10) {
        float f10;
        float f11;
        float a2 = a();
        float f12 = 1.0f;
        boolean z10 = this.f34371f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        float f13 = this.f34370c;
        float x10 = com.google.android.gms.internal.cast.a6.x(f10, f13, a2, f13);
        if (x10 <= 0.0f) {
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
        canvas.translate(d, com.google.android.gms.internal.cast.a6.x(f11, f15, a2, f16));
        if (z10) {
            f12 = this.h.N;
        }
        float f17 = this.d;
        float x11 = com.google.android.gms.internal.cast.a6.x(f12, f17, a2, f17);
        canvas.scale(x11, x11, measureText / 2.0f, (paint.descent() + paint.ascent()) / 2.0f);
        paint.setAlpha(Math.round(alpha * x10));
        canvas.drawText(str, 0.0f, 0.0f, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final j9 c() {
        k9 k9Var = this.h;
        if (k9Var.H >= 1.0f) {
            return new j9(k9Var, d());
        }
        return new j9(k9Var, d(), this);
    }

    public final float d() {
        float f7 = this.f34369b;
        float f10 = this.f34368a;
        return (k9.R.getInterpolation(this.h.H) * (f7 - f10)) + f10;
    }

    public j9(k9 k9Var, float f7) {
        this.h = k9Var;
        this.f34371f = false;
        this.f34369b = f7;
        this.f34368a = f7;
        this.f34370c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f34372g = SystemClock.uptimeMillis();
    }

    public j9(k9 k9Var, float f7, j9 j9Var) {
        this.h = k9Var;
        this.f34371f = j9Var.f34371f;
        this.f34369b = f7;
        this.f34368a = f7;
        this.f34370c = j9Var.f34370c;
        this.d = j9Var.d;
        this.e = j9Var.e;
        this.f34372g = j9Var.f34372g;
    }
}
