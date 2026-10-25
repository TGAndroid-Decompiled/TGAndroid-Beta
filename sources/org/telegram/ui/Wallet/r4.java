package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class r4 implements View.OnAttachStateChangeListener {
    public final di.s f37157a;
    public final TL_wallet.walletTransaction[] f37158b;
    public final NotificationCenter.NotificationCenterDelegate f37159c;
    public final int d;
    public final Utilities.Callback2 e;
    public final j2[] f37160f;
    public final String[] h;
    public final boolean[] f37161n;

    public r4(di.s sVar, TL_wallet.walletTransaction[] wallettransactionArr, q4 q4Var, int i10, Utilities.Callback2 callback2, j2[] j2VarArr, String[] strArr, boolean[] zArr) {
        this.f37157a = sVar;
        this.f37158b = wallettransactionArr;
        this.f37159c = q4Var;
        this.d = i10;
        this.e = callback2;
        this.f37160f = j2VarArr;
        this.h = strArr;
        this.f37161n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f37157a.run(this.f37158b[0]);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f37159c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
        Utilities.Callback2 callback2 = this.e;
        if (callback2 != null) {
            this.f37160f[0].setOnDismissListener(new h(callback2, (Serializable) this.h, (Serializable) this.f37161n, 12));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f37159c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
    }
}
