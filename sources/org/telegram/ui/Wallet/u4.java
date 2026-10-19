package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class u4 implements View.OnAttachStateChangeListener {
    public final b4 f34985a;
    public final TL_wallet.walletTransaction[] f34986b;
    public final NotificationCenter.NotificationCenterDelegate f34987c;
    public final int d;
    public final Utilities.Callback2 e;
    public final k2[] f34988f;
    public final String[] h;
    public final boolean[] f34989n;

    public u4(b4 b4Var, TL_wallet.walletTransaction[] wallettransactionArr, t4 t4Var, int i10, Utilities.Callback2 callback2, k2[] k2VarArr, String[] strArr, boolean[] zArr) {
        this.f34985a = b4Var;
        this.f34986b = wallettransactionArr;
        this.f34987c = t4Var;
        this.d = i10;
        this.e = callback2;
        this.f34988f = k2VarArr;
        this.h = strArr;
        this.f34989n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f34985a.run(this.f34986b[0]);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f34987c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
        Utilities.Callback2 callback2 = this.e;
        if (callback2 != null) {
            this.f34988f[0].setOnDismissListener(new h(callback2, (Serializable) this.h, (Serializable) this.f34989n, 12));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f34987c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
    }
}
