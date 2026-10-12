package org.telegram.ui.Wallet;
public final class p5 {
    public boolean f35221a;
    public float f35222b;
    public float f35223c;
    public float d;
    public float f35224e;
    public float f35225f;
    public float f35226g;
    public long h;
    public long f35227i;
    public long f35228j;

    public final void a(float f7, float f10, long j3) {
        if (!Float.isNaN(f7) && !Float.isInfinite(f7) && !Float.isNaN(f10) && !Float.isInfinite(f10)) {
            this.f35222b = f7;
            this.f35223c = f10;
            this.f35227i = j3;
            if (!this.f35221a) {
                this.f35221a = true;
                this.d = f7;
                this.f35224e = f10;
                this.f35225f = f7;
                this.f35226g = f10;
                this.h = j3;
                return;
            }
            float f11 = f7 - this.f35225f;
            float f12 = f10 - this.f35226g;
            if ((f12 * f12) + (f11 * f11) > 1.265625f) {
                this.f35225f = f7;
                this.f35226g = f10;
                this.h = j3;
            }
        }
    }

    public final void b(long j3) {
        if (this.f35221a) {
            long j10 = this.f35228j;
            if (j10 == 0) {
                this.f35228j = j3;
                return;
            }
            float min = Math.min(0.1f, Math.max(0.0f, ((float) (j3 - j10)) * 1.0E-9f));
            this.f35228j = j3;
            if (this.f35227i - this.h < 1000000000) {
                return;
            }
            float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
            float f7 = this.d;
            this.d = com.google.android.gms.internal.vision.e2.y(this.f35222b, f7, exp, f7);
            float f10 = this.f35224e;
            this.f35224e = com.google.android.gms.internal.vision.e2.y(this.f35223c, f10, exp, f10);
        }
    }
}
