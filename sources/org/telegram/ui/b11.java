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
public final class b11 implements Runnable {
    public final int f32694a;
    public final Object f32695b;
    public final Object f32696c;

    public b11(int i10, Object obj, Object obj2) {
        this.f32694a = i10;
        this.f32695b = obj;
        this.f32696c = obj2;
    }

    @Override
    public final void run() {
        long j10;
        org.telegram.ui.Components.dl0 dl0Var;
        int i10 = this.f32694a;
        Object obj = this.f32696c;
        Object obj2 = this.f32695b;
        switch (i10) {
            case 0:
                c11 c11Var = (c11) obj2;
                c11Var.f32989f.add((e11) obj);
                c11Var.a();
                return;
            case 1:
                ((u21) obj2).e0(34, (Bitmap) obj, true);
                return;
            case 2:
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
                        }
                    } catch (Exception unused2) {
                        o21Var.performHapticFeedback(0, 2);
                    }
                }
                o21Var.G = tL_exportedContactToken.expires;
                o21Var.c(tL_exportedContactToken.url, null, false, true);
                return;
            case 3:
                p31 p31Var = (p31) ((View[]) obj2)[0];
                p31Var.f36930b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                p31Var.f36931c = null;
                p31Var.d = null;
                p31Var.f36932f.V2.N(false);
                return;
            case 4:
                ((p31) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 5:
                p31 p31Var2 = (p31) ((View[]) obj2)[0];
                p31Var2.f36930b = null;
                p31Var2.f36931c = (TLRPC.TL_reportResultChooseOption) obj;
                p31Var2.d = null;
                p31Var2.f36932f.V2.N(false);
                return;
            case 6:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.qc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 7:
                org.telegram.ui.Components.qc.a0((org.telegram.ui.ActionBar.p2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.z80) obj);
                return;
            case 8:
                ((SecretMediaViewer) obj2).J = false;
                ((qu0) obj).f37487a.setVisible(false, true);
                return;
            case 9:
                ((SecretMediaViewer) ((n7.qa) obj2).f14688c).h((File) obj);
                return;
            case 10:
                x61 x61Var = (x61) obj2;
                x61Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.p2) obj).presentFragment(new StickersActivity(5, x61Var.I0));
                Runnable runnable = x61Var.Q1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 11:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.qc.a0((w81) obj2).k(false).j();
                return;
            case 12:
                w81.W((w81) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 13:
                p81 p81Var = (p81) obj2;
                a0.h hVar = (a0.h) obj;
                w81 w81Var = p81Var.Y0;
                Activity parentActivity = w81Var.getParentActivity();
                kh.i4 i4Var = w81Var.f39310b;
                int m9 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f19163id;
                } else {
                    j10 = 0;
                }
                org.telegram.ui.Components.qc.x(parentActivity, i4Var, m9, j10, p81Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), p81Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                return;
            case 14:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                new g91(p2Var.getContext(), p2Var.getCurrentAccount(), p2Var.getResourceProvider(), (kh.a1) obj).show();
                return;
            case 15:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.j8) obj);
                return;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            case 17:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.j6.f20212w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.j6.f20212w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.j6.f20231x), Double.valueOf(org.telegram.ui.ActionBar.j6.f20249y));
                }
                org.telegram.ui.ActionBar.j6.q1();
                org.telegram.ui.Components.rl0 rl0Var = themeActivity2.f32307b;
                if (rl0Var != null && (dl0Var = (org.telegram.ui.Components.dl0) rl0Var.K(themeActivity2.V)) != null) {
                    View view2 = dl0Var.f5774a;
                    if (view2 instanceof org.telegram.ui.Cells.z9) {
                        ((org.telegram.ui.Cells.z9) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.j6.f20212w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                jd1 jd1Var = (jd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (jd1Var.f35213n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    jd1Var.f35238x0.f(jd1Var.H0[0], true);
                    return;
                }
                return;
            case 19:
                od1.X((od1) obj2, (String) obj);
                return;
            case 20:
                od1.V((od1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 21:
                yd1 yd1Var = (yd1) obj2;
                yd1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                yd1Var.c(true);
                return;
            case 22:
                yd1 yd1Var2 = (yd1) obj2;
                yd1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                yd1Var2.c(true);
                return;
            case 23:
                xe1 xe1Var = (xe1) obj2;
                xe1Var.getClass();
                Bundle bundle = new Bundle();
                sf1 sf1Var = xe1Var.f39970b;
                bundle.putLong("dialog_id", -sf1Var.f38175a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f19211id);
                sf1Var.presentFragment(new l11(bundle, null));
                return;
            case 24:
                of1 of1Var = (of1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = of1Var.W;
                sf1 sf1Var2 = of1Var.f36792q0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = sf1Var2.f38178b;
                    if (i12 < arrayList3.size()) {
                        if (((jf1) arrayList3.get(i12)).f35268c != null && ((jf1) arrayList3.get(i12)).f35268c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((jf1) arrayList3.get(i12)).f35268c);
                            ((jf1) arrayList3.get(i12)).f35268c.searchQuery = lowerCase;
                        }
                        i12++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        of1Var.L();
                        if (!arrayList.isEmpty()) {
                            of1Var.f36785i0 = false;
                            of1Var.f36788l0.b(0);
                        }
                        of1Var.J(str2);
                        return;
                    }
                }
                break;
            case 25:
                vf1 vf1Var = ((uf1) obj2).f38809b;
                vf1Var.f39087a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f19211id));
                vf1Var.f39087a.V();
                return;
            case 26:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 27:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 28:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                return;
            default:
                wg1.g0((wg1) obj2, (String) obj);
                return;
        }
    }

    public b11(p81 p81Var, a0.h hVar, int i10) {
        this.f32694a = 13;
        this.f32695b = p81Var;
        this.f32696c = hVar;
    }
}
