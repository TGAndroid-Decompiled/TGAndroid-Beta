package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class c7 implements Runnable {
    public final int f23218a;
    public final j8 f23219b;
    public final MessageObject f23220c;

    public c7(j8 j8Var, MessageObject messageObject, int i10) {
        this.f23218a = i10;
        this.f23219b = j8Var;
        this.f23220c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f23218a) {
            case 0:
                j8.m(this.f23219b, this.f23220c);
                return;
            default:
                j8.p(this.f23219b, this.f23220c);
                return;
        }
    }
}
