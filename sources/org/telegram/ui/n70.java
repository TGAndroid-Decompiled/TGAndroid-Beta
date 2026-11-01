package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class n70 implements Runnable {
    public final int f39735a = 1;
    public final LaunchActivity f39736b;
    public final TLObject f39737c;
    public final int d;
    public final String e;
    public final TLRPC.TL_error f39738f;
    public final y60 h;

    public n70(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, TLRPC.TL_error tL_error, y60 y60Var) {
        this.f39736b = launchActivity;
        this.f39737c = tLObject;
        this.d = i10;
        this.e = str;
        this.f39738f = tL_error;
        this.h = y60Var;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.cc a02;
        int i10;
        int i11;
        String str;
        int i12 = this.f39735a;
        y60 y60Var = this.h;
        TLRPC.TL_error tL_error = this.f39738f;
        String str2 = this.e;
        TLObject tLObject = this.f39737c;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            a02 = org.telegram.ui.Components.cc.a0(T);
                            i10 = 2131624020;
                            i11 = 2131743905;
                        } else {
                            a02 = org.telegram.ui.Components.cc.a0(T);
                            i10 = 2131624011;
                            i11 = 2131743906;
                        }
                        org.telegram.messenger.m5.n(null, i11, a02, i10, 36);
                    } else {
                        return;
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity = this.f39736b;
                    org.telegram.messenger.wp.r1(launchActivity.O).V3(tL_payments_uniqueStarGift.users, false);
                    org.telegram.messenger.wp.r1(launchActivity.O).P3(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        rh.e4 e4Var = new rh.e4(launchActivity, this.d, 0L, null, null);
                        e4Var.h2(str2, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (T2 != null) {
                            if (T2.getLastStoryViewer() != null && T2.getLastStoryViewer().K0) {
                                T2.getLastStoryViewer().t(e4Var);
                            } else {
                                T2.showDialog(e4Var);
                            }
                        } else {
                            e4Var.show();
                        }
                    }
                }
                try {
                    y60Var.run();
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                Pattern pattern2 = LaunchActivity.D1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity2 = this.f39736b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    org.telegram.messenger.wp.r1(this.d).U3(user, false, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f19943id);
                    launchActivity2.t0(new un(bundle));
                } else {
                    StringBuilder u10 = a1.g.u("cant import contact token. token=", str2, " err=");
                    if (tL_error == null) {
                        str = null;
                    } else {
                        str = tL_error.text;
                    }
                    u10.append(str);
                    org.telegram.messenger.f8.d(u10.toString());
                    org.telegram.messenger.m5.o(null, 2131748150, org.telegram.ui.Components.cc.a0((org.telegram.ui.ActionBar.k2) i0.a.g(1, launchActivity2.f33360d0)), null);
                }
                try {
                    y60Var.run();
                    return;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
        }
    }

    public n70(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, String str, y60 y60Var) {
        this.f39736b = launchActivity;
        this.f39738f = tL_error;
        this.f39737c = tLObject;
        this.d = i10;
        this.e = str;
        this.h = y60Var;
    }
}
