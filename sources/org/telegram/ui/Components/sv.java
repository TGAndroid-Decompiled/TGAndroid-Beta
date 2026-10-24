package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class sv extends p61 {
    public final tv e;

    public sv(tv tvVar, String str) {
        super(str, (p11) null);
        this.e = tvVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        tv tvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.h3) tvVar.f30899x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        yv yvVar = tvVar.f30899x;
        messagesController.openByUserName(url, yvVar.f33049c, 1);
        yvVar.i0();
        yvVar.dismiss();
    }
}
