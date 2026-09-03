package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class iv extends l51 {
    public final jv f27903e;

    public iv(jv jvVar, String str) {
        super(str, (s01) null);
        this.f27903e = jvVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        jv jvVar = this.f27903e;
        i10 = ((org.telegram.ui.ActionBar.h3) jvVar.f28200x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        ov ovVar = jvVar.f28200x;
        messagesController.openByUserName(url, ovVar.f29899c, 1);
        ovVar.Y();
        ovVar.dismiss();
    }
}
