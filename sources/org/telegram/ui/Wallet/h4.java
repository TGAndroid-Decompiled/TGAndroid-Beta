package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class h4 implements View.OnAttachStateChangeListener {
    public final n3 f34986a;
    public final TL_wallet.walletTransaction[] f34987b;
    public final NotificationCenter.NotificationCenterDelegate f34988c;
    public final int d;
    public final Utilities.Callback2 f34989e;
    public final i2[] f34990f;
    public final String[] h;
    public final boolean[] f34991n;

    public h4(n3 n3Var, TL_wallet.walletTransaction[] wallettransactionArr, g4 g4Var, int i10, Utilities.Callback2 callback2, i2[] i2VarArr, String[] strArr, boolean[] zArr) {
        this.f34986a = n3Var;
        this.f34987b = wallettransactionArr;
        this.f34988c = g4Var;
        this.d = i10;
        this.f34989e = callback2;
        this.f34990f = i2VarArr;
        this.h = strArr;
        this.f34991n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f34986a.run(this.f34987b[0]);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f34988c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
        Utilities.Callback2 callback2 = this.f34989e;
        if (callback2 != null) {
            this.f34990f[0].setOnDismissListener(new k(callback2, this.h, this.f34991n, 11));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f34988c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
    }
}
