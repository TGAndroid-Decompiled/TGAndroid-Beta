package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class g41 implements Runnable {
    public final int f26469a;
    public final Utilities.Callback2 f26470b;
    public final String f26471c;

    public g41(String str, int i10, Utilities.Callback2 callback2) {
        this.f26469a = i10;
        this.f26470b = callback2;
        this.f26471c = str;
    }

    @Override
    public final void run() {
        switch (this.f26469a) {
            case 0:
                Utilities.Callback2 callback2 = this.f26470b;
                if (callback2 != null) {
                    callback2.run(this.f26471c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f26470b.run(null, this.f26471c);
                return;
            default:
                this.f26470b.run(null, this.f26471c);
                return;
        }
    }
}
