package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class uv extends y61 {
    public final vv e;

    public uv(vv vvVar, String str) {
        super(str, (z11) null);
        this.e = vvVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        vv vvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.k3) vvVar.f34381x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        aw awVar = vvVar.f34381x;
        messagesController.openByUserName(url, awVar.f26674c, 1);
        awVar.i0();
        awVar.dismiss();
    }
}
