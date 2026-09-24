package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class jo implements Runnable {
    public final int f34829a;
    public final ro f34830b;

    public jo(ro roVar, int i10) {
        this.f34829a = i10;
        this.f34830b = roVar;
    }

    @Override
    public final void run() {
        switch (this.f34829a) {
            case 0:
                ro.V(this.f34830b);
                return;
            case 1:
                ro.a0(this.f34830b);
                return;
            case 2:
                ro roVar = this.f34830b;
                roVar.f37378b.dismiss();
                roVar.finishFragment();
                return;
            case 3:
                ro roVar2 = this.f34830b;
                roVar2.M.setChecked(roVar2.f37407x0.autotranslation);
                return;
            default:
                ro roVar3 = this.f34830b;
                roVar3.e.setImageDrawable(roVar3.f37397r);
                roVar3.f37379b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = roVar3.D0;
                if (user != null) {
                    user.photo = null;
                    roVar3.getMessagesController().putUser(roVar3.D0, true);
                }
                roVar3.O0 = true;
                if (roVar3.R0 == null) {
                    roVar3.R0 = new org.telegram.ui.Components.ij0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                roVar3.f37379b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                roVar3.f37379b0.e.setAnimation(roVar3.R0);
                return;
        }
    }
}
