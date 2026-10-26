package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class h5 extends c5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.f38266c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f38266c).f22176id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f38268g;
            if (z10) {
                if (z10) {
                    this.f38268g = false;
                    this.f38265b.removeObserver(this.f38264a, this.e);
                }
                this.f38267f.accept(userFull);
            }
        }
    }
}
