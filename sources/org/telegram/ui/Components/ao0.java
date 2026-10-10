package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
public final class ao0 implements View.OnClickListener {
    public final bo0 f24596a;

    public ao0(bo0 bo0Var) {
        this.f24596a = bo0Var;
    }

    @Override
    public final void onClick(View view) {
        co0 co0Var = this.f24596a.f25013c;
        for (int i10 = 0; i10 < co0Var.f25344e.size(); i10++) {
            MessageObject messageObject = (MessageObject) co0Var.f25344e.get(i10);
            if (co0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(co0Var.d).updateFilesLoadingPriority();
            }
        }
        co0Var.d(true);
    }
}
