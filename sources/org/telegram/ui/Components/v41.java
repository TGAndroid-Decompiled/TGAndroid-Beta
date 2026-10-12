package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class v41 implements Runnable {
    public final int f31394a;
    public final Utilities.Callback2 f31395b;
    public final String f31396c;

    public v41(String str, int i10, Utilities.Callback2 callback2) {
        this.f31394a = i10;
        this.f31395b = callback2;
        this.f31396c = str;
    }

    @Override
    public final void run() {
        switch (this.f31394a) {
            case 0:
                Utilities.Callback2 callback2 = this.f31395b;
                if (callback2 != null) {
                    callback2.run(this.f31396c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f31395b.run(null, this.f31396c);
                return;
            default:
                this.f31395b.run(null, this.f31396c);
                return;
        }
    }
}
