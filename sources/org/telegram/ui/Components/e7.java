package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class e7 implements Runnable {
    public final int f25977a;
    public final i8 f25978b;
    public final h80 f25979c;
    public final MessageObject d;

    public e7(i8 i8Var, MessageObject messageObject, h80 h80Var, int i10) {
        this.f25977a = i10;
        this.f25978b = i8Var;
        this.d = messageObject;
        this.f25979c = h80Var;
    }

    @Override
    public final void run() {
        switch (this.f25977a) {
            case 0:
                i8 i8Var = this.f25978b;
                i8Var.getClass();
                this.f25979c.u();
                i8Var.x0(this.d);
                return;
            case 1:
                i8 i8Var2 = this.f25978b;
                i8Var2.getClass();
                this.f25979c.u();
                i8Var2.G0(this.d);
                return;
            case 2:
                i8 i8Var3 = this.f25978b;
                MessageObject messageObject = this.d;
                i8Var3.C0(messageObject, false, new e7(i8Var3, messageObject, this.f25979c, 5), false);
                return;
            case 3:
                i8 i8Var4 = this.f25978b;
                i8Var4.getClass();
                this.f25979c.u();
                i8Var4.x0(this.d);
                return;
            case 4:
                i8 i8Var5 = this.f25978b;
                i8Var5.getClass();
                this.f25979c.u();
                i8Var5.G0(this.d);
                return;
            case 5:
                i8.q(this.f25978b, this.d, this.f25979c);
                return;
            case 6:
                i8 i8Var6 = this.f25978b;
                i8Var6.C0(this.d, true, new f7(i8Var6, this.f25979c, 4), false);
                return;
            case 7:
                i8.I(this.f25978b, this.d, this.f25979c);
                return;
            default:
                this.f25978b.B0(this.d);
                this.f25979c.u();
                return;
        }
    }

    public e7(i8 i8Var, h80 h80Var, MessageObject messageObject, int i10) {
        this.f25977a = i10;
        this.f25978b = i8Var;
        this.f25979c = h80Var;
        this.d = messageObject;
    }
}
