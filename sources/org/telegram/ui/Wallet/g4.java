package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class g4 implements View.OnAttachStateChangeListener {
    public final m3 f34926a;
    public final TL_wallet.walletTransaction[] f34927b;
    public final NotificationCenter.NotificationCenterDelegate f34928c;
    public final int d;
    public final Utilities.Callback2 f34929e;
    public final i2[] f34930f;
    public final String[] h;
    public final boolean[] f34931n;

    public g4(m3 m3Var, TL_wallet.walletTransaction[] wallettransactionArr, f4 f4Var, int i10, Utilities.Callback2 callback2, i2[] i2VarArr, String[] strArr, boolean[] zArr) {
        this.f34926a = m3Var;
        this.f34927b = wallettransactionArr;
        this.f34928c = f4Var;
        this.d = i10;
        this.f34929e = callback2;
        this.f34930f = i2VarArr;
        this.h = strArr;
        this.f34931n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f34926a.run(this.f34927b[0]);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f34928c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
        Utilities.Callback2 callback2 = this.f34929e;
        if (callback2 != null) {
            this.f34930f[0].setOnDismissListener(new k(callback2, this.h, this.f34931n, 11));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f34928c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
    }
}
