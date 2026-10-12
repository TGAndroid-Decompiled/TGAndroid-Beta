package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class j4 implements View.OnAttachStateChangeListener {
    public final p3 f34916a;
    public final TL_wallet.walletTransaction[] f34917b;
    public final NotificationCenter.NotificationCenterDelegate f34918c;
    public final int d;
    public final Utilities.Callback2 f34919e;
    public final k2[] f34920f;
    public final String[] h;
    public final boolean[] f34921n;

    public j4(p3 p3Var, TL_wallet.walletTransaction[] wallettransactionArr, i4 i4Var, int i10, Utilities.Callback2 callback2, k2[] k2VarArr, String[] strArr, boolean[] zArr) {
        this.f34916a = p3Var;
        this.f34917b = wallettransactionArr;
        this.f34918c = i4Var;
        this.d = i10;
        this.f34919e = callback2;
        this.f34920f = k2VarArr;
        this.h = strArr;
        this.f34921n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f34916a.run(this.f34917b[0]);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f34918c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
        Utilities.Callback2 callback2 = this.f34919e;
        if (callback2 != null) {
            this.f34920f[0].setOnDismissListener(new l(callback2, this.h, this.f34921n, 11));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f34918c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
    }
}
