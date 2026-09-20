package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class e7 implements Runnable {
    public final int f23752a;
    public final i8 f23753b;
    public final v70 f23754c;
    public final MessageObject d;

    public e7(i8 i8Var, MessageObject messageObject, v70 v70Var, int i10) {
        this.f23752a = i10;
        this.f23753b = i8Var;
        this.d = messageObject;
        this.f23754c = v70Var;
    }

    @Override
    public final void run() {
        switch (this.f23752a) {
            case 0:
                i8 i8Var = this.f23753b;
                i8Var.getClass();
                this.f23754c.u();
                i8Var.q0(this.d);
                return;
            case 1:
                i8 i8Var2 = this.f23753b;
                i8Var2.getClass();
                this.f23754c.u();
                i8Var2.z0(this.d);
                return;
            case 2:
                i8 i8Var3 = this.f23753b;
                MessageObject messageObject = this.d;
                i8Var3.v0(messageObject, false, new e7(i8Var3, messageObject, this.f23754c, 5), false);
                return;
            case 3:
                i8 i8Var4 = this.f23753b;
                i8Var4.getClass();
                this.f23754c.u();
                i8Var4.q0(this.d);
                return;
            case 4:
                i8 i8Var5 = this.f23753b;
                i8Var5.getClass();
                this.f23754c.u();
                i8Var5.z0(this.d);
                return;
            case 5:
                i8.v(this.f23753b, this.d, this.f23754c);
                return;
            case 6:
                i8 i8Var6 = this.f23753b;
                i8Var6.v0(this.d, true, new f7(i8Var6, this.f23754c, 4), false);
                return;
            case 7:
                i8.L(this.f23753b, this.d, this.f23754c);
                return;
            default:
                this.f23753b.u0(this.d);
                this.f23754c.u();
                return;
        }
    }

    public e7(i8 i8Var, v70 v70Var, MessageObject messageObject, int i10) {
        this.f23752a = i10;
        this.f23753b = i8Var;
        this.f23754c = v70Var;
        this.d = messageObject;
    }
}
