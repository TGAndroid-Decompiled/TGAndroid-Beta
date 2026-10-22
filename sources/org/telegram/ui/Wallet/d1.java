package org.telegram.ui.Wallet;
public final class d1 implements Runnable {
    public final int f34096a;
    public final x f34097b;
    public final String f34098c;

    public d1(x xVar, String str, int i10) {
        this.f34096a = i10;
        this.f34097b = xVar;
        this.f34098c = str;
    }

    @Override
    public final void run() {
        switch (this.f34096a) {
            case 0:
                this.f34097b.run(this.f34098c);
                return;
            default:
                this.f34097b.run(this.f34098c);
                return;
        }
    }
}
