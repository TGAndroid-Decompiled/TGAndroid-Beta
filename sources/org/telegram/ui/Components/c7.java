package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class c7 implements Runnable {
    public final int f23251a;
    public final j8 f23252b;
    public final MessageObject f23253c;

    public c7(j8 j8Var, MessageObject messageObject, int i10) {
        this.f23251a = i10;
        this.f23252b = j8Var;
        this.f23253c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f23251a) {
            case 0:
                j8.m(this.f23252b, this.f23253c);
                return;
            default:
                j8.p(this.f23252b, this.f23253c);
                return;
        }
    }
}
