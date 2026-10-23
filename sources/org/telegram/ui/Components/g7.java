package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class g7 implements Runnable {
    public final int f26554a;
    public final k8 f26555b;
    public final j80 f26556c;
    public final MessageObject d;

    public g7(k8 k8Var, MessageObject messageObject, j80 j80Var, int i10) {
        this.f26554a = i10;
        this.f26555b = k8Var;
        this.d = messageObject;
        this.f26556c = j80Var;
    }

    @Override
    public final void run() {
        switch (this.f26554a) {
            case 0:
                k8 k8Var = this.f26555b;
                k8Var.getClass();
                this.f26556c.u();
                k8Var.x0(this.d);
                return;
            case 1:
                k8 k8Var2 = this.f26555b;
                k8Var2.getClass();
                this.f26556c.u();
                k8Var2.G0(this.d);
                return;
            case 2:
                k8 k8Var3 = this.f26555b;
                MessageObject messageObject = this.d;
                k8Var3.C0(messageObject, false, new g7(k8Var3, messageObject, this.f26556c, 5), false);
                return;
            case 3:
                k8 k8Var4 = this.f26555b;
                k8Var4.getClass();
                this.f26556c.u();
                k8Var4.x0(this.d);
                return;
            case 4:
                k8 k8Var5 = this.f26555b;
                k8Var5.getClass();
                this.f26556c.u();
                k8Var5.G0(this.d);
                return;
            case 5:
                k8.q(this.f26555b, this.d, this.f26556c);
                return;
            case 6:
                k8 k8Var6 = this.f26555b;
                k8Var6.C0(this.d, true, new h7(k8Var6, this.f26556c, 4), false);
                return;
            case 7:
                k8.I(this.f26555b, this.d, this.f26556c);
                return;
            default:
                this.f26555b.B0(this.d);
                this.f26556c.u();
                return;
        }
    }

    public g7(k8 k8Var, j80 j80Var, MessageObject messageObject, int i10) {
        this.f26554a = i10;
        this.f26555b = k8Var;
        this.f26556c = j80Var;
        this.d = messageObject;
    }
}
