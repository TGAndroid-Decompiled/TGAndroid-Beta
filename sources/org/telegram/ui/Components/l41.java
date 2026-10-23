package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class l41 implements Runnable {
    public final int f28212a;
    public final Utilities.Callback2 f28213b;
    public final String f28214c;

    public l41(String str, int i10, Utilities.Callback2 callback2) {
        this.f28212a = i10;
        this.f28213b = callback2;
        this.f28214c = str;
    }

    @Override
    public final void run() {
        switch (this.f28212a) {
            case 0:
                Utilities.Callback2 callback2 = this.f28213b;
                if (callback2 != null) {
                    callback2.run(this.f28214c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f28213b.run(null, this.f28214c);
                return;
            default:
                this.f28213b.run(null, this.f28214c);
                return;
        }
    }
}
