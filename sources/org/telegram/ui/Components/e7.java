package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class e7 implements Runnable {
    public final int f27936a;
    public final g8 f27937b;
    public final j70 f27938c;
    public final MessageObject d;

    public e7(g8 g8Var, MessageObject messageObject, j70 j70Var, int i10) {
        this.f27936a = i10;
        this.f27937b = g8Var;
        this.d = messageObject;
        this.f27938c = j70Var;
    }

    @Override
    public final void run() {
        switch (this.f27936a) {
            case 0:
                g8 g8Var = this.f27937b;
                g8Var.getClass();
                this.f27938c.u();
                g8Var.q0(this.d);
                return;
            case 1:
                g8 g8Var2 = this.f27937b;
                g8Var2.getClass();
                this.f27938c.u();
                g8Var2.z0(this.d);
                return;
            case 2:
                g8 g8Var3 = this.f27937b;
                MessageObject messageObject = this.d;
                g8Var3.v0(messageObject, false, new e7(g8Var3, messageObject, this.f27938c, 5), false);
                return;
            case 3:
                g8 g8Var4 = this.f27937b;
                g8Var4.getClass();
                this.f27938c.u();
                g8Var4.q0(this.d);
                return;
            case 4:
                g8 g8Var5 = this.f27937b;
                g8Var5.getClass();
                this.f27938c.u();
                g8Var5.z0(this.d);
                return;
            case 5:
                g8.v(this.f27937b, this.d, this.f27938c);
                return;
            case 6:
                g8 g8Var6 = this.f27937b;
                g8Var6.v0(this.d, true, new f7(g8Var6, this.f27938c, 4), false);
                return;
            case 7:
                g8.K(this.f27937b, this.d, this.f27938c);
                return;
            default:
                this.f27937b.u0(this.d);
                this.f27938c.u();
                return;
        }
    }

    public e7(g8 g8Var, j70 j70Var, MessageObject messageObject, int i10) {
        this.f27936a = i10;
        this.f27937b = g8Var;
        this.f27938c = j70Var;
        this.d = messageObject;
    }
}
