package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class c7 implements Runnable {
    public final int f23219a;
    public final j8 f23220b;
    public final MessageObject f23221c;

    public c7(j8 j8Var, MessageObject messageObject, int i10) {
        this.f23219a = i10;
        this.f23220b = j8Var;
        this.f23221c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f23219a) {
            case 0:
                j8.m(this.f23220b, this.f23221c);
                return;
            default:
                j8.p(this.f23220b, this.f23221c);
                return;
        }
    }
}
