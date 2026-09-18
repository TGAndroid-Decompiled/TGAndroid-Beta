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
public final class qb1 implements Runnable {
    public final int f36890a;
    public final Object f36891b;
    public final Object f36892c;

    public qb1(int i10, Object obj, Object obj2) {
        this.f36890a = i10;
        this.f36891b = obj;
        this.f36892c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.wk0 wk0Var;
        int i10;
        int i11;
        org.telegram.ui.web.d1 d1Var;
        org.telegram.ui.web.h0 h0Var;
        org.telegram.ui.web.u0 u0Var;
        int i12 = this.f36890a;
        float f7 = 1.0f;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        Object obj = this.f36892c;
        Object obj2 = this.f36891b;
        switch (i12) {
            case 0:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity.getClass();
                org.telegram.ui.ActionBar.j6.f19204w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.j6.f19204w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.j6.f19221x), Double.valueOf(org.telegram.ui.ActionBar.j6.f19239y));
                }
                org.telegram.ui.ActionBar.j6.q1();
                org.telegram.ui.Components.ml0 ml0Var = themeActivity.f31568b;
                if (ml0Var != null && (wk0Var = (org.telegram.ui.Components.wk0) ml0Var.L(themeActivity.Y)) != null) {
                    View view = wk0Var.f42702a;
                    if (view instanceof org.telegram.ui.Cells.ea) {
                        ((org.telegram.ui.Cells.ea) view).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.j6.f19204w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                xd1 xd1Var = (xd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (xd1Var.f39573n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    xd1Var.A0.f(xd1Var.K0[0], true);
                    return;
                }
                return;
            case 2:
                ce1.X((ce1) obj2, (String) obj);
                return;
            case 3:
                ce1.V((ce1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 4:
                me1 me1Var = (me1) obj2;
                me1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                me1Var.c(true);
                return;
            case 5:
                me1 me1Var2 = (me1) obj2;
                me1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                me1Var2.c(true);
                return;
            case 6:
                lf1 lf1Var = (lf1) obj2;
                lf1Var.getClass();
                Bundle bundle = new Bundle();
                fg1 fg1Var = lf1Var.f35544b;
                bundle.putLong("dialog_id", -fg1Var.f33640a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f18173id);
                fg1Var.presentFragment(new y11(bundle, null));
                return;
            case 7:
                bg1 bg1Var = (bg1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = bg1Var.f32164d0;
                fg1 fg1Var2 = bg1Var.f32180u0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = fg1Var2.f33643b;
                    if (i15 < arrayList3.size()) {
                        if (((wf1) arrayList3.get(i15)).f39031c != null && ((wf1) arrayList3.get(i15)).f39031c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((wf1) arrayList3.get(i15)).f39031c);
                            ((wf1) arrayList3.get(i15)).f39031c.searchQuery = lowerCase;
                        }
                        i15++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        bg1Var.M();
                        if (!arrayList.isEmpty()) {
                            bg1Var.m0 = false;
                            bg1Var.f32175p0.b(0);
                        }
                        bg1Var.K(str2);
                        return;
                    }
                }
                break;
            case 8:
                ig1 ig1Var = ((hg1) obj2).f34275b;
                ig1Var.f34569a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f18173id));
                ig1Var.f34569a.V();
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
                ih1.g0((ih1) obj2, (String) obj);
                return;
            case 13:
                Runnable runnable = (Runnable) obj;
                for (is isVar : ((ih1) obj2).f34593w.f33753f) {
                    isVar.l(0.0f);
                }
                runnable.run();
                return;
            case 14:
                ph1 ph1Var = (ph1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = ph1Var.f36641f;
                ArrayList<TLRPC.Chat> arrayList5 = ph1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(ph1Var.f36638a).putChats(arrayList5, false);
                ph1Var.d = false;
                ph1Var.f36640c = true;
                int size = arrayList4.size();
                while (i14 < size) {
                    Object obj3 = arrayList4.get(i14);
                    i14++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 15:
                ti1 ti1Var = (ti1) obj2;
                ti1Var.U.a(new ci1(ti1Var, (VoIPService) obj, 1), true);
                return;
            case 16:
                ti1 ti1Var2 = (ti1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.m2.T = false;
                org.telegram.ui.Components.voip.m2.i();
                ViewPropertyAnimator duration = ti1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27383f;
                duration.setInterpolator(qrVar).start();
                ti1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.f37783j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.f37779h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                ti1Var2.f37781i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                ti1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                valueAnimator.addListener(new hi1(ti1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(qrVar);
                valueAnimator.start();
                return;
            case 17:
                cj1 cj1Var = (cj1) obj2;
                int[] iArr = (int[]) obj;
                cj1Var.getClass();
                int i16 = iArr[0] - 1;
                iArr[0] = i16;
                if (i16 == 0) {
                    WallpapersListActivity wallpapersListActivity = cj1Var.f32824a;
                    int[][] iArr2 = WallpapersListActivity.f31635i0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 18:
                ij1 ij1Var = (ij1) obj2;
                String str3 = (String) obj;
                ij1Var.d.clear();
                ij1Var.e.clear();
                ij1Var.f34612f = true;
                ij1Var.F(str3, "", true);
                ij1Var.h = str3;
                ij1Var.l();
                ij1Var.f34618y = null;
                return;
            case 19:
                ij1 ij1Var2 = (ij1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = ij1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = ij1Var2.f34617x;
                ij1Var2.f34617x = null;
                ij1Var2.F(str4, "", false);
                return;
            case 20:
                String str5 = (String) obj;
                oj1 oj1Var = ((nj1) obj2).f36124a;
                Activity parentActivity = oj1Var.getParentActivity();
                MessageObject messageObject = oj1Var.f36375n;
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
                    oj1Var.showDialog(org.telegram.ui.Components.iq0.N0(oj1Var.getParentActivity(), messageObject, null, false, oj1Var.h));
                    return;
                }
                return;
            case 21:
                org.telegram.ui.web.d1 d1Var2 = (org.telegram.ui.web.d1) obj2;
                ei.r rVar = d1Var2.f38754j0;
                rVar.f8581f = true;
                rVar.k();
                d1Var2.w((ai.da) obj);
                return;
            case 22:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (d1Var = botWebViewContainer$BotWebViewProxy.f38703a) != null && (h0Var = d1Var.f38745c) != null) {
                    h0Var.f(arrayList6);
                    return;
                }
                return;
            case 23:
                ArrayList arrayList7 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.f1.f38792c.addAll(0, arrayList7);
                for (int i17 = 0; i17 < longSparseArray.size(); i17++) {
                    org.telegram.ui.web.f1.d.put(longSparseArray.keyAt(i17), (org.telegram.ui.web.e1) longSparseArray.valueAt(i17));
                }
                org.telegram.ui.web.f1.f38791b = true;
                org.telegram.ui.web.f1.f38790a = false;
                ArrayList arrayList8 = org.telegram.ui.web.f1.e;
                if (arrayList8 != null) {
                    int size2 = arrayList8.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList8.get(i13);
                        i13++;
                        ((Utilities.Callback) obj4).run(arrayList7);
                    }
                    org.telegram.ui.web.f1.e = null;
                    return;
                }
                return;
            case 24:
                org.telegram.ui.web.h1 h1Var = ((org.telegram.ui.web.g1) obj2).h;
                ArrayList arrayList9 = h1Var.h;
                arrayList9.clear();
                arrayList9.addAll((ArrayList) obj);
                h1Var.f38816n = false;
                org.telegram.ui.Components.z51 z51Var = h1Var.f22336a;
                if (z51Var != null) {
                    z51Var.Y2.N(true);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj2;
                if (((org.telegram.ui.web.g2) obj).b() != null) {
                    z10 = true;
                }
                g1Var.setEnabled(z10);
                ViewPropertyAnimator animate = g1Var.animate();
                if (!g1Var.isEnabled()) {
                    f7 = 0.5f;
                }
                animate.alpha(f7);
                return;
            case 26:
                ((k0) obj2).f38963f0.run((Integer) obj);
                return;
            case 27:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) obj2;
                z1Var.getMessagesController().removeWebBrowserException((String) obj);
                z1Var.f22336a.Y2.N(true);
                return;
            case 28:
                org.telegram.ui.web.g2 g2Var = (org.telegram.ui.web.g2) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i18 = g2Var.f38797a;
                g2Var.f38801g = true;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    MessagesController.getInstance(i18).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i18).putChats(tL_messages_webPage.chats, false);
                    g2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject2 instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            g2Var.h = tL_webPage;
                        }
                    }
                    g2Var.h = null;
                }
                TLRPC.WebPage webPage = g2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    g2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && g2Var.h != null && (u0Var = g2Var.f38805l) != null) {
                    u0Var.run();
                }
                g2Var.c();
                return;
            default:
                ((org.telegram.ui.web.g2) obj2).f38806m.remove((qb1) obj);
                return;
        }
    }
}
