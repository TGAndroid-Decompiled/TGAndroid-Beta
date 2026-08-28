package org.telegram.messenger;

import android.content.Context;
public final class y9 implements Runnable {
    public final int f22226a;
    public final Context f22227b;
    public final org.telegram.ui.ActionBar.c2 f22228c;

    public y9(int i9, Context context, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f22226a = i9;
        this.f22227b = context;
        this.f22228c = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f22226a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f22227b, this.f22228c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f22227b, this.f22228c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f22227b, this.f22228c);
                return;
        }
    }
}
