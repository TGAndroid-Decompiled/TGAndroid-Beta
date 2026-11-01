package org.telegram.ui.Components;
public final class eq0 implements Runnable {
    public final int f25911a;
    public final ts0 f25912b;
    public final int f25913c;

    public eq0(ts0 ts0Var, int i10, int i11) {
        this.f25911a = i11;
        this.f25912b = ts0Var;
        this.f25913c = i10;
    }

    @Override
    public final void run() {
        switch (this.f25911a) {
            case 0:
                this.f25912b.h.scrollBy(0, this.f25913c);
                return;
            case 1:
                this.f25912b.h.scrollBy(0, this.f25913c);
                return;
            default:
                this.f25912b.h.scrollBy(0, this.f25913c);
                return;
        }
    }
}
