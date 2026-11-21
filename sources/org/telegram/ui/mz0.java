package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Wallet.WalletEngine2;
public final class mz0 implements Runnable {
    public final int f50048a;
    public final Object f50049b;
    public final Object f50050c;

    public mz0(int i7, Object obj, Object obj2) {
        this.f50048a = i7;
        this.f50049b = obj;
        this.f50050c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.mj0 mj0Var;
        int i7 = this.f50048a;
        int i10 = 0;
        Object obj = this.f50050c;
        Object obj2 = this.f50049b;
        switch (i7) {
            case 0:
                ((SecretMediaViewer) ((ji.l) obj2).f17977c).i((File) obj);
                return;
            case 1:
                s11 s11Var = (s11) obj2;
                s11Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.g2) obj).presentFragment(new StickersActivity(5, s11Var.M0));
                Runnable runnable = s11Var.V1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.g0.g((String) obj);
                org.telegram.ui.Components.lc.b0((o31) obj2).k(false).j();
                return;
            case 3:
                o31.b0((o31) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 4:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj2;
                new u31(g2Var.getContext(), g2Var.getCurrentAccount(), g2Var.getResourceProvider(), (li.d) obj).show();
                return;
            case 5:
                ((StickersActivity) obj2).s0((org.telegram.ui.Cells.h8) obj);
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().Q4(true);
                if (view instanceof org.telegram.ui.Cells.s8) {
                    ((org.telegram.ui.Cells.s8) view).setChecked(themeActivity.getMessagesController().e5());
                    return;
                }
                return;
            case 7:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.m6.f29725w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.m6.f29725w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.m6.f29744x), Double.valueOf(org.telegram.ui.ActionBar.m6.f29763y));
                }
                org.telegram.ui.ActionBar.m6.w1();
                org.telegram.ui.Components.ek0 ek0Var = themeActivity2.f43873b;
                if (ek0Var != null && (mj0Var = (org.telegram.ui.Components.mj0) ek0Var.K(themeActivity2.Z)) != null) {
                    View view2 = mj0Var.f59161a;
                    if (view2 instanceof org.telegram.ui.Cells.x9) {
                        ((org.telegram.ui.Cells.x9) view2).c(org.telegram.messenger.gd.N0(2131753778, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.m6.f29725w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                x71 x71Var = (x71) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (x71Var.f53751n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    x71Var.C0.c(x71Var.M0[0]);
                    return;
                }
                return;
            case 9:
                a81.c0((a81) obj2, (String) obj);
                return;
            case 10:
                a81.a0((a81) obj2, (TLRPC.TL_theme) obj);
                return;
            case 11:
                i81 i81Var = (i81) obj2;
                i81Var.getClass();
                org.telegram.messenger.g0.g((String) obj);
                i81Var.c(true);
                return;
            case 12:
                i81 i81Var2 = (i81) obj2;
                i81Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.fj.h0(((TLRPC.TodoItem) obj).title, false));
                i81Var2.c(true);
                return;
            case 13:
                f91 f91Var = (f91) obj2;
                f91Var.getClass();
                Bundle bundle = new Bundle();
                y91 y91Var = f91Var.f47647b;
                bundle.putLong("dialog_id", -y91Var.f54095a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f28483id);
                y91Var.presentFragment(new jx0(bundle, null));
                return;
            case 14:
                u91 u91Var = (u91) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = u91Var.f52487f0;
                y91 y91Var2 = u91Var.f52503w0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = y91Var2.f54098b;
                    if (i11 < arrayList3.size()) {
                        if (((q91) arrayList3.get(i11)).f51149c != null && ((q91) arrayList3.get(i11)).f51149c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((q91) arrayList3.get(i11)).f51149c);
                            ((q91) arrayList3.get(i11)).f51149c.searchQuery = lowerCase;
                        }
                        i11++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        u91Var.J();
                        if (!arrayList.isEmpty()) {
                            u91Var.f52495o0 = false;
                            u91Var.f52498r0.b(0);
                        }
                        u91Var.H(str2);
                        return;
                    }
                }
                break;
            case 15:
                ba1 ba1Var = ((aa1) obj2).f45555b;
                ba1Var.f45826a.f47217e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f28483id));
                ba1Var.f45826a.a0();
                return;
            case 16:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 17:
                TwoStepVerificationActivity.i0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 18:
                TwoStepVerificationActivity.b0((TLRPC.TL_error) obj, (TwoStepVerificationActivity) obj2);
                return;
            case 19:
                bb1.l0((bb1) obj2, (String) obj);
                return;
            case 20:
                Runnable runnable2 = (Runnable) obj;
                er[] erVarArr = ((bb1) obj2).f45851x.f46297f;
                int length = erVarArr.length;
                while (i10 < length) {
                    erVarArr[i10].D(0.0f);
                    i10++;
                }
                runnable2.run();
                return;
            case 21:
                gb1 gb1Var = (gb1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = gb1Var.f48031f;
                ArrayList arrayList5 = gb1Var.f48030e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                org.telegram.messenger.mp.u1(gb1Var.f48027a).Z3(arrayList5, false);
                gb1Var.d = false;
                gb1Var.f48029c = true;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj3 = arrayList4.get(i10);
                    i10++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 22:
                hc1 hc1Var = (hc1) obj2;
                hc1Var.V.a(new rb1(hc1Var, (VoIPService) obj, 1), true);
                return;
            case 23:
                hc1 hc1Var2 = (hc1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.h2.T = false;
                org.telegram.ui.Components.voip.h2.b();
                ViewPropertyAnimator duration = hc1Var2.L.animate().setDuration(150L);
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f37956f;
                duration.setInterpolator(nrVar).start();
                hc1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
                hc1Var2.J.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
                hc1Var2.O.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
                hc1Var2.Y.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
                hc1Var2.f48349j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
                hc1Var2.f48345h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(nrVar).start();
                hc1Var2.f48347i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(nrVar).start();
                hc1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(nrVar).start();
                valueAnimator.addListener(new xb1(hc1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(nrVar);
                valueAnimator.start();
                return;
            case 24:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj2;
                org.telegram.ui.Wallet.u0.P("enable backup: ready! getting secret phrase...");
                u0Var.F(false, true, false, new bi.p6(28, u0Var, (org.telegram.ui.Wallet.v8) obj));
                return;
            case 25:
                org.telegram.messenger.mp.u1(((org.telegram.ui.Wallet.u0) obj2).f45123a).V3((TLRPC.Updates) obj, false);
                return;
            case 26:
                org.telegram.ui.Wallet.u0 u0Var2 = (org.telegram.ui.Wallet.u0) obj2;
                org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) obj;
                org.telegram.ui.Wallet.u0.P("emulate disable backup: ready");
                if (u0Var2.A() <= 0) {
                    jVar.a(500000L, null);
                    return;
                }
                WalletEngine2 walletEngine2 = u0Var2.f45124b;
                if (walletEngine2 == null) {
                    org.telegram.ui.Wallet.u0.n("emulate disable backup: no engine!");
                    jVar.a(null, "NULL_ENGINE");
                    return;
                }
                walletEngine2.emulateRotateKey(new org.telegram.ui.Wallet.e(u0Var2, jVar));
                return;
            case 27:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Wallet.n nVar = (org.telegram.ui.Wallet.n) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    nVar.run();
                    return;
                }
                return;
            case 28:
                org.telegram.messenger.mp.u1(((org.telegram.ui.Wallet.l2) obj2).f44519a).V3((TLRPC.Updates) obj, false);
                return;
            default:
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj2;
                org.telegram.ui.Wallet.d3 d3Var = (org.telegram.ui.Wallet.d3) obj;
                if (!y2Var.f45342e) {
                    d3Var.f30179d0 = true;
                    Runnable runnable3 = y2Var.f45344g;
                    if (runnable3 != null) {
                        runnable3.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
