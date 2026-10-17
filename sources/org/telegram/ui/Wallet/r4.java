package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class r4 implements View.OnAttachStateChangeListener {
    public final v3 f34835a;
    public final TL_wallet.walletTransaction[] f34836b;
    public final NotificationCenter.NotificationCenterDelegate f34837c;
    public final int d;
    public final Utilities.Callback2 e;
    public final k2[] f34838f;
    public final String[] h;
    public final boolean[] f34839n;

    public r4(v3 v3Var, TL_wallet.walletTransaction[] wallettransactionArr, q4 q4Var, int i10, Utilities.Callback2 callback2, k2[] k2VarArr, String[] strArr, boolean[] zArr) {
        this.f34835a = v3Var;
        this.f34836b = wallettransactionArr;
        this.f34837c = q4Var;
        this.d = i10;
        this.e = callback2;
        this.f34838f = k2VarArr;
        this.h = strArr;
        this.f34839n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f34835a.run(this.f34836b[0]);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f34837c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
        Utilities.Callback2 callback2 = this.e;
        if (callback2 != null) {
            this.f34838f[0].setOnDismissListener(new h(callback2, (Serializable) this.h, (Serializable) this.f34839n, 12));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f34837c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
    }
}
