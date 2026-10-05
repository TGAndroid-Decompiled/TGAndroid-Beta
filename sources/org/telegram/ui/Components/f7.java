package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class f7 implements Runnable {
    public final int f26398a;
    public final j8 f26399b;
    public final b80 f26400c;
    public final MessageObject d;

    public f7(j8 j8Var, MessageObject messageObject, b80 b80Var, int i10) {
        this.f26398a = i10;
        this.f26399b = j8Var;
        this.d = messageObject;
        this.f26400c = b80Var;
    }

    @Override
    public final void run() {
        switch (this.f26398a) {
            case 0:
                j8 j8Var = this.f26399b;
                j8Var.getClass();
                this.f26400c.u();
                j8Var.q0(this.d);
                return;
            case 1:
                j8 j8Var2 = this.f26399b;
                j8Var2.getClass();
                this.f26400c.u();
                j8Var2.z0(this.d);
                return;
            case 2:
                j8 j8Var3 = this.f26399b;
                MessageObject messageObject = this.d;
                j8Var3.v0(messageObject, false, new f7(j8Var3, messageObject, this.f26400c, 5), false);
                return;
            case 3:
                j8 j8Var4 = this.f26399b;
                j8Var4.getClass();
                this.f26400c.u();
                j8Var4.q0(this.d);
                return;
            case 4:
                j8 j8Var5 = this.f26399b;
                j8Var5.getClass();
                this.f26400c.u();
                j8Var5.z0(this.d);
                return;
            case 5:
                j8.v(this.f26399b, this.d, this.f26400c);
                return;
            case 6:
                j8 j8Var6 = this.f26399b;
                j8Var6.v0(this.d, true, new g7(j8Var6, this.f26400c, 4), false);
                return;
            case 7:
                j8.J(this.f26399b, this.d, this.f26400c);
                return;
            default:
                this.f26399b.u0(this.d);
                this.f26400c.u();
                return;
        }
    }

    public f7(j8 j8Var, b80 b80Var, MessageObject messageObject, int i10) {
        this.f26398a = i10;
        this.f26399b = j8Var;
        this.f26400c = b80Var;
        this.d = messageObject;
    }
}
