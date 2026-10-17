package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class d7 implements Runnable {
    public final int f25500a;
    public final k8 f25501b;
    public final MessageObject f25502c;

    public d7(k8 k8Var, MessageObject messageObject, int i10) {
        this.f25500a = i10;
        this.f25501b = k8Var;
        this.f25502c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25500a) {
            case 0:
                k8.n(this.f25501b, this.f25502c);
                return;
            default:
                k8.q(this.f25501b, this.f25502c);
                return;
        }
    }
}
