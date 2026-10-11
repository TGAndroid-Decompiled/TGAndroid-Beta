package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class e7 implements Runnable {
    public final int f26002a;
    public final l8 f26003b;
    public final MessageObject f26004c;

    public e7(l8 l8Var, MessageObject messageObject, int i10) {
        this.f26002a = i10;
        this.f26003b = l8Var;
        this.f26004c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f26002a) {
            case 0:
                l8.o(this.f26003b, this.f26004c);
                return;
            default:
                l8.r(this.f26003b, this.f26004c);
                return;
        }
    }
}
