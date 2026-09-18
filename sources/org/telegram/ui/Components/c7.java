package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class c7 implements Runnable {
    public final int f23210a;
    public final j8 f23211b;
    public final MessageObject f23212c;

    public c7(j8 j8Var, MessageObject messageObject, int i10) {
        this.f23210a = i10;
        this.f23211b = j8Var;
        this.f23212c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f23210a) {
            case 0:
                j8.m(this.f23211b, this.f23212c);
                return;
            default:
                j8.p(this.f23211b, this.f23212c);
                return;
        }
    }
}
