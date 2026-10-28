package org.telegram.ui;
public final class jq implements Runnable {
    public final int f40579a;
    public final mr f40580b;

    public jq(mr mrVar, int i10) {
        this.f40579a = i10;
        this.f40580b = mrVar;
    }

    @Override
    public final void run() {
        switch (this.f40579a) {
            case 0:
                this.f40580b.s0();
                return;
            default:
                mr mrVar = this.f40580b;
                mrVar.getMessagesController().loadFullChat(mrVar.M, 0, true);
                return;
        }
    }
}
