package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class m6 implements Utilities.Callback2 {
    public final int f35158a;
    public final Object f35159b;
    public final Object f35160c;
    public final Object d;

    public m6(Object obj, Object obj2, Object obj3, int i10) {
        this.f35158a = i10;
        this.f35159b = obj;
        this.f35160c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f35158a;
        int i11 = 0;
        Object obj3 = this.d;
        Object obj4 = this.f35160c;
        Object obj5 = this.f35159b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(m5Var);
                AndroidUtilities.runOnUIThread(m5Var);
                return;
            case 1:
                xn xnVar = (xn) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                ig igVar = (ig) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = xnVar.f39455lb.keySet().iterator();
                    while (it.hasNext() && xnVar.f39455lb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    xnVar.f39455lb.put(getwebpagepreview.message, webPage);
                }
                igVar.run(bool, webPage);
                return;
            case 2:
                final ry ryVar = (ry) obj5;
                ld ldVar = (ld) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                final Long l4 = (Long) obj2;
                Utilities.doCallbacks(new ai.e4(ryVar, l4, ldVar, n2Var, 11), new z(ryVar, b2Var, l4, 7), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                ry ryVar2 = ryVar;
                                if (ryVar2.G.bot_admin_rights != null) {
                                    TLRPC.User user = ryVar2.getMessagesController().getUser(Long.valueOf(ryVar2.H));
                                    MessagesController messagesController = ryVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = ryVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, ryVar2, z10, true, null, runnable, new lf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                ry ryVar3 = ryVar;
                                if (ryVar3.G.user_admin_rights != null) {
                                    MessagesController messagesController2 = ryVar3.getMessagesController();
                                    Long l10 = l4;
                                    ryVar3.getMessagesController().setUserAdminRole(l10.longValue(), ryVar3.getAccountInstance().getUserConfig().getCurrentUser(), lq.s0(messagesController2.getChat(l10).admin_rights, ryVar3.G.user_admin_rights), null, true, ryVar3, false, true, null, runnable2, new lf(4, runnable2));
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
                                ry ryVar2 = ryVar;
                                if (ryVar2.G.bot_admin_rights != null) {
                                    TLRPC.User user = ryVar2.getMessagesController().getUser(Long.valueOf(ryVar2.H));
                                    MessagesController messagesController = ryVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = ryVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, ryVar2, z10, true, null, runnable, new lf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                ry ryVar3 = ryVar;
                                if (ryVar3.G.user_admin_rights != null) {
                                    MessagesController messagesController2 = ryVar3.getMessagesController();
                                    Long l10 = l4;
                                    ryVar3.getMessagesController().setUserAdminRole(l10.longValue(), ryVar3.getAccountInstance().getUserConfig().getCurrentUser(), lq.s0(messagesController2.getChat(l10).admin_rights, ryVar3.G.user_admin_rights), null, true, ryVar3, false, true, null, runnable2, new lf(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new sa(ryVar, b2Var, l4, ldVar, n2Var, 4));
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
                        if (TextUtils.equals(passkeys.passkeys.get(i11).f18286id, passkey.f18286id)) {
                            passkeys.passkeys.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        U.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new gl0(1, passkeysActivity, passkey), 150L);
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
