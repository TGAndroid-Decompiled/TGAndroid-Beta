package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class f7 implements Runnable {
    public final int f24946a;
    public final m8 f24947b;
    public final MessageObject f24948c;

    public f7(m8 m8Var, MessageObject messageObject, int i10) {
        this.f24946a = i10;
        this.f24947b = m8Var;
        this.f24948c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f24946a) {
            case 0:
                m8.n(this.f24947b, this.f24948c);
                return;
            default:
                m8.r(this.f24947b, this.f24948c);
                return;
        }
    }
}
