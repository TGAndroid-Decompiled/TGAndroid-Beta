package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class l6 implements Utilities.Callback2 {
    public final int f39484a;
    public final Object f39485b;
    public final Object f39486c;
    public final Object d;

    public l6(Object obj, Object obj2, Object obj3, int i10) {
        this.f39484a = i10;
        this.f39485b = obj;
        this.f39486c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f39484a;
        int i11 = 0;
        Object obj3 = this.d;
        Object obj4 = this.f39486c;
        Object obj5 = this.f39485b;
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
                kg kgVar = (kg) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = znVar.f44904mb.keySet().iterator();
                    while (it.hasNext() && znVar.f44904mb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    znVar.f44904mb.put(getwebpagepreview.message, webPage);
                }
                kgVar.run(bool, webPage);
                return;
            case 2:
                final ty tyVar = (ty) obj5;
                md mdVar = (md) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                final Long l4 = (Long) obj2;
                Utilities.doCallbacks(new ai.f4(tyVar, l4, mdVar, n2Var, 11), new z(tyVar, b2Var, l4, 8), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                ty tyVar2 = tyVar;
                                if (tyVar2.G.bot_admin_rights != null) {
                                    TLRPC.User user = tyVar2.getMessagesController().getUser(Long.valueOf(tyVar2.H));
                                    MessagesController messagesController = tyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = tyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, tyVar2, z10, true, null, runnable, new of(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                ty tyVar3 = tyVar;
                                if (tyVar3.G.user_admin_rights != null) {
                                    MessagesController messagesController2 = tyVar3.getMessagesController();
                                    Long l10 = l4;
                                    tyVar3.getMessagesController().setUserAdminRole(l10.longValue(), tyVar3.getAccountInstance().getUserConfig().getCurrentUser(), nq.s0(messagesController2.getChat(l10).admin_rights, tyVar3.G.user_admin_rights), null, true, tyVar3, false, true, null, runnable2, new of(4, runnable2));
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
                                ty tyVar2 = tyVar;
                                if (tyVar2.G.bot_admin_rights != null) {
                                    TLRPC.User user = tyVar2.getMessagesController().getUser(Long.valueOf(tyVar2.H));
                                    MessagesController messagesController = tyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = tyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, tyVar2, z10, true, null, runnable, new of(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                ty tyVar3 = tyVar;
                                if (tyVar3.G.user_admin_rights != null) {
                                    MessagesController messagesController2 = tyVar3.getMessagesController();
                                    Long l10 = l4;
                                    tyVar3.getMessagesController().setUserAdminRole(l10.longValue(), tyVar3.getAccountInstance().getUserConfig().getCurrentUser(), nq.s0(messagesController2.getChat(l10).admin_rights, tyVar3.G.user_admin_rights), null, true, tyVar3, false, true, null, runnable2, new of(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new ta(tyVar, b2Var, l4, mdVar, n2Var, 4));
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
                        if (TextUtils.equals(passkeys.passkeys.get(i11).f20247id, passkey.f20247id)) {
                            passkeys.passkeys.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        U.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new tf0(15, passkeysActivity, passkey), 150L);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    new org.telegram.ui.Components.ad(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).e0(str, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
