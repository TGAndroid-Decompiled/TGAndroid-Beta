package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class d7 implements Runnable {
    public final int f23223a;
    public final h8 f23224b;
    public final n70 f23225c;
    public final MessageObject d;

    public d7(h8 h8Var, MessageObject messageObject, n70 n70Var, int i10) {
        this.f23223a = i10;
        this.f23224b = h8Var;
        this.d = messageObject;
        this.f23225c = n70Var;
    }

    @Override
    public final void run() {
        switch (this.f23223a) {
            case 0:
                h8 h8Var = this.f23224b;
                h8Var.getClass();
                this.f23225c.u();
                h8Var.q0(this.d);
                return;
            case 1:
                h8 h8Var2 = this.f23224b;
                h8Var2.getClass();
                this.f23225c.u();
                h8Var2.z0(this.d);
                return;
            case 2:
                h8 h8Var3 = this.f23224b;
                MessageObject messageObject = this.d;
                h8Var3.v0(messageObject, false, new d7(h8Var3, messageObject, this.f23225c, 5), false);
                return;
            case 3:
                h8 h8Var4 = this.f23224b;
                h8Var4.getClass();
                this.f23225c.u();
                h8Var4.q0(this.d);
                return;
            case 4:
                h8 h8Var5 = this.f23224b;
                h8Var5.getClass();
                this.f23225c.u();
                h8Var5.z0(this.d);
                return;
            case 5:
                h8.v(this.f23224b, this.d, this.f23225c);
                return;
            case 6:
                h8 h8Var6 = this.f23224b;
                h8Var6.v0(this.d, true, new e7(h8Var6, this.f23225c, 4), false);
                return;
            case 7:
                h8.L(this.f23224b, this.d, this.f23225c);
                return;
            default:
                this.f23224b.u0(this.d);
                this.f23225c.u();
                return;
        }
    }

    public d7(h8 h8Var, n70 n70Var, MessageObject messageObject, int i10) {
        this.f23223a = i10;
        this.f23224b = h8Var;
        this.f23225c = n70Var;
        this.d = messageObject;
    }
}
