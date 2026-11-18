package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.al;
import org.telegram.messenger.bf;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.aj0;
import org.telegram.ui.bd1;
import org.telegram.ui.cd1;
import org.telegram.ui.pc1;
import org.telegram.ui.uc1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
public final class c5 implements Runnable {
    public final int f43994a;
    public final Object f43995b;
    public final Object f43996c;

    public c5(int i7, Object obj, Object obj2) {
        this.f43994a = i7;
        this.f43995b = obj;
        this.f43996c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.web.v0 v0Var;
        org.telegram.ui.web.c0 c0Var;
        ai.j jVar;
        e2.o0 o0Var;
        e2.e eVar;
        g2.c cVar;
        int i7;
        boolean z10;
        e2.s1 s1Var;
        p4.o1 o1Var;
        int i10 = this.f43994a;
        float f10 = 1.0f;
        int i11 = 0;
        boolean z11 = false;
        Object obj = this.f43996c;
        Object obj2 = this.f43995b;
        switch (i10) {
            case 0:
                ((fi.r) obj2).a(((TL_wallet.walletTransaction[]) obj)[0]);
                return;
            case 1:
                e3[] e3VarArr = (e3[]) obj2;
                e3VarArr[0].setOnDismissListener(new q2((TLRPC.User) obj, 1));
                e3VarArr[0].dismiss();
                return;
            case 2:
                super/*android.widget.TextView*/.onDraw((Canvas) obj);
                return;
            case 3:
                v6.e((v6) obj2, (Canvas) obj);
                return;
            case 4:
                v6.f((v6) obj2, (Canvas) obj);
                return;
            case 5:
                ((ViewGroup) obj).removeView(((e7) obj2).h);
                return;
            case 6:
                ((x10) obj2).a((TL_wallet.walletTransaction) obj);
                return;
            case 7:
                r8 r8Var = (r8) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!r8Var.f44888b1 && userFull != null) {
                    r8Var.D1 = SystemClock.elapsedRealtime();
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    r8Var.d(cardVar);
                    return;
                }
                return;
            case 8:
                u8 u8Var = (u8) obj2;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj;
                if ((h2Var instanceof n6) && lc.a(h2Var)) {
                    lc.b0(h2Var).I(2131623990, gd.M0(2131742850, null), gd.M0(2131742849, null)).j();
                }
                u8Var.finishFragment();
                return;
            case 9:
                ((z0) obj).C();
                ((d9) obj2).f33530a.f34607g3.O(true);
                return;
            case 10:
                d9 d9Var = (d9) obj2;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d9Var.getParentActivity(), d9Var.getResourceProvider());
                String M0 = gd.M0(2131742893, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.S = M0;
                u1Var.U = gd.M0(2131742895, null);
                alertDialog$Builder.h(gd.M0(2131752578, null), null);
                alertDialog$Builder.k(gd.M0(2131742898, null), new aj0(29, d9Var, (u0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 11:
                ((org.telegram.ui.ActionBar.u1[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                return;
            case 12:
                ((ViewGroup) obj).removeView(((ra) obj2).h);
                return;
            case 13:
                pc1 pc1Var = (pc1) obj2;
                int[] iArr = (int[]) obj;
                pc1Var.getClass();
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    pc1Var.f50890a.G0(true);
                    return;
                }
                return;
            case 14:
                uc1 uc1Var = (uc1) obj2;
                String str = (String) obj;
                uc1Var.d.clear();
                uc1Var.f52523e.clear();
                uc1Var.f52524f = true;
                uc1Var.F(str, "", true);
                uc1Var.h = str;
                uc1Var.f();
                uc1Var.E = null;
                return;
            case 15:
                uc1 uc1Var2 = (uc1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity = uc1Var2.F;
                mp.u1(WallpapersListActivity.u0(wallpapersListActivity)).f4(tL_contacts_resolvedPeer.users, false);
                mp.u1(WallpapersListActivity.v0(wallpapersListActivity)).Z3(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = uc1Var2.f52530y;
                uc1Var2.f52530y = null;
                uc1Var2.F(str2, "", false);
                return;
            case 16:
                String str3 = (String) obj;
                cd1 cd1Var = ((bd1) obj2).f45849a;
                Activity parentActivity = cd1Var.getParentActivity();
                fj fjVar = cd1Var.f46495n;
                if (parentActivity != null) {
                    if (org.telegram.messenger.s2.f26723a) {
                        org.telegram.messenger.a8.b(str3);
                    }
                    str3.getClass();
                    if (!str3.equals("share_game")) {
                        if (str3.equals("share_score")) {
                            fjVar.f23968k.with_my_score = true;
                        }
                    } else {
                        fjVar.f23968k.with_my_score = false;
                    }
                    cd1Var.showDialog(yo0.O0(cd1Var.getParentActivity(), fjVar, null, false, cd1Var.h));
                    return;
                }
                return;
            case 17:
                org.telegram.ui.web.v0 v0Var2 = (org.telegram.ui.web.v0) obj2;
                ki.q qVar = v0Var2.f53358k0;
                qVar.f18840f = true;
                qVar.k();
                v0Var2.v((fi.f7) obj);
                return;
            case 18:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (v0Var = botWebViewContainer$BotWebViewProxy.f53092a) != null && (c0Var = v0Var.f53347c) != null) {
                    c0Var.f(arrayList);
                    return;
                }
                return;
            case 19:
                ArrayList arrayList2 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                c8.cb.f4519c.addAll(0, arrayList2);
                for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
                    c8.cb.d.put(longSparseArray.keyAt(i13), (org.telegram.ui.web.w0) longSparseArray.valueAt(i13));
                }
                c8.cb.f4518b = true;
                c8.cb.f4517a = false;
                ArrayList arrayList3 = c8.cb.f4520e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        ((x10) obj3).a(arrayList2);
                    }
                    c8.cb.f4520e = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) ((hi.t2) obj2).f15409c;
                ArrayList arrayList4 = x0Var.h;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                x0Var.f53399n = false;
                bi.d6 d6Var = x0Var.f33530a;
                if (d6Var != null) {
                    d6Var.f34607g3.O(true);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) obj2;
                if (((org.telegram.ui.web.t1) obj).b() != null) {
                    z11 = true;
                }
                z0Var.setEnabled(z11);
                ViewPropertyAnimator animate = z0Var.animate();
                if (!z0Var.isEnabled()) {
                    f10 = 0.5f;
                }
                animate.alpha(f10);
                return;
            case 22:
                ((org.telegram.ui.l0) obj2).f53187g0.a((Integer) obj);
                return;
            case 23:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) obj2;
                mp messagesController = n1Var.getMessagesController();
                messagesController.getClass();
                TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
                togglewebbrowsersettingsexception.url = (String) obj;
                togglewebbrowsersettingsexception.delete = true;
                messagesController.getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new al(messagesController, 3));
                n1Var.f33530a.f34607g3.O(true);
                return;
            case 24:
                org.telegram.ui.web.t1 t1Var = (org.telegram.ui.web.t1) obj2;
                TLObject tLObject = (TLObject) obj;
                int i14 = t1Var.f53319a;
                t1Var.f53324g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    mp.u1(i14).f4(tL_messages_webPage.users, false);
                    mp.u1(i14).Z3(tL_messages_webPage.chats, false);
                    t1Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            t1Var.h = tL_webPage;
                        }
                    }
                    t1Var.h = null;
                }
                TLRPC.WebPage webPage = t1Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    t1Var.h = null;
                }
                if (!bz.f23209w0 && t1Var.h != null && (jVar = t1Var.f53328l) != null) {
                    jVar.run();
                }
                t1Var.c();
                return;
            case 25:
                ((org.telegram.ui.web.t1) obj2).f53329m.remove((c5) obj);
                return;
            case 26:
                ((p4.d0) obj2).getClass();
                ((Runnable) obj).run();
                return;
            case 27:
                p4.d0 d0Var = (p4.d0) obj2;
                p4.i1 i1Var = (p4.i1) obj;
                p4.m0 m0Var = d0Var.h;
                d0Var.f55195t = i1Var;
                bf bfVar = new bf(d0Var, i1Var);
                i1Var.I0(bfVar);
                d0Var.f55196u = bfVar;
                try {
                    m0Var.f55328j.p(0, i1Var);
                } catch (RemoteException e10) {
                    h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                }
                ((q4.l) m0Var.f55332n.f55826b).f55808a.setActive(true);
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
                    eVar = e2.e.f10369i;
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
                    s1Var = e2.s1.f10699b;
                }
                d0Var.f55194s = new p4.g1(W, 0, R0, Q0, Q02, 0, j3, m10, D0, C, T0, 0, o0Var2, f11, 1.0f, eVar2, 0, cVar2, K, i7, z10, u10, 1, w02, i15, h, g10, U0, O0, Z, z12, s1Var, i1Var.E0());
                d0Var.f(i1Var.t());
                return;
            case 28:
                ((c0.i) obj).a(Boolean.valueOf(((p4.d0) obj2).o()));
                return;
            default:
                ResultReceiver resultReceiver = (ResultReceiver) obj;
                try {
                    o1Var = (p4.o1) ((m9.w) obj2).f20962a;
                    a8.la.k(o1Var, "SessionResult must not be null");
                } catch (InterruptedException e11) {
                    e = e11;
                    h2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    o1Var = new p4.o1(-1);
                } catch (CancellationException e12) {
                    h2.a.m("MediaSessionLegacyStub", "Custom command cancelled", e12);
                    o1Var = new p4.o1(1);
                } catch (ExecutionException e13) {
                    e = e13;
                    h2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    o1Var = new p4.o1(-1);
                }
                resultReceiver.send(o1Var.f55383a, o1Var.f55384b);
                return;
        }
    }

    public c5(p4.d0 d0Var, p4.v vVar, Runnable runnable) {
        this.f43994a = 26;
        this.f43995b = d0Var;
        this.f43996c = runnable;
    }
}
