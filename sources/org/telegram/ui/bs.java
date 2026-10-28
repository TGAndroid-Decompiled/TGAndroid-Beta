package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class bs implements Runnable {
    public final int f38094a;
    public final ls f38095b;

    public bs(ls lsVar, int i10) {
        this.f38094a = i10;
        this.f38095b = lsVar;
    }

    @Override
    public final void run() {
        switch (this.f38094a) {
            case 0:
                ls.Z(this.f38095b);
                return;
            case 1:
                ls lsVar = this.f38095b;
                if (lsVar.J) {
                    lsVar.d.d.requestFocus();
                    AndroidUtilities.showKeyboard(lsVar.d.d);
                    return;
                }
                return;
            default:
                ls lsVar2 = this.f38095b;
                lsVar2.presentFragment(wn.ea(lsVar2.H), true);
                return;
        }
    }
}
