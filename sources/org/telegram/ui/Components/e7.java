package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class e7 implements Runnable {
    public final int f25928a;
    public final l8 f25929b;
    public final MessageObject f25930c;

    public e7(l8 l8Var, MessageObject messageObject, int i10) {
        this.f25928a = i10;
        this.f25929b = l8Var;
        this.f25930c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25928a) {
            case 0:
                l8.o(this.f25929b, this.f25930c);
                return;
            default:
                l8.r(this.f25929b, this.f25930c);
                return;
        }
    }
}
