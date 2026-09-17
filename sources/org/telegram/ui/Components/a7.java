package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class a7 implements Runnable {
    public final int f22336a;
    public final h8 f22337b;
    public final MessageObject f22338c;

    public a7(h8 h8Var, MessageObject messageObject, int i10) {
        this.f22336a = i10;
        this.f22337b = h8Var;
        this.f22338c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f22336a) {
            case 0:
                h8.m(this.f22337b, this.f22338c);
                return;
            default:
                h8.p(this.f22337b, this.f22338c);
                return;
        }
    }
}
