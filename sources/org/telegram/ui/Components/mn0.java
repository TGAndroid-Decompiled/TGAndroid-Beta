package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
public final class mn0 implements View.OnClickListener {
    public final nn0 f28745a;

    public mn0(nn0 nn0Var) {
        this.f28745a = nn0Var;
    }

    @Override
    public final void onClick(View view) {
        on0 on0Var = this.f28745a.f29120c;
        for (int i10 = 0; i10 < on0Var.f29515e.size(); i10++) {
            MessageObject messageObject = (MessageObject) on0Var.f29515e.get(i10);
            if (on0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(on0Var.d).updateFilesLoadingPriority();
            }
        }
        on0Var.d(true);
    }
}
