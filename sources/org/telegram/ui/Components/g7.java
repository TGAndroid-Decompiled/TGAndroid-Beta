package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class g7 implements Runnable {
    public final int f26315a;
    public final k8 f26316b;
    public final n70 f26317c;
    public final MessageObject d;

    public g7(k8 k8Var, MessageObject messageObject, n70 n70Var, int i10) {
        this.f26315a = i10;
        this.f26316b = k8Var;
        this.d = messageObject;
        this.f26317c = n70Var;
    }

    @Override
    public final void run() {
        switch (this.f26315a) {
            case 0:
                k8 k8Var = this.f26316b;
                k8Var.getClass();
                this.f26317c.u();
                k8Var.q0(this.d);
                return;
            case 1:
                k8 k8Var2 = this.f26316b;
                k8Var2.getClass();
                this.f26317c.u();
                k8Var2.z0(this.d);
                return;
            case 2:
                k8 k8Var3 = this.f26316b;
                MessageObject messageObject = this.d;
                k8Var3.v0(messageObject, false, new g7(k8Var3, messageObject, this.f26317c, 5), false);
                return;
            case 3:
                k8 k8Var4 = this.f26316b;
                k8Var4.getClass();
                this.f26317c.u();
                k8Var4.q0(this.d);
                return;
            case 4:
                k8 k8Var5 = this.f26316b;
                k8Var5.getClass();
                this.f26317c.u();
                k8Var5.z0(this.d);
                return;
            case 5:
                k8.v(this.f26316b, this.d, this.f26317c);
                return;
            case 6:
                k8 k8Var6 = this.f26316b;
                k8Var6.v0(this.d, true, new h7(k8Var6, this.f26317c, 4), false);
                return;
            case 7:
                k8.L(this.f26316b, this.d, this.f26317c);
                return;
            default:
                this.f26316b.u0(this.d);
                this.f26317c.u();
                return;
        }
    }

    public g7(k8 k8Var, n70 n70Var, MessageObject messageObject, int i10) {
        this.f26315a = i10;
        this.f26316b = k8Var;
        this.f26317c = n70Var;
        this.d = messageObject;
    }
}
