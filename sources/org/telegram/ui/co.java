package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class co implements Runnable {

    public final int f37121a;

    public final jo f37122b;

    public co(jo joVar, int i10) {
        this.f37121a = i10;
        this.f37122b = joVar;
    }

    @Override
    public final void run() {
        switch (this.f37121a) {
            case 0:
                jo.V(this.f37122b);
                break;
            case 1:
                jo.a0(this.f37122b);
                break;
            case 2:
                jo joVar = this.f37122b;
                joVar.f39405b.dismiss();
                joVar.finishFragment();
                break;
            case 3:
                jo joVar2 = this.f37122b;
                joVar2.I.setChecked(joVar2.f39429t0.autotranslation);
                break;
            default:
                jo joVar3 = this.f37122b;
                joVar3.f39410e.setImageDrawable(joVar3.f39425r);
                joVar3.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = joVar3.f39438z0;
                if (user != null) {
                    user.photo = null;
                    joVar3.getMessagesController().putUser(joVar3.f39438z0, true);
                }
                joVar3.K0 = true;
                if (joVar3.N0 == null) {
                    joVar3.N0 = new org.telegram.ui.Components.oi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                joVar3.X.f24631e.setTranslationX(-AndroidUtilities.dp(8.0f));
                joVar3.X.f24631e.setAnimation(joVar3.N0);
                break;
        }
    }
}
