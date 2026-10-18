package org.telegram.messenger;

import android.content.Context;
public final class yh implements Runnable {
    public final int f20179a;
    public final SecretChatHelper f20180b;
    public final Context f20181c;
    public final org.telegram.ui.ActionBar.b2 d;

    public yh(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f20179a = i10;
        this.f20180b = secretChatHelper;
        this.f20181c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f20179a) {
            case 0:
                this.f20180b.lambda$startSecretChat$27(this.f20181c, this.d);
                return;
            default:
                this.f20180b.lambda$startSecretChat$29(this.f20181c, this.d);
                return;
        }
    }
}
