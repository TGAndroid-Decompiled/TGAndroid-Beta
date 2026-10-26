package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class r4 implements View.OnAttachStateChangeListener {
    public final di.s f37160a;
    public final TL_wallet.walletTransaction[] f37161b;
    public final NotificationCenter.NotificationCenterDelegate f37162c;
    public final int d;
    public final Utilities.Callback2 e;
    public final j2[] f37163f;
    public final String[] h;
    public final boolean[] f37164n;

    public r4(di.s sVar, TL_wallet.walletTransaction[] wallettransactionArr, q4 q4Var, int i10, Utilities.Callback2 callback2, j2[] j2VarArr, String[] strArr, boolean[] zArr) {
        this.f37160a = sVar;
        this.f37161b = wallettransactionArr;
        this.f37162c = q4Var;
        this.d = i10;
        this.e = callback2;
        this.f37163f = j2VarArr;
        this.h = strArr;
        this.f37164n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f37160a.run(this.f37161b[0]);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f37162c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
        Utilities.Callback2 callback2 = this.e;
        if (callback2 != null) {
            this.f37163f[0].setOnDismissListener(new h(callback2, (Serializable) this.h, (Serializable) this.f37164n, 12));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f37162c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
    }
}
