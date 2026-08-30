package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class x6 implements Runnable {
    public final int f30582a;
    public final c8 f30583b;
    public final MessageObject f30584c;

    public x6(c8 c8Var, MessageObject messageObject, int i10) {
        this.f30582a = i10;
        this.f30583b = c8Var;
        this.f30584c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f30582a) {
            case 0:
                c8.m(this.f30583b, this.f30584c);
                return;
            default:
                c8.p(this.f30583b, this.f30584c);
                return;
        }
    }
}
