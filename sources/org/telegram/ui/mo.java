package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class mo implements Runnable {
    public final int f39953a;
    public final uo f39954b;

    public mo(uo uoVar, int i10) {
        this.f39953a = i10;
        this.f39954b = uoVar;
    }

    @Override
    public final void run() {
        switch (this.f39953a) {
            case 0:
                uo.V(this.f39954b);
                return;
            case 1:
                uo.a0(this.f39954b);
                return;
            case 2:
                uo uoVar = this.f39954b;
                uoVar.f42464b.dismiss();
                uoVar.finishFragment();
                return;
            case 3:
                uo uoVar2 = this.f39954b;
                uoVar2.M.setChecked(uoVar2.f42494x0.autotranslation);
                return;
            default:
                uo uoVar3 = this.f39954b;
                uoVar3.f42469e.setImageDrawable(uoVar3.f42484r);
                uoVar3.f42465b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = uoVar3.D0;
                if (user != null) {
                    user.photo = null;
                    uoVar3.getMessagesController().putUser(uoVar3.D0, true);
                }
                uoVar3.O0 = true;
                if (uoVar3.R0 == null) {
                    uoVar3.R0 = new org.telegram.ui.Components.ck0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                uoVar3.f42465b0.f22720e.setTranslationX(-AndroidUtilities.dp(8.0f));
                uoVar3.f42465b0.f22720e.setAnimation(uoVar3.R0);
                return;
        }
    }
}
