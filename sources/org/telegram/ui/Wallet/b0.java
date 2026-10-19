package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.z70;
public final class b0 implements Runnable, NotificationCenter.NotificationCenterDelegate {
    public boolean f34004a;
    public final NotificationCenter f34005b;
    public final z70 f34006c;
    public final m0 d;

    public b0(NotificationCenter notificationCenter, z70 z70Var, m0 m0Var) {
        this.f34005b = notificationCenter;
        this.f34006c = z70Var;
        this.d = m0Var;
    }

    public final void a() {
        if (!this.f34004a) {
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
        if (this.f34004a) {
            return;
        }
        this.f34004a = true;
        AndroidUtilities.cancelRunOnUIThread(this);
        this.f34005b.removeObserver(this, NotificationCenter.walletUpdate);
        this.f34006c.run();
    }
}
