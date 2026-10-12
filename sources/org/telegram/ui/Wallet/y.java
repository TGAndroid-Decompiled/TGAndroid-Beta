package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.wc0;
public final class y implements Runnable, NotificationCenter.NotificationCenterDelegate {
    public boolean f33859a;
    public final NotificationCenter f33860b;
    public final wc0 f33861c;
    public final j0 d;

    public y(NotificationCenter notificationCenter, wc0 wc0Var, j0 j0Var) {
        this.f33860b = notificationCenter;
        this.f33861c = wc0Var;
        this.d = j0Var;
    }

    public final void a() {
        if (!this.f33859a) {
            j0 j0Var = this.d;
            if (j0Var.e != null) {
                ArrayList arrayList = j0Var.C;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((f0) obj).d) {
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
        if (this.f33859a) {
            return;
        }
        this.f33859a = true;
        AndroidUtilities.cancelRunOnUIThread(this);
        this.f33860b.removeObserver(this, NotificationCenter.walletUpdate);
        this.f33861c.run();
    }
}
