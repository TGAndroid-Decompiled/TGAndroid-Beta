package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class l01 implements Runnable {
    public final int f35860a;
    public final Object f35861b;
    public final Object f35862c;

    public l01(int i10, Object obj, Object obj2) {
        this.f35860a = i10;
        this.f35861b = obj;
        this.f35862c = obj2;
    }

    @Override
    public final void run() {
        long j10;
        org.telegram.ui.Components.el0 el0Var;
        int i10 = this.f35860a;
        Object obj = this.f35862c;
        Object obj2 = this.f35861b;
        switch (i10) {
            case 0:
                r01 r01Var = (r01) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList = (ArrayList) obj;
                r01Var.d.addAll(arrayList);
                int i11 = r01Var.f37894f;
                MessagesController.getInstance(i11).faqSearchArray = arrayList;
                MessagesController.getInstance(i11).faqWebPage = r01Var.B;
                if (!r01Var.f37898w) {
                    r01Var.l();
                    return;
                }
                return;
            case 1:
                v01 v01Var = (v01) obj2;
                v01Var.f39037f.add((x01) obj);
                v01Var.a();
                return;
            case 2:
                ((m21) obj2).e0(34, (Bitmap) obj, true);
                return;
            case 3:
                h21 h21Var = (h21) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    h21Var.getClass();
                    return;
                }
                int i12 = h21Var.G;
                if (i12 != 0 && i12 < tL_exportedContactToken.expires) {
                    try {
                        try {
                            Vibrator vibrator = (Vibrator) h21Var.getContext().getSystemService("vibrator");
                            if (vibrator != null) {
                                vibrator.vibrate(100L);
                            }
                        } catch (Exception unused) {
                            h21Var.performHapticFeedback(0, 2);
                        }
                    } catch (Exception unused2) {
                    }
                }
                h21Var.G = tL_exportedContactToken.expires;
                h21Var.c(tL_exportedContactToken.url, null, false, true);
                return;
            case 4:
                j31 j31Var = (j31) ((View[]) obj2)[0];
                j31Var.f35217b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                j31Var.f35218c = null;
                j31Var.d = null;
                j31Var.f35219f.V2.N(false);
                return;
            case 5:
                ((j31) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 6:
                j31 j31Var2 = (j31) ((View[]) obj2)[0];
                j31Var2.f35217b = null;
                j31Var2.f35218c = (TLRPC.TL_reportResultChooseOption) obj;
                j31Var2.d = null;
                j31Var2.f35219f.V2.N(false);
                return;
            case 7:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.qc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 8:
                org.telegram.ui.Components.qc.a0((org.telegram.ui.ActionBar.p2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.i80) obj);
                return;
            case 9:
                ((SecretMediaViewer) obj2).J = false;
                ((ju0) obj).f35495a.setVisible(false, true);
                return;
            case 10:
                ((SecretMediaViewer) ((n7.qa) obj2).f14703c).h((File) obj);
                return;
            case 11:
                q61 q61Var = (q61) obj2;
                q61Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.p2) obj).presentFragment(new StickersActivity(5, q61Var.I0));
                Runnable runnable = q61Var.Q1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 12:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.qc.a0((o81) obj2).k(false).j();
                return;
            case 13:
                o81.W((o81) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 14:
                h81 h81Var = (h81) obj2;
                a0.h hVar = (a0.h) obj;
                o81 o81Var = h81Var.Y0;
                Activity parentActivity = o81Var.getParentActivity();
                kh.j4 j4Var = o81Var.f36815b;
                int m9 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f19188id;
                } else {
                    j10 = 0;
                }
                org.telegram.ui.Components.qc.x(parentActivity, j4Var, m9, j10, h81Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), h81Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                return;
            case 15:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                new y81(p2Var.getContext(), p2Var.getCurrentAccount(), p2Var.getResourceProvider(), (kh.a1) obj).show();
                return;
            case 16:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.k8) obj);
                return;
            case 17:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.s8) {
                    ((org.telegram.ui.Cells.s8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            case 18:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.j6.f20237w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.j6.f20237w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.j6.f20256x), Double.valueOf(org.telegram.ui.ActionBar.j6.f20274y));
                }
                org.telegram.ui.ActionBar.j6.q1();
                org.telegram.ui.Components.sl0 sl0Var = themeActivity2.f32333b;
                if (sl0Var != null && (el0Var = (org.telegram.ui.Components.el0) sl0Var.K(themeActivity2.V)) != null) {
                    View view2 = el0Var.f5785a;
                    if (view2 instanceof org.telegram.ui.Cells.aa) {
                        ((org.telegram.ui.Cells.aa) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.j6.f20237w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                cd1 cd1Var = (cd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (cd1Var.f33321n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    cd1Var.f33346x0.f(cd1Var.H0[0], true);
                    return;
                }
                return;
            case 20:
                hd1.X((hd1) obj2, (String) obj);
                return;
            case 21:
                hd1.V((hd1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 22:
                rd1 rd1Var = (rd1) obj2;
                rd1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                rd1Var.c(true);
                return;
            case 23:
                rd1 rd1Var2 = (rd1) obj2;
                rd1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                rd1Var2.c(true);
                return;
            case 24:
                pe1 pe1Var = (pe1) obj2;
                pe1Var.getClass();
                Bundle bundle = new Bundle();
                kf1 kf1Var = pe1Var.f37297b;
                bundle.putLong("dialog_id", -kf1Var.f35668a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f19236id);
                kf1Var.presentFragment(new e11(bundle, null));
                return;
            case 25:
                gf1 gf1Var = (gf1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList2 = gf1Var.W;
                kf1 kf1Var2 = gf1Var.f34610q0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList3 = new ArrayList();
                int i13 = 0;
                while (true) {
                    ArrayList arrayList4 = kf1Var2.f35671b;
                    if (i13 < arrayList4.size()) {
                        if (((bf1) arrayList4.get(i13)).f32951c != null && ((bf1) arrayList4.get(i13)).f32951c.title.toLowerCase().contains(lowerCase)) {
                            arrayList3.add(((bf1) arrayList4.get(i13)).f32951c);
                            ((bf1) arrayList4.get(i13)).f32951c.searchQuery = lowerCase;
                        }
                        i13++;
                    } else {
                        arrayList2.clear();
                        arrayList2.addAll(arrayList3);
                        gf1Var.L();
                        if (!arrayList2.isEmpty()) {
                            gf1Var.f34603i0 = false;
                            gf1Var.f34606l0.b(0);
                        }
                        gf1Var.J(str2);
                        return;
                    }
                }
                break;
            case 26:
                nf1 nf1Var = ((mf1) obj2).f36289b;
                nf1Var.f36618a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f19236id));
                nf1Var.f36618a.V();
                return;
            case 27:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 28:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            default:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                return;
        }
    }

    public l01(h81 h81Var, a0.h hVar, int i10) {
        this.f35860a = 14;
        this.f35861b = h81Var;
        this.f35862c = hVar;
    }
}
