package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class o6 implements org.telegram.messenger.n10 {
    public final int f48202a;
    public final Object f48203b;
    public final Object f48204c;
    public final Object d;

    public o6(Object obj, Object obj2, Object obj3, int i3) {
        this.f48202a = i3;
        this.f48203b = obj;
        this.f48204c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i3 = this.f48202a;
        Object obj3 = this.d;
        Object obj4 = this.f48204c;
        Object obj5 = this.f48203b;
        int i10 = 0;
        switch (i3) {
            case 0:
                o4.b1 b1Var = (o4.b1) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                org.telegram.messenger.g0.r(b1Var);
                org.telegram.messenger.g0.h3(b1Var);
                return;
            case 1:
                wm wmVar = (wm) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                wf wfVar = (wf) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = wmVar.Nb.keySet().iterator();
                    while (it.hasNext() && wmVar.Nb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    wmVar.Nb.put(getwebpagepreview.message, webPage);
                }
                wfVar.a(bool, webPage);
                return;
            case 2:
                final uw uwVar = (uw) obj5;
                ad adVar = (ad) obj4;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj3;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                final Long l10 = (Long) obj2;
                Utilities.u(0, new ai.v1(uwVar, l10, adVar, d2Var, 12), new z(uwVar, s1Var, l10, 8), new org.telegram.messenger.u10() {
                    @Override
                    public final void a(Object obj6) {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                uw uwVar2 = uwVar;
                                if (uwVar2.H.bot_admin_rights != null) {
                                    TLRPC.User a22 = uwVar2.getMessagesController().a2(Long.valueOf(uwVar2.I));
                                    org.telegram.messenger.hp messagesController = uwVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = uwVar2.H;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.P4(longValue, a22, tL_chatAdminRights, null, false, uwVar2, z10, true, null, runnable, new se(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                uw uwVar3 = uwVar;
                                if (uwVar3.H.user_admin_rights != null) {
                                    org.telegram.messenger.hp messagesController2 = uwVar3.getMessagesController();
                                    Long l11 = l10;
                                    uwVar3.getMessagesController().P4(l11.longValue(), org.telegram.messenger.h10.i(uwVar3.getAccountInstance().f21919a).f(), ip.x0(messagesController2.M0(l11).admin_rights, uwVar3.H.user_admin_rights), null, true, uwVar3, false, true, null, runnable2, new se(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new org.telegram.messenger.u10() {
                    @Override
                    public final void a(Object obj6) {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                uw uwVar2 = uwVar;
                                if (uwVar2.H.bot_admin_rights != null) {
                                    TLRPC.User a22 = uwVar2.getMessagesController().a2(Long.valueOf(uwVar2.I));
                                    org.telegram.messenger.hp messagesController = uwVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = uwVar2.H;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.P4(longValue, a22, tL_chatAdminRights, null, false, uwVar2, z10, true, null, runnable, new se(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                uw uwVar3 = uwVar;
                                if (uwVar3.H.user_admin_rights != null) {
                                    org.telegram.messenger.hp messagesController2 = uwVar3.getMessagesController();
                                    Long l11 = l10;
                                    uwVar3.getMessagesController().P4(l11.longValue(), org.telegram.messenger.h10.i(uwVar3.getAccountInstance().f21919a).f(), ip.x0(messagesController2.M0(l11).admin_rights, uwVar3.H.user_admin_rights), null, true, uwVar3, false, true, null, runnable2, new se(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new ci.o2(uwVar, s1Var, l10, adVar, d2Var, 5));
                return;
            default:
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj5;
                TL_account.Passkey passkey = (TL_account.Passkey) obj4;
                String str = (String) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (passkeys != null) {
                    t2Var.dismiss();
                    while (i10 < passkeys.passkeys.size()) {
                        if (TextUtils.equals(passkeys.passkeys.get(i10).f27208id, passkey.f27208id)) {
                            passkeys.passkeys.remove(i10);
                            i10--;
                        }
                        i10++;
                    }
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    if (T != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        T.presentFragment(passkeysActivity);
                        org.telegram.messenger.g0.i3(new tb0(22, passkeysActivity, passkey), 150L);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    new org.telegram.ui.Components.fc(t2Var.F, t2Var.J0).e0(str, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
