package org.telegram.ui.Wallet;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import c8.hb;
import java.util.ArrayList;
import org.telegram.messenger.al;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ad1;
import org.telegram.ui.nc1;
import org.telegram.ui.sc1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.yi0;
import org.telegram.ui.zc1;
public final class r implements Runnable {
    public final int f44974a;
    public final Object f44975b;
    public final Object f44976c;

    public r(int i7, Object obj, Object obj2) {
        this.f44974a = i7;
        this.f44975b = obj;
        this.f44976c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.web.v0 v0Var;
        org.telegram.ui.web.c0 c0Var;
        float f10;
        int i7 = this.f44974a;
        int i10 = 0;
        boolean z10 = false;
        Object obj = this.f44976c;
        Object obj2 = this.f44975b;
        switch (i7) {
            case 0:
                v0 v0Var2 = (v0) obj2;
                j jVar = (j) obj;
                v0.P("emulate disable backup: ready");
                if (v0Var2.A() <= 0) {
                    jVar.a(500000L, null);
                    return;
                }
                WalletEngine2 walletEngine2 = v0Var2.f45256b;
                if (walletEngine2 == null) {
                    v0.n("emulate disable backup: no engine!");
                    jVar.a(null, "NULL_ENGINE");
                    return;
                }
                walletEngine2.emulateRotateKey(new e(v0Var2, jVar));
                return;
            case 1:
                boolean[] zArr = (boolean[]) obj2;
                n nVar = (n) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    nVar.run();
                    return;
                }
                return;
            case 2:
                mp.u1(((m2) obj2).f44648a).V3((TLRPC.Updates) obj, false);
                return;
            case 3:
                z2 z2Var = (z2) obj2;
                e3 e3Var = (e3) obj;
                if (!z2Var.f45474e) {
                    e3Var.f30232d0 = true;
                    Runnable runnable = z2Var.f45476g;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((p10) obj2).a(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                return;
            case 5:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(gd.N0(2131748586, null));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new o80(org.telegram.messenger.g0.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    return;
                }
                return;
            case 6:
                ((fi.r) obj2).a(((TL_wallet.walletTransaction[]) obj)[0]);
                return;
            case 7:
                f3[] f3VarArr = (f3[]) obj2;
                f3VarArr[0].setOnDismissListener(new r2((TLRPC.User) obj, 1));
                f3VarArr[0].dismiss();
                return;
            case 8:
                org.telegram.ui.ActionBar.n2.a((org.telegram.ui.ActionBar.n2) obj2, (Canvas) obj);
                return;
            case 9:
                w6.e((w6) obj2, (Canvas) obj);
                return;
            case 10:
                w6.f((w6) obj2, (Canvas) obj);
                return;
            case 11:
                ((ViewGroup) obj).removeView(((f7) obj2).h);
                return;
            case 12:
                ((w10) obj2).a((TL_wallet.walletTransaction) obj);
                return;
            case 13:
                s8 s8Var = (s8) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!s8Var.f45060b1 && userFull != null) {
                    s8Var.D1 = SystemClock.elapsedRealtime();
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    s8Var.d(cardVar);
                    return;
                }
                return;
            case 14:
                v8 v8Var = (v8) obj2;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                if ((g2Var instanceof o6) && kc.a(g2Var)) {
                    kc.b0(g2Var).I(2131623990, gd.N0(2131742837, null), gd.N0(2131742836, null)).j();
                }
                v8Var.finishFragment();
                return;
            case 15:
                ((a1) obj).C();
                ((e9) obj2).f34213a.f35323g3.O(true);
                return;
            case 16:
                e9 e9Var = (e9) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e9Var.getParentActivity(), e9Var.getResourceProvider());
                String N0 = gd.N0(2131742880, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                t1Var.U = gd.N0(2131742882, null);
                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                alertDialog$Builder.k(gd.N0(2131742885, null), new yi0(29, e9Var, (v0) obj2));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 17:
                ((org.telegram.ui.ActionBar.t1[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                return;
            case 18:
                ((ViewGroup) obj).removeView(((sa) obj2).h);
                return;
            case 19:
                nc1 nc1Var = (nc1) obj2;
                int[] iArr = (int[]) obj;
                nc1Var.getClass();
                int i11 = iArr[0] - 1;
                iArr[0] = i11;
                if (i11 == 0) {
                    nc1Var.f50294a.G0(true);
                    return;
                }
                return;
            case 20:
                sc1 sc1Var = (sc1) obj2;
                String str = (String) obj;
                sc1Var.d.clear();
                sc1Var.f52055e.clear();
                sc1Var.f52056f = true;
                sc1Var.F(str, "", true);
                sc1Var.h = str;
                sc1Var.f();
                sc1Var.E = null;
                return;
            case 21:
                sc1 sc1Var2 = (sc1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity = sc1Var2.F;
                mp.u1(WallpapersListActivity.u0(wallpapersListActivity)).f4(tL_contacts_resolvedPeer.users, false);
                mp.u1(WallpapersListActivity.v0(wallpapersListActivity)).Z3(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = sc1Var2.f52062y;
                sc1Var2.f52062y = null;
                sc1Var2.F(str2, "", false);
                return;
            case 22:
                String str3 = (String) obj;
                ad1 ad1Var = ((zc1) obj2).f54592a;
                Activity parentActivity = ad1Var.getParentActivity();
                fj fjVar = ad1Var.f45701n;
                if (parentActivity != null) {
                    if (org.telegram.messenger.s2.f26829a) {
                        org.telegram.messenger.a8.b(str3);
                    }
                    str3.getClass();
                    if (!str3.equals("share_game")) {
                        if (str3.equals("share_score")) {
                            fjVar.f24073k.with_my_score = true;
                        }
                    } else {
                        fjVar.f24073k.with_my_score = false;
                    }
                    ad1Var.showDialog(zo0.O0(ad1Var.getParentActivity(), fjVar, null, false, ad1Var.h));
                    return;
                }
                return;
            case 23:
                org.telegram.ui.web.v0 v0Var3 = (org.telegram.ui.web.v0) obj2;
                ki.p pVar = v0Var3.f53590k0;
                pVar.f18919f = true;
                pVar.k();
                v0Var3.v((fi.f7) obj);
                return;
            case 24:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (v0Var = botWebViewContainer$BotWebViewProxy.f53318a) != null && (c0Var = v0Var.f53579c) != null) {
                    c0Var.f(arrayList);
                    return;
                }
                return;
            case 25:
                ArrayList arrayList2 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                hb.f4809c.addAll(0, arrayList2);
                for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
                    hb.d.put(longSparseArray.keyAt(i12), (org.telegram.ui.web.w0) longSparseArray.valueAt(i12));
                }
                hb.f4808b = true;
                hb.f4807a = false;
                ArrayList arrayList3 = hb.f4810e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i10 < size) {
                        Object obj3 = arrayList3.get(i10);
                        i10++;
                        ((w10) obj3).a(arrayList2);
                    }
                    hb.f4810e = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) ((hi.b3) obj2).f14223c;
                ArrayList arrayList4 = x0Var.h;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                x0Var.f53633n = false;
                bi.i6 i6Var = x0Var.f34213a;
                if (i6Var != null) {
                    i6Var.f35323g3.O(true);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) obj2;
                if (((org.telegram.ui.web.u1) obj).b() != null) {
                    z10 = true;
                }
                y0Var.setEnabled(z10);
                ViewPropertyAnimator animate = y0Var.animate();
                if (y0Var.isEnabled()) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                animate.alpha(f10);
                return;
            case 28:
                ((org.telegram.ui.l0) obj2).f53420g0.a((Integer) obj);
                return;
            default:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) obj2;
                mp messagesController = n1Var.getMessagesController();
                messagesController.getClass();
                TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
                togglewebbrowsersettingsexception.url = (String) obj;
                togglewebbrowsersettingsexception.delete = true;
                messagesController.getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new al(messagesController, 3));
                n1Var.f34213a.f35323g3.O(true);
                return;
        }
    }

    public r(e9 e9Var, v0 v0Var) {
        this.f44974a = 16;
        this.f44976c = e9Var;
        this.f44975b = v0Var;
    }
}
