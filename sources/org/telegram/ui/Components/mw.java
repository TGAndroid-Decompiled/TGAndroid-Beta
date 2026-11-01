package org.telegram.ui.Components;
public final class mw {
    public final int f28588a;
    public final long f28589b;
    public final long f28590c;
    public boolean e;
    public final int f28592g;
    public final org.telegram.messenger.vs h;
    public boolean d = false;
    public long f28591f = -1;

    public mw(org.telegram.messenger.vs vsVar, int i10, long j10, long j11, int i11) {
        this.f28592g = i11;
        this.h = vsVar;
        this.f28588a = i10;
        this.f28589b = j10;
        this.f28590c = j11;
    }

    public final void a() {
        boolean z10;
        switch (this.f28592g) {
            case 0:
                vy vyVar = (vy) this.h;
                if (vyVar.f31996t1 != null && vyVar.getVisibility() == 0 && vyVar.K0) {
                    z10 = true;
                    break;
                } else {
                    z10 = false;
                    break;
                }
            default:
                z10 = ((zf.x0) this.h).N();
                break;
        }
        this.d = z10;
        if (!z10) {
            if (this.e) {
                org.telegram.messenger.wp.r1(this.f28588a).z4(2, 0, this.f28589b, this.f28590c, null);
            }
            this.f28591f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f28591f == -1) {
                this.f28591f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f28591f > 2000) {
                this.e = true;
                this.f28591f = System.currentTimeMillis();
                org.telegram.messenger.wp.r1(this.f28588a).z4(10, 0, this.f28589b, this.f28590c, null);
            }
        }
    }
}
