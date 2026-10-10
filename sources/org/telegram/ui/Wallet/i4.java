package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class i4 implements View.OnAttachStateChangeListener {
    public final o3 f35077a;
    public final TL_wallet.walletTransaction[] f35078b;
    public final NotificationCenter.NotificationCenterDelegate f35079c;
    public final int d;
    public final Utilities.Callback2 f35080e;
    public final j2[] f35081f;
    public final String[] h;
    public final boolean[] f35082n;

    public i4(o3 o3Var, TL_wallet.walletTransaction[] wallettransactionArr, h4 h4Var, int i10, Utilities.Callback2 callback2, j2[] j2VarArr, String[] strArr, boolean[] zArr) {
        this.f35077a = o3Var;
        this.f35078b = wallettransactionArr;
        this.f35079c = h4Var;
        this.d = i10;
        this.f35080e = callback2;
        this.f35081f = j2VarArr;
        this.h = strArr;
        this.f35082n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f35077a.run(this.f35078b[0]);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f35079c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
        Utilities.Callback2 callback2 = this.f35080e;
        if (callback2 != null) {
            this.f35081f[0].setOnDismissListener(new l(callback2, this.h, this.f35082n, 11));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f35079c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
    }
}
