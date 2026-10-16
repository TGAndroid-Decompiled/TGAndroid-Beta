package org.telegram.ui.Wallet;
public final class n5 {
    public boolean f33243a;
    public float f33244b;
    public float f33245c;
    public float d;
    public float e;
    public float f33246f;
    public float f33247g;
    public long h;
    public long f33248i;
    public long f33249j;

    public final void a(float f7, float f10, long j10) {
        if (!Float.isNaN(f7) && !Float.isInfinite(f7) && !Float.isNaN(f10) && !Float.isInfinite(f10)) {
            this.f33244b = f7;
            this.f33245c = f10;
            this.f33248i = j10;
            if (!this.f33243a) {
                this.f33243a = true;
                this.d = f7;
                this.e = f10;
                this.f33246f = f7;
                this.f33247g = f10;
                this.h = j10;
                return;
            }
            float f11 = f7 - this.f33246f;
            float f12 = f10 - this.f33247g;
            if ((f12 * f12) + (f11 * f11) > 1.265625f) {
                this.f33246f = f7;
                this.f33247g = f10;
                this.h = j10;
            }
        }
    }

    public final void b(long j10) {
        if (this.f33243a) {
            long j11 = this.f33249j;
            if (j11 == 0) {
                this.f33249j = j10;
                return;
            }
            float min = Math.min(0.1f, Math.max(0.0f, ((float) (j10 - j11)) * 1.0E-9f));
            this.f33249j = j10;
            if (this.f33248i - this.h < 1000000000) {
                return;
            }
            float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
            float f7 = this.d;
            this.d = com.google.android.gms.internal.play_billing.k3.y(this.f33244b, f7, exp, f7);
            float f10 = this.e;
            this.e = com.google.android.gms.internal.play_billing.k3.y(this.f33245c, f10, exp, f10);
        }
    }
}
