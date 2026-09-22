package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
public final class in0 implements View.OnClickListener {
    public final jn0 f25160a;

    public in0(jn0 jn0Var) {
        this.f25160a = jn0Var;
    }

    @Override
    public final void onClick(View view) {
        kn0 kn0Var = this.f25160a.f25416c;
        for (int i10 = 0; i10 < kn0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) kn0Var.e.get(i10);
            if (kn0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(kn0Var.d).updateFilesLoadingPriority();
            }
        }
        kn0Var.d(true);
    }
}
