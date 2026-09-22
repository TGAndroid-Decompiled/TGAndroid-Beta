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
public final class pb1 implements Runnable {
    public final int f36529a;
    public final Object f36530b;
    public final Object f36531c;

    public pb1(int i10, Object obj, Object obj2) {
        this.f36529a = i10;
        this.f36530b = obj;
        this.f36531c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.vk0 vk0Var;
        int i10;
        int i11;
        org.telegram.ui.web.d1 d1Var;
        org.telegram.ui.web.h0 h0Var;
        org.telegram.ui.web.u0 u0Var;
        int i12 = this.f36529a;
        float f7 = 1.0f;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        Object obj = this.f36531c;
        Object obj2 = this.f36530b;
        switch (i12) {
            case 0:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity.getClass();
                org.telegram.ui.ActionBar.i6.f19174w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.i6.f19174w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.i6.f19191x), Double.valueOf(org.telegram.ui.ActionBar.i6.f19209y));
                }
                org.telegram.ui.ActionBar.i6.q1();
                org.telegram.ui.Components.ll0 ll0Var = themeActivity.f31548b;
                if (ll0Var != null && (vk0Var = (org.telegram.ui.Components.vk0) ll0Var.K(themeActivity.Y)) != null) {
                    View view = vk0Var.f42671a;
                    if (view instanceof org.telegram.ui.Cells.ea) {
                        ((org.telegram.ui.Cells.ea) view).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.i6.f19174w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                wd1 wd1Var = (wd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (wd1Var.f38823n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    wd1Var.A0.f(wd1Var.K0[0], true);
                    return;
                }
                return;
            case 2:
                be1.X((be1) obj2, (String) obj);
                return;
            case 3:
                be1.V((be1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 4:
                le1 le1Var = (le1) obj2;
                le1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                le1Var.c(true);
                return;
            case 5:
                le1 le1Var2 = (le1) obj2;
                le1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                le1Var2.c(true);
                return;
            case 6:
                kf1 kf1Var = (kf1) obj2;
                kf1Var.getClass();
                Bundle bundle = new Bundle();
                eg1 eg1Var = kf1Var.f35142b;
                bundle.putLong("dialog_id", -eg1Var.f33291a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f18161id);
                eg1Var.presentFragment(new x11(bundle, null));
                return;
            case 7:
                ag1 ag1Var = (ag1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ag1Var.f31807c0;
                eg1 eg1Var2 = ag1Var.f31823t0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = eg1Var2.f33294b;
                    if (i15 < arrayList3.size()) {
                        if (((vf1) arrayList3.get(i15)).f38528c != null && ((vf1) arrayList3.get(i15)).f38528c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((vf1) arrayList3.get(i15)).f38528c);
                            ((vf1) arrayList3.get(i15)).f38528c.searchQuery = lowerCase;
                        }
                        i15++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        ag1Var.L();
                        if (!arrayList.isEmpty()) {
                            ag1Var.f31816l0 = false;
                            ag1Var.f31818o0.b(0);
                        }
                        ag1Var.J(str2);
                        return;
                    }
                }
                break;
            case 8:
                hg1 hg1Var = ((gg1) obj2).f33852b;
                hg1Var.f34259a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f18161id));
                hg1Var.f34259a.V();
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
                hh1.g0((hh1) obj2, (String) obj);
                return;
            case 13:
                Runnable runnable = (Runnable) obj;
                for (gs gsVar : ((hh1) obj2).f34285w.f33081f) {
                    gsVar.l(0.0f);
                }
                runnable.run();
                return;
            case 14:
                oh1 oh1Var = (oh1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = oh1Var.f36230f;
                ArrayList<TLRPC.Chat> arrayList5 = oh1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(oh1Var.f36227a).putChats(arrayList5, false);
                oh1Var.d = false;
                oh1Var.f36229c = true;
                int size = arrayList4.size();
                while (i14 < size) {
                    Object obj3 = arrayList4.get(i14);
                    i14++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 15:
                ui1 ui1Var = (ui1) obj2;
                ui1Var.U.a(new di1(ui1Var, (VoIPService) obj, 1), true);
                return;
            case 16:
                ui1 ui1Var2 = (ui1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.m2.T = false;
                org.telegram.ui.Components.voip.m2.i();
                ViewPropertyAnimator duration = ui1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27420f;
                duration.setInterpolator(qrVar).start();
                ui1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ui1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ui1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ui1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ui1Var2.f38004j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ui1Var2.f38000h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                ui1Var2.f38002i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                ui1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                valueAnimator.addListener(new ii1(ui1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(qrVar);
                valueAnimator.start();
                return;
            case 17:
                dj1 dj1Var = (dj1) obj2;
                int[] iArr = (int[]) obj;
                dj1Var.getClass();
                int i16 = iArr[0] - 1;
                iArr[0] = i16;
                if (i16 == 0) {
                    WallpapersListActivity wallpapersListActivity = dj1Var.f33039a;
                    int[][] iArr2 = WallpapersListActivity.f31615k0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 18:
                jj1 jj1Var = (jj1) obj2;
                String str3 = (String) obj;
                jj1Var.d.clear();
                jj1Var.e.clear();
                jj1Var.f34938f = true;
                jj1Var.F(str3, "", true);
                jj1Var.h = str3;
                jj1Var.l();
                jj1Var.f34944y = null;
                return;
            case 19:
                jj1 jj1Var2 = (jj1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = jj1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = jj1Var2.f34943x;
                jj1Var2.f34943x = null;
                jj1Var2.F(str4, "", false);
                return;
            case 20:
                String str5 = (String) obj;
                pj1 pj1Var = ((oj1) obj2).f36244a;
                Activity parentActivity = pj1Var.getParentActivity();
                MessageObject messageObject = pj1Var.f36595n;
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
                    pj1Var.showDialog(org.telegram.ui.Components.hq0.N0(pj1Var.getParentActivity(), messageObject, null, false, pj1Var.h));
                    return;
                }
                return;
            case 21:
                org.telegram.ui.web.d1 d1Var2 = (org.telegram.ui.web.d1) obj2;
                ei.r rVar = d1Var2.f38912j0;
                rVar.f8578f = true;
                rVar.k();
                d1Var2.w((ai.da) obj);
                return;
            case 22:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (d1Var = botWebViewContainer$BotWebViewProxy.f38861a) != null && (h0Var = d1Var.f38903c) != null) {
                    h0Var.f(arrayList6);
                    return;
                }
                return;
            case 23:
                ArrayList arrayList7 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.f1.f38950c.addAll(0, arrayList7);
                for (int i17 = 0; i17 < longSparseArray.size(); i17++) {
                    org.telegram.ui.web.f1.d.put(longSparseArray.keyAt(i17), (org.telegram.ui.web.e1) longSparseArray.valueAt(i17));
                }
                org.telegram.ui.web.f1.f38949b = true;
                org.telegram.ui.web.f1.f38948a = false;
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
                ArrayList arrayList9 = h1Var.f38973f;
                arrayList9.clear();
                arrayList9.addAll((ArrayList) obj);
                h1Var.h = false;
                org.telegram.ui.Components.y51 y51Var = h1Var.f30482a;
                if (y51Var != null) {
                    y51Var.Y2.N(true);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) obj2;
                if (((org.telegram.ui.web.g2) obj).b() != null) {
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
                ((k0) obj2).f39119f0.run((Integer) obj);
                return;
            case 27:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) obj2;
                z1Var.getMessagesController().removeWebBrowserException((String) obj);
                z1Var.f30482a.Y2.N(true);
                return;
            case 28:
                org.telegram.ui.web.g2 g2Var = (org.telegram.ui.web.g2) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i18 = g2Var.f38955a;
                g2Var.f38959g = true;
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
                if (!SharedConfig.onlyLocalInstantView && g2Var.h != null && (u0Var = g2Var.f38963l) != null) {
                    u0Var.run();
                }
                g2Var.c();
                return;
            default:
                ((org.telegram.ui.web.g2) obj2).f38964m.remove((pb1) obj);
                return;
        }
    }
}
