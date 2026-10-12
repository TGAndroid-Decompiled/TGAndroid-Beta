package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class h4 implements View.OnAttachStateChangeListener {
    public final n3 f33230a;
    public final TL_wallet.walletTransaction[] f33231b;
    public final NotificationCenter.NotificationCenterDelegate f33232c;
    public final int d;
    public final Utilities.Callback2 e;
    public final i2[] f33233f;
    public final String[] h;
    public final boolean[] f33234n;

    public h4(n3 n3Var, TL_wallet.walletTransaction[] wallettransactionArr, g4 g4Var, int i10, Utilities.Callback2 callback2, i2[] i2VarArr, String[] strArr, boolean[] zArr) {
        this.f33230a = n3Var;
        this.f33231b = wallettransactionArr;
        this.f33232c = g4Var;
        this.d = i10;
        this.e = callback2;
        this.f33233f = i2VarArr;
        this.h = strArr;
        this.f33234n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f33230a.run(this.f33231b[0]);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f33232c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
        Utilities.Callback2 callback2 = this.e;
        if (callback2 != null) {
            this.f33233f[0].setOnDismissListener(new k(callback2, this.h, this.f33234n, 11));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f33232c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
    }
}
