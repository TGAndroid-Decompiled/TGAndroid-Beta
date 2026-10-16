package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class f7 implements Runnable {
    public final int f24640a;
    public final m8 f24641b;
    public final MessageObject f24642c;

    public f7(m8 m8Var, MessageObject messageObject, int i10) {
        this.f24640a = i10;
        this.f24641b = m8Var;
        this.f24642c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f24640a) {
            case 0:
                m8.n(this.f24641b, this.f24642c);
                return;
            default:
                m8.r(this.f24641b, this.f24642c);
                return;
        }
    }
}
