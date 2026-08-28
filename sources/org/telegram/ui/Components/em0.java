package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
public final class em0 implements View.OnClickListener {
    public final fm0 f28085a;

    public em0(fm0 fm0Var) {
        this.f28085a = fm0Var;
    }

    @Override
    public final void onClick(View view) {
        gm0 gm0Var = this.f28085a.f28513c;
        for (int i9 = 0; i9 < gm0Var.f28811e.size(); i9++) {
            MessageObject messageObject = (MessageObject) gm0Var.f28811e.get(i9);
            if (gm0Var.D) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(gm0Var.d).updateFilesLoadingPriority();
            }
        }
        gm0Var.d(true);
    }
}
