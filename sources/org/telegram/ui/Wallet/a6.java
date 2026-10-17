package org.telegram.ui.Wallet;
public final class a6 {
    public boolean f33987a;
    public float f33988b;
    public float f33989c;
    public float d;
    public float e;
    public float f33990f;
    public float f33991g;
    public long h;
    public long f33992i;
    public long f33993j;

    public final void a(float f7, float f10, long j10) {
        if (!Float.isNaN(f7) && !Float.isInfinite(f7) && !Float.isNaN(f10) && !Float.isInfinite(f10)) {
            this.f33988b = f7;
            this.f33989c = f10;
            this.f33992i = j10;
            if (!this.f33987a) {
                this.f33987a = true;
                this.d = f7;
                this.e = f10;
                this.f33990f = f7;
                this.f33991g = f10;
                this.h = j10;
                return;
            }
            float f11 = f7 - this.f33990f;
            float f12 = f10 - this.f33991g;
            if ((f12 * f12) + (f11 * f11) > 1.265625f) {
                this.f33990f = f7;
                this.f33991g = f10;
                this.h = j10;
            }
        }
    }

    public final void b(long j10) {
        if (this.f33987a) {
            long j11 = this.f33993j;
            if (j11 == 0) {
                this.f33993j = j10;
                return;
            }
            float min = Math.min(0.1f, Math.max(0.0f, ((float) (j10 - j11)) * 1.0E-9f));
            this.f33993j = j10;
            if (this.f33992i - this.h < 1000000000) {
                return;
            }
            float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
            float f7 = this.d;
            this.d = com.google.android.gms.internal.cast.a6.x(this.f33988b, f7, exp, f7);
            float f10 = this.e;
            this.e = com.google.android.gms.internal.cast.a6.x(this.f33989c, f10, exp, f10);
        }
    }
}
