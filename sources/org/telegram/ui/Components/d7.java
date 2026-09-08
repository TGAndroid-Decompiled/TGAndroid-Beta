package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class d7 implements Runnable {
    public final int f25311a;
    public final k8 f25312b;
    public final MessageObject f25313c;

    public d7(k8 k8Var, MessageObject messageObject, int i10) {
        this.f25311a = i10;
        this.f25312b = k8Var;
        this.f25313c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25311a) {
            case 0:
                k8.m(this.f25312b, this.f25313c);
                return;
            default:
                k8.p(this.f25312b, this.f25313c);
                return;
        }
    }
}
