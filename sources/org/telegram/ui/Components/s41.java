package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class s41 implements Runnable {
    public final int f30617a;
    public final Utilities.Callback2 f30618b;
    public final String f30619c;

    public s41(String str, int i10, Utilities.Callback2 callback2) {
        this.f30617a = i10;
        this.f30618b = callback2;
        this.f30619c = str;
    }

    @Override
    public final void run() {
        switch (this.f30617a) {
            case 0:
                Utilities.Callback2 callback2 = this.f30618b;
                if (callback2 != null) {
                    callback2.run(this.f30619c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f30618b.run(null, this.f30619c);
                return;
            default:
                this.f30618b.run(null, this.f30619c);
                return;
        }
    }
}
