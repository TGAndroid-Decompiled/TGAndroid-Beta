package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class e7 implements Runnable {
    public final int f25611a;
    public final l8 f25612b;
    public final MessageObject f25613c;

    public e7(l8 l8Var, MessageObject messageObject, int i10) {
        this.f25611a = i10;
        this.f25612b = l8Var;
        this.f25613c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25611a) {
            case 0:
                l8.o(this.f25612b, this.f25613c);
                return;
            default:
                l8.r(this.f25612b, this.f25613c);
                return;
        }
    }
}
