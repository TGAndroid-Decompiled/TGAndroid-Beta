package org.telegram.ui.Components;
public final class zs implements Runnable {
    public final int f31681a;
    public final et f31682b;

    public zs(et etVar, int i10) {
        this.f31681a = i10;
        this.f31682b = etVar;
    }

    @Override
    public final void run() {
        switch (this.f31681a) {
            case 0:
                this.f31682b.W(false);
                return;
            default:
                this.f31682b.N(true);
                return;
        }
    }
}
