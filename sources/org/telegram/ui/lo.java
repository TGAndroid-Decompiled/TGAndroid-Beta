package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class lo implements Runnable {
    public final int f38310a;
    public final to f38311b;

    public lo(to toVar, int i10) {
        this.f38310a = i10;
        this.f38311b = toVar;
    }

    @Override
    public final void run() {
        switch (this.f38310a) {
            case 0:
                to.T(this.f38311b);
                return;
            case 1:
                to.Z(this.f38311b);
                return;
            case 2:
                to toVar = this.f38311b;
                toVar.f40884b.dismiss();
                toVar.finishFragment();
                return;
            case 3:
                to toVar2 = this.f38311b;
                toVar2.M.setChecked(toVar2.f40914x0.autotranslation);
                return;
            default:
                to toVar3 = this.f38311b;
                toVar3.f40889e.setImageDrawable(toVar3.f40904r);
                toVar3.f40885b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = toVar3.D0;
                if (user != null) {
                    user.photo = null;
                    toVar3.getMessagesController().putUser(toVar3.D0, true);
                }
                toVar3.O0 = true;
                if (toVar3.R0 == null) {
                    toVar3.R0 = new org.telegram.ui.Components.kj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                toVar3.f40885b0.f22723e.setTranslationX(-AndroidUtilities.dp(8.0f));
                toVar3.f40885b0.f22723e.setAnimation(toVar3.R0);
                return;
        }
    }
}
