package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class x6 implements Runnable {
    public final int f30515a;
    public final c8 f30516b;
    public final MessageObject f30517c;

    public x6(c8 c8Var, MessageObject messageObject, int i10) {
        this.f30515a = i10;
        this.f30516b = c8Var;
        this.f30517c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f30515a) {
            case 0:
                c8.m(this.f30516b, this.f30517c);
                return;
            default:
                c8.p(this.f30516b, this.f30517c);
                return;
        }
    }
}
