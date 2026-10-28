package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class i7 implements Runnable {
    public final int f29229a;
    public final m8 f29230b;
    public final l80 f29231c;
    public final MessageObject d;

    public i7(m8 m8Var, MessageObject messageObject, l80 l80Var, int i10) {
        this.f29229a = i10;
        this.f29230b = m8Var;
        this.d = messageObject;
        this.f29231c = l80Var;
    }

    @Override
    public final void run() {
        switch (this.f29229a) {
            case 0:
                m8 m8Var = this.f29230b;
                m8Var.getClass();
                this.f29231c.u();
                m8Var.x0(this.d);
                return;
            case 1:
                m8 m8Var2 = this.f29230b;
                m8Var2.getClass();
                this.f29231c.u();
                m8Var2.G0(this.d);
                return;
            case 2:
                m8 m8Var3 = this.f29230b;
                MessageObject messageObject = this.d;
                m8Var3.C0(messageObject, false, new i7(m8Var3, messageObject, this.f29231c, 5), false);
                return;
            case 3:
                m8 m8Var4 = this.f29230b;
                m8Var4.getClass();
                this.f29231c.u();
                m8Var4.x0(this.d);
                return;
            case 4:
                m8 m8Var5 = this.f29230b;
                m8Var5.getClass();
                this.f29231c.u();
                m8Var5.G0(this.d);
                return;
            case 5:
                m8.p(this.f29230b, this.d, this.f29231c);
                return;
            case 6:
                m8 m8Var6 = this.f29230b;
                m8Var6.C0(this.d, true, new j7(m8Var6, this.f29231c, 4), false);
                return;
            case 7:
                m8.I(this.f29230b, this.d, this.f29231c);
                return;
            default:
                this.f29230b.B0(this.d);
                this.f29231c.u();
                return;
        }
    }

    public i7(m8 m8Var, l80 l80Var, MessageObject messageObject, int i10) {
        this.f29229a = i10;
        this.f29230b = m8Var;
        this.f29231c = l80Var;
        this.d = messageObject;
    }
}
