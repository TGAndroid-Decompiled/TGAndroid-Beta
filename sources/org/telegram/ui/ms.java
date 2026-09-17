package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ms implements Runnable {
    public final int f35876a;
    public final us f35877b;

    public ms(us usVar, int i10) {
        this.f35876a = i10;
        this.f35877b = usVar;
    }

    @Override
    public final void run() {
        switch (this.f35876a) {
            case 0:
                us usVar = this.f35877b;
                if (usVar.J) {
                    usVar.d.f20239b.requestFocus();
                    AndroidUtilities.showKeyboard(usVar.d.f20239b);
                    return;
                }
                return;
            case 1:
                us.Z(this.f35877b);
                return;
            default:
                us usVar2 = this.f35877b;
                usVar2.presentFragment(bo.R9(usVar2.H), true);
                return;
        }
    }
}
