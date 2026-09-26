package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class ov extends a61 {
    public final pv e;

    public ov(pv pvVar, String str) {
        super(str, (c11) null);
        this.e = pvVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        pv pvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.e3) pvVar.f27510x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        uv uvVar = pvVar.f27510x;
        messagesController.openByUserName(url, uvVar.f28912c, 1);
        uvVar.Y();
        uvVar.dismiss();
    }
}
