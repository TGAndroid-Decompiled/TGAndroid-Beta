package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class f41 implements Runnable {
    public final int f26077a;
    public final Utilities.Callback2 f26078b;
    public final String f26079c;

    public f41(String str, int i10, Utilities.Callback2 callback2) {
        this.f26077a = i10;
        this.f26078b = callback2;
        this.f26079c = str;
    }

    @Override
    public final void run() {
        switch (this.f26077a) {
            case 0:
                Utilities.Callback2 callback2 = this.f26078b;
                if (callback2 != null) {
                    callback2.run(this.f26079c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f26078b.run(null, this.f26079c);
                return;
            default:
                this.f26078b.run(null, this.f26079c);
                return;
        }
    }
}
