package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.jl;
import org.telegram.messenger.k20;
import org.telegram.messenger.kj;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.u80;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.cp0;
import org.telegram.ui.eo0;
import org.telegram.ui.ie1;
import org.telegram.ui.ne1;
import org.telegram.ui.te1;
import org.telegram.ui.ue1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
public final class m2 implements Runnable {
    public final int f34893a;
    public final Object f34894b;
    public final Object f34895c;

    public m2(int i10, Object obj, Object obj2) {
        this.f34893a = i10;
        this.f34894b = obj;
        this.f34895c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.web.z0 z0Var;
        org.telegram.ui.web.d0 d0Var;
        float f7;
        int i10 = this.f34893a;
        int i11 = 0;
        boolean z10 = false;
        Object obj = this.f34895c;
        Object obj2 = this.f34894b;
        switch (i10) {
            case 0:
                u2 u2Var = (u2) obj2;
                z2 z2Var = (z2) obj;
                if (!u2Var.e) {
                    z2Var.f21591c0 = true;
                    Runnable runnable = u2Var.f35274g;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj2;
                k2Var.presentFragment(new r9(k2Var.getCurrentAccount(), ((TL_wallet.card) obj).address));
                return;
            case 2:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(dd.L0(2131748789, null));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new u80(org.telegram.messenger.i0.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    return;
                }
                return;
            case 3:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((k20) obj2).a(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                return;
            case 4:
                ((q4) obj2).a(((TL_wallet.walletTransaction[]) obj)[0]);
                return;
            case 5:
                ((b6) obj2).P0.remove((k7) obj);
                return;
            case 6:
                a3[] a3VarArr = (a3[]) obj2;
                a3VarArr[0].setOnDismissListener(new l2((TLRPC.User) obj, 1));
                a3VarArr[0].dismiss();
                return;
            case 7:
                new cc(((a3[]) obj2)[0].E, (org.telegram.ui.ActionBar.p6) obj).Q(2131623993, 36, dd.L0(2131743227, null)).k(false);
                return;
            case 8:
                super/*android.widget.TextView*/.onDraw((Canvas) obj);
                return;
            case 9:
                j6.e((j6) obj2, (Canvas) obj);
                return;
            case 10:
                j6.f((j6) obj2, (Canvas) obj);
                return;
            case 11:
                ((ViewGroup) obj).removeView(((s6) obj2).h);
                return;
            case 12:
                ((r20) obj2).a((TL_wallet.walletTransaction) obj);
                return;
            case 13:
                h8 h8Var = (h8) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!h8Var.f34635a1 && userFull != null) {
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    h8Var.d(cardVar);
                    return;
                }
                return;
            case 14:
                k8 k8Var = (k8) obj2;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj;
                if ((k2Var2 instanceof b6) && cc.a(k2Var2)) {
                    cc.a0(k2Var2).I(2131623989, dd.L0(2131743115, null), dd.L0(2131743114, null)).j();
                }
                k8Var.finishFragment();
                return;
            case 15:
                ((p0) obj).B();
                ((t8) obj2).f30217a.f31183f3.O(true);
                return;
            case 16:
                t8 t8Var = (t8) obj2;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, t8Var.getParentActivity(), t8Var.getResourceProvider());
                String L0 = dd.L0(2131743157, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                x1Var.T = dd.L0(2131743159, null);
                alertDialog$Builder.h(dd.L0(2131752589, null), null);
                alertDialog$Builder.k(dd.L0(2131743162, null), new cp0(26, t8Var, (k0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 17:
                ((org.telegram.ui.ActionBar.x1[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                return;
            case 18:
                ((ViewGroup) obj).removeView(((fa) obj2).h);
                return;
            case 19:
                ie1 ie1Var = (ie1) obj2;
                int[] iArr = (int[]) obj;
                ie1Var.getClass();
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    ie1Var.f38017a.G0(true);
                    return;
                }
                return;
            case 20:
                ne1 ne1Var = (ne1) obj2;
                String str = (String) obj;
                ne1Var.d.clear();
                ne1Var.e.clear();
                ne1Var.f39888f = true;
                ne1Var.F(str, "", true);
                ne1Var.h = str;
                ne1Var.f();
                ne1Var.D = null;
                return;
            case 21:
                ne1 ne1Var2 = (ne1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity = ne1Var2.E;
                wp.r1(WallpapersListActivity.u0(wallpapersListActivity)).V3(tL_contacts_resolvedPeer.users, false);
                wp.r1(WallpapersListActivity.v0(wallpapersListActivity)).P3(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = ne1Var2.f39894y;
                ne1Var2.f39894y = null;
                ne1Var2.F(str2, "", false);
                return;
            case 22:
                String str3 = (String) obj;
                ue1 ue1Var = ((te1) obj2).f41631a;
                Activity parentActivity = ue1Var.getParentActivity();
                kj kjVar = ue1Var.f41929n;
                if (parentActivity != null) {
                    if (org.telegram.messenger.v2.f18578a) {
                        org.telegram.messenger.f8.b(str3);
                    }
                    str3.getClass();
                    if (!str3.equals("share_game")) {
                        if (str3.equals("share_score")) {
                            kjVar.f16690k.with_my_score = true;
                        }
                    } else {
                        kjVar.f16690k.with_my_score = false;
                    }
                    ue1Var.showDialog(pp0.N0(ue1Var.getParentActivity(), kjVar, null, false, ue1Var.h));
                    return;
                }
                return;
            case 23:
                org.telegram.ui.web.z0 z0Var2 = (org.telegram.ui.web.z0) obj2;
                xh.n nVar = z0Var2.f43072j0;
                nVar.f53935f = true;
                nVar.k();
                z0Var2.v((org.telegram.ui.web.x0) obj);
                return;
            case 24:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (z0Var = botWebViewContainer$BotWebViewProxy.f42777a) != null && (d0Var = z0Var.f43063c) != null) {
                    d0Var.f(arrayList);
                    return;
                }
                return;
            case 25:
                ArrayList arrayList2 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                w7.m6.f52666c.addAll(0, arrayList2);
                for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
                    w7.m6.d.put(longSparseArray.keyAt(i13), (org.telegram.ui.web.a1) longSparseArray.valueAt(i13));
                }
                w7.m6.f52665b = true;
                w7.m6.f52664a = false;
                ArrayList arrayList3 = w7.m6.e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        ((r20) obj3).a(arrayList2);
                    }
                    w7.m6.e = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) ((eo0) obj2).f36881c;
                ArrayList arrayList4 = b1Var.h;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                b1Var.f42798n = false;
                ii iiVar = b1Var.f30217a;
                if (iiVar != null) {
                    iiVar.f31183f3.O(true);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.ActionBar.b1 b1Var2 = (org.telegram.ui.ActionBar.b1) obj2;
                if (((org.telegram.ui.web.w1) obj).b() != null) {
                    z10 = true;
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
            case 28:
                ((org.telegram.ui.m0) obj2).f42903f0.a((Integer) obj);
                return;
            default:
                org.telegram.ui.web.p1 p1Var = (org.telegram.ui.web.p1) obj2;
                wp messagesController = p1Var.getMessagesController();
                messagesController.getClass();
                TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
                togglewebbrowsersettingsexception.url = (String) obj;
                togglewebbrowsersettingsexception.delete = true;
                messagesController.getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new jl(messagesController, 3));
                p1Var.f30217a.f31183f3.O(true);
                return;
        }
    }
}
