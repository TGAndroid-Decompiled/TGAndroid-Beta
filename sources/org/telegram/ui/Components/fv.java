package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;
public final class fv extends m51 {
    public final gv e;

    public fv(gv gvVar, String str) {
        super(str, (s01) null);
        this.e = gvVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        gv gvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.g3) gvVar.f25247x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        lv lvVar = gvVar.f25247x;
        messagesController.openByUserName(url, lvVar.f26879c, 1);
        lvVar.Y();
        lvVar.dismiss();
    }
}
