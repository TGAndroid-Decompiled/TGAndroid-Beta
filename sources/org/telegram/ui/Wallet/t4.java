package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class t4 implements View.OnAttachStateChangeListener {
    public final x3 f34882a;
    public final TL_wallet.walletTransaction[] f34883b;
    public final NotificationCenter.NotificationCenterDelegate f34884c;
    public final int d;
    public final Utilities.Callback2 e;
    public final k2[] f34885f;
    public final String[] h;
    public final boolean[] f34886n;

    public t4(x3 x3Var, TL_wallet.walletTransaction[] wallettransactionArr, s4 s4Var, int i10, Utilities.Callback2 callback2, k2[] k2VarArr, String[] strArr, boolean[] zArr) {
        this.f34882a = x3Var;
        this.f34883b = wallettransactionArr;
        this.f34884c = s4Var;
        this.d = i10;
        this.e = callback2;
        this.f34885f = k2VarArr;
        this.h = strArr;
        this.f34886n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f34882a.run(this.f34883b[0]);
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f34884c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).addObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
        Utilities.Callback2 callback2 = this.e;
        if (callback2 != null) {
            this.f34885f[0].setOnDismissListener(new h(callback2, (Serializable) this.h, (Serializable) this.f34886n, 13));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f34884c;
        if (notificationCenterDelegate != null) {
            int i10 = this.d;
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletUpdate);
            NotificationCenter.getInstance(i10).removeObserver(notificationCenterDelegate, NotificationCenter.walletTransactionsUpdate);
        }
    }
}
