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
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class h21 implements Runnable {
    public final int f37206a;
    public final Object f37207b;
    public final Object f37208c;

    public h21(int i10, Object obj, Object obj2) {
        this.f37206a = i10;
        this.f37207b = obj;
        this.f37208c = obj2;
    }

    @Override
    public final void run() {
        long j10;
        org.telegram.ui.Components.el0 el0Var;
        int i10 = this.f37206a;
        Object obj = this.f37208c;
        Object obj2 = this.f37207b;
        switch (i10) {
            case 0:
                ((u21) obj2).e0(34, (Bitmap) obj, true);
                return;
            case 1:
                o21 o21Var = (o21) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    o21Var.getClass();
                    return;
                }
                int i11 = o21Var.G;
                if (i11 != 0 && i11 < tL_exportedContactToken.expires) {
                    try {
                        try {
                            Vibrator vibrator = (Vibrator) o21Var.getContext().getSystemService("vibrator");
                            if (vibrator != null) {
                                vibrator.vibrate(100L);
                            }
                        } catch (Exception unused) {
                            o21Var.performHapticFeedback(0, 2);
                        }
                    } catch (Exception unused2) {
                    }
                }
                o21Var.G = tL_exportedContactToken.expires;
                o21Var.c(tL_exportedContactToken.url, null, false, true);
                return;
            case 2:
                p31 p31Var = (p31) ((View[]) obj2)[0];
                p31Var.f39873b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                p31Var.f39874c = null;
                p31Var.d = null;
                p31Var.f39876f.V2.N(false);
                return;
            case 3:
                ((p31) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 4:
                p31 p31Var2 = (p31) ((View[]) obj2)[0];
                p31Var2.f39873b = null;
                p31Var2.f39874c = (TLRPC.TL_reportResultChooseOption) obj;
                p31Var2.d = null;
                p31Var2.f39876f.V2.N(false);
                return;
            case 5:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.qc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 6:
                org.telegram.ui.Components.qc.a0((org.telegram.ui.ActionBar.p2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.b90) obj);
                return;
            case 7:
                ((SecretMediaViewer) obj2).J = false;
                ((qu0) obj).f40678a.setVisible(false, true);
                return;
            case 8:
                ((SecretMediaViewer) ((n7.qa) obj2).f15702c).h((File) obj);
                return;
            case 9:
                w61 w61Var = (w61) obj2;
                w61Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.p2) obj).presentFragment(new StickersActivity(5, w61Var.I0));
                Runnable runnable = w61Var.Q1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 10:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.qc.a0((v81) obj2).k(false).j();
                return;
            case 11:
                v81.W((v81) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 12:
                o81 o81Var = (o81) obj2;
                a0.h hVar = (a0.h) obj;
                v81 v81Var = o81Var.Y0;
                Activity parentActivity = v81Var.getParentActivity();
                lh.j4 j4Var = v81Var.f42045b;
                int m9 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f20849id;
                } else {
                    j10 = 0;
                }
                org.telegram.ui.Components.qc.x(parentActivity, j4Var, m9, j10, o81Var.getThemedColor(org.telegram.ui.ActionBar.k6.Fi), o81Var.getThemedColor(org.telegram.ui.ActionBar.k6.Hi)).j();
                return;
            case 13:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                new f91(p2Var.getContext(), p2Var.getCurrentAccount(), p2Var.getResourceProvider(), (lh.a1) obj).show();
                return;
            case 14:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.k8) obj);
                return;
            case 15:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.s8) {
                    ((org.telegram.ui.Cells.s8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            case 16:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.k6.f21993w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.k6.f21993w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.k6.f22012x), Double.valueOf(org.telegram.ui.ActionBar.k6.f22031y));
                }
                org.telegram.ui.ActionBar.k6.q1();
                org.telegram.ui.Components.sl0 sl0Var = themeActivity2.f34872b;
                if (sl0Var != null && (el0Var = (org.telegram.ui.Components.el0) sl0Var.K(themeActivity2.V)) != null) {
                    View view2 = el0Var.f5875a;
                    if (view2 instanceof org.telegram.ui.Cells.aa) {
                        ((org.telegram.ui.Cells.aa) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.k6.f21993w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                jd1 jd1Var = (jd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (jd1Var.f37996n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    jd1Var.f38021x0.f(jd1Var.H0[0], true);
                    return;
                }
                return;
            case 18:
                od1.X((od1) obj2, (String) obj);
                return;
            case 19:
                od1.V((od1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 20:
                zd1 zd1Var = (zd1) obj2;
                zd1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                zd1Var.c(true);
                return;
            case 21:
                zd1 zd1Var2 = (zd1) obj2;
                zd1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                zd1Var2.c(true);
                return;
            case 22:
                xe1 xe1Var = (xe1) obj2;
                xe1Var.getClass();
                Bundle bundle = new Bundle();
                sf1 sf1Var = xe1Var.f43024b;
                bundle.putLong("dialog_id", -sf1Var.f41188a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f20897id);
                sf1Var.presentFragment(new k11(bundle, null));
                return;
            case 23:
                of1 of1Var = (of1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = of1Var.W;
                sf1 sf1Var2 = of1Var.f39706q0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = sf1Var2.f41191b;
                    if (i12 < arrayList3.size()) {
                        if (((jf1) arrayList3.get(i12)).f38044c != null && ((jf1) arrayList3.get(i12)).f38044c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((jf1) arrayList3.get(i12)).f38044c);
                            ((jf1) arrayList3.get(i12)).f38044c.searchQuery = lowerCase;
                        }
                        i12++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        of1Var.L();
                        if (!arrayList.isEmpty()) {
                            of1Var.f39699i0 = false;
                            of1Var.f39702l0.b(0);
                        }
                        of1Var.J(str2);
                        return;
                    }
                }
                break;
            case 24:
                vf1 vf1Var = ((uf1) obj2).f41820b;
                vf1Var.f42107a.f43618e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f20897id));
                vf1Var.f42107a.V();
                return;
            case 25:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 26:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 27:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                return;
            case 28:
                vg1.g0((vg1) obj2, (String) obj);
                return;
            default:
                Runnable runnable2 = (Runnable) obj;
                for (cs csVar : ((vg1) obj2).f42125w.f44011f) {
                    csVar.l(0.0f);
                }
                runnable2.run();
                return;
        }
    }

    public h21(o81 o81Var, a0.h hVar, int i10) {
        this.f37206a = 12;
        this.f37207b = o81Var;
        this.f37208c = hVar;
    }
}
