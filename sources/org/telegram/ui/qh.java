package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class qh implements Runnable {
    public final int f40810a = 1;
    public final sn f40811b;
    public final int f40812c;
    public final MessageObject d;

    public qh(sn snVar, int i10, MessageObject messageObject) {
        this.f40811b = snVar;
        this.f40812c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f40810a) {
            case 0:
                this.f40811b.f41766z4 = null;
                this.d.messageOwner.replies.read_max_id = this.f40812c;
                return;
            default:
                sn snVar = this.f40811b;
                org.telegram.ui.Components.xc.a0(snVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f40812c).disableAds(false);
                MessageObject messageObject = this.d;
                snVar.Ja(messageObject);
                snVar.La(messageObject);
                return;
        }
    }

    public qh(sn snVar, MessageObject messageObject, int i10) {
        this.f40811b = snVar;
        this.d = messageObject;
        this.f40812c = i10;
    }
}
