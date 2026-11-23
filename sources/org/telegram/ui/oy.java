package org.telegram.ui;
public final class oy implements Runnable {
    public final int f50783a;
    public final jz f50784b;

    public oy(jz jzVar, int i7) {
        this.f50783a = i7;
        this.f50784b = jzVar;
    }

    @Override
    public final void run() {
        switch (this.f50783a) {
            case 0:
                jz.a0(this.f50784b);
                return;
            default:
                jz.b0(this.f50784b);
                return;
        }
    }
}
