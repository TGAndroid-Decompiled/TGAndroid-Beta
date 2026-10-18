package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class d7 implements Runnable {
    public final int f25507a;
    public final k8 f25508b;
    public final MessageObject f25509c;

    public d7(k8 k8Var, MessageObject messageObject, int i10) {
        this.f25507a = i10;
        this.f25508b = k8Var;
        this.f25509c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25507a) {
            case 0:
                k8.n(this.f25508b, this.f25509c);
                return;
            default:
                k8.q(this.f25508b, this.f25509c);
                return;
        }
    }
}
