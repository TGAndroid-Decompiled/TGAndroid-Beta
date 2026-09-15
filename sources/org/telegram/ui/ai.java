package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ai implements Runnable {
    public final int f31839a = 1;
    public final bo f31840b;
    public final int f31841c;
    public final MessageObject d;

    public ai(bo boVar, int i10, MessageObject messageObject) {
        this.f31840b = boVar;
        this.f31841c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f31839a) {
            case 0:
                this.f31840b.f32402n4 = null;
                this.d.messageOwner.replies.read_max_id = this.f31841c;
                return;
            default:
                bo boVar = this.f31840b;
                org.telegram.ui.Components.vc.a0(boVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f31841c).disableAds(false);
                MessageObject messageObject = this.d;
                boVar.Fa(messageObject);
                boVar.Ha(messageObject);
                return;
        }
    }

    public ai(bo boVar, MessageObject messageObject, int i10) {
        this.f31840b = boVar;
        this.d = messageObject;
        this.f31841c = i10;
    }
}
