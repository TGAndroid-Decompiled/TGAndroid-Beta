package org.telegram.ui.Wallet;
public final class n5 {
    public boolean f35332a;
    public float f35333b;
    public float f35334c;
    public float d;
    public float f35335e;
    public float f35336f;
    public float f35337g;
    public long h;
    public long f35338i;
    public long f35339j;

    public final void a(float f7, float f10, long j3) {
        if (!Float.isNaN(f7) && !Float.isInfinite(f7) && !Float.isNaN(f10) && !Float.isInfinite(f10)) {
            this.f35333b = f7;
            this.f35334c = f10;
            this.f35338i = j3;
            if (!this.f35332a) {
                this.f35332a = true;
                this.d = f7;
                this.f35335e = f10;
                this.f35336f = f7;
                this.f35337g = f10;
                this.h = j3;
                return;
            }
            float f11 = f7 - this.f35336f;
            float f12 = f10 - this.f35337g;
            if ((f12 * f12) + (f11 * f11) > 1.265625f) {
                this.f35336f = f7;
                this.f35337g = f10;
                this.h = j3;
            }
        }
    }

    public final void b(long j3) {
        if (this.f35332a) {
            long j10 = this.f35339j;
            if (j10 == 0) {
                this.f35339j = j3;
                return;
            }
            float min = Math.min(0.1f, Math.max(0.0f, ((float) (j3 - j10)) * 1.0E-9f));
            this.f35339j = j3;
            if (this.f35338i - this.h < 1000000000) {
                return;
            }
            float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
            float f7 = this.d;
            this.d = com.google.android.gms.internal.vision.e2.y(this.f35333b, f7, exp, f7);
            float f10 = this.f35335e;
            this.f35335e = com.google.android.gms.internal.vision.e2.y(this.f35334c, f10, exp, f10);
        }
    }
}
