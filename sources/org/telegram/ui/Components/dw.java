package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class dw extends v61 {
    public final ew f25681e;

    public dw(ew ewVar, String str) {
        super(str, (v11) null);
        this.f25681e = ewVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        ew ewVar = this.f25681e;
        i10 = ((org.telegram.ui.ActionBar.e3) ewVar.f26153x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        jw jwVar = ewVar.f26153x;
        messagesController.openByUserName(url, jwVar.f27759c, 1);
        jwVar.Z();
        jwVar.dismiss();
    }
}
