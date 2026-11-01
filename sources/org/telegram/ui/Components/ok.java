package org.telegram.ui.Components;
public final class ok implements Runnable {
    public final int f29158a;
    public final bl f29159b;
    public final org.telegram.messenger.ab f29160c;

    public ok(bl blVar, org.telegram.messenger.ab abVar, int i10) {
        this.f29158a = i10;
        this.f29159b = blVar;
        this.f29160c = abVar;
    }

    @Override
    public final void run() {
        switch (this.f29158a) {
            case 0:
                bl.U(this.f29159b, this.f29160c);
                return;
            default:
                org.telegram.messenger.ab abVar = this.f29160c;
                try {
                    ((bh.d) abVar).z();
                } catch (Exception unused) {
                }
                org.telegram.messenger.i0.g3(new ok(this.f29159b, abVar, 0));
                return;
        }
    }
}
