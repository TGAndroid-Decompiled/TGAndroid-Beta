package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class c7 implements Runnable {
    public final int f25283a;
    public final j8 f25284b;
    public final MessageObject f25285c;

    public c7(j8 j8Var, MessageObject messageObject, int i10) {
        this.f25283a = i10;
        this.f25284b = j8Var;
        this.f25285c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25283a) {
            case 0:
                j8.m(this.f25284b, this.f25285c);
                return;
            default:
                j8.p(this.f25284b, this.f25285c);
                return;
        }
    }
}
