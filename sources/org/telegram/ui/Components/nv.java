package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class nv extends c61 {
    public final ov e;

    public nv(ov ovVar, String str) {
        super(str, (e11) null);
        this.e = ovVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        ov ovVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.f3) ovVar.f27193x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        tv tvVar = ovVar.f27193x;
        messagesController.openByUserName(url, tvVar.f28535c, 1);
        tvVar.Y();
        tvVar.dismiss();
    }
}
