package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class c7 implements Runnable {
    public final int f23252a;
    public final j8 f23253b;
    public final MessageObject f23254c;

    public c7(j8 j8Var, MessageObject messageObject, int i10) {
        this.f23252a = i10;
        this.f23253b = j8Var;
        this.f23254c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f23252a) {
            case 0:
                j8.m(this.f23253b, this.f23254c);
                return;
            default:
                j8.p(this.f23253b, this.f23254c);
                return;
        }
    }
}
