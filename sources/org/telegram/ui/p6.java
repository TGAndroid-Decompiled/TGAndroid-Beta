package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class p6 implements Utilities.Callback2 {
    public final int f40353a;
    public final Object f40354b;
    public final Object f40355c;
    public final Object d;

    public p6(Object obj, Object obj2, Object obj3, int i10) {
        this.f40353a = i10;
        this.f40354b = obj;
        this.f40355c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f40353a;
        int i11 = 0;
        Object obj3 = this.d;
        Object obj4 = this.f40355c;
        Object obj5 = this.f40354b;
        switch (i10) {
            case 0:
                org.telegram.messenger.camera.i iVar = (org.telegram.messenger.camera.i) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(iVar);
                AndroidUtilities.runOnUIThread(iVar);
                return;
            case 1:
                sn snVar = (sn) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                dg dgVar = (dg) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = snVar.f41773zb.keySet().iterator();
                    while (it.hasNext() && snVar.f41773zb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    snVar.f41773zb.put(getwebpagepreview.message, webPage);
                }
                dgVar.run(bool, webPage);
                return;
            case 2:
                final ey eyVar = (ey) obj5;
                md mdVar = (md) obj4;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                final Long l4 = (Long) obj2;
                Utilities.doCallbacks(new ci.y2(eyVar, l4, mdVar, o2Var, 11), new y(eyVar, c2Var, l4, 8), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                ey eyVar2 = eyVar;
                                if (eyVar2.G.bot_admin_rights != null) {
                                    TLRPC.User user = eyVar2.getMessagesController().getUser(Long.valueOf(eyVar2.H));
                                    MessagesController messagesController = eyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = eyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, eyVar2, z10, true, null, runnable, new gf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                ey eyVar3 = eyVar;
                                if (eyVar3.G.user_admin_rights != null) {
                                    MessagesController messagesController2 = eyVar3.getMessagesController();
                                    Long l10 = l4;
                                    eyVar3.getMessagesController().setUserAdminRole(l10.longValue(), eyVar3.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(l10).admin_rights, eyVar3.G.user_admin_rights), null, true, eyVar3, false, true, null, runnable2, new gf(4, runnable2));
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
                                ey eyVar2 = eyVar;
                                if (eyVar2.G.bot_admin_rights != null) {
                                    TLRPC.User user = eyVar2.getMessagesController().getUser(Long.valueOf(eyVar2.H));
                                    MessagesController messagesController = eyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = eyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, eyVar2, z10, true, null, runnable, new gf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                ey eyVar3 = eyVar;
                                if (eyVar3.G.user_admin_rights != null) {
                                    MessagesController messagesController2 = eyVar3.getMessagesController();
                                    Long l10 = l4;
                                    eyVar3.getMessagesController().setUserAdminRole(l10.longValue(), eyVar3.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(l10).admin_rights, eyVar3.G.user_admin_rights), null, true, eyVar3, false, true, null, runnable2, new gf(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new ai.f3(eyVar, c2Var, l4, mdVar, o2Var, 5));
                return;
            default:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj5;
                TL_account.Passkey passkey = (TL_account.Passkey) obj4;
                String str = (String) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (passkeys != null) {
                    h3Var.dismiss();
                    while (i11 < passkeys.passkeys.size()) {
                        if (TextUtils.equals(passkeys.passkeys.get(i11).f20545id, passkey.f20545id)) {
                            passkeys.passkeys.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        U.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new bh0(9, passkeysActivity, passkey), 150L);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    new org.telegram.ui.Components.xc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).e0(str, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
