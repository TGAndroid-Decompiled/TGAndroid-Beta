package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

public final class w6 implements Runnable {

    public final int f34124a;

    public final b8 f34125b;

    public final MessageObject f34126c;

    public w6(b8 b8Var, MessageObject messageObject, int i10) {
        this.f34124a = i10;
        this.f34125b = b8Var;
        this.f34126c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f34124a) {
            case 0:
                b8.m(this.f34125b, this.f34126c);
                break;
            default:
                b8.q(this.f34125b, this.f34126c);
                break;
        }
    }
}
