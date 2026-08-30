package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
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
public final class kg1 implements Runnable {
    public final int f35719a;
    public final Object f35720b;
    public final Object f35721c;

    public kg1(int i10, Object obj, Object obj2) {
        this.f35719a = i10;
        this.f35720b = obj;
        this.f35721c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.web.a1 a1Var;
        org.telegram.ui.web.e0 e0Var;
        org.telegram.ui.web.o0 o0Var;
        float f10 = 1.0f;
        boolean z4 = false;
        int i10 = 0;
        int i11 = 0;
        switch (this.f35719a) {
            case 0:
                og1.g0((og1) this.f35720b, (String) this.f35721c);
                return;
            case 1:
                Runnable runnable = (Runnable) this.f35721c;
                for (bs bsVar : ((og1) this.f35720b).f36907w.f40565f) {
                    bsVar.l(0.0f);
                }
                runnable.run();
                return;
            case 2:
                ug1 ug1Var = (ug1) this.f35720b;
                TLObject tLObject = (TLObject) this.f35721c;
                ArrayList arrayList = ug1Var.f38939f;
                ArrayList<TLRPC.Chat> arrayList2 = ug1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(ug1Var.f38936a).putChats(arrayList2, false);
                ug1Var.d = false;
                ug1Var.f38938c = true;
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((Runnable) obj).run();
                }
                arrayList.clear();
                return;
            case 3:
                ai1 ai1Var = (ai1) this.f35720b;
                ai1Var.R.a(new jh1(ai1Var, (VoIPService) this.f35721c, 1), true);
                return;
            case 4:
                ai1 ai1Var2 = (ai1) this.f35720b;
                ValueAnimator valueAnimator = (ValueAnimator) this.f35721c;
                org.telegram.ui.Components.voip.m2.Q = false;
                org.telegram.ui.Components.voip.m2.i();
                ViewPropertyAnimator duration = ai1Var2.H.animate().setDuration(150L);
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f27346f;
                duration.setInterpolator(nrVar).start();
                ai1Var2.E.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
                ai1Var2.F.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
                ai1Var2.K.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
                ai1Var2.U.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
                ai1Var2.f32614g0.animate().alpha(1.0f).setDuration(150L).setInterpolator(nrVar).start();
                ai1Var2.f32609e0.animate().alpha(1.0f).setDuration(350L).setInterpolator(nrVar).start();
                ai1Var2.f32612f0.animate().alpha(1.0f).setDuration(350L).setInterpolator(nrVar).start();
                ai1Var2.J0.animate().alpha(1.0f).setDuration(350L).setInterpolator(nrVar).start();
                valueAnimator.addListener(new oh1(ai1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(nrVar);
                valueAnimator.start();
                return;
            case 5:
                ji1 ji1Var = (ji1) this.f35720b;
                int[] iArr = (int[]) this.f35721c;
                ji1Var.getClass();
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    WallpapersListActivity wallpapersListActivity = ji1Var.f35361a;
                    int[][] iArr2 = WallpapersListActivity.f32397h0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 6:
                pi1 pi1Var = (pi1) this.f35720b;
                String str = (String) this.f35721c;
                pi1Var.d.clear();
                pi1Var.e.clear();
                pi1Var.f37346f = true;
                pi1Var.F(str, "", true);
                pi1Var.h = str;
                pi1Var.l();
                pi1Var.f37352y = null;
                return;
            case 7:
                pi1 pi1Var2 = (pi1) this.f35720b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f35721c);
                WallpapersListActivity wallpapersListActivity2 = pi1Var2.B;
                MessagesController.getInstance(WallpapersListActivity.p0(wallpapersListActivity2)).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(WallpapersListActivity.q0(wallpapersListActivity2)).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = pi1Var2.f37351x;
                pi1Var2.f37351x = null;
                pi1Var2.F(str2, "", false);
                return;
            case 8:
                String str3 = (String) this.f35721c;
                vi1 vi1Var = ((ui1) this.f35720b).f38953a;
                Activity parentActivity = vi1Var.getParentActivity();
                MessageObject messageObject = vi1Var.f39192n;
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
                    vi1Var.showDialog(org.telegram.ui.Components.lq0.N0(vi1Var.getParentActivity(), messageObject, null, false, vi1Var.h));
                    return;
                }
                return;
            case 9:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.f35720b;
                ArrayList arrayList3 = (ArrayList) this.f35721c;
                if (botWebViewContainer$BotWebViewProxy != null && (a1Var = botWebViewContainer$BotWebViewProxy.f39410a) != null && (e0Var = a1Var.f39424c) != null) {
                    e0Var.f(arrayList3);
                    return;
                }
                return;
            case 10:
                ArrayList arrayList4 = (ArrayList) this.f35720b;
                LongSparseArray longSparseArray = (LongSparseArray) this.f35721c;
                org.telegram.ui.web.c1.f39467c.addAll(0, arrayList4);
                for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
                    org.telegram.ui.web.c1.d.put(longSparseArray.keyAt(i13), (org.telegram.ui.web.b1) longSparseArray.valueAt(i13));
                }
                org.telegram.ui.web.c1.f39466b = true;
                org.telegram.ui.web.c1.f39465a = false;
                ArrayList arrayList5 = org.telegram.ui.web.c1.e;
                if (arrayList5 != null) {
                    int size2 = arrayList5.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList5.get(i10);
                        i10++;
                        ((Utilities.Callback) obj2).run(arrayList4);
                    }
                    org.telegram.ui.web.c1.e = null;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.e1 e1Var = ((org.telegram.ui.web.d1) this.f35720b).h;
                ArrayList arrayList6 = e1Var.f39476f;
                arrayList6.clear();
                arrayList6.addAll((ArrayList) this.f35721c);
                e1Var.h = false;
                org.telegram.ui.Components.a61 a61Var = e1Var.f23580a;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f35720b;
                if (((org.telegram.ui.web.e2) this.f35721c).b() != null) {
                    z4 = true;
                }
                g1Var.setEnabled(z4);
                ViewPropertyAnimator animate = g1Var.animate();
                if (!g1Var.isEnabled()) {
                    f10 = 0.5f;
                }
                animate.alpha(f10);
                return;
            case 13:
                ((m0) this.f35720b).f39632c0.run((Integer) this.f35721c);
                return;
            case 14:
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) this.f35720b;
                x1Var.getMessagesController().removeWebBrowserException((String) this.f35721c);
                x1Var.f23580a.V2.N(true);
                return;
            case 15:
                org.telegram.ui.web.e2 e2Var = (org.telegram.ui.web.e2) this.f35720b;
                TLObject tLObject2 = (TLObject) this.f35721c;
                int i14 = e2Var.f39481a;
                e2Var.f39485g = true;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    MessagesController.getInstance(i14).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i14).putChats(tL_messages_webPage.chats, false);
                    e2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject2 instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            e2Var.h = tL_webPage;
                        }
                    }
                    e2Var.h = null;
                }
                TLRPC.WebPage webPage = e2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    e2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && e2Var.h != null && (o0Var = e2Var.f39489l) != null) {
                    o0Var.run();
                }
                e2Var.c();
                return;
            case 16:
                ((org.telegram.ui.web.e2) this.f35720b).f39490m.remove((kg1) this.f35721c);
                return;
            case 17:
                ph.d dVar = (ph.d) this.f35720b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.f35721c;
                int i15 = dVar.C - 1;
                dVar.C = i15;
                dVar.c(i15, true);
                if (dVar.C > 0) {
                    AndroidUtilities.runOnUIThread(dVar.D, 1000L);
                    return;
                }
                dVar.setClickable(true);
                gVar.run();
                return;
            case 18:
                ((Utilities.Callback) this.f35720b).run((ArrayList) this.f35721c);
                return;
            case 19:
                ph.g1 g1Var2 = (ph.g1) this.f35720b;
                TLObject tLObject3 = (TLObject) this.f35721c;
                ph.i1 i1Var = g1Var2.f41677s;
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    ph.y1 y1Var = i1Var.f41737r;
                    MessagesController.getInstance(ph.y1.D(y1Var)).putUsers(tL_contacts_resolvedPeer2.users, false);
                    MessagesController.getInstance(ph.y1.E(y1Var)).putChats(tL_contacts_resolvedPeer2.chats, false);
                    MessagesStorage.getInstance(ph.y1.G(y1Var)).putUsersAndChats(tL_contacts_resolvedPeer2.users, tL_contacts_resolvedPeer2.chats, true, true);
                }
                g1Var2.f41675n = true;
                g1Var2.G();
                return;
            case 20:
                ((ph.d2) this.f35720b).e(0.0f, 240L, (Runnable) this.f35721c);
                return;
            case 21:
                ph.c5 c5Var = (ph.c5) this.f35720b;
                View view = (View) this.f35721c;
                c5Var.getClass();
                if (view instanceof dg.j) {
                    dg.j jVar = (dg.j) view;
                    jVar.m();
                    c5Var.D0(jVar, true);
                    return;
                }
                return;
            case 22:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.f35720b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.f35721c;
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
                ((Utilities.Callback) this.f35720b).run((Bitmap) this.f35721c);
                return;
            case 24:
                ph.l5.a((ph.l5) this.f35720b, (ph.u6) this.f35721c);
                return;
            case 25:
                ph.u6 u6Var = (ph.u6) this.f35721c;
                ph.l5 l5Var = (ph.l5) ((l7.w0) this.f35720b).d;
                Bitmap bitmap = l5Var.f41878a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (u6Var.M0 == l5Var.f41878a) {
                        u6Var.M0 = null;
                    }
                    l5Var.f41878a = null;
                    l5Var.invalidate();
                    return;
                }
                return;
            case 26:
                ph.p5 p5Var = (ph.p5) this.f35720b;
                AtomicReference atomicReference = p5Var.f42161a;
                ?? obj3 = new Object();
                obj3.f3758a = 256;
                atomicReference.set(new f8.n(new com.google.android.gms.internal.vision.t2((Context) this.f35721c, (com.google.android.gms.internal.vision.x1) obj3)));
                p5Var.a(p5Var.f42164f);
                return;
            case 27:
                ((ph.p5) this.f35720b).f42163c.run((ph.n5) this.f35721c);
                return;
            case 28:
                ph.n nVar = (ph.n) this.f35720b;
                dg.b3 b3Var = (dg.b3) this.f35721c;
                ph.x5 x5Var = nVar.f42619a;
                if (b3Var.getWidth() <= 0) {
                    x5Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new org.telegram.ui.web.o0(nVar, 22)).start();
                    return;
                }
                float width = b3Var.getWidth() / x5Var.getWidth();
                ValueAnimator valueAnimator2 = nVar.f42626w;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                nVar.f42626w = ValueAnimator.ofFloat(0.0f, 1.0f);
                nVar.f42626w.addUpdateListener(new ph.w5(nVar, x5Var.getScaleX(), width, ((b3Var.getWidth() / 2.0f) + b3Var.getX()) - ((x5Var.getWidth() / 2.0f) + x5Var.getX()), ((b3Var.getHeight() / 2.0f) + b3Var.getY()) - ((x5Var.getHeight() / 2.0f) + x5Var.getY()), 0));
                nVar.f42626w.addListener(new org.telegram.ui.Components.ex0(17, nVar, b3Var));
                nVar.f42626w.setDuration(320L);
                nVar.f42626w.setInterpolator(org.telegram.ui.Components.nr.h);
                nVar.v = b3Var;
                nVar.f42626w.start();
                return;
            default:
                ph.m6 m6Var = (ph.m6) this.f35720b;
                m6Var.I0 = false;
                m6Var.Y.addAll((ArrayList) this.f35721c);
                m6Var.f41951n0.N(true);
                return;
        }
    }
}
