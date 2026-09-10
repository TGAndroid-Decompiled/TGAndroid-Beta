package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ci implements Runnable {
    public final int f31672a = 1;
    public final eo f31673b;
    public final int f31674c;
    public final MessageObject d;

    public ci(eo eoVar, int i10, MessageObject messageObject) {
        this.f31673b = eoVar;
        this.f31674c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f31672a) {
            case 0:
                this.f31673b.f32420n4 = null;
                this.d.messageOwner.replies.read_max_id = this.f31674c;
                return;
            default:
                eo eoVar = this.f31673b;
                org.telegram.ui.Components.wc.a0(eoVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f31674c).disableAds(false);
                MessageObject messageObject = this.d;
                eoVar.Fa(messageObject);
                eoVar.Ha(messageObject);
                return;
        }
    }

    public ci(eo eoVar, MessageObject messageObject, int i10) {
        this.f31673b = eoVar;
        this.d = messageObject;
        this.f31674c = i10;
    }
}
