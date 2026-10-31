package org.telegram.ui.Components;
public final class mw {
    public final int f28610a;
    public final long f28611b;
    public final long f28612c;
    public boolean e;
    public final int f28614g;
    public final org.telegram.messenger.us h;
    public boolean d = false;
    public long f28613f = -1;

    public mw(org.telegram.messenger.us usVar, int i10, long j10, long j11, int i11) {
        this.f28614g = i11;
        this.h = usVar;
        this.f28610a = i10;
        this.f28611b = j10;
        this.f28612c = j11;
    }

    public final void a() {
        boolean z10;
        switch (this.f28614g) {
            case 0:
                vy vyVar = (vy) this.h;
                if (vyVar.f31918t1 != null && vyVar.getVisibility() == 0 && vyVar.K0) {
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
                org.telegram.messenger.vp.r1(this.f28610a).z4(2, 0, this.f28611b, this.f28612c, null);
            }
            this.f28613f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f28613f == -1) {
                this.f28613f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f28613f > 2000) {
                this.e = true;
                this.f28613f = System.currentTimeMillis();
                org.telegram.messenger.vp.r1(this.f28610a).z4(10, 0, this.f28611b, this.f28612c, null);
            }
        }
    }
}
