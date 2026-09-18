package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ci implements Runnable {
    public final int f32814a = 1;
    public final bo f32815b;
    public final int f32816c;
    public final MessageObject d;

    public ci(bo boVar, int i10, MessageObject messageObject) {
        this.f32815b = boVar;
        this.f32816c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f32814a) {
            case 0:
                this.f32815b.f32384n4 = null;
                this.d.messageOwner.replies.read_max_id = this.f32816c;
                return;
            default:
                bo boVar = this.f32815b;
                org.telegram.ui.Components.vc.a0(boVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f32816c).disableAds(false);
                MessageObject messageObject = this.d;
                boVar.Fa(messageObject);
                boVar.Ha(messageObject);
                return;
        }
    }

    public ci(bo boVar, MessageObject messageObject, int i10) {
        this.f32815b = boVar;
        this.d = messageObject;
        this.f32816c = i10;
    }
}
