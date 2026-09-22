package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class b7 implements Runnable {
    public final int f22905a;
    public final i8 f22906b;
    public final MessageObject f22907c;

    public b7(i8 i8Var, MessageObject messageObject, int i10) {
        this.f22905a = i10;
        this.f22906b = i8Var;
        this.f22907c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f22905a) {
            case 0:
                i8.m(this.f22906b, this.f22907c);
                return;
            default:
                i8.p(this.f22906b, this.f22907c);
                return;
        }
    }
}
