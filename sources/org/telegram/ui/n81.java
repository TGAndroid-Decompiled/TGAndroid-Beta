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
public final class n81 implements Runnable {
    public final int f35755a;
    public final Object f35756b;
    public final Object f35757c;

    public n81(int i10, Object obj, Object obj2) {
        this.f35755a = i10;
        this.f35756b = obj;
        this.f35757c = obj2;
    }

    @Override
    public final void run() {
        long j3;
        org.telegram.ui.Components.gl0 gl0Var;
        int i10;
        int i11;
        org.telegram.ui.web.b1 b1Var;
        org.telegram.ui.web.g0 g0Var;
        int i12 = this.f35755a;
        int i13 = 0;
        Object obj = this.f35757c;
        Object obj2 = this.f35756b;
        switch (i12) {
            case 0:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.yc.a0((z81) obj2).k(false).j();
                return;
            case 1:
                z81.W((z81) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 2:
                s81 s81Var = (s81) obj2;
                a0.i iVar = (a0.i) obj;
                z81 z81Var = s81Var.f37611b1;
                Activity parentActivity = z81Var.getParentActivity();
                w8 w8Var = z81Var.f40394b;
                int m10 = iVar.m();
                if (iVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar.n(0)).f18325id;
                } else {
                    j3 = 0;
                }
                org.telegram.ui.Components.yc.x(parentActivity, w8Var, m10, j3, s81Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), s81Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                return;
            case 3:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                new k91(m2Var.getContext(), m2Var.getCurrentAccount(), m2Var.getResourceProvider(), (oc) obj).show();
                return;
            case 4:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.m8) obj);
                return;
            case 5:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.h6.f19387w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.h6.f19387w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.h6.f19404x), Double.valueOf(org.telegram.ui.ActionBar.h6.f19422y));
                }
                org.telegram.ui.ActionBar.h6.q1();
                org.telegram.ui.Components.wl0 wl0Var = themeActivity2.f31823b;
                if (wl0Var != null && (gl0Var = (org.telegram.ui.Components.gl0) wl0Var.K(themeActivity2.Y)) != null) {
                    View view2 = gl0Var.f42946a;
                    if (view2 instanceof org.telegram.ui.Cells.ea) {
                        ((org.telegram.ui.Cells.ea) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.h6.f19387w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                od1 od1Var = (od1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (od1Var.f36165n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    od1Var.A0.f(od1Var.K0[0], true);
                    return;
                }
                return;
            case 8:
                td1.X((td1) obj2, (String) obj);
                return;
            case 9:
                td1.V((td1) obj2, (TLRPC.TL_theme) obj);
                return;
            case 10:
                de1 de1Var = (de1) obj2;
                de1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                de1Var.c(true);
                return;
            case 11:
                de1 de1Var2 = (de1) obj2;
                de1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                de1Var2.c(true);
                return;
            case 12:
                cf1 cf1Var = (cf1) obj2;
                cf1Var.getClass();
                Bundle bundle = new Bundle();
                wf1 wf1Var = cf1Var.f32696b;
                bundle.putLong("dialog_id", -wf1Var.f39293a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f18373id);
                wf1Var.presentFragment(new n11(bundle, null));
                return;
            case 13:
                sf1 sf1Var = (sf1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = sf1Var.f37722c0;
                wf1 wf1Var2 = sf1Var.f37738t0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i14 = 0;
                while (true) {
                    ArrayList arrayList3 = wf1Var2.f39296b;
                    if (i14 < arrayList3.size()) {
                        if (((nf1) arrayList3.get(i14)).f35860c != null && ((nf1) arrayList3.get(i14)).f35860c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((nf1) arrayList3.get(i14)).f35860c);
                            ((nf1) arrayList3.get(i14)).f35860c.searchQuery = lowerCase;
                        }
                        i14++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        sf1Var.L();
                        if (!arrayList.isEmpty()) {
                            sf1Var.f37731l0 = false;
                            sf1Var.f37733o0.b(0);
                        }
                        sf1Var.J(str2);
                        return;
                    }
                }
                break;
            case 14:
                zf1 zf1Var = ((yf1) obj2).f40128b;
                zf1Var.f40451a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f18373id));
                zf1Var.f40451a.V();
                return;
            case 15:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 16:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 17:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                return;
            case 18:
                zg1.g0((zg1) obj2, (String) obj);
                return;
            case 19:
                Runnable runnable = (Runnable) obj;
                as[] asVarArr = ((zg1) obj2).f40471w.f40221f;
                int length = asVarArr.length;
                while (i13 < length) {
                    asVarArr[i13].l(0.0f);
                    i13++;
                }
                runnable.run();
                return;
            case 20:
                gh1 gh1Var = (gh1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = gh1Var.f33933f;
                ArrayList<TLRPC.Chat> arrayList5 = gh1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(gh1Var.f33930a).putChats(arrayList5, false);
                gh1Var.d = false;
                gh1Var.f33932c = true;
                int size = arrayList4.size();
                while (i13 < size) {
                    Object obj3 = arrayList4.get(i13);
                    i13++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 21:
                mi1 mi1Var = (mi1) obj2;
                mi1Var.U.a(new vh1(mi1Var, (VoIPService) obj, 1), true);
                return;
            case 22:
                mi1 mi1Var2 = (mi1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.n2.T = false;
                org.telegram.ui.Components.voip.n2.i();
                ViewPropertyAnimator duration = mi1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f28022f;
                duration.setInterpolator(rrVar).start();
                mi1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar).start();
                mi1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar).start();
                mi1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar).start();
                mi1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar).start();
                mi1Var2.f35577j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar).start();
                mi1Var2.f35573h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(rrVar).start();
                mi1Var2.f35575i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(rrVar).start();
                mi1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(rrVar).start();
                valueAnimator.addListener(new ai1(mi1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(rrVar);
                valueAnimator.start();
                return;
            case 23:
                vi1 vi1Var = (vi1) obj2;
                int[] iArr = (int[]) obj;
                vi1Var.getClass();
                int i15 = iArr[0] - 1;
                iArr[0] = i15;
                if (i15 == 0) {
                    WallpapersListActivity wallpapersListActivity = vi1Var.f38745a;
                    int[][] iArr2 = WallpapersListActivity.f31890k0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 24:
                bj1 bj1Var = (bj1) obj2;
                String str3 = (String) obj;
                bj1Var.d.clear();
                bj1Var.e.clear();
                bj1Var.f32424f = true;
                bj1Var.F(str3, "", true);
                bj1Var.h = str3;
                bj1Var.l();
                bj1Var.f32430y = null;
                return;
            case 25:
                bj1 bj1Var2 = (bj1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = bj1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = bj1Var2.f32429x;
                bj1Var2.f32429x = null;
                bj1Var2.F(str4, "", false);
                return;
            case 26:
                String str5 = (String) obj;
                hj1 hj1Var = ((gj1) obj2).f33941a;
                Activity parentActivity2 = hj1Var.getParentActivity();
                MessageObject messageObject = hj1Var.f34226n;
                if (parentActivity2 != null) {
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
                    hj1Var.showDialog(org.telegram.ui.Components.uq0.N0(hj1Var.getParentActivity(), messageObject, null, false, hj1Var.h));
                    return;
                }
                return;
            case 27:
                org.telegram.ui.web.b1 b1Var2 = (org.telegram.ui.web.b1) obj2;
                ei.r rVar = b1Var2.f38995j0;
                rVar.f8563f = true;
                rVar.k();
                b1Var2.w((ai.da) obj);
                return;
            case 28:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (b1Var = botWebViewContainer$BotWebViewProxy.f38961a) != null && (g0Var = b1Var.f38986c) != null) {
                    g0Var.f(arrayList6);
                    return;
                }
                return;
            default:
                ArrayList arrayList7 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.d1.f39032c.addAll(0, arrayList7);
                for (int i16 = 0; i16 < longSparseArray.size(); i16++) {
                    org.telegram.ui.web.d1.d.put(longSparseArray.keyAt(i16), (org.telegram.ui.web.c1) longSparseArray.valueAt(i16));
                }
                org.telegram.ui.web.d1.f39031b = true;
                org.telegram.ui.web.d1.f39030a = false;
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
        }
    }

    public n81(s81 s81Var, a0.i iVar, int i10) {
        this.f35755a = 2;
        this.f35756b = s81Var;
        this.f35757c = iVar;
    }
}
