package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class x6 implements Runnable {
    public final int f32954a;
    public final c8 f32955b;
    public final MessageObject f32956c;

    public x6(c8 c8Var, MessageObject messageObject, int i10) {
        this.f32954a = i10;
        this.f32955b = c8Var;
        this.f32956c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f32954a) {
            case 0:
                c8.m(this.f32955b, this.f32956c);
                return;
            default:
                c8.p(this.f32955b, this.f32956c);
                return;
        }
    }
}
