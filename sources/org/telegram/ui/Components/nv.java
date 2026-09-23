package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class nv extends l51 {
    public final ov e;

    public nv(ov ovVar, String str) {
        super(str, (n01) null);
        this.e = ovVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        ov ovVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.f3) ovVar.f26874x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        tv tvVar = ovVar.f26874x;
        messagesController.openByUserName(url, tvVar.f28305c, 1);
        tvVar.Y();
        tvVar.dismiss();
    }
}
