package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class po implements Runnable {
    public final int f39636a;
    public final xo f39637b;

    public po(xo xoVar, int i10) {
        this.f39636a = i10;
        this.f39637b = xoVar;
    }

    @Override
    public final void run() {
        switch (this.f39636a) {
            case 0:
                xo.V(this.f39637b);
                return;
            case 1:
                xo.a0(this.f39637b);
                return;
            case 2:
                xo xoVar = this.f39637b;
                xoVar.f42796b.dismiss();
                xoVar.finishFragment();
                return;
            case 3:
                xo xoVar2 = this.f39637b;
                xoVar2.M.setChecked(xoVar2.f42826x0.autotranslation);
                return;
            default:
                xo xoVar3 = this.f39637b;
                xoVar3.f42801e.setImageDrawable(xoVar3.f42816r);
                xoVar3.f42797b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = xoVar3.D0;
                if (user != null) {
                    user.photo = null;
                    xoVar3.getMessagesController().putUser(xoVar3.D0, true);
                }
                xoVar3.O0 = true;
                if (xoVar3.R0 == null) {
                    xoVar3.R0 = new org.telegram.ui.Components.xi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                xoVar3.f42797b0.f22710e.setTranslationX(-AndroidUtilities.dp(8.0f));
                xoVar3.f42797b0.f22710e.setAnimation(xoVar3.R0);
                return;
        }
    }
}
