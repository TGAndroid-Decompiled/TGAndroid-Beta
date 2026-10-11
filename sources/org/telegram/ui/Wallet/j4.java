package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class j4 implements View.OnAttachStateChangeListener {
    public final p3 f35141a;
    public final TL_wallet.walletTransaction[] f35142b;
    public final NotificationCenter.NotificationCenterDelegate f35143c;
    public final int d;
    public final Utilities.Callback2 f35144e;
    public final k2[] f35145f;
    public final String[] h;
    public final boolean[] f35146n;

    public j4(p3 p3Var, TL_wallet.walletTransaction[] wallettransactionArr, i4 i4Var, int i10, Utilities.Callback2 callback2, k2[] k2VarArr, String[] strArr, boolean[] zArr) {
        this.f35141a = p3Var;
        this.f35142b = wallettransactionArr;
        this.f35143c = i4Var;
        this.d = i10;
        this.f35144e = callback2;
        this.f35145f = k2VarArr;
        this.h = strArr;
        this.f35146n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f35141a.run(this.f35142b[0]);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f35143c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
        Utilities.Callback2 callback2 = this.f35144e;
        if (callback2 != null) {
            this.f35145f[0].setOnDismissListener(new m(callback2, this.h, this.f35146n, 11));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f35143c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
    }
}
