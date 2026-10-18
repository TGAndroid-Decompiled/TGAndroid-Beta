package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
public final class rn0 implements View.OnClickListener {
    public final sn0 f30005a;

    public rn0(sn0 sn0Var) {
        this.f30005a = sn0Var;
    }

    @Override
    public final void onClick(View view) {
        tn0 tn0Var = this.f30005a.f30306c;
        for (int i10 = 0; i10 < tn0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) tn0Var.e.get(i10);
            if (tn0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(tn0Var.d).updateFilesLoadingPriority();
            }
        }
        tn0Var.d(true);
    }
}
