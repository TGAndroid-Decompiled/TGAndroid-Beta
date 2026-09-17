package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ci implements Runnable {
    public final int f32810a = 1;
    public final bo f32811b;
    public final int f32812c;
    public final MessageObject d;

    public ci(bo boVar, int i10, MessageObject messageObject) {
        this.f32811b = boVar;
        this.f32812c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f32810a) {
            case 0:
                this.f32811b.f32380n4 = null;
                this.d.messageOwner.replies.read_max_id = this.f32812c;
                return;
            default:
                bo boVar = this.f32811b;
                org.telegram.ui.Components.vc.a0(boVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f32812c).disableAds(false);
                MessageObject messageObject = this.d;
                boVar.Fa(messageObject);
                boVar.Ha(messageObject);
                return;
        }
    }

    public ci(bo boVar, MessageObject messageObject, int i10) {
        this.f32811b = boVar;
        this.d = messageObject;
        this.f32812c = i10;
    }
}
