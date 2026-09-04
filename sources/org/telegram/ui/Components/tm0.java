package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
public final class tm0 implements View.OnClickListener {
    public final um0 f30622a;

    public tm0(um0 um0Var) {
        this.f30622a = um0Var;
    }

    @Override
    public final void onClick(View view) {
        vm0 vm0Var = this.f30622a.f30924c;
        for (int i10 = 0; i10 < vm0Var.f31366e.size(); i10++) {
            MessageObject messageObject = (MessageObject) vm0Var.f31366e.get(i10);
            if (vm0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(vm0Var.d).updateFilesLoadingPriority();
            }
        }
        vm0Var.d(true);
    }
}
