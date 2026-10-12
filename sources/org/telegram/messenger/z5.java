package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class z5 implements DialogInterface.OnCancelListener {
    public final int f19716a;
    public final Object f19717b;

    public z5(Object obj, int i10) {
        this.f19716a = i10;
        this.f19717b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19716a) {
            case 0:
                MediaController.lambda$saveFile$45((boolean[]) this.f19717b, dialogInterface);
                return;
            case 1:
                MediaController.lambda$saveFile$52((boolean[]) this.f19717b, dialogInterface);
                return;
            case 2:
                MessagesController.lambda$openByUserName$460((boolean[]) this.f19717b, dialogInterface);
                return;
            default:
                ((MediaController.MediaLoader) this.f19717b).lambda$new$0(dialogInterface);
                return;
        }
    }
}
