package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class fs implements Runnable {
    public final int f34348a;
    public final ns f34349b;

    public fs(ns nsVar, int i10) {
        this.f34348a = i10;
        this.f34349b = nsVar;
    }

    @Override
    public final void run() {
        switch (this.f34348a) {
            case 0:
                ns nsVar = this.f34349b;
                if (nsVar.G) {
                    nsVar.d.f21199b.requestFocus();
                    AndroidUtilities.showKeyboard(nsVar.d.f21199b);
                    return;
                }
                return;
            case 1:
                ns.Z(this.f34349b);
                return;
            default:
                ns nsVar2 = this.f34349b;
                nsVar2.presentFragment(xn.R9(nsVar2.E), true);
                return;
        }
    }
}
