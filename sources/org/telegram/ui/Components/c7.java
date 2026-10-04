package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class c7 implements Runnable {
    public final int f25237a;
    public final j8 f25238b;
    public final MessageObject f25239c;

    public c7(j8 j8Var, MessageObject messageObject, int i10) {
        this.f25237a = i10;
        this.f25238b = j8Var;
        this.f25239c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25237a) {
            case 0:
                j8.m(this.f25238b, this.f25239c);
                return;
            default:
                j8.p(this.f25238b, this.f25239c);
                return;
        }
    }
}
