package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class g41 implements Runnable {
    public final int f26471a;
    public final Utilities.Callback2 f26472b;
    public final String f26473c;

    public g41(String str, int i10, Utilities.Callback2 callback2) {
        this.f26471a = i10;
        this.f26472b = callback2;
        this.f26473c = str;
    }

    @Override
    public final void run() {
        switch (this.f26471a) {
            case 0:
                Utilities.Callback2 callback2 = this.f26472b;
                if (callback2 != null) {
                    callback2.run(this.f26473c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f26472b.run(null, this.f26473c);
                return;
            default:
                this.f26472b.run(null, this.f26473c);
                return;
        }
    }
}
