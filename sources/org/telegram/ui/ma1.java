package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.WalletEngine2;
public final class ma1 implements Runnable {
    public final int f47630a;
    public final Object f47631b;
    public final Object f47632c;

    public ma1(int i3, Object obj, Object obj2) {
        this.f47630a = i3;
        this.f47631b = obj;
        this.f47632c = obj2;
    }

    @Override
    public final void run() {
        String message;
        int i3 = this.f47630a;
        int i10 = 0;
        Object obj = this.f47632c;
        Object obj2 = this.f47631b;
        switch (i3) {
            case 0:
                ra1.l0((ra1) obj2, (String) obj);
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                zq[] zqVarArr = ((ra1) obj2).f49173x.f52078f;
                int length = zqVarArr.length;
                while (i10 < length) {
                    zqVarArr[i10].C(0.0f);
                    i10++;
                }
                runnable.run();
                return;
            case 2:
                wa1 wa1Var = (wa1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = wa1Var.f50765f;
                ArrayList arrayList2 = wa1Var.f50764e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                org.telegram.messenger.hp.s1(wa1Var.f50761a).S3(arrayList2, false);
                wa1Var.d = false;
                wa1Var.f50763c = true;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    ((Runnable) obj3).run();
                }
                arrayList.clear();
                return;
            case 3:
                zb1 zb1Var = (zb1) obj2;
                zb1Var.V.a(new jb1(zb1Var, (VoIPService) obj, 1), true);
                return;
            case 4:
                zb1 zb1Var2 = (zb1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.u1.V = false;
                org.telegram.ui.Components.voip.u1.a();
                ViewPropertyAnimator duration = zb1Var2.L.animate().setDuration(150L);
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40452f;
                duration.setInterpolator(xqVar).start();
                zb1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                zb1Var2.J.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                zb1Var2.O.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                zb1Var2.Y.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                zb1Var2.f52629k0.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                zb1Var2.f52625i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(xqVar).start();
                zb1Var2.f52627j0.animate().alpha(1.0f).setDuration(350L).setInterpolator(xqVar).start();
                zb1Var2.N0.animate().alpha(1.0f).setDuration(350L).setInterpolator(xqVar).start();
                valueAnimator.addListener(new ob1(zb1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(xqVar);
                valueAnimator.start();
                return;
            case 5:
                org.telegram.messenger.hp.s1(((org.telegram.ui.Wallet.k0) obj2).f42718a).O3((TLRPC.Updates) obj, false);
                return;
            case 6:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj2;
                org.telegram.ui.Wallet.k0.H("enable backup: ready! getting secret phrase...");
                k0Var.z(new ai.q4(24, k0Var, (org.telegram.ui.Wallet.f8) obj), false, true);
                return;
            case 7:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Wallet.o oVar = (org.telegram.ui.Wallet.o) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    oVar.run();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) obj2;
                org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) obj;
                org.telegram.ui.Wallet.k0.H("emulate disable backup: ready");
                if (k0Var2.v() <= 0) {
                    jVar.a(500000L, null);
                    return;
                }
                WalletEngine2 walletEngine2 = k0Var2.f42719b;
                if (walletEngine2 == null) {
                    org.telegram.ui.Wallet.k0.j("emulate disable backup: no engine!");
                    jVar.a(null, "NULL_ENGINE");
                    return;
                }
                walletEngine2.emulateRotateKey(new org.telegram.ui.Wallet.d(k0Var2, jVar));
                return;
            case 9:
                ai.c cVar = (ai.c) obj2;
                Exception exc = (Exception) obj;
                if (exc.getMessage() == null) {
                    message = "NULL_ERROR";
                } else {
                    message = exc.getMessage();
                }
                cVar.a(null, message);
                return;
            case 10:
                org.telegram.messenger.hp.s1(((org.telegram.ui.Wallet.c2) obj2).f42377a).O3((TLRPC.Updates) obj, false);
                return;
            case 11:
                org.telegram.ui.Wallet.s2 s2Var = (org.telegram.ui.Wallet.s2) obj2;
                org.telegram.ui.Wallet.x2 x2Var = (org.telegram.ui.Wallet.x2) obj;
                if (!s2Var.f43147e) {
                    x2Var.f28592d0 = true;
                    Runnable runnable2 = s2Var.f43149g;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                d2Var.presentFragment(new org.telegram.ui.Wallet.m9(d2Var.getCurrentAccount(), ((TL_wallet.card) obj).address));
                return;
            case 13:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(org.telegram.messenger.bd.M0(2131748787, null));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new org.telegram.ui.Components.x70(org.telegram.messenger.g0.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    return;
                }
                return;
            case 14:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((org.telegram.messenger.n10) obj2).a(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                return;
            case 15:
                ((ei.s) obj2).a(((TL_wallet.walletTransaction[]) obj)[0]);
                return;
            case 16:
                ((org.telegram.ui.Wallet.w5) obj2).Q0.remove((org.telegram.ui.Wallet.e7) obj);
                return;
            case 17:
                org.telegram.ui.Wallet.y2[] y2VarArr = (org.telegram.ui.Wallet.y2[]) obj2;
                y2VarArr[0].setOnDismissListener(new org.telegram.ui.Wallet.k2((TLRPC.User) obj, 1));
                y2VarArr[0].dismiss();
                return;
            case 18:
                new org.telegram.ui.Components.fc(((org.telegram.ui.Wallet.y2[]) obj2)[0].F, (org.telegram.ui.ActionBar.e6) obj).Q(2131623993, 36, org.telegram.messenger.bd.M0(2131743211, null)).k(false);
                return;
            case 19:
                org.telegram.ui.ActionBar.k2.a((org.telegram.ui.ActionBar.k2) obj2, (Canvas) obj);
                return;
            case 20:
                org.telegram.ui.Wallet.d6.e((org.telegram.ui.Wallet.d6) obj2, (Canvas) obj);
                return;
            case 21:
                org.telegram.ui.Wallet.d6.f((org.telegram.ui.Wallet.d6) obj2, (Canvas) obj);
                return;
            case 22:
                ((ViewGroup) obj).removeView(((org.telegram.ui.Wallet.m6) obj2).h);
                return;
            case 23:
                ((org.telegram.messenger.u10) obj2).a((TL_wallet.walletTransaction) obj);
                return;
            case 24:
                org.telegram.ui.Wallet.b8 b8Var = (org.telegram.ui.Wallet.b8) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!b8Var.f42293b1 && userFull != null) {
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    b8Var.d(cardVar);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Wallet.e8 e8Var = (org.telegram.ui.Wallet.e8) obj2;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj;
                if ((d2Var2 instanceof org.telegram.ui.Wallet.w5) && org.telegram.ui.Components.fc.a(d2Var2)) {
                    org.telegram.ui.Components.fc.a0(d2Var2).I(2131623989, org.telegram.messenger.bd.M0(2131743099, null), org.telegram.messenger.bd.M0(2131743098, null)).j();
                }
                e8Var.finishFragment();
                return;
            case 26:
                ((org.telegram.ui.Wallet.o0) obj).B();
                ((org.telegram.ui.Wallet.n8) obj2).f34298a.f35594g3.O(true);
                return;
            case 27:
                org.telegram.ui.Wallet.n8 n8Var = (org.telegram.ui.Wallet.n8) obj2;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n8Var.getParentActivity(), n8Var.getResourceProvider());
                String M0 = org.telegram.messenger.bd.M0(2131743141, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.M0(2131743143, null);
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131743146, null), new na1(5, n8Var, (org.telegram.ui.Wallet.k0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 28:
                ((org.telegram.ui.ActionBar.s1[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                return;
            default:
                ((ViewGroup) obj).removeView(((org.telegram.ui.Wallet.aa) obj2).h);
                return;
        }
    }
}
