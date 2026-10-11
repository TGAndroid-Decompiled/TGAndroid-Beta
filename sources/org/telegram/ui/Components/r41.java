package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class r41 implements Runnable {
    public final int f30413a;
    public final Utilities.Callback2 f30414b;
    public final String f30415c;

    public r41(String str, int i10, Utilities.Callback2 callback2) {
        this.f30413a = i10;
        this.f30414b = callback2;
        this.f30415c = str;
    }

    @Override
    public final void run() {
        switch (this.f30413a) {
            case 0:
                Utilities.Callback2 callback2 = this.f30414b;
                if (callback2 != null) {
                    callback2.run(this.f30415c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f30414b.run(null, this.f30415c);
                return;
            default:
                this.f30414b.run(null, this.f30415c);
                return;
        }
    }
}
