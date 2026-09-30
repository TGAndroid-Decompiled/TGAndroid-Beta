package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class pv extends c61 {
    public final qv e;

    public pv(qv qvVar, String str) {
        super(str, (e11) null);
        this.e = qvVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        qv qvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.e3) qvVar.f27736x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        vv vvVar = qvVar.f27736x;
        messagesController.openByUserName(url, vvVar.f29726c, 1);
        vvVar.Y();
        vvVar.dismiss();
    }
}
