package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class g7 implements Runnable {
    public final int f26520a;
    public final k8 f26521b;
    public final i80 f26522c;
    public final MessageObject d;

    public g7(k8 k8Var, MessageObject messageObject, i80 i80Var, int i10) {
        this.f26520a = i10;
        this.f26521b = k8Var;
        this.d = messageObject;
        this.f26522c = i80Var;
    }

    @Override
    public final void run() {
        switch (this.f26520a) {
            case 0:
                k8 k8Var = this.f26521b;
                k8Var.getClass();
                this.f26522c.u();
                k8Var.r0(this.d);
                return;
            case 1:
                k8 k8Var2 = this.f26521b;
                k8Var2.getClass();
                this.f26522c.u();
                k8Var2.A0(this.d);
                return;
            case 2:
                k8 k8Var3 = this.f26521b;
                MessageObject messageObject = this.d;
                k8Var3.w0(messageObject, false, new g7(k8Var3, messageObject, this.f26522c, 5), false);
                return;
            case 3:
                k8 k8Var4 = this.f26521b;
                k8Var4.getClass();
                this.f26522c.u();
                k8Var4.r0(this.d);
                return;
            case 4:
                k8 k8Var5 = this.f26521b;
                k8Var5.getClass();
                this.f26522c.u();
                k8Var5.A0(this.d);
                return;
            case 5:
                k8.x(this.f26521b, this.d, this.f26522c);
                return;
            case 6:
                k8 k8Var6 = this.f26521b;
                k8Var6.w0(this.d, true, new h7(k8Var6, this.f26522c, 4), false);
                return;
            case 7:
                k8.M(this.f26521b, this.d, this.f26522c);
                return;
            default:
                this.f26521b.v0(this.d);
                this.f26522c.u();
                return;
        }
    }

    public g7(k8 k8Var, i80 i80Var, MessageObject messageObject, int i10) {
        this.f26520a = i10;
        this.f26521b = k8Var;
        this.f26522c = i80Var;
        this.d = messageObject;
    }
}
