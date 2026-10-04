package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class qv extends k61 {
    public final rv f30179e;

    public qv(rv rvVar, String str) {
        super(str, (m11) null);
        this.f30179e = rvVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        rv rvVar = this.f30179e;
        i10 = ((org.telegram.ui.ActionBar.f3) rvVar.f30521x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        wv wvVar = rvVar.f30521x;
        messagesController.openByUserName(url, wvVar.f32636c, 1);
        wvVar.X();
        wvVar.dismiss();
    }
}
