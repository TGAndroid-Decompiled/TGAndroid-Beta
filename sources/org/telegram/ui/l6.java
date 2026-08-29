package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class l6 implements Utilities.Callback2 {
    public final int f40104a;
    public final Object f40105b;
    public final Object f40106c;
    public final Object d;

    public l6(Object obj, Object obj2, Object obj3, int i10) {
        this.f40104a = i10;
        this.f40105b = obj;
        this.f40106c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f40104a;
        int i11 = 0;
        Object obj3 = this.d;
        Object obj4 = this.f40106c;
        Object obj5 = this.f40105b;
        switch (i10) {
            case 0:
                androidx.car.app.utils.c cVar = (androidx.car.app.utils.c) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(cVar);
                AndroidUtilities.runOnUIThread(cVar);
                return;
            case 1:
                tn tnVar = (tn) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                yf yfVar = (yf) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = tnVar.f42849ib.keySet().iterator();
                    while (it.hasNext() && tnVar.f42849ib.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    tnVar.f42849ib.put(getwebpagepreview.message, webPage);
                }
                yfVar.run(bool, webPage);
                return;
            case 2:
                final fy fyVar = (fy) obj5;
                hd hdVar = (hd) obj4;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                final Long l10 = (Long) obj2;
                Utilities.doCallbacks(new eg.d1(fyVar, l10, hdVar, o2Var), new b0(fyVar, c2Var, l10, 6), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                fy fyVar2 = fyVar;
                                if (fyVar2.C.bot_admin_rights != null) {
                                    TLRPC.User user = fyVar2.getMessagesController().getUser(Long.valueOf(fyVar2.D));
                                    MessagesController messagesController = fyVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = fyVar2.C;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, fyVar2, z10, true, null, runnable, new ze(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                fy fyVar3 = fyVar;
                                if (fyVar3.C.user_admin_rights != null) {
                                    MessagesController messagesController2 = fyVar3.getMessagesController();
                                    Long l11 = l10;
                                    fyVar3.getMessagesController().setUserAdminRole(l11.longValue(), fyVar3.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(l11).admin_rights, fyVar3.C.user_admin_rights), null, true, fyVar3, false, true, null, runnable2, new ze(4, runnable2));
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
                                fy fyVar2 = fyVar;
                                if (fyVar2.C.bot_admin_rights != null) {
                                    TLRPC.User user = fyVar2.getMessagesController().getUser(Long.valueOf(fyVar2.D));
                                    MessagesController messagesController = fyVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = fyVar2.C;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, fyVar2, z10, true, null, runnable, new ze(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                fy fyVar3 = fyVar;
                                if (fyVar3.C.user_admin_rights != null) {
                                    MessagesController messagesController2 = fyVar3.getMessagesController();
                                    Long l11 = l10;
                                    fyVar3.getMessagesController().setUserAdminRole(l11.longValue(), fyVar3.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(l11).admin_rights, fyVar3.C.user_admin_rights), null, true, fyVar3, false, true, null, runnable2, new ze(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new jh.g2(fyVar, c2Var, l10, hdVar, o2Var, 5));
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
                        if (TextUtils.equals(passkeys.passkeys.get(i11).f22597id, passkey.f22597id)) {
                            passkeys.passkeys.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        U.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new lf0(10, passkeysActivity, passkey), 150L);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    new org.telegram.ui.Components.tc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0(str, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
