package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class n6 implements org.telegram.messenger.j20 {
    public final int f39832a;
    public final Object f39833b;
    public final Object f39834c;
    public final Object d;

    public n6(Object obj, Object obj2, Object obj3, int i10) {
        this.f39832a = i10;
        this.f39833b = obj;
        this.f39834c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10 = this.f39832a;
        Object obj3 = this.d;
        Object obj4 = this.f39834c;
        Object obj5 = this.f39833b;
        int i11 = 0;
        switch (i10) {
            case 0:
                ag.q0 q0Var = (ag.q0) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                org.telegram.messenger.i0.r(q0Var);
                org.telegram.messenger.i0.g3(q0Var);
                return;
            case 1:
                un unVar = (un) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                ng ngVar = (ng) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = unVar.Hb.keySet().iterator();
                    while (it.hasNext() && unVar.Hb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    unVar.Hb.put(getwebpagepreview.message, webPage);
                }
                ngVar.a(bool, webPage);
                return;
            case 2:
                final ay ayVar = (ay) obj5;
                kd kdVar = (kd) obj4;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj3;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                final Long l4 = (Long) obj2;
                Utilities.u(0, new ag.m2(ayVar, l4, kdVar, k2Var, 11), new w(ayVar, x1Var, l4, 8), new org.telegram.messenger.q20() {
                    @Override
                    public final void a(Object obj6) {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                ay ayVar2 = ayVar;
                                if (ayVar2.G.bot_admin_rights != null) {
                                    TLRPC.User Z1 = ayVar2.getMessagesController().Z1(Long.valueOf(ayVar2.H));
                                    org.telegram.messenger.vp messagesController = ayVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = ayVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.M4(longValue, Z1, tL_chatAdminRights, null, false, ayVar2, z10, true, null, runnable, new jf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                ay ayVar3 = ayVar;
                                if (ayVar3.G.user_admin_rights != null) {
                                    org.telegram.messenger.vp messagesController2 = ayVar3.getMessagesController();
                                    Long l10 = l4;
                                    ayVar3.getMessagesController().M4(l10.longValue(), org.telegram.messenger.d20.i(ayVar3.getAccountInstance().f14863a).f(), iq.w0(messagesController2.L0(l10).admin_rights, ayVar3.G.user_admin_rights), null, true, ayVar3, false, true, null, runnable2, new jf(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new org.telegram.messenger.q20() {
                    @Override
                    public final void a(Object obj6) {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                ay ayVar2 = ayVar;
                                if (ayVar2.G.bot_admin_rights != null) {
                                    TLRPC.User Z1 = ayVar2.getMessagesController().Z1(Long.valueOf(ayVar2.H));
                                    org.telegram.messenger.vp messagesController = ayVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = ayVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.M4(longValue, Z1, tL_chatAdminRights, null, false, ayVar2, z10, true, null, runnable, new jf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                ay ayVar3 = ayVar;
                                if (ayVar3.G.user_admin_rights != null) {
                                    org.telegram.messenger.vp messagesController2 = ayVar3.getMessagesController();
                                    Long l10 = l4;
                                    ayVar3.getMessagesController().M4(l10.longValue(), org.telegram.messenger.d20.i(ayVar3.getAccountInstance().f14863a).f(), iq.w0(messagesController2.L0(l10).admin_rights, ayVar3.G.user_admin_rights), null, true, ayVar3, false, true, null, runnable2, new jf(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new pa(ayVar, x1Var, l4, kdVar, k2Var, 4));
                return;
            default:
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj5;
                TL_account.Passkey passkey = (TL_account.Passkey) obj4;
                String str = (String) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (passkeys != null) {
                    z2Var.dismiss();
                    while (i11 < passkeys.passkeys.size()) {
                        if (TextUtils.equals(passkeys.passkeys.get(i11).f19999id, passkey.f19999id)) {
                            passkeys.passkeys.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        T.presentFragment(passkeysActivity);
                        org.telegram.messenger.i0.h3(new uf0(10, passkeysActivity, passkey), 150L);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    new org.telegram.ui.Components.cc(z2Var.E, z2Var.I0).e0(str, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
