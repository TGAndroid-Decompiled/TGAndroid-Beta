package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class o60 implements Runnable {
    public final int f49827a = 1;
    public final LaunchActivity f49828b;
    public final TLObject f49829c;
    public final int d;
    public final String f49830e;
    public final TLRPC.TL_error f49831f;
    public final g50 h;

    public o60(LaunchActivity launchActivity, TLObject tLObject, int i7, String str, TLRPC.TL_error tL_error, g50 g50Var) {
        this.f49828b = launchActivity;
        this.f49829c = tLObject;
        this.d = i7;
        this.f49830e = str;
        this.f49831f = tL_error;
        this.h = g50Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.cc a02;
        int i7;
        int i10;
        String str;
        int i11 = this.f49827a;
        g50 g50Var = this.h;
        TLRPC.TL_error tL_error = this.f49831f;
        String str2 = this.f49830e;
        TLObject tLObject = this.f49829c;
        switch (i11) {
            case 0:
                String str3 = LaunchActivity.C1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                    if (T != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            a02 = org.telegram.ui.Components.cc.a0(T);
                            i7 = 2131624021;
                            i10 = 2131743880;
                        } else {
                            a02 = org.telegram.ui.Components.cc.a0(T);
                            i7 = 2131624012;
                            i10 = 2131743881;
                        }
                        org.telegram.messenger.k5.n(null, i10, a02, i7, 36);
                    } else {
                        return;
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity = this.f49828b;
                    org.telegram.messenger.np.s1(launchActivity.P).Y3(tL_payments_uniqueStarGift.users, false);
                    org.telegram.messenger.np.s1(launchActivity.P).S3(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        di.c6 c6Var = new di.c6(launchActivity, this.d, 0L, null, null);
                        c6Var.i2(str2, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (T2 != null) {
                            if (T2.getLastStoryViewer() != null && T2.getLastStoryViewer().K0) {
                                T2.getLastStoryViewer().t(c6Var);
                            } else {
                                T2.showDialog(c6Var);
                            }
                        } else {
                            c6Var.show();
                        }
                    }
                }
                try {
                    g50Var.run();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                String str4 = LaunchActivity.C1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity2 = this.f49828b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    org.telegram.messenger.np.s1(this.d).X3(user, false, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f28200id);
                    launchActivity2.t0(new an(bundle));
                } else {
                    StringBuilder u10 = a8.p0.u("cant import contact token. token=", str2, " err=");
                    if (tL_error == null) {
                        str = null;
                    } else {
                        str = tL_error.text;
                    }
                    u10.append(str);
                    org.telegram.messenger.a8.d(u10.toString());
                    org.telegram.messenger.k5.o(null, 2131748134, org.telegram.ui.Components.cc.a0((org.telegram.ui.ActionBar.e2) i5.c.h(1, launchActivity2.f42630e0)), null);
                }
                try {
                    g50Var.run();
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }

    public o60(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i7, String str, g50 g50Var) {
        this.f49828b = launchActivity;
        this.f49831f = tL_error;
        this.f49829c = tLObject;
        this.d = i7;
        this.f49830e = str;
        this.h = g50Var;
    }
}
