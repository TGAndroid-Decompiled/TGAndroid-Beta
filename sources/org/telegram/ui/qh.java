package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

public final class qh implements Runnable {

    public final int f41664a = 1;

    public final rn f41665b;

    public final int f41666c;
    public final MessageObject d;

    public qh(rn rnVar, int i10, MessageObject messageObject) {
        this.f41665b = rnVar;
        this.f41666c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f41664a) {
            case 0:
                this.f41665b.f42094j4 = null;
                this.d.messageOwner.replies.read_max_id = this.f41666c;
                break;
            default:
                rn rnVar = this.f41665b;
                org.telegram.ui.Components.mc.a0(rnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f41666c).disableAds(false);
                MessageObject messageObject = this.d;
                rnVar.Fa(messageObject);
                rnVar.Ha(messageObject);
                break;
        }
    }

    public qh(rn rnVar, MessageObject messageObject, int i10) {
        this.f41665b = rnVar;
        this.d = messageObject;
        this.f41666c = i10;
    }
}
