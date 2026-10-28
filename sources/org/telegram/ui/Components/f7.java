package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class f7 implements Runnable {
    public final int f28037a;
    public final m8 f28038b;
    public final MessageObject f28039c;

    public f7(m8 m8Var, MessageObject messageObject, int i10) {
        this.f28037a = i10;
        this.f28038b = m8Var;
        this.f28039c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f28037a) {
            case 0:
                m8.m(this.f28038b, this.f28039c);
                return;
            default:
                m8.F(this.f28038b, this.f28039c);
                return;
        }
    }
}
