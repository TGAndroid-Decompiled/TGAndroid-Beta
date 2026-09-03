package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class jo implements Runnable {
    public final int f38088a;
    public final po f38089b;

    public jo(po poVar, int i10) {
        this.f38088a = i10;
        this.f38089b = poVar;
    }

    @Override
    public final void run() {
        switch (this.f38088a) {
            case 0:
                po.V(this.f38089b);
                return;
            case 1:
                po.a0(this.f38089b);
                return;
            case 2:
                po poVar = this.f38089b;
                poVar.f40058b.dismiss();
                poVar.finishFragment();
                return;
            case 3:
                po poVar2 = this.f38089b;
                poVar2.J.setChecked(poVar2.f40083u0.autotranslation);
                return;
            default:
                po poVar3 = this.f38089b;
                poVar3.f40063e.setImageDrawable(poVar3.f40078r);
                poVar3.Y.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = poVar3.A0;
                if (user != null) {
                    user.photo = null;
                    poVar3.getMessagesController().putUser(poVar3.A0, true);
                }
                poVar3.L0 = true;
                if (poVar3.O0 == null) {
                    poVar3.O0 = new org.telegram.ui.Components.hj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                poVar3.Y.f23315e.setTranslationX(-AndroidUtilities.dp(8.0f));
                poVar3.Y.f23315e.setAnimation(poVar3.O0);
                return;
        }
    }
}
