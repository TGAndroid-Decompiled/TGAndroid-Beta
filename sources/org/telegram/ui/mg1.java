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
public final class mg1 implements Runnable {
    public final int f39152a;
    public final Object f39153b;
    public final Object f39154c;

    public mg1(int i10, Object obj, Object obj2) {
        this.f39152a = i10;
        this.f39153b = obj;
        this.f39154c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.web.a1 a1Var;
        org.telegram.ui.web.f0 f0Var;
        org.telegram.ui.web.s0 s0Var;
        float f10 = 1.0f;
        int i10 = 0;
        boolean z4 = false;
        int i11 = 0;
        int i12 = 0;
        switch (this.f39152a) {
            case 0:
                Runnable runnable = (Runnable) this.f39154c;
                for (cs csVar : ((qg1) this.f39153b).f40495w.f43982f) {
                    csVar.l(0.0f);
                }
                runnable.run();
                return;
            case 1:
                wg1 wg1Var = (wg1) this.f39153b;
                TLObject tLObject = (TLObject) this.f39154c;
                ArrayList arrayList = wg1Var.f42813f;
                ArrayList<TLRPC.Chat> arrayList2 = wg1Var.f42812e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(wg1Var.f42809a).putChats(arrayList2, false);
                wg1Var.d = false;
                wg1Var.f42811c = true;
                int size = arrayList.size();
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    ((Runnable) obj).run();
                }
                arrayList.clear();
                return;
            case 2:
                ci1 ci1Var = (ci1) this.f39153b;
                ci1Var.R.a(new lh1(ci1Var, (VoIPService) this.f39154c, 1), true);
                return;
            case 3:
                ci1 ci1Var2 = (ci1) this.f39153b;
                ValueAnimator valueAnimator = (ValueAnimator) this.f39154c;
                org.telegram.ui.Components.voip.n2.Q = false;
                org.telegram.ui.Components.voip.n2.i();
                ViewPropertyAnimator duration = ci1Var2.H.animate().setDuration(150L);
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f30183f;
                duration.setInterpolator(prVar).start();
                ci1Var2.E.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ci1Var2.F.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ci1Var2.K.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ci1Var2.U.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ci1Var2.f35835g0.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ci1Var2.f35830e0.animate().alpha(1.0f).setDuration(350L).setInterpolator(prVar).start();
                ci1Var2.f35833f0.animate().alpha(1.0f).setDuration(350L).setInterpolator(prVar).start();
                ci1Var2.J0.animate().alpha(1.0f).setDuration(350L).setInterpolator(prVar).start();
                valueAnimator.addListener(new qh1(ci1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(prVar);
                valueAnimator.start();
                return;
            case 4:
                mi1 mi1Var = (mi1) this.f39153b;
                int[] iArr = (int[]) this.f39154c;
                mi1Var.getClass();
                int i13 = iArr[0] - 1;
                iArr[0] = i13;
                if (i13 == 0) {
                    WallpapersListActivity wallpapersListActivity = mi1Var.f39163a;
                    int[][] iArr2 = WallpapersListActivity.f34941h0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 5:
                si1 si1Var = (si1) this.f39153b;
                String str = (String) this.f39154c;
                si1Var.d.clear();
                si1Var.f41302e.clear();
                si1Var.f41303f = true;
                si1Var.F(str, "", true);
                si1Var.h = str;
                si1Var.l();
                si1Var.f41309y = null;
                return;
            case 6:
                si1 si1Var2 = (si1) this.f39153b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f39154c);
                WallpapersListActivity wallpapersListActivity2 = si1Var2.B;
                MessagesController.getInstance(WallpapersListActivity.p0(wallpapersListActivity2)).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(WallpapersListActivity.q0(wallpapersListActivity2)).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = si1Var2.f41308x;
                si1Var2.f41308x = null;
                si1Var2.F(str2, "", false);
                return;
            case 7:
                String str3 = (String) this.f39154c;
                yi1 yi1Var = ((xi1) this.f39153b).f43081a;
                Activity parentActivity = yi1Var.getParentActivity();
                MessageObject messageObject = yi1Var.f43645n;
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
                    yi1Var.showDialog(org.telegram.ui.Components.mq0.N0(yi1Var.getParentActivity(), messageObject, null, false, yi1Var.h));
                    return;
                }
                return;
            case 8:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.f39153b;
                ArrayList arrayList3 = (ArrayList) this.f39154c;
                if (botWebViewContainer$BotWebViewProxy != null && (a1Var = botWebViewContainer$BotWebViewProxy.f42455a) != null && (f0Var = a1Var.f42469c) != null) {
                    f0Var.f(arrayList3);
                    return;
                }
                return;
            case 9:
                ArrayList arrayList4 = (ArrayList) this.f39153b;
                LongSparseArray longSparseArray = (LongSparseArray) this.f39154c;
                org.telegram.ui.web.c1.f42514c.addAll(0, arrayList4);
                for (int i14 = 0; i14 < longSparseArray.size(); i14++) {
                    org.telegram.ui.web.c1.d.put(longSparseArray.keyAt(i14), (org.telegram.ui.web.b1) longSparseArray.valueAt(i14));
                }
                org.telegram.ui.web.c1.f42513b = true;
                org.telegram.ui.web.c1.f42512a = false;
                ArrayList arrayList5 = org.telegram.ui.web.c1.f42515e;
                if (arrayList5 != null) {
                    int size2 = arrayList5.size();
                    while (i11 < size2) {
                        Object obj2 = arrayList5.get(i11);
                        i11++;
                        ((Utilities.Callback) obj2).run(arrayList4);
                    }
                    org.telegram.ui.web.c1.f42515e = null;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.web.f1 f1Var = ((org.telegram.ui.web.e1) this.f39153b).h;
                ArrayList arrayList6 = f1Var.f42536f;
                arrayList6.clear();
                arrayList6.addAll((ArrayList) this.f39154c);
                f1Var.h = false;
                org.telegram.ui.Components.b61 b61Var = f1Var.f25815a;
                if (b61Var != null) {
                    b61Var.V2.N(true);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f39153b;
                if (((org.telegram.ui.web.f2) this.f39154c).b() != null) {
                    z4 = true;
                }
                g1Var.setEnabled(z4);
                ViewPropertyAnimator animate = g1Var.animate();
                if (!g1Var.isEnabled()) {
                    f10 = 0.5f;
                }
                animate.alpha(f10);
                return;
            case 12:
                ((m0) this.f39153b).f42704c0.run((Integer) this.f39154c);
                return;
            case 13:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.f39153b;
                y1Var.getMessagesController().removeWebBrowserException((String) this.f39154c);
                y1Var.f25815a.V2.N(true);
                return;
            case 14:
                org.telegram.ui.web.f2 f2Var = (org.telegram.ui.web.f2) this.f39153b;
                TLObject tLObject2 = (TLObject) this.f39154c;
                int i15 = f2Var.f42541a;
                f2Var.f42546g = true;
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
                if (!SharedConfig.onlyLocalInstantView && f2Var.h != null && (s0Var = f2Var.f42550l) != null) {
                    s0Var.run();
                }
                f2Var.c();
                return;
            case 15:
                ((org.telegram.ui.web.f2) this.f39153b).f42551m.remove((mg1) this.f39154c);
                return;
            case 16:
                ph.p pVar = (ph.p) this.f39153b;
                String str4 = (String) this.f39154c;
                ArrayList arrayList7 = pVar.f44410f;
                while (true) {
                    if (i10 < arrayList7.size()) {
                        if (!TextUtils.equals(((oh.d6) arrayList7.get(i10)).E, str4)) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 >= 0) {
                    pVar.f44412r.d(str4.hashCode(), i10 + 1);
                    return;
                }
                return;
            case 17:
                qh.d dVar = (qh.d) this.f39153b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.f39154c;
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
            case 18:
                ((Utilities.Callback) this.f39153b).run((ArrayList) this.f39154c);
                return;
            case 19:
                qh.g1 g1Var2 = (qh.g1) this.f39153b;
                TLObject tLObject3 = (TLObject) this.f39154c;
                qh.i1 i1Var = g1Var2.f45355s;
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    qh.y1 y1Var2 = i1Var.f45406r;
                    MessagesController.getInstance(qh.y1.D(y1Var2)).putUsers(tL_contacts_resolvedPeer2.users, false);
                    MessagesController.getInstance(qh.y1.E(y1Var2)).putChats(tL_contacts_resolvedPeer2.chats, false);
                    MessagesStorage.getInstance(qh.y1.G(y1Var2)).putUsersAndChats(tL_contacts_resolvedPeer2.users, tL_contacts_resolvedPeer2.chats, true, true);
                }
                g1Var2.f45353n = true;
                g1Var2.G();
                return;
            case 20:
                ((qh.d2) this.f39153b).e(0.0f, 240L, (Runnable) this.f39154c);
                return;
            case 21:
                qh.b5 b5Var = (qh.b5) this.f39153b;
                View view = (View) this.f39154c;
                b5Var.getClass();
                if (view instanceof eg.j) {
                    eg.j jVar = (eg.j) view;
                    jVar.m();
                    b5Var.D0(jVar, true);
                    return;
                }
                return;
            case 22:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.f39153b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.f39154c;
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
            case 23:
                ((Utilities.Callback) this.f39153b).run((Bitmap) this.f39154c);
                return;
            case 24:
                qh.j5.a((qh.j5) this.f39153b, (qh.s6) this.f39154c);
                return;
            case 25:
                qh.s6 s6Var = (qh.s6) this.f39154c;
                qh.j5 j5Var = (qh.j5) ((l7.w0) this.f39153b).d;
                Bitmap bitmap = j5Var.f45462a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (s6Var.M0 == j5Var.f45462a) {
                        s6Var.M0 = null;
                    }
                    j5Var.f45462a = null;
                    j5Var.invalidate();
                    return;
                }
                return;
            case 26:
                qh.n5 n5Var = (qh.n5) this.f39153b;
                AtomicReference atomicReference = n5Var.f45768a;
                ?? obj3 = new Object();
                obj3.f3786a = 256;
                atomicReference.set(new f8.n(new com.google.android.gms.internal.vision.t2((Context) this.f39154c, (com.google.android.gms.internal.vision.x1) obj3)));
                n5Var.a(n5Var.f45772f);
                return;
            case 27:
                ((qh.n5) this.f39153b).f45770c.run((qh.l5) this.f39154c);
                return;
            case 28:
                qh.n nVar = (qh.n) this.f39153b;
                eg.z2 z2Var = (eg.z2) this.f39154c;
                qh.v5 v5Var = nVar.f46227a;
                if (z2Var.getWidth() <= 0) {
                    v5Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new org.telegram.ui.web.s0(nVar, 23)).start();
                    return;
                }
                float width = z2Var.getWidth() / v5Var.getWidth();
                ValueAnimator valueAnimator2 = nVar.f46235w;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                nVar.f46235w = ValueAnimator.ofFloat(0.0f, 1.0f);
                nVar.f46235w.addUpdateListener(new qh.u5(nVar, v5Var.getScaleX(), width, ((z2Var.getWidth() / 2.0f) + z2Var.getX()) - ((v5Var.getWidth() / 2.0f) + v5Var.getX()), ((z2Var.getHeight() / 2.0f) + z2Var.getY()) - ((v5Var.getHeight() / 2.0f) + v5Var.getY()), 0));
                nVar.f46235w.addListener(new org.telegram.ui.Components.fx0(17, nVar, z2Var));
                nVar.f46235w.setDuration(320L);
                nVar.f46235w.setInterpolator(org.telegram.ui.Components.pr.h);
                nVar.v = z2Var;
                nVar.f46235w.start();
                return;
            default:
                qh.k6 k6Var = (qh.k6) this.f39153b;
                k6Var.I0 = false;
                k6Var.Y.addAll((ArrayList) this.f39154c);
                k6Var.f45579n0.N(true);
                return;
        }
    }
}
