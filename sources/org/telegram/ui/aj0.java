package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class aj0 implements org.telegram.messenger.k20 {
    public final int f35794a;
    public final Object f35795b;
    public final Object f35796c;
    public final Object d;
    public final Object e;

    public aj0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f35794a = i10;
        this.f35796c = obj;
        this.d = obj2;
        this.f35795b = obj3;
        this.e = obj4;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        CharSequence O2;
        AlertDialog$Builder alertDialog$Builder;
        org.telegram.messenger.kj kjVar;
        org.telegram.ui.Components.cc k10;
        int i10 = this.f35794a;
        Object obj3 = this.e;
        Object obj4 = this.f35795b;
        Object obj5 = this.d;
        Object obj6 = this.f35796c;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.c41 c41Var = (org.telegram.ui.Components.c41) obj5;
                String str = (String) obj4;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.x1) obj6).dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    c41Var.run();
                    return;
                }
                org.telegram.ui.ActionBar.z2 z2Var = hj0.f37825a;
                if (z2Var != null) {
                    z2Var.dismiss();
                    hj0.f37825a = null;
                }
                org.telegram.ui.Components.cc a2 = hj0.a();
                String L0 = org.telegram.messenger.dd.L0(2131753128, null);
                if (TextUtils.isEmpty(str)) {
                    O2 = org.telegram.messenger.dd.L0(2131753129, null);
                } else {
                    O2 = org.telegram.messenger.i0.O2(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.uj, p6Var), org.telegram.messenger.dd.a0(null, null, 2131753130, str));
                }
                a2.I(2131624011, L0, O2).j();
                return;
            case 1:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj6;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj5;
                String str2 = (String) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.p6 p6Var2 = z0Var.e;
                if (updates != null) {
                    org.telegram.messenger.wp.r1(z0Var.M).L3(updates, false);
                    z0Var.y(x0Var, "requested_chat_sent", org.telegram.ui.web.z0.A(str2, "req_id"));
                    long j10 = z0Var.U.f19943id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f19943id);
                    org.telegram.ui.web.b0 b0Var = new org.telegram.ui.web.b0(z0Var, bundle, user, j10);
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(b0Var);
                    }
                    org.telegram.ui.web.d0 d0Var = z0Var.f43063c;
                    if (d0Var != null) {
                        d0Var.b();
                        return;
                    }
                    return;
                } else if (tL_error2 != null) {
                    new org.telegram.ui.Components.cc(z0Var, p6Var2).f0(tL_error2, false);
                    z0Var.y(x0Var, "requested_chat_failed", org.telegram.ui.web.z0.A(str2, "req_id"));
                    return;
                } else {
                    new org.telegram.ui.Components.cc(z0Var, p6Var2).e0("UNKNOWN_BUTTON", false);
                    z0Var.y(x0Var, "requested_chat_failed", org.telegram.ui.web.z0.A(str2, "req_id"));
                    return;
                }
            case 2:
                rh.e4 e4Var = (rh.e4) obj6;
                org.telegram.messenger.k20 k20Var = (org.telegram.messenger.k20) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj3;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates2 != null) {
                    ArrayList y02 = org.telegram.messenger.wp.y0(updates2, TL_update.TL_updateNewMessage.class);
                    int size = y02.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            Object obj7 = y02.get(i11);
                            i11++;
                            TLRPC.Message message = ((TL_update.TL_updateNewMessage) obj7).message;
                            if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                kjVar = new org.telegram.messenger.kj(e4Var.f21584a, message, false, false);
                            }
                        } else {
                            kjVar = null;
                        }
                    }
                    org.telegram.messenger.wp.r1(e4Var.f21584a).L3(updates2, false);
                    if (kjVar != null) {
                        TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) kjVar.f16690k.action).gift;
                        k20Var.a(starGift, new ox0(e4Var, kjVar, arrayList, starGift, 18));
                        return;
                    }
                    k20Var.a(null, null);
                    rh.e6.y(e4Var.f21584a, false).O();
                    rh.v5 G = rh.e6.y(e4Var.f21584a, false).G(org.telegram.messenger.e20.i(e4Var.f21584a).e(), false);
                    if (G != null) {
                        G.k(arrayList, null);
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error3.text)) {
                        alertDialog$Builder = new AlertDialog$Builder(0, e4Var.getContext(), new th.b());
                        String L02 = org.telegram.messenger.dd.L0(2131749764, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                        x1Var.R = L02;
                        x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131749766, null));
                    } else {
                        String str3 = tL_error3.text;
                        if (str3 != null && str3.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                            long currentTime = ConnectionsManager.getInstance(e4Var.f21584a).getCurrentTime();
                            alertDialog$Builder = new AlertDialog$Builder(0, e4Var.getContext(), new th.b());
                            String L03 = org.telegram.messenger.dd.L0(2131749764, null);
                            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.f20135a;
                            x1Var2.R = L03;
                            x1Var2.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131749765, org.telegram.messenger.dd.x(Long.parseLong(tL_error3.text.substring(25)) + currentTime, true)));
                        } else {
                            e4Var.k().f0(tL_error3, false);
                            runnable.run();
                            return;
                        }
                    }
                    i0.a.w(null, 2131747847, alertDialog$Builder, null);
                    runnable.run();
                    return;
                } else {
                    return;
                }
            default:
                rh.e4 e4Var2 = (rh.e4) obj6;
                gf.e eVar = (gf.e) obj5;
                mg.i2 i2Var = (mg.i2) obj4;
                org.telegram.messenger.sl slVar = (org.telegram.messenger.sl) obj3;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (stargiftdepositpayload == null) {
                    eVar.b();
                    if (i2Var != null) {
                        k10 = new org.telegram.ui.Components.cc(i2Var.f21590c, e4Var2.I0);
                    } else {
                        k10 = e4Var2.k();
                    }
                    k10.f0(tL_error4, false);
                    return;
                }
                slVar.a(stargiftdepositpayload);
                return;
        }
    }
}
