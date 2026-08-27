package org.telegram.ui.Components;

public final class gm implements Runnable {

    public final int f28766a;

    public final in f28767b;

    public final int f28768c;

    public gm(in inVar, int i10, int i11) {
        this.f28766a = i11;
        this.f28767b = inVar;
        this.f28768c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28766a) {
            case 0:
                this.f28767b.e0(this.f28768c, null);
                break;
            case 1:
                this.f28767b.b0(this.f28768c);
                break;
            default:
                this.f28767b.e0(this.f28768c, null);
                break;
        }
    }
}
