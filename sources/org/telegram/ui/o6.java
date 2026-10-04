package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class o6 implements Utilities.Callback2 {
    public final int f39113a;
    public final Object f39114b;
    public final Object f39115c;
    public final Object d;

    public o6(Object obj, Object obj2, Object obj3, int i10) {
        this.f39113a = i10;
        this.f39114b = obj;
        this.f39115c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f39113a;
        int i11 = 0;
        Object obj3 = this.d;
        Object obj4 = this.f39115c;
        Object obj5 = this.f39114b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(m5Var);
                AndroidUtilities.runOnUIThread(m5Var);
                return;
            case 1:
                yn ynVar = (yn) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                jg jgVar = (jg) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = ynVar.f43394jb.keySet().iterator();
                    while (it.hasNext() && ynVar.f43394jb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    ynVar.f43394jb.put(getwebpagepreview.message, webPage);
                }
                jgVar.run(bool, webPage);
                return;
            case 2:
                final uy uyVar = (uy) obj5;
                nd ndVar = (nd) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                final Long l4 = (Long) obj2;
                Utilities.doCallbacks(new ai.e4(uyVar, l4, ndVar, n2Var, 11), new z(uyVar, b2Var, l4, 7), new Utilities.Callback() {
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
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, uyVar2, z10, true, null, runnable, new nf(5, runnable));
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
                                    uyVar3.getMessagesController().setUserAdminRole(l10.longValue(), uyVar3.getAccountInstance().getUserConfig().getCurrentUser(), mq.s0(messagesController2.getChat(l10).admin_rights, uyVar3.G.user_admin_rights), null, true, uyVar3, false, true, null, runnable2, new nf(4, runnable2));
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
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, uyVar2, z10, true, null, runnable, new nf(5, runnable));
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
                                    uyVar3.getMessagesController().setUserAdminRole(l10.longValue(), uyVar3.getAccountInstance().getUserConfig().getCurrentUser(), mq.s0(messagesController2.getChat(l10).admin_rights, uyVar3.G.user_admin_rights), null, true, uyVar3, false, true, null, runnable2, new nf(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new ua(uyVar, b2Var, l4, ndVar, n2Var, 4));
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
                        AndroidUtilities.runOnUIThread(new wj0(4, passkeysActivity, passkey), 150L);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    new org.telegram.ui.Components.yc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0(str, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
