package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class io implements Runnable {
    public final int f40220a;
    public final oo f40221b;

    public io(oo ooVar, int i10) {
        this.f40220a = i10;
        this.f40221b = ooVar;
    }

    @Override
    public final void run() {
        switch (this.f40220a) {
            case 0:
                oo.W(this.f40221b);
                return;
            case 1:
                oo.b0(this.f40221b);
                return;
            case 2:
                oo ooVar = this.f40221b;
                ooVar.f42131b.dismiss();
                ooVar.finishFragment();
                return;
            case 3:
                oo ooVar2 = this.f40221b;
                ooVar2.M.setChecked(ooVar2.f42158w0.autotranslation);
                return;
            default:
                oo ooVar3 = this.f40221b;
                ooVar3.e.setImageDrawable(ooVar3.f42150r);
                ooVar3.f42132b0.o(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = ooVar3.C0;
                if (user != null) {
                    user.photo = null;
                    ooVar3.getMessagesController().putUser(ooVar3.C0, true);
                }
                ooVar3.N0 = true;
                if (ooVar3.Q0 == null) {
                    ooVar3.Q0 = new org.telegram.ui.Components.yj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                ooVar3.f42132b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                ooVar3.f42132b0.e.setAnimation(ooVar3.Q0);
                return;
        }
    }
}
