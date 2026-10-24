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
public final class n71 implements Runnable {
    public final int f39763a;
    public final Object f39764b;
    public final Object f39765c;

    public n71(int i10, Object obj, Object obj2) {
        this.f39763a = i10;
        this.f39764b = obj;
        this.f39765c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.vl0 vl0Var;
        String message;
        int i10 = this.f39763a;
        long j10 = 0;
        int i11 = 0;
        Object obj = this.f39765c;
        Object obj2 = this.f39764b;
        switch (i10) {
            case 0:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.vc.a0((b81) obj2).k(false).j();
                return;
            case 1:
                b81.W((b81) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 2:
                u71 u71Var = (u71) obj2;
                a0.h hVar = (a0.h) obj;
                b81 b81Var = u71Var.f42342e1;
                Activity parentActivity = b81Var.getParentActivity();
                y8 y8Var = b81Var.f35954b;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f20348id;
                }
                org.telegram.ui.Components.vc.x(parentActivity, y8Var, m10, j10, u71Var.getThemedColor(org.telegram.ui.ActionBar.k6.Fi), u71Var.getThemedColor(org.telegram.ui.ActionBar.k6.Hi)).j();
                return;
            case 3:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                new l81(o2Var.getContext(), o2Var.getCurrentAccount(), o2Var.getResourceProvider(), (org.telegram.ui.ActionBar.m3) obj).show();
                return;
            case 4:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.l8) obj);
                return;
            case 5:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.k6.f21529w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.k6.f21529w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.k6.f21547x), Double.valueOf(org.telegram.ui.ActionBar.k6.f21566y));
                }
                org.telegram.ui.ActionBar.k6.t1();
                org.telegram.ui.Components.lm0 lm0Var = themeActivity2.f34202b;
                if (lm0Var != null && (vl0Var = (org.telegram.ui.Components.vl0) lm0Var.K(themeActivity2.Y)) != null) {
                    View view2 = vl0Var.f46342a;
                    if (view2 instanceof org.telegram.ui.Cells.ca) {
                        ((org.telegram.ui.Cells.ca) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.k6.f21529w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                pc1 pc1Var = (pc1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (pc1Var.f40480n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    pc1Var.B0.f(pc1Var.L0[0], true);
                    return;
                }
                return;
            case 8:
                tc1.X((tc1) obj2, (String) obj);
                return;
            case 9:
                tc1.V((tc1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 10:
                dd1 dd1Var = (dd1) obj2;
                dd1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                dd1Var.c(true);
                return;
            case 11:
                dd1 dd1Var2 = (dd1) obj2;
                dd1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                dd1Var2.c(true);
                return;
            case 12:
                ce1 ce1Var = (ce1) obj2;
                ce1Var.getClass();
                Bundle bundle = new Bundle();
                xe1 xe1Var = ce1Var.f36320b;
                bundle.putLong("dialog_id", -xe1Var.f43545a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f20396id);
                xe1Var.presentFragment(new c11(bundle, null));
                return;
            case 13:
                se1 se1Var = (se1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = se1Var.f41368c0;
                xe1 xe1Var2 = se1Var.f41384t0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = xe1Var2.f43548b;
                    if (i12 < arrayList3.size()) {
                        if (((ne1) arrayList3.get(i12)).f39813c != null && ((ne1) arrayList3.get(i12)).f39813c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((ne1) arrayList3.get(i12)).f39813c);
                            ((ne1) arrayList3.get(i12)).f39813c.searchQuery = lowerCase;
                        }
                        i12++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        se1Var.L();
                        if (!arrayList.isEmpty()) {
                            se1Var.f41377l0 = false;
                            se1Var.f41379o0.b(0);
                        }
                        se1Var.J(str2);
                        return;
                    }
                }
                break;
            case 14:
                af1 af1Var = ((ze1) obj2).f44088b;
                af1Var.f35752a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f20396id));
                af1Var.f35752a.V();
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
                ag1.g0((ag1) obj2, (String) obj);
                return;
            case 19:
                Runnable runnable = (Runnable) obj;
                vr[] vrVarArr = ((ag1) obj2).f35775w.f41792f;
                int length = vrVarArr.length;
                while (i11 < length) {
                    vrVarArr[i11].l(0.0f);
                    i11++;
                }
                runnable.run();
                return;
            case 20:
                gg1 gg1Var = (gg1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = gg1Var.f37575f;
                ArrayList<TLRPC.Chat> arrayList5 = gg1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(gg1Var.f37572a).putChats(arrayList5, false);
                gg1Var.d = false;
                gg1Var.f37574c = true;
                int size = arrayList4.size();
                while (i11 < size) {
                    Object obj3 = arrayList4.get(i11);
                    i11++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 21:
                nh1 nh1Var = (nh1) obj2;
                nh1Var.U.a(new wg1(nh1Var, (VoIPService) obj, 1), true);
                return;
            case 22:
                nh1 nh1Var2 = (nh1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.k2.U = false;
                org.telegram.ui.Components.voip.k2.i();
                ViewPropertyAnimator duration = nh1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.f33337f;
                duration.setInterpolator(zrVar).start();
                nh1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(zrVar).start();
                nh1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(zrVar).start();
                nh1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(zrVar).start();
                nh1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(zrVar).start();
                nh1Var2.f39848j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(zrVar).start();
                nh1Var2.f39844h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(zrVar).start();
                nh1Var2.f39846i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(zrVar).start();
                nh1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(zrVar).start();
                valueAnimator.addListener(new bh1(nh1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(zrVar);
                valueAnimator.start();
                return;
            case 23:
                MessagesController.getInstance(((org.telegram.ui.Wallet.l0) obj2).f34743a).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                return;
            case 24:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj2;
                org.telegram.ui.Wallet.l0.F("enable backup: ready! getting secret phrase...");
                l0Var.y(new ai.r5(24, l0Var, (org.telegram.ui.Wallet.x7) obj), false, true);
                return;
            case 25:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Wallet.q qVar = (org.telegram.ui.Wallet.q) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    qVar.run();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) obj2;
                org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) obj;
                org.telegram.ui.Wallet.l0.F("emulate disable backup: ready");
                if (l0Var2.u() <= 0) {
                    jVar.run(500000L, null);
                    return;
                }
                WalletEngine2 walletEngine2 = l0Var2.f34744b;
                if (walletEngine2 == null) {
                    org.telegram.ui.Wallet.l0.i("emulate disable backup: no engine!");
                    jVar.run(null, "NULL_ENGINE");
                    return;
                }
                walletEngine2.emulateRotateKey(new org.telegram.ui.Wallet.d(l0Var2, jVar));
                return;
            case 27:
                ai.q qVar2 = (ai.q) obj2;
                Exception exc = (Exception) obj;
                if (exc.getMessage() == null) {
                    message = "NULL_ERROR";
                } else {
                    message = exc.getMessage();
                }
                qVar2.run(null, message);
                return;
            case 28:
                MessagesController.getInstance(((org.telegram.ui.Wallet.e2) obj2).f34431a).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                o2Var2.presentFragment(new org.telegram.ui.Wallet.j9(o2Var2.getCurrentAccount(), ((TL_wallet.card) obj).address));
                return;
        }
    }

    public n71(u71 u71Var, a0.h hVar, int i10) {
        this.f39763a = 2;
        this.f39764b = u71Var;
        this.f39765c = hVar;
    }
}
