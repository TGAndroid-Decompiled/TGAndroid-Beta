package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class d7 implements Runnable {
    public final int f25360a;
    public final k8 f25361b;
    public final MessageObject f25362c;

    public d7(k8 k8Var, MessageObject messageObject, int i10) {
        this.f25360a = i10;
        this.f25361b = k8Var;
        this.f25362c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25360a) {
            case 0:
                k8.n(this.f25361b, this.f25362c);
                return;
            default:
                k8.q(this.f25361b, this.f25362c);
                return;
        }
    }
}
