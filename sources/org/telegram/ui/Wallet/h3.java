package org.telegram.ui.Wallet;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u61;
public final class h3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f34264a;
    public final Object f34265b;

    public h3(Object obj, int i10) {
        this.f34264a = i10;
        this.f34265b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        u61 u61Var;
        switch (this.f34264a) {
            case 0:
                m3 m3Var = (m3) this.f34265b;
                m3Var.getClass();
                if (i10 == NotificationCenter.userInfoDidLoad && i11 == m3Var.f34522w0 && m3Var.f34524x0 != 0 && objArr.length > 1) {
                    Object obj = objArr[0];
                    if ((obj instanceof Long) && ((Long) obj).longValue() == m3Var.f34524x0) {
                        m3Var.p(m3.h((TLRPC.UserFull) objArr[1]), true);
                        return;
                    }
                    return;
                }
                return;
            default:
                r9 r9Var = (r9) this.f34265b;
                if (!r9Var.f34791n && (u61Var = r9Var.f31190a) != null) {
                    u61Var.W2.N(true);
                    return;
                }
                return;
        }
    }
}
