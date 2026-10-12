package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class h5 extends c5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.f36326c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f36326c).f19950id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f36329g;
            if (z10) {
                if (z10) {
                    this.f36329g = false;
                    this.f36325b.removeObserver(this.f36324a, this.f36327e);
                }
                this.f36328f.accept(userFull);
            }
        }
    }
}
