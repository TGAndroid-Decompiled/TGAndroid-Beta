package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class lv extends l51 {
    public final mv f28312e;

    public lv(mv mvVar, String str) {
        super(str, (n01) null);
        this.f28312e = mvVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        mv mvVar = this.f28312e;
        i10 = ((org.telegram.ui.ActionBar.f3) mvVar.f28547x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        rv rvVar = mvVar.f28547x;
        messagesController.openByUserName(url, rvVar.f30095c, 1);
        rvVar.Y();
        rvVar.dismiss();
    }
}
