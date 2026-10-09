package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class cw extends t61 {
    public final dw f25512e;

    public cw(dw dwVar, String str) {
        super(str, (t11) null);
        this.f25512e = dwVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        dw dwVar = this.f25512e;
        i10 = ((org.telegram.ui.ActionBar.f3) dwVar.f25829x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        iw iwVar = dwVar.f25829x;
        messagesController.openByUserName(url, iwVar.f27496c, 1);
        iwVar.Z();
        iwVar.dismiss();
    }
}
