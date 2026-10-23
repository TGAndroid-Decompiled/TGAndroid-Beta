package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class eo implements Runnable {
    public final int f37002a;
    public final ko f37003b;

    public eo(ko koVar, int i10) {
        this.f37002a = i10;
        this.f37003b = koVar;
    }

    @Override
    public final void run() {
        switch (this.f37002a) {
            case 0:
                ko.V(this.f37003b);
                return;
            case 1:
                ko.a0(this.f37003b);
                return;
            case 2:
                ko koVar = this.f37003b;
                koVar.f38985b.dismiss();
                koVar.finishFragment();
                return;
            case 3:
                ko koVar2 = this.f37003b;
                koVar2.M.setChecked(koVar2.f39012w0.autotranslation);
                return;
            default:
                ko koVar3 = this.f37003b;
                koVar3.e.setImageDrawable(koVar3.f39004r);
                koVar3.f38986b0.o(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = koVar3.C0;
                if (user != null) {
                    user.photo = null;
                    koVar3.getMessagesController().putUser(koVar3.C0, true);
                }
                koVar3.N0 = true;
                if (koVar3.Q0 == null) {
                    koVar3.Q0 = new org.telegram.ui.Components.yj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                koVar3.f38986b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                koVar3.f38986b0.e.setAnimation(koVar3.Q0);
                return;
        }
    }
}
