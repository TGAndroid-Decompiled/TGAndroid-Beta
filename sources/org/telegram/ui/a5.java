package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class a5 extends d5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f34877c).f18916id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f18917id == ((TLRPC.Chat) this.f34877c).f18916id && (z10 = this.f34879g)) {
            if (z10) {
                this.f34879g = false;
                this.f34876b.removeObserver(this.f34875a, this.e);
            }
            this.f34878f.accept(chatFull);
        }
    }
}
