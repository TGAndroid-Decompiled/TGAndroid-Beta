package org.telegram.messenger;

import android.content.Context;
public final class yh implements Runnable {
    public final int f20173a;
    public final SecretChatHelper f20174b;
    public final Context f20175c;
    public final org.telegram.ui.ActionBar.b2 d;

    public yh(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f20173a = i10;
        this.f20174b = secretChatHelper;
        this.f20175c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f20173a) {
            case 0:
                this.f20174b.lambda$startSecretChat$27(this.f20175c, this.d);
                return;
            default:
                this.f20174b.lambda$startSecretChat$29(this.f20175c, this.d);
                return;
        }
    }
}
