package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class d7 implements Runnable {
    public final int f25432a;
    public final k8 f25433b;
    public final MessageObject f25434c;

    public d7(k8 k8Var, MessageObject messageObject, int i10) {
        this.f25432a = i10;
        this.f25433b = k8Var;
        this.f25434c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25432a) {
            case 0:
                k8.n(this.f25433b, this.f25434c);
                return;
            default:
                k8.q(this.f25433b, this.f25434c);
                return;
        }
    }
}
