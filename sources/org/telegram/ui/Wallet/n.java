package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
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
import org.telegram.ui.mc1;
import org.telegram.ui.rc1;
import org.telegram.ui.xc1;
import org.telegram.ui.yc1;
public final class n implements Runnable {
    public final int f42789a;
    public final Object f42790b;
    public final Object f42791c;

    public n(int i7, Object obj, Object obj2) {
        this.f42789a = i7;
        this.f42790b = obj;
        this.f42791c = obj2;
    }

    @Override
    public final void run() {
        String message;
        int i7 = this.f42789a;
        Object obj = this.f42791c;
        Object obj2 = this.f42790b;
        switch (i7) {
            case 0:
                qp.s1(((n0) obj2).f42792a).O3((TLRPC.Updates) obj, false);
                return;
            case 1:
                n0 n0Var = (n0) obj2;
                n0.H("enable backup: ready! getting secret phrase...");
                n0Var.z(new bi.p5(23, n0Var, (g8) obj), false, true);
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
                n0 n0Var2 = (n0) obj2;
                j jVar = (j) obj;
                n0.H("emulate disable backup: ready");
                if (n0Var2.v() <= 0) {
                    jVar.a(500000L, null);
                    return;
                }
                WalletEngine2 walletEngine2 = n0Var2.f42793b;
                if (walletEngine2 == null) {
                    n0.j("emulate disable backup: no engine!");
                    jVar.a(null, "NULL_ENGINE");
                    return;
                }
                walletEngine2.emulateRotateKey(new d(n0Var2, jVar));
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
                qp.s1(((f2) obj2).f42459a).O3((TLRPC.Updates) obj, false);
                return;
            case 6:
                u2 u2Var = (u2) obj2;
                z2 z2Var = (z2) obj;
                if (!u2Var.f43197e) {
                    z2Var.f28620c0 = true;
                    Runnable runnable = u2Var.f43199g;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                f2Var.presentFragment(new n9(f2Var.getCurrentAccount(), ((TL_wallet.card) obj).address));
                return;
            case 8:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(hd.M0(2131748778, null));
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
                ((y5) obj2).P0.remove((g7) obj);
                return;
            case 12:
                a3[] a3VarArr = (a3[]) obj2;
                a3VarArr[0].setOnDismissListener(new m2((TLRPC.User) obj, 1));
                a3VarArr[0].dismiss();
                return;
            case 13:
                new hc(((a3[]) obj2)[0].E, (org.telegram.ui.ActionBar.f6) obj).Q(2131623993, 36, hd.M0(2131743202, null)).k(false);
                return;
            case 14:
                org.telegram.ui.ActionBar.m2.a((org.telegram.ui.ActionBar.m2) obj2, (Canvas) obj);
                return;
            case 15:
                f6.e((f6) obj2, (Canvas) obj);
                return;
            case 16:
                f6.f((f6) obj2, (Canvas) obj);
                return;
            case 17:
                ((ViewGroup) obj).removeView(((o6) obj2).h);
                return;
            case 18:
                ((c20) obj2).a((TL_wallet.walletTransaction) obj);
                return;
            case 19:
                c8 c8Var = (c8) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!c8Var.f42252a1 && userFull != null) {
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    c8Var.d(cardVar);
                    return;
                }
                return;
            case 20:
                f8 f8Var = (f8) obj2;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj;
                if ((f2Var2 instanceof y5) && hc.a(f2Var2)) {
                    hc.a0(f2Var2).I(2131623989, hd.M0(2131743090, null), hd.M0(2131743089, null)).j();
                }
                f8Var.finishFragment();
                return;
            case 21:
                ((r0) obj).B();
                ((o8) obj2).f36227a.f37160f3.O(true);
                return;
            case 22:
                o8 o8Var = (o8) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, o8Var.getParentActivity(), o8Var.getResourceProvider());
                String M0 = hd.M0(2131743132, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                u1Var.R = M0;
                u1Var.T = hd.M0(2131743134, null);
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                alertDialog$Builder.k(hd.M0(2131743137, null), new lk0(27, o8Var, (n0) obj2));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 23:
                ((org.telegram.ui.ActionBar.u1[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                return;
            case 24:
                ((ViewGroup) obj).removeView(((ba) obj2).h);
                return;
            case 25:
                mc1 mc1Var = (mc1) obj2;
                int[] iArr = (int[]) obj;
                mc1Var.getClass();
                int i10 = iArr[0] - 1;
                iArr[0] = i10;
                if (i10 == 0) {
                    mc1Var.f47784a.G0(true);
                    return;
                }
                return;
            case 26:
                rc1 rc1Var = (rc1) obj2;
                String str = (String) obj;
                rc1Var.d.clear();
                rc1Var.f49484e.clear();
                rc1Var.f49485f = true;
                rc1Var.F(str, "", true);
                rc1Var.h = str;
                rc1Var.f();
                rc1Var.D = null;
                return;
            case 27:
                rc1 rc1Var2 = (rc1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity = rc1Var2.E;
                qp.s1(WallpapersListActivity.u0(wallpapersListActivity)).Y3(tL_contacts_resolvedPeer.users, false);
                qp.s1(WallpapersListActivity.v0(wallpapersListActivity)).S3(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = rc1Var2.f49491y;
                rc1Var2.f49491y = null;
                rc1Var2.F(str2, "", false);
                return;
            case 28:
                String str3 = (String) obj;
                yc1 yc1Var = ((xc1) obj2).f51837a;
                Activity parentActivity = yc1Var.getParentActivity();
                ij ijVar = yc1Var.f52216n;
                if (parentActivity != null) {
                    if (org.telegram.messenger.r2.f25199a) {
                        org.telegram.messenger.a8.b(str3);
                    }
                    str3.getClass();
                    if (!str3.equals("share_game")) {
                        if (str3.equals("share_score")) {
                            ijVar.f23244k.with_my_score = true;
                        }
                    } else {
                        ijVar.f23244k.with_my_score = false;
                    }
                    yc1Var.showDialog(mo0.N0(yc1Var.getParentActivity(), ijVar, null, false, yc1Var.h));
                    return;
                }
                return;
            default:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj2;
                hi.p pVar2 = x0Var.f51367j0;
                pVar2.f14849f = true;
                pVar2.k();
                x0Var.v((di.o7) obj);
                return;
        }
    }

    public n(o8 o8Var, n0 n0Var) {
        this.f42789a = 22;
        this.f42791c = o8Var;
        this.f42790b = n0Var;
    }
}
