package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class mo implements Runnable {
    public final int f39955a;
    public final uo f39956b;

    public mo(uo uoVar, int i10) {
        this.f39955a = i10;
        this.f39956b = uoVar;
    }

    @Override
    public final void run() {
        switch (this.f39955a) {
            case 0:
                uo.V(this.f39956b);
                return;
            case 1:
                uo.a0(this.f39956b);
                return;
            case 2:
                uo uoVar = this.f39956b;
                uoVar.f42466b.dismiss();
                uoVar.finishFragment();
                return;
            case 3:
                uo uoVar2 = this.f39956b;
                uoVar2.M.setChecked(uoVar2.f42496x0.autotranslation);
                return;
            default:
                uo uoVar3 = this.f39956b;
                uoVar3.f42471e.setImageDrawable(uoVar3.f42486r);
                uoVar3.f42467b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = uoVar3.D0;
                if (user != null) {
                    user.photo = null;
                    uoVar3.getMessagesController().putUser(uoVar3.D0, true);
                }
                uoVar3.O0 = true;
                if (uoVar3.R0 == null) {
                    uoVar3.R0 = new org.telegram.ui.Components.ck0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                uoVar3.f42467b0.f22720e.setTranslationX(-AndroidUtilities.dp(8.0f));
                uoVar3.f42467b0.f22720e.setAnimation(uoVar3.R0);
                return;
        }
    }
}
