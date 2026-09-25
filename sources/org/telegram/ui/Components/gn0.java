package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
public final class gn0 implements View.OnClickListener {
    public final hn0 f24486a;

    public gn0(hn0 hn0Var) {
        this.f24486a = hn0Var;
    }

    @Override
    public final void onClick(View view) {
        in0 in0Var = this.f24486a.f24843c;
        for (int i10 = 0; i10 < in0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) in0Var.e.get(i10);
            if (in0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(in0Var.d).updateFilesLoadingPriority();
            }
        }
        in0Var.d(true);
    }
}
