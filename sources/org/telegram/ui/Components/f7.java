package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class f7 implements Runnable {
    public final int f23873a;
    public final j8 f23874b;
    public final o70 f23875c;
    public final MessageObject d;

    public f7(j8 j8Var, MessageObject messageObject, o70 o70Var, int i10) {
        this.f23873a = i10;
        this.f23874b = j8Var;
        this.d = messageObject;
        this.f23875c = o70Var;
    }

    @Override
    public final void run() {
        switch (this.f23873a) {
            case 0:
                j8 j8Var = this.f23874b;
                j8Var.getClass();
                this.f23875c.u();
                j8Var.q0(this.d);
                return;
            case 1:
                j8 j8Var2 = this.f23874b;
                j8Var2.getClass();
                this.f23875c.u();
                j8Var2.z0(this.d);
                return;
            case 2:
                j8 j8Var3 = this.f23874b;
                MessageObject messageObject = this.d;
                j8Var3.v0(messageObject, false, new f7(j8Var3, messageObject, this.f23875c, 5), false);
                return;
            case 3:
                j8 j8Var4 = this.f23874b;
                j8Var4.getClass();
                this.f23875c.u();
                j8Var4.q0(this.d);
                return;
            case 4:
                j8 j8Var5 = this.f23874b;
                j8Var5.getClass();
                this.f23875c.u();
                j8Var5.z0(this.d);
                return;
            case 5:
                j8.v(this.f23874b, this.d, this.f23875c);
                return;
            case 6:
                j8 j8Var6 = this.f23874b;
                j8Var6.v0(this.d, true, new g7(j8Var6, this.f23875c, 4), false);
                return;
            case 7:
                j8.L(this.f23874b, this.d, this.f23875c);
                return;
            default:
                this.f23874b.u0(this.d);
                this.f23875c.u();
                return;
        }
    }

    public f7(j8 j8Var, o70 o70Var, MessageObject messageObject, int i10) {
        this.f23873a = i10;
        this.f23874b = j8Var;
        this.f23875c = o70Var;
        this.d = messageObject;
    }
}
