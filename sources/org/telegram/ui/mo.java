package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class mo implements Runnable {
    public final int f35799a;
    public final uo f35800b;

    public mo(uo uoVar, int i10) {
        this.f35799a = i10;
        this.f35800b = uoVar;
    }

    @Override
    public final void run() {
        switch (this.f35799a) {
            case 0:
                uo.V(this.f35800b);
                return;
            case 1:
                uo.a0(this.f35800b);
                return;
            case 2:
                uo uoVar = this.f35800b;
                uoVar.f38166b.dismiss();
                uoVar.finishFragment();
                return;
            case 3:
                uo uoVar2 = this.f35800b;
                uoVar2.M.setChecked(uoVar2.f38195x0.autotranslation);
                return;
            default:
                uo uoVar3 = this.f35800b;
                uoVar3.e.setImageDrawable(uoVar3.f38185r);
                uoVar3.f38167b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = uoVar3.D0;
                if (user != null) {
                    user.photo = null;
                    uoVar3.getMessagesController().putUser(uoVar3.D0, true);
                }
                uoVar3.O0 = true;
                if (uoVar3.R0 == null) {
                    uoVar3.R0 = new org.telegram.ui.Components.kj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                uoVar3.f38167b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                uoVar3.f38167b0.e.setAnimation(uoVar3.R0);
                return;
        }
    }
}
