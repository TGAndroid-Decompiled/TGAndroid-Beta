package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class xu extends p41 {
    public final yu f34768e;

    public xu(yu yuVar, String str) {
        super(str, (vz0) null);
        this.f34768e = yuVar;
    }

    @Override
    public final void onClick(View view) {
        int i9;
        yu yuVar = this.f34768e;
        i9 = ((org.telegram.ui.ActionBar.f3) yuVar.f35078x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i9);
        String url = getURL();
        dv dvVar = yuVar.f35078x;
        messagesController.openByUserName(url, dvVar.f27815c, 1);
        dvVar.X();
        dvVar.dismiss();
    }
}
