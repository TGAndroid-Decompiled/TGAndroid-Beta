package org.telegram.ui.Wallet;
public final class o5 {
    public boolean f35362a;
    public float f35363b;
    public float f35364c;
    public float d;
    public float f35365e;
    public float f35366f;
    public float f35367g;
    public long h;
    public long f35368i;
    public long f35369j;

    public final void a(float f7, float f10, long j3) {
        if (!Float.isNaN(f7) && !Float.isInfinite(f7) && !Float.isNaN(f10) && !Float.isInfinite(f10)) {
            this.f35363b = f7;
            this.f35364c = f10;
            this.f35368i = j3;
            if (!this.f35362a) {
                this.f35362a = true;
                this.d = f7;
                this.f35365e = f10;
                this.f35366f = f7;
                this.f35367g = f10;
                this.h = j3;
                return;
            }
            float f11 = f7 - this.f35366f;
            float f12 = f10 - this.f35367g;
            if ((f12 * f12) + (f11 * f11) > 1.265625f) {
                this.f35366f = f7;
                this.f35367g = f10;
                this.h = j3;
            }
        }
    }

    public final void b(long j3) {
        if (this.f35362a) {
            long j10 = this.f35369j;
            if (j10 == 0) {
                this.f35369j = j3;
                return;
            }
            float min = Math.min(0.1f, Math.max(0.0f, ((float) (j3 - j10)) * 1.0E-9f));
            this.f35369j = j3;
            if (this.f35368i - this.h < 1000000000) {
                return;
            }
            float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
            float f7 = this.d;
            this.d = com.google.android.gms.internal.vision.e2.y(this.f35363b, f7, exp, f7);
            float f10 = this.f35365e;
            this.f35365e = com.google.android.gms.internal.vision.e2.y(this.f35364c, f10, exp, f10);
        }
    }
}
