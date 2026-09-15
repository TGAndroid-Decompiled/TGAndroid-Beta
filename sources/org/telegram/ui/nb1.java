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
public final class nb1 implements Runnable {
    public final int f35939a;
    public final Object f35940b;
    public final Object f35941c;

    public nb1(int i10, Object obj, Object obj2) {
        this.f35939a = i10;
        this.f35940b = obj;
        this.f35941c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.vk0 vk0Var;
        int i10;
        int i11;
        org.telegram.ui.web.d1 d1Var;
        org.telegram.ui.web.h0 h0Var;
        org.telegram.ui.web.u0 u0Var;
        int i12 = this.f35939a;
        float f7 = 1.0f;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        Object obj = this.f35941c;
        Object obj2 = this.f35940b;
        switch (i12) {
            case 0:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity.getClass();
                org.telegram.ui.ActionBar.i6.f19177w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.i6.f19177w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.i6.f19194x), Double.valueOf(org.telegram.ui.ActionBar.i6.f19212y));
                }
                org.telegram.ui.ActionBar.i6.q1();
                org.telegram.ui.Components.ll0 ll0Var = themeActivity.f31551b;
                if (ll0Var != null && (vk0Var = (org.telegram.ui.Components.vk0) ll0Var.K(themeActivity.Y)) != null) {
                    View view = vk0Var.f42675a;
                    if (view instanceof org.telegram.ui.Cells.ea) {
                        ((org.telegram.ui.Cells.ea) view).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.i6.f19177w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                vd1 vd1Var = (vd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (vd1Var.f38550n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    vd1Var.A0.f(vd1Var.K0[0], true);
                    return;
                }
                return;
            case 2:
                ae1.X((ae1) obj2, (String) obj);
                return;
            case 3:
                ae1.V((ae1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 4:
                ke1 ke1Var = (ke1) obj2;
                ke1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                ke1Var.c(true);
                return;
            case 5:
                ke1 ke1Var2 = (ke1) obj2;
                ke1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                ke1Var2.c(true);
                return;
            case 6:
                jf1 jf1Var = (jf1) obj2;
                jf1Var.getClass();
                Bundle bundle = new Bundle();
                dg1 dg1Var = jf1Var.f34895b;
                bundle.putLong("dialog_id", -dg1Var.f33012a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f18164id);
                dg1Var.presentFragment(new w11(bundle, null));
                return;
            case 7:
                zf1 zf1Var = (zf1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = zf1Var.f40191c0;
                dg1 dg1Var2 = zf1Var.f40207t0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = dg1Var2.f33015b;
                    if (i15 < arrayList3.size()) {
                        if (((uf1) arrayList3.get(i15)).f37995c != null && ((uf1) arrayList3.get(i15)).f37995c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((uf1) arrayList3.get(i15)).f37995c);
                            ((uf1) arrayList3.get(i15)).f37995c.searchQuery = lowerCase;
                        }
                        i15++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        zf1Var.L();
                        if (!arrayList.isEmpty()) {
                            zf1Var.f40200l0 = false;
                            zf1Var.f40202o0.b(0);
                        }
                        zf1Var.J(str2);
                        return;
                    }
                }
                break;
            case 8:
                gg1 gg1Var = ((fg1) obj2).f33574b;
                gg1Var.f33901a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f18164id));
                gg1Var.f33901a.V();
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
                gh1.g0((gh1) obj2, (String) obj);
                return;
            case 13:
                Runnable runnable = (Runnable) obj;
                for (gs gsVar : ((gh1) obj2).f33925w.f33120f) {
                    gsVar.l(0.0f);
                }
                runnable.run();
                return;
            case 14:
                nh1 nh1Var = (nh1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = nh1Var.f35987f;
                ArrayList<TLRPC.Chat> arrayList5 = nh1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(nh1Var.f35984a).putChats(arrayList5, false);
                nh1Var.d = false;
                nh1Var.f35986c = true;
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
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27423f;
                duration.setInterpolator(qrVar).start();
                ti1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.f37715j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.f37711h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                ti1Var2.f37713i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
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
                    WallpapersListActivity wallpapersListActivity = cj1Var.f32807a;
                    int[][] iArr2 = WallpapersListActivity.f31618j0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 18:
                ij1 ij1Var = (ij1) obj2;
                String str3 = (String) obj;
                ij1Var.d.clear();
                ij1Var.e.clear();
                ij1Var.f34693f = true;
                ij1Var.F(str3, "", true);
                ij1Var.h = str3;
                ij1Var.l();
                ij1Var.f34699y = null;
                return;
            case 19:
                ij1 ij1Var2 = (ij1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = ij1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = ij1Var2.f34698x;
                ij1Var2.f34698x = null;
                ij1Var2.F(str4, "", false);
                return;
            case 20:
                String str5 = (String) obj;
                oj1 oj1Var = ((nj1) obj2).f35994a;
                Activity parentActivity = oj1Var.getParentActivity();
                MessageObject messageObject = oj1Var.f36239n;
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
                    oj1Var.showDialog(org.telegram.ui.Components.hq0.N0(oj1Var.getParentActivity(), messageObject, null, false, oj1Var.h));
                    return;
                }
                return;
            case 21:
                org.telegram.ui.web.d1 d1Var2 = (org.telegram.ui.web.d1) obj2;
                ei.r rVar = d1Var2.f38906j0;
                rVar.f8576f = true;
                rVar.k();
                d1Var2.w((ai.da) obj);
                return;
            case 22:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (d1Var = botWebViewContainer$BotWebViewProxy.f38855a) != null && (h0Var = d1Var.f38897c) != null) {
                    h0Var.f(arrayList6);
                    return;
                }
                return;
            case 23:
                ArrayList arrayList7 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.f1.f38944c.addAll(0, arrayList7);
                for (int i17 = 0; i17 < longSparseArray.size(); i17++) {
                    org.telegram.ui.web.f1.d.put(longSparseArray.keyAt(i17), (org.telegram.ui.web.e1) longSparseArray.valueAt(i17));
                }
                org.telegram.ui.web.f1.f38943b = true;
                org.telegram.ui.web.f1.f38942a = false;
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
                h1Var.f38968n = false;
                org.telegram.ui.Components.y51 y51Var = h1Var.f30485a;
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
                ((k0) obj2).f39115f0.run((Integer) obj);
                return;
            case 27:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) obj2;
                z1Var.getMessagesController().removeWebBrowserException((String) obj);
                z1Var.f30485a.Y2.N(true);
                return;
            case 28:
                org.telegram.ui.web.g2 g2Var = (org.telegram.ui.web.g2) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i18 = g2Var.f38949a;
                g2Var.f38953g = true;
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
                if (!SharedConfig.onlyLocalInstantView && g2Var.h != null && (u0Var = g2Var.f38957l) != null) {
                    u0Var.run();
                }
                g2Var.c();
                return;
            default:
                ((org.telegram.ui.web.g2) obj2).f38958m.remove((nb1) obj);
                return;
        }
    }
}
