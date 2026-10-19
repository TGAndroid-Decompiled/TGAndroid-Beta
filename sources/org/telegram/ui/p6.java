package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class p6 implements Utilities.Callback2 {
    public final int f40079a;
    public final Object f40080b;
    public final Object f40081c;
    public final Object d;

    public p6(Object obj, Object obj2, Object obj3, int i10) {
        this.f40079a = i10;
        this.f40080b = obj;
        this.f40081c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f40079a;
        int i11 = 0;
        Object obj3 = this.d;
        Object obj4 = this.f40081c;
        Object obj5 = this.f40080b;
        switch (i10) {
            case 0:
                org.telegram.messenger.camera.i iVar = (org.telegram.messenger.camera.i) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(iVar);
                AndroidUtilities.runOnUIThread(iVar);
                return;
            case 1:
                qn qnVar = (qn) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                cg cgVar = (cg) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = qnVar.f40773mb.keySet().iterator();
                    while (it.hasNext() && qnVar.f40773mb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    qnVar.f40773mb.put(getwebpagepreview.message, webPage);
                }
                cgVar.run(bool, webPage);
                return;
            case 2:
                final cy cyVar = (cy) obj5;
                md mdVar = (md) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                final Long l4 = (Long) obj2;
                Utilities.doCallbacks(new ci.z2(cyVar, l4, mdVar, n2Var, 11), new z(cyVar, b2Var, l4, 7), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                cy cyVar2 = cyVar;
                                if (cyVar2.G.bot_admin_rights != null) {
                                    TLRPC.User user = cyVar2.getMessagesController().getUser(Long.valueOf(cyVar2.H));
                                    MessagesController messagesController = cyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = cyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, cyVar2, z10, true, null, runnable, new gf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                cy cyVar3 = cyVar;
                                if (cyVar3.G.user_admin_rights != null) {
                                    MessagesController messagesController2 = cyVar3.getMessagesController();
                                    Long l10 = l4;
                                    cyVar3.getMessagesController().setUserAdminRole(l10.longValue(), cyVar3.getAccountInstance().getUserConfig().getCurrentUser(), bq.s0(messagesController2.getChat(l10).admin_rights, cyVar3.G.user_admin_rights), null, true, cyVar3, false, true, null, runnable2, new gf(4, runnable2));
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
                                cy cyVar2 = cyVar;
                                if (cyVar2.G.bot_admin_rights != null) {
                                    TLRPC.User user = cyVar2.getMessagesController().getUser(Long.valueOf(cyVar2.H));
                                    MessagesController messagesController = cyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = cyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, cyVar2, z10, true, null, runnable, new gf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                cy cyVar3 = cyVar;
                                if (cyVar3.G.user_admin_rights != null) {
                                    MessagesController messagesController2 = cyVar3.getMessagesController();
                                    Long l10 = l4;
                                    cyVar3.getMessagesController().setUserAdminRole(l10.longValue(), cyVar3.getAccountInstance().getUserConfig().getCurrentUser(), bq.s0(messagesController2.getChat(l10).admin_rights, cyVar3.G.user_admin_rights), null, true, cyVar3, false, true, null, runnable2, new gf(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new ai.g3(cyVar, b2Var, l4, mdVar, n2Var, 5));
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
                        if (TextUtils.equals(passkeys.passkeys.get(i11).f20477id, passkey.f20477id)) {
                            passkeys.passkeys.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        U.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new wg0(9, passkeysActivity, passkey), 150L);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    new org.telegram.ui.Components.xc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).e0(str, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
