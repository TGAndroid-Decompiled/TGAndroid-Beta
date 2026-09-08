package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class lv extends l51 {
    public final mv f28338e;

    public lv(mv mvVar, String str) {
        super(str, (n01) null);
        this.f28338e = mvVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        mv mvVar = this.f28338e;
        i10 = ((org.telegram.ui.ActionBar.f3) mvVar.f28573x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        rv rvVar = mvVar.f28573x;
        messagesController.openByUserName(url, rvVar.f30121c, 1);
        rvVar.Y();
        rvVar.dismiss();
    }
}
