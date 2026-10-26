package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class f7 implements Runnable {
    public final int f28075a;
    public final m8 f28076b;
    public final MessageObject f28077c;

    public f7(m8 m8Var, MessageObject messageObject, int i10) {
        this.f28075a = i10;
        this.f28076b = m8Var;
        this.f28077c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f28075a) {
            case 0:
                m8.m(this.f28076b, this.f28077c);
                return;
            default:
                m8.F(this.f28076b, this.f28077c);
                return;
        }
    }
}
