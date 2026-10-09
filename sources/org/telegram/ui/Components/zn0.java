package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
public final class zn0 implements View.OnClickListener {
    public final ao0 f33604a;

    public zn0(ao0 ao0Var) {
        this.f33604a = ao0Var;
    }

    @Override
    public final void onClick(View view) {
        bo0 bo0Var = this.f33604a.f24724c;
        for (int i10 = 0; i10 < bo0Var.f25069e.size(); i10++) {
            MessageObject messageObject = (MessageObject) bo0Var.f25069e.get(i10);
            if (bo0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(bo0Var.d).updateFilesLoadingPriority();
            }
        }
        bo0Var.d(true);
    }
}
