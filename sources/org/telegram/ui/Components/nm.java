package org.telegram.ui.Components;
public final class nm implements Runnable {
    public final int f31092a;
    public final on f31093b;
    public final int f31094c;

    public nm(on onVar, int i10, int i11) {
        this.f31092a = i11;
        this.f31093b = onVar;
        this.f31094c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31092a) {
            case 0:
                this.f31093b.e0(this.f31094c, null);
                return;
            case 1:
                this.f31093b.b0(this.f31094c);
                return;
            default:
                this.f31093b.e0(this.f31094c, null);
                return;
        }
    }
}
