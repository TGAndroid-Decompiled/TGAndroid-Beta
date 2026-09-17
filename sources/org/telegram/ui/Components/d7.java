package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class d7 implements Runnable {
    public final int f25312a;
    public final k8 f25313b;
    public final MessageObject f25314c;

    public d7(k8 k8Var, MessageObject messageObject, int i10) {
        this.f25312a = i10;
        this.f25313b = k8Var;
        this.f25314c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25312a) {
            case 0:
                k8.m(this.f25313b, this.f25314c);
                return;
            default:
                k8.p(this.f25313b, this.f25314c);
                return;
        }
    }
}
