package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class bi implements Runnable {
    public final int f32384a = 1;
    public final zn f32385b;
    public final int f32386c;
    public final MessageObject d;

    public bi(zn znVar, int i10, MessageObject messageObject) {
        this.f32385b = znVar;
        this.f32386c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f32384a) {
            case 0:
                this.f32385b.f40366n4 = null;
                this.d.messageOwner.replies.read_max_id = this.f32386c;
                return;
            default:
                zn znVar = this.f32385b;
                org.telegram.ui.Components.xc.a0(znVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f32386c).disableAds(false);
                MessageObject messageObject = this.d;
                znVar.Fa(messageObject);
                znVar.Ha(messageObject);
                return;
        }
    }

    public bi(zn znVar, MessageObject messageObject, int i10) {
        this.f32385b = znVar;
        this.d = messageObject;
        this.f32386c = i10;
    }
}
