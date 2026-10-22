package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class b5 extends e5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f36551c).f20279id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f20280id == ((TLRPC.Chat) this.f36551c).f20279id && (z10 = this.f36553g)) {
            if (z10) {
                this.f36553g = false;
                this.f36550b.removeObserver(this.f36549a, this.e);
            }
            this.f36552f.accept(chatFull);
        }
    }
}
