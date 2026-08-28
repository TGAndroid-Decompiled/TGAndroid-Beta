package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class oh implements Runnable {
    public final int f41155a = 1;
    public final qn f41156b;
    public final int f41157c;
    public final MessageObject d;

    public oh(qn qnVar, int i9, MessageObject messageObject) {
        this.f41156b = qnVar;
        this.f41157c = i9;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f41155a) {
            case 0:
                this.f41156b.f41958j4 = null;
                this.d.messageOwner.replies.read_max_id = this.f41157c;
                return;
            default:
                qn qnVar = this.f41156b;
                org.telegram.ui.Components.oc.a0(qnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f41157c).disableAds(false);
                MessageObject messageObject = this.d;
                qnVar.Fa(messageObject);
                qnVar.Ha(messageObject);
                return;
        }
    }

    public oh(qn qnVar, MessageObject messageObject, int i9) {
        this.f41156b = qnVar;
        this.d = messageObject;
        this.f41157c = i9;
    }
}
