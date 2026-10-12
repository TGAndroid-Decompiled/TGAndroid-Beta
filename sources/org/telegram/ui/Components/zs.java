package org.telegram.ui.Components;
public final class zs implements Runnable {
    public final int f31979a;
    public final et f31980b;

    public zs(et etVar, int i10) {
        this.f31979a = i10;
        this.f31980b = etVar;
    }

    @Override
    public final void run() {
        switch (this.f31979a) {
            case 0:
                this.f31980b.W(false);
                return;
            default:
                this.f31980b.N(true);
                return;
        }
    }
}
