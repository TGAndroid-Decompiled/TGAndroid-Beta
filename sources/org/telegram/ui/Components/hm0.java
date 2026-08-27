package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;

public final class hm0 implements View.OnClickListener {

    public final im0 f29059a;

    public hm0(im0 im0Var) {
        this.f29059a = im0Var;
    }

    @Override
    public final void onClick(View view) {
        jm0 jm0Var = this.f29059a.f29408c;
        for (int i10 = 0; i10 < jm0Var.f29730e.size(); i10++) {
            MessageObject messageObject = (MessageObject) jm0Var.f29730e.get(i10);
            if (jm0Var.D) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(jm0Var.d).updateFilesLoadingPriority();
            }
        }
        jm0Var.d(true);
    }
}
