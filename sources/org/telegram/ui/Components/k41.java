package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class k41 implements Runnable {
    public final int f27858a;
    public final Utilities.Callback2 f27859b;
    public final String f27860c;

    public k41(String str, int i10, Utilities.Callback2 callback2) {
        this.f27858a = i10;
        this.f27859b = callback2;
        this.f27860c = str;
    }

    @Override
    public final void run() {
        switch (this.f27858a) {
            case 0:
                Utilities.Callback2 callback2 = this.f27859b;
                if (callback2 != null) {
                    callback2.run(this.f27860c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f27859b.run(null, this.f27860c);
                return;
            default:
                this.f27859b.run(null, this.f27860c);
                return;
        }
    }
}
