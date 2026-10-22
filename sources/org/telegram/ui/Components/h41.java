package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class h41 implements Runnable {
    public final int f26752a;
    public final Utilities.Callback2 f26753b;
    public final String f26754c;

    public h41(String str, int i10, Utilities.Callback2 callback2) {
        this.f26752a = i10;
        this.f26753b = callback2;
        this.f26754c = str;
    }

    @Override
    public final void run() {
        switch (this.f26752a) {
            case 0:
                Utilities.Callback2 callback2 = this.f26753b;
                if (callback2 != null) {
                    callback2.run(this.f26754c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f26753b.run(null, this.f26754c);
                return;
            default:
                this.f26753b.run(null, this.f26754c);
                return;
        }
    }
}
