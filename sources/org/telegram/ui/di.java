package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class di implements Runnable {
    public final int f35264a = 1;
    public final fo f35265b;
    public final int f35266c;
    public final MessageObject d;

    public di(fo foVar, int i10, MessageObject messageObject) {
        this.f35265b = foVar;
        this.f35266c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f35264a) {
            case 0:
                this.f35265b.f36037n4 = null;
                this.d.messageOwner.replies.read_max_id = this.f35266c;
                return;
            default:
                fo foVar = this.f35265b;
                org.telegram.ui.Components.zc.a0(foVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f35266c).disableAds(false);
                MessageObject messageObject = this.d;
                foVar.Ja(messageObject);
                foVar.La(messageObject);
                return;
        }
    }

    public di(fo foVar, MessageObject messageObject, int i10) {
        this.f35265b = foVar;
        this.d = messageObject;
        this.f35266c = i10;
    }
}
