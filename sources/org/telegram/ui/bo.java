package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class bo implements Runnable {
    public final int f36914a;
    public final ho f36915b;

    public bo(ho hoVar, int i9) {
        this.f36914a = i9;
        this.f36915b = hoVar;
    }

    @Override
    public final void run() {
        switch (this.f36914a) {
            case 0:
                ho.U(this.f36915b);
                return;
            case 1:
                ho.Z(this.f36915b);
                return;
            case 2:
                ho hoVar = this.f36915b;
                hoVar.f38837b.dismiss();
                hoVar.finishFragment();
                return;
            case 3:
                ho hoVar2 = this.f36915b;
                hoVar2.I.setChecked(hoVar2.f38861t0.autotranslation);
                return;
            default:
                ho hoVar3 = this.f36915b;
                hoVar3.f38842e.setImageDrawable(hoVar3.f38857r);
                hoVar3.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = hoVar3.f38870z0;
                if (user != null) {
                    user.photo = null;
                    hoVar3.getMessagesController().putUser(hoVar3.f38870z0, true);
                }
                hoVar3.K0 = true;
                if (hoVar3.N0 == null) {
                    int i9 = R.raw.camera_outline;
                    hoVar3.N0 = new org.telegram.ui.Components.mi0(i9, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                hoVar3.X.f24875e.setTranslationX(-AndroidUtilities.dp(8.0f));
                hoVar3.X.f24875e.setAnimation(hoVar3.N0);
                return;
        }
    }
}
