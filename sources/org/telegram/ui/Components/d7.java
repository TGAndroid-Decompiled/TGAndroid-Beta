package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class d7 implements Runnable {
    public final int f25285a;
    public final k8 f25286b;
    public final MessageObject f25287c;

    public d7(k8 k8Var, MessageObject messageObject, int i10) {
        this.f25285a = i10;
        this.f25286b = k8Var;
        this.f25287c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25285a) {
            case 0:
                k8.m(this.f25286b, this.f25287c);
                return;
            default:
                k8.p(this.f25286b, this.f25287c);
                return;
        }
    }
}
