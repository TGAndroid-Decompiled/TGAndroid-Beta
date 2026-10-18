package org.telegram.ui.Wallet;
public final class d6 {
    public boolean f34131a;
    public float f34132b;
    public float f34133c;
    public float d;
    public float e;
    public float f34134f;
    public float f34135g;
    public long h;
    public long f34136i;
    public long f34137j;

    public final void a(float f7, float f10, long j10) {
        if (!Float.isNaN(f7) && !Float.isInfinite(f7) && !Float.isNaN(f10) && !Float.isInfinite(f10)) {
            this.f34132b = f7;
            this.f34133c = f10;
            this.f34136i = j10;
            if (!this.f34131a) {
                this.f34131a = true;
                this.d = f7;
                this.e = f10;
                this.f34134f = f7;
                this.f34135g = f10;
                this.h = j10;
                return;
            }
            float f11 = f7 - this.f34134f;
            float f12 = f10 - this.f34135g;
            if ((f12 * f12) + (f11 * f11) > 1.265625f) {
                this.f34134f = f7;
                this.f34135g = f10;
                this.h = j10;
            }
        }
    }

    public final void b(long j10) {
        if (this.f34131a) {
            long j11 = this.f34137j;
            if (j11 == 0) {
                this.f34137j = j10;
                return;
            }
            float min = Math.min(0.1f, Math.max(0.0f, ((float) (j10 - j11)) * 1.0E-9f));
            this.f34137j = j10;
            if (this.f34136i - this.h < 1000000000) {
                return;
            }
            float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
            float f7 = this.d;
            this.d = com.google.android.gms.internal.play_billing.k3.y(this.f34132b, f7, exp, f7);
            float f10 = this.e;
            this.e = com.google.android.gms.internal.play_billing.k3.y(this.f34133c, f10, exp, f10);
        }
    }
}
