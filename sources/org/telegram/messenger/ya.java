package org.telegram.messenger;

import android.content.DialogInterface;
public final class ya implements DialogInterface.OnCancelListener {
    public final int f19021a;
    public final BaseController f19022b;
    public final int f19023c;

    public ya(BaseController baseController, int i10, int i11) {
        this.f19021a = i11;
        this.f19022b = baseController;
        this.f19023c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19021a) {
            case 0:
                ((MessagesController) this.f19022b).lambda$convertToGigaGroup$271(this.f19023c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f19022b).lambda$convertToMegaGroup$266(this.f19023c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f19022b).lambda$startSecretChat$31(this.f19023c, dialogInterface);
                return;
        }
    }
}
