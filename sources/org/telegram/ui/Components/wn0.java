package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
public final class wn0 implements View.OnClickListener {
    public final xn0 f30918a;

    public wn0(xn0 xn0Var) {
        this.f30918a = xn0Var;
    }

    @Override
    public final void onClick(View view) {
        yn0 yn0Var = this.f30918a.f31288c;
        for (int i10 = 0; i10 < yn0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) yn0Var.e.get(i10);
            if (yn0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(yn0Var.d).updateFilesLoadingPriority();
            }
        }
        yn0Var.d(true);
    }
}
