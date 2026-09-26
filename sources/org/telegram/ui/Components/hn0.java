package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
public final class hn0 implements View.OnClickListener {
    public final in0 f24824a;

    public hn0(in0 in0Var) {
        this.f24824a = in0Var;
    }

    @Override
    public final void onClick(View view) {
        jn0 jn0Var = this.f24824a.f25165c;
        for (int i10 = 0; i10 < jn0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) jn0Var.e.get(i10);
            if (jn0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(jn0Var.d).updateFilesLoadingPriority();
            }
        }
        jn0Var.d(true);
    }
}
