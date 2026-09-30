package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class c7 implements Runnable {
    public final int f23174a;
    public final j8 f23175b;
    public final MessageObject f23176c;

    public c7(j8 j8Var, MessageObject messageObject, int i10) {
        this.f23174a = i10;
        this.f23175b = j8Var;
        this.f23176c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f23174a) {
            case 0:
                j8.m(this.f23175b, this.f23176c);
                return;
            default:
                j8.p(this.f23175b, this.f23176c);
                return;
        }
    }
}
