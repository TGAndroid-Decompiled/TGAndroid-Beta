package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class bi implements Runnable {
    public final int f32484a = 1;
    public final zn f32485b;
    public final int f32486c;
    public final MessageObject d;

    public bi(zn znVar, int i10, MessageObject messageObject) {
        this.f32485b = znVar;
        this.f32486c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f32484a) {
            case 0:
                this.f32485b.f40429n4 = null;
                this.d.messageOwner.replies.read_max_id = this.f32486c;
                return;
            default:
                zn znVar = this.f32485b;
                org.telegram.ui.Components.xc.a0(znVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f32486c).disableAds(false);
                MessageObject messageObject = this.d;
                znVar.Fa(messageObject);
                znVar.Ha(messageObject);
                return;
        }
    }

    public bi(zn znVar, MessageObject messageObject, int i10) {
        this.f32485b = znVar;
        this.d = messageObject;
        this.f32486c = i10;
    }
}
