package org.telegram.messenger;

import android.content.Context;
public final class z9 implements Runnable {
    public final int f20225a;
    public final Context f20226b;
    public final org.telegram.ui.ActionBar.b2 f20227c;

    public z9(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f20225a = i10;
        this.f20226b = context;
        this.f20227c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f20225a) {
            case 0:
                MessagesController.lambda$convertToMegaGroup$261(this.f20226b, this.f20227c);
                return;
            case 1:
                MessagesController.lambda$convertToGigaGroup$266(this.f20226b, this.f20227c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f20226b, this.f20227c);
                return;
        }
    }
}
