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
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
public final class hb1 implements Runnable {
    public final int f33803a;
    public final Object f33804b;
    public final Object f33805c;

    public hb1(int i10, Object obj, Object obj2) {
        this.f33803a = i10;
        this.f33804b = obj;
        this.f33805c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.wk0 wk0Var;
        int i10;
        int i11;
        org.telegram.ui.web.b1 b1Var;
        org.telegram.ui.web.g0 g0Var;
        org.telegram.ui.web.t0 t0Var;
        int i12 = this.f33803a;
        float f7 = 1.0f;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        Object obj = this.f33805c;
        Object obj2 = this.f33804b;
        switch (i12) {
            case 0:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity.getClass();
                org.telegram.ui.ActionBar.h6.f19129w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.h6.f19129w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.h6.f19146x), Double.valueOf(org.telegram.ui.ActionBar.h6.f19164y));
                }
                org.telegram.ui.ActionBar.h6.q1();
                org.telegram.ui.Components.ml0 ml0Var = themeActivity.f31522b;
                if (ml0Var != null && (wk0Var = (org.telegram.ui.Components.wk0) ml0Var.K(themeActivity.Y)) != null) {
                    View view = wk0Var.f42627a;
                    if (view instanceof org.telegram.ui.Cells.fa) {
                        ((org.telegram.ui.Cells.fa) view).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.h6.f19129w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                od1 od1Var = (od1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (od1Var.f35817n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    od1Var.A0.f(od1Var.K0[0], true);
                    return;
                }
                return;
            case 2:
                td1.X((td1) obj2, (String) obj);
                return;
            case 3:
                td1.V((td1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 4:
                de1 de1Var = (de1) obj2;
                de1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                de1Var.c(true);
                return;
            case 5:
                de1 de1Var2 = (de1) obj2;
                de1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                de1Var2.c(true);
                return;
            case 6:
                cf1 cf1Var = (cf1) obj2;
                cf1Var.getClass();
                Bundle bundle = new Bundle();
                wf1 wf1Var = cf1Var.f32340b;
                bundle.putLong("dialog_id", -wf1Var.f38936a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f18135id);
                wf1Var.presentFragment(new p11(bundle, null));
                return;
            case 7:
                sf1 sf1Var = (sf1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = sf1Var.f37278c0;
                wf1 wf1Var2 = sf1Var.f37294t0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = wf1Var2.f38939b;
                    if (i15 < arrayList3.size()) {
                        if (((nf1) arrayList3.get(i15)).f35518c != null && ((nf1) arrayList3.get(i15)).f35518c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((nf1) arrayList3.get(i15)).f35518c);
                            ((nf1) arrayList3.get(i15)).f35518c.searchQuery = lowerCase;
                        }
                        i15++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        sf1Var.L();
                        if (!arrayList.isEmpty()) {
                            sf1Var.f37287l0 = false;
                            sf1Var.f37289o0.b(0);
                        }
                        sf1Var.J(str2);
                        return;
                    }
                }
                break;
            case 8:
                zf1 zf1Var = ((yf1) obj2).f39814b;
                zf1Var.f40121a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f18135id));
                zf1Var.f40121a.V();
                return;
            case 9:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 10:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 11:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                return;
            case 12:
                zg1.g0((zg1) obj2, (String) obj);
                return;
            case 13:
                Runnable runnable = (Runnable) obj;
                for (bs bsVar : ((zg1) obj2).f40144w.f40230f) {
                    bsVar.l(0.0f);
                }
                runnable.run();
                return;
            case 14:
                gh1 gh1Var = (gh1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = gh1Var.f33575f;
                ArrayList<TLRPC.Chat> arrayList5 = gh1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(gh1Var.f33572a).putChats(arrayList5, false);
                gh1Var.d = false;
                gh1Var.f33574c = true;
                int size = arrayList4.size();
                while (i14 < size) {
                    Object obj3 = arrayList4.get(i14);
                    i14++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 15:
                mi1 mi1Var = (mi1) obj2;
                mi1Var.U.a(new vh1(mi1Var, (VoIPService) obj, 1), true);
                return;
            case 16:
                mi1 mi1Var2 = (mi1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.m2.T = false;
                org.telegram.ui.Components.voip.m2.i();
                ViewPropertyAnimator duration = mi1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f27701f;
                duration.setInterpolator(rrVar).start();
                mi1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar).start();
                mi1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar).start();
                mi1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar).start();
                mi1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar).start();
                mi1Var2.f35323j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar).start();
                mi1Var2.f35319h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(rrVar).start();
                mi1Var2.f35321i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(rrVar).start();
                mi1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(rrVar).start();
                valueAnimator.addListener(new ai1(mi1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(rrVar);
                valueAnimator.start();
                return;
            case 17:
                vi1 vi1Var = (vi1) obj2;
                int[] iArr = (int[]) obj;
                vi1Var.getClass();
                int i16 = iArr[0] - 1;
                iArr[0] = i16;
                if (i16 == 0) {
                    WallpapersListActivity wallpapersListActivity = vi1Var.f38406a;
                    int[][] iArr2 = WallpapersListActivity.f31589k0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 18:
                bj1 bj1Var = (bj1) obj2;
                String str3 = (String) obj;
                bj1Var.d.clear();
                bj1Var.e.clear();
                bj1Var.f32131f = true;
                bj1Var.F(str3, "", true);
                bj1Var.h = str3;
                bj1Var.l();
                bj1Var.f32137y = null;
                return;
            case 19:
                bj1 bj1Var2 = (bj1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = bj1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = bj1Var2.f32136x;
                bj1Var2.f32136x = null;
                bj1Var2.F(str4, "", false);
                return;
            case 20:
                String str5 = (String) obj;
                hj1 hj1Var = ((gj1) obj2).f33582a;
                Activity parentActivity = hj1Var.getParentActivity();
                MessageObject messageObject = hj1Var.f33872n;
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
                    hj1Var.showDialog(org.telegram.ui.Components.hq0.N0(hj1Var.getParentActivity(), messageObject, null, false, hj1Var.h));
                    return;
                }
                return;
            case 21:
                org.telegram.ui.web.b1 b1Var2 = (org.telegram.ui.web.b1) obj2;
                ei.r rVar = b1Var2.f38642j0;
                rVar.f8564f = true;
                rVar.k();
                b1Var2.w((ai.da) obj);
                return;
            case 22:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (b1Var = botWebViewContainer$BotWebViewProxy.f38609a) != null && (g0Var = b1Var.f38633c) != null) {
                    g0Var.f(arrayList6);
                    return;
                }
                return;
            case 23:
                ArrayList arrayList7 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.d1.f38679c.addAll(0, arrayList7);
                for (int i17 = 0; i17 < longSparseArray.size(); i17++) {
                    org.telegram.ui.web.d1.d.put(longSparseArray.keyAt(i17), (org.telegram.ui.web.c1) longSparseArray.valueAt(i17));
                }
                org.telegram.ui.web.d1.f38678b = true;
                org.telegram.ui.web.d1.f38677a = false;
                ArrayList arrayList8 = org.telegram.ui.web.d1.e;
                if (arrayList8 != null) {
                    int size2 = arrayList8.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList8.get(i13);
                        i13++;
                        ((Utilities.Callback) obj4).run(arrayList7);
                    }
                    org.telegram.ui.web.d1.e = null;
                    return;
                }
                return;
            case 24:
                org.telegram.ui.web.g1 g1Var = ((org.telegram.ui.web.f1) obj2).h;
                ArrayList arrayList9 = g1Var.f38701f;
                arrayList9.clear();
                arrayList9.addAll((ArrayList) obj);
                g1Var.h = false;
                org.telegram.ui.Components.x51 x51Var = g1Var.f30163a;
                if (x51Var != null) {
                    x51Var.Y2.N(true);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) obj2;
                if (((org.telegram.ui.web.f2) obj).b() != null) {
                    z10 = true;
                }
                f1Var.setEnabled(z10);
                ViewPropertyAnimator animate = f1Var.animate();
                if (!f1Var.isEnabled()) {
                    f7 = 0.5f;
                }
                animate.alpha(f7);
                return;
            case 26:
                ((l0) obj2).f38854f0.run((Integer) obj);
                return;
            case 27:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) obj2;
                y1Var.getMessagesController().removeWebBrowserException((String) obj);
                y1Var.f30163a.Y2.N(true);
                return;
            case 28:
                org.telegram.ui.web.f2 f2Var = (org.telegram.ui.web.f2) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i18 = f2Var.f38690a;
                f2Var.f38694g = true;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    MessagesController.getInstance(i18).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i18).putChats(tL_messages_webPage.chats, false);
                    f2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject2 instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            f2Var.h = tL_webPage;
                        }
                    }
                    f2Var.h = null;
                }
                TLRPC.WebPage webPage = f2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    f2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && f2Var.h != null && (t0Var = f2Var.f38698l) != null) {
                    t0Var.run();
                }
                f2Var.c();
                return;
            default:
                ((org.telegram.ui.web.f2) obj2).f38699m.remove((hb1) obj);
                return;
        }
    }
}
