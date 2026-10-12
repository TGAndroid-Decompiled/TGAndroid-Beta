package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class j8 {
    public final float f34931a;
    public final float f34932b;
    public final float f34933c;
    public final float d;
    public final float f34934e;
    public final boolean f34935f;
    public final long f34936g;
    public final k8 h;

    public j8(k8 k8Var, j8 j8Var, float f7, boolean z10) {
        float y3;
        this.h = k8Var;
        this.f34935f = z10;
        this.f34932b = f7;
        this.f34931a = j8Var != null ? j8Var.f34931a : f7;
        this.f34936g = (j8Var == null || z10) ? SystemClock.uptimeMillis() : j8Var.f34936g;
        float f10 = 0.0f;
        float a2 = (j8Var == null || !z10) ? 0.0f : j8Var.a();
        if (j8Var != null) {
            float f11 = j8Var.f34933c;
            f10 = com.google.android.gms.internal.vision.e2.y(1.0f, f11, a2, f11);
        }
        this.f34933c = f10;
        if (j8Var == null) {
            y3 = k8Var.N;
        } else {
            float f12 = j8Var.d;
            y3 = com.google.android.gms.internal.vision.e2.y(1.0f, f12, a2, f12);
        }
        this.d = y3;
        this.f34934e = j8Var == null ? (-AndroidUtilities.dpf2(44.0f)) * 0.1f : j8Var.f34934e * (1.0f - a2);
    }

    public final float a() {
        if (this.h.H >= 1.0f) {
            return 1.0f;
        }
        return k8.R.getInterpolation(Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f34936g)) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f7, int i10) {
        float f10;
        float f11;
        float a2 = a();
        float f12 = 1.0f;
        boolean z10 = this.f34935f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        float f13 = this.f34933c;
        float y3 = com.google.android.gms.internal.vision.e2.y(f10, f13, a2, f13);
        if (y3 <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f7;
        float f14 = i10;
        float f15 = this.f34934e;
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

    public final j8 c() {
        k8 k8Var = this.h;
        if (k8Var.H >= 1.0f) {
            return new j8(k8Var, d());
        }
        return new j8(k8Var, d(), this);
    }

    public final float d() {
        float f7 = this.f34932b;
        float f10 = this.f34931a;
        return (k8.R.getInterpolation(this.h.H) * (f7 - f10)) + f10;
    }

    public j8(k8 k8Var, float f7) {
        this.h = k8Var;
        this.f34935f = false;
        this.f34932b = f7;
        this.f34931a = f7;
        this.f34933c = 1.0f;
        this.d = 1.0f;
        this.f34934e = 0.0f;
        this.f34936g = SystemClock.uptimeMillis();
    }

    public j8(k8 k8Var, float f7, j8 j8Var) {
        this.h = k8Var;
        this.f34935f = j8Var.f34935f;
        this.f34932b = f7;
        this.f34931a = f7;
        this.f34933c = j8Var.f34933c;
        this.d = j8Var.d;
        this.f34934e = j8Var.f34934e;
        this.f34936g = j8Var.f34936g;
    }
}
