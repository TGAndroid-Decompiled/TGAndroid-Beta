package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class e7 implements Runnable {
    public final int f25616a;
    public final l8 f25617b;
    public final MessageObject f25618c;

    public e7(l8 l8Var, MessageObject messageObject, int i10) {
        this.f25616a = i10;
        this.f25617b = l8Var;
        this.f25618c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25616a) {
            case 0:
                l8.o(this.f25617b, this.f25618c);
                return;
            default:
                l8.r(this.f25617b, this.f25618c);
                return;
        }
    }
}
