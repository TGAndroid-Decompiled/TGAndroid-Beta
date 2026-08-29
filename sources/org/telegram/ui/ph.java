package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ph implements Runnable {
    public final int f41411a = 1;
    public final tn f41412b;
    public final int f41413c;
    public final MessageObject d;

    public ph(tn tnVar, int i10, MessageObject messageObject) {
        this.f41412b = tnVar;
        this.f41413c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f41411a) {
            case 0:
                this.f41412b.f42855j4 = null;
                this.d.messageOwner.replies.read_max_id = this.f41413c;
                return;
            default:
                tn tnVar = this.f41412b;
                org.telegram.ui.Components.tc.a0(tnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f41413c).disableAds(false);
                MessageObject messageObject = this.d;
                tnVar.Fa(messageObject);
                tnVar.Ha(messageObject);
                return;
        }
    }

    public ph(tn tnVar, MessageObject messageObject, int i10) {
        this.f41412b = tnVar;
        this.d = messageObject;
        this.f41413c = i10;
    }
}
