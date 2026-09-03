package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
public final class an0 implements View.OnClickListener {
    public final bn0 f23460a;

    public an0(bn0 bn0Var) {
        this.f23460a = bn0Var;
    }

    @Override
    public final void onClick(View view) {
        cn0 cn0Var = this.f23460a.f23724c;
        for (int i10 = 0; i10 < cn0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) cn0Var.e.get(i10);
            if (cn0Var.E) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(cn0Var.d).updateFilesLoadingPriority();
            }
        }
        cn0Var.d(true);
    }
}
