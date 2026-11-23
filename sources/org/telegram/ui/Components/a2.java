package org.telegram.ui.Components;
public final class a2 implements Runnable {
    public final int f33272a;
    public final org.telegram.messenger.mr f33273b;

    public a2(org.telegram.messenger.mr mrVar, int i7) {
        this.f33272a = i7;
        this.f33273b = mrVar;
    }

    @Override
    public final void run() {
        switch (this.f33272a) {
            case 0:
                org.telegram.messenger.mr mrVar = this.f33273b;
                if (mrVar != null) {
                    mrVar.d(false);
                    return;
                }
                return;
            default:
                org.telegram.messenger.mr mrVar2 = this.f33273b;
                if (mrVar2 != null) {
                    mrVar2.d(false);
                    return;
                }
                return;
        }
    }
}
