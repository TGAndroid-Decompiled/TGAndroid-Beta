package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class m6 implements Utilities.Callback2 {
    public final int f35530a;
    public final Object f35531b;
    public final Object f35532c;
    public final Object d;

    public m6(Object obj, Object obj2, Object obj3, int i10) {
        this.f35530a = i10;
        this.f35531b = obj;
        this.f35532c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f35530a;
        int i11 = 0;
        Object obj3 = this.d;
        Object obj4 = this.f35532c;
        Object obj5 = this.f35531b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(n5Var);
                AndroidUtilities.runOnUIThread(n5Var);
                return;
            case 1:
                zn znVar = (zn) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                sg sgVar = (sg) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = znVar.f40347lb.keySet().iterator();
                    while (it.hasNext() && znVar.f40347lb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    znVar.f40347lb.put(getwebpagepreview.message, webPage);
                }
                sgVar.run(bool, webPage);
                return;
            case 2:
                final uy uyVar = (uy) obj5;
                md mdVar = (md) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                final Long l4 = (Long) obj2;
                Utilities.doCallbacks(new ai.e4(uyVar, l4, mdVar, n2Var, 10), new y(uyVar, b2Var, l4, 6), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                uy uyVar2 = uyVar;
                                if (uyVar2.G.bot_admin_rights != null) {
                                    TLRPC.User user = uyVar2.getMessagesController().getUser(Long.valueOf(uyVar2.H));
                                    MessagesController messagesController = uyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = uyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, uyVar2, z10, true, null, runnable, new mf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                uy uyVar3 = uyVar;
                                if (uyVar3.G.user_admin_rights != null) {
                                    MessagesController messagesController2 = uyVar3.getMessagesController();
                                    Long l10 = l4;
                                    uyVar3.getMessagesController().setUserAdminRole(l10.longValue(), uyVar3.getAccountInstance().getUserConfig().getCurrentUser(), nq.s0(messagesController2.getChat(l10).admin_rights, uyVar3.G.user_admin_rights), null, true, uyVar3, false, true, null, runnable2, new mf(4, runnable2));
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
                                uy uyVar2 = uyVar;
                                if (uyVar2.G.bot_admin_rights != null) {
                                    TLRPC.User user = uyVar2.getMessagesController().getUser(Long.valueOf(uyVar2.H));
                                    MessagesController messagesController = uyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = uyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, uyVar2, z10, true, null, runnable, new mf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                uy uyVar3 = uyVar;
                                if (uyVar3.G.user_admin_rights != null) {
                                    MessagesController messagesController2 = uyVar3.getMessagesController();
                                    Long l10 = l4;
                                    uyVar3.getMessagesController().setUserAdminRole(l10.longValue(), uyVar3.getAccountInstance().getUserConfig().getCurrentUser(), nq.s0(messagesController2.getChat(l10).admin_rights, uyVar3.G.user_admin_rights), null, true, uyVar3, false, true, null, runnable2, new mf(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new ta(uyVar, b2Var, l4, mdVar, n2Var, 4));
                return;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj5;
                TL_account.Passkey passkey = (TL_account.Passkey) obj4;
                String str = (String) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (passkeys != null) {
                    f3Var.dismiss();
                    while (i11 < passkeys.passkeys.size()) {
                        if (TextUtils.equals(passkeys.passkeys.get(i11).f18499id, passkey.f18499id)) {
                            passkeys.passkeys.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        U.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new ak0(5, passkeysActivity, passkey), 150L);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    new org.telegram.ui.Components.xc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0(str, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
