package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class e5 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.f40332c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f40332c).f18482id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f40334g;
            if (z10) {
                if (z10) {
                    this.f40334g = false;
                    this.f40331b.removeObserver(this.f40330a, this.e);
                }
                this.f40333f.accept(userFull);
            }
        }
    }
}
