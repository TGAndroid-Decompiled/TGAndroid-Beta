package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ai implements Runnable {
    public final int f31831a = 1;
    public final bo f31832b;
    public final int f31833c;
    public final MessageObject d;

    public ai(bo boVar, int i10, MessageObject messageObject) {
        this.f31832b = boVar;
        this.f31833c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f31831a) {
            case 0:
                this.f31832b.f32397n4 = null;
                this.d.messageOwner.replies.read_max_id = this.f31833c;
                return;
            default:
                bo boVar = this.f31832b;
                org.telegram.ui.Components.vc.a0(boVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f31833c).disableAds(false);
                MessageObject messageObject = this.d;
                boVar.Fa(messageObject);
                boVar.Ha(messageObject);
                return;
        }
    }

    public ai(bo boVar, MessageObject messageObject, int i10) {
        this.f31832b = boVar;
        this.d = messageObject;
        this.f31833c = i10;
    }
}
