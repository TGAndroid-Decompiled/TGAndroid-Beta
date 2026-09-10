package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class m6 implements Utilities.Callback2 {
    public final int f34849a;
    public final Object f34850b;
    public final Object f34851c;
    public final Object d;

    public m6(Object obj, Object obj2, Object obj3, int i10) {
        this.f34849a = i10;
        this.f34850b = obj;
        this.f34851c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f34849a;
        int i11 = 0;
        Object obj3 = this.d;
        Object obj4 = this.f34851c;
        Object obj5 = this.f34850b;
        switch (i10) {
            case 0:
                androidx.car.app.utils.b bVar = (androidx.car.app.utils.b) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(bVar);
                AndroidUtilities.runOnUIThread(bVar);
                return;
            case 1:
                eo eoVar = (eo) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                lg lgVar = (lg) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = eoVar.f32413mb.keySet().iterator();
                    while (it.hasNext() && eoVar.f32413mb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    eoVar.f32413mb.put(getwebpagepreview.message, webPage);
                }
                lgVar.run(bool, webPage);
                return;
            case 2:
                final wy wyVar = (wy) obj5;
                nd ndVar = (nd) obj4;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                final Long l4 = (Long) obj2;
                Utilities.doCallbacks(new gg.u1(wyVar, l4, ndVar, p2Var, 8), new z(wyVar, d2Var, l4, 6), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                wy wyVar2 = wyVar;
                                if (wyVar2.G.bot_admin_rights != null) {
                                    TLRPC.User user = wyVar2.getMessagesController().getUser(Long.valueOf(wyVar2.H));
                                    MessagesController messagesController = wyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = wyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, wyVar2, z10, true, null, runnable, new nf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                wy wyVar3 = wyVar;
                                if (wyVar3.G.user_admin_rights != null) {
                                    MessagesController messagesController2 = wyVar3.getMessagesController();
                                    Long l10 = l4;
                                    wyVar3.getMessagesController().setUserAdminRole(l10.longValue(), wyVar3.getAccountInstance().getUserConfig().getCurrentUser(), rq.s0(messagesController2.getChat(l10).admin_rights, wyVar3.G.user_admin_rights), null, true, wyVar3, false, true, null, runnable2, new nf(4, runnable2));
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
                                wy wyVar2 = wyVar;
                                if (wyVar2.G.bot_admin_rights != null) {
                                    TLRPC.User user = wyVar2.getMessagesController().getUser(Long.valueOf(wyVar2.H));
                                    MessagesController messagesController = wyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = wyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    if (bool2 != null && bool2.booleanValue()) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, wyVar2, z10, true, null, runnable, new nf(5, runnable));
                                    return;
                                }
                                runnable.run();
                                return;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                wy wyVar3 = wyVar;
                                if (wyVar3.G.user_admin_rights != null) {
                                    MessagesController messagesController2 = wyVar3.getMessagesController();
                                    Long l10 = l4;
                                    wyVar3.getMessagesController().setUserAdminRole(l10.longValue(), wyVar3.getAccountInstance().getUserConfig().getCurrentUser(), rq.s0(messagesController2.getChat(l10).admin_rights, wyVar3.G.user_admin_rights), null, true, wyVar3, false, true, null, runnable2, new nf(4, runnable2));
                                    return;
                                }
                                runnable2.run();
                                return;
                        }
                    }
                }, new ua(wyVar, d2Var, l4, ndVar, p2Var, 4));
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
                        if (TextUtils.equals(passkeys.passkeys.get(i11).f17403id, passkey.f17403id)) {
                            passkeys.passkeys.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        U.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new ak0(4, passkeysActivity, passkey), 150L);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    new org.telegram.ui.Components.wc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).c0(str, false);
                    return;
                } else {
                    return;
                }
        }
    }
}
