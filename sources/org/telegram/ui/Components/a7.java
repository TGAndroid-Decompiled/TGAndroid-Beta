package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class a7 implements Runnable {
    public final int f25169a;
    public final c8 f25170b;
    public final q70 f25171c;
    public final MessageObject d;

    public a7(c8 c8Var, MessageObject messageObject, q70 q70Var, int i10) {
        this.f25169a = i10;
        this.f25170b = c8Var;
        this.d = messageObject;
        this.f25171c = q70Var;
    }

    @Override
    public final void run() {
        switch (this.f25169a) {
            case 0:
                c8 c8Var = this.f25170b;
                c8Var.getClass();
                this.f25171c.u();
                c8Var.q0(this.d);
                return;
            case 1:
                c8 c8Var2 = this.f25170b;
                c8Var2.getClass();
                this.f25171c.u();
                c8Var2.z0(this.d);
                return;
            case 2:
                c8 c8Var3 = this.f25170b;
                MessageObject messageObject = this.d;
                c8Var3.v0(messageObject, false, new a7(c8Var3, messageObject, this.f25171c, 5), false);
                return;
            case 3:
                c8 c8Var4 = this.f25170b;
                c8Var4.getClass();
                this.f25171c.u();
                c8Var4.q0(this.d);
                return;
            case 4:
                c8 c8Var5 = this.f25170b;
                c8Var5.getClass();
                this.f25171c.u();
                c8Var5.z0(this.d);
                return;
            case 5:
                c8.v(this.f25170b, this.d, this.f25171c);
                return;
            case 6:
                c8 c8Var6 = this.f25170b;
                c8Var6.v0(this.d, true, new b7(c8Var6, this.f25171c, 4), false);
                return;
            case 7:
                c8.K(this.f25170b, this.d, this.f25171c);
                return;
            default:
                this.f25170b.u0(this.d);
                this.f25171c.u();
                return;
        }
    }

    public a7(c8 c8Var, q70 q70Var, MessageObject messageObject, int i10) {
        this.f25169a = i10;
        this.f25170b = c8Var;
        this.f25171c = q70Var;
        this.d = messageObject;
    }
}
