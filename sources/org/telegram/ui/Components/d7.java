package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class d7 implements Runnable {
    public final int f25357a;
    public final k8 f25358b;
    public final MessageObject f25359c;

    public d7(k8 k8Var, MessageObject messageObject, int i10) {
        this.f25357a = i10;
        this.f25358b = k8Var;
        this.f25359c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25357a) {
            case 0:
                k8.n(this.f25358b, this.f25359c);
                return;
            default:
                k8.q(this.f25358b, this.f25359c);
                return;
        }
    }
}
