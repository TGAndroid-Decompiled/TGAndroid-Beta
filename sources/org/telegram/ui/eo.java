package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class eo implements Runnable {
    public final int f36573a;
    public final ko f36574b;

    public eo(ko koVar, int i10) {
        this.f36573a = i10;
        this.f36574b = koVar;
    }

    @Override
    public final void run() {
        switch (this.f36573a) {
            case 0:
                ko.V(this.f36574b);
                return;
            case 1:
                ko.a0(this.f36574b);
                return;
            case 2:
                ko koVar = this.f36574b;
                koVar.f38585b.dismiss();
                koVar.finishFragment();
                return;
            case 3:
                ko koVar2 = this.f36574b;
                koVar2.M.setChecked(koVar2.f38614x0.autotranslation);
                return;
            default:
                ko koVar3 = this.f36574b;
                koVar3.e.setImageDrawable(koVar3.f38604r);
                koVar3.f38586b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = koVar3.D0;
                if (user != null) {
                    user.photo = null;
                    koVar3.getMessagesController().putUser(koVar3.D0, true);
                }
                koVar3.O0 = true;
                if (koVar3.R0 == null) {
                    koVar3.R0 = new org.telegram.ui.Components.uj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                koVar3.f38586b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                koVar3.f38586b0.e.setAnimation(koVar3.R0);
                return;
        }
    }
}
