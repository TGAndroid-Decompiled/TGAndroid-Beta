package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.uf0;
public final class a0 implements Runnable, NotificationCenter.NotificationCenterDelegate {
    public boolean f34665a;
    public final NotificationCenter f34666b;
    public final uf0 f34667c;
    public final l0 d;

    public a0(NotificationCenter notificationCenter, uf0 uf0Var, l0 l0Var) {
        this.f34666b = notificationCenter;
        this.f34667c = uf0Var;
        this.d = l0Var;
    }

    public final void a() {
        if (!this.f34665a) {
            l0 l0Var = this.d;
            if (l0Var.f35222e != null) {
                ArrayList arrayList = l0Var.C;
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
        if (this.f34665a) {
            return;
        }
        this.f34665a = true;
        AndroidUtilities.cancelRunOnUIThread(this);
        this.f34666b.removeObserver(this, NotificationCenter.walletUpdate);
        this.f34667c.run();
    }
}
