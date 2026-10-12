package org.telegram.ui.Wallet;
public final class p5 {
    public boolean f35223a;
    public float f35224b;
    public float f35225c;
    public float d;
    public float f35226e;
    public float f35227f;
    public float f35228g;
    public long h;
    public long f35229i;
    public long f35230j;

    public final void a(float f7, float f10, long j3) {
        if (!Float.isNaN(f7) && !Float.isInfinite(f7) && !Float.isNaN(f10) && !Float.isInfinite(f10)) {
            this.f35224b = f7;
            this.f35225c = f10;
            this.f35229i = j3;
            if (!this.f35223a) {
                this.f35223a = true;
                this.d = f7;
                this.f35226e = f10;
                this.f35227f = f7;
                this.f35228g = f10;
                this.h = j3;
                return;
            }
            float f11 = f7 - this.f35227f;
            float f12 = f10 - this.f35228g;
            if ((f12 * f12) + (f11 * f11) > 1.265625f) {
                this.f35227f = f7;
                this.f35228g = f10;
                this.h = j3;
            }
        }
    }

    public final void b(long j3) {
        if (this.f35223a) {
            long j10 = this.f35230j;
            if (j10 == 0) {
                this.f35230j = j3;
                return;
            }
            float min = Math.min(0.1f, Math.max(0.0f, ((float) (j3 - j10)) * 1.0E-9f));
            this.f35230j = j3;
            if (this.f35229i - this.h < 1000000000) {
                return;
            }
            float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
            float f7 = this.d;
            this.d = com.google.android.gms.internal.vision.e2.y(this.f35224b, f7, exp, f7);
            float f10 = this.f35226e;
            this.f35226e = com.google.android.gms.internal.vision.e2.y(this.f35225c, f10, exp, f10);
        }
    }
}
