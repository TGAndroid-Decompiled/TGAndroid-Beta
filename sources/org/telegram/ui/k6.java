package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class k6 implements Utilities.Callback2 {
    public final int f39245a;
    public final Object f39246b;
    public final Object f39247c;
    public final Object d;

    public k6(Object obj, Object obj2, Object obj3, int i10) {
        this.f39245a = i10;
        this.f39246b = obj;
        this.f39247c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f39245a;
        int i11 = 0;
        Object obj3 = this.d;
        Object obj4 = this.f39247c;
        Object obj5 = this.f39246b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(l5Var);
                AndroidUtilities.runOnUIThread(l5Var);
                return;
            case 1:
                zn znVar = (zn) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                kg kgVar = (kg) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = znVar.f44893mb.keySet().iterator();
                    while (it.hasNext() && znVar.f44893mb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    znVar.f44893mb.put(getwebpagepreview.message, webPage);
                }
                kgVar.run(bool, webPage);
                return;
            case 2:
                final sy syVar = (sy) obj5;
                ld ldVar = (ld) obj4;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                final Long l4 = (Long) obj2;
                Utilities.doCallbacks(new ai.f4(syVar, l4, ldVar, m2Var, 11), new y(syVar, a2Var, l4, 8), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                sy syVar2 = syVar;
                                if (syVar2.G.bot_admin_rights != null) {
                                    TLRPC.User user = syVar2.getMessagesController().getUser(Long.valueOf(syVar2.H));
                                    MessagesController messagesController = syVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = syVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, syVar2, z10, true, null, runnable, new nf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                sy syVar3 = syVar;
                                if (syVar3.G.user_admin_rights != null) {
                                    MessagesController messagesController2 = syVar3.getMessagesController();
                                    Long l10 = l4;
                                    syVar3.getMessagesController().setUserAdminRole(l10.longValue(), syVar3.getAccountInstance().getUserConfig().getCurrentUser(), nq.s0(messagesController2.getChat(l10).admin_rights, syVar3.G.user_admin_rights), null, true, syVar3, false, true, null, runnable2, new nf(4, runnable2));
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
                                sy syVar2 = syVar;
                                if (syVar2.G.bot_admin_rights != null) {
                                    TLRPC.User user = syVar2.getMessagesController().getUser(Long.valueOf(syVar2.H));
                                    MessagesController messagesController = syVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = syVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, syVar2, z10, true, null, runnable, new nf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                sy syVar3 = syVar;
                                if (syVar3.G.user_admin_rights != null) {
                                    MessagesController messagesController2 = syVar3.getMessagesController();
                                    Long l10 = l4;
                                    syVar3.getMessagesController().setUserAdminRole(l10.longValue(), syVar3.getAccountInstance().getUserConfig().getCurrentUser(), nq.s0(messagesController2.getChat(l10).admin_rights, syVar3.G.user_admin_rights), null, true, syVar3, false, true, null, runnable2, new nf(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new sa(syVar, a2Var, l4, ldVar, m2Var, 4));
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
                        if (TextUtils.equals(passkeys.passkeys.get(i11).f20273id, passkey.f20273id)) {
                            passkeys.passkeys.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        U.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new uf0(14, passkeysActivity, passkey), 150L);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    new org.telegram.ui.Components.ad(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).e0(str, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
