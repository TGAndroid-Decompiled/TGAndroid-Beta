package org.telegram.ui.Wallet;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u61;
public final class g3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f34266a;
    public final Object f34267b;

    public g3(Object obj, int i10) {
        this.f34266a = i10;
        this.f34267b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        u61 u61Var;
        switch (this.f34266a) {
            case 0:
                l3 l3Var = (l3) this.f34267b;
                l3Var.getClass();
                if (i10 == NotificationCenter.userInfoDidLoad && i11 == l3Var.f34486w0 && l3Var.f34488x0 != 0 && objArr.length > 1) {
                    Object obj = objArr[0];
                    if ((obj instanceof Long) && ((Long) obj).longValue() == l3Var.f34488x0) {
                        l3Var.p(l3.h((TLRPC.UserFull) objArr[1]), true);
                        return;
                    }
                    return;
                }
                return;
            default:
                w9 w9Var = (w9) this.f34267b;
                if (!w9Var.f35047n && (u61Var = w9Var.f31197a) != null) {
                    u61Var.W2.N(true);
                    return;
                }
                return;
        }
    }
}
