package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class f7 implements Runnable {
    public final int f24221a;
    public final j8 f24222b;
    public final b80 f24223c;
    public final MessageObject d;

    public f7(j8 j8Var, MessageObject messageObject, b80 b80Var, int i10) {
        this.f24221a = i10;
        this.f24222b = j8Var;
        this.d = messageObject;
        this.f24223c = b80Var;
    }

    @Override
    public final void run() {
        switch (this.f24221a) {
            case 0:
                j8 j8Var = this.f24222b;
                j8Var.getClass();
                this.f24223c.u();
                j8Var.q0(this.d);
                return;
            case 1:
                j8 j8Var2 = this.f24222b;
                j8Var2.getClass();
                this.f24223c.u();
                j8Var2.z0(this.d);
                return;
            case 2:
                j8 j8Var3 = this.f24222b;
                MessageObject messageObject = this.d;
                j8Var3.v0(messageObject, false, new f7(j8Var3, messageObject, this.f24223c, 5), false);
                return;
            case 3:
                j8 j8Var4 = this.f24222b;
                j8Var4.getClass();
                this.f24223c.u();
                j8Var4.q0(this.d);
                return;
            case 4:
                j8 j8Var5 = this.f24222b;
                j8Var5.getClass();
                this.f24223c.u();
                j8Var5.z0(this.d);
                return;
            case 5:
                j8.v(this.f24222b, this.d, this.f24223c);
                return;
            case 6:
                j8 j8Var6 = this.f24222b;
                j8Var6.v0(this.d, true, new g7(j8Var6, this.f24223c, 4), false);
                return;
            case 7:
                j8.L(this.f24222b, this.d, this.f24223c);
                return;
            default:
                this.f24222b.u0(this.d);
                this.f24223c.u();
                return;
        }
    }

    public f7(j8 j8Var, b80 b80Var, MessageObject messageObject, int i10) {
        this.f24221a = i10;
        this.f24222b = j8Var;
        this.f24223c = b80Var;
        this.d = messageObject;
    }
}
