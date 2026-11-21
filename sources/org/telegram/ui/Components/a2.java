package org.telegram.ui.Components;
public final class a2 implements Runnable {
    public final int f33270a;
    public final org.telegram.messenger.lr f33271b;

    public a2(org.telegram.messenger.lr lrVar, int i7) {
        this.f33270a = i7;
        this.f33271b = lrVar;
    }

    @Override
    public final void run() {
        switch (this.f33270a) {
            case 0:
                org.telegram.messenger.lr lrVar = this.f33271b;
                if (lrVar != null) {
                    lrVar.d(false);
                    return;
                }
                return;
            default:
                org.telegram.messenger.lr lrVar2 = this.f33271b;
                if (lrVar2 != null) {
                    lrVar2.d(false);
                    return;
                }
                return;
        }
    }
}
