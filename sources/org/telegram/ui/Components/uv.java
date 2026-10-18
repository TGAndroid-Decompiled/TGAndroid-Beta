package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class uv extends j61 {
    public final vv e;

    public uv(vv vvVar, String str) {
        super(str, (l11) null);
        this.e = vvVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        vv vvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.f3) vvVar.f31925x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        aw awVar = vvVar.f31925x;
        messagesController.openByUserName(url, awVar.f24727c, 1);
        awVar.Z();
        awVar.dismiss();
    }
}
