package org.telegram.messenger;

import android.content.Context;
public final class z9 implements Runnable {
    public final int f20219a;
    public final Context f20220b;
    public final org.telegram.ui.ActionBar.b2 f20221c;

    public z9(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f20219a = i10;
        this.f20220b = context;
        this.f20221c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f20219a) {
            case 0:
                MessagesController.lambda$convertToMegaGroup$261(this.f20220b, this.f20221c);
                return;
            case 1:
                MessagesController.lambda$convertToGigaGroup$266(this.f20220b, this.f20221c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f20220b, this.f20221c);
                return;
        }
    }
}
