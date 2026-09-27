package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class ov extends b61 {
    public final pv e;

    public ov(pv pvVar, String str) {
        super(str, (d11) null);
        this.e = pvVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        pv pvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.g3) pvVar.f27473x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        uv uvVar = pvVar.f27473x;
        messagesController.openByUserName(url, uvVar.f28944c, 1);
        uvVar.Y();
        uvVar.dismiss();
    }
}
