package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class dv extends a51 {
    public final ev f27879e;

    public dv(ev evVar, String str) {
        super(str, (h01) null);
        this.f27879e = evVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        ev evVar = this.f27879e;
        i10 = ((org.telegram.ui.ActionBar.f3) evVar.f28192x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        jv jvVar = evVar.f28192x;
        messagesController.openByUserName(url, jvVar.f29824c, 1);
        jvVar.Y();
        jvVar.dismiss();
    }
}
