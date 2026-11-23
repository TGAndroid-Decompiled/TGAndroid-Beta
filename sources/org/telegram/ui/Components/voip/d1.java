package org.telegram.ui.Components.voip;

import di.n4;
import org.telegram.ui.Components.rh0;
public final class d1 implements Runnable {
    public final int f40913a;
    public final n4 f40914b;
    public final rh0 f40915c;

    public d1(n4 n4Var, rh0 rh0Var, int i7) {
        this.f40913a = i7;
        this.f40914b = n4Var;
        this.f40915c = rh0Var;
    }

    @Override
    public final void run() {
        switch (this.f40913a) {
            case 0:
                org.telegram.messenger.g0.g3(new d1(this.f40914b, this.f40915c, 1));
                return;
            default:
                this.f40914b.removeView(this.f40915c);
                return;
        }
    }
}
