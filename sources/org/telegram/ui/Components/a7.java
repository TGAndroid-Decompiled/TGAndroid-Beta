package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class a7 implements Runnable {
    public final int f22339a;
    public final h8 f22340b;
    public final MessageObject f22341c;

    public a7(h8 h8Var, MessageObject messageObject, int i10) {
        this.f22339a = i10;
        this.f22340b = h8Var;
        this.f22341c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f22339a) {
            case 0:
                h8.m(this.f22340b, this.f22341c);
                return;
            default:
                h8.p(this.f22340b, this.f22341c);
                return;
        }
    }
}
