package org.telegram.ui.Wallet;
public final class l5 {
    public boolean f33434a;
    public float f33435b;
    public float f33436c;
    public float d;
    public float e;
    public float f33437f;
    public float f33438g;
    public long h;
    public long f33439i;
    public long f33440j;

    public final void a(float f7, float f10, long j10) {
        if (!Float.isNaN(f7) && !Float.isInfinite(f7) && !Float.isNaN(f10) && !Float.isInfinite(f10)) {
            this.f33435b = f7;
            this.f33436c = f10;
            this.f33439i = j10;
            if (!this.f33434a) {
                this.f33434a = true;
                this.d = f7;
                this.e = f10;
                this.f33437f = f7;
                this.f33438g = f10;
                this.h = j10;
                return;
            }
            float f11 = f7 - this.f33437f;
            float f12 = f10 - this.f33438g;
            if ((f12 * f12) + (f11 * f11) > 1.265625f) {
                this.f33437f = f7;
                this.f33438g = f10;
                this.h = j10;
            }
        }
    }

    public final void b(long j10) {
        if (this.f33434a) {
            long j11 = this.f33440j;
            if (j11 == 0) {
                this.f33440j = j10;
                return;
            }
            float min = Math.min(0.1f, Math.max(0.0f, ((float) (j10 - j11)) * 1.0E-9f));
            this.f33440j = j10;
            if (this.f33439i - this.h < 1000000000) {
                return;
            }
            float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
            float f7 = this.d;
            this.d = com.google.android.gms.internal.play_billing.k3.y(this.f33435b, f7, exp, f7);
            float f10 = this.e;
            this.e = com.google.android.gms.internal.play_billing.k3.y(this.f33436c, f10, exp, f10);
        }
    }
}
