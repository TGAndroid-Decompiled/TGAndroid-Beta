package org.telegram.ui.Components;
public final class fs0 implements Runnable {
    public final int f28287a;
    public final uu0 f28288b;
    public final int f28289c;

    public fs0(uu0 uu0Var, int i10, int i11) {
        this.f28287a = i11;
        this.f28288b = uu0Var;
        this.f28289c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28287a) {
            case 0:
                this.f28288b.h.scrollBy(0, this.f28289c);
                return;
            case 1:
                this.f28288b.h.scrollBy(0, this.f28289c);
                return;
            default:
                this.f28288b.h.scrollBy(0, this.f28289c);
                return;
        }
    }
}
