package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class h41 implements Runnable {
    public final int f26749a;
    public final Utilities.Callback2 f26750b;
    public final String f26751c;

    public h41(String str, int i10, Utilities.Callback2 callback2) {
        this.f26749a = i10;
        this.f26750b = callback2;
        this.f26751c = str;
    }

    @Override
    public final void run() {
        switch (this.f26749a) {
            case 0:
                Utilities.Callback2 callback2 = this.f26750b;
                if (callback2 != null) {
                    callback2.run(this.f26751c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f26750b.run(null, this.f26751c);
                return;
            default:
                this.f26750b.run(null, this.f26751c);
                return;
        }
    }
}
