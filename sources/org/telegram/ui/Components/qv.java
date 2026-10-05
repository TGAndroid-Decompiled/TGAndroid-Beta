package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class qv extends l61 {
    public final rv f30209e;

    public qv(rv rvVar, String str) {
        super(str, (n11) null);
        this.f30209e = rvVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        rv rvVar = this.f30209e;
        i10 = ((org.telegram.ui.ActionBar.f3) rvVar.f30595x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        wv wvVar = rvVar.f30595x;
        messagesController.openByUserName(url, wvVar.f32711c, 1);
        wvVar.X();
        wvVar.dismiss();
    }
}
