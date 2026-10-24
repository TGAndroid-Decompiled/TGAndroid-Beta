package org.telegram.ui.Components;
public final class bn implements Runnable {
    public final int f25050a;
    public final co f25051b;
    public final int f25052c;

    public bn(co coVar, int i10, int i11) {
        this.f25050a = i11;
        this.f25051b = coVar;
        this.f25052c = i10;
    }

    @Override
    public final void run() {
        switch (this.f25050a) {
            case 0:
                this.f25051b.h0(this.f25052c, null);
                return;
            case 1:
                this.f25051b.e0(this.f25052c);
                return;
            default:
                this.f25051b.h0(this.f25052c, null);
                return;
        }
    }
}
