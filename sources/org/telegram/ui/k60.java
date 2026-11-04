package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k60 implements Runnable {
    public final int f46780a = 1;
    public final LaunchActivity f46781b;
    public final TLObject f46782c;
    public final int d;
    public final String f46783e;
    public final TLRPC.TL_error f46784f;
    public final ly h;

    public k60(LaunchActivity launchActivity, TLObject tLObject, int i3, String str, TLRPC.TL_error tL_error, ly lyVar) {
        this.f46781b = launchActivity;
        this.f46782c = tLObject;
        this.d = i3;
        this.f46783e = str;
        this.f46784f = tL_error;
        this.h = lyVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.fc a02;
        int i3;
        int i10;
        String str;
        int i11 = this.f46780a;
        ly lyVar = this.h;
        TLRPC.TL_error tL_error = this.f46784f;
        String str2 = this.f46783e;
        TLObject tLObject = this.f46782c;
        switch (i11) {
            case 0:
                String str3 = LaunchActivity.E1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    if (T != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            a02 = org.telegram.ui.Components.fc.a0(T);
                            i3 = 2131624020;
                            i10 = 2131743890;
                        } else {
                            a02 = org.telegram.ui.Components.fc.a0(T);
                            i3 = 2131624011;
                            i10 = 2131743891;
                        }
                        org.telegram.messenger.k5.o(null, i10, a02, i3, 36);
                    } else {
                        return;
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity = this.f46781b;
                    org.telegram.messenger.hp.s1(launchActivity.P).Y3(tL_payments_uniqueStarGift.users, false);
                    org.telegram.messenger.hp.s1(launchActivity.P).S3(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        ci.l6 l6Var = new ci.l6(launchActivity, this.d, 0L, null, null);
                        l6Var.h2(str2, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (T2 != null) {
                            if (T2.getLastStoryViewer() != null && T2.getLastStoryViewer().L0) {
                                T2.getLastStoryViewer().t(l6Var);
                            } else {
                                T2.showDialog(l6Var);
                            }
                        } else {
                            l6Var.show();
                        }
                    }
                }
                try {
                    lyVar.run();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                String str4 = LaunchActivity.E1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity2 = this.f46781b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    org.telegram.messenger.hp.s1(this.d).X3(user, false, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f27150id);
                    launchActivity2.t0(new wm(bundle));
                } else {
                    StringBuilder u10 = a1.g.u("cant import contact token. token=", str2, " err=");
                    if (tL_error == null) {
                        str = null;
                    } else {
                        str = tL_error.text;
                    }
                    u10.append(str);
                    org.telegram.messenger.a8.d(u10.toString());
                    org.telegram.messenger.k5.p(null, 2131748142, org.telegram.ui.Components.fc.a0((org.telegram.ui.ActionBar.d2) k2.p1.h(1, launchActivity2.f41291e0)), null);
                }
                try {
                    lyVar.run();
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }

    public k60(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i3, String str, ly lyVar) {
        this.f46781b = launchActivity;
        this.f46784f = tL_error;
        this.f46782c = tLObject;
        this.d = i3;
        this.f46783e = str;
        this.h = lyVar;
    }
}
