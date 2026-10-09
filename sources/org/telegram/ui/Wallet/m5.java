package org.telegram.ui.Wallet;
public final class m5 {
    public boolean f35239a;
    public float f35240b;
    public float f35241c;
    public float d;
    public float f35242e;
    public float f35243f;
    public float f35244g;
    public long h;
    public long f35245i;
    public long f35246j;

    public final void a(float f7, float f10, long j3) {
        if (!Float.isNaN(f7) && !Float.isInfinite(f7) && !Float.isNaN(f10) && !Float.isInfinite(f10)) {
            this.f35240b = f7;
            this.f35241c = f10;
            this.f35245i = j3;
            if (!this.f35239a) {
                this.f35239a = true;
                this.d = f7;
                this.f35242e = f10;
                this.f35243f = f7;
                this.f35244g = f10;
                this.h = j3;
                return;
            }
            float f11 = f7 - this.f35243f;
            float f12 = f10 - this.f35244g;
            if ((f12 * f12) + (f11 * f11) > 1.265625f) {
                this.f35243f = f7;
                this.f35244g = f10;
                this.h = j3;
            }
        }
    }

    public final void b(long j3) {
        if (this.f35239a) {
            long j10 = this.f35246j;
            if (j10 == 0) {
                this.f35246j = j3;
                return;
            }
            float min = Math.min(0.1f, Math.max(0.0f, ((float) (j3 - j10)) * 1.0E-9f));
            this.f35246j = j3;
            if (this.f35245i - this.h < 1000000000) {
                return;
            }
            float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
            float f7 = this.d;
            this.d = com.google.android.gms.internal.vision.e2.y(this.f35240b, f7, exp, f7);
            float f10 = this.f35242e;
            this.f35242e = com.google.android.gms.internal.vision.e2.y(this.f35241c, f10, exp, f10);
        }
    }
}
