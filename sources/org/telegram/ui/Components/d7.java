package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class d7 implements Runnable {
    public final int f25284a;
    public final k8 f25285b;
    public final MessageObject f25286c;

    public d7(k8 k8Var, MessageObject messageObject, int i10) {
        this.f25284a = i10;
        this.f25285b = k8Var;
        this.f25286c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25284a) {
            case 0:
                k8.m(this.f25285b, this.f25286c);
                return;
            default:
                k8.p(this.f25285b, this.f25286c);
                return;
        }
    }
}
