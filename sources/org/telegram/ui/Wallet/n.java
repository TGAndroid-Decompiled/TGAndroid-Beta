package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.lk0;
import org.telegram.ui.nc1;
import org.telegram.ui.sc1;
import org.telegram.ui.yc1;
import org.telegram.ui.zc1;
public final class n implements Runnable {
    public final int f42846a;
    public final Object f42847b;
    public final Object f42848c;

    public n(int i7, Object obj, Object obj2) {
        this.f42846a = i7;
        this.f42847b = obj;
        this.f42848c = obj2;
    }

    @Override
    public final void run() {
        String message;
        int i7 = this.f42846a;
        Object obj = this.f42848c;
        Object obj2 = this.f42847b;
        switch (i7) {
            case 0:
                qp.s1(((m0) obj2).f42762a).O3((TLRPC.Updates) obj, false);
                return;
            case 1:
                m0 m0Var = (m0) obj2;
                m0.H("enable backup: ready! getting secret phrase...");
                m0Var.z(new bi.p5(23, m0Var, (f8) obj), false, true);
                return;
            case 2:
                boolean[] zArr = (boolean[]) obj2;
                p pVar = (p) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    pVar.run();
                    return;
                }
                return;
            case 3:
                m0 m0Var2 = (m0) obj2;
                j jVar = (j) obj;
                m0.H("emulate disable backup: ready");
                if (m0Var2.v() <= 0) {
                    jVar.a(500000L, null);
                    return;
                }
                WalletEngine2 walletEngine2 = m0Var2.f42763b;
                if (walletEngine2 == null) {
                    m0.j("emulate disable backup: no engine!");
                    jVar.a(null, "NULL_ENGINE");
                    return;
                }
                walletEngine2.emulateRotateKey(new d(m0Var2, jVar));
                return;
            case 4:
                ai.e eVar = (ai.e) obj2;
                Exception exc = (Exception) obj;
                if (exc.getMessage() == null) {
                    message = "NULL_ERROR";
                } else {
                    message = exc.getMessage();
                }
                eVar.a(null, message);
                return;
            case 5:
                qp.s1(((e2) obj2).f42427a).O3((TLRPC.Updates) obj, false);
                return;
            case 6:
                t2 t2Var = (t2) obj2;
                y2 y2Var = (y2) obj;
                if (!t2Var.f43166e) {
                    y2Var.f28623c0 = true;
                    Runnable runnable = t2Var.f43168g;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                f2Var.presentFragment(new m9(f2Var.getCurrentAccount(), ((TL_wallet.card) obj).address));
                return;
            case 8:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(id.M0(2131748780, null));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new b80(org.telegram.messenger.g0.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    return;
                }
                return;
            case 9:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((v10) obj2).a(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                return;
            case 10:
                ((di.r) obj2).a(((TL_wallet.walletTransaction[]) obj)[0]);
                return;
            case 11:
                ((x5) obj2).P0.remove((f7) obj);
                return;
            case 12:
                z2[] z2VarArr = (z2[]) obj2;
                z2VarArr[0].setOnDismissListener(new l2((TLRPC.User) obj, 1));
                z2VarArr[0].dismiss();
                return;
            case 13:
                new hc(((z2[]) obj2)[0].E, (org.telegram.ui.ActionBar.f6) obj).Q(2131623993, 36, id.M0(2131743204, null)).k(false);
                return;
            case 14:
                org.telegram.ui.ActionBar.m2.a((org.telegram.ui.ActionBar.m2) obj2, (Canvas) obj);
                return;
            case 15:
                e6.e((e6) obj2, (Canvas) obj);
                return;
            case 16:
                e6.f((e6) obj2, (Canvas) obj);
                return;
            case 17:
                ((ViewGroup) obj).removeView(((n6) obj2).h);
                return;
            case 18:
                ((c20) obj2).a((TL_wallet.walletTransaction) obj);
                return;
            case 19:
                b8 b8Var = (b8) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!b8Var.f42218a1 && userFull != null) {
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    b8Var.d(cardVar);
                    return;
                }
                return;
            case 20:
                e8 e8Var = (e8) obj2;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj;
                if ((f2Var2 instanceof x5) && hc.a(f2Var2)) {
                    hc.a0(f2Var2).I(2131623989, id.M0(2131743092, null), id.M0(2131743091, null)).j();
                }
                e8Var.finishFragment();
                return;
            case 21:
                ((q0) obj).B();
                ((n8) obj2).f36243a.f37190f3.O(true);
                return;
            case 22:
                n8 n8Var = (n8) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n8Var.getParentActivity(), n8Var.getResourceProvider());
                String M0 = id.M0(2131743134, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                u1Var.T = id.M0(2131743136, null);
                alertDialog$Builder.h(id.M0(2131752589, null), null);
                alertDialog$Builder.k(id.M0(2131743139, null), new lk0(27, n8Var, (m0) obj2));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 23:
                ((org.telegram.ui.ActionBar.u1[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                return;
            case 24:
                ((ViewGroup) obj).removeView(((aa) obj2).h);
                return;
            case 25:
                nc1 nc1Var = (nc1) obj2;
                int[] iArr = (int[]) obj;
                nc1Var.getClass();
                int i10 = iArr[0] - 1;
                iArr[0] = i10;
                if (i10 == 0) {
                    nc1Var.f48025a.G0(true);
                    return;
                }
                return;
            case 26:
                sc1 sc1Var = (sc1) obj2;
                String str = (String) obj;
                sc1Var.d.clear();
                sc1Var.f49732e.clear();
                sc1Var.f49733f = true;
                sc1Var.F(str, "", true);
                sc1Var.h = str;
                sc1Var.f();
                sc1Var.D = null;
                return;
            case 27:
                sc1 sc1Var2 = (sc1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity = sc1Var2.E;
                qp.s1(WallpapersListActivity.u0(wallpapersListActivity)).Y3(tL_contacts_resolvedPeer.users, false);
                qp.s1(WallpapersListActivity.v0(wallpapersListActivity)).S3(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = sc1Var2.f49739y;
                sc1Var2.f49739y = null;
                sc1Var2.F(str2, "", false);
                return;
            case 28:
                String str3 = (String) obj;
                zc1 zc1Var = ((yc1) obj2).f52198a;
                Activity parentActivity = zc1Var.getParentActivity();
                ij ijVar = zc1Var.f52528n;
                if (parentActivity != null) {
                    if (org.telegram.messenger.r2.f25212a) {
                        org.telegram.messenger.a8.b(str3);
                    }
                    str3.getClass();
                    if (!str3.equals("share_game")) {
                        if (str3.equals("share_score")) {
                            ijVar.f23262k.with_my_score = true;
                        }
                    } else {
                        ijVar.f23262k.with_my_score = false;
                    }
                    zc1Var.showDialog(mo0.N0(zc1Var.getParentActivity(), ijVar, null, false, zc1Var.h));
                    return;
                }
                return;
            default:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj2;
                hi.p pVar2 = x0Var.f51374j0;
                pVar2.f14852f = true;
                pVar2.k();
                x0Var.v((di.o7) obj);
                return;
        }
    }

    public n(n8 n8Var, m0 m0Var) {
        this.f42846a = 22;
        this.f42848c = n8Var;
        this.f42847b = m0Var;
    }
}
