package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class e7 implements Runnable {
    public final int f22604a;
    public final j8 f22605b;
    public final w70 f22606c;
    public final MessageObject d;

    public e7(j8 j8Var, MessageObject messageObject, w70 w70Var, int i10) {
        this.f22604a = i10;
        this.f22605b = j8Var;
        this.d = messageObject;
        this.f22606c = w70Var;
    }

    @Override
    public final void run() {
        switch (this.f22604a) {
            case 0:
                j8 j8Var = this.f22605b;
                j8Var.getClass();
                this.f22606c.u();
                j8Var.q0(this.d);
                return;
            case 1:
                j8 j8Var2 = this.f22605b;
                j8Var2.getClass();
                this.f22606c.u();
                j8Var2.z0(this.d);
                return;
            case 2:
                j8 j8Var3 = this.f22605b;
                MessageObject messageObject = this.d;
                j8Var3.v0(messageObject, false, new e7(j8Var3, messageObject, this.f22606c, 5), false);
                return;
            case 3:
                j8 j8Var4 = this.f22605b;
                j8Var4.getClass();
                this.f22606c.u();
                j8Var4.q0(this.d);
                return;
            case 4:
                j8 j8Var5 = this.f22605b;
                j8Var5.getClass();
                this.f22606c.u();
                j8Var5.z0(this.d);
                return;
            case 5:
                j8.v(this.f22605b, this.d, this.f22606c);
                return;
            case 6:
                j8 j8Var6 = this.f22605b;
                j8Var6.v0(this.d, true, new f7(j8Var6, this.f22606c, 4), false);
                return;
            case 7:
                j8.L(this.f22605b, this.d, this.f22606c);
                return;
            default:
                this.f22605b.u0(this.d);
                this.f22606c.u();
                return;
        }
    }

    public e7(j8 j8Var, w70 w70Var, MessageObject messageObject, int i10) {
        this.f22604a = i10;
        this.f22605b = j8Var;
        this.f22606c = w70Var;
        this.d = messageObject;
    }
}
