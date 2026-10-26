package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.wb0;
public final class a0 implements Runnable, NotificationCenter.NotificationCenterDelegate {
    public boolean f36332a;
    public final NotificationCenter f36333b;
    public final wb0 f36334c;
    public final l0 d;

    public a0(NotificationCenter notificationCenter, wb0 wb0Var, l0 l0Var) {
        this.f36333b = notificationCenter;
        this.f36334c = wb0Var;
        this.d = l0Var;
    }

    public final void a() {
        if (!this.f36332a) {
            l0 l0Var = this.d;
            if (l0Var.e != null) {
                ArrayList arrayList = l0Var.G;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((h0) obj).d) {
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
        if (this.f36332a) {
            return;
        }
        this.f36332a = true;
        AndroidUtilities.cancelRunOnUIThread(this);
        this.f36333b.removeObserver(this, NotificationCenter.walletUpdate);
        this.f36334c.run();
    }
}
