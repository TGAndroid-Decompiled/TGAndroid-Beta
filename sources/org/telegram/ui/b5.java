package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class b5 extends e5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f36552c).f20280id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f20281id == ((TLRPC.Chat) this.f36552c).f20280id && (z10 = this.f36554g)) {
            if (z10) {
                this.f36554g = false;
                this.f36551b.removeObserver(this.f36550a, this.e);
            }
            this.f36553f.accept(chatFull);
        }
    }
}
