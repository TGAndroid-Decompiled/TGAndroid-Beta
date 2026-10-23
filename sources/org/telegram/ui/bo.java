package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class bo implements Runnable {
    public final int f35679a;
    public final io f35680b;

    public bo(io ioVar, int i10) {
        this.f35679a = i10;
        this.f35680b = ioVar;
    }

    @Override
    public final void run() {
        switch (this.f35679a) {
            case 0:
                io.V(this.f35680b);
                return;
            case 1:
                io.a0(this.f35680b);
                return;
            case 2:
                io ioVar = this.f35680b;
                ioVar.f38039b.dismiss();
                ioVar.finishFragment();
                return;
            case 3:
                io ioVar2 = this.f35680b;
                ioVar2.M.setChecked(ioVar2.f38068x0.autotranslation);
                return;
            default:
                io ioVar3 = this.f35680b;
                ioVar3.e.setImageDrawable(ioVar3.f38058r);
                ioVar3.f38040b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = ioVar3.D0;
                if (user != null) {
                    user.photo = null;
                    ioVar3.getMessagesController().putUser(ioVar3.D0, true);
                }
                ioVar3.O0 = true;
                if (ioVar3.R0 == null) {
                    ioVar3.R0 = new org.telegram.ui.Components.vj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                ioVar3.f38040b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                ioVar3.f38040b0.e.setAnimation(ioVar3.R0);
                return;
        }
    }
}
