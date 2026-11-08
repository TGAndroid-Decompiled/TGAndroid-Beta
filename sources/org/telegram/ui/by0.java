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
public final class by0 implements Runnable {
    public final int f44505a;
    public final Object f44506b;
    public final Object f44507c;

    public by0(int i7, Object obj, Object obj2) {
        this.f44505a = i7;
        this.f44506b = obj;
        this.f44507c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.xi0 xi0Var;
        int i7 = this.f44505a;
        int i10 = 0;
        Object obj = this.f44507c;
        Object obj2 = this.f44506b;
        switch (i7) {
            case 0:
                ny0 ny0Var = (ny0) ((View[]) obj2)[0];
                ny0Var.f48169b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                ny0Var.f48170c = null;
                ny0Var.d = null;
                ny0Var.f48172f.f37190f3.O(false);
                return;
            case 1:
                ((ny0) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 2:
                ny0 ny0Var2 = (ny0) ((View[]) obj2)[0];
                ny0Var2.f48169b = null;
                ny0Var2.f48170c = (TLRPC.TL_reportResultChooseOption) obj;
                ny0Var2.d = null;
                ny0Var2.f48172f.f37190f3.O(false);
                return;
            case 3:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.hc) obj).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                return;
            case 4:
                org.telegram.ui.Components.hc.a0((org.telegram.ui.ActionBar.f2) obj2).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                org.telegram.messenger.g0.h3((org.telegram.ui.Components.v80) obj);
                return;
            case 5:
                ((SecretMediaViewer) obj2).K = false;
                ((wq0) obj).f51483a.O0(false, true);
                return;
            case 6:
                ((SecretMediaViewer) ((j2.n) obj2).f16457c).i((File) obj);
                return;
            case 7:
                q11 q11Var = (q11) obj2;
                q11Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.f2) obj).presentFragment(new StickersActivity(5, q11Var.L0));
                Runnable runnable = q11Var.U1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 8:
                org.telegram.messenger.g0.g((String) obj);
                org.telegram.ui.Components.hc.a0((m31) obj2).k(false).j();
                return;
            case 9:
                m31.b0((m31) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 10:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                new t31(f2Var.getContext(), f2Var.getCurrentAccount(), f2Var.getResourceProvider(), (org.telegram.messenger.voip.k) obj).show();
                return;
            case 11:
                ((StickersActivity) obj2).s0((org.telegram.ui.Cells.g8) obj);
                return;
            case 12:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().F4(true);
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(themeActivity.getMessagesController().S4());
                    return;
                }
                return;
            case 13:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.k6.f28199w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.k6.f28199w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.k6.f28218x), Double.valueOf(org.telegram.ui.ActionBar.k6.f28237y));
                }
                org.telegram.ui.ActionBar.k6.w1();
                org.telegram.ui.Components.pj0 pj0Var = themeActivity2.f42013b;
                if (pj0Var != null && (xi0Var = (org.telegram.ui.Components.xi0) pj0Var.K(themeActivity2.Y)) != null) {
                    View view2 = xi0Var.f57044a;
                    if (view2 instanceof org.telegram.ui.Cells.w9) {
                        ((org.telegram.ui.Cells.w9) view2).c(org.telegram.messenger.id.M0(2131753781, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.k6.f28199w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                v71 v71Var = (v71) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (v71Var.f50559n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    v71Var.B0.c(v71Var.L0[0]);
                    return;
                }
                return;
            case 15:
                y71.c0((y71) obj2, (String) obj);
                return;
            case 16:
                y71.a0((y71) obj2, (TLRPC.TL_theme) obj);
                return;
            case 17:
                g81 g81Var = (g81) obj2;
                g81Var.getClass();
                org.telegram.messenger.g0.g((String) obj);
                g81Var.c(true);
                return;
            case 18:
                g81 g81Var2 = (g81) obj2;
                g81Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.ij.h0(((TLRPC.TodoItem) obj).title, false));
                g81Var2.c(true);
                return;
            case 19:
                e91 e91Var = (e91) obj2;
                e91Var.getClass();
                Bundle bundle = new Bundle();
                w91 w91Var = e91Var.f45245b;
                bundle.putLong("dialog_id", -w91Var.f50992a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f27008id);
                w91Var.presentFragment(new gx0(bundle, null));
                return;
            case 20:
                s91 s91Var = (s91) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = s91Var.f49686e0;
                w91 w91Var2 = s91Var.f49702v0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = w91Var2.f50995b;
                    if (i11 < arrayList3.size()) {
                        if (((o91) arrayList3.get(i11)).f48337c != null && ((o91) arrayList3.get(i11)).f48337c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((o91) arrayList3.get(i11)).f48337c);
                            ((o91) arrayList3.get(i11)).f48337c.searchQuery = lowerCase;
                        }
                        i11++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        s91Var.N();
                        if (!arrayList.isEmpty()) {
                            s91Var.f49694n0 = false;
                            s91Var.f49697q0.b(0);
                        }
                        s91Var.L(str2);
                        return;
                    }
                }
                break;
            case 21:
                z91 z91Var = ((y91) obj2).f52177b;
                z91Var.f52493a.f44737e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f27008id));
                z91Var.f52493a.a0();
                return;
            case 22:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 23:
                TwoStepVerificationActivity.i0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 24:
                TwoStepVerificationActivity.b0((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                return;
            case 25:
                za1.l0((za1) obj2, (String) obj);
                return;
            case 26:
                Runnable runnable2 = (Runnable) obj;
                br[] brVarArr = ((za1) obj2).f52515x.f52289f;
                int length = brVarArr.length;
                while (i10 < length) {
                    brVarArr[i10].C(0.0f);
                    i10++;
                }
                runnable2.run();
                return;
            case 27:
                eb1 eb1Var = (eb1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = eb1Var.f45260f;
                ArrayList arrayList5 = eb1Var.f45259e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                org.telegram.messenger.qp.s1(eb1Var.f45256a).S3(arrayList5, false);
                eb1Var.d = false;
                eb1Var.f45258c = true;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj3 = arrayList4.get(i10);
                    i10++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 28:
                fc1 fc1Var = (fc1) obj2;
                fc1Var.U.a(new pb1(fc1Var, (VoIPService) obj, 1), true);
                return;
            default:
                fc1 fc1Var2 = (fc1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.e2.S = false;
                org.telegram.ui.Components.voip.e2.b();
                ViewPropertyAnimator duration = fc1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40366f;
                duration.setInterpolator(xqVar).start();
                fc1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                fc1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                fc1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                fc1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                fc1Var2.f45560i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                fc1Var2.f45556g0.animate().alpha(1.0f).setDuration(350L).setInterpolator(xqVar).start();
                fc1Var2.f45558h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(xqVar).start();
                fc1Var2.L0.animate().alpha(1.0f).setDuration(350L).setInterpolator(xqVar).start();
                valueAnimator.addListener(new vb1(fc1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(xqVar);
                valueAnimator.start();
                return;
        }
    }
}
