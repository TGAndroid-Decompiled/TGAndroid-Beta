package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class r41 implements Runnable {
    public final int f30379a;
    public final Utilities.Callback2 f30380b;
    public final String f30381c;

    public r41(String str, int i10, Utilities.Callback2 callback2) {
        this.f30379a = i10;
        this.f30380b = callback2;
        this.f30381c = str;
    }

    @Override
    public final void run() {
        switch (this.f30379a) {
            case 0:
                Utilities.Callback2 callback2 = this.f30380b;
                if (callback2 != null) {
                    callback2.run(this.f30381c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f30380b.run(null, this.f30381c);
                return;
            default:
                this.f30380b.run(null, this.f30381c);
                return;
        }
    }
}
