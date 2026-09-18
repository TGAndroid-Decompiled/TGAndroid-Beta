package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
public final class um0 implements View.OnClickListener {
    public final vm0 f28412a;

    public um0(vm0 vm0Var) {
        this.f28412a = vm0Var;
    }

    @Override
    public final void onClick(View view) {
        wm0 wm0Var = this.f28412a.f28831c;
        for (int i10 = 0; i10 < wm0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) wm0Var.e.get(i10);
            if (wm0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(wm0Var.d).updateFilesLoadingPriority();
            }
        }
        wm0Var.d(true);
    }
}
