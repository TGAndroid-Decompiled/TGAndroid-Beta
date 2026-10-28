package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class r4 implements View.OnAttachStateChangeListener {
    public final di.s f37184a;
    public final TL_wallet.walletTransaction[] f37185b;
    public final NotificationCenter.NotificationCenterDelegate f37186c;
    public final int d;
    public final Utilities.Callback2 e;
    public final j2[] f37187f;
    public final String[] h;
    public final boolean[] f37188n;

    public r4(di.s sVar, TL_wallet.walletTransaction[] wallettransactionArr, q4 q4Var, int i10, Utilities.Callback2 callback2, j2[] j2VarArr, String[] strArr, boolean[] zArr) {
        this.f37184a = sVar;
        this.f37185b = wallettransactionArr;
        this.f37186c = q4Var;
        this.d = i10;
        this.e = callback2;
        this.f37187f = j2VarArr;
        this.h = strArr;
        this.f37188n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f37184a.run(this.f37185b[0]);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f37186c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).addWeakObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).addWeakObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
        Utilities.Callback2 callback2 = this.e;
        if (callback2 != null) {
            this.f37187f[0].setOnDismissListener(new h(callback2, (Serializable) this.h, (Serializable) this.f37188n, 12));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f37186c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
    }
}
