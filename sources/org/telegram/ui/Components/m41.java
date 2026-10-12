package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class m41 implements Runnable {
    public final int f27202a;
    public final Utilities.Callback2 f27203b;
    public final String f27204c;

    public m41(String str, int i10, Utilities.Callback2 callback2) {
        this.f27202a = i10;
        this.f27203b = callback2;
        this.f27204c = str;
    }

    @Override
    public final void run() {
        switch (this.f27202a) {
            case 0:
                Utilities.Callback2 callback2 = this.f27203b;
                if (callback2 != null) {
                    callback2.run(this.f27204c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f27203b.run(null, this.f27204c);
                return;
            default:
                this.f27203b.run(null, this.f27204c);
                return;
        }
    }
}
