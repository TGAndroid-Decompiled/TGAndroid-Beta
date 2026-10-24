package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
public final class un0 implements View.OnClickListener {
    public final vn0 f31168a;

    public un0(vn0 vn0Var) {
        this.f31168a = vn0Var;
    }

    @Override
    public final void onClick(View view) {
        wn0 wn0Var = this.f31168a.f31479c;
        for (int i10 = 0; i10 < wn0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) wn0Var.e.get(i10);
            if (wn0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(wn0Var.d).updateFilesLoadingPriority();
            }
        }
        wn0Var.d(true);
    }
}
