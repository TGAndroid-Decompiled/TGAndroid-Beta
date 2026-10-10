package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class dw extends u61 {
    public final ew f25801e;

    public dw(ew ewVar, String str) {
        super(str, (u11) null);
        this.f25801e = ewVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        ew ewVar = this.f25801e;
        i10 = ((org.telegram.ui.ActionBar.f3) ewVar.f26187x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        jw jwVar = ewVar.f26187x;
        messagesController.openByUserName(url, jwVar.f27799c, 1);
        jwVar.Z();
        jwVar.dismiss();
    }
}
