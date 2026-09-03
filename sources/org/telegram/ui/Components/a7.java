package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class a7 implements Runnable {
    public final int f23328a;
    public final c8 f23329b;
    public final p70 f23330c;
    public final MessageObject d;

    public a7(c8 c8Var, MessageObject messageObject, p70 p70Var, int i10) {
        this.f23328a = i10;
        this.f23329b = c8Var;
        this.d = messageObject;
        this.f23330c = p70Var;
    }

    @Override
    public final void run() {
        switch (this.f23328a) {
            case 0:
                c8 c8Var = this.f23329b;
                c8Var.getClass();
                this.f23330c.u();
                c8Var.q0(this.d);
                return;
            case 1:
                c8 c8Var2 = this.f23329b;
                c8Var2.getClass();
                this.f23330c.u();
                c8Var2.z0(this.d);
                return;
            case 2:
                c8 c8Var3 = this.f23329b;
                MessageObject messageObject = this.d;
                c8Var3.v0(messageObject, false, new a7(c8Var3, messageObject, this.f23330c, 5), false);
                return;
            case 3:
                c8 c8Var4 = this.f23329b;
                c8Var4.getClass();
                this.f23330c.u();
                c8Var4.q0(this.d);
                return;
            case 4:
                c8 c8Var5 = this.f23329b;
                c8Var5.getClass();
                this.f23330c.u();
                c8Var5.z0(this.d);
                return;
            case 5:
                c8.v(this.f23329b, this.d, this.f23330c);
                return;
            case 6:
                c8 c8Var6 = this.f23329b;
                c8Var6.v0(this.d, true, new b7(c8Var6, this.f23330c, 4), false);
                return;
            case 7:
                c8.K(this.f23329b, this.d, this.f23330c);
                return;
            default:
                this.f23329b.u0(this.d);
                this.f23330c.u();
                return;
        }
    }

    public a7(c8 c8Var, p70 p70Var, MessageObject messageObject, int i10) {
        this.f23328a = i10;
        this.f23329b = c8Var;
        this.f23330c = p70Var;
        this.d = messageObject;
    }
}
