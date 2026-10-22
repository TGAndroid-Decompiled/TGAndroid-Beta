package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class qh implements Runnable {
    public final int f40577a = 1;
    public final qn f40578b;
    public final int f40579c;
    public final MessageObject d;

    public qh(qn qnVar, int i10, MessageObject messageObject) {
        this.f40578b = qnVar;
        this.f40579c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f40577a) {
            case 0:
                this.f40578b.f40781n4 = null;
                this.d.messageOwner.replies.read_max_id = this.f40579c;
                return;
            default:
                qn qnVar = this.f40578b;
                org.telegram.ui.Components.xc.a0(qnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f40579c).disableAds(false);
                MessageObject messageObject = this.d;
                qnVar.Ja(messageObject);
                qnVar.La(messageObject);
                return;
        }
    }

    public qh(qn qnVar, MessageObject messageObject, int i10) {
        this.f40578b = qnVar;
        this.d = messageObject;
        this.f40579c = i10;
    }
}
