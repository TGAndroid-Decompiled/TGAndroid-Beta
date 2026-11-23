package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class n6 implements org.telegram.messenger.p10 {
    public final int f50234a;
    public final Object f50235b;
    public final Object f50236c;
    public final Object d;

    public n6(Object obj, Object obj2, Object obj3, int i7) {
        this.f50234a = i7;
        this.f50235b = obj;
        this.f50236c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f50234a;
        Object obj3 = this.d;
        Object obj4 = this.f50236c;
        Object obj5 = this.f50235b;
        int i10 = 0;
        switch (i7) {
            case 0:
                oi.h hVar = (oi.h) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                org.telegram.messenger.g0.r(hVar);
                org.telegram.messenger.g0.g3(hVar);
                return;
            case 1:
                bn bnVar = (bn) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                xf xfVar = (xf) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = bnVar.Qb.keySet().iterator();
                    while (it.hasNext() && bnVar.Qb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    bnVar.Qb.put(getwebpagepreview.message, webPage);
                }
                xfVar.a(bool, webPage);
                return;
            case 2:
                final bx bxVar = (bx) obj5;
                ad adVar = (ad) obj4;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj3;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                final Long l10 = (Long) obj2;
                Utilities.u(0, new bi.o2(bxVar, l10, adVar, g2Var, 12), new x(bxVar, t1Var, l10, 8), new org.telegram.messenger.w10() {
                    @Override
                    public final void a(Object obj6) {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                bx bxVar2 = bxVar;
                                if (bxVar2.H.bot_admin_rights != null) {
                                    TLRPC.User c22 = bxVar2.getMessagesController().c2(Long.valueOf(bxVar2.I));
                                    org.telegram.messenger.mp messagesController = bxVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = bxVar2.H;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.b5(longValue, c22, tL_chatAdminRights, null, false, bxVar2, z10, true, null, runnable, new ve(4, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                bx bxVar3 = bxVar;
                                if (bxVar3.H.user_admin_rights != null) {
                                    org.telegram.messenger.mp messagesController2 = bxVar3.getMessagesController();
                                    Long l11 = l10;
                                    bxVar3.getMessagesController().b5(l11.longValue(), org.telegram.messenger.i10.i(bxVar3.getAccountInstance().f23343a).f(), np.x0(messagesController2.O0(l11).admin_rights, bxVar3.H.user_admin_rights), null, true, bxVar3, false, true, null, runnable2, new ve(3, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new org.telegram.messenger.w10() {
                    @Override
                    public final void a(Object obj6) {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                bx bxVar2 = bxVar;
                                if (bxVar2.H.bot_admin_rights != null) {
                                    TLRPC.User c22 = bxVar2.getMessagesController().c2(Long.valueOf(bxVar2.I));
                                    org.telegram.messenger.mp messagesController = bxVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = bxVar2.H;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.b5(longValue, c22, tL_chatAdminRights, null, false, bxVar2, z10, true, null, runnable, new ve(4, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                bx bxVar3 = bxVar;
                                if (bxVar3.H.user_admin_rights != null) {
                                    org.telegram.messenger.mp messagesController2 = bxVar3.getMessagesController();
                                    Long l11 = l10;
                                    bxVar3.getMessagesController().b5(l11.longValue(), org.telegram.messenger.i10.i(bxVar3.getAccountInstance().f23343a).f(), np.x0(messagesController2.O0(l11).admin_rights, bxVar3.H.user_admin_rights), null, true, bxVar3, false, true, null, runnable2, new ve(3, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new di.n2(bxVar, t1Var, l10, adVar, g2Var, 5));
                return;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj5;
                TL_account.Passkey passkey = (TL_account.Passkey) obj4;
                String str = (String) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (passkeys != null) {
                    w2Var.dismiss();
                    while (i10 < passkeys.passkeys.size()) {
                        if (TextUtils.equals(passkeys.passkeys.get(i10).f28699id, passkey.f28699id)) {
                            passkeys.passkeys.remove(i10);
                            i10--;
                        }
                        i10++;
                    }
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        T.presentFragment(passkeysActivity);
                        org.telegram.messenger.g0.h3(new bd0(15, passkeysActivity, passkey), 150L);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    new org.telegram.ui.Components.kc(w2Var.F, w2Var.J0).f0(str, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
