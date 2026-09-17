package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nh0 implements Runnable {
    public final int f36107a;
    public final ai0 f36108b;
    public final TLRPC.TL_chatInviteExported f36109c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f36110f;

    public nh0(ai0 ai0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, int i10) {
        this.f36107a = i10;
        this.f36108b = ai0Var;
        this.f36109c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f36110f = z10;
    }

    @Override
    public final void run() {
        switch (this.f36107a) {
            case 0:
                ai0 ai0Var = this.f36108b;
                ai0Var.getNotificationCenter().doOnIdle(new nh0(ai0Var, this.f36109c, this.d, this.e, this.f36110f, 1));
                return;
            default:
                ai0.U(this.f36108b, this.f36109c, this.d, this.e, this.f36110f);
                return;
        }
    }
}
