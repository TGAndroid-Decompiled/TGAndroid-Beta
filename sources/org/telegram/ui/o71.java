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
public final class o71 implements Runnable {
    public final int f40089a;
    public final Object f40090b;
    public final Object f40091c;

    public o71(int i10, Object obj, Object obj2) {
        this.f40089a = i10;
        this.f40090b = obj;
        this.f40091c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.wl0 wl0Var;
        String message;
        int i10 = this.f40089a;
        long j10 = 0;
        int i11 = 0;
        Object obj = this.f40091c;
        Object obj2 = this.f40090b;
        switch (i10) {
            case 0:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.xc.a0((c81) obj2).k(false).j();
                return;
            case 1:
                c81.W((c81) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 2:
                v71 v71Var = (v71) obj2;
                a0.h hVar = (a0.h) obj;
                c81 c81Var = v71Var.f42632e1;
                Activity parentActivity = c81Var.getParentActivity();
                y8 y8Var = c81Var.f36292b;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f20347id;
                }
                org.telegram.ui.Components.xc.x(parentActivity, y8Var, m10, j10, v71Var.getThemedColor(org.telegram.ui.ActionBar.k6.Fi), v71Var.getThemedColor(org.telegram.ui.ActionBar.k6.Hi)).j();
                return;
            case 3:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                new m81(o2Var.getContext(), o2Var.getCurrentAccount(), o2Var.getResourceProvider(), (org.telegram.ui.ActionBar.m3) obj).show();
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
                org.telegram.ui.ActionBar.k6.f21528w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.k6.f21528w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.k6.f21546x), Double.valueOf(org.telegram.ui.ActionBar.k6.f21565y));
                }
                org.telegram.ui.ActionBar.k6.t1();
                org.telegram.ui.Components.mm0 mm0Var = themeActivity2.f34200b;
                if (mm0Var != null && (wl0Var = (org.telegram.ui.Components.wl0) mm0Var.K(themeActivity2.Y)) != null) {
                    View view2 = wl0Var.f46343a;
                    if (view2 instanceof org.telegram.ui.Cells.ca) {
                        ((org.telegram.ui.Cells.ca) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.k6.f21528w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                qc1 qc1Var = (qc1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (qc1Var.f40751n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    qc1Var.B0.f(qc1Var.L0[0], true);
                    return;
                }
                return;
            case 8:
                uc1.X((uc1) obj2, (String) obj);
                return;
            case 9:
                uc1.V((uc1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 10:
                ed1 ed1Var = (ed1) obj2;
                ed1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                ed1Var.c(true);
                return;
            case 11:
                ed1 ed1Var2 = (ed1) obj2;
                ed1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                ed1Var2.c(true);
                return;
            case 12:
                de1 de1Var = (de1) obj2;
                de1Var.getClass();
                Bundle bundle = new Bundle();
                ye1 ye1Var = de1Var.f36609b;
                bundle.putLong("dialog_id", -ye1Var.f43792a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f20395id);
                ye1Var.presentFragment(new d11(bundle, null));
                return;
            case 13:
                te1 te1Var = (te1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = te1Var.f41976c0;
                ye1 ye1Var2 = te1Var.f41992t0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = ye1Var2.f43795b;
                    if (i12 < arrayList3.size()) {
                        if (((oe1) arrayList3.get(i12)).f40146c != null && ((oe1) arrayList3.get(i12)).f40146c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((oe1) arrayList3.get(i12)).f40146c);
                            ((oe1) arrayList3.get(i12)).f40146c.searchQuery = lowerCase;
                        }
                        i12++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        te1Var.L();
                        if (!arrayList.isEmpty()) {
                            te1Var.f41985l0 = false;
                            te1Var.f41987o0.b(0);
                        }
                        te1Var.J(str2);
                        return;
                    }
                }
                break;
            case 14:
                bf1 bf1Var = ((af1) obj2).f35671b;
                bf1Var.f36074a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f20395id));
                bf1Var.f36074a.V();
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
                bg1.g0((bg1) obj2, (String) obj);
                return;
            case 19:
                Runnable runnable = (Runnable) obj;
                vr[] vrVarArr = ((bg1) obj2).f36097w.f41793f;
                int length = vrVarArr.length;
                while (i11 < length) {
                    vrVarArr[i11].l(0.0f);
                    i11++;
                }
                runnable.run();
                return;
            case 20:
                hg1 hg1Var = (hg1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = hg1Var.f37859f;
                ArrayList<TLRPC.Chat> arrayList5 = hg1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(hg1Var.f37856a).putChats(arrayList5, false);
                hg1Var.d = false;
                hg1Var.f37858c = true;
                int size = arrayList4.size();
                while (i11 < size) {
                    Object obj3 = arrayList4.get(i11);
                    i11++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 21:
                oh1 oh1Var = (oh1) obj2;
                oh1Var.U.a(new xg1(oh1Var, (VoIPService) obj, 1), true);
                return;
            case 22:
                oh1 oh1Var2 = (oh1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.k2.U = false;
                org.telegram.ui.Components.voip.k2.i();
                ViewPropertyAnimator duration = oh1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25133f;
                duration.setInterpolator(bsVar).start();
                oh1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                oh1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                oh1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                oh1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                oh1Var2.f40185j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(bsVar).start();
                oh1Var2.f40181h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(bsVar).start();
                oh1Var2.f40183i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(bsVar).start();
                oh1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(bsVar).start();
                valueAnimator.addListener(new ch1(oh1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(bsVar);
                valueAnimator.start();
                return;
            case 23:
                MessagesController.getInstance(((org.telegram.ui.Wallet.l0) obj2).f34741a).lambda$processUpdates$377((TLRPC.Updates) obj, false);
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
                WalletEngine2 walletEngine2 = l0Var2.f34742b;
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
                MessagesController.getInstance(((org.telegram.ui.Wallet.e2) obj2).f34429a).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                o2Var2.presentFragment(new org.telegram.ui.Wallet.j9(o2Var2.getCurrentAccount(), ((TL_wallet.card) obj).address));
                return;
        }
    }

    public o71(v71 v71Var, a0.h hVar, int i10) {
        this.f40089a = 2;
        this.f40090b = v71Var;
        this.f40091c = hVar;
    }
}
