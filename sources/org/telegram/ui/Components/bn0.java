package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
public final class bn0 implements View.OnClickListener {
    public final cn0 f23727a;

    public bn0(cn0 cn0Var) {
        this.f23727a = cn0Var;
    }

    @Override
    public final void onClick(View view) {
        dn0 dn0Var = this.f23727a.f24027c;
        for (int i10 = 0; i10 < dn0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) dn0Var.e.get(i10);
            if (dn0Var.E) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(dn0Var.d).updateFilesLoadingPriority();
            }
        }
        dn0Var.d(true);
    }
}
