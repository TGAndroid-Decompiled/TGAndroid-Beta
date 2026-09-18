package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ms implements Runnable {
    public final int f35881a;
    public final us f35882b;

    public ms(us usVar, int i10) {
        this.f35881a = i10;
        this.f35882b = usVar;
    }

    @Override
    public final void run() {
        switch (this.f35881a) {
            case 0:
                us usVar = this.f35882b;
                if (usVar.J) {
                    usVar.d.f20240b.requestFocus();
                    AndroidUtilities.showKeyboard(usVar.d.f20240b);
                    return;
                }
                return;
            case 1:
                us.Z(this.f35882b);
                return;
            default:
                us usVar2 = this.f35882b;
                usVar2.presentFragment(bo.R9(usVar2.H), true);
                return;
        }
    }
}
