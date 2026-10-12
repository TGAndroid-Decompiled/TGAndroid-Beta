package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class i7 implements Runnable {
    public final int f25895a;
    public final m8 f25896b;
    public final m80 f25897c;
    public final MessageObject d;

    public i7(m8 m8Var, MessageObject messageObject, m80 m80Var, int i10) {
        this.f25895a = i10;
        this.f25896b = m8Var;
        this.d = messageObject;
        this.f25897c = m80Var;
    }

    @Override
    public final void run() {
        switch (this.f25895a) {
            case 0:
                m8 m8Var = this.f25896b;
                m8Var.getClass();
                this.f25897c.u();
                m8Var.r0(this.d);
                return;
            case 1:
                m8 m8Var2 = this.f25896b;
                m8Var2.getClass();
                this.f25897c.u();
                m8Var2.A0(this.d);
                return;
            case 2:
                m8 m8Var3 = this.f25896b;
                MessageObject messageObject = this.d;
                m8Var3.w0(messageObject, false, new i7(m8Var3, messageObject, this.f25897c, 5), false);
                return;
            case 3:
                m8 m8Var4 = this.f25896b;
                m8Var4.getClass();
                this.f25897c.u();
                m8Var4.r0(this.d);
                return;
            case 4:
                m8 m8Var5 = this.f25896b;
                m8Var5.getClass();
                this.f25897c.u();
                m8Var5.A0(this.d);
                return;
            case 5:
                m8.x(this.f25896b, this.d, this.f25897c);
                return;
            case 6:
                m8 m8Var6 = this.f25896b;
                m8Var6.w0(this.d, true, new j7(m8Var6, this.f25897c, 4), false);
                return;
            case 7:
                m8.M(this.f25896b, this.d, this.f25897c);
                return;
            default:
                this.f25896b.v0(this.d);
                this.f25897c.u();
                return;
        }
    }

    public i7(m8 m8Var, m80 m80Var, MessageObject messageObject, int i10) {
        this.f25895a = i10;
        this.f25896b = m8Var;
        this.f25897c = m80Var;
        this.d = messageObject;
    }
}
