package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class a5 extends d5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f36469c).f20344id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z10;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f20345id == ((TLRPC.Chat) this.f36469c).f20344id && (z10 = this.f36471g)) {
            if (z10) {
                this.f36471g = false;
                this.f36468b.removeObserver(this.f36467a, this.e);
            }
            this.f36470f.accept(chatFull);
        }
    }
}
