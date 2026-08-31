package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class gs implements Runnable {
    public final int f37260a;
    public final os f37261b;

    public gs(os osVar, int i10) {
        this.f37260a = i10;
        this.f37261b = osVar;
    }

    @Override
    public final void run() {
        switch (this.f37260a) {
            case 0:
                os osVar = this.f37261b;
                if (osVar.G) {
                    osVar.d.f22955b.requestFocus();
                    AndroidUtilities.showKeyboard(osVar.d.f22955b);
                    return;
                }
                return;
            case 1:
                os.Z(this.f37261b);
                return;
            default:
                os osVar2 = this.f37261b;
                osVar2.presentFragment(xn.R9(osVar2.E), true);
                return;
        }
    }
}
