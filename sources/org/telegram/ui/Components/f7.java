package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class f7 implements Runnable {
    public final int f28073a;
    public final m8 f28074b;
    public final MessageObject f28075c;

    public f7(m8 m8Var, MessageObject messageObject, int i10) {
        this.f28073a = i10;
        this.f28074b = m8Var;
        this.f28075c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f28073a) {
            case 0:
                m8.m(this.f28074b, this.f28075c);
                return;
            default:
                m8.F(this.f28074b, this.f28075c);
                return;
        }
    }
}
