package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
public final class bh1 implements Runnable {
    public final int f35537a;
    public final Object f35538b;
    public final Object f35539c;

    public bh1(int i10, Object obj, Object obj2) {
        this.f35537a = i10;
        this.f35538b = obj;
        this.f35539c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.web.a1 a1Var;
        org.telegram.ui.web.f0 f0Var;
        org.telegram.ui.web.s0 s0Var;
        float f10 = 1.0f;
        int i10 = 0;
        int i11 = 0;
        boolean z4 = false;
        int i12 = 0;
        switch (this.f35537a) {
            case 0:
                ch1 ch1Var = (ch1) this.f35538b;
                TLObject tLObject = (TLObject) this.f35539c;
                ArrayList arrayList = ch1Var.f35813f;
                ArrayList<TLRPC.Chat> arrayList2 = ch1Var.f35812e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(ch1Var.f35809a).putChats(arrayList2, false);
                ch1Var.d = false;
                ch1Var.f35811c = true;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((Runnable) obj).run();
                }
                arrayList.clear();
                return;
            case 1:
                ii1 ii1Var = (ii1) this.f35538b;
                ii1Var.R.a(new rh1(ii1Var, (VoIPService) this.f35539c, 1), true);
                return;
            case 2:
                ii1 ii1Var2 = (ii1) this.f35538b;
                ValueAnimator valueAnimator = (ValueAnimator) this.f35539c;
                org.telegram.ui.Components.voip.n2.Q = false;
                org.telegram.ui.Components.voip.n2.i();
                ViewPropertyAnimator duration = ii1Var2.H.animate().setDuration(150L);
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f30168f;
                duration.setInterpolator(prVar).start();
                ii1Var2.E.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ii1Var2.F.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ii1Var2.K.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ii1Var2.U.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ii1Var2.f37687g0.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ii1Var2.f37682e0.animate().alpha(1.0f).setDuration(350L).setInterpolator(prVar).start();
                ii1Var2.f37685f0.animate().alpha(1.0f).setDuration(350L).setInterpolator(prVar).start();
                ii1Var2.J0.animate().alpha(1.0f).setDuration(350L).setInterpolator(prVar).start();
                valueAnimator.addListener(new wh1(ii1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(prVar);
                valueAnimator.start();
                return;
            case 3:
                si1 si1Var = (si1) this.f35538b;
                int[] iArr = (int[]) this.f35539c;
                si1Var.getClass();
                int i13 = iArr[0] - 1;
                iArr[0] = i13;
                if (i13 == 0) {
                    WallpapersListActivity wallpapersListActivity = si1Var.f41254a;
                    int[][] iArr2 = WallpapersListActivity.f34941h0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 4:
                yi1 yi1Var = (yi1) this.f35538b;
                String str = (String) this.f35539c;
                yi1Var.d.clear();
                yi1Var.f43634e.clear();
                yi1Var.f43635f = true;
                yi1Var.F(str, "", true);
                yi1Var.h = str;
                yi1Var.l();
                yi1Var.f43641y = null;
                return;
            case 5:
                yi1 yi1Var2 = (yi1) this.f35538b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f35539c);
                WallpapersListActivity wallpapersListActivity2 = yi1Var2.B;
                MessagesController.getInstance(WallpapersListActivity.p0(wallpapersListActivity2)).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(WallpapersListActivity.q0(wallpapersListActivity2)).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = yi1Var2.f43640x;
                yi1Var2.f43640x = null;
                yi1Var2.F(str2, "", false);
                return;
            case 6:
                String str3 = (String) this.f35539c;
                ej1 ej1Var = ((dj1) this.f35538b).f36221a;
                Activity parentActivity = ej1Var.getParentActivity();
                MessageObject messageObject = ej1Var.f36517n;
                if (parentActivity != null) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d(str3);
                    }
                    str3.getClass();
                    if (!str3.equals("share_game")) {
                        if (str3.equals("share_score")) {
                            messageObject.messageOwner.with_my_score = true;
                        }
                    } else {
                        messageObject.messageOwner.with_my_score = false;
                    }
                    ej1Var.showDialog(org.telegram.ui.Components.lq0.N0(ej1Var.getParentActivity(), messageObject, null, false, ej1Var.h));
                    return;
                }
                return;
            case 7:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.f35538b;
                ArrayList arrayList3 = (ArrayList) this.f35539c;
                if (botWebViewContainer$BotWebViewProxy != null && (a1Var = botWebViewContainer$BotWebViewProxy.f42419a) != null && (f0Var = a1Var.f42433c) != null) {
                    f0Var.f(arrayList3);
                    return;
                }
                return;
            case 8:
                ArrayList arrayList4 = (ArrayList) this.f35538b;
                LongSparseArray longSparseArray = (LongSparseArray) this.f35539c;
                org.telegram.ui.web.c1.f42477c.addAll(0, arrayList4);
                for (int i14 = 0; i14 < longSparseArray.size(); i14++) {
                    org.telegram.ui.web.c1.d.put(longSparseArray.keyAt(i14), (org.telegram.ui.web.b1) longSparseArray.valueAt(i14));
                }
                org.telegram.ui.web.c1.f42476b = true;
                org.telegram.ui.web.c1.f42475a = false;
                ArrayList arrayList5 = org.telegram.ui.web.c1.f42478e;
                if (arrayList5 != null) {
                    int size2 = arrayList5.size();
                    while (i12 < size2) {
                        Object obj2 = arrayList5.get(i12);
                        i12++;
                        ((Utilities.Callback) obj2).run(arrayList4);
                    }
                    org.telegram.ui.web.c1.f42478e = null;
                    return;
                }
                return;
            case 9:
                org.telegram.ui.web.f1 f1Var = ((org.telegram.ui.web.e1) this.f35538b).h;
                ArrayList arrayList6 = f1Var.f42499f;
                arrayList6.clear();
                arrayList6.addAll((ArrayList) this.f35539c);
                f1Var.h = false;
                org.telegram.ui.Components.a61 a61Var = f1Var.f25523a;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                    return;
                }
                return;
            case 10:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f35538b;
                if (((org.telegram.ui.web.f2) this.f35539c).b() != null) {
                    z4 = true;
                }
                g1Var.setEnabled(z4);
                ViewPropertyAnimator animate = g1Var.animate();
                if (!g1Var.isEnabled()) {
                    f10 = 0.5f;
                }
                animate.alpha(f10);
                return;
            case 11:
                ((m0) this.f35538b).f42667c0.run((Integer) this.f35539c);
                return;
            case 12:
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) this.f35538b;
                x1Var.getMessagesController().removeWebBrowserException((String) this.f35539c);
                x1Var.f25523a.V2.N(true);
                return;
            case 13:
                org.telegram.ui.web.f2 f2Var = (org.telegram.ui.web.f2) this.f35538b;
                TLObject tLObject2 = (TLObject) this.f35539c;
                int i15 = f2Var.f42504a;
                f2Var.f42509g = true;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    MessagesController.getInstance(i15).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i15).putChats(tL_messages_webPage.chats, false);
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
                if (!SharedConfig.onlyLocalInstantView && f2Var.h != null && (s0Var = f2Var.f42513l) != null) {
                    s0Var.run();
                }
                f2Var.c();
                return;
            case 14:
                ((org.telegram.ui.web.f2) this.f35538b).f42514m.remove((bh1) this.f35539c);
                return;
            case 15:
                ph.p pVar = (ph.p) this.f35538b;
                String str4 = (String) this.f35539c;
                ArrayList arrayList7 = pVar.f44441f;
                while (true) {
                    if (i11 < arrayList7.size()) {
                        if (!TextUtils.equals(((oh.d6) arrayList7.get(i11)).E, str4)) {
                            i11++;
                        }
                    } else {
                        i11 = -1;
                    }
                }
                if (i11 >= 0) {
                    pVar.f44443r.d(str4.hashCode(), i11 + 1);
                    return;
                }
                return;
            case 16:
                qh.d dVar = (qh.d) this.f35538b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.f35539c;
                int i16 = dVar.C - 1;
                dVar.C = i16;
                dVar.c(i16, true);
                if (dVar.C > 0) {
                    AndroidUtilities.runOnUIThread(dVar.D, 1000L);
                    return;
                }
                dVar.setClickable(true);
                gVar.run();
                return;
            case 17:
                ((Utilities.Callback) this.f35538b).run((ArrayList) this.f35539c);
                return;
            case 18:
                qh.f1 f1Var2 = (qh.f1) this.f35538b;
                TLObject tLObject3 = (TLObject) this.f35539c;
                qh.h1 h1Var = f1Var2.f45336s;
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    qh.x1 x1Var2 = h1Var.f45388r;
                    MessagesController.getInstance(qh.x1.D(x1Var2)).putUsers(tL_contacts_resolvedPeer2.users, false);
                    MessagesController.getInstance(qh.x1.E(x1Var2)).putChats(tL_contacts_resolvedPeer2.chats, false);
                    MessagesStorage.getInstance(qh.x1.G(x1Var2)).putUsersAndChats(tL_contacts_resolvedPeer2.users, tL_contacts_resolvedPeer2.chats, true, true);
                }
                f1Var2.f45334n = true;
                f1Var2.G();
                return;
            case 19:
                ((qh.c2) this.f35538b).e(0.0f, 240L, (Runnable) this.f35539c);
                return;
            case 20:
                qh.a5 a5Var = (qh.a5) this.f35538b;
                View view = (View) this.f35539c;
                a5Var.getClass();
                if (view instanceof eg.j) {
                    eg.j jVar = (eg.j) view;
                    jVar.m();
                    a5Var.D0(jVar, true);
                    return;
                }
                return;
            case 21:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.f35538b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.f35539c;
                try {
                    List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() > 0) {
                        tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                        tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 22:
                ((Utilities.Callback) this.f35538b).run((Bitmap) this.f35539c);
                return;
            case 23:
                qh.i5.a((qh.i5) this.f35538b, (qh.r6) this.f35539c);
                return;
            case 24:
                qh.r6 r6Var = (qh.r6) this.f35539c;
                qh.i5 i5Var = (qh.i5) ((l7.w0) this.f35538b).d;
                Bitmap bitmap = i5Var.f45432a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (r6Var.M0 == i5Var.f45432a) {
                        r6Var.M0 = null;
                    }
                    i5Var.f45432a = null;
                    i5Var.invalidate();
                    return;
                }
                return;
            case 25:
                qh.m5 m5Var = (qh.m5) this.f35538b;
                AtomicReference atomicReference = m5Var.f45745a;
                ?? obj3 = new Object();
                obj3.f3786a = 256;
                atomicReference.set(new f8.n(new com.google.android.gms.internal.vision.t2((Context) this.f35539c, (com.google.android.gms.internal.vision.x1) obj3)));
                m5Var.a(m5Var.f45749f);
                return;
            case 26:
                ((qh.m5) this.f35538b).f45747c.run((qh.k5) this.f35539c);
                return;
            case 27:
                qh.n nVar = (qh.n) this.f35538b;
                eg.z2 z2Var = (eg.z2) this.f35539c;
                qh.u5 u5Var = nVar.f46210a;
                if (z2Var.getWidth() <= 0) {
                    u5Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new org.telegram.ui.web.s0(nVar, 23)).start();
                    return;
                }
                float width = z2Var.getWidth() / u5Var.getWidth();
                ValueAnimator valueAnimator2 = nVar.f46218w;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                nVar.f46218w = ValueAnimator.ofFloat(0.0f, 1.0f);
                nVar.f46218w.addUpdateListener(new qh.t5(nVar, u5Var.getScaleX(), width, ((z2Var.getWidth() / 2.0f) + z2Var.getX()) - ((u5Var.getWidth() / 2.0f) + u5Var.getX()), ((z2Var.getHeight() / 2.0f) + z2Var.getY()) - ((u5Var.getHeight() / 2.0f) + u5Var.getY()), 0));
                nVar.f46218w.addListener(new org.telegram.ui.Components.ex0(17, nVar, z2Var));
                nVar.f46218w.setDuration(320L);
                nVar.f46218w.setInterpolator(org.telegram.ui.Components.pr.h);
                nVar.v = z2Var;
                nVar.f46218w.start();
                return;
            case 28:
                qh.i6 i6Var = (qh.i6) this.f35538b;
                i6Var.I0 = false;
                i6Var.Y.addAll((ArrayList) this.f35539c);
                i6Var.f45478n0.N(true);
                return;
            default:
                qh.i6.R((qh.i6) this.f35538b, (TLObject) this.f35539c);
                return;
        }
    }
}
