package org.telegram.ui.Components;
public final class ok implements Runnable {
    public final int f29087a;
    public final bl f29088b;
    public final org.telegram.messenger.za f29089c;

    public ok(bl blVar, org.telegram.messenger.za zaVar, int i10) {
        this.f29087a = i10;
        this.f29088b = blVar;
        this.f29089c = zaVar;
    }

    @Override
    public final void run() {
        switch (this.f29087a) {
            case 0:
                bl.U(this.f29088b, this.f29089c);
                return;
            default:
                org.telegram.messenger.za zaVar = this.f29089c;
                try {
                    ((bh.d) zaVar).z();
                } catch (Exception unused) {
                }
                org.telegram.messenger.i0.g3(new ok(this.f29088b, zaVar, 0));
                return;
        }
    }
}
