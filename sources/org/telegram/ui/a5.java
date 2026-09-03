package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class a5 extends d5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadFullChat(((TLRPC.Chat) this.f33325c).f19159id, this.d, false);
    }

    @Override
    public final void b(Object... objArr) {
        boolean z4;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.f19160id == ((TLRPC.Chat) this.f33325c).f19159id && (z4 = this.f33327g)) {
            if (z4) {
                this.f33327g = false;
                this.f33324b.removeObserver(this.f33323a, this.e);
            }
            this.f33326f.accept(chatFull);
        }
    }
}
