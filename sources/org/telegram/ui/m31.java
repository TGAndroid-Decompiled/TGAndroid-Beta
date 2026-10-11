package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
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
public final class m31 implements Runnable {
    public final int f39841a;
    public final Object f39842b;
    public final Object f39843c;

    public m31(int i10, Object obj, Object obj2) {
        this.f39841a = i10;
        this.f39842b = obj;
        this.f39843c = obj2;
    }

    @Override
    public final void run() {
        long j3;
        org.telegram.ui.Components.bm0 bm0Var;
        int i10 = this.f39841a;
        int i11 = 0;
        Object obj = this.f39843c;
        Object obj2 = this.f39842b;
        switch (i10) {
            case 0:
                ((a41) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 1:
                a41 a41Var = (a41) ((View[]) obj2)[0];
                a41Var.f35911b = null;
                a41Var.f35912c = (TLRPC.TL_reportResultChooseOption) obj;
                a41Var.d = null;
                a41Var.f35914f.W2.N(false);
                return;
            case 2:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.ad) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 3:
                org.telegram.ui.Components.ad.a0((org.telegram.ui.ActionBar.m2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.ei0) obj);
                return;
            case 4:
                ((SecretMediaViewer) obj2).M = false;
                ((dv0) obj).f37147a.setVisible(false, true);
                return;
            case 5:
                ((SecretMediaViewer) ((n6.k) obj2).f16766c).h((File) obj);
                return;
            case 6:
                j71 j71Var = (j71) obj2;
                j71Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.m2) obj).presentFragment(new StickersActivity(5, j71Var.L0));
                Runnable runnable = j71Var.T1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.ad.a0((h91) obj2).k(false).j();
                return;
            case 8:
                h91.W((h91) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 9:
                a91 a91Var = (a91) obj2;
                a0.i iVar = (a0.i) obj;
                h91 h91Var = a91Var.f35977b1;
                Activity parentActivity = h91Var.getParentActivity();
                u8 u8Var = h91Var.f38385b;
                int m10 = iVar.m();
                if (iVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar.n(0)).f20072id;
                } else {
                    j3 = 0;
                }
                org.telegram.ui.Components.ad.x(parentActivity, u8Var, m10, j3, a91Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), a91Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                return;
            case 10:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                new s91(m2Var.getContext(), m2Var.getCurrentAccount(), m2Var.getResourceProvider(), (oc) obj).show();
                return;
            case 11:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.m8) obj);
                return;
            case 12:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            case 13:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.h6.f21165w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.h6.f21165w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.h6.f21184x), Double.valueOf(org.telegram.ui.ActionBar.h6.f21201y));
                }
                org.telegram.ui.ActionBar.h6.r1();
                org.telegram.ui.Components.rm0 rm0Var = themeActivity2.f34593b;
                if (rm0Var != null && (bm0Var = (org.telegram.ui.Components.bm0) rm0Var.K(themeActivity2.Y)) != null) {
                    View view2 = bm0Var.f47782a;
                    if (view2 instanceof org.telegram.ui.Cells.ca) {
                        ((org.telegram.ui.Cells.ca) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.h6.f21165w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                wd1 wd1Var = (wd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (wd1Var.f43397n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    wd1Var.A0.f(wd1Var.K0[0], true);
                    return;
                }
                return;
            case 15:
                be1.X((be1) obj2, (String) obj);
                return;
            case 16:
                be1.V((be1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 17:
                le1 le1Var = (le1) obj2;
                le1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                le1Var.c(true);
                return;
            case 18:
                le1 le1Var2 = (le1) obj2;
                le1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                le1Var2.c(true);
                return;
            case 19:
                kf1 kf1Var = (kf1) obj2;
                kf1Var.getClass();
                Bundle bundle = new Bundle();
                eg1 eg1Var = kf1Var.f39362b;
                bundle.putLong("dialog_id", -eg1Var.f37345a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f20120id);
                eg1Var.presentFragment(new u11(bundle, null));
                return;
            case 20:
                ag1 ag1Var = (ag1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ag1Var.f36106c0;
                eg1 eg1Var2 = ag1Var.f36122t0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = eg1Var2.f37348b;
                    if (i12 < arrayList3.size()) {
                        if (((vf1) arrayList3.get(i12)).f43040c != null && ((vf1) arrayList3.get(i12)).f43040c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((vf1) arrayList3.get(i12)).f43040c);
                            ((vf1) arrayList3.get(i12)).f43040c.searchQuery = lowerCase;
                        }
                        i12++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        ag1Var.L();
                        if (!arrayList.isEmpty()) {
                            ag1Var.f36115l0 = false;
                            ag1Var.f36117o0.b(0);
                        }
                        ag1Var.J(str2);
                        return;
                    }
                }
                break;
            case 21:
                hg1 hg1Var = ((gg1) obj2).f38121b;
                hg1Var.f38442a.f39371e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f20120id));
                hg1Var.f38442a.V();
                return;
            case 22:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 23:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 24:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                return;
            case 25:
                hh1.g0((hh1) obj2, (String) obj);
                return;
            case 26:
                Runnable runnable2 = (Runnable) obj;
                ds[] dsVarArr = ((hh1) obj2).f38465w.f36484f;
                int length = dsVarArr.length;
                while (i11 < length) {
                    dsVarArr[i11].l(0.0f);
                    i11++;
                }
                runnable2.run();
                return;
            case 27:
                oh1 oh1Var = (oh1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = oh1Var.f40585f;
                ArrayList<TLRPC.Chat> arrayList5 = oh1Var.f40584e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(oh1Var.f40581a).putChats(arrayList5, false);
                oh1Var.d = false;
                oh1Var.f40583c = true;
                int size = arrayList4.size();
                while (i11 < size) {
                    Object obj3 = arrayList4.get(i11);
                    i11++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 28:
                ui1 ui1Var = (ui1) obj2;
                ui1Var.U.a(new di1(ui1Var, (VoIPService) obj, 1), true);
                return;
            default:
                ui1 ui1Var2 = (ui1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.n2.U = false;
                org.telegram.ui.Components.voip.n2.i();
                ViewPropertyAnimator duration = ui1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.f27500f;
                duration.setInterpolator(isVar).start();
                ui1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(isVar).start();
                ui1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(isVar).start();
                ui1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(isVar).start();
                ui1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(isVar).start();
                ui1Var2.f42634j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(isVar).start();
                ui1Var2.f42630h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(isVar).start();
                ui1Var2.f42632i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(isVar).start();
                ui1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(isVar).start();
                valueAnimator.addListener(new ii1(ui1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(isVar);
                valueAnimator.start();
                return;
        }
    }

    public m31(a91 a91Var, a0.i iVar, int i10) {
        this.f39841a = 9;
        this.f39842b = a91Var;
        this.f39843c = iVar;
    }
}
