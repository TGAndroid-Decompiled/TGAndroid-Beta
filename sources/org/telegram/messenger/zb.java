package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.tq0;
import org.telegram.ui.xj0;
import org.telegram.ui.zj0;
public final class zb implements RequestDelegate {
    public final int f21984a = 0;
    public final int f21985b;
    public final boolean f21986c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f21987f;

    public zb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.d = messagesController;
        this.f21985b = i10;
        this.e = chat;
        this.f21987f = user;
        this.f21986c = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21984a) {
            case 0:
                boolean z10 = this.f21986c;
                ((MessagesController) this.d).lambda$pinMessage$129(this.f21985b, (TLRPC.Chat) this.e, (TLRPC.User) this.f21987f, z10, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new li.p2((zj0) this.d, (xj0) this.e, this.f21985b, (String) this.f21987f, this.f21986c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new li.p2((tq0) this.d, (String) this.e, this.f21985b, tLObject, this.f21986c, (TLRPC.User) this.f21987f));
                return;
        }
    }

    public zb(zj0 zj0Var, xj0 xj0Var, int i10, String str, boolean z10) {
        this.d = zj0Var;
        this.e = xj0Var;
        this.f21985b = i10;
        this.f21987f = str;
        this.f21986c = z10;
    }

    public zb(tq0 tq0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.d = tq0Var;
        this.e = str;
        this.f21985b = i10;
        this.f21986c = z10;
        this.f21987f = user;
    }
}
