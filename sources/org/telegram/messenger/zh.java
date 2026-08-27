package org.telegram.messenger;

import android.content.Context;

public final class zh implements Runnable {

    public final int f22354a;

    public final SecretChatHelper f22355b;

    public final Context f22356c;
    public final org.telegram.ui.ActionBar.b2 d;

    public zh(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f22354a = i10;
        this.f22355b = secretChatHelper;
        this.f22356c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f22354a) {
            case 0:
                this.f22355b.lambda$startSecretChat$27(this.f22356c, this.d);
                break;
            default:
                this.f22355b.lambda$startSecretChat$29(this.f22356c, this.d);
                break;
        }
    }
}
