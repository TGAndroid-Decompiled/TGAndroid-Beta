package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
public final class b31 implements Runnable {
    public final int f45719a;
    public final Object f45720b;
    public final Object f45721c;

    public b31(int i7, Object obj, Object obj2) {
        this.f45719a = i7;
        this.f45720b = obj;
        this.f45721c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.mj0 mj0Var;
        int i7 = this.f45719a;
        int i10 = 0;
        Object obj = this.f45721c;
        Object obj2 = this.f45720b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g((String) obj);
                org.telegram.ui.Components.lc.b0((o31) obj2).k(false).j();
                return;
            case 1:
                o31.b0((o31) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 2:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj2;
                new u31(g2Var.getContext(), g2Var.getCurrentAccount(), g2Var.getResourceProvider(), (li.d) obj).show();
                return;
            case 3:
                ((StickersActivity) obj2).s0((org.telegram.ui.Cells.h8) obj);
                return;
            case 4:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().Q4(true);
                if (view instanceof org.telegram.ui.Cells.s8) {
                    ((org.telegram.ui.Cells.s8) view).setChecked(themeActivity.getMessagesController().e5());
                    return;
                }
                return;
            case 5:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.m6.f29694w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.m6.f29694w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.m6.f29713x), Double.valueOf(org.telegram.ui.ActionBar.m6.f29732y));
                }
                org.telegram.ui.ActionBar.m6.w1();
                org.telegram.ui.Components.ek0 ek0Var = themeActivity2.f43842b;
                if (ek0Var != null && (mj0Var = (org.telegram.ui.Components.mj0) ek0Var.K(themeActivity2.Z)) != null) {
                    View view2 = mj0Var.f59111a;
                    if (view2 instanceof org.telegram.ui.Cells.x9) {
                        ((org.telegram.ui.Cells.x9) view2).c(org.telegram.messenger.hd.N0(2131753778, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.m6.f29694w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                x71 x71Var = (x71) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (x71Var.f53677n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    x71Var.C0.c(x71Var.M0[0]);
                    return;
                }
                return;
            case 7:
                a81.c0((a81) obj2, (String) obj);
                return;
            case 8:
                a81.a0((a81) obj2, (TLRPC.TL_theme) obj);
                return;
            case 9:
                i81 i81Var = (i81) obj2;
                i81Var.getClass();
                org.telegram.messenger.g0.g((String) obj);
                i81Var.c(true);
                return;
            case 10:
                i81 i81Var2 = (i81) obj2;
                i81Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.gj.h0(((TLRPC.TodoItem) obj).title, false));
                i81Var2.c(true);
                return;
            case 11:
                f91 f91Var = (f91) obj2;
                f91Var.getClass();
                Bundle bundle = new Bundle();
                y91 y91Var = f91Var.f47612b;
                bundle.putLong("dialog_id", -y91Var.f54075a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f28450id);
                y91Var.presentFragment(new jx0(bundle, null));
                return;
            case 12:
                u91 u91Var = (u91) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = u91Var.f52479f0;
                y91 y91Var2 = u91Var.f52495w0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = y91Var2.f54078b;
                    if (i11 < arrayList3.size()) {
                        if (((q91) arrayList3.get(i11)).f51084c != null && ((q91) arrayList3.get(i11)).f51084c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((q91) arrayList3.get(i11)).f51084c);
                            ((q91) arrayList3.get(i11)).f51084c.searchQuery = lowerCase;
                        }
                        i11++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        u91Var.J();
                        if (!arrayList.isEmpty()) {
                            u91Var.f52487o0 = false;
                            u91Var.f52490r0.b(0);
                        }
                        u91Var.H(str2);
                        return;
                    }
                }
                break;
            case 13:
                ba1 ba1Var = ((aa1) obj2).f45526b;
                ba1Var.f45778a.f47190e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f28450id));
                ba1Var.f45778a.a0();
                return;
            case 14:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 15:
                TwoStepVerificationActivity.i0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 16:
                TwoStepVerificationActivity.b0((TLRPC.TL_error) obj, (TwoStepVerificationActivity) obj2);
                return;
            case 17:
                bb1.l0((bb1) obj2, (String) obj);
                return;
            case 18:
                Runnable runnable = (Runnable) obj;
                er[] erVarArr = ((bb1) obj2).f45803x.f46275f;
                int length = erVarArr.length;
                while (i10 < length) {
                    erVarArr[i10].D(0.0f);
                    i10++;
                }
                runnable.run();
                return;
            case 19:
                gb1 gb1Var = (gb1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = gb1Var.f47979f;
                ArrayList arrayList5 = gb1Var.f47978e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                org.telegram.messenger.np.u1(gb1Var.f47975a).Z3(arrayList5, false);
                gb1Var.d = false;
                gb1Var.f47977c = true;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj3 = arrayList4.get(i10);
                    i10++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 20:
                hc1 hc1Var = (hc1) obj2;
                hc1Var.V.a(new rb1(hc1Var, (VoIPService) obj, 1), true);
                return;
            case 21:
                hc1 hc1Var2 = (hc1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.h2.T = false;
                org.telegram.ui.Components.voip.h2.b();
                ViewPropertyAnimator duration = hc1Var2.L.animate().setDuration(150L);
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f37917f;
                duration.setInterpolator(nrVar).start();
                hc1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
                hc1Var2.J.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
                hc1Var2.O.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
                hc1Var2.Y.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
                hc1Var2.f48318j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
                hc1Var2.f48314h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(nrVar).start();
                hc1Var2.f48316i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(nrVar).start();
                hc1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(nrVar).start();
                valueAnimator.addListener(new xb1(hc1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(nrVar);
                valueAnimator.start();
                return;
            case 22:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj2;
                org.telegram.ui.Wallet.u0.P("enable backup: ready! getting secret phrase...");
                u0Var.F(false, true, false, new bi.r6(28, u0Var, (org.telegram.ui.Wallet.v8) obj));
                return;
            case 23:
                org.telegram.messenger.np.u1(((org.telegram.ui.Wallet.u0) obj2).f45093a).V3((TLRPC.Updates) obj, false);
                return;
            case 24:
                org.telegram.ui.Wallet.u0 u0Var2 = (org.telegram.ui.Wallet.u0) obj2;
                org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) obj;
                org.telegram.ui.Wallet.u0.P("emulate disable backup: ready");
                if (u0Var2.A() <= 0) {
                    jVar.a(500000L, null);
                    return;
                }
                WalletEngine2 walletEngine2 = u0Var2.f45094b;
                if (walletEngine2 == null) {
                    org.telegram.ui.Wallet.u0.n("emulate disable backup: no engine!");
                    jVar.a(null, "NULL_ENGINE");
                    return;
                }
                walletEngine2.emulateRotateKey(new org.telegram.ui.Wallet.e(u0Var2, jVar));
                return;
            case 25:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Wallet.n nVar = (org.telegram.ui.Wallet.n) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    nVar.run();
                    return;
                }
                return;
            case 26:
                org.telegram.messenger.np.u1(((org.telegram.ui.Wallet.l2) obj2).f44489a).V3((TLRPC.Updates) obj, false);
                return;
            case 27:
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj2;
                org.telegram.ui.Wallet.d3 d3Var = (org.telegram.ui.Wallet.d3) obj;
                if (!y2Var.f45312e) {
                    d3Var.f30148d0 = true;
                    Runnable runnable2 = y2Var.f45314g;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                return;
            case 28:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((org.telegram.messenger.r10) obj2).a(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                return;
            default:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(org.telegram.messenger.hd.N0(2131748586, null));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new org.telegram.ui.Components.r80(org.telegram.messenger.g0.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    return;
                }
                return;
        }
    }
}
