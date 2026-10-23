package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class u4 implements View.OnAttachStateChangeListener {
    public final b4 f34996a;
    public final TL_wallet.walletTransaction[] f34997b;
    public final NotificationCenter.NotificationCenterDelegate f34998c;
    public final int d;
    public final Utilities.Callback2 e;
    public final k2[] f34999f;
    public final String[] h;
    public final boolean[] f35000n;

    public u4(b4 b4Var, TL_wallet.walletTransaction[] wallettransactionArr, t4 t4Var, int i10, Utilities.Callback2 callback2, k2[] k2VarArr, String[] strArr, boolean[] zArr) {
        this.f34996a = b4Var;
        this.f34997b = wallettransactionArr;
        this.f34998c = t4Var;
        this.d = i10;
        this.e = callback2;
        this.f34999f = k2VarArr;
        this.h = strArr;
        this.f35000n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f34996a.run(this.f34997b[0]);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f34998c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
        Utilities.Callback2 callback2 = this.e;
        if (callback2 != null) {
            this.f34999f[0].setOnDismissListener(new h(callback2, (Serializable) this.h, (Serializable) this.f35000n, 12));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f34998c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
    }
}
