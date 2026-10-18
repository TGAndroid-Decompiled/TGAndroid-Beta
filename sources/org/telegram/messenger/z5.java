package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class z5 implements DialogInterface.OnCancelListener {
    public final int f20197a;
    public final Object f20198b;

    public z5(Object obj, int i10) {
        this.f20197a = i10;
        this.f20198b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f20197a) {
            case 0:
                MediaController.lambda$saveFile$45((boolean[]) this.f20198b, dialogInterface);
                return;
            case 1:
                MediaController.lambda$saveFile$52((boolean[]) this.f20198b, dialogInterface);
                return;
            case 2:
                MessagesController.lambda$openByUserName$460((boolean[]) this.f20198b, dialogInterface);
                return;
            default:
                ((MediaController.MediaLoader) this.f20198b).lambda$new$0(dialogInterface);
                return;
        }
    }
}
