package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class m6 implements Utilities.Callback2 {

    public final int f40371a;

    public final Object f40372b;

    public final Object f40373c;
    public final Object d;

    public m6(Object obj, Object obj2, Object obj3, int i10) {
        this.f40371a = i10;
        this.f40372b = obj;
        this.f40373c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f40371a;
        final int i11 = 1;
        final int i12 = 0;
        Object obj3 = this.d;
        Object obj4 = this.f40373c;
        Object obj5 = this.f40372b;
        switch (i10) {
            case 0:
                androidx.car.app.utils.b bVar = (androidx.car.app.utils.b) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(bVar);
                AndroidUtilities.runOnUIThread(bVar);
                break;
            case 1:
                rn rnVar = (rn) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                bg bgVar = (bg) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = rnVar.f42088ib.keySet().iterator();
                    while (it.hasNext() && rnVar.f42088ib.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    rnVar.f42088ib.put(getwebpagepreview.message, webPage);
                }
                bgVar.run(bool, webPage);
                break;
            case 2:
                final gy gyVar = (gy) obj5;
                id idVar = (id) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                final Long l10 = (Long) obj2;
                Utilities.doCallbacks(new cg.e1(gyVar, l10, idVar, n2Var), new b0(gyVar, b2Var, l10, 6), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        switch (i12) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                gy gyVar2 = gyVar;
                                if (gyVar2.C.bot_admin_rights == null) {
                                    runnable.run();
                                } else {
                                    TLRPC.User user = gyVar2.getMessagesController().getUser(Long.valueOf(gyVar2.D));
                                    MessagesController messagesController = gyVar2.getMessagesController();
                                    long jLongValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = gyVar2.C;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.setUserAdminRole(jLongValue, user, tL_chatAdminRights, null, false, gyVar2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new bf(5, runnable));
                                }
                                break;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                gy gyVar3 = gyVar;
                                if (gyVar3.C.user_admin_rights == null) {
                                    runnable2.run();
                                } else {
                                    MessagesController messagesController2 = gyVar3.getMessagesController();
                                    Long l11 = l10;
                                    gyVar3.getMessagesController().setUserAdminRole(l11.longValue(), gyVar3.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(l11).admin_rights, gyVar3.C.user_admin_rights), null, true, gyVar3, false, true, null, runnable2, new bf(4, runnable2));
                                }
                                break;
                        }
                    }
                }, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        switch (i11) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                gy gyVar2 = gyVar;
                                if (gyVar2.C.bot_admin_rights == null) {
                                    runnable.run();
                                } else {
                                    TLRPC.User user = gyVar2.getMessagesController().getUser(Long.valueOf(gyVar2.D));
                                    MessagesController messagesController = gyVar2.getMessagesController();
                                    long jLongValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = gyVar2.C;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.setUserAdminRole(jLongValue, user, tL_chatAdminRights, null, false, gyVar2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new bf(5, runnable));
                                }
                                break;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                gy gyVar3 = gyVar;
                                if (gyVar3.C.user_admin_rights == null) {
                                    runnable2.run();
                                } else {
                                    MessagesController messagesController2 = gyVar3.getMessagesController();
                                    Long l11 = l10;
                                    gyVar3.getMessagesController().setUserAdminRole(l11.longValue(), gyVar3.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(l11).admin_rights, gyVar3.C.user_admin_rights), null, true, gyVar3, false, true, null, runnable2, new bf(4, runnable2));
                                }
                                break;
                        }
                    }
                }, new hh.i2(gyVar, b2Var, l10, idVar, n2Var, 5));
                break;
            default:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj5;
                TL_account.Passkey passkey = (TL_account.Passkey) obj4;
                String str = (String) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (passkeys == null) {
                    if (tL_error != null) {
                        new org.telegram.ui.Components.mc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).c0(str, false);
                    }
                    break;
                } else {
                    e3Var.dismiss();
                    while (i12 < passkeys.passkeys.size()) {
                        if (TextUtils.equals(passkeys.passkeys.get(i12).f22585id, passkey.f22585id)) {
                            passkeys.passkeys.remove(i12);
                            i12--;
                        }
                        i12++;
                    }
                    org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                    if (n2VarU != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        n2VarU.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new ff0(13, passkeysActivity, passkey), 150L);
                        break;
                    }
                }
                break;
        }
    }
}
