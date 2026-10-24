package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class eo implements Runnable {
    public final int f36960a;
    public final ko f36961b;

    public eo(ko koVar, int i10) {
        this.f36960a = i10;
        this.f36961b = koVar;
    }

    @Override
    public final void run() {
        switch (this.f36960a) {
            case 0:
                ko.V(this.f36961b);
                return;
            case 1:
                ko.a0(this.f36961b);
                return;
            case 2:
                ko koVar = this.f36961b;
                koVar.f38953b.dismiss();
                koVar.finishFragment();
                return;
            case 3:
                ko koVar2 = this.f36961b;
                koVar2.M.setChecked(koVar2.f38980w0.autotranslation);
                return;
            default:
                ko koVar3 = this.f36961b;
                koVar3.e.setImageDrawable(koVar3.f38972r);
                koVar3.f38954b0.o(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = koVar3.C0;
                if (user != null) {
                    user.photo = null;
                    koVar3.getMessagesController().putUser(koVar3.C0, true);
                }
                koVar3.N0 = true;
                if (koVar3.Q0 == null) {
                    koVar3.Q0 = new org.telegram.ui.Components.xj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                koVar3.f38954b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                koVar3.f38954b0.e.setAnimation(koVar3.Q0);
                return;
        }
    }
}
