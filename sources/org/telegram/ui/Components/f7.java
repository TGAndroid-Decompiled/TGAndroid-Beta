package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class f7 implements Runnable {
    public final int f24141a;
    public final j8 f24142b;
    public final a80 f24143c;
    public final MessageObject d;

    public f7(j8 j8Var, MessageObject messageObject, a80 a80Var, int i10) {
        this.f24141a = i10;
        this.f24142b = j8Var;
        this.d = messageObject;
        this.f24143c = a80Var;
    }

    @Override
    public final void run() {
        switch (this.f24141a) {
            case 0:
                j8 j8Var = this.f24142b;
                j8Var.getClass();
                this.f24143c.u();
                j8Var.q0(this.d);
                return;
            case 1:
                j8 j8Var2 = this.f24142b;
                j8Var2.getClass();
                this.f24143c.u();
                j8Var2.z0(this.d);
                return;
            case 2:
                j8 j8Var3 = this.f24142b;
                MessageObject messageObject = this.d;
                j8Var3.v0(messageObject, false, new f7(j8Var3, messageObject, this.f24143c, 5), false);
                return;
            case 3:
                j8 j8Var4 = this.f24142b;
                j8Var4.getClass();
                this.f24143c.u();
                j8Var4.q0(this.d);
                return;
            case 4:
                j8 j8Var5 = this.f24142b;
                j8Var5.getClass();
                this.f24143c.u();
                j8Var5.z0(this.d);
                return;
            case 5:
                j8.v(this.f24142b, this.d, this.f24143c);
                return;
            case 6:
                j8 j8Var6 = this.f24142b;
                j8Var6.v0(this.d, true, new g7(j8Var6, this.f24143c, 4), false);
                return;
            case 7:
                j8.L(this.f24142b, this.d, this.f24143c);
                return;
            default:
                this.f24142b.u0(this.d);
                this.f24143c.u();
                return;
        }
    }

    public f7(j8 j8Var, a80 a80Var, MessageObject messageObject, int i10) {
        this.f24141a = i10;
        this.f24142b = j8Var;
        this.f24143c = a80Var;
        this.d = messageObject;
    }
}
