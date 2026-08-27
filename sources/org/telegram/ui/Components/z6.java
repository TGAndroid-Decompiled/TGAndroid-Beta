package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

public final class z6 implements Runnable {

    public final int f35156a;

    public final b8 f35157b;

    public final b70 f35158c;
    public final MessageObject d;

    public z6(b8 b8Var, MessageObject messageObject, b70 b70Var, int i10) {
        this.f35156a = i10;
        this.f35157b = b8Var;
        this.d = messageObject;
        this.f35158c = b70Var;
    }

    @Override
    public final void run() {
        switch (this.f35156a) {
            case 0:
                b8 b8Var = this.f35157b;
                b8Var.getClass();
                this.f35158c.u();
                b8Var.q0(this.d);
                break;
            case 1:
                b8 b8Var2 = this.f35157b;
                b8Var2.getClass();
                this.f35158c.u();
                b8Var2.z0(this.d);
                break;
            case 2:
                b8 b8Var3 = this.f35157b;
                MessageObject messageObject = this.d;
                b8Var3.v0(messageObject, false, new z6(b8Var3, messageObject, this.f35158c, 5), false);
                break;
            case 3:
                b8 b8Var4 = this.f35157b;
                b8Var4.getClass();
                this.f35158c.u();
                b8Var4.q0(this.d);
                break;
            case 4:
                b8 b8Var5 = this.f35157b;
                b8Var5.getClass();
                this.f35158c.u();
                b8Var5.z0(this.d);
                break;
            case 5:
                b8.w(this.f35157b, this.d, this.f35158c);
                break;
            case 6:
                b8 b8Var6 = this.f35157b;
                b8Var6.v0(this.d, true, new a7(b8Var6, this.f35158c, 4), false);
                break;
            case 7:
                b8.L(this.f35157b, this.d, this.f35158c);
                break;
            default:
                this.f35157b.u0(this.d);
                this.f35158c.u();
                break;
        }
    }

    public z6(b8 b8Var, b70 b70Var, MessageObject messageObject, int i10) {
        this.f35156a = i10;
        this.f35157b = b8Var;
        this.f35158c = b70Var;
        this.d = messageObject;
    }
}
