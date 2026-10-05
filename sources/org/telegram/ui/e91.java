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
public final class e91 implements Runnable {
    public final int f35987a;
    public final Object f35988b;
    public final Object f35989c;

    public e91(int i10, Object obj, Object obj2) {
        this.f35987a = i10;
        this.f35988b = obj;
        this.f35989c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.il0 il0Var;
        int i10;
        int i11;
        org.telegram.ui.web.c1 c1Var;
        org.telegram.ui.web.h0 h0Var;
        int i12 = this.f35987a;
        float f7 = 1.0f;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        Object obj = this.f35989c;
        Object obj2 = this.f35988b;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                new k91(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getResourceProvider(), (qc) obj).show();
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
                org.telegram.ui.ActionBar.i6.f21173w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.i6.f21173w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.i6.f21190x), Double.valueOf(org.telegram.ui.ActionBar.i6.f21208y));
                }
                org.telegram.ui.ActionBar.i6.q1();
                org.telegram.ui.Components.zl0 zl0Var = themeActivity2.f34541b;
                if (zl0Var != null && (il0Var = (org.telegram.ui.Components.il0) zl0Var.K(themeActivity2.Y)) != null) {
                    View view2 = il0Var.f46538a;
                    if (view2 instanceof org.telegram.ui.Cells.ea) {
                        ((org.telegram.ui.Cells.ea) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.i6.f21173w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                pd1 pd1Var = (pd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (pd1Var.f39525n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    pd1Var.A0.f(pd1Var.K0[0], true);
                    return;
                }
                return;
            case 5:
                ud1.W((ud1) obj2, (String) obj);
                return;
            case 6:
                ud1.T((ud1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 7:
                ee1 ee1Var = (ee1) obj2;
                ee1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                ee1Var.c(true);
                return;
            case 8:
                ee1 ee1Var2 = (ee1) obj2;
                ee1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                ee1Var2.c(true);
                return;
            case 9:
                cf1 cf1Var = (cf1) obj2;
                cf1Var.getClass();
                Bundle bundle = new Bundle();
                wf1 wf1Var = cf1Var.f35444b;
                bundle.putLong("dialog_id", -wf1Var.f42467a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f20099id);
                wf1Var.presentFragment(new p11(bundle, null));
                return;
            case 10:
                sf1 sf1Var = (sf1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = sf1Var.f40473e0;
                wf1 wf1Var2 = sf1Var.f40489v0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = wf1Var2.f42470b;
                    if (i15 < arrayList3.size()) {
                        if (((nf1) arrayList3.get(i15)).f38956c != null && ((nf1) arrayList3.get(i15)).f38956c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((nf1) arrayList3.get(i15)).f38956c);
                            ((nf1) arrayList3.get(i15)).f38956c.searchQuery = lowerCase;
                        }
                        i15++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        sf1Var.N();
                        if (!arrayList.isEmpty()) {
                            sf1Var.f40481n0 = false;
                            sf1Var.f40484q0.b(0);
                        }
                        sf1Var.L(str2);
                        return;
                    }
                }
                break;
            case 11:
                zf1 zf1Var = ((yf1) obj2).f43220b;
                zf1Var.f43771a.f35455e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f20099id));
                zf1Var.f43771a.T();
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
                zg1.g0((zg1) obj2, (String) obj);
                return;
            case 16:
                Runnable runnable = (Runnable) obj;
                for (es esVar : ((zg1) obj2).f43794w.f35541f) {
                    esVar.l(0.0f);
                }
                runnable.run();
                return;
            case 17:
                gh1 gh1Var = (gh1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = gh1Var.f36679f;
                ArrayList<TLRPC.Chat> arrayList5 = gh1Var.f36678e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(gh1Var.f36675a).putChats(arrayList5, false);
                gh1Var.d = false;
                gh1Var.f36677c = true;
                int size = arrayList4.size();
                while (i14 < size) {
                    Object obj3 = arrayList4.get(i14);
                    i14++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 18:
                ki1 ki1Var = (ki1) obj2;
                ki1Var.U.a(new th1(ki1Var, (VoIPService) obj, 1), true);
                return;
            case 19:
                ki1 ki1Var2 = (ki1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.n2.T = false;
                org.telegram.ui.Components.voip.n2.i();
                ViewPropertyAnimator duration = ki1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.f31215f;
                duration.setInterpolator(trVar).start();
                ki1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(trVar).start();
                ki1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(trVar).start();
                ki1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(trVar).start();
                ki1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(trVar).start();
                ki1Var2.f38041j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(trVar).start();
                ki1Var2.f38037h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(trVar).start();
                ki1Var2.f38039i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(trVar).start();
                ki1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(trVar).start();
                valueAnimator.addListener(new yh1(ki1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(trVar);
                valueAnimator.start();
                return;
            case 20:
                ti1 ti1Var = (ti1) obj2;
                int[] iArr = (int[]) obj;
                ti1Var.getClass();
                int i16 = iArr[0] - 1;
                iArr[0] = i16;
                if (i16 == 0) {
                    WallpapersListActivity wallpapersListActivity = ti1Var.f40925a;
                    int[][] iArr2 = WallpapersListActivity.f34613i0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 21:
                zi1 zi1Var = (zi1) obj2;
                String str3 = (String) obj;
                zi1Var.d.clear();
                zi1Var.f43839e.clear();
                zi1Var.f43840f = true;
                zi1Var.F(str3, "", true);
                zi1Var.h = str3;
                zi1Var.l();
                zi1Var.f43846y = null;
                return;
            case 22:
                zi1 zi1Var2 = (zi1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = zi1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = zi1Var2.f43845x;
                zi1Var2.f43845x = null;
                zi1Var2.F(str4, "", false);
                return;
            case 23:
                String str5 = (String) obj;
                fj1 fj1Var = ((ej1) obj2).f36064a;
                Activity parentActivity = fj1Var.getParentActivity();
                MessageObject messageObject = fj1Var.f36350n;
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
                    fj1Var.showDialog(org.telegram.ui.Components.br0.K0(fj1Var.getParentActivity(), messageObject, null, false, fj1Var.h));
                    return;
                }
                return;
            case 24:
                org.telegram.ui.web.c1 c1Var2 = (org.telegram.ui.web.c1) obj2;
                ei.s sVar = c1Var2.f42152j0;
                sVar.f9319f = true;
                sVar.k();
                c1Var2.w((ai.da) obj);
                return;
            case 25:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (c1Var = botWebViewContainer$BotWebViewProxy.f42101a) != null && (h0Var = c1Var.f42142c) != null) {
                    h0Var.f(arrayList6);
                    return;
                }
                return;
            case 26:
                ArrayList arrayList7 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.e1.f42194c.addAll(0, arrayList7);
                for (int i17 = 0; i17 < longSparseArray.size(); i17++) {
                    org.telegram.ui.web.e1.d.put(longSparseArray.keyAt(i17), (org.telegram.ui.web.d1) longSparseArray.valueAt(i17));
                }
                org.telegram.ui.web.e1.f42193b = true;
                org.telegram.ui.web.e1.f42192a = false;
                ArrayList arrayList8 = org.telegram.ui.web.e1.f42195e;
                if (arrayList8 != null) {
                    int size2 = arrayList8.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList8.get(i13);
                        i13++;
                        ((Utilities.Callback) obj4).run(arrayList7);
                    }
                    org.telegram.ui.web.e1.f42195e = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.web.h1 h1Var = ((org.telegram.ui.web.g1) obj2).h;
                ArrayList arrayList9 = h1Var.h;
                arrayList9.clear();
                arrayList9.addAll((ArrayList) obj);
                h1Var.f42219n = false;
                org.telegram.ui.Components.y61 y61Var = h1Var.f33438a;
                if (y61Var != null) {
                    y61Var.f26034f3.N(true);
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
                ((l0) obj2).f42394f0.run((Integer) obj);
                return;
        }
    }
}
