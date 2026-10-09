package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class q41 implements Runnable {
    public final int f30039a;
    public final Utilities.Callback2 f30040b;
    public final String f30041c;

    public q41(String str, int i10, Utilities.Callback2 callback2) {
        this.f30039a = i10;
        this.f30040b = callback2;
        this.f30041c = str;
    }

    @Override
    public final void run() {
        switch (this.f30039a) {
            case 0:
                Utilities.Callback2 callback2 = this.f30040b;
                if (callback2 != null) {
                    callback2.run(this.f30041c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f30040b.run(null, this.f30041c);
                return;
            default:
                this.f30040b.run(null, this.f30041c);
                return;
        }
    }
}
