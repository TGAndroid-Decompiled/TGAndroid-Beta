package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class as implements Runnable {
    public final int f36542a;
    public final is f36543b;

    public as(is isVar, int i9) {
        this.f36542a = i9;
        this.f36543b = isVar;
    }

    @Override
    public final void run() {
        switch (this.f36542a) {
            case 0:
                is isVar = this.f36543b;
                if (isVar.F) {
                    isVar.d.f24544b.requestFocus();
                    AndroidUtilities.showKeyboard(isVar.d.f24544b);
                    return;
                }
                return;
            case 1:
                is.Y(this.f36543b);
                return;
            default:
                is isVar2 = this.f36543b;
                isVar2.presentFragment(qn.R9(isVar2.D), true);
                return;
        }
    }
}
