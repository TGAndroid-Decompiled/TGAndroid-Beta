package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class iv extends n51 {
    public final jv f27914e;

    public iv(jv jvVar, String str) {
        super(str, (t01) null);
        this.f27914e = jvVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        jv jvVar = this.f27914e;
        i10 = ((org.telegram.ui.ActionBar.h3) jvVar.f28215x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        ov ovVar = jvVar.f28215x;
        messagesController.openByUserName(url, ovVar.f29873c, 1);
        ovVar.Y();
        ovVar.dismiss();
    }
}
