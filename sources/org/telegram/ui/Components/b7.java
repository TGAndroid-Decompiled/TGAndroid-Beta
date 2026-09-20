package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class b7 implements Runnable {
    public final int f22904a;
    public final i8 f22905b;
    public final MessageObject f22906c;

    public b7(i8 i8Var, MessageObject messageObject, int i10) {
        this.f22904a = i10;
        this.f22905b = i8Var;
        this.f22906c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f22904a) {
            case 0:
                i8.m(this.f22905b, this.f22906c);
                return;
            default:
                i8.p(this.f22905b, this.f22906c);
                return;
        }
    }
}
