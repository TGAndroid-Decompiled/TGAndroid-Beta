package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class m41 implements Runnable {
    public final int f26920a;
    public final Utilities.Callback2 f26921b;
    public final String f26922c;

    public m41(String str, int i10, Utilities.Callback2 callback2) {
        this.f26920a = i10;
        this.f26921b = callback2;
        this.f26922c = str;
    }

    @Override
    public final void run() {
        switch (this.f26920a) {
            case 0:
                Utilities.Callback2 callback2 = this.f26921b;
                if (callback2 != null) {
                    callback2.run(this.f26922c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f26921b.run(null, this.f26922c);
                return;
            default:
                this.f26921b.run(null, this.f26922c);
                return;
        }
    }
}
