package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class qh implements Runnable {
    public final int f40574a = 1;
    public final qn f40575b;
    public final int f40576c;
    public final MessageObject d;

    public qh(qn qnVar, int i10, MessageObject messageObject) {
        this.f40575b = qnVar;
        this.f40576c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f40574a) {
            case 0:
                this.f40575b.f40778n4 = null;
                this.d.messageOwner.replies.read_max_id = this.f40576c;
                return;
            default:
                qn qnVar = this.f40575b;
                org.telegram.ui.Components.xc.a0(qnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f40576c).disableAds(false);
                MessageObject messageObject = this.d;
                qnVar.Ja(messageObject);
                qnVar.La(messageObject);
                return;
        }
    }

    public qh(qn qnVar, MessageObject messageObject, int i10) {
        this.f40575b = qnVar;
        this.d = messageObject;
        this.f40576c = i10;
    }
}
