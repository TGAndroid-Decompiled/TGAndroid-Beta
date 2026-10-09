package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class e7 implements Runnable {
    public final int f25974a;
    public final l8 f25975b;
    public final MessageObject f25976c;

    public e7(l8 l8Var, MessageObject messageObject, int i10) {
        this.f25974a = i10;
        this.f25975b = l8Var;
        this.f25976c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25974a) {
            case 0:
                l8.o(this.f25975b, this.f25976c);
                return;
            default:
                l8.r(this.f25975b, this.f25976c);
                return;
        }
    }
}
