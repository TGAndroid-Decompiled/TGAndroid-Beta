package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ai implements Runnable {
    public final int f34481a = 1;
    public final co f34482b;
    public final int f34483c;
    public final MessageObject d;

    public ai(co coVar, int i10, MessageObject messageObject) {
        this.f34482b = coVar;
        this.f34483c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f34481a) {
            case 0:
                this.f34482b.f35379n4 = null;
                this.d.messageOwner.replies.read_max_id = this.f34483c;
                return;
            default:
                co coVar = this.f34482b;
                org.telegram.ui.Components.yc.a0(coVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f34483c).disableAds(false);
                MessageObject messageObject = this.d;
                coVar.Fa(messageObject);
                coVar.Ha(messageObject);
                return;
        }
    }

    public ai(co coVar, MessageObject messageObject, int i10) {
        this.f34482b = coVar;
        this.d = messageObject;
        this.f34483c = i10;
    }
}
