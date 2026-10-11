package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class mo implements Runnable {
    public final int f40043a;
    public final uo f40044b;

    public mo(uo uoVar, int i10) {
        this.f40043a = i10;
        this.f40044b = uoVar;
    }

    @Override
    public final void run() {
        switch (this.f40043a) {
            case 0:
                uo.V(this.f40044b);
                return;
            case 1:
                uo.a0(this.f40044b);
                return;
            case 2:
                uo uoVar = this.f40044b;
                uoVar.f42656b.dismiss();
                uoVar.finishFragment();
                return;
            case 3:
                uo uoVar2 = this.f40044b;
                uoVar2.M.setChecked(uoVar2.f42686x0.autotranslation);
                return;
            default:
                uo uoVar3 = this.f40044b;
                uoVar3.f42661e.setImageDrawable(uoVar3.f42676r);
                uoVar3.f42657b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = uoVar3.D0;
                if (user != null) {
                    user.photo = null;
                    uoVar3.getMessagesController().putUser(uoVar3.D0, true);
                }
                uoVar3.O0 = true;
                if (uoVar3.R0 == null) {
                    uoVar3.R0 = new org.telegram.ui.Components.ek0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                uoVar3.f42657b0.f22712e.setTranslationX(-AndroidUtilities.dp(8.0f));
                uoVar3.f42657b0.f22712e.setAnimation(uoVar3.R0);
                return;
        }
    }
}
