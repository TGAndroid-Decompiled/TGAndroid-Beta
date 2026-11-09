package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class n6 implements org.telegram.messenger.v10 {
    public final int f48103a;
    public final Object f48104b;
    public final Object f48105c;
    public final Object d;

    public n6(Object obj, Object obj2, Object obj3, int i7) {
        this.f48103a = i7;
        this.f48104b = obj;
        this.f48105c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f48103a;
        Object obj3 = this.d;
        Object obj4 = this.f48105c;
        Object obj5 = this.f48104b;
        int i10 = 0;
        switch (i7) {
            case 0:
                m6 m6Var = (m6) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                org.telegram.messenger.g0.r(m6Var);
                org.telegram.messenger.g0.h3(m6Var);
                return;
            case 1:
                cn cnVar = (cn) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                yf yfVar = (yf) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = cnVar.Ob.keySet().iterator();
                    while (it.hasNext() && cnVar.Ob.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    cnVar.Ob.put(getwebpagepreview.message, webPage);
                }
                yfVar.a(bool, webPage);
                return;
            case 2:
                final yw ywVar = (yw) obj5;
                bd bdVar = (bd) obj4;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj3;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                final Long l10 = (Long) obj2;
                Utilities.u(0, new di.s2(ywVar, l10, bdVar, f2Var, 11), new y(ywVar, u1Var, l10, 8), new org.telegram.messenger.c20() {
                    @Override
                    public final void a(Object obj6) {
                        boolean z9;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                yw ywVar2 = ywVar;
                                if (ywVar2.G.bot_admin_rights != null) {
                                    TLRPC.User a22 = ywVar2.getMessagesController().a2(Long.valueOf(ywVar2.H));
                                    org.telegram.messenger.qp messagesController = ywVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = ywVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z9 = false;
                                    } else {
                                        z9 = true;
                                    }
                                    messagesController.P4(longValue, a22, tL_chatAdminRights, null, false, ywVar2, z9, true, null, runnable, new ve(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                yw ywVar3 = ywVar;
                                if (ywVar3.G.user_admin_rights != null) {
                                    org.telegram.messenger.qp messagesController2 = ywVar3.getMessagesController();
                                    Long l11 = l10;
                                    ywVar3.getMessagesController().P4(l11.longValue(), org.telegram.messenger.p10.i(ywVar3.getAccountInstance().f21765a).f(), mp.x0(messagesController2.M0(l11).admin_rights, ywVar3.G.user_admin_rights), null, true, ywVar3, false, true, null, runnable2, new ve(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new org.telegram.messenger.c20() {
                    @Override
                    public final void a(Object obj6) {
                        boolean z9;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                yw ywVar2 = ywVar;
                                if (ywVar2.G.bot_admin_rights != null) {
                                    TLRPC.User a22 = ywVar2.getMessagesController().a2(Long.valueOf(ywVar2.H));
                                    org.telegram.messenger.qp messagesController = ywVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = ywVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z9 = false;
                                    } else {
                                        z9 = true;
                                    }
                                    messagesController.P4(longValue, a22, tL_chatAdminRights, null, false, ywVar2, z9, true, null, runnable, new ve(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                yw ywVar3 = ywVar;
                                if (ywVar3.G.user_admin_rights != null) {
                                    org.telegram.messenger.qp messagesController2 = ywVar3.getMessagesController();
                                    Long l11 = l10;
                                    ywVar3.getMessagesController().P4(l11.longValue(), org.telegram.messenger.p10.i(ywVar3.getAccountInstance().f21765a).f(), mp.x0(messagesController2.M0(l11).admin_rights, ywVar3.G.user_admin_rights), null, true, ywVar3, false, true, null, runnable2, new ve(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new bi.z2(ywVar, u1Var, l10, bdVar, f2Var, 5));
                return;
            default:
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) obj5;
                TL_account.Passkey passkey = (TL_account.Passkey) obj4;
                String str = (String) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (passkeys != null) {
                    v2Var.dismiss();
                    while (i10 < passkeys.passkeys.size()) {
                        if (TextUtils.equals(passkeys.passkeys.get(i10).f27163id, passkey.f27163id)) {
                            passkeys.passkeys.remove(i10);
                            i10--;
                        }
                        i10++;
                    }
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        T.presentFragment(passkeysActivity);
                        org.telegram.messenger.g0.i3(new bd0(18, passkeysActivity, passkey), 150L);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    new org.telegram.ui.Components.hc(v2Var.E, v2Var.I0).e0(str, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
