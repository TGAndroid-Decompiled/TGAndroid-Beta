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
public final class fb1 implements Runnable {
    public final int f33473a;
    public final Object f33474b;
    public final Object f33475c;

    public fb1(int i10, Object obj, Object obj2) {
        this.f33473a = i10;
        this.f33474b = obj;
        this.f33475c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.il0 il0Var;
        int i10;
        int i11;
        org.telegram.ui.web.c1 c1Var;
        org.telegram.ui.web.h0 h0Var;
        org.telegram.ui.web.u0 u0Var;
        int i12 = this.f33473a;
        float f7 = 1.0f;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        Object obj = this.f33475c;
        Object obj2 = this.f33474b;
        switch (i12) {
            case 0:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            case 1:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.i6.f19401w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.i6.f19401w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.i6.f19418x), Double.valueOf(org.telegram.ui.ActionBar.i6.f19436y));
                }
                org.telegram.ui.ActionBar.i6.q1();
                org.telegram.ui.Components.yl0 yl0Var = themeActivity2.f31839b;
                if (yl0Var != null && (il0Var = (org.telegram.ui.Components.il0) yl0Var.L(themeActivity2.Y)) != null) {
                    View view2 = il0Var.f43005a;
                    if (view2 instanceof org.telegram.ui.Cells.ea) {
                        ((org.telegram.ui.Cells.ea) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.i6.f19401w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                pd1 pd1Var = (pd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (pd1Var.f36427n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    pd1Var.A0.f(pd1Var.K0[0], true);
                    return;
                }
                return;
            case 3:
                ud1.X((ud1) obj2, (String) obj);
                return;
            case 4:
                ud1.V((ud1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 5:
                ee1 ee1Var = (ee1) obj2;
                ee1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                ee1Var.c(true);
                return;
            case 6:
                ee1 ee1Var2 = (ee1) obj2;
                ee1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                ee1Var2.c(true);
                return;
            case 7:
                cf1 cf1Var = (cf1) obj2;
                cf1Var.getClass();
                Bundle bundle = new Bundle();
                wf1 wf1Var = cf1Var.f32705b;
                bundle.putLong("dialog_id", -wf1Var.f39287a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f18381id);
                wf1Var.presentFragment(new p11(bundle, null));
                return;
            case 8:
                sf1 sf1Var = (sf1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = sf1Var.f37428d0;
                wf1 wf1Var2 = sf1Var.f37444u0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = wf1Var2.f39290b;
                    if (i15 < arrayList3.size()) {
                        if (((nf1) arrayList3.get(i15)).f35983c != null && ((nf1) arrayList3.get(i15)).f35983c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((nf1) arrayList3.get(i15)).f35983c);
                            ((nf1) arrayList3.get(i15)).f35983c.searchQuery = lowerCase;
                        }
                        i15++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        sf1Var.M();
                        if (!arrayList.isEmpty()) {
                            sf1Var.m0 = false;
                            sf1Var.f37439p0.b(0);
                        }
                        sf1Var.K(str2);
                        return;
                    }
                }
                break;
            case 9:
                zf1 zf1Var = ((yf1) obj2).f40208b;
                zf1Var.f40497a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f18381id));
                zf1Var.f40497a.V();
                return;
            case 10:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 11:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 12:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                return;
            case 13:
                zg1.g0((zg1) obj2, (String) obj);
                return;
            case 14:
                Runnable runnable = (Runnable) obj;
                for (ds dsVar : ((zg1) obj2).f40521w.f32431f) {
                    dsVar.l(0.0f);
                }
                runnable.run();
                return;
            case 15:
                gh1 gh1Var = (gh1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = gh1Var.f33938f;
                ArrayList<TLRPC.Chat> arrayList5 = gh1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(gh1Var.f33935a).putChats(arrayList5, false);
                gh1Var.d = false;
                gh1Var.f33937c = true;
                int size = arrayList4.size();
                while (i14 < size) {
                    Object obj3 = arrayList4.get(i14);
                    i14++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 16:
                ki1 ki1Var = (ki1) obj2;
                ki1Var.U.a(new th1(ki1Var, (VoIPService) obj, 1), true);
                return;
            case 17:
                ki1 ki1Var2 = (ki1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.n2.T = false;
                org.telegram.ui.Components.voip.n2.i();
                ViewPropertyAnimator duration = ki1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.sr srVar = org.telegram.ui.Components.sr.f28359f;
                duration.setInterpolator(srVar).start();
                ki1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(srVar).start();
                ki1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(srVar).start();
                ki1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(srVar).start();
                ki1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(srVar).start();
                ki1Var2.f35066j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(srVar).start();
                ki1Var2.f35062h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(srVar).start();
                ki1Var2.f35064i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(srVar).start();
                ki1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(srVar).start();
                valueAnimator.addListener(new yh1(ki1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(srVar);
                valueAnimator.start();
                return;
            case 18:
                ti1 ti1Var = (ti1) obj2;
                int[] iArr = (int[]) obj;
                ti1Var.getClass();
                int i16 = iArr[0] - 1;
                iArr[0] = i16;
                if (i16 == 0) {
                    WallpapersListActivity wallpapersListActivity = ti1Var.f37828a;
                    int[][] iArr2 = WallpapersListActivity.f31906i0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 19:
                zi1 zi1Var = (zi1) obj2;
                String str3 = (String) obj;
                zi1Var.d.clear();
                zi1Var.e.clear();
                zi1Var.f40537f = true;
                zi1Var.F(str3, "", true);
                zi1Var.h = str3;
                zi1Var.l();
                zi1Var.f40543y = null;
                return;
            case 20:
                zi1 zi1Var2 = (zi1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = zi1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = zi1Var2.f40542x;
                zi1Var2.f40542x = null;
                zi1Var2.F(str4, "", false);
                return;
            case 21:
                String str5 = (String) obj;
                fj1 fj1Var = ((ej1) obj2).f33277a;
                Activity parentActivity = fj1Var.getParentActivity();
                MessageObject messageObject = fj1Var.f33579n;
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
                    fj1Var.showDialog(org.telegram.ui.Components.vq0.K0(fj1Var.getParentActivity(), messageObject, null, false, fj1Var.h));
                    return;
                }
                return;
            case 22:
                org.telegram.ui.web.c1 c1Var2 = (org.telegram.ui.web.c1) obj2;
                ei.r rVar = c1Var2.f38971j0;
                rVar.f8566f = true;
                rVar.k();
                c1Var2.w((ai.da) obj);
                return;
            case 23:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (c1Var = botWebViewContainer$BotWebViewProxy.f38927a) != null && (h0Var = c1Var.f38962c) != null) {
                    h0Var.f(arrayList6);
                    return;
                }
                return;
            case 24:
                ArrayList arrayList7 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.e1.f39008c.addAll(0, arrayList7);
                for (int i17 = 0; i17 < longSparseArray.size(); i17++) {
                    org.telegram.ui.web.e1.d.put(longSparseArray.keyAt(i17), (org.telegram.ui.web.d1) longSparseArray.valueAt(i17));
                }
                org.telegram.ui.web.e1.f39007b = true;
                org.telegram.ui.web.e1.f39006a = false;
                ArrayList arrayList8 = org.telegram.ui.web.e1.e;
                if (arrayList8 != null) {
                    int size2 = arrayList8.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList8.get(i13);
                        i13++;
                        ((Utilities.Callback) obj4).run(arrayList7);
                    }
                    org.telegram.ui.web.e1.e = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.web.h1 h1Var = ((org.telegram.ui.web.g1) obj2).h;
                ArrayList arrayList9 = h1Var.h;
                arrayList9.clear();
                arrayList9.addAll((ArrayList) obj);
                h1Var.f39030n = false;
                org.telegram.ui.Components.n61 n61Var = h1Var.f27008a;
                if (n61Var != null) {
                    n61Var.Y2.N(true);
                    return;
                }
                return;
            case 26:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj2;
                if (((org.telegram.ui.web.h2) obj).b() != null) {
                    z10 = true;
                }
                g1Var.setEnabled(z10);
                ViewPropertyAnimator animate = g1Var.animate();
                if (!g1Var.isEnabled()) {
                    f7 = 0.5f;
                }
                animate.alpha(f7);
                return;
            case 27:
                ((m0) obj2).f39190f0.run((Integer) obj);
                return;
            case 28:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) obj2;
                z1Var.getMessagesController().removeWebBrowserException((String) obj);
                z1Var.f27008a.Y2.N(true);
                return;
            default:
                org.telegram.ui.web.h2 h2Var = (org.telegram.ui.web.h2) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i18 = h2Var.f39035a;
                h2Var.f39039g = true;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    MessagesController.getInstance(i18).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i18).putChats(tL_messages_webPage.chats, false);
                    h2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject2 instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            h2Var.h = tL_webPage;
                        }
                    }
                    h2Var.h = null;
                }
                TLRPC.WebPage webPage = h2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    h2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && h2Var.h != null && (u0Var = h2Var.f39043l) != null) {
                    u0Var.run();
                }
                h2Var.c();
                return;
        }
    }
}
