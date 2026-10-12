package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class a5 extends d5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f35148c).f19216id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f19217id == ((TLRPC.Chat) this.f35148c).f19216id && (z10 = this.f35150g)) {
            if (z10) {
                this.f35150g = false;
                this.f35147b.removeObserver(this.f35146a, this.e);
            }
            this.f35149f.accept(chatFull);
        }
    }
}
