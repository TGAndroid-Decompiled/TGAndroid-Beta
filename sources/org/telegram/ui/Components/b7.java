package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class b7 implements Runnable {
    public final int f24918a;
    public final i8 f24919b;
    public final MessageObject f24920c;

    public b7(i8 i8Var, MessageObject messageObject, int i10) {
        this.f24918a = i10;
        this.f24919b = i8Var;
        this.f24920c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f24918a) {
            case 0:
                i8.m(this.f24919b, this.f24920c);
                return;
            default:
                i8.E(this.f24919b, this.f24920c);
                return;
        }
    }
}
