package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ya implements Runnable {
    public final int f17047a;
    public final MessagesController f17048b;
    public final TLObject f17049c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final org.telegram.ui.ActionBar.h6 e;

    public ya(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        this.f17047a = i10;
        this.f17048b = messagesController;
        this.f17049c = tLObject;
        this.d = i6Var;
        this.e = h6Var;
    }

    @Override
    public final void run() {
        switch (this.f17047a) {
            case 0:
                this.f17048b.lambda$didReceivedNotification$46(this.f17049c, this.d, this.e);
                return;
            default:
                this.f17048b.lambda$didReceivedNotification$48(this.f17049c, this.d, this.e);
                return;
        }
    }
}
