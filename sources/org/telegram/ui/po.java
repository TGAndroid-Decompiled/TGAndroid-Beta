package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class po implements Runnable {
    public final int f39637a;
    public final xo f39638b;

    public po(xo xoVar, int i10) {
        this.f39637a = i10;
        this.f39638b = xoVar;
    }

    @Override
    public final void run() {
        switch (this.f39637a) {
            case 0:
                xo.V(this.f39638b);
                return;
            case 1:
                xo.a0(this.f39638b);
                return;
            case 2:
                xo xoVar = this.f39638b;
                xoVar.f42797b.dismiss();
                xoVar.finishFragment();
                return;
            case 3:
                xo xoVar2 = this.f39638b;
                xoVar2.M.setChecked(xoVar2.f42827x0.autotranslation);
                return;
            default:
                xo xoVar3 = this.f39638b;
                xoVar3.f42802e.setImageDrawable(xoVar3.f42817r);
                xoVar3.f42798b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = xoVar3.D0;
                if (user != null) {
                    user.photo = null;
                    xoVar3.getMessagesController().putUser(xoVar3.D0, true);
                }
                xoVar3.O0 = true;
                if (xoVar3.R0 == null) {
                    xoVar3.R0 = new org.telegram.ui.Components.xi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                xoVar3.f42798b0.f22711e.setTranslationX(-AndroidUtilities.dp(8.0f));
                xoVar3.f42798b0.f22711e.setAnimation(xoVar3.R0);
                return;
        }
    }
}
