package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class u4 implements View.OnAttachStateChangeListener {
    public final b4 f34991a;
    public final TL_wallet.walletTransaction[] f34992b;
    public final NotificationCenter.NotificationCenterDelegate f34993c;
    public final int d;
    public final Utilities.Callback2 e;
    public final k2[] f34994f;
    public final String[] h;
    public final boolean[] f34995n;

    public u4(b4 b4Var, TL_wallet.walletTransaction[] wallettransactionArr, t4 t4Var, int i10, Utilities.Callback2 callback2, k2[] k2VarArr, String[] strArr, boolean[] zArr) {
        this.f34991a = b4Var;
        this.f34992b = wallettransactionArr;
        this.f34993c = t4Var;
        this.d = i10;
        this.e = callback2;
        this.f34994f = k2VarArr;
        this.h = strArr;
        this.f34995n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f34991a.run(this.f34992b[0]);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f34993c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
        Utilities.Callback2 callback2 = this.e;
        if (callback2 != null) {
            this.f34994f[0].setOnDismissListener(new h(callback2, (Serializable) this.h, (Serializable) this.f34995n, 12));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f34993c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
    }
}
