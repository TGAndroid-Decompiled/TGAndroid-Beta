package org.telegram.ui;
public final class jq implements Runnable {
    public final int f38563a;
    public final pr f38564b;

    public jq(pr prVar, int i10) {
        this.f38563a = i10;
        this.f38564b = prVar;
    }

    @Override
    public final void run() {
        switch (this.f38563a) {
            case 0:
                this.f38564b.v0();
                return;
            default:
                pr prVar = this.f38564b;
                prVar.getMessagesController().T2(0, prVar.M, true);
                return;
        }
    }
}
