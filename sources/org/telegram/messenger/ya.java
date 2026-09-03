package org.telegram.messenger;

import android.content.DialogInterface;
public final class ya implements DialogInterface.OnCancelListener {
    public final int f20696a;
    public final BaseController f20697b;
    public final int f20698c;

    public ya(BaseController baseController, int i10, int i11) {
        this.f20696a = i11;
        this.f20697b = baseController;
        this.f20698c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f20696a) {
            case 0:
                ((MessagesController) this.f20697b).lambda$convertToGigaGroup$271(this.f20698c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f20697b).lambda$convertToMegaGroup$266(this.f20698c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f20697b).lambda$startSecretChat$31(this.f20698c, dialogInterface);
                return;
        }
    }
}
