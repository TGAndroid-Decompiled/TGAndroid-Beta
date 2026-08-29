package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class fo implements Runnable {
    public final int f38216a;
    public final ko f38217b;

    public fo(ko koVar, int i10) {
        this.f38216a = i10;
        this.f38217b = koVar;
    }

    @Override
    public final void run() {
        switch (this.f38216a) {
            case 0:
                ko.V(this.f38217b);
                return;
            case 1:
                ko.a0(this.f38217b);
                return;
            case 2:
                ko koVar = this.f38217b;
                koVar.f39940b.dismiss();
                koVar.finishFragment();
                return;
            case 3:
                ko koVar2 = this.f38217b;
                koVar2.I.setChecked(koVar2.f39964t0.autotranslation);
                return;
            default:
                ko koVar3 = this.f38217b;
                koVar3.f39945e.setImageDrawable(koVar3.f39960r);
                koVar3.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = koVar3.f39973z0;
                if (user != null) {
                    user.photo = null;
                    koVar3.getMessagesController().putUser(koVar3.f39973z0, true);
                }
                koVar3.K0 = true;
                if (koVar3.N0 == null) {
                    int i10 = R.raw.camera_outline;
                    koVar3.N0 = new org.telegram.ui.Components.xi0(i10, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                koVar3.X.f24711e.setTranslationX(-AndroidUtilities.dp(8.0f));
                koVar3.X.f24711e.setAnimation(koVar3.N0);
                return;
        }
    }
}
