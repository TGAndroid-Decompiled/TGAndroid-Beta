package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.bl;
import org.telegram.messenger.cf;
import org.telegram.messenger.cz;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.r80;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.aj0;
import org.telegram.ui.bd1;
import org.telegram.ui.cd1;
import org.telegram.ui.pc1;
import org.telegram.ui.uc1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
public final class u4 implements Runnable {
    public final int f45166a;
    public final Object f45167b;
    public final Object f45168c;

    public u4(int i7, Object obj, Object obj2) {
        this.f45166a = i7;
        this.f45167b = obj;
        this.f45168c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.web.v0 v0Var;
        org.telegram.ui.web.c0 c0Var;
        ai.s sVar;
        e2.o0 o0Var;
        e2.e eVar;
        g2.c cVar;
        int i7;
        boolean z10;
        e2.s1 s1Var;
        int i10 = this.f45166a;
        float f10 = 1.0f;
        boolean z11 = true;
        int i11 = 0;
        Object obj = this.f45168c;
        Object obj2 = this.f45167b;
        switch (i10) {
            case 0:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((r10) obj2).a(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                return;
            case 1:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(hd.N0(2131748586, null));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new r80(org.telegram.messenger.g0.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    return;
                }
                return;
            case 2:
                ((fi.r) obj2).a(((TL_wallet.walletTransaction[]) obj)[0]);
                return;
            case 3:
                e3[] e3VarArr = (e3[]) obj2;
                e3VarArr[0].setOnDismissListener(new q2((TLRPC.User) obj, 1));
                e3VarArr[0].dismiss();
                return;
            case 4:
                super/*android.widget.TextView*/.onDraw((Canvas) obj);
                return;
            case 5:
                v6.e((v6) obj2, (Canvas) obj);
                return;
            case 6:
                v6.f((v6) obj2, (Canvas) obj);
                return;
            case 7:
                ((ViewGroup) obj).removeView(((e7) obj2).h);
                return;
            case 8:
                ((y10) obj2).a((TL_wallet.walletTransaction) obj);
                return;
            case 9:
                r8 r8Var = (r8) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!r8Var.f44932b1 && userFull != null) {
                    r8Var.D1 = SystemClock.elapsedRealtime();
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    r8Var.d(cardVar);
                    return;
                }
                return;
            case 10:
                u8 u8Var = (u8) obj2;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                if ((g2Var instanceof n6) && lc.a(g2Var)) {
                    lc.b0(g2Var).I(2131623990, hd.N0(2131742842, null), hd.N0(2131742841, null)).j();
                }
                u8Var.finishFragment();
                return;
            case 11:
                ((z0) obj).C();
                ((d9) obj2).f34681a.f35790g3.O(true);
                return;
            case 12:
                d9 d9Var = (d9) obj2;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d9Var.getParentActivity(), d9Var.getResourceProvider());
                String N0 = hd.N0(2131742885, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                t1Var.S = N0;
                t1Var.U = hd.N0(2131742887, null);
                alertDialog$Builder.h(hd.N0(2131752577, null), null);
                alertDialog$Builder.k(hd.N0(2131742890, null), new aj0(29, d9Var, (u0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 13:
                ((org.telegram.ui.ActionBar.t1[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                return;
            case 14:
                ((ViewGroup) obj).removeView(((ra) obj2).h);
                return;
            case 15:
                pc1 pc1Var = (pc1) obj2;
                int[] iArr = (int[]) obj;
                pc1Var.getClass();
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    pc1Var.f50859a.G0(true);
                    return;
                }
                return;
            case 16:
                uc1 uc1Var = (uc1) obj2;
                String str = (String) obj;
                uc1Var.d.clear();
                uc1Var.f52539e.clear();
                uc1Var.f52540f = true;
                uc1Var.F(str, "", true);
                uc1Var.h = str;
                uc1Var.f();
                uc1Var.E = null;
                return;
            case 17:
                uc1 uc1Var2 = (uc1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity = uc1Var2.F;
                np.u1(WallpapersListActivity.u0(wallpapersListActivity)).f4(tL_contacts_resolvedPeer.users, false);
                np.u1(WallpapersListActivity.v0(wallpapersListActivity)).Z3(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = uc1Var2.f52546y;
                uc1Var2.f52546y = null;
                uc1Var2.F(str2, "", false);
                return;
            case 18:
                String str3 = (String) obj;
                cd1 cd1Var = ((bd1) obj2).f45873a;
                Activity parentActivity = cd1Var.getParentActivity();
                gj gjVar = cd1Var.f46525n;
                if (parentActivity != null) {
                    if (org.telegram.messenger.s2.f26730a) {
                        org.telegram.messenger.a8.b(str3);
                    }
                    str3.getClass();
                    if (!str3.equals("share_game")) {
                        if (str3.equals("share_score")) {
                            gjVar.f24213k.with_my_score = true;
                        }
                    } else {
                        gjVar.f24213k.with_my_score = false;
                    }
                    cd1Var.showDialog(ap0.O0(cd1Var.getParentActivity(), gjVar, null, false, cd1Var.h));
                    return;
                }
                return;
            case 19:
                org.telegram.ui.web.v0 v0Var2 = (org.telegram.ui.web.v0) obj2;
                ki.p pVar = v0Var2.f53356k0;
                pVar.f18850f = true;
                pVar.k();
                v0Var2.v((fi.f7) obj);
                return;
            case 20:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (v0Var = botWebViewContainer$BotWebViewProxy.f53090a) != null && (c0Var = v0Var.f53345c) != null) {
                    c0Var.f(arrayList);
                    return;
                }
                return;
            case 21:
                ArrayList arrayList2 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                c8.cb.f4548c.addAll(0, arrayList2);
                for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
                    c8.cb.d.put(longSparseArray.keyAt(i13), (org.telegram.ui.web.w0) longSparseArray.valueAt(i13));
                }
                c8.cb.f4547b = true;
                c8.cb.f4546a = false;
                ArrayList arrayList3 = c8.cb.f4549e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        ((y10) obj3).a(arrayList2);
                    }
                    c8.cb.f4549e = null;
                    return;
                }
                return;
            case 22:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) ((hi.s2) obj2).f15369c;
                ArrayList arrayList4 = x0Var.h;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                x0Var.f53397n = false;
                bi.f6 f6Var = x0Var.f34681a;
                if (f6Var != null) {
                    f6Var.f35790g3.O(true);
                    return;
                }
                return;
            case 23:
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) obj2;
                if (((org.telegram.ui.web.t1) obj).b() == null) {
                    z11 = false;
                }
                y0Var.setEnabled(z11);
                ViewPropertyAnimator animate = y0Var.animate();
                if (!y0Var.isEnabled()) {
                    f10 = 0.5f;
                }
                animate.alpha(f10);
                return;
            case 24:
                ((org.telegram.ui.l0) obj2).f53185g0.a((Integer) obj);
                return;
            case 25:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) obj2;
                np messagesController = n1Var.getMessagesController();
                messagesController.getClass();
                TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
                togglewebbrowsersettingsexception.url = (String) obj;
                togglewebbrowsersettingsexception.delete = true;
                messagesController.getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new bl(messagesController, 3));
                n1Var.f34681a.f35790g3.O(true);
                return;
            case 26:
                org.telegram.ui.web.t1 t1Var2 = (org.telegram.ui.web.t1) obj2;
                TLObject tLObject = (TLObject) obj;
                int i14 = t1Var2.f53317a;
                t1Var2.f53322g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    np.u1(i14).f4(tL_messages_webPage.users, false);
                    np.u1(i14).Z3(tL_messages_webPage.chats, false);
                    t1Var2.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            t1Var2.h = tL_webPage;
                        }
                    }
                    t1Var2.h = null;
                }
                TLRPC.WebPage webPage = t1Var2.h;
                if (webPage != null && webPage.cached_page == null) {
                    t1Var2.h = null;
                }
                if (!cz.f23451w0 && t1Var2.h != null && (sVar = t1Var2.f53326l) != null) {
                    sVar.run();
                }
                t1Var2.c();
                return;
            case 27:
                ((org.telegram.ui.web.t1) obj2).f53327m.remove((u4) obj);
                return;
            case 28:
                ((p4.e0) obj2).getClass();
                ((Runnable) obj).run();
                return;
            default:
                p4.e0 e0Var = (p4.e0) obj2;
                p4.i1 i1Var = (p4.i1) obj;
                p4.n0 n0Var = e0Var.h;
                e0Var.f55249t = i1Var;
                cf cfVar = new cf(e0Var, i1Var);
                i1Var.I0(cfVar);
                e0Var.f55250u = cfVar;
                try {
                    n0Var.f55382j.p(0, i1Var);
                } catch (RemoteException e10) {
                    h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                }
                ((q4.l) n0Var.f55386n.f55871b).f55853a.setActive(true);
                e2.v0 W = i1Var.W();
                p4.n1 R0 = i1Var.R0();
                e2.b1 Q0 = i1Var.Q0();
                e2.b1 Q02 = i1Var.Q0();
                e2.w0 j3 = i1Var.j();
                int m10 = i1Var.m();
                boolean D0 = i1Var.D0();
                e2.x1 C = i1Var.C();
                e2.l1 T0 = i1Var.T0();
                if (i1Var.p0(18)) {
                    o0Var = i1Var.k0();
                } else {
                    o0Var = e2.o0.L;
                }
                e2.o0 o0Var2 = o0Var;
                if (i1Var.p0(22)) {
                    f10 = i1Var.F();
                }
                float f11 = f10;
                if (i1Var.p0(21)) {
                    eVar = i1Var.H();
                } else {
                    eVar = e2.e.f10398i;
                }
                e2.e eVar2 = eVar;
                if (i1Var.p0(28)) {
                    cVar = i1Var.l0();
                } else {
                    cVar = g2.c.d;
                }
                g2.c cVar2 = cVar;
                e2.o K = i1Var.K();
                if (i1Var.p0(23)) {
                    i7 = i1Var.n();
                } else {
                    i7 = 0;
                }
                if (i1Var.p0(23) && i1Var.z0()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean u10 = i1Var.u();
                int w02 = i1Var.w0();
                int i15 = i1Var.i();
                boolean h = i1Var.h();
                boolean g10 = i1Var.g();
                e2.o0 U0 = i1Var.U0();
                long O0 = i1Var.O0();
                long Z = i1Var.Z();
                long z12 = i1Var.z();
                if (i1Var.p0(30)) {
                    s1Var = i1Var.j0();
                } else {
                    s1Var = e2.s1.f10728b;
                }
                e0Var.f55248s = new p4.g1(W, 0, R0, Q0, Q02, 0, j3, m10, D0, C, T0, 0, o0Var2, f11, 1.0f, eVar2, 0, cVar2, K, i7, z10, u10, 1, w02, i15, h, g10, U0, O0, Z, z12, s1Var, i1Var.E0());
                e0Var.f(i1Var.t());
                return;
        }
    }

    public u4(p4.e0 e0Var, p4.v vVar, Runnable runnable) {
        this.f45166a = 28;
        this.f45167b = e0Var;
        this.f45168c = runnable;
    }
}
