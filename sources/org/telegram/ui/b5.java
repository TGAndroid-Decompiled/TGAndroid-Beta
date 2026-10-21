package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class b5 extends e5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f36548c).f20276id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f20277id == ((TLRPC.Chat) this.f36548c).f20276id && (z10 = this.f36550g)) {
            if (z10) {
                this.f36550g = false;
                this.f36547b.removeObserver(this.f36546a, this.e);
            }
            this.f36549f.accept(chatFull);
        }
    }
}
