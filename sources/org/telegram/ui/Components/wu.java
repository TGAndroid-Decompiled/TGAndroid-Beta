package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

public final class wu extends r41 {

    public final xu f34346e;

    public wu(xu xuVar, String str) {
        super(str, (xz0) null);
        this.f34346e = xuVar;
    }

    @Override
    public final void onClick(View view) {
        xu xuVar = this.f34346e;
        MessagesController messagesController = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) xuVar.f34720x).currentAccount);
        String url = getURL();
        cv cvVar = xuVar.f34720x;
        messagesController.openByUserName(url, cvVar.f27548c, 1);
        cvVar.Y();
        cvVar.dismiss();
    }
}
