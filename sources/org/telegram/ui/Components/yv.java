package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class yv extends q61 {
    public final zv e;

    public yv(zv zvVar, String str) {
        super(str, (q11) null);
        this.e = zvVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        zv zvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.e3) zvVar.f31697x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        ew ewVar = zvVar.f31697x;
        messagesController.openByUserName(url, ewVar.f24497c, 1);
        ewVar.Z();
        ewVar.dismiss();
    }
}
