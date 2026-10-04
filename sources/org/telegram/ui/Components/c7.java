package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class c7 implements Runnable {
    public final int f25238a;
    public final j8 f25239b;
    public final MessageObject f25240c;

    public c7(j8 j8Var, MessageObject messageObject, int i10) {
        this.f25238a = i10;
        this.f25239b = j8Var;
        this.f25240c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f25238a) {
            case 0:
                j8.m(this.f25239b, this.f25240c);
                return;
            default:
                j8.p(this.f25239b, this.f25240c);
                return;
        }
    }
}
