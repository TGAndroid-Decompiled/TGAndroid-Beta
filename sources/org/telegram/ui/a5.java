package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class a5 extends d5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f36502c).f20343id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f20344id == ((TLRPC.Chat) this.f36502c).f20343id && (z10 = this.f36504g)) {
            if (z10) {
                this.f36504g = false;
                this.f36501b.removeObserver(this.f36500a, this.e);
            }
            this.f36503f.accept(chatFull);
        }
    }
}
