package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class x6 implements Runnable {
    public final int f32962a;
    public final c8 f32963b;
    public final MessageObject f32964c;

    public x6(c8 c8Var, MessageObject messageObject, int i10) {
        this.f32962a = i10;
        this.f32963b = c8Var;
        this.f32964c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f32962a) {
            case 0:
                c8.m(this.f32963b, this.f32964c);
                return;
            default:
                c8.p(this.f32963b, this.f32964c);
                return;
        }
    }
}
