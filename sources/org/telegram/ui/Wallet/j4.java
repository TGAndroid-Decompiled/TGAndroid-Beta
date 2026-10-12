package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class j4 implements View.OnAttachStateChangeListener {
    public final p3 f34918a;
    public final TL_wallet.walletTransaction[] f34919b;
    public final NotificationCenter.NotificationCenterDelegate f34920c;
    public final int d;
    public final Utilities.Callback2 f34921e;
    public final k2[] f34922f;
    public final String[] h;
    public final boolean[] f34923n;

    public j4(p3 p3Var, TL_wallet.walletTransaction[] wallettransactionArr, i4 i4Var, int i10, Utilities.Callback2 callback2, k2[] k2VarArr, String[] strArr, boolean[] zArr) {
        this.f34918a = p3Var;
        this.f34919b = wallettransactionArr;
        this.f34920c = i4Var;
        this.d = i10;
        this.f34921e = callback2;
        this.f34922f = k2VarArr;
        this.h = strArr;
        this.f34923n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f34918a.run(this.f34919b[0]);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f34920c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
        Utilities.Callback2 callback2 = this.f34921e;
        if (callback2 != null) {
            this.f34922f[0].setOnDismissListener(new l(callback2, this.h, this.f34923n, 11));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f34920c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
    }
}
