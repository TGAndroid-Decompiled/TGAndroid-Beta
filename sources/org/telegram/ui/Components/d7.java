package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class d7 implements Runnable {
    public final int f25434a;
    public final k8 f25435b;
    public final MessageObject f25436c;

    public d7(k8 k8Var, MessageObject messageObject, int i10) {
        this.f25434a = i10;
        this.f25435b = k8Var;
        this.f25436c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25434a) {
            case 0:
                k8.n(this.f25435b, this.f25436c);
                return;
            default:
                k8.q(this.f25435b, this.f25436c);
                return;
        }
    }
}
