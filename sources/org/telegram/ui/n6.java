package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class n6 implements org.telegram.messenger.s10 {
    public final int f49465a;
    public final Object f49466b;
    public final Object f49467c;
    public final Object d;

    public n6(Object obj, Object obj2, Object obj3, int i7) {
        this.f49465a = i7;
        this.f49466b = obj;
        this.f49467c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f49465a;
        Object obj3 = this.d;
        Object obj4 = this.f49467c;
        Object obj5 = this.f49466b;
        int i10 = 0;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                org.telegram.messenger.g0.r(l5Var);
                org.telegram.messenger.g0.h3(l5Var);
                return;
            case 1:
                an anVar = (an) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                vf vfVar = (vf) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = anVar.Pb.keySet().iterator();
                    while (it.hasNext() && anVar.Pb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    anVar.Pb.put(getwebpagepreview.message, webPage);
                }
                vfVar.a(bool, webPage);
                return;
            case 2:
                final yw ywVar = (yw) obj5;
                ad adVar = (ad) obj4;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj3;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                final Long l10 = (Long) obj2;
                Utilities.u(0, new bi.o1(ywVar, l10, adVar, e2Var, 12), new x(ywVar, t1Var, l10, 8), new org.telegram.messenger.z10() {
                    @Override
                    public final void a(Object obj6) {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                yw ywVar2 = ywVar;
                                if (ywVar2.H.bot_admin_rights != null) {
                                    TLRPC.User a22 = ywVar2.getMessagesController().a2(Long.valueOf(ywVar2.I));
                                    org.telegram.messenger.np messagesController = ywVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = ywVar2.H;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.Q4(longValue, a22, tL_chatAdminRights, null, false, ywVar2, z10, true, null, runnable, new te(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                yw ywVar3 = ywVar;
                                if (ywVar3.H.user_admin_rights != null) {
                                    org.telegram.messenger.np messagesController2 = ywVar3.getMessagesController();
                                    Long l11 = l10;
                                    ywVar3.getMessagesController().Q4(l11.longValue(), org.telegram.messenger.m10.i(ywVar3.getAccountInstance().f22782a).f(), mp.x0(messagesController2.M0(l11).admin_rights, ywVar3.H.user_admin_rights), null, true, ywVar3, false, true, null, runnable2, new te(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new org.telegram.messenger.z10() {
                    @Override
                    public final void a(Object obj6) {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                yw ywVar2 = ywVar;
                                if (ywVar2.H.bot_admin_rights != null) {
                                    TLRPC.User a22 = ywVar2.getMessagesController().a2(Long.valueOf(ywVar2.I));
                                    org.telegram.messenger.np messagesController = ywVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = ywVar2.H;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.Q4(longValue, a22, tL_chatAdminRights, null, false, ywVar2, z10, true, null, runnable, new te(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                yw ywVar3 = ywVar;
                                if (ywVar3.H.user_admin_rights != null) {
                                    org.telegram.messenger.np messagesController2 = ywVar3.getMessagesController();
                                    Long l11 = l10;
                                    ywVar3.getMessagesController().Q4(l11.longValue(), org.telegram.messenger.m10.i(ywVar3.getAccountInstance().f22782a).f(), mp.x0(messagesController2.M0(l11).admin_rights, ywVar3.H.user_admin_rights), null, true, ywVar3, false, true, null, runnable2, new te(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new di.i2(ywVar, t1Var, l10, adVar, e2Var, 5));
                return;
            default:
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj5;
                TL_account.Passkey passkey = (TL_account.Passkey) obj4;
                String str = (String) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (passkeys != null) {
                    u2Var.dismiss();
                    while (i10 < passkeys.passkeys.size()) {
                        if (TextUtils.equals(passkeys.passkeys.get(i10).f28258id, passkey.f28258id)) {
                            passkeys.passkeys.remove(i10);
                            i10--;
                        }
                        i10++;
                    }
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                    if (T != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        T.presentFragment(passkeysActivity);
                        org.telegram.messenger.g0.i3(new jd0(14, passkeysActivity, passkey), 150L);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    new org.telegram.ui.Components.cc(u2Var.F, u2Var.J0).e0(str, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
