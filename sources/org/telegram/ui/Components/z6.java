package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class z6 implements Runnable {
    public final int f35199a;
    public final c8 f35200b;
    public final x60 f35201c;
    public final MessageObject d;

    public z6(c8 c8Var, MessageObject messageObject, x60 x60Var, int i9) {
        this.f35199a = i9;
        this.f35200b = c8Var;
        this.d = messageObject;
        this.f35201c = x60Var;
    }

    @Override
    public final void run() {
        switch (this.f35199a) {
            case 0:
                c8 c8Var = this.f35200b;
                c8Var.getClass();
                this.f35201c.u();
                c8Var.p0(this.d);
                return;
            case 1:
                c8 c8Var2 = this.f35200b;
                c8Var2.getClass();
                this.f35201c.u();
                c8Var2.y0(this.d);
                return;
            case 2:
                c8 c8Var3 = this.f35200b;
                MessageObject messageObject = this.d;
                c8Var3.u0(messageObject, false, new z6(c8Var3, messageObject, this.f35201c, 5), false);
                return;
            case 3:
                c8 c8Var4 = this.f35200b;
                c8Var4.getClass();
                this.f35201c.u();
                c8Var4.p0(this.d);
                return;
            case 4:
                c8 c8Var5 = this.f35200b;
                c8Var5.getClass();
                this.f35201c.u();
                c8Var5.y0(this.d);
                return;
            case 5:
                c8.v(this.f35200b, this.d, this.f35201c);
                return;
            case 6:
                c8 c8Var6 = this.f35200b;
                c8Var6.u0(this.d, true, new a7(c8Var6, this.f35201c, 4), false);
                return;
            case 7:
                c8.K(this.f35200b, this.d, this.f35201c);
                return;
            default:
                this.f35200b.t0(this.d);
                this.f35201c.u();
                return;
        }
    }

    public z6(c8 c8Var, x60 x60Var, MessageObject messageObject, int i9) {
        this.f35199a = i9;
        this.f35200b = c8Var;
        this.f35201c = x60Var;
        this.d = messageObject;
    }
}
