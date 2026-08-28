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
public final class n21 implements Runnable {
    public final int f40585a;
    public final Object f40586b;
    public final Object f40587c;

    public n21(int i9, Object obj, Object obj2) {
        this.f40585a = i9;
        this.f40586b = obj;
        this.f40587c = obj2;
    }

    @Override
    public final void run() {
        long j10;
        org.telegram.ui.Components.ik0 ik0Var;
        int i9 = this.f40585a;
        int i10 = 0;
        Object obj = this.f40587c;
        Object obj2 = this.f40586b;
        switch (i9) {
            case 0:
                x21 x21Var = (x21) ((View[]) obj2)[0];
                x21Var.f44337b = null;
                x21Var.f44338c = (TLRPC.TL_reportResultChooseOption) obj;
                x21Var.d = null;
                x21Var.f44340f.U2.N(false);
                return;
            case 1:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.oc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 2:
                org.telegram.ui.Components.oc.a0((org.telegram.ui.ActionBar.o2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.jg0) obj);
                return;
            case 3:
                ((SecretMediaViewer) obj2).I = false;
                ((bu0) obj).f36978a.setVisible(false, true);
                return;
            case 4:
                ((SecretMediaViewer) ((org.telegram.ui.Cells.e3) obj2).f24287c).h((File) obj);
                return;
            case 5:
                b61 b61Var = (b61) obj2;
                b61Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.o2) obj).presentFragment(new StickersActivity(5, b61Var.H0));
                Runnable runnable = b61Var.P1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.oc.a0((z71) obj2).k(false).j();
                return;
            case 7:
                z71.V((z71) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 8:
                s71 s71Var = (s71) obj2;
                a0.h hVar = (a0.h) obj;
                z71 z71Var = s71Var.X0;
                Activity parentActivity = z71Var.getParentActivity();
                fh.x4 x4Var = z71Var.f45061b;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f22384id;
                } else {
                    j10 = 0;
                }
                org.telegram.ui.Components.oc.x(parentActivity, x4Var, m10, j10, s71Var.getThemedColor(org.telegram.ui.ActionBar.f6.Fi), s71Var.getThemedColor(org.telegram.ui.ActionBar.f6.Hi)).j();
                return;
            case 9:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                new k81(o2Var.getContext(), o2Var.getCurrentAccount(), o2Var.getResourceProvider(), (df) obj).show();
                return;
            case 10:
                ((StickersActivity) obj2).m0((org.telegram.ui.Cells.k8) obj);
                return;
            case 11:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            case 12:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.f6.f23327w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.f6.f23327w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.f6.f23344x), Double.valueOf(org.telegram.ui.ActionBar.f6.f23362y));
                }
                org.telegram.ui.ActionBar.f6.q1();
                org.telegram.ui.Components.wk0 wk0Var = themeActivity2.f36227b;
                if (wk0Var != null && (ik0Var = (org.telegram.ui.Components.ik0) wk0Var.K(themeActivity2.U)) != null) {
                    View view2 = ik0Var.f5501a;
                    if (view2 instanceof org.telegram.ui.Cells.ba) {
                        ((org.telegram.ui.Cells.ba) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.f6.f23327w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                oc1 oc1Var = (oc1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (oc1Var.f41090n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    oc1Var.f41112w0.f(oc1Var.G0[0], true);
                    return;
                }
                return;
            case 14:
                tc1.W((tc1) obj2, (String) obj);
                return;
            case 15:
                tc1.U((tc1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 16:
                dd1 dd1Var = (dd1) obj2;
                dd1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                dd1Var.c(true);
                return;
            case 17:
                dd1 dd1Var2 = (dd1) obj2;
                dd1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                dd1Var2.c(true);
                return;
            case 18:
                be1 be1Var = (be1) obj2;
                be1Var.getClass();
                Bundle bundle = new Bundle();
                we1 we1Var = be1Var.f36844b;
                bundle.putLong("dialog_id", -we1Var.f43741a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f22432id);
                we1Var.presentFragment(new s01(bundle, null));
                return;
            case 19:
                re1 re1Var = (re1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = re1Var.V;
                we1 we1Var2 = re1Var.f42407p0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = we1Var2.f43744b;
                    if (i11 < arrayList3.size()) {
                        if (((me1) arrayList3.get(i11)).f40405c != null && ((me1) arrayList3.get(i11)).f40405c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((me1) arrayList3.get(i11)).f40405c);
                            ((me1) arrayList3.get(i11)).f40405c.searchQuery = lowerCase;
                        }
                        i11++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        re1Var.L();
                        if (!arrayList.isEmpty()) {
                            re1Var.f42400h0 = false;
                            re1Var.f42403k0.b(0);
                        }
                        re1Var.J(str2);
                        return;
                    }
                }
                break;
            case 20:
                af1 af1Var = ((ze1) obj2).f45128b;
                af1Var.f36475a.f37533e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f22432id));
                af1Var.f36475a.U();
                return;
            case 21:
                TwoStepVerificationActivity.X((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 22:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 23:
                TwoStepVerificationActivity.V((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                return;
            case 24:
                ag1.f0((ag1) obj2, (String) obj);
                return;
            case 25:
                Runnable runnable2 = (Runnable) obj;
                vr[] vrVarArr = ((ag1) obj2).f36495w.f42755f;
                int length = vrVarArr.length;
                while (i10 < length) {
                    vrVarArr[i10].l(0.0f);
                    i10++;
                }
                runnable2.run();
                return;
            case 26:
                gg1 gg1Var = (gg1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = gg1Var.f38543f;
                ArrayList<TLRPC.Chat> arrayList5 = gg1Var.f38542e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(gg1Var.f38539a).putChats(arrayList5, false);
                gg1Var.d = false;
                gg1Var.f38541c = true;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj3 = arrayList4.get(i10);
                    i10++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 27:
                mh1 mh1Var = (mh1) obj2;
                mh1Var.Q.a(new vg1(mh1Var, (VoIPService) obj, 1), true);
                return;
            case 28:
                mh1 mh1Var2 = (mh1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.l2.P = false;
                org.telegram.ui.Components.voip.l2.i();
                ViewPropertyAnimator duration = mh1Var2.G.animate().setDuration(150L);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f28844f;
                duration.setInterpolator(grVar).start();
                mh1Var2.D.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                mh1Var2.E.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                mh1Var2.J.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                mh1Var2.T.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                mh1Var2.f40443f0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                mh1Var2.f40437d0.animate().alpha(1.0f).setDuration(350L).setInterpolator(grVar).start();
                mh1Var2.f40440e0.animate().alpha(1.0f).setDuration(350L).setInterpolator(grVar).start();
                mh1Var2.I0.animate().alpha(1.0f).setDuration(350L).setInterpolator(grVar).start();
                valueAnimator.addListener(new ah1(mh1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(grVar);
                valueAnimator.start();
                return;
            default:
                uh1 uh1Var = (uh1) obj2;
                int[] iArr = (int[]) obj;
                uh1Var.getClass();
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    WallpapersListActivity wallpapersListActivity = uh1Var.f43260a;
                    int[][] iArr2 = WallpapersListActivity.f36296g0;
                    wallpapersListActivity.A0(true);
                    return;
                }
                return;
        }
    }

    public n21(s71 s71Var, a0.h hVar, int i9) {
        this.f40585a = 8;
        this.f40586b = s71Var;
        this.f40587c = hVar;
    }
}
