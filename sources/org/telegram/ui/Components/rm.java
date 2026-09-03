package org.telegram.ui.Components;
public final class rm implements Runnable {
    public final int f30808a;
    public final rn f30809b;
    public final int f30810c;

    public rm(rn rnVar, int i10, int i11) {
        this.f30808a = i11;
        this.f30809b = rnVar;
        this.f30810c = i10;
    }

    @Override
    public final void run() {
        switch (this.f30808a) {
            case 0:
                this.f30809b.e0(this.f30810c, null);
                return;
            case 1:
                this.f30809b.b0(this.f30810c);
                return;
            default:
                this.f30809b.e0(this.f30810c, null);
                return;
        }
    }
}
