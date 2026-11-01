package org.telegram.ui;
public final class jq implements Runnable {
    public final int f38518a;
    public final pr f38519b;

    public jq(pr prVar, int i10) {
        this.f38518a = i10;
        this.f38519b = prVar;
    }

    @Override
    public final void run() {
        switch (this.f38518a) {
            case 0:
                this.f38519b.w0();
                return;
            default:
                pr prVar = this.f38519b;
                prVar.getMessagesController().T2(0, prVar.M, true);
                return;
        }
    }
}
