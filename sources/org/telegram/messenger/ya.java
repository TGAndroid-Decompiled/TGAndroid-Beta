package org.telegram.messenger;

import android.content.DialogInterface;
public final class ya implements DialogInterface.OnCancelListener {
    public final int f19037a;
    public final BaseController f19038b;
    public final int f19039c;

    public ya(BaseController baseController, int i10, int i11) {
        this.f19037a = i11;
        this.f19038b = baseController;
        this.f19039c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19037a) {
            case 0:
                ((MessagesController) this.f19038b).lambda$convertToGigaGroup$271(this.f19039c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f19038b).lambda$convertToMegaGroup$266(this.f19039c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f19038b).lambda$startSecretChat$31(this.f19039c, dialogInterface);
                return;
        }
    }
}
