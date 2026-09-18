package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class mv extends n51 {
    public final nv e;

    public mv(nv nvVar, String str) {
        super(str, (p01) null);
        this.e = nvVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        nv nvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.g3) nvVar.f26555x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        sv svVar = nvVar.f26555x;
        messagesController.openByUserName(url, svVar.f27932c, 1);
        svVar.Y();
        svVar.dismiss();
    }
}
