package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class p6 implements Utilities.Callback2 {
    public final int f39928a;
    public final Object f39929b;
    public final Object f39930c;
    public final Object d;

    public p6(Object obj, Object obj2, Object obj3, int i10) {
        this.f39928a = i10;
        this.f39929b = obj;
        this.f39930c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f39928a;
        int i11 = 0;
        Object obj3 = this.d;
        Object obj4 = this.f39930c;
        Object obj5 = this.f39929b;
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
                    Iterator it = xnVar.f43239jb.keySet().iterator();
                    while (it.hasNext() && xnVar.f43239jb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    xnVar.f43239jb.put(getwebpagepreview.message, webPage);
                }
                egVar.run(bool, webPage);
                return;
            case 2:
                final py pyVar = (py) obj5;
                nd ndVar = (nd) obj4;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                final Long l10 = (Long) obj2;
                Utilities.doCallbacks(new hg.c1(pyVar, l10, ndVar, p2Var), new a0(pyVar, d2Var, l10, 6), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        boolean z4;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                py pyVar2 = pyVar;
                                if (pyVar2.D.bot_admin_rights != null) {
                                    TLRPC.User user = pyVar2.getMessagesController().getUser(Long.valueOf(pyVar2.E));
                                    MessagesController messagesController = pyVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = pyVar2.D;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, pyVar2, z4, true, null, runnable, new gf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                py pyVar3 = pyVar;
                                if (pyVar3.D.user_admin_rights != null) {
                                    MessagesController messagesController2 = pyVar3.getMessagesController();
                                    Long l11 = l10;
                                    pyVar3.getMessagesController().setUserAdminRole(l11.longValue(), pyVar3.getAccountInstance().getUserConfig().getCurrentUser(), kq.s0(messagesController2.getChat(l11).admin_rights, pyVar3.D.user_admin_rights), null, true, pyVar3, false, true, null, runnable2, new gf(4, runnable2));
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
                                py pyVar2 = pyVar;
                                if (pyVar2.D.bot_admin_rights != null) {
                                    TLRPC.User user = pyVar2.getMessagesController().getUser(Long.valueOf(pyVar2.E));
                                    MessagesController messagesController = pyVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = pyVar2.D;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, pyVar2, z4, true, null, runnable, new gf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                py pyVar3 = pyVar;
                                if (pyVar3.D.user_admin_rights != null) {
                                    MessagesController messagesController2 = pyVar3.getMessagesController();
                                    Long l11 = l10;
                                    pyVar3.getMessagesController().setUserAdminRole(l11.longValue(), pyVar3.getAccountInstance().getUserConfig().getCurrentUser(), kq.s0(messagesController2.getChat(l11).admin_rights, pyVar3.D.user_admin_rights), null, true, pyVar3, false, true, null, runnable2, new gf(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new mh.f2(pyVar, d2Var, l10, ndVar, p2Var, 5));
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
                        if (TextUtils.equals(passkeys.passkeys.get(i11).f21048id, passkey.f21048id)) {
                            passkeys.passkeys.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        U.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new he0(18, passkeysActivity, passkey), 150L);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    new org.telegram.ui.Components.qc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).c0(str, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
