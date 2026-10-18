package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class f41 implements Runnable {
    public final int f26084a;
    public final Utilities.Callback2 f26085b;
    public final String f26086c;

    public f41(String str, int i10, Utilities.Callback2 callback2) {
        this.f26084a = i10;
        this.f26085b = callback2;
        this.f26086c = str;
    }

    @Override
    public final void run() {
        switch (this.f26084a) {
            case 0:
                Utilities.Callback2 callback2 = this.f26085b;
                if (callback2 != null) {
                    callback2.run(this.f26086c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f26085b.run(null, this.f26086c);
                return;
            default:
                this.f26085b.run(null, this.f26086c);
                return;
        }
    }
}
