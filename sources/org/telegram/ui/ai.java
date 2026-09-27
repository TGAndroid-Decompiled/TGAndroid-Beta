package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ai implements Runnable {
    public final int f32074a = 1;
    public final xn f32075b;
    public final int f32076c;
    public final MessageObject d;

    public ai(xn xnVar, int i10, MessageObject messageObject) {
        this.f32075b = xnVar;
        this.f32076c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f32074a) {
            case 0:
                this.f32075b.f39855n4 = null;
                this.d.messageOwner.replies.read_max_id = this.f32076c;
                return;
            default:
                xn xnVar = this.f32075b;
                org.telegram.ui.Components.xc.a0(xnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f32076c).disableAds(false);
                MessageObject messageObject = this.d;
                xnVar.Fa(messageObject);
                xnVar.Ha(messageObject);
                return;
        }
    }

    public ai(xn xnVar, MessageObject messageObject, int i10) {
        this.f32075b = xnVar;
        this.d = messageObject;
        this.f32076c = i10;
    }
}
