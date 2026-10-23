package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class d7 implements Runnable {
    public final int f25512a;
    public final k8 f25513b;
    public final MessageObject f25514c;

    public d7(k8 k8Var, MessageObject messageObject, int i10) {
        this.f25512a = i10;
        this.f25513b = k8Var;
        this.f25514c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25512a) {
            case 0:
                k8.m(this.f25513b, this.f25514c);
                return;
            default:
                k8.E(this.f25513b, this.f25514c);
                return;
        }
    }
}
