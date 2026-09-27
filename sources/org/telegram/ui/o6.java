package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class o6 implements Utilities.Callback2 {
    public final int f36141a;
    public final Object f36142b;
    public final Object f36143c;
    public final Object d;

    public o6(Object obj, Object obj2, Object obj3, int i10) {
        this.f36141a = i10;
        this.f36142b = obj;
        this.f36143c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f36141a;
        int i11 = 0;
        Object obj3 = this.d;
        Object obj4 = this.f36143c;
        Object obj5 = this.f36142b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(n5Var);
                AndroidUtilities.runOnUIThread(n5Var);
                return;
            case 1:
                xn xnVar = (xn) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                sg sgVar = (sg) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = xnVar.f39836lb.keySet().iterator();
                    while (it.hasNext() && xnVar.f39836lb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    xnVar.f39836lb.put(getwebpagepreview.message, webPage);
                }
                sgVar.run(bool, webPage);
                return;
            case 2:
                final ty tyVar = (ty) obj5;
                nd ndVar = (nd) obj4;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                final Long l4 = (Long) obj2;
                Utilities.doCallbacks(new ai.e4(tyVar, l4, ndVar, o2Var, 11), new a0(tyVar, c2Var, l4, 7), new Utilities.Callback() {
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
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, tyVar2, z10, true, null, runnable, new nf(5, runnable));
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
                                    tyVar3.getMessagesController().setUserAdminRole(l10.longValue(), tyVar3.getAccountInstance().getUserConfig().getCurrentUser(), lq.s0(messagesController2.getChat(l10).admin_rights, tyVar3.G.user_admin_rights), null, true, tyVar3, false, true, null, runnable2, new nf(4, runnable2));
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
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, tyVar2, z10, true, null, runnable, new nf(5, runnable));
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
                                    tyVar3.getMessagesController().setUserAdminRole(l10.longValue(), tyVar3.getAccountInstance().getUserConfig().getCurrentUser(), lq.s0(messagesController2.getChat(l10).admin_rights, tyVar3.G.user_admin_rights), null, true, tyVar3, false, true, null, runnable2, new nf(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new va(tyVar, c2Var, l4, ndVar, o2Var, 4));
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
                        if (TextUtils.equals(passkeys.passkeys.get(i11).f18532id, passkey.f18532id)) {
                            passkeys.passkeys.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        U.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new jl0(2, passkeysActivity, passkey), 150L);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    new org.telegram.ui.Components.xc(g3Var.topBulletinContainer, g3Var.getResourcesProvider()).c0(str, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
