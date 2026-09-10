package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class qv extends z51 {
    public final rv e;

    public qv(rv rvVar, String str) {
        super(str, (b11) null);
        this.e = rvVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        rv rvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.h3) rvVar.f26770x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        wv wvVar = rvVar.f26770x;
        messagesController.openByUserName(url, wvVar.f28842c, 1);
        wvVar.Y();
        wvVar.dismiss();
    }
}
