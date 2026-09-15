package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class a7 implements Runnable {
    public final int f22323a;
    public final h8 f22324b;
    public final MessageObject f22325c;

    public a7(h8 h8Var, MessageObject messageObject, int i10) {
        this.f22323a = i10;
        this.f22324b = h8Var;
        this.f22325c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f22323a) {
            case 0:
                h8.m(this.f22324b, this.f22325c);
                return;
            default:
                h8.p(this.f22324b, this.f22325c);
                return;
        }
    }
}
