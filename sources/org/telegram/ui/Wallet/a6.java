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
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ai1;
import org.telegram.ui.bh1;
import org.telegram.ui.gi1;
import org.telegram.ui.oi1;
import org.telegram.ui.pi1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
public final class a6 implements Runnable {
    public final int f36391a;
    public final Object f36392b;
    public final Object f36393c;

    public a6(int i10, Object obj, Object obj2) {
        this.f36391a = i10;
        this.f36392b = obj;
        this.f36393c = obj2;
    }

    private final void a() {
        r2.c cVar = (r2.c) this.f36392b;
        a6 a6Var = (a6) this.f36393c;
        cVar.f47228c.N();
        r2.f fVar = cVar.f47227b;
        synchronized (fVar.f47238a) {
            fVar.b();
            a6Var.run();
        }
    }

    @Override
    public final void run() {
        org.telegram.ui.web.a1 a1Var;
        org.telegram.ui.web.g0 g0Var;
        float f7;
        org.telegram.ui.web.h1 h1Var;
        ra.a aVar;
        boolean z10 = true;
        int i10 = 0;
        switch (this.f36391a) {
            case 0:
                ((ViewGroup) this.f36393c).removeView(((e6) this.f36392b).h);
                return;
            case 1:
                ((Utilities.Callback) this.f36392b).run((TL_wallet.walletTransaction) this.f36393c);
                return;
            case 2:
                t7 t7Var = (t7) this.f36392b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f36393c;
                if (!t7Var.f37301a1 && userFull != null) {
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    t7Var.d(cardVar);
                    return;
                }
                return;
            case 3:
                w7 w7Var = (w7) this.f36392b;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.f36393c;
                if ((r2Var instanceof m5) && wc.a(r2Var)) {
                    wc.b0(r2Var).M(LocaleController.getString(R.string.WalletImported), LocaleController.getString(R.string.WalletImportedInfo), R.raw.contact_check).j();
                }
                w7Var.finishFragment();
                return;
            case 4:
                ((p0) this.f36393c).B();
                ((h8) this.f36392b).f30764a.f32504g3.O(true);
                return;
            case 5:
                h8 h8Var = (h8) this.f36392b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h8Var.getParentActivity(), 0, h8Var.getResourceProvider());
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.WalletDisableBackupTitle);
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.WalletDisableBackupExistingPhraseInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new bh1(4, h8Var, (l0) this.f36393c));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 6:
                ((org.telegram.ui.ActionBar.e2[]) this.f36392b)[0].dismiss();
                ((Runnable) this.f36393c).run();
                return;
            case 7:
                ((ViewGroup) this.f36393c).removeView(((v9) this.f36392b).h);
                return;
            case 8:
                ai1 ai1Var = (ai1) this.f36392b;
                int[] iArr = (int[]) this.f36393c;
                ai1Var.getClass();
                int i11 = iArr[0] - 1;
                iArr[0] = i11;
                if (i11 == 0) {
                    WallpapersListActivity wallpapersListActivity = ai1Var.f37787a;
                    int[][] iArr2 = WallpapersListActivity.f37606g0;
                    wallpapersListActivity.C0(true);
                    return;
                }
                return;
            case 9:
                gi1 gi1Var = (gi1) this.f36392b;
                String str = (String) this.f36393c;
                gi1Var.d.clear();
                gi1Var.e.clear();
                gi1Var.f39629f = true;
                gi1Var.F(str, "", true);
                gi1Var.h = str;
                gi1Var.l();
                gi1Var.f39635y = null;
                return;
            case 10:
                gi1 gi1Var2 = (gi1) this.f36392b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f36393c);
                WallpapersListActivity wallpapersListActivity2 = gi1Var2.E;
                MessagesController.getInstance(WallpapersListActivity.q0(wallpapersListActivity2)).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(WallpapersListActivity.r0(wallpapersListActivity2)).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = gi1Var2.f39634x;
                gi1Var2.f39634x = null;
                gi1Var2.F(str2, "", false);
                return;
            case 11:
                String str3 = (String) this.f36393c;
                pi1 pi1Var = ((oi1) this.f36392b).f42101a;
                Activity parentActivity = pi1Var.getParentActivity();
                MessageObject messageObject = pi1Var.f42445n;
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
                    pi1Var.showDialog(nr0.P0(pi1Var.getParentActivity(), messageObject, null, false, pi1Var.h));
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.a1 a1Var2 = (org.telegram.ui.web.a1) this.f36392b;
                hi.y yVar = a1Var2.f44678j0;
                yVar.f13368f = true;
                yVar.k();
                a1Var2.v((di.x7) this.f36393c);
                return;
            case 13:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.f36392b;
                ArrayList arrayList = (ArrayList) this.f36393c;
                if (botWebViewContainer$BotWebViewProxy != null && (a1Var = botWebViewContainer$BotWebViewProxy.f44654a) != null && (g0Var = a1Var.f44669c) != null) {
                    g0Var.f(arrayList);
                    return;
                }
                return;
            case 14:
                ArrayList arrayList2 = (ArrayList) this.f36392b;
                LongSparseArray longSparseArray = (LongSparseArray) this.f36393c;
                org.telegram.ui.web.c1.f44721c.addAll(0, arrayList2);
                for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
                    org.telegram.ui.web.c1.d.put(longSparseArray.keyAt(i12), (org.telegram.ui.web.b1) longSparseArray.valueAt(i12));
                }
                org.telegram.ui.web.c1.f44720b = true;
                org.telegram.ui.web.c1.f44719a = false;
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
            case 15:
                org.telegram.ui.web.f1 f1Var = ((org.telegram.ui.web.e1) this.f36392b).f44735b;
                ArrayList arrayList4 = f1Var.h;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) this.f36393c);
                f1Var.f44742n = false;
                m71 m71Var = f1Var.f30764a;
                if (m71Var != null) {
                    m71Var.f32504g3.O(true);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f36392b;
                if (((org.telegram.ui.web.f2) this.f36393c).b() == null) {
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
            case 17:
                ((org.telegram.ui.l0) this.f36392b).f44912f0.run((Integer) this.f36393c);
                return;
            case 18:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.f36392b;
                y1Var.getMessagesController().removeWebBrowserException((String) this.f36393c);
                y1Var.f30764a.f32504g3.O(true);
                return;
            case 19:
                org.telegram.ui.web.f2 f2Var = (org.telegram.ui.web.f2) this.f36392b;
                TLObject tLObject = (TLObject) this.f36393c;
                int i13 = f2Var.f44747a;
                f2Var.f44751g = true;
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
                if (!SharedConfig.onlyLocalInstantView && f2Var.h != null && (h1Var = f2Var.f44755l) != null) {
                    h1Var.run();
                }
                f2Var.c();
                return;
            case 20:
                ((org.telegram.ui.web.f2) this.f36392b).f44756m.remove((a6) this.f36393c);
                return;
            case 21:
                p2.b bVar = (p2.b) this.f36392b;
                bVar.f46528s = false;
                bVar.b((Uri) this.f36393c);
                return;
            case 22:
                pe.b bVar2 = (pe.b) this.f36392b;
                View view = (View) this.f36393c;
                pe.a aVar2 = bVar2.f46871a;
                int i14 = 2;
                if ((bVar2.f46873c & 2) != 0) {
                    if (aVar2.onLongPressRequestedAt(view, bVar2.d, bVar2.e)) {
                        bVar2.f46873c &= -3;
                        bVar2.f46872b = null;
                        float f10 = bVar2.d;
                        float f11 = bVar2.e;
                        bVar2.f46874f = f10;
                        bVar2.f46875g = f11;
                        if (aVar2.ignoreHapticFeedbackSettings(f10, f11)) {
                            boolean forceEnableVibration = aVar2.forceEnableVibration();
                            if (view != null) {
                                if (!forceEnableVibration) {
                                    i14 = 0;
                                }
                                view.performHapticFeedback(0, i14);
                            }
                        } else {
                            view.performHapticFeedback(0);
                        }
                        bVar2.f46873c = (4 | bVar2.f46873c) & (-11);
                        bVar2.f46872b = null;
                        return;
                    }
                    bVar2.f46873c |= 8;
                    return;
                }
                return;
            case 23:
                CarResultStub.G0((Map.Entry) this.f36392b, this.f36393c);
                return;
            case 24:
                a();
                return;
            case 25:
                r2.r rVar = (r2.r) this.f36392b;
                rVar.T.set(rVar.w((n4.s) this.f36393c, rVar.N, 0));
                return;
            case 26:
                rg.q0 q0Var = (rg.q0) this.f36392b;
                q0Var.v = true;
                RectF f12 = q0Var.f();
                Object obj2 = q0Var.f47538a.f17209b;
                q0Var.f47556w = new ng((ByteBuffer) q0Var.h(q0Var.f(), true, false, false).f18293c, 0, f12);
                q0Var.a(false);
                ((rg.x0) this.f36393c).run();
                return;
            case 27:
                Runnable runnable = (Runnable) this.f36393c;
                rg.a1 a1Var3 = ((rg.c1) this.f36392b).d;
                if (a1Var3 != null && a1Var3.f47397f) {
                    rg.a1.b(a1Var3);
                    runnable.run();
                    return;
                }
                return;
            case 28:
                int i15 = JobInfoSchedulerService.f6395a;
                ((JobInfoSchedulerService) this.f36392b).jobFinished((JobParameters) this.f36393c, false);
                return;
            default:
                s9.q qVar = (s9.q) this.f36392b;
                ra.b bVar3 = (ra.b) this.f36393c;
                if (qVar.f48052b == s9.q.d) {
                    synchronized (qVar) {
                        aVar = qVar.f48051a;
                        qVar.f48051a = null;
                        qVar.f48052b = bVar3;
                    }
                    aVar.i(bVar3);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
        }
    }
}
