package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class gv extends m51 {
    public final hv e;

    public gv(hv hvVar, String str) {
        super(str, (s01) null);
        this.e = hvVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        hv hvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.g3) hvVar.f25506x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        mv mvVar = hvVar.f25506x;
        messagesController.openByUserName(url, mvVar.f27124c, 1);
        mvVar.Y();
        mvVar.dismiss();
    }
}
