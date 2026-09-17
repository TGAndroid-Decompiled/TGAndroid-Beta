package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ai implements Runnable {
    public final int f34454a = 1;
    public final co f34455b;
    public final int f34456c;
    public final MessageObject d;

    public ai(co coVar, int i10, MessageObject messageObject) {
        this.f34455b = coVar;
        this.f34456c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f34454a) {
            case 0:
                this.f34455b.f35352n4 = null;
                this.d.messageOwner.replies.read_max_id = this.f34456c;
                return;
            default:
                co coVar = this.f34455b;
                org.telegram.ui.Components.yc.a0(coVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f34456c).disableAds(false);
                MessageObject messageObject = this.d;
                coVar.Fa(messageObject);
                coVar.Ha(messageObject);
                return;
        }
    }

    public ai(co coVar, MessageObject messageObject, int i10) {
        this.f34455b = coVar;
        this.d = messageObject;
        this.f34456c = i10;
    }
}
