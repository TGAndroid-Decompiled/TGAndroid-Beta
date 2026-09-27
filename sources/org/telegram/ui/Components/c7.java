package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class c7 implements Runnable {
    public final int f23236a;
    public final j8 f23237b;
    public final MessageObject f23238c;

    public c7(j8 j8Var, MessageObject messageObject, int i10) {
        this.f23236a = i10;
        this.f23237b = j8Var;
        this.f23238c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f23236a) {
            case 0:
                j8.m(this.f23237b, this.f23238c);
                return;
            default:
                j8.p(this.f23237b, this.f23238c);
                return;
        }
    }
}
