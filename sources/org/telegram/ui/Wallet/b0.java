package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.b80;
public final class b0 implements Runnable, NotificationCenter.NotificationCenterDelegate {
    public boolean f33992a;
    public final NotificationCenter f33993b;
    public final b80 f33994c;
    public final m0 d;

    public b0(NotificationCenter notificationCenter, b80 b80Var, m0 m0Var) {
        this.f33993b = notificationCenter;
        this.f33994c = b80Var;
        this.d = m0Var;
    }

    public final void a() {
        if (!this.f33992a) {
            m0 m0Var = this.d;
            if (m0Var.e != null) {
                ArrayList arrayList = m0Var.G;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((i0) obj).d) {
                        return;
                    }
                }
                run();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.walletUpdate) {
            a();
        }
    }

    @Override
    public final void run() {
        if (this.f33992a) {
            return;
        }
        this.f33992a = true;
        AndroidUtilities.cancelRunOnUIThread(this);
        this.f33993b.removeObserver(this, NotificationCenter.walletUpdate);
        this.f33994c.run();
    }
}
