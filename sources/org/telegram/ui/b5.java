package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class b5 extends e5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f36541c).f20273id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f20274id == ((TLRPC.Chat) this.f36541c).f20273id && (z10 = this.f36543g)) {
            if (z10) {
                this.f36543g = false;
                this.f36540b.removeObserver(this.f36539a, this.e);
            }
            this.f36542f.accept(chatFull);
        }
    }
}
