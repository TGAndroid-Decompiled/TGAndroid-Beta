package org.telegram.ui.Wallet;
public final class o5 {
    public boolean f35396a;
    public float f35397b;
    public float f35398c;
    public float d;
    public float f35399e;
    public float f35400f;
    public float f35401g;
    public long h;
    public long f35402i;
    public long f35403j;

    public final void a(float f7, float f10, long j3) {
        if (!Float.isNaN(f7) && !Float.isInfinite(f7) && !Float.isNaN(f10) && !Float.isInfinite(f10)) {
            this.f35397b = f7;
            this.f35398c = f10;
            this.f35402i = j3;
            if (!this.f35396a) {
                this.f35396a = true;
                this.d = f7;
                this.f35399e = f10;
                this.f35400f = f7;
                this.f35401g = f10;
                this.h = j3;
                return;
            }
            float f11 = f7 - this.f35400f;
            float f12 = f10 - this.f35401g;
            if ((f12 * f12) + (f11 * f11) > 1.265625f) {
                this.f35400f = f7;
                this.f35401g = f10;
                this.h = j3;
            }
        }
    }

    public final void b(long j3) {
        if (this.f35396a) {
            long j10 = this.f35403j;
            if (j10 == 0) {
                this.f35403j = j3;
                return;
            }
            float min = Math.min(0.1f, Math.max(0.0f, ((float) (j3 - j10)) * 1.0E-9f));
            this.f35403j = j3;
            if (this.f35402i - this.h < 1000000000) {
                return;
            }
            float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
            float f7 = this.d;
            this.d = com.google.android.gms.internal.vision.e2.y(this.f35397b, f7, exp, f7);
            float f10 = this.f35399e;
            this.f35399e = com.google.android.gms.internal.vision.e2.y(this.f35398c, f10, exp, f10);
        }
    }
}
