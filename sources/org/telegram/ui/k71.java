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
public final class k71 implements Runnable {
    public final int f38429a;
    public final Object f38430b;
    public final Object f38431c;

    public k71(int i10, Object obj, Object obj2) {
        this.f38429a = i10;
        this.f38430b = obj;
        this.f38431c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.sl0 sl0Var;
        String message;
        int i10 = this.f38429a;
        long j10 = 0;
        int i11 = 0;
        Object obj = this.f38431c;
        Object obj2 = this.f38430b;
        switch (i10) {
            case 0:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.xc.a0((x71) obj2).k(false).j();
                return;
            case 1:
                x71.W((x71) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 2:
                q71 q71Var = (q71) obj2;
                a0.h hVar = (a0.h) obj;
                x71 x71Var = q71Var.f40497c1;
                Activity parentActivity = x71Var.getParentActivity();
                y8 y8Var = x71Var.f43117b;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f20279id;
                }
                org.telegram.ui.Components.xc.x(parentActivity, y8Var, m10, j10, q71Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), q71Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                return;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                new h81(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getResourceProvider(), (org.telegram.ui.ActionBar.j3) obj).show();
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
                org.telegram.ui.ActionBar.h6.f21334w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.h6.f21334w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.h6.f21352x), Double.valueOf(org.telegram.ui.ActionBar.h6.f21371y));
                }
                org.telegram.ui.ActionBar.h6.r1();
                org.telegram.ui.Components.im0 im0Var = themeActivity2.f33890b;
                if (im0Var != null && (sl0Var = (org.telegram.ui.Components.sl0) im0Var.K(themeActivity2.Y)) != null) {
                    View view2 = sl0Var.f45910a;
                    if (view2 instanceof org.telegram.ui.Cells.ba) {
                        ((org.telegram.ui.Cells.ba) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.h6.f21334w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                kc1 kc1Var = (kc1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (kc1Var.f38546n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    kc1Var.A0.f(kc1Var.K0[0], true);
                    return;
                }
                return;
            case 8:
                oc1.X((oc1) obj2, (String) obj);
                return;
            case 9:
                oc1.V((oc1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 10:
                yc1 yc1Var = (yc1) obj2;
                yc1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                yc1Var.c(true);
                return;
            case 11:
                yc1 yc1Var2 = (yc1) obj2;
                yc1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                yc1Var2.c(true);
                return;
            case 12:
                xd1 xd1Var = (xd1) obj2;
                xd1Var.getClass();
                Bundle bundle = new Bundle();
                re1 re1Var = xd1Var.f43191b;
                bundle.putLong("dialog_id", -re1Var.f41150a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f20327id);
                re1Var.presentFragment(new z01(bundle, null));
                return;
            case 13:
                ne1 ne1Var = (ne1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ne1Var.f39563c0;
                re1 re1Var2 = ne1Var.f39579t0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = re1Var2.f41153b;
                    if (i12 < arrayList3.size()) {
                        if (((ie1) arrayList3.get(i12)).f37981c != null && ((ie1) arrayList3.get(i12)).f37981c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((ie1) arrayList3.get(i12)).f37981c);
                            ((ie1) arrayList3.get(i12)).f37981c.searchQuery = lowerCase;
                        }
                        i12++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        ne1Var.L();
                        if (!arrayList.isEmpty()) {
                            ne1Var.f39572l0 = false;
                            ne1Var.f39574o0.b(0);
                        }
                        ne1Var.J(str2);
                        return;
                    }
                }
                break;
            case 14:
                ue1 ue1Var = ((te1) obj2).f41654b;
                ue1Var.f41956a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f20327id));
                ue1Var.f41956a.V();
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
                vf1.g0((vf1) obj2, (String) obj);
                return;
            case 19:
                Runnable runnable = (Runnable) obj;
                tr[] trVarArr = ((vf1) obj2).f42242w.f40961f;
                int length = trVarArr.length;
                while (i11 < length) {
                    trVarArr[i11].l(0.0f);
                    i11++;
                }
                runnable.run();
                return;
            case 20:
                bg1 bg1Var = (bg1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = bg1Var.f35653f;
                ArrayList<TLRPC.Chat> arrayList5 = bg1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(bg1Var.f35650a).putChats(arrayList5, false);
                bg1Var.d = false;
                bg1Var.f35652c = true;
                int size = arrayList4.size();
                while (i11 < size) {
                    Object obj3 = arrayList4.get(i11);
                    i11++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 21:
                hh1 hh1Var = (hh1) obj2;
                hh1Var.U.a(new qg1(hh1Var, (VoIPService) obj, 1), true);
                return;
            case 22:
                hh1 hh1Var2 = (hh1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.k2.U = false;
                org.telegram.ui.Components.voip.k2.i();
                ViewPropertyAnimator duration = hh1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25014f;
                duration.setInterpolator(bsVar).start();
                hh1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                hh1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                hh1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                hh1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                hh1Var2.f37674j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                hh1Var2.f37670h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(bsVar).start();
                hh1Var2.f37672i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(bsVar).start();
                hh1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(bsVar).start();
                valueAnimator.addListener(new vg1(hh1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(bsVar);
                valueAnimator.start();
                return;
            case 23:
                MessagesController.getInstance(((org.telegram.ui.Wallet.m0) obj2).f34468a).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                return;
            case 24:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) obj2;
                org.telegram.ui.Wallet.m0.F("enable backup: ready! getting secret phrase...");
                m0Var.y(new ai.q5(24, m0Var, (org.telegram.ui.Wallet.x7) obj), false, true);
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
                WalletEngine2 walletEngine2 = m0Var2.f34469b;
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
                MessagesController.getInstance(((org.telegram.ui.Wallet.f2) obj2).f34186a).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                n2Var2.presentFragment(new org.telegram.ui.Wallet.i9(n2Var2.getCurrentAccount(), ((TL_wallet.card) obj).address));
                return;
        }
    }

    public k71(q71 q71Var, a0.h hVar, int i10) {
        this.f38429a = 2;
        this.f38430b = q71Var;
        this.f38431c = hVar;
    }
}
