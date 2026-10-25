package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class go implements Runnable {
    public final int f39727a;
    public final mo f39728b;

    public go(mo moVar, int i10) {
        this.f39727a = i10;
        this.f39728b = moVar;
    }

    @Override
    public final void run() {
        switch (this.f39727a) {
            case 0:
                mo.W(this.f39728b);
                return;
            case 1:
                mo.b0(this.f39728b);
                return;
            case 2:
                mo moVar = this.f39728b;
                moVar.f41596b.dismiss();
                moVar.finishFragment();
                return;
            case 3:
                mo moVar2 = this.f39728b;
                moVar2.M.setChecked(moVar2.f41623w0.autotranslation);
                return;
            default:
                mo moVar3 = this.f39728b;
                moVar3.e.setImageDrawable(moVar3.f41615r);
                moVar3.f41597b0.o(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = moVar3.C0;
                if (user != null) {
                    user.photo = null;
                    moVar3.getMessagesController().putUser(moVar3.C0, true);
                }
                moVar3.N0 = true;
                if (moVar3.Q0 == null) {
                    moVar3.Q0 = new org.telegram.ui.Components.xj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                moVar3.f41597b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                moVar3.f41597b0.e.setAnimation(moVar3.Q0);
                return;
        }
    }
}
