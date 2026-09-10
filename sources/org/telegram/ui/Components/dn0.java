package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
public final class dn0 implements View.OnClickListener {
    public final en0 f22449a;

    public dn0(en0 en0Var) {
        this.f22449a = en0Var;
    }

    @Override
    public final void onClick(View view) {
        fn0 fn0Var = this.f22449a.f22732c;
        for (int i10 = 0; i10 < fn0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) fn0Var.e.get(i10);
            if (fn0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(fn0Var.d).updateFilesLoadingPriority();
            }
        }
        fn0Var.d(true);
    }
}
