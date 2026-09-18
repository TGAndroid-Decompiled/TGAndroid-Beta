package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class f7 implements Runnable {
    public final int f24032a;
    public final j8 f24033b;
    public final w70 f24034c;
    public final MessageObject d;

    public f7(j8 j8Var, MessageObject messageObject, w70 w70Var, int i10) {
        this.f24032a = i10;
        this.f24033b = j8Var;
        this.d = messageObject;
        this.f24034c = w70Var;
    }

    @Override
    public final void run() {
        switch (this.f24032a) {
            case 0:
                j8 j8Var = this.f24033b;
                j8Var.getClass();
                this.f24034c.u();
                j8Var.q0(this.d);
                return;
            case 1:
                j8 j8Var2 = this.f24033b;
                j8Var2.getClass();
                this.f24034c.u();
                j8Var2.z0(this.d);
                return;
            case 2:
                j8 j8Var3 = this.f24033b;
                MessageObject messageObject = this.d;
                j8Var3.v0(messageObject, false, new f7(j8Var3, messageObject, this.f24034c, 5), false);
                return;
            case 3:
                j8 j8Var4 = this.f24033b;
                j8Var4.getClass();
                this.f24034c.u();
                j8Var4.q0(this.d);
                return;
            case 4:
                j8 j8Var5 = this.f24033b;
                j8Var5.getClass();
                this.f24034c.u();
                j8Var5.z0(this.d);
                return;
            case 5:
                j8.v(this.f24033b, this.d, this.f24034c);
                return;
            case 6:
                j8 j8Var6 = this.f24033b;
                j8Var6.v0(this.d, true, new g7(j8Var6, this.f24034c, 4), false);
                return;
            case 7:
                j8.L(this.f24033b, this.d, this.f24034c);
                return;
            default:
                this.f24033b.u0(this.d);
                this.f24034c.u();
                return;
        }
    }

    public f7(j8 j8Var, w70 w70Var, MessageObject messageObject, int i10) {
        this.f24032a = i10;
        this.f24033b = j8Var;
        this.f24034c = w70Var;
        this.d = messageObject;
    }
}
