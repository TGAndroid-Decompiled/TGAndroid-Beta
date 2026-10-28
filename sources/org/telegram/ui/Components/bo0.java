package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
public final class bo0 implements View.OnClickListener {
    public final co0 f26879a;

    public bo0(co0 co0Var) {
        this.f26879a = co0Var;
    }

    @Override
    public final void onClick(View view) {
        do0 do0Var = this.f26879a.f27219c;
        for (int i10 = 0; i10 < do0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) do0Var.e.get(i10);
            if (do0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(do0Var.d).updateFilesLoadingPriority();
            }
        }
        do0Var.d(true);
    }
}
