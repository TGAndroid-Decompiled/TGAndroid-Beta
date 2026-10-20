package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
public final class sn0 implements View.OnClickListener {
    public final tn0 f30325a;

    public sn0(tn0 tn0Var) {
        this.f30325a = tn0Var;
    }

    @Override
    public final void onClick(View view) {
        un0 un0Var = this.f30325a.f30626c;
        for (int i10 = 0; i10 < un0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) un0Var.e.get(i10);
            if (un0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(un0Var.d).updateFilesLoadingPriority();
            }
        }
        un0Var.d(true);
    }
}
