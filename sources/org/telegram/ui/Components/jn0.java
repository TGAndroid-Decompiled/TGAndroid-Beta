package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
public final class jn0 implements View.OnClickListener {
    public final kn0 f25522a;

    public jn0(kn0 kn0Var) {
        this.f25522a = kn0Var;
    }

    @Override
    public final void onClick(View view) {
        ln0 ln0Var = this.f25522a.f25800c;
        for (int i10 = 0; i10 < ln0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) ln0Var.e.get(i10);
            if (ln0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(ln0Var.d).updateFilesLoadingPriority();
            }
        }
        ln0Var.d(true);
    }
}
