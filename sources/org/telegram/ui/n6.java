package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class n6 implements Utilities.Callback2 {
    public final int f35952a;
    public final Object f35953b;
    public final Object f35954c;
    public final Object d;

    public n6(Object obj, Object obj2, Object obj3, int i10) {
        this.f35952a = i10;
        this.f35953b = obj;
        this.f35954c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f35952a;
        int i11 = 0;
        Object obj3 = this.d;
        Object obj4 = this.f35954c;
        Object obj5 = this.f35953b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.o5 o5Var = (org.telegram.ui.ActionBar.o5) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(o5Var);
                AndroidUtilities.runOnUIThread(o5Var);
                return;
            case 1:
                bo boVar = (bo) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                mg mgVar = (mg) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = boVar.f32365lb.keySet().iterator();
                    while (it.hasNext() && boVar.f32365lb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    boVar.f32365lb.put(getwebpagepreview.message, webPage);
                }
                mgVar.run(bool, webPage);
                return;
            case 2:
                final wy wyVar = (wy) obj5;
                nd ndVar = (nd) obj4;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                final Long l4 = (Long) obj2;
                Utilities.doCallbacks(new ai.e4(wyVar, l4, ndVar, o2Var, 10), new y(wyVar, c2Var, l4, 6), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                wy wyVar2 = wyVar;
                                if (wyVar2.G.bot_admin_rights != null) {
                                    TLRPC.User user = wyVar2.getMessagesController().getUser(Long.valueOf(wyVar2.H));
                                    MessagesController messagesController = wyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = wyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, wyVar2, z10, true, null, runnable, new nf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                wy wyVar3 = wyVar;
                                if (wyVar3.G.user_admin_rights != null) {
                                    MessagesController messagesController2 = wyVar3.getMessagesController();
                                    Long l10 = l4;
                                    wyVar3.getMessagesController().setUserAdminRole(l10.longValue(), wyVar3.getAccountInstance().getUserConfig().getCurrentUser(), pq.s0(messagesController2.getChat(l10).admin_rights, wyVar3.G.user_admin_rights), null, true, wyVar3, false, true, null, runnable2, new nf(4, runnable2));
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
                                wy wyVar2 = wyVar;
                                if (wyVar2.G.bot_admin_rights != null) {
                                    TLRPC.User user = wyVar2.getMessagesController().getUser(Long.valueOf(wyVar2.H));
                                    MessagesController messagesController = wyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = wyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, wyVar2, z10, true, null, runnable, new nf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                wy wyVar3 = wyVar;
                                if (wyVar3.G.user_admin_rights != null) {
                                    MessagesController messagesController2 = wyVar3.getMessagesController();
                                    Long l10 = l4;
                                    wyVar3.getMessagesController().setUserAdminRole(l10.longValue(), wyVar3.getAccountInstance().getUserConfig().getCurrentUser(), pq.s0(messagesController2.getChat(l10).admin_rights, wyVar3.G.user_admin_rights), null, true, wyVar3, false, true, null, runnable2, new nf(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new ua(wyVar, c2Var, l4, ndVar, o2Var, 4));
                return;
            default:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj5;
                TL_account.Passkey passkey = (TL_account.Passkey) obj4;
                String str = (String) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (passkeys != null) {
                    g3Var.dismiss();
                    while (i11 < passkeys.passkeys.size()) {
                        if (TextUtils.equals(passkeys.passkeys.get(i11).f18324id, passkey.f18324id)) {
                            passkeys.passkeys.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        U.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new pl0(1, passkeysActivity, passkey), 150L);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    new org.telegram.ui.Components.vc(g3Var.topBulletinContainer, g3Var.getResourcesProvider()).c0(str, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
