package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class l6 implements Utilities.Callback2 {
    public final int f35225a;
    public final Object f35226b;
    public final Object f35227c;
    public final Object d;

    public l6(Object obj, Object obj2, Object obj3, int i10) {
        this.f35225a = i10;
        this.f35226b = obj;
        this.f35227c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f35225a;
        int i11 = 0;
        Object obj3 = this.d;
        Object obj4 = this.f35227c;
        Object obj5 = this.f35226b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(l5Var);
                AndroidUtilities.runOnUIThread(l5Var);
                return;
            case 1:
                wn wnVar = (wn) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                pg pgVar = (pg) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = wnVar.f39553lb.keySet().iterator();
                    while (it.hasNext() && wnVar.f39553lb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    wnVar.f39553lb.put(getwebpagepreview.message, webPage);
                }
                pgVar.run(bool, webPage);
                return;
            case 2:
                final qy qyVar = (qy) obj5;
                ld ldVar = (ld) obj4;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                final Long l4 = (Long) obj2;
                Utilities.doCallbacks(new ai.e4(qyVar, l4, ldVar, m2Var, 11), new z(qyVar, a2Var, l4, 7), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                qy qyVar2 = qyVar;
                                if (qyVar2.G.bot_admin_rights != null) {
                                    TLRPC.User user = qyVar2.getMessagesController().getUser(Long.valueOf(qyVar2.H));
                                    MessagesController messagesController = qyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = qyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, qyVar2, z10, true, null, runnable, new kf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                qy qyVar3 = qyVar;
                                if (qyVar3.G.user_admin_rights != null) {
                                    MessagesController messagesController2 = qyVar3.getMessagesController();
                                    Long l10 = l4;
                                    qyVar3.getMessagesController().setUserAdminRole(l10.longValue(), qyVar3.getAccountInstance().getUserConfig().getCurrentUser(), kq.s0(messagesController2.getChat(l10).admin_rights, qyVar3.G.user_admin_rights), null, true, qyVar3, false, true, null, runnable2, new kf(4, runnable2));
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
                                qy qyVar2 = qyVar;
                                if (qyVar2.G.bot_admin_rights != null) {
                                    TLRPC.User user = qyVar2.getMessagesController().getUser(Long.valueOf(qyVar2.H));
                                    MessagesController messagesController = qyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = qyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, qyVar2, z10, true, null, runnable, new kf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                qy qyVar3 = qyVar;
                                if (qyVar3.G.user_admin_rights != null) {
                                    MessagesController messagesController2 = qyVar3.getMessagesController();
                                    Long l10 = l4;
                                    qyVar3.getMessagesController().setUserAdminRole(l10.longValue(), qyVar3.getAccountInstance().getUserConfig().getCurrentUser(), kq.s0(messagesController2.getChat(l10).admin_rights, qyVar3.G.user_admin_rights), null, true, qyVar3, false, true, null, runnable2, new kf(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new sa(qyVar, a2Var, l4, ldVar, m2Var, 4));
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
                        if (TextUtils.equals(passkeys.passkeys.get(i11).f18538id, passkey.f18538id)) {
                            passkeys.passkeys.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        U.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new sj0(6, passkeysActivity, passkey), 150L);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    new org.telegram.ui.Components.xc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).c0(str, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
