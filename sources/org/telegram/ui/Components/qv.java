package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class qv extends k61 {
    public final rv f30172e;

    public qv(rv rvVar, String str) {
        super(str, (m11) null);
        this.f30172e = rvVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        rv rvVar = this.f30172e;
        i10 = ((org.telegram.ui.ActionBar.f3) rvVar.f30514x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        wv wvVar = rvVar.f30514x;
        messagesController.openByUserName(url, wvVar.f32629c, 1);
        wvVar.X();
        wvVar.dismiss();
    }
}
