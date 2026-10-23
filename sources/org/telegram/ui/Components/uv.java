package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class uv extends q61 {
    public final vv e;

    public uv(vv vvVar, String str) {
        super(str, (q11) null);
        this.e = vvVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        vv vvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.h3) vvVar.f32065x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        aw awVar = vvVar.f32065x;
        messagesController.openByUserName(url, awVar.f24855c, 1);
        awVar.i0();
        awVar.dismiss();
    }
}
