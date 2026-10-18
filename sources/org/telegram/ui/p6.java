package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class p6 implements Utilities.Callback2 {
    public final int f39954a;
    public final Object f39955b;
    public final Object f39956c;
    public final Object d;

    public p6(Object obj, Object obj2, Object obj3, int i10) {
        this.f39954a = i10;
        this.f39955b = obj;
        this.f39956c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f39954a;
        int i11 = 0;
        Object obj3 = this.d;
        Object obj4 = this.f39956c;
        Object obj5 = this.f39955b;
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
                eg egVar = (eg) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = snVar.f41289mb.keySet().iterator();
                    while (it.hasNext() && snVar.f41289mb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    snVar.f41289mb.put(getwebpagepreview.message, webPage);
                }
                egVar.run(bool, webPage);
                return;
            case 2:
                final ey eyVar = (ey) obj5;
                od odVar = (od) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                final Long l4 = (Long) obj2;
                Utilities.doCallbacks(new ci.y2(eyVar, l4, odVar, n2Var, 11), new z(eyVar, b2Var, l4, 7), new Utilities.Callback() {
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
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, eyVar2, z10, true, null, runnable, new jf(5, runnable));
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
                                    eyVar3.getMessagesController().setUserAdminRole(l10.longValue(), eyVar3.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(l10).admin_rights, eyVar3.G.user_admin_rights), null, true, eyVar3, false, true, null, runnable2, new jf(4, runnable2));
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
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, eyVar2, z10, true, null, runnable, new jf(5, runnable));
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
                                    eyVar3.getMessagesController().setUserAdminRole(l10.longValue(), eyVar3.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(l10).admin_rights, eyVar3.G.user_admin_rights), null, true, eyVar3, false, true, null, runnable2, new jf(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new ai.d3(eyVar, b2Var, l4, odVar, n2Var, 5));
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
                        if (TextUtils.equals(passkeys.passkeys.get(i11).f20474id, passkey.f20474id)) {
                            passkeys.passkeys.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        U.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new yg0(9, passkeysActivity, passkey), 150L);
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
