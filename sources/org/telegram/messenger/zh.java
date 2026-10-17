package org.telegram.messenger;

import android.content.Context;
public final class zh implements Runnable {
    public final int f20249a;
    public final SecretChatHelper f20250b;
    public final Context f20251c;
    public final org.telegram.ui.ActionBar.b2 d;

    public zh(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f20249a = i10;
        this.f20250b = secretChatHelper;
        this.f20251c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f20249a) {
            case 0:
                this.f20250b.lambda$startSecretChat$27(this.f20251c, this.d);
                return;
            default:
                this.f20250b.lambda$startSecretChat$29(this.f20251c, this.d);
                return;
        }
    }
}
