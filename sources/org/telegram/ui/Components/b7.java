package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class b7 implements Runnable {
    public final int f26991a;
    public final g8 f26992b;
    public final MessageObject f26993c;

    public b7(g8 g8Var, MessageObject messageObject, int i10) {
        this.f26991a = i10;
        this.f26992b = g8Var;
        this.f26993c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f26991a) {
            case 0:
                g8.m(this.f26992b, this.f26993c);
                return;
            default:
                g8.p(this.f26992b, this.f26993c);
                return;
        }
    }
}
