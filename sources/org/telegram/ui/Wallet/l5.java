package org.telegram.ui.Wallet;
public final class l5 {
    public boolean f35175a;
    public float f35176b;
    public float f35177c;
    public float d;
    public float f35178e;
    public float f35179f;
    public float f35180g;
    public long h;
    public long f35181i;
    public long f35182j;

    public final void a(float f7, float f10, long j3) {
        if (!Float.isNaN(f7) && !Float.isInfinite(f7) && !Float.isNaN(f10) && !Float.isInfinite(f10)) {
            this.f35176b = f7;
            this.f35177c = f10;
            this.f35181i = j3;
            if (!this.f35175a) {
                this.f35175a = true;
                this.d = f7;
                this.f35178e = f10;
                this.f35179f = f7;
                this.f35180g = f10;
                this.h = j3;
                return;
            }
            float f11 = f7 - this.f35179f;
            float f12 = f10 - this.f35180g;
            if ((f12 * f12) + (f11 * f11) > 1.265625f) {
                this.f35179f = f7;
                this.f35180g = f10;
                this.h = j3;
            }
        }
    }

    public final void b(long j3) {
        if (this.f35175a) {
            long j10 = this.f35182j;
            if (j10 == 0) {
                this.f35182j = j3;
                return;
            }
            float min = Math.min(0.1f, Math.max(0.0f, ((float) (j3 - j10)) * 1.0E-9f));
            this.f35182j = j3;
            if (this.f35181i - this.h < 1000000000) {
                return;
            }
            float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
            float f7 = this.d;
            this.d = com.google.android.gms.internal.vision.e2.y(this.f35176b, f7, exp, f7);
            float f10 = this.f35178e;
            this.f35178e = com.google.android.gms.internal.vision.e2.y(this.f35177c, f10, exp, f10);
        }
    }
}
