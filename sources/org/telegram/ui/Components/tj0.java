package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class tj0 implements Runnable {
    public final int f31070a;
    public final ck0 f31071b;
    public final TLObject f31072c;

    public tj0(ck0 ck0Var, TLObject tLObject, int i10) {
        this.f31070a = i10;
        this.f31071b = ck0Var;
        this.f31072c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f31070a) {
            case 0:
                ck0 ck0Var = this.f31071b;
                NotificationCenter.getInstance(ck0Var.f25401b).doOnIdle(new tj0(ck0Var, this.f31072c, 1));
                return;
            default:
                ck0.a(this.f31071b, this.f31072c);
                return;
        }
    }
}
