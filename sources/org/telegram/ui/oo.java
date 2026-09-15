package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class oo implements Runnable {
    public final int f36313a;
    public final wo f36314b;

    public oo(wo woVar, int i10) {
        this.f36313a = i10;
        this.f36314b = woVar;
    }

    @Override
    public final void run() {
        switch (this.f36313a) {
            case 0:
                wo.V(this.f36314b);
                return;
            case 1:
                wo.a0(this.f36314b);
                return;
            case 2:
                wo woVar = this.f36314b;
                woVar.f39271b.dismiss();
                woVar.finishFragment();
                return;
            case 3:
                wo woVar2 = this.f36314b;
                woVar2.M.setChecked(woVar2.f39300x0.autotranslation);
                return;
            default:
                wo woVar3 = this.f36314b;
                woVar3.e.setImageDrawable(woVar3.f39290r);
                woVar3.f39272b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = woVar3.D0;
                if (user != null) {
                    user.photo = null;
                    woVar3.getMessagesController().putUser(woVar3.D0, true);
                }
                woVar3.O0 = true;
                if (woVar3.R0 == null) {
                    woVar3.R0 = new org.telegram.ui.Components.xi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                woVar3.f39272b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                woVar3.f39272b0.e.setAnimation(woVar3.R0);
                return;
        }
    }
}
