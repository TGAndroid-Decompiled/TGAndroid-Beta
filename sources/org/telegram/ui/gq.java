package org.telegram.ui;
public final class gq implements Runnable {
    public final int f38114a;
    public final qq f38115b;
    public final long f38116c;

    public gq(qq qqVar, long j3, int i10) {
        this.f38114a = i10;
        this.f38115b = qqVar;
        this.f38116c = j3;
    }

    @Override
    public final void run() {
        switch (this.f38114a) {
            case 0:
                long j3 = this.f38116c;
                qq qqVar = this.f38115b;
                qqVar.f41403n = j3;
                qqVar.f41408r = true;
                qqVar.n0();
                return;
            default:
                qq.Z(this.f38115b, this.f38116c);
                return;
        }
    }
}
