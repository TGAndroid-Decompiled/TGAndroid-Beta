package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class w6 implements Runnable {
    public final int f34120a;
    public final c8 f34121b;
    public final MessageObject f34122c;

    public w6(c8 c8Var, MessageObject messageObject, int i9) {
        this.f34120a = i9;
        this.f34121b = c8Var;
        this.f34122c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f34120a) {
            case 0:
                c8.m(this.f34121b, this.f34122c);
                return;
            default:
                c8.p(this.f34121b, this.f34122c);
                return;
        }
    }
}
