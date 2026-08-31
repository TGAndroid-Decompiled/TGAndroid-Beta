package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
public final class cn0 implements View.OnClickListener {
    public final dn0 f26058a;

    public cn0(dn0 dn0Var) {
        this.f26058a = dn0Var;
    }

    @Override
    public final void onClick(View view) {
        en0 en0Var = this.f26058a.f26301c;
        for (int i10 = 0; i10 < en0Var.f26586e.size(); i10++) {
            MessageObject messageObject = (MessageObject) en0Var.f26586e.get(i10);
            if (en0Var.E) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(en0Var.d).updateFilesLoadingPriority();
            }
        }
        en0Var.d(true);
    }
}
