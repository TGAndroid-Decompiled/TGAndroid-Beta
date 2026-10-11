package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class e7 implements Runnable {
    public final int f25879a;
    public final l8 f25880b;
    public final MessageObject f25881c;

    public e7(l8 l8Var, MessageObject messageObject, int i10) {
        this.f25879a = i10;
        this.f25880b = l8Var;
        this.f25881c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25879a) {
            case 0:
                l8.o(this.f25880b, this.f25881c);
                return;
            default:
                l8.r(this.f25880b, this.f25881c);
                return;
        }
    }
}
