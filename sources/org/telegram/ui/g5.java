package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class g5 extends b5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.f32792c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f32792c).f19331id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z4 = this.f32794g;
            if (z4) {
                if (z4) {
                    this.f32794g = false;
                    this.f32791b.removeObserver(this.f32790a, this.e);
                }
                this.f32793f.accept(userFull);
            }
        }
    }
}
