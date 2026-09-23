package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class c7 implements Runnable {
    public final int f22948a;
    public final j8 f22949b;
    public final MessageObject f22950c;

    public c7(j8 j8Var, MessageObject messageObject, int i10) {
        this.f22948a = i10;
        this.f22949b = j8Var;
        this.f22950c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f22948a) {
            case 0:
                j8.m(this.f22949b, this.f22950c);
                return;
            default:
                j8.p(this.f22949b, this.f22950c);
                return;
        }
    }
}
