package org.telegram.messenger;

import android.content.Context;
public final class zh implements Runnable {
    public final int f20248a;
    public final SecretChatHelper f20249b;
    public final Context f20250c;
    public final org.telegram.ui.ActionBar.b2 d;

    public zh(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f20248a = i10;
        this.f20249b = secretChatHelper;
        this.f20250c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f20248a) {
            case 0:
                this.f20249b.lambda$startSecretChat$27(this.f20250c, this.d);
                return;
            default:
                this.f20249b.lambda$startSecretChat$29(this.f20250c, this.d);
                return;
        }
    }
}
