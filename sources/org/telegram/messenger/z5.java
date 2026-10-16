package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class z5 implements DialogInterface.OnCancelListener {
    public final int f18839a;
    public final Object f18840b;

    public z5(Object obj, int i10) {
        this.f18839a = i10;
        this.f18840b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f18839a) {
            case 0:
                MediaController.lambda$saveFile$45((boolean[]) this.f18840b, dialogInterface);
                return;
            case 1:
                MediaController.lambda$saveFile$52((boolean[]) this.f18840b, dialogInterface);
                return;
            case 2:
                MessagesController.lambda$openByUserName$460((boolean[]) this.f18840b, dialogInterface);
                return;
            default:
                ((MediaController.MediaLoader) this.f18840b).lambda$new$0(dialogInterface);
                return;
        }
    }
}
