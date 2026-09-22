package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class a7 implements Runnable {
    public final int f22320a;
    public final h8 f22321b;
    public final MessageObject f22322c;

    public a7(h8 h8Var, MessageObject messageObject, int i10) {
        this.f22320a = i10;
        this.f22321b = h8Var;
        this.f22322c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f22320a) {
            case 0:
                h8.m(this.f22321b, this.f22322c);
                return;
            default:
                h8.p(this.f22321b, this.f22322c);
                return;
        }
    }
}
