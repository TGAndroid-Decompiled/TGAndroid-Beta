package org.telegram.messenger;

import android.content.Context;
public final class zh implements Runnable {
    public final int f20251a;
    public final SecretChatHelper f20252b;
    public final Context f20253c;
    public final org.telegram.ui.ActionBar.b2 d;

    public zh(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f20251a = i10;
        this.f20252b = secretChatHelper;
        this.f20253c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f20251a) {
            case 0:
                this.f20252b.lambda$startSecretChat$27(this.f20253c, this.d);
                return;
            default:
                this.f20252b.lambda$startSecretChat$29(this.f20253c, this.d);
                return;
        }
    }
}
