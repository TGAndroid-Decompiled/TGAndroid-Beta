package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class c7 implements Runnable {
    public final int f25243a;
    public final j8 f25244b;
    public final MessageObject f25245c;

    public c7(j8 j8Var, MessageObject messageObject, int i10) {
        this.f25243a = i10;
        this.f25244b = j8Var;
        this.f25245c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25243a) {
            case 0:
                j8.m(this.f25244b, this.f25245c);
                return;
            default:
                j8.p(this.f25244b, this.f25245c);
                return;
        }
    }
}
