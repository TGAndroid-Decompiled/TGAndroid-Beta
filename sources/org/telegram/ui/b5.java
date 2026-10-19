package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class b5 extends e5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f36550c).f20275id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f20276id == ((TLRPC.Chat) this.f36550c).f20275id && (z10 = this.f36552g)) {
            if (z10) {
                this.f36552g = false;
                this.f36549b.removeObserver(this.f36548a, this.e);
            }
            this.f36551f.accept(chatFull);
        }
    }
}
