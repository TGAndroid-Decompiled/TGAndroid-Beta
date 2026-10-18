package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class s4 implements View.OnAttachStateChangeListener {
    public final w3 f34870a;
    public final TL_wallet.walletTransaction[] f34871b;
    public final NotificationCenter.NotificationCenterDelegate f34872c;
    public final int d;
    public final Utilities.Callback2 e;
    public final k2[] f34873f;
    public final String[] h;
    public final boolean[] f34874n;

    public s4(w3 w3Var, TL_wallet.walletTransaction[] wallettransactionArr, r4 r4Var, int i10, Utilities.Callback2 callback2, k2[] k2VarArr, String[] strArr, boolean[] zArr) {
        this.f34870a = w3Var;
        this.f34871b = wallettransactionArr;
        this.f34872c = r4Var;
        this.d = i10;
        this.e = callback2;
        this.f34873f = k2VarArr;
        this.h = strArr;
        this.f34874n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f34870a.run(this.f34871b[0]);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f34872c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
        Utilities.Callback2 callback2 = this.e;
        if (callback2 != null) {
            this.f34873f[0].setOnDismissListener(new h(callback2, (Serializable) this.h, (Serializable) this.f34874n, 12));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f34872c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
    }
}
