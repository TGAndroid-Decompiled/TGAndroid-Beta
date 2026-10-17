package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
public final class m71 implements Runnable {
    public final int f39022a;
    public final Object f39023b;
    public final Object f39024c;

    public m71(int i10, Object obj, Object obj2) {
        this.f39022a = i10;
        this.f39023b = obj;
        this.f39024c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.sl0 sl0Var;
        String message;
        int i10 = this.f39022a;
        long j10 = 0;
        int i11 = 0;
        Object obj = this.f39024c;
        Object obj2 = this.f39023b;
        switch (i10) {
            case 0:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.xc.a0((z71) obj2).k(false).j();
                return;
            case 1:
                z71.W((z71) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 2:
                s71 s71Var = (s71) obj2;
                a0.h hVar = (a0.h) obj;
                z71 z71Var = s71Var.f41033b1;
                Activity parentActivity = z71Var.getParentActivity();
                y8 y8Var = z71Var.f43652b;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f20276id;
                }
                org.telegram.ui.Components.xc.x(parentActivity, y8Var, m10, j10, s71Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), s71Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                return;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                new j81(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getResourceProvider(), (org.telegram.ui.ActionBar.j3) obj).show();
                return;
            case 4:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.l8) obj);
                return;
            case 5:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.v8) {
                    ((org.telegram.ui.Cells.v8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.h6.f21331w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.h6.f21331w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.h6.f21349x), Double.valueOf(org.telegram.ui.ActionBar.h6.f21368y));
                }
                org.telegram.ui.ActionBar.h6.r1();
                org.telegram.ui.Components.im0 im0Var = themeActivity2.f33884b;
                if (im0Var != null && (sl0Var = (org.telegram.ui.Components.sl0) im0Var.K(themeActivity2.Y)) != null) {
                    View view2 = sl0Var.f45938a;
                    if (view2 instanceof org.telegram.ui.Cells.ba) {
                        ((org.telegram.ui.Cells.ba) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.h6.f21331w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                mc1 mc1Var = (mc1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (mc1Var.f39134n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    mc1Var.A0.f(mc1Var.K0[0], true);
                    return;
                }
                return;
            case 8:
                qc1.X((qc1) obj2, (String) obj);
                return;
            case 9:
                qc1.V((qc1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 10:
                ad1 ad1Var = (ad1) obj2;
                ad1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                ad1Var.c(true);
                return;
            case 11:
                ad1 ad1Var2 = (ad1) obj2;
                ad1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                ad1Var2.c(true);
                return;
            case 12:
                zd1 zd1Var = (zd1) obj2;
                zd1Var.getClass();
                Bundle bundle = new Bundle();
                te1 te1Var = zd1Var.f43725b;
                bundle.putLong("dialog_id", -te1Var.f41679a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f20324id);
                te1Var.presentFragment(new b11(bundle, null));
                return;
            case 13:
                pe1 pe1Var = (pe1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = pe1Var.f40104c0;
                te1 te1Var2 = pe1Var.f40120t0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = te1Var2.f41682b;
                    if (i12 < arrayList3.size()) {
                        if (((ke1) arrayList3.get(i12)).f38506c != null && ((ke1) arrayList3.get(i12)).f38506c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((ke1) arrayList3.get(i12)).f38506c);
                            ((ke1) arrayList3.get(i12)).f38506c.searchQuery = lowerCase;
                        }
                        i12++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        pe1Var.L();
                        if (!arrayList.isEmpty()) {
                            pe1Var.f40113l0 = false;
                            pe1Var.f40115o0.b(0);
                        }
                        pe1Var.J(str2);
                        return;
                    }
                }
                break;
            case 14:
                we1 we1Var = ((ve1) obj2).f42192b;
                we1Var.f42502a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f20324id));
                we1Var.f42502a.V();
                return;
            case 15:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 16:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 17:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                return;
            case 18:
                xf1.g0((xf1) obj2, (String) obj);
                return;
            case 19:
                Runnable runnable = (Runnable) obj;
                vr[] vrVarArr = ((xf1) obj2).f43129w.f41486f;
                int length = vrVarArr.length;
                while (i11 < length) {
                    vrVarArr[i11].l(0.0f);
                    i11++;
                }
                runnable.run();
                return;
            case 20:
                dg1 dg1Var = (dg1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = dg1Var.f36198f;
                ArrayList<TLRPC.Chat> arrayList5 = dg1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(dg1Var.f36195a).putChats(arrayList5, false);
                dg1Var.d = false;
                dg1Var.f36197c = true;
                int size = arrayList4.size();
                while (i11 < size) {
                    Object obj3 = arrayList4.get(i11);
                    i11++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 21:
                jh1 jh1Var = (jh1) obj2;
                jh1Var.U.a(new sg1(jh1Var, (VoIPService) obj, 1), true);
                return;
            case 22:
                jh1 jh1Var2 = (jh1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.k2.U = false;
                org.telegram.ui.Components.voip.k2.i();
                ViewPropertyAnimator duration = jh1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25030f;
                duration.setInterpolator(bsVar).start();
                jh1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                jh1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                jh1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                jh1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                jh1Var2.f38194j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                jh1Var2.f38190h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(bsVar).start();
                jh1Var2.f38192i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(bsVar).start();
                jh1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(bsVar).start();
                valueAnimator.addListener(new xg1(jh1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(bsVar);
                valueAnimator.start();
                return;
            case 23:
                MessagesController.getInstance(((org.telegram.ui.Wallet.m0) obj2).f34551a).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                return;
            case 24:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) obj2;
                org.telegram.ui.Wallet.m0.F("enable backup: ready! getting secret phrase...");
                m0Var.y(new ai.q5(24, m0Var, (org.telegram.ui.Wallet.a8) obj), false, true);
                return;
            case 25:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Wallet.r rVar = (org.telegram.ui.Wallet.r) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    rVar.run();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Wallet.m0 m0Var2 = (org.telegram.ui.Wallet.m0) obj2;
                org.telegram.ui.Wallet.k kVar = (org.telegram.ui.Wallet.k) obj;
                org.telegram.ui.Wallet.m0.F("emulate disable backup: ready");
                if (m0Var2.u() <= 0) {
                    kVar.run(500000L, null);
                    return;
                }
                WalletEngine2 walletEngine2 = m0Var2.f34552b;
                if (walletEngine2 == null) {
                    org.telegram.ui.Wallet.m0.i("emulate disable backup: no engine!");
                    kVar.run(null, "NULL_ENGINE");
                    return;
                }
                walletEngine2.emulateRotateKey(new org.telegram.ui.Wallet.d(m0Var2, kVar));
                return;
            case 27:
                ai.q qVar = (ai.q) obj2;
                Exception exc = (Exception) obj;
                if (exc.getMessage() == null) {
                    message = "NULL_ERROR";
                } else {
                    message = exc.getMessage();
                }
                qVar.run(null, message);
                return;
            case 28:
                MessagesController.getInstance(((org.telegram.ui.Wallet.f2) obj2).f34191a).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                n2Var2.presentFragment(new org.telegram.ui.Wallet.l9(n2Var2.getCurrentAccount(), ((TL_wallet.card) obj).address));
                return;
        }
    }

    public m71(s71 s71Var, a0.h hVar, int i10) {
        this.f39022a = 2;
        this.f39023b = s71Var;
        this.f39024c = hVar;
    }
}
