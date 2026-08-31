package org.telegram.messenger;

import android.content.DialogInterface;
public final class ya implements DialogInterface.OnCancelListener {
    public final int f20694a;
    public final BaseController f20695b;
    public final int f20696c;

    public ya(BaseController baseController, int i10, int i11) {
        this.f20694a = i11;
        this.f20695b = baseController;
        this.f20696c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f20694a) {
            case 0:
                ((MessagesController) this.f20695b).lambda$convertToGigaGroup$271(this.f20696c, dialogInterface);
                return;
            case 1:
                ((MessagesController) this.f20695b).lambda$convertToMegaGroup$266(this.f20696c, dialogInterface);
                return;
            default:
                ((SecretChatHelper) this.f20695b).lambda$startSecretChat$31(this.f20696c, dialogInterface);
                return;
        }
    }
}
