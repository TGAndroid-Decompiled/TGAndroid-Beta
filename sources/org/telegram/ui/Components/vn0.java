package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
public final class vn0 implements View.OnClickListener {
    public final wn0 f31506a;

    public vn0(wn0 wn0Var) {
        this.f31506a = wn0Var;
    }

    @Override
    public final void onClick(View view) {
        xn0 xn0Var = this.f31506a.f32277c;
        for (int i10 = 0; i10 < xn0Var.e.size(); i10++) {
            MessageObject messageObject = (MessageObject) xn0Var.e.get(i10);
            if (xn0Var.H) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(xn0Var.d).updateFilesLoadingPriority();
            }
        }
        xn0Var.d(true);
    }
}
