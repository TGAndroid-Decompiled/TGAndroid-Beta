package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
public final class fo0 implements View.OnClickListener {
    public final go0 f26149a;

    public fo0(go0 go0Var) {
        this.f26149a = go0Var;
    }

    @Override
    public final void onClick(View view) {
        ho0 ho0Var = this.f26149a.f26483c;
        for (int i10 = 0; i10 < ho0Var.f26856e.size(); i10++) {
            MessageObject messageObject = (MessageObject) ho0Var.f26856e.get(i10);
            if (ho0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(ho0Var.d).updateFilesLoadingPriority();
            }
        }
        ho0Var.d(true);
    }
}
