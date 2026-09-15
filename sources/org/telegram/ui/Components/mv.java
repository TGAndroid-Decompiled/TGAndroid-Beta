package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class mv extends m51 {
    public final nv e;

    public mv(nv nvVar, String str) {
        super(str, (o01) null);
        this.e = nvVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        nv nvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.f3) nvVar.f26604x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        sv svVar = nvVar.f26604x;
        messagesController.openByUserName(url, svVar.f27975c, 1);
        svVar.Y();
        svVar.dismiss();
    }
}
