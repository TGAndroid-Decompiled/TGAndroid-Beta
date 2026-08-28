package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class l6 implements Utilities.Callback2 {
    public final int f40059a;
    public final Object f40060b;
    public final Object f40061c;
    public final Object d;

    public l6(Object obj, Object obj2, Object obj3, int i9) {
        this.f40059a = i9;
        this.f40060b = obj;
        this.f40061c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i9 = this.f40059a;
        int i10 = 0;
        Object obj3 = this.d;
        Object obj4 = this.f40061c;
        Object obj5 = this.f40060b;
        switch (i9) {
            case 0:
                k6 k6Var = (k6) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(k6Var);
                AndroidUtilities.runOnUIThread(k6Var);
                return;
            case 1:
                qn qnVar = (qn) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                ag agVar = (ag) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = qnVar.f41952ib.keySet().iterator();
                    while (it.hasNext() && qnVar.f41952ib.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    qnVar.f41952ib.put(getwebpagepreview.message, webPage);
                }
                agVar.run(bool, webPage);
                return;
            case 2:
                final dy dyVar = (dy) obj5;
                id idVar = (id) obj4;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                final Long l10 = (Long) obj2;
                Utilities.doCallbacks(new bg.j1(dyVar, l10, idVar, o2Var), new a0(dyVar, c2Var, l10, 6), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                dy dyVar2 = dyVar;
                                if (dyVar2.C.bot_admin_rights != null) {
                                    TLRPC.User user = dyVar2.getMessagesController().getUser(Long.valueOf(dyVar2.D));
                                    MessagesController messagesController = dyVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = dyVar2.C;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, dyVar2, z10, true, null, runnable, new bf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                dy dyVar3 = dyVar;
                                if (dyVar3.C.user_admin_rights != null) {
                                    MessagesController messagesController2 = dyVar3.getMessagesController();
                                    Long l11 = l10;
                                    dyVar3.getMessagesController().setUserAdminRole(l11.longValue(), dyVar3.getAccountInstance().getUserConfig().getCurrentUser(), bq.r0(messagesController2.getChat(l11).admin_rights, dyVar3.C.user_admin_rights), null, true, dyVar3, false, true, null, runnable2, new bf(4, runnable2));
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
                                dy dyVar2 = dyVar;
                                if (dyVar2.C.bot_admin_rights != null) {
                                    TLRPC.User user = dyVar2.getMessagesController().getUser(Long.valueOf(dyVar2.D));
                                    MessagesController messagesController = dyVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = dyVar2.C;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, dyVar2, z10, true, null, runnable, new bf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                dy dyVar3 = dyVar;
                                if (dyVar3.C.user_admin_rights != null) {
                                    MessagesController messagesController2 = dyVar3.getMessagesController();
                                    Long l11 = l10;
                                    dyVar3.getMessagesController().setUserAdminRole(l11.longValue(), dyVar3.getAccountInstance().getUserConfig().getCurrentUser(), bq.r0(messagesController2.getChat(l11).admin_rights, dyVar3.C.user_admin_rights), null, true, dyVar3, false, true, null, runnable2, new bf(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new gh.i2(dyVar, c2Var, l10, idVar, o2Var, 5));
                return;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj5;
                TL_account.Passkey passkey = (TL_account.Passkey) obj4;
                String str = (String) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (passkeys != null) {
                    f3Var.dismiss();
                    while (i10 < passkeys.passkeys.size()) {
                        if (TextUtils.equals(passkeys.passkeys.get(i10).f22585id, passkey.f22585id)) {
                            passkeys.passkeys.remove(i10);
                            i10--;
                        }
                        i10++;
                    }
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        U.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new cf0(13, passkeysActivity, passkey), 150L);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    new org.telegram.ui.Components.oc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0(str, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
