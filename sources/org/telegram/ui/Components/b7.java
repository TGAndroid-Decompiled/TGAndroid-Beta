package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class b7 implements Runnable {
    public final int f21737a;
    public final j8 f21738b;
    public final MessageObject f21739c;

    public b7(j8 j8Var, MessageObject messageObject, int i10) {
        this.f21737a = i10;
        this.f21738b = j8Var;
        this.f21739c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f21737a) {
            case 0:
                j8.m(this.f21738b, this.f21739c);
                return;
            default:
                j8.p(this.f21738b, this.f21739c);
                return;
        }
    }
}
