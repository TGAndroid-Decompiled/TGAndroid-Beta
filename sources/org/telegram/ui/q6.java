package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class q6 implements Utilities.Callback2 {
    public final int f39067a;
    public final Object f39068b;
    public final Object f39069c;
    public final Object d;

    public q6(Object obj, Object obj2, Object obj3, int i10) {
        this.f39067a = i10;
        this.f39068b = obj;
        this.f39069c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f39067a;
        int i11 = 0;
        Object obj3 = this.d;
        Object obj4 = this.f39069c;
        Object obj5 = this.f39068b;
        switch (i10) {
            case 0:
                androidx.car.app.utils.b bVar = (androidx.car.app.utils.b) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(bVar);
                AndroidUtilities.runOnUIThread(bVar);
                return;
            case 1:
                fo foVar = (fo) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                pg pgVar = (pg) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = foVar.f35731mb.keySet().iterator();
                    while (it.hasNext() && foVar.f35731mb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    foVar.f35731mb.put(getwebpagepreview.message, webPage);
                }
                pgVar.run(bool, webPage);
                return;
            case 2:
                final yy yyVar = (yy) obj5;
                sd sdVar = (sd) obj4;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                final Long l4 = (Long) obj2;
                Utilities.doCallbacks(new bi.u3(yyVar, l4, sdVar, m2Var, 11), new z(yyVar, a2Var, l4, 7), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                yy yyVar2 = yyVar;
                                if (yyVar2.G.bot_admin_rights != null) {
                                    TLRPC.User user = yyVar2.getMessagesController().getUser(Long.valueOf(yyVar2.H));
                                    MessagesController messagesController = yyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = yyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, yyVar2, z10, true, null, runnable, new tf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                yy yyVar3 = yyVar;
                                if (yyVar3.G.user_admin_rights != null) {
                                    MessagesController messagesController2 = yyVar3.getMessagesController();
                                    Long l10 = l4;
                                    yyVar3.getMessagesController().setUserAdminRole(l10.longValue(), yyVar3.getAccountInstance().getUserConfig().getCurrentUser(), tq.s0(messagesController2.getChat(l10).admin_rights, yyVar3.G.user_admin_rights), null, true, yyVar3, false, true, null, runnable2, new tf(4, runnable2));
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
                                yy yyVar2 = yyVar;
                                if (yyVar2.G.bot_admin_rights != null) {
                                    TLRPC.User user = yyVar2.getMessagesController().getUser(Long.valueOf(yyVar2.H));
                                    MessagesController messagesController = yyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = yyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, yyVar2, z10, true, null, runnable, new tf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                yy yyVar3 = yyVar;
                                if (yyVar3.G.user_admin_rights != null) {
                                    MessagesController messagesController2 = yyVar3.getMessagesController();
                                    Long l10 = l4;
                                    yyVar3.getMessagesController().setUserAdminRole(l10.longValue(), yyVar3.getAccountInstance().getUserConfig().getCurrentUser(), tq.s0(messagesController2.getChat(l10).admin_rights, yyVar3.G.user_admin_rights), null, true, yyVar3, false, true, null, runnable2, new tf(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new xa(yyVar, a2Var, l4, sdVar, m2Var, 4));
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
                        if (TextUtils.equals(passkeys.passkeys.get(i11).f19119id, passkey.f19119id)) {
                            passkeys.passkeys.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        U.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new se0(21, passkeysActivity, passkey), 150L);
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
