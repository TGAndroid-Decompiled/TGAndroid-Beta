package org.telegram.ui.Wallet;
public final class c1 implements Runnable {
    public final int f36443a;
    public final s f36444b;
    public final String f36445c;

    public c1(s sVar, String str, int i10) {
        this.f36443a = i10;
        this.f36444b = sVar;
        this.f36445c = str;
    }

    @Override
    public final void run() {
        switch (this.f36443a) {
            case 0:
                this.f36444b.run(this.f36445c);
                return;
            default:
                this.f36444b.run(this.f36445c);
                return;
        }
    }
}
