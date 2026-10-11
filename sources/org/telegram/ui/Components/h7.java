package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class h7 implements Runnable {
    public final int f26919a;
    public final l8 f26920b;
    public final q80 f26921c;
    public final MessageObject d;

    public h7(l8 l8Var, MessageObject messageObject, q80 q80Var, int i10) {
        this.f26919a = i10;
        this.f26920b = l8Var;
        this.d = messageObject;
        this.f26921c = q80Var;
    }

    @Override
    public final void run() {
        switch (this.f26919a) {
            case 0:
                l8 l8Var = this.f26920b;
                l8Var.getClass();
                this.f26921c.u();
                l8Var.r0(this.d);
                return;
            case 1:
                l8 l8Var2 = this.f26920b;
                l8Var2.getClass();
                this.f26921c.u();
                l8Var2.A0(this.d);
                return;
            case 2:
                l8 l8Var3 = this.f26920b;
                MessageObject messageObject = this.d;
                l8Var3.w0(messageObject, false, new h7(l8Var3, messageObject, this.f26921c, 5), false);
                return;
            case 3:
                l8 l8Var4 = this.f26920b;
                l8Var4.getClass();
                this.f26921c.u();
                l8Var4.r0(this.d);
                return;
            case 4:
                l8 l8Var5 = this.f26920b;
                l8Var5.getClass();
                this.f26921c.u();
                l8Var5.A0(this.d);
                return;
            case 5:
                l8.x(this.f26920b, this.d, this.f26921c);
                return;
            case 6:
                l8 l8Var6 = this.f26920b;
                l8Var6.w0(this.d, true, new i7(l8Var6, this.f26921c, 4), false);
                return;
            case 7:
                l8.M(this.f26920b, this.d, this.f26921c);
                return;
            default:
                this.f26920b.v0(this.d);
                this.f26921c.u();
                return;
        }
    }

    public h7(l8 l8Var, q80 q80Var, MessageObject messageObject, int i10) {
        this.f26919a = i10;
        this.f26920b = l8Var;
        this.f26921c = q80Var;
        this.d = messageObject;
    }
}
