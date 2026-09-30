package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class c7 implements Runnable {
    public final int f23198a;
    public final j8 f23199b;
    public final MessageObject f23200c;

    public c7(j8 j8Var, MessageObject messageObject, int i10) {
        this.f23198a = i10;
        this.f23199b = j8Var;
        this.f23200c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f23198a) {
            case 0:
                j8.m(this.f23199b, this.f23200c);
                return;
            default:
                j8.p(this.f23199b, this.f23200c);
                return;
        }
    }
}
