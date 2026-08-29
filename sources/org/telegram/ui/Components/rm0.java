package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
public final class rm0 implements View.OnClickListener {
    public final sm0 f32341a;

    public rm0(sm0 sm0Var) {
        this.f32341a = sm0Var;
    }

    @Override
    public final void onClick(View view) {
        tm0 tm0Var = this.f32341a.f32690c;
        for (int i10 = 0; i10 < tm0Var.f32980e.size(); i10++) {
            MessageObject messageObject = (MessageObject) tm0Var.f32980e.get(i10);
            if (tm0Var.D) {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(messageObject.getDocument());
            } else {
                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(messageObject.getDocument(), messageObject, 0, 0);
                DownloadController.getInstance(tm0Var.d).updateFilesLoadingPriority();
            }
        }
        tm0Var.d(true);
    }
}
