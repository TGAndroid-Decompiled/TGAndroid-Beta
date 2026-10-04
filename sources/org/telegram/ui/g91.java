package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
public final class g91 implements Runnable {
    public final int f36535a;
    public final Object f36536b;
    public final Object f36537c;

    public g91(int i10, Object obj, Object obj2) {
        this.f36535a = i10;
        this.f36536b = obj;
        this.f36537c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.il0 il0Var;
        int i10;
        int i11;
        org.telegram.ui.web.c1 c1Var;
        org.telegram.ui.web.h0 h0Var;
        int i12 = this.f36535a;
        float f7 = 1.0f;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        Object obj = this.f36537c;
        Object obj2 = this.f36536b;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                new m91(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getResourceProvider(), (qc) obj).show();
                return;
            case 1:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.m8) obj);
                return;
            case 2:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            case 3:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.i6.f21163w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.i6.f21163w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.i6.f21180x), Double.valueOf(org.telegram.ui.ActionBar.i6.f21198y));
                }
                org.telegram.ui.ActionBar.i6.q1();
                org.telegram.ui.Components.zl0 zl0Var = themeActivity2.f34521b;
                if (zl0Var != null && (il0Var = (org.telegram.ui.Components.il0) zl0Var.K(themeActivity2.Y)) != null) {
                    View view2 = il0Var.f46523a;
                    if (view2 instanceof org.telegram.ui.Cells.ea) {
                        ((org.telegram.ui.Cells.ea) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.i6.f21163w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                rd1 rd1Var = (rd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (rd1Var.f40069n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    rd1Var.A0.f(rd1Var.K0[0], true);
                    return;
                }
                return;
            case 5:
                wd1.W((wd1) obj2, (String) obj);
                return;
            case 6:
                wd1.T((wd1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 7:
                ge1 ge1Var = (ge1) obj2;
                ge1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                ge1Var.c(true);
                return;
            case 8:
                ge1 ge1Var2 = (ge1) obj2;
                ge1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                ge1Var2.c(true);
                return;
            case 9:
                ef1 ef1Var = (ef1) obj2;
                ef1Var.getClass();
                Bundle bundle = new Bundle();
                yf1 yf1Var = ef1Var.f36013b;
                bundle.putLong("dialog_id", -yf1Var.f43162a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f20089id);
                yf1Var.presentFragment(new p11(bundle, null));
                return;
            case 10:
                uf1 uf1Var = (uf1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = uf1Var.f41172d0;
                yf1 yf1Var2 = uf1Var.f41188u0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = yf1Var2.f43165b;
                    if (i15 < arrayList3.size()) {
                        if (((pf1) arrayList3.get(i15)).f39471c != null && ((pf1) arrayList3.get(i15)).f39471c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((pf1) arrayList3.get(i15)).f39471c);
                            ((pf1) arrayList3.get(i15)).f39471c.searchQuery = lowerCase;
                        }
                        i15++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        uf1Var.N();
                        if (!arrayList.isEmpty()) {
                            uf1Var.m0 = false;
                            uf1Var.f41183p0.b(0);
                        }
                        uf1Var.L(str2);
                        return;
                    }
                }
                break;
            case 11:
                bg1 bg1Var = ((ag1) obj2).f34811b;
                bg1Var.f35084a.f36022e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f20089id));
                bg1Var.f35084a.T();
                return;
            case 12:
                TwoStepVerificationActivity.X((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 13:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 14:
                TwoStepVerificationActivity.U((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                return;
            case 15:
                bh1.g0((bh1) obj2, (String) obj);
                return;
            case 16:
                Runnable runnable = (Runnable) obj;
                for (es esVar : ((bh1) obj2).f35106w.f35543f) {
                    esVar.l(0.0f);
                }
                runnable.run();
                return;
            case 17:
                ih1 ih1Var = (ih1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = ih1Var.f37440f;
                ArrayList<TLRPC.Chat> arrayList5 = ih1Var.f37439e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(ih1Var.f37436a).putChats(arrayList5, false);
                ih1Var.d = false;
                ih1Var.f37438c = true;
                int size = arrayList4.size();
                while (i14 < size) {
                    Object obj3 = arrayList4.get(i14);
                    i14++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 18:
                mi1 mi1Var = (mi1) obj2;
                mi1Var.U.a(new vh1(mi1Var, (VoIPService) obj, 1), true);
                return;
            case 19:
                mi1 mi1Var2 = (mi1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.n2.T = false;
                org.telegram.ui.Components.voip.n2.i();
                ViewPropertyAnimator duration = mi1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.f31140f;
                duration.setInterpolator(trVar).start();
                mi1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(trVar).start();
                mi1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(trVar).start();
                mi1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(trVar).start();
                mi1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(trVar).start();
                mi1Var2.f38626j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(trVar).start();
                mi1Var2.f38622h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(trVar).start();
                mi1Var2.f38624i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(trVar).start();
                mi1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(trVar).start();
                valueAnimator.addListener(new ai1(mi1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(trVar);
                valueAnimator.start();
                return;
            case 20:
                vi1 vi1Var = (vi1) obj2;
                int[] iArr = (int[]) obj;
                vi1Var.getClass();
                int i16 = iArr[0] - 1;
                iArr[0] = i16;
                if (i16 == 0) {
                    WallpapersListActivity wallpapersListActivity = vi1Var.f41757a;
                    int[][] iArr2 = WallpapersListActivity.f34593i0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 21:
                bj1 bj1Var = (bj1) obj2;
                String str3 = (String) obj;
                bj1Var.d.clear();
                bj1Var.f35124e.clear();
                bj1Var.f35125f = true;
                bj1Var.F(str3, "", true);
                bj1Var.h = str3;
                bj1Var.l();
                bj1Var.f35131y = null;
                return;
            case 22:
                bj1 bj1Var2 = (bj1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = bj1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = bj1Var2.f35130x;
                bj1Var2.f35130x = null;
                bj1Var2.F(str4, "", false);
                return;
            case 23:
                String str5 = (String) obj;
                hj1 hj1Var = ((gj1) obj2).f36661a;
                Activity parentActivity = hj1Var.getParentActivity();
                MessageObject messageObject = hj1Var.f37108n;
                if (parentActivity != null) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d(str5);
                    }
                    str5.getClass();
                    if (!str5.equals("share_game")) {
                        if (str5.equals("share_score")) {
                            messageObject.messageOwner.with_my_score = true;
                        }
                    } else {
                        messageObject.messageOwner.with_my_score = false;
                    }
                    hj1Var.showDialog(org.telegram.ui.Components.zq0.K0(hj1Var.getParentActivity(), messageObject, null, false, hj1Var.h));
                    return;
                }
                return;
            case 24:
                org.telegram.ui.web.c1 c1Var2 = (org.telegram.ui.web.c1) obj2;
                ei.s sVar = c1Var2.f42132j0;
                sVar.f9318f = true;
                sVar.k();
                c1Var2.w((ai.da) obj);
                return;
            case 25:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (c1Var = botWebViewContainer$BotWebViewProxy.f42081a) != null && (h0Var = c1Var.f42122c) != null) {
                    h0Var.f(arrayList6);
                    return;
                }
                return;
            case 26:
                ArrayList arrayList7 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.e1.f42174c.addAll(0, arrayList7);
                for (int i17 = 0; i17 < longSparseArray.size(); i17++) {
                    org.telegram.ui.web.e1.d.put(longSparseArray.keyAt(i17), (org.telegram.ui.web.d1) longSparseArray.valueAt(i17));
                }
                org.telegram.ui.web.e1.f42173b = true;
                org.telegram.ui.web.e1.f42172a = false;
                ArrayList arrayList8 = org.telegram.ui.web.e1.f42175e;
                if (arrayList8 != null) {
                    int size2 = arrayList8.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList8.get(i13);
                        i13++;
                        ((Utilities.Callback) obj4).run(arrayList7);
                    }
                    org.telegram.ui.web.e1.f42175e = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.web.h1 h1Var = ((org.telegram.ui.web.g1) obj2).h;
                ArrayList arrayList9 = h1Var.h;
                arrayList9.clear();
                arrayList9.addAll((ArrayList) obj);
                h1Var.f42199n = false;
                org.telegram.ui.Components.w61 w61Var = h1Var.f32724a;
                if (w61Var != null) {
                    w61Var.f25244f3.N(true);
                    return;
                }
                return;
            case 28:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) obj2;
                if (((org.telegram.ui.web.h2) obj).b() != null) {
                    z10 = true;
                }
                f1Var.setEnabled(z10);
                ViewPropertyAnimator animate = f1Var.animate();
                if (!f1Var.isEnabled()) {
                    f7 = 0.5f;
                }
                animate.alpha(f7);
                return;
            default:
                ((l0) obj2).f42374f0.run((Integer) obj);
                return;
        }
    }
}
