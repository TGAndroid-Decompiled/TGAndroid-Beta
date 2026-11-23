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
public final class iy0 implements Runnable {
    public final int f48945a;
    public final Object f48946b;
    public final Object f48947c;

    public iy0(int i7, Object obj, Object obj2) {
        this.f48945a = i7;
        this.f48946b = obj;
        this.f48947c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.mj0 mj0Var;
        int i7 = this.f48945a;
        int i10 = 0;
        Object obj = this.f48947c;
        Object obj2 = this.f48946b;
        switch (i7) {
            case 0:
                oy0 oy0Var = (oy0) ((View[]) obj2)[0];
                oy0Var.f50786b = null;
                oy0Var.f50787c = (TLRPC.TL_reportResultChooseOption) obj;
                oy0Var.d = null;
                oy0Var.f50789f.f35323g3.O(false);
                return;
            case 1:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.kc) obj).c(org.telegram.messenger.gd.N0(2131754485, null)).j();
                return;
            case 2:
                org.telegram.ui.Components.kc.b0((org.telegram.ui.ActionBar.g2) obj2).c(org.telegram.messenger.gd.N0(2131754485, null)).j();
                org.telegram.messenger.g0.g3((org.telegram.ui.Components.sh0) obj);
                return;
            case 3:
                ((SecretMediaViewer) obj2).L = false;
                ((wq0) obj).f53726a.P0(false, true);
                return;
            case 4:
                ((SecretMediaViewer) ((j6.k) obj2).f17344c).i((File) obj);
                return;
            case 5:
                q11 q11Var = (q11) obj2;
                q11Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.g2) obj).presentFragment(new StickersActivity(5, q11Var.M0));
                Runnable runnable = q11Var.V1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                org.telegram.messenger.g0.g((String) obj);
                org.telegram.ui.Components.kc.b0((n31) obj2).k(false).j();
                return;
            case 7:
                n31.b0((n31) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 8:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj2;
                new t31(g2Var.getContext(), g2Var.getCurrentAccount(), g2Var.getResourceProvider(), (ki.n2) obj).show();
                return;
            case 9:
                ((StickersActivity) obj2).s0((org.telegram.ui.Cells.g8) obj);
                return;
            case 10:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().Q4(true);
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(themeActivity.getMessagesController().e5());
                    return;
                }
                return;
            case 11:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.n6.f29798w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.n6.f29798w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.n6.f29817x), Double.valueOf(org.telegram.ui.ActionBar.n6.f29836y));
                }
                org.telegram.ui.ActionBar.n6.w1();
                org.telegram.ui.Components.ek0 ek0Var = themeActivity2.f43958b;
                if (ek0Var != null && (mj0Var = (org.telegram.ui.Components.mj0) ek0Var.K(themeActivity2.Z)) != null) {
                    View view2 = mj0Var.f59245a;
                    if (view2 instanceof org.telegram.ui.Cells.w9) {
                        ((org.telegram.ui.Cells.w9) view2).c(org.telegram.messenger.gd.N0(2131753778, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.n6.f29798w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                v71 v71Var = (v71) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (v71Var.f52885n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    v71Var.C0.c(v71Var.M0[0]);
                    return;
                }
                return;
            case 13:
                y71.c0((y71) obj2, (String) obj);
                return;
            case 14:
                y71.a0((y71) obj2, (TLRPC.TL_theme) obj);
                return;
            case 15:
                g81 g81Var = (g81) obj2;
                g81Var.getClass();
                org.telegram.messenger.g0.g((String) obj);
                g81Var.c(true);
                return;
            case 16:
                g81 g81Var2 = (g81) obj2;
                g81Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.fj.h0(((TLRPC.TodoItem) obj).title, false));
                g81Var2.c(true);
                return;
            case 17:
                d91 d91Var = (d91) obj2;
                d91Var.getClass();
                Bundle bundle = new Bundle();
                w91 w91Var = d91Var.f47017b;
                bundle.putLong("dialog_id", -w91Var.f53216a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f28544id);
                w91Var.presentFragment(new hx0(bundle, null));
                return;
            case 18:
                s91 s91Var = (s91) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = s91Var.f52011f0;
                w91 w91Var2 = s91Var.f52027w0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = w91Var2.f53219b;
                    if (i11 < arrayList3.size()) {
                        if (((o91) arrayList3.get(i11)).f50609c != null && ((o91) arrayList3.get(i11)).f50609c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((o91) arrayList3.get(i11)).f50609c);
                            ((o91) arrayList3.get(i11)).f50609c.searchQuery = lowerCase;
                        }
                        i11++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        s91Var.L();
                        if (!arrayList.isEmpty()) {
                            s91Var.f52019o0 = false;
                            s91Var.f52022r0.b(0);
                        }
                        s91Var.J(str2);
                        return;
                    }
                }
                break;
            case 19:
                z91 z91Var = ((y91) obj2).f54327b;
                z91Var.f54556a.f46755e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f28544id));
                z91Var.f54556a.a0();
                return;
            case 20:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 21:
                TwoStepVerificationActivity.i0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 22:
                TwoStepVerificationActivity.b0((TLRPC.TL_error) obj, (TwoStepVerificationActivity) obj2);
                return;
            case 23:
                za1.l0((za1) obj2, (String) obj);
                return;
            case 24:
                Runnable runnable2 = (Runnable) obj;
                er[] erVarArr = ((za1) obj2).f54580x.f46491f;
                int length = erVarArr.length;
                while (i10 < length) {
                    erVarArr[i10].D(0.0f);
                    i10++;
                }
                runnable2.run();
                return;
            case 25:
                eb1 eb1Var = (eb1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = eb1Var.f47495f;
                ArrayList arrayList5 = eb1Var.f47494e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                org.telegram.messenger.mp.u1(eb1Var.f47491a).Z3(arrayList5, false);
                eb1Var.d = false;
                eb1Var.f47493c = true;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj3 = arrayList4.get(i10);
                    i10++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 26:
                fc1 fc1Var = (fc1) obj2;
                fc1Var.V.a(new pb1(fc1Var, (VoIPService) obj, 1), true);
                return;
            case 27:
                fc1 fc1Var2 = (fc1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.i2.T = false;
                org.telegram.ui.Components.voip.i2.b();
                ViewPropertyAnimator duration = fc1Var2.L.animate().setDuration(150L);
                org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.f36858f;
                duration.setInterpolator(krVar).start();
                fc1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(krVar).start();
                fc1Var2.J.animate().alpha(1.0f).setDuration(150L).setInterpolator(krVar).start();
                fc1Var2.O.animate().alpha(1.0f).setDuration(150L).setInterpolator(krVar).start();
                fc1Var2.Y.animate().alpha(1.0f).setDuration(150L).setInterpolator(krVar).start();
                fc1Var2.f47775j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(krVar).start();
                fc1Var2.f47771h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(krVar).start();
                fc1Var2.f47773i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(krVar).start();
                fc1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(krVar).start();
                valueAnimator.addListener(new vb1(fc1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(krVar);
                valueAnimator.start();
                return;
            case 28:
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) obj2;
                org.telegram.ui.Wallet.v0.P("enable backup: ready! getting secret phrase...");
                v0Var.F(false, true, false, new bi.r6(28, v0Var, (org.telegram.ui.Wallet.w8) obj));
                return;
            default:
                org.telegram.messenger.mp.u1(((org.telegram.ui.Wallet.v0) obj2).f45255a).V3((TLRPC.Updates) obj, false);
                return;
        }
    }
}
