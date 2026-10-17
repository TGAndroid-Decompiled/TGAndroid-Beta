package org.telegram.messenger;

import android.content.Context;
public final class z9 implements Runnable {
    public final int f20218a;
    public final Context f20219b;
    public final org.telegram.ui.ActionBar.b2 f20220c;

    public z9(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f20218a = i10;
        this.f20219b = context;
        this.f20220c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f20218a) {
            case 0:
                MessagesController.lambda$convertToMegaGroup$261(this.f20219b, this.f20220c);
                return;
            case 1:
                MessagesController.lambda$convertToGigaGroup$266(this.f20219b, this.f20220c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f20219b, this.f20220c);
                return;
        }
    }
}
