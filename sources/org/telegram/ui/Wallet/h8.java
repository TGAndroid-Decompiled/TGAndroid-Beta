package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public final class h8 {
    public final float f34999a;
    public final float f35000b;
    public final float f35001c;
    public final float d;
    public final float f35002e;
    public final boolean f35003f;
    public final long f35004g;
    public final i8 h;

    public h8(i8 i8Var, h8 h8Var, float f7, boolean z10) {
        float y3;
        this.h = i8Var;
        this.f35003f = z10;
        this.f35000b = f7;
        this.f34999a = h8Var != null ? h8Var.f34999a : f7;
        this.f35004g = (h8Var == null || z10) ? SystemClock.uptimeMillis() : h8Var.f35004g;
        float f10 = 0.0f;
        float a2 = (h8Var == null || !z10) ? 0.0f : h8Var.a();
        if (h8Var != null) {
            float f11 = h8Var.f35001c;
            f10 = com.google.android.gms.internal.vision.e2.y(1.0f, f11, a2, f11);
        }
        this.f35001c = f10;
        if (h8Var == null) {
            y3 = i8Var.N;
        } else {
            float f12 = h8Var.d;
            y3 = com.google.android.gms.internal.vision.e2.y(1.0f, f12, a2, f12);
        }
        this.d = y3;
        this.f35002e = h8Var == null ? (-AndroidUtilities.dpf2(44.0f)) * 0.1f : h8Var.f35002e * (1.0f - a2);
    }

    public final float a() {
        if (this.h.H >= 1.0f) {
            return 1.0f;
        }
        return i8.R.getInterpolation(Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f35004g)) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f7, int i10) {
        float f10;
        float f11;
        float a2 = a();
        float f12 = 1.0f;
        boolean z10 = this.f35003f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        float f13 = this.f35001c;
        float y3 = com.google.android.gms.internal.vision.e2.y(f10, f13, a2, f13);
        if (y3 <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f7;
        float f14 = i10;
        float f15 = this.f35002e;
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

    public final h8 c() {
        i8 i8Var = this.h;
        if (i8Var.H >= 1.0f) {
            return new h8(i8Var, d());
        }
        return new h8(i8Var, d(), this);
    }

    public final float d() {
        float f7 = this.f35000b;
        float f10 = this.f34999a;
        return (i8.R.getInterpolation(this.h.H) * (f7 - f10)) + f10;
    }

    public h8(i8 i8Var, float f7) {
        this.h = i8Var;
        this.f35003f = false;
        this.f35000b = f7;
        this.f34999a = f7;
        this.f35001c = 1.0f;
        this.d = 1.0f;
        this.f35002e = 0.0f;
        this.f35004g = SystemClock.uptimeMillis();
    }

    public h8(i8 i8Var, float f7, h8 h8Var) {
        this.h = i8Var;
        this.f35003f = h8Var.f35003f;
        this.f35000b = f7;
        this.f34999a = f7;
        this.f35001c = h8Var.f35001c;
        this.d = h8Var.d;
        this.f35002e = h8Var.f35002e;
        this.f35004g = h8Var.f35004g;
    }
}
