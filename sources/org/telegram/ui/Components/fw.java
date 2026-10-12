package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class fw extends y61 {
    public final gw f26181e;

    public fw(gw gwVar, String str) {
        super(str, (z11) null);
        this.f26181e = gwVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        gw gwVar = this.f26181e;
        i10 = ((org.telegram.ui.ActionBar.e3) gwVar.f26538x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        lw lwVar = gwVar.f26538x;
        messagesController.openByUserName(url, lwVar.f28293c, 1);
        lwVar.Z();
        lwVar.dismiss();
    }
}
