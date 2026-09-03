package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class gs implements Runnable {
    public final int f37157a;
    public final os f37158b;

    public gs(os osVar, int i10) {
        this.f37157a = i10;
        this.f37158b = osVar;
    }

    @Override
    public final void run() {
        switch (this.f37157a) {
            case 0:
                os osVar = this.f37158b;
                if (osVar.G) {
                    osVar.d.f22957b.requestFocus();
                    AndroidUtilities.showKeyboard(osVar.d.f22957b);
                    return;
                }
                return;
            case 1:
                os.Z(this.f37158b);
                return;
            default:
                os osVar2 = this.f37158b;
                osVar2.presentFragment(xn.R9(osVar2.E), true);
                return;
        }
    }
}
