package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class di implements Runnable {
    public final int f36832a = 1;
    public final eo f36833b;
    public final int f36834c;
    public final MessageObject d;

    public di(eo eoVar, int i10, MessageObject messageObject) {
        this.f36833b = eoVar;
        this.f36834c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f36832a) {
            case 0:
                this.f36833b.f37360n4 = null;
                this.d.messageOwner.replies.read_max_id = this.f36834c;
                return;
            default:
                eo eoVar = this.f36833b;
                org.telegram.ui.Components.zc.a0(eoVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f36834c).disableAds(false);
                MessageObject messageObject = this.d;
                eoVar.Ja(messageObject);
                eoVar.La(messageObject);
                return;
        }
    }

    public di(eo eoVar, MessageObject messageObject, int i10) {
        this.f36833b = eoVar;
        this.d = messageObject;
        this.f36834c = i10;
    }
}
