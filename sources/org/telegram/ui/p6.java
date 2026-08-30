package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class p6 implements Utilities.Callback2 {
    public final int f37195a;
    public final Object f37196b;
    public final Object f37197c;
    public final Object d;

    public p6(Object obj, Object obj2, Object obj3, int i10) {
        this.f37195a = i10;
        this.f37196b = obj;
        this.f37197c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f37195a;
        int i11 = 0;
        Object obj3 = this.d;
        Object obj4 = this.f37197c;
        Object obj5 = this.f37196b;
        switch (i10) {
            case 0:
                androidx.car.app.utils.c cVar = (androidx.car.app.utils.c) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(cVar);
                AndroidUtilities.runOnUIThread(cVar);
                return;
            case 1:
                xn xnVar = (xn) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                eg egVar = (eg) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = xnVar.f40070jb.keySet().iterator();
                    while (it.hasNext() && xnVar.f40070jb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    xnVar.f40070jb.put(getwebpagepreview.message, webPage);
                }
                egVar.run(bool, webPage);
                return;
            case 2:
                final oy oyVar = (oy) obj5;
                nd ndVar = (nd) obj4;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                final Long l10 = (Long) obj2;
                Utilities.doCallbacks(new gg.c1(oyVar, l10, ndVar, p2Var), new a0(oyVar, d2Var, l10, 6), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        boolean z4;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                oy oyVar2 = oyVar;
                                if (oyVar2.D.bot_admin_rights != null) {
                                    TLRPC.User user = oyVar2.getMessagesController().getUser(Long.valueOf(oyVar2.E));
                                    MessagesController messagesController = oyVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = oyVar2.D;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, oyVar2, z4, true, null, runnable, new gf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                oy oyVar3 = oyVar;
                                if (oyVar3.D.user_admin_rights != null) {
                                    MessagesController messagesController2 = oyVar3.getMessagesController();
                                    Long l11 = l10;
                                    oyVar3.getMessagesController().setUserAdminRole(l11.longValue(), oyVar3.getAccountInstance().getUserConfig().getCurrentUser(), jq.s0(messagesController2.getChat(l11).admin_rights, oyVar3.D.user_admin_rights), null, true, oyVar3, false, true, null, runnable2, new gf(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        boolean z4;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                oy oyVar2 = oyVar;
                                if (oyVar2.D.bot_admin_rights != null) {
                                    TLRPC.User user = oyVar2.getMessagesController().getUser(Long.valueOf(oyVar2.E));
                                    MessagesController messagesController = oyVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = oyVar2.D;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, oyVar2, z4, true, null, runnable, new gf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                oy oyVar3 = oyVar;
                                if (oyVar3.D.user_admin_rights != null) {
                                    MessagesController messagesController2 = oyVar3.getMessagesController();
                                    Long l11 = l10;
                                    oyVar3.getMessagesController().setUserAdminRole(l11.longValue(), oyVar3.getAccountInstance().getUserConfig().getCurrentUser(), jq.s0(messagesController2.getChat(l11).admin_rights, oyVar3.D.user_admin_rights), null, true, oyVar3, false, true, null, runnable2, new gf(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new lh.g2(oyVar, d2Var, l10, ndVar, p2Var, 5));
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
                        if (TextUtils.equals(passkeys.passkeys.get(i11).f19387id, passkey.f19387id)) {
                            passkeys.passkeys.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        U.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new fe0(19, passkeysActivity, passkey), 150L);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    new org.telegram.ui.Components.qc(g3Var.topBulletinContainer, g3Var.getResourcesProvider()).c0(str, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
