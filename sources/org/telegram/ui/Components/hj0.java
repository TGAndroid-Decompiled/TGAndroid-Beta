package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
public final class hj0 implements Runnable {
    public final int f24675a;
    public final qj0 f24676b;
    public final TLObject f24677c;

    public hj0(qj0 qj0Var, TLObject tLObject, int i10) {
        this.f24675a = i10;
        this.f24676b = qj0Var;
        this.f24677c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f24675a) {
            case 0:
                qj0 qj0Var = this.f24676b;
                NotificationCenter.getInstance(qj0Var.f27325b).doOnIdle(new hj0(qj0Var, this.f24677c, 1));
                return;
            default:
                qj0.a(this.f24676b, this.f24677c);
                return;
        }
    }
}
