package org.telegram.messenger;

import java.util.ArrayList;
public final class yh implements Runnable {
    public final int f22258a;
    public final SecretChatHelper f22259b;
    public final ArrayList f22260c;

    public yh(SecretChatHelper secretChatHelper, ArrayList arrayList, int i9) {
        this.f22258a = i9;
        this.f22259b = secretChatHelper;
        this.f22260c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f22258a) {
            case 0:
                this.f22259b.lambda$resendMessages$14(this.f22260c);
                return;
            default:
                this.f22259b.lambda$processPendingEncMessages$0(this.f22260c);
                return;
        }
    }
}
