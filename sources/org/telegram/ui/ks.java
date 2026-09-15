package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ks implements Runnable {
    public final int f35257a;
    public final ss f35258b;

    public ks(ss ssVar, int i10) {
        this.f35257a = i10;
        this.f35258b = ssVar;
    }

    @Override
    public final void run() {
        switch (this.f35257a) {
            case 0:
                ss ssVar = this.f35258b;
                if (ssVar.J) {
                    ssVar.d.f20229b.requestFocus();
                    AndroidUtilities.showKeyboard(ssVar.d.f20229b);
                    return;
                }
                return;
            case 1:
                ss.Z(this.f35258b);
                return;
            default:
                ss ssVar2 = this.f35258b;
                ssVar2.presentFragment(bo.R9(ssVar2.H), true);
                return;
        }
    }
}
