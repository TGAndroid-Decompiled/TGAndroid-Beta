package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import c8.za;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.po0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.mc1;
import org.telegram.ui.rc1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.yc1;
import org.telegram.ui.zc1;
public final class r implements Runnable {
    public final int f44415a;
    public final Object f44416b;
    public final Object f44417c;

    public r(int i7, Object obj, Object obj2) {
        this.f44415a = i7;
        this.f44416b = obj;
        this.f44417c = obj2;
    }

    @Override
    public final void run() {
        String message;
        org.telegram.ui.web.v0 v0Var;
        org.telegram.ui.web.c0 c0Var;
        float f10;
        int i7 = this.f44415a;
        boolean z10 = true;
        int i10 = 0;
        Object obj = this.f44417c;
        Object obj2 = this.f44416b;
        switch (i7) {
            case 0:
                l0 l0Var = (l0) obj2;
                j jVar = (j) obj;
                l0.H("emulate disable backup: ready");
                if (l0Var.v() <= 0) {
                    jVar.a(500000L, null);
                    return;
                }
                WalletEngine2 walletEngine2 = l0Var.f44079b;
                if (walletEngine2 == null) {
                    l0.j("emulate disable backup: no engine!");
                    jVar.a(null, "NULL_ENGINE");
                    return;
                }
                walletEngine2.emulateRotateKey(new d(l0Var, jVar));
                return;
            case 1:
                bi.b bVar = (bi.b) obj2;
                Exception exc = (Exception) obj;
                if (exc.getMessage() == null) {
                    message = "NULL_ERROR";
                } else {
                    message = exc.getMessage();
                }
                bVar.a(null, message);
                return;
            case 2:
                np.s1(((d2) obj2).f43729a).O3((TLRPC.Updates) obj, false);
                return;
            case 3:
                r2 r2Var = (r2) obj2;
                w2 w2Var = (w2) obj;
                if (!r2Var.f44432e) {
                    w2Var.f29688d0 = true;
                    Runnable runnable = r2Var.f44434g;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(hd.M0(2131748779, null));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new e80(org.telegram.messenger.g0.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    return;
                }
                return;
            case 5:
                ((fi.r) obj2).a(((TL_wallet.walletTransaction[]) obj)[0]);
                return;
            case 6:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((s10) obj2).a(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                return;
            case 7:
                ((y5) obj2).Q0.remove((g7) obj);
                return;
            case 8:
                x2[] x2VarArr = (x2[]) obj2;
                x2VarArr[0].setOnDismissListener(new j2((TLRPC.User) obj, 1));
                x2VarArr[0].dismiss();
                return;
            case 9:
                new cc(((x2[]) obj2)[0].F, (org.telegram.ui.ActionBar.e6) obj).Q(2131623994, 36, hd.M0(2131743201, null)).k(false);
                return;
            case 10:
                super/*android.widget.TextView*/.onDraw((Canvas) obj);
                return;
            case 11:
                f6.e((f6) obj2, (Canvas) obj);
                return;
            case 12:
                f6.f((f6) obj2, (Canvas) obj);
                return;
            case 13:
                ((ViewGroup) obj).removeView(((o6) obj2).h);
                return;
            case 14:
                ((z10) obj2).a((TL_wallet.walletTransaction) obj);
                return;
            case 15:
                c8 c8Var = (c8) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!c8Var.f43650b1 && userFull != null) {
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    c8Var.d(cardVar);
                    return;
                }
                return;
            case 16:
                f8 f8Var = (f8) obj2;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                if ((e2Var instanceof y5) && cc.a(e2Var)) {
                    cc.a0(e2Var).I(2131623990, hd.M0(2131743089, null), hd.M0(2131743088, null)).j();
                }
                f8Var.finishFragment();
                return;
            case 17:
                ((p0) obj).B();
                ((p8) obj2).f38880a.f39892g3.O(true);
                return;
            case 18:
                p8 p8Var = (p8) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, p8Var.getParentActivity(), p8Var.getResourceProvider());
                String M0 = hd.M0(2131743131, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = hd.M0(2131743133, null);
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                alertDialog$Builder.k(hd.M0(2131743136, null), new k8(1, p8Var, (l0) obj2));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 19:
                ((org.telegram.ui.ActionBar.t1[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                return;
            case 20:
                ((ViewGroup) obj).removeView(((da) obj2).h);
                return;
            case 21:
                mc1 mc1Var = (mc1) obj2;
                int[] iArr = (int[]) obj;
                mc1Var.getClass();
                int i11 = iArr[0] - 1;
                iArr[0] = i11;
                if (i11 == 0) {
                    mc1Var.f49211a.G0(true);
                    return;
                }
                return;
            case 22:
                rc1 rc1Var = (rc1) obj2;
                String str = (String) obj;
                rc1Var.d.clear();
                rc1Var.f50919e.clear();
                rc1Var.f50920f = true;
                rc1Var.F(str, "", true);
                rc1Var.h = str;
                rc1Var.f();
                rc1Var.E = null;
                return;
            case 23:
                rc1 rc1Var2 = (rc1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity = rc1Var2.F;
                np.s1(WallpapersListActivity.u0(wallpapersListActivity)).Y3(tL_contacts_resolvedPeer.users, false);
                np.s1(WallpapersListActivity.v0(wallpapersListActivity)).S3(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = rc1Var2.f50926y;
                rc1Var2.f50926y = null;
                rc1Var2.F(str2, "", false);
                return;
            case 24:
                String str3 = (String) obj;
                zc1 zc1Var = ((yc1) obj2).f53494a;
                Activity parentActivity = zc1Var.getParentActivity();
                gj gjVar = zc1Var.f53906n;
                if (parentActivity != null) {
                    if (org.telegram.messenger.r2.f26206a) {
                        org.telegram.messenger.a8.b(str3);
                    }
                    str3.getClass();
                    if (!str3.equals("share_game")) {
                        if (str3.equals("share_score")) {
                            gjVar.f23819k.with_my_score = true;
                        }
                    } else {
                        gjVar.f23819k.with_my_score = false;
                    }
                    zc1Var.showDialog(po0.N0(zc1Var.getParentActivity(), gjVar, null, false, zc1Var.h));
                    return;
                }
                return;
            case 25:
                org.telegram.ui.web.v0 v0Var2 = (org.telegram.ui.web.v0) obj2;
                ki.r rVar = v0Var2.f52829k0;
                rVar.f18518f = true;
                rVar.k();
                v0Var2.v((fi.i7) obj);
                return;
            case 26:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (v0Var = botWebViewContainer$BotWebViewProxy.f52561a) != null && (c0Var = v0Var.f52818c) != null) {
                    c0Var.f(arrayList);
                    return;
                }
                return;
            case 27:
                ArrayList arrayList2 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                za.f4819c.addAll(0, arrayList2);
                for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
                    za.d.put(longSparseArray.keyAt(i12), (org.telegram.ui.web.w0) longSparseArray.valueAt(i12));
                }
                za.f4818b = true;
                za.f4817a = false;
                ArrayList arrayList3 = za.f4820e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i10 < size) {
                        Object obj3 = arrayList3.get(i10);
                        i10++;
                        ((z10) obj3).a(arrayList2);
                    }
                    za.f4820e = null;
                    return;
                }
                return;
            case 28:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) ((hi.s2) obj2).f15018c;
                ArrayList arrayList4 = x0Var.h;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                x0Var.f52870n = false;
                bi.v3 v3Var = x0Var.f38880a;
                if (v3Var != null) {
                    v3Var.f39892g3.O(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) obj2;
                if (((org.telegram.ui.web.t1) obj).b() == null) {
                    z10 = false;
                }
                z0Var.setEnabled(z10);
                ViewPropertyAnimator animate = z0Var.animate();
                if (z0Var.isEnabled()) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                animate.alpha(f10);
                return;
        }
    }

    public r(p8 p8Var, l0 l0Var) {
        this.f44415a = 18;
        this.f44417c = p8Var;
        this.f44416b = l0Var;
    }
}
