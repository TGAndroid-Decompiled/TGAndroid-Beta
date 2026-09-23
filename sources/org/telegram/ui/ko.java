package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ko implements Runnable {
    public final int f34772a;
    public final so f34773b;

    public ko(so soVar, int i10) {
        this.f34772a = i10;
        this.f34773b = soVar;
    }

    @Override
    public final void run() {
        switch (this.f34772a) {
            case 0:
                so.V(this.f34773b);
                return;
            case 1:
                so.a0(this.f34773b);
                return;
            case 2:
                so soVar = this.f34773b;
                soVar.f37345b.dismiss();
                soVar.finishFragment();
                return;
            case 3:
                so soVar2 = this.f34773b;
                soVar2.M.setChecked(soVar2.f37374x0.autotranslation);
                return;
            default:
                so soVar3 = this.f34773b;
                soVar3.e.setImageDrawable(soVar3.f37364r);
                soVar3.f37346b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = soVar3.D0;
                if (user != null) {
                    user.photo = null;
                    soVar3.getMessagesController().putUser(soVar3.D0, true);
                }
                soVar3.O0 = true;
                if (soVar3.R0 == null) {
                    soVar3.R0 = new org.telegram.ui.Components.yi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                soVar3.f37346b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                soVar3.f37346b0.e.setAnimation(soVar3.R0);
                return;
        }
    }
}
