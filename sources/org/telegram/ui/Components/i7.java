package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class i7 implements Runnable {
    public final int f25571a;
    public final m8 f25572b;
    public final l80 f25573c;
    public final MessageObject d;

    public i7(m8 m8Var, MessageObject messageObject, l80 l80Var, int i10) {
        this.f25571a = i10;
        this.f25572b = m8Var;
        this.d = messageObject;
        this.f25573c = l80Var;
    }

    @Override
    public final void run() {
        switch (this.f25571a) {
            case 0:
                m8 m8Var = this.f25572b;
                m8Var.getClass();
                this.f25573c.u();
                m8Var.r0(this.d);
                return;
            case 1:
                m8 m8Var2 = this.f25572b;
                m8Var2.getClass();
                this.f25573c.u();
                m8Var2.A0(this.d);
                return;
            case 2:
                m8 m8Var3 = this.f25572b;
                MessageObject messageObject = this.d;
                m8Var3.w0(messageObject, false, new i7(m8Var3, messageObject, this.f25573c, 5), false);
                return;
            case 3:
                m8 m8Var4 = this.f25572b;
                m8Var4.getClass();
                this.f25573c.u();
                m8Var4.r0(this.d);
                return;
            case 4:
                m8 m8Var5 = this.f25572b;
                m8Var5.getClass();
                this.f25573c.u();
                m8Var5.A0(this.d);
                return;
            case 5:
                m8.x(this.f25572b, this.d, this.f25573c);
                return;
            case 6:
                m8 m8Var6 = this.f25572b;
                m8Var6.w0(this.d, true, new j7(m8Var6, this.f25573c, 4), false);
                return;
            case 7:
                m8.M(this.f25572b, this.d, this.f25573c);
                return;
            default:
                this.f25572b.v0(this.d);
                this.f25573c.u();
                return;
        }
    }

    public i7(m8 m8Var, l80 l80Var, MessageObject messageObject, int i10) {
        this.f25571a = i10;
        this.f25572b = m8Var;
        this.f25573c = l80Var;
        this.d = messageObject;
    }
}
