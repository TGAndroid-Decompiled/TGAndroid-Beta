package org.telegram.ui.Components;
public final class a2 implements Runnable {
    public final int f33238a;
    public final org.telegram.messenger.mr f33239b;

    public a2(org.telegram.messenger.mr mrVar, int i7) {
        this.f33238a = i7;
        this.f33239b = mrVar;
    }

    @Override
    public final void run() {
        switch (this.f33238a) {
            case 0:
                org.telegram.messenger.mr mrVar = this.f33239b;
                if (mrVar != null) {
                    mrVar.d(false);
                    return;
                }
                return;
            default:
                org.telegram.messenger.mr mrVar2 = this.f33239b;
                if (mrVar2 != null) {
                    mrVar2.d(false);
                    return;
                }
                return;
        }
    }
}
