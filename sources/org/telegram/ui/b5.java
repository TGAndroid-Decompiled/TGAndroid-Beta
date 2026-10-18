package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class b5 extends e5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f36362c).f20272id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f20273id == ((TLRPC.Chat) this.f36362c).f20272id && (z10 = this.f36364g)) {
            if (z10) {
                this.f36364g = false;
                this.f36361b.removeObserver(this.f36360a, this.e);
            }
            this.f36363f.accept(chatFull);
        }
    }
}
