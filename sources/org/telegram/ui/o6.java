package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class o6 implements Utilities.Callback2 {
    public final int f40561a;
    public final Object f40562b;
    public final Object f40563c;
    public final Object d;

    public o6(Object obj, Object obj2, Object obj3, int i10) {
        this.f40561a = i10;
        this.f40562b = obj;
        this.f40563c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f40561a;
        int i11 = 0;
        Object obj3 = this.d;
        Object obj4 = this.f40563c;
        Object obj5 = this.f40562b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(l5Var);
                AndroidUtilities.runOnUIThread(l5Var);
                return;
            case 1:
                eo eoVar = (eo) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                og ogVar = (og) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = eoVar.f37348mb.keySet().iterator();
                    while (it.hasNext() && eoVar.f37348mb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    eoVar.f37348mb.put(getwebpagepreview.message, webPage);
                }
                ogVar.run(bool, webPage);
                return;
            case 2:
                final vy vyVar = (vy) obj5;
                qd qdVar = (qd) obj4;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                final Long l4 = (Long) obj2;
                Utilities.doCallbacks(new ai.f4(vyVar, l4, qdVar, m2Var, 11), new z(vyVar, a2Var, l4, 8), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                vy vyVar2 = vyVar;
                                if (vyVar2.G.bot_admin_rights != null) {
                                    TLRPC.User user = vyVar2.getMessagesController().getUser(Long.valueOf(vyVar2.H));
                                    MessagesController messagesController = vyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = vyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, vyVar2, z10, true, null, runnable, new sf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                vy vyVar3 = vyVar;
                                if (vyVar3.G.user_admin_rights != null) {
                                    MessagesController messagesController2 = vyVar3.getMessagesController();
                                    Long l10 = l4;
                                    vyVar3.getMessagesController().setUserAdminRole(l10.longValue(), vyVar3.getAccountInstance().getUserConfig().getCurrentUser(), qq.s0(messagesController2.getChat(l10).admin_rights, vyVar3.G.user_admin_rights), null, true, vyVar3, false, true, null, runnable2, new sf(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                vy vyVar2 = vyVar;
                                if (vyVar2.G.bot_admin_rights != null) {
                                    TLRPC.User user = vyVar2.getMessagesController().getUser(Long.valueOf(vyVar2.H));
                                    MessagesController messagesController = vyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = vyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, vyVar2, z10, true, null, runnable, new sf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                vy vyVar3 = vyVar;
                                if (vyVar3.G.user_admin_rights != null) {
                                    MessagesController messagesController2 = vyVar3.getMessagesController();
                                    Long l10 = l4;
                                    vyVar3.getMessagesController().setUserAdminRole(l10.longValue(), vyVar3.getAccountInstance().getUserConfig().getCurrentUser(), qq.s0(messagesController2.getChat(l10).admin_rights, vyVar3.G.user_admin_rights), null, true, vyVar3, false, true, null, runnable2, new sf(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new wa(vyVar, a2Var, l4, qdVar, m2Var, 4));
                return;
            default:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj5;
                TL_account.Passkey passkey = (TL_account.Passkey) obj4;
                String str = (String) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (passkeys != null) {
                    e3Var.dismiss();
                    while (i11 < passkeys.passkeys.size()) {
                        if (TextUtils.equals(passkeys.passkeys.get(i11).f20009id, passkey.f20009id)) {
                            passkeys.passkeys.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        U.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new og0(12, passkeysActivity, passkey), 150L);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    new org.telegram.ui.Components.zc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).e0(str, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
