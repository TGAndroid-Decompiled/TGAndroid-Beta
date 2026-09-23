package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class fs implements Runnable {
    public final int f33359a;
    public final ns f33360b;

    public fs(ns nsVar, int i10) {
        this.f33359a = i10;
        this.f33360b = nsVar;
    }

    @Override
    public final void run() {
        switch (this.f33359a) {
            case 0:
                ns nsVar = this.f33360b;
                if (nsVar.J) {
                    nsVar.d.f20177b.requestFocus();
                    AndroidUtilities.showKeyboard(nsVar.d.f20177b);
                    return;
                }
                return;
            case 1:
                ns.Z(this.f33360b);
                return;
            default:
                ns nsVar2 = this.f33360b;
                nsVar2.presentFragment(xn.R9(nsVar2.H), true);
                return;
        }
    }
}
