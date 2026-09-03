package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class lo implements Runnable {
    public final int f35811a;
    public final ro f35812b;

    public lo(ro roVar, int i10) {
        this.f35811a = i10;
        this.f35812b = roVar;
    }

    @Override
    public final void run() {
        switch (this.f35811a) {
            case 0:
                ro.V(this.f35812b);
                return;
            case 1:
                ro.a0(this.f35812b);
                return;
            case 2:
                ro roVar = this.f35812b;
                roVar.f37902b.dismiss();
                roVar.finishFragment();
                return;
            case 3:
                ro roVar2 = this.f35812b;
                roVar2.J.setChecked(roVar2.f37926u0.autotranslation);
                return;
            default:
                ro roVar3 = this.f35812b;
                roVar3.e.setImageDrawable(roVar3.f37921r);
                roVar3.Y.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = roVar3.A0;
                if (user != null) {
                    user.photo = null;
                    roVar3.getMessagesController().putUser(roVar3.A0, true);
                }
                roVar3.L0 = true;
                if (roVar3.O0 == null) {
                    roVar3.O0 = new org.telegram.ui.Components.gj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                roVar3.Y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                roVar3.Y.e.setAnimation(roVar3.O0);
                return;
        }
    }
}
