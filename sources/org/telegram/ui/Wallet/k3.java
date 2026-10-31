package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.il;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.op0;
import org.telegram.ui.Components.u80;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ep0;
import org.telegram.ui.go0;
import org.telegram.ui.ke1;
import org.telegram.ui.pe1;
import org.telegram.ui.ve1;
import org.telegram.ui.we1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
public final class k3 implements Runnable {
    public final int f34807a;
    public final Object f34808b;
    public final Object f34809c;

    public k3(int i10, Object obj, Object obj2) {
        this.f34807a = i10;
        this.f34808b = obj;
        this.f34809c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.web.z0 z0Var;
        org.telegram.ui.web.d0 d0Var;
        float f7;
        org.telegram.ui.ActionBar.w5 w5Var;
        int i10 = this.f34807a;
        boolean z10 = true;
        int i11 = 0;
        Object obj = this.f34809c;
        Object obj2 = this.f34808b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj2;
                k2Var.presentFragment(new r9(k2Var.getCurrentAccount(), ((TL_wallet.card) obj).address));
                return;
            case 1:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(cd.L0(2131748789, null));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new u80(org.telegram.messenger.i0.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    return;
                }
                return;
            case 2:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((j20) obj2).a(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                return;
            case 3:
                ((q4) obj2).a(((TL_wallet.walletTransaction[]) obj)[0]);
                return;
            case 4:
                ((b6) obj2).P0.remove((k7) obj);
                return;
            case 5:
                z2[] z2VarArr = (z2[]) obj2;
                z2VarArr[0].setOnDismissListener(new l2((TLRPC.User) obj, 1));
                z2VarArr[0].dismiss();
                return;
            case 6:
                new cc(((z2[]) obj2)[0].E, (org.telegram.ui.ActionBar.p6) obj).Q(2131623993, 36, cd.L0(2131743227, null)).k(false);
                return;
            case 7:
                super/*android.widget.TextView*/.onDraw((Canvas) obj);
                return;
            case 8:
                j6.e((j6) obj2, (Canvas) obj);
                return;
            case 9:
                j6.f((j6) obj2, (Canvas) obj);
                return;
            case 10:
                ((ViewGroup) obj).removeView(((s6) obj2).h);
                return;
            case 11:
                ((q20) obj2).a((TL_wallet.walletTransaction) obj);
                return;
            case 12:
                h8 h8Var = (h8) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!h8Var.f34628a1 && userFull != null) {
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    h8Var.d(cardVar);
                    return;
                }
                return;
            case 13:
                k8 k8Var = (k8) obj;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj2;
                if ((k2Var2 instanceof b6) && cc.a(k2Var2)) {
                    cc.a0(k2Var2).I(2131623989, cd.L0(2131743115, null), cd.L0(2131743114, null)).j();
                }
                k8Var.finishFragment();
                return;
            case 14:
                ((p0) obj).B();
                ((t8) obj2).f29837a.f30819f3.O(true);
                return;
            case 15:
                t8 t8Var = (t8) obj2;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, t8Var.getParentActivity(), t8Var.getResourceProvider());
                String L0 = cd.L0(2131743157, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = cd.L0(2131743159, null);
                alertDialog$Builder.h(cd.L0(2131752589, null), null);
                alertDialog$Builder.k(cd.L0(2131743162, null), new ep0(26, t8Var, (k0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 16:
                ((org.telegram.ui.ActionBar.x1[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                return;
            case 17:
                ((ViewGroup) obj).removeView(((fa) obj2).h);
                return;
            case 18:
                ke1 ke1Var = (ke1) obj2;
                int[] iArr = (int[]) obj;
                ke1Var.getClass();
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    ke1Var.f38786a.F0(true);
                    return;
                }
                return;
            case 19:
                pe1 pe1Var = (pe1) obj2;
                String str = (String) obj;
                pe1Var.d.clear();
                pe1Var.e.clear();
                pe1Var.f40652f = true;
                pe1Var.F(str, "", true);
                pe1Var.h = str;
                pe1Var.f();
                pe1Var.D = null;
                return;
            case 20:
                pe1 pe1Var2 = (pe1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity = pe1Var2.E;
                vp.r1(WallpapersListActivity.t0(wallpapersListActivity)).V3(tL_contacts_resolvedPeer.users, false);
                vp.r1(WallpapersListActivity.u0(wallpapersListActivity)).P3(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = pe1Var2.f40658y;
                pe1Var2.f40658y = null;
                pe1Var2.F(str2, "", false);
                return;
            case 21:
                String str3 = (String) obj;
                we1 we1Var = ((ve1) obj2).f42717a;
                Activity parentActivity = we1Var.getParentActivity();
                jj jjVar = we1Var.f42972n;
                if (parentActivity != null) {
                    if (org.telegram.messenger.v2.f18448a) {
                        org.telegram.messenger.f8.b(str3);
                    }
                    str3.getClass();
                    if (!str3.equals("share_game")) {
                        if (str3.equals("share_score")) {
                            jjVar.f16337k.with_my_score = true;
                        }
                    } else {
                        jjVar.f16337k.with_my_score = false;
                    }
                    we1Var.showDialog(op0.N0(we1Var.getParentActivity(), jjVar, null, false, we1Var.h));
                    return;
                }
                return;
            case 22:
                org.telegram.ui.web.z0 z0Var2 = (org.telegram.ui.web.z0) obj2;
                xh.n nVar = z0Var2.f43270j0;
                nVar.f53914f = true;
                nVar.k();
                z0Var2.v((org.telegram.ui.web.x0) obj);
                return;
            case 23:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (z0Var = botWebViewContainer$BotWebViewProxy.f42975a) != null && (d0Var = z0Var.f43261c) != null) {
                    d0Var.f(arrayList);
                    return;
                }
                return;
            case 24:
                ArrayList arrayList2 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                w7.m6.f52648c.addAll(0, arrayList2);
                for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
                    w7.m6.d.put(longSparseArray.keyAt(i13), (org.telegram.ui.web.a1) longSparseArray.valueAt(i13));
                }
                w7.m6.f52647b = true;
                w7.m6.f52646a = false;
                ArrayList arrayList3 = w7.m6.e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        ((q20) obj3).a(arrayList2);
                    }
                    w7.m6.e = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) ((go0) obj2).f37607c;
                ArrayList arrayList4 = b1Var.h;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                b1Var.f42996n = false;
                ii iiVar = b1Var.f29837a;
                if (iiVar != null) {
                    iiVar.f30819f3.O(true);
                    return;
                }
                return;
            case 26:
                org.telegram.ui.ActionBar.b1 b1Var2 = (org.telegram.ui.ActionBar.b1) obj2;
                if (((org.telegram.ui.web.w1) obj).b() == null) {
                    z10 = false;
                }
                b1Var2.setEnabled(z10);
                ViewPropertyAnimator animate = b1Var2.animate();
                if (b1Var2.isEnabled()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7);
                return;
            case 27:
                ((org.telegram.ui.m0) obj2).f43101f0.a((Integer) obj);
                return;
            case 28:
                org.telegram.ui.web.p1 p1Var = (org.telegram.ui.web.p1) obj2;
                vp messagesController = p1Var.getMessagesController();
                messagesController.getClass();
                TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
                togglewebbrowsersettingsexception.url = (String) obj;
                togglewebbrowsersettingsexception.delete = true;
                messagesController.getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new il(messagesController, 3));
                p1Var.f29837a.f30819f3.O(true);
                return;
            default:
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) obj2;
                TLObject tLObject = (TLObject) obj;
                int i14 = w1Var.f43227a;
                w1Var.f43231g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    vp.r1(i14).V3(tL_messages_webPage.users, false);
                    vp.r1(i14).P3(tL_messages_webPage.chats, false);
                    w1Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            w1Var.h = tL_webPage;
                        }
                    }
                    w1Var.h = null;
                }
                TLRPC.WebPage webPage = w1Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    w1Var.h = null;
                }
                if (!tz.f18192w0 && w1Var.h != null && (w5Var = w1Var.f43235l) != null) {
                    w5Var.run();
                }
                w1Var.c();
                return;
        }
    }

    public k3(k8 k8Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f34807a = 13;
        this.f34809c = k8Var;
        this.f34808b = k2Var;
    }
}
