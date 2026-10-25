package org.telegram.ui.Wallet;

import a8.ng;
import android.app.Activity;
import android.app.job.JobParameters;
import android.graphics.RectF;
import android.net.Uri;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ei1;
import org.telegram.ui.mi1;
import org.telegram.ui.ni1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.yh1;
import org.telegram.ui.zg1;
public final class q6 implements Runnable {
    public final int f37131a;
    public final Object f37132b;
    public final Object f37133c;

    public q6(int i10, Object obj, Object obj2) {
        this.f37131a = i10;
        this.f37132b = obj;
        this.f37133c = obj2;
    }

    private final void a() {
        r2.c cVar = (r2.c) this.f37132b;
        q6 q6Var = (q6) this.f37133c;
        cVar.f47190c.N();
        r2.f fVar = cVar.f47189b;
        synchronized (fVar.f47200a) {
            fVar.b();
            q6Var.run();
        }
    }

    private final void b() {
        ra.a aVar;
        s9.p pVar = (s9.p) this.f37132b;
        ra.b bVar = (ra.b) this.f37133c;
        if (pVar.f48011b == s9.p.d) {
            synchronized (pVar) {
                aVar = pVar.f48010a;
                pVar.f48010a = null;
                pVar.f48011b = bVar;
            }
            aVar.i(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    @Override
    public final void run() {
        org.telegram.ui.web.a1 a1Var;
        org.telegram.ui.web.g0 g0Var;
        float f7;
        org.telegram.ui.web.h1 h1Var;
        boolean z10 = true;
        int i10 = 0;
        switch (this.f37131a) {
            case 0:
                ((Utilities.Callback) this.f37132b).run((TL_wallet.walletTransaction) this.f37133c);
                return;
            case 1:
                t7 t7Var = (t7) this.f37132b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f37133c;
                if (!t7Var.f37274a1 && userFull != null) {
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    t7Var.d(cardVar);
                    return;
                }
                return;
            case 2:
                w7 w7Var = (w7) this.f37132b;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.f37133c;
                if ((r2Var instanceof m5) && wc.a(r2Var)) {
                    wc.b0(r2Var).M(LocaleController.getString(R.string.WalletImported), LocaleController.getString(R.string.WalletImportedInfo), R.raw.contact_check).j();
                }
                w7Var.finishFragment();
                return;
            case 3:
                ((p0) this.f37133c).B();
                ((h8) this.f37132b).f30417a.f32150g3.O(true);
                return;
            case 4:
                h8 h8Var = (h8) this.f37132b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h8Var.getParentActivity(), 0, h8Var.getResourceProvider());
                alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.WalletDisableBackupTitle);
                alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.WalletDisableBackupExistingPhraseInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new zg1(4, h8Var, (l0) this.f37133c));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 5:
                ((org.telegram.ui.ActionBar.e2[]) this.f37132b)[0].dismiss();
                ((Runnable) this.f37133c).run();
                return;
            case 6:
                ((ViewGroup) this.f37133c).removeView(((v9) this.f37132b).h);
                return;
            case 7:
                yh1 yh1Var = (yh1) this.f37132b;
                int[] iArr = (int[]) this.f37133c;
                yh1Var.getClass();
                int i11 = iArr[0] - 1;
                iArr[0] = i11;
                if (i11 == 0) {
                    WallpapersListActivity wallpapersListActivity = yh1Var.f46068a;
                    int[][] iArr2 = WallpapersListActivity.f37579g0;
                    wallpapersListActivity.C0(true);
                    return;
                }
                return;
            case 8:
                ei1 ei1Var = (ei1) this.f37132b;
                String str = (String) this.f37133c;
                ei1Var.d.clear();
                ei1Var.e.clear();
                ei1Var.f39115f = true;
                ei1Var.F(str, "", true);
                ei1Var.h = str;
                ei1Var.l();
                ei1Var.f39121y = null;
                return;
            case 9:
                ei1 ei1Var2 = (ei1) this.f37132b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f37133c);
                WallpapersListActivity wallpapersListActivity2 = ei1Var2.E;
                MessagesController.getInstance(WallpapersListActivity.q0(wallpapersListActivity2)).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(WallpapersListActivity.r0(wallpapersListActivity2)).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = ei1Var2.f39120x;
                ei1Var2.f39120x = null;
                ei1Var2.F(str2, "", false);
                return;
            case 10:
                String str3 = (String) this.f37133c;
                ni1 ni1Var = ((mi1) this.f37132b).f41565a;
                Activity parentActivity = ni1Var.getParentActivity();
                MessageObject messageObject = ni1Var.f41939n;
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
                    ni1Var.showDialog(mr0.P0(ni1Var.getParentActivity(), messageObject, null, false, ni1Var.h));
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.a1 a1Var2 = (org.telegram.ui.web.a1) this.f37132b;
                hi.y yVar = a1Var2.f45164j0;
                yVar.f13369f = true;
                yVar.k();
                a1Var2.v((di.x7) this.f37133c);
                return;
            case 12:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.f37132b;
                ArrayList arrayList = (ArrayList) this.f37133c;
                if (botWebViewContainer$BotWebViewProxy != null && (a1Var = botWebViewContainer$BotWebViewProxy.f45140a) != null && (g0Var = a1Var.f45155c) != null) {
                    g0Var.f(arrayList);
                    return;
                }
                return;
            case 13:
                ArrayList arrayList2 = (ArrayList) this.f37132b;
                LongSparseArray longSparseArray = (LongSparseArray) this.f37133c;
                org.telegram.ui.web.c1.f45207c.addAll(0, arrayList2);
                for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
                    org.telegram.ui.web.c1.d.put(longSparseArray.keyAt(i12), (org.telegram.ui.web.b1) longSparseArray.valueAt(i12));
                }
                org.telegram.ui.web.c1.f45206b = true;
                org.telegram.ui.web.c1.f45205a = false;
                ArrayList arrayList3 = org.telegram.ui.web.c1.e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i10 < size) {
                        Object obj = arrayList3.get(i10);
                        i10++;
                        ((Utilities.Callback) obj).run(arrayList2);
                    }
                    org.telegram.ui.web.c1.e = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.web.f1 f1Var = ((org.telegram.ui.web.e1) this.f37132b).f45221b;
                ArrayList arrayList4 = f1Var.h;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) this.f37133c);
                f1Var.f45228n = false;
                l71 l71Var = f1Var.f30417a;
                if (l71Var != null) {
                    l71Var.f32150g3.O(true);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f37132b;
                if (((org.telegram.ui.web.f2) this.f37133c).b() == null) {
                    z10 = false;
                }
                g1Var.setEnabled(z10);
                ViewPropertyAnimator animate = g1Var.animate();
                if (g1Var.isEnabled()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7);
                return;
            case 16:
                ((org.telegram.ui.l0) this.f37132b).f45398f0.run((Integer) this.f37133c);
                return;
            case 17:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.f37132b;
                y1Var.getMessagesController().removeWebBrowserException((String) this.f37133c);
                y1Var.f30417a.f32150g3.O(true);
                return;
            case 18:
                org.telegram.ui.web.f2 f2Var = (org.telegram.ui.web.f2) this.f37132b;
                TLObject tLObject = (TLObject) this.f37133c;
                int i13 = f2Var.f45233a;
                f2Var.f45237g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i13).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i13).putChats(tL_messages_webPage.chats, false);
                    f2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
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
                if (!SharedConfig.onlyLocalInstantView && f2Var.h != null && (h1Var = f2Var.f45241l) != null) {
                    h1Var.run();
                }
                f2Var.c();
                return;
            case 19:
                ((org.telegram.ui.web.f2) this.f37132b).f45242m.remove((q6) this.f37133c);
                return;
            case 20:
                p2.b bVar = (p2.b) this.f37132b;
                bVar.f46490s = false;
                bVar.b((Uri) this.f37133c);
                return;
            case 21:
                pe.b bVar2 = (pe.b) this.f37132b;
                View view = (View) this.f37133c;
                pe.a aVar = bVar2.f46833a;
                int i14 = 2;
                if ((bVar2.f46835c & 2) != 0) {
                    if (aVar.onLongPressRequestedAt(view, bVar2.d, bVar2.e)) {
                        bVar2.f46835c &= -3;
                        bVar2.f46834b = null;
                        float f10 = bVar2.d;
                        float f11 = bVar2.e;
                        bVar2.f46836f = f10;
                        bVar2.f46837g = f11;
                        if (aVar.ignoreHapticFeedbackSettings(f10, f11)) {
                            boolean forceEnableVibration = aVar.forceEnableVibration();
                            if (view != null) {
                                if (!forceEnableVibration) {
                                    i14 = 0;
                                }
                                view.performHapticFeedback(0, i14);
                            }
                        } else {
                            view.performHapticFeedback(0);
                        }
                        bVar2.f46835c = (4 | bVar2.f46835c) & (-11);
                        bVar2.f46834b = null;
                        return;
                    }
                    bVar2.f46835c |= 8;
                    return;
                }
                return;
            case 22:
                CarResultStub.G0((Map.Entry) this.f37132b, this.f37133c);
                return;
            case 23:
                a();
                return;
            case 24:
                r2.r rVar = (r2.r) this.f37132b;
                rVar.T.set(rVar.w((n4.s) this.f37133c, rVar.N, 0));
                return;
            case 25:
                rg.q0 q0Var = (rg.q0) this.f37132b;
                q0Var.v = true;
                RectF f12 = q0Var.f();
                Object obj2 = q0Var.f47500a.f17210b;
                q0Var.f47518w = new ng((ByteBuffer) q0Var.h(q0Var.f(), true, false, false).f18294c, 0, f12);
                q0Var.a(false);
                ((rg.x0) this.f37133c).run();
                return;
            case 26:
                Runnable runnable = (Runnable) this.f37133c;
                rg.a1 a1Var3 = ((rg.c1) this.f37132b).d;
                if (a1Var3 != null && a1Var3.f47359f) {
                    rg.a1.b(a1Var3);
                    runnable.run();
                    return;
                }
                return;
            case 27:
                int i15 = JobInfoSchedulerService.f6395a;
                ((JobInfoSchedulerService) this.f37132b).jobFinished((JobParameters) this.f37133c, false);
                return;
            case 28:
                b();
                return;
            default:
                s9.o oVar = (s9.o) this.f37132b;
                ra.b bVar3 = (ra.b) this.f37133c;
                synchronized (oVar) {
                    try {
                        if (oVar.f48008b == null) {
                            oVar.f48007a.add(bVar3);
                        } else {
                            oVar.f48008b.add(bVar3.get());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
