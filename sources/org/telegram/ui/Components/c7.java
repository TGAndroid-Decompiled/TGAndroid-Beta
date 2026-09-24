package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class c7 implements Runnable {
    public final int f23222a;
    public final j8 f23223b;
    public final MessageObject f23224c;

    public c7(j8 j8Var, MessageObject messageObject, int i10) {
        this.f23222a = i10;
        this.f23223b = j8Var;
        this.f23224c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f23222a) {
            case 0:
                j8.m(this.f23223b, this.f23224c);
                return;
            default:
                j8.p(this.f23223b, this.f23224c);
                return;
        }
    }
}
