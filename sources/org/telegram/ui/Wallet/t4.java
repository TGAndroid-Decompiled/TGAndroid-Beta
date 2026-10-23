package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class t4 implements View.OnAttachStateChangeListener {
    public final ci.s f35208a;
    public final TL_wallet.walletTransaction[] f35209b;
    public final NotificationCenter.NotificationCenterDelegate f35210c;
    public final int d;
    public final Utilities.Callback2 e;
    public final j2[] f35211f;
    public final String[] h;
    public final boolean[] f35212n;

    public t4(ci.s sVar, TL_wallet.walletTransaction[] wallettransactionArr, s4 s4Var, int i10, Utilities.Callback2 callback2, j2[] j2VarArr, String[] strArr, boolean[] zArr) {
        this.f35208a = sVar;
        this.f35209b = wallettransactionArr;
        this.f35210c = s4Var;
        this.d = i10;
        this.e = callback2;
        this.f35211f = j2VarArr;
        this.h = strArr;
        this.f35212n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f35208a.run(this.f35209b[0]);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f35210c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
        Utilities.Callback2 callback2 = this.e;
        if (callback2 != null) {
            this.f35211f[0].setOnDismissListener(new h(callback2, (Serializable) this.h, (Serializable) this.f35212n, 12));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f35210c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
    }
}
