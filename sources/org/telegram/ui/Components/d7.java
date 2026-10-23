package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class d7 implements Runnable {
    public final int f25361a;
    public final k8 f25362b;
    public final MessageObject f25363c;

    public d7(k8 k8Var, MessageObject messageObject, int i10) {
        this.f25361a = i10;
        this.f25362b = k8Var;
        this.f25363c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25361a) {
            case 0:
                k8.n(this.f25362b, this.f25363c);
                return;
            default:
                k8.q(this.f25362b, this.f25363c);
                return;
        }
    }
}
