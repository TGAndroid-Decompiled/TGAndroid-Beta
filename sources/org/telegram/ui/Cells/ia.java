package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.vi;
import org.telegram.ui.pv0;
public final class ia implements k1, ah.j, me.a, qg.y1, com.google.android.gms.common.api.internal.o, s4.e0, n5.b, v0.i, com.google.android.gms.common.api.internal.s {
    public final int f20279a;
    public Object f20280b;

    public ia(int i10) {
        this.f20279a = i10;
    }

    @Override
    public boolean A1() {
        return false;
    }

    public void B(da.b bVar, Thread thread, Throwable th2) {
        w9.m mVar = (w9.m) this.f20280b;
        synchronized (mVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    w9.x.a(mVar.e.l(new w9.k(mVar, System.currentTimeMillis(), th2, thread, bVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    @Override
    public void D(int i10, int i11) {
        ((s4.h0) this.f20280b).p(i10, i11);
    }

    @Override
    public boolean G1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean I1() {
        return false;
    }

    @Override
    public boolean M0(long j3) {
        return false;
    }

    @Override
    public void N1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(t1Var.getContext(), str);
    }

    @Override
    public boolean O(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void O0(int i10, int i11) {
        ((s4.h0) this.f20280b).t(i10, i11);
    }

    @Override
    public CharacterStyle O1(t1 t1Var) {
        return null;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public void P0(int i10, t1 t1Var) {
        ja jaVar = (ja) this.f20280b;
        g gVar = jaVar.v;
        if (jaVar.a()) {
            jaVar.f20344s = 2;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ja jaVar = (ja) this.f20280b;
        g gVar = jaVar.v;
        if (jaVar.a()) {
            jaVar.f20344s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean Q(t1 t1Var) {
        return false;
    }

    @Override
    public boolean Q1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public boolean V1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean W0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public hh.a Y() {
        return null;
    }

    @Override
    public pv0 Y1() {
        return null;
    }

    public void a() {
        ArrayList arrayList = (ArrayList) this.f20280b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (obj == null) {
                try {
                    throw null;
                    break;
                } catch (Exception e) {
                    yc.i.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
                }
            } else {
                throw new ClassCastException();
            }
        }
        arrayList.clear();
    }

    @Override
    public boolean a0(t1 t1Var) {
        return false;
    }

    @Override
    public boolean a2(long j3) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        v8.j jVar = (v8.j) this.f20280b;
        e8.b bVar = (e8.b) obj;
        Bundle G = bVar.G();
        G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        e8.a aVar = new e8.a(0, (TaskCompletionSource) obj2);
        try {
            e8.i iVar = (e8.i) bVar.u();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i10 = e8.c.f8038a;
            obtain.writeInt(1);
            jVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            G.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            iVar.f8046a.transact(19, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e);
            Bundle bundle = Bundle.EMPTY;
            aVar.O(Status.h, null);
        }
    }

    @Override
    public void b(Canvas canvas) {
        switch (this.f20279a) {
            case 1:
                vi viVar = (vi) this.f20280b;
                canvas.drawColor(viVar.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
                if (SharedConfig.chatBlurEnabled()) {
                    viVar.C2.b(canvas, -2);
                    return;
                }
                return;
            default:
                hq0 hq0Var = (hq0) this.f20280b;
                canvas.drawColor(hq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
                if (SharedConfig.chatBlurEnabled()) {
                    hq0Var.O0.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean b0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void b2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        ja jaVar = (ja) this.f20280b;
        g gVar = jaVar.v;
        if (jaVar.a()) {
            jaVar.f20344s = 0;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public void c(Object obj) {
        ((g8.c) obj).onLocationAvailability((LocationAvailability) this.f20280b);
    }

    @Override
    public boolean c1(int i10, t1 t1Var) {
        if (i10 == ((ja) this.f20280b).f20344s) {
            return true;
        }
        return false;
    }

    @Override
    public boolean c2(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    public void d(s4.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.f20280b;
        int i10 = aVar.f42639a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
                        return;
                    }
                    recyclerView.f2863x.X(recyclerView, aVar.f42640b, aVar.d);
                    return;
                }
                recyclerView.f2863x.a0(recyclerView, aVar.f42640b, aVar.d, aVar.f42641c);
                return;
            }
            recyclerView.f2863x.Y(recyclerView, aVar.f42640b, aVar.d);
            return;
        }
        recyclerView.f2863x.V(recyclerView, aVar.f42640b, aVar.d);
    }

    @Override
    public boolean e() {
        return ((ja) this.f20280b).a();
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean forceEnableVibration() {
        return false;
    }

    public void g(za.a0 a0Var) {
        ((l5.r) ((i5.f) ((pa.b) this.f20280b).get())).a("FIREBASE_APPQUALITY_SESSION", new i5.c("json"), new r5.d(this, 28)).a(new i5.a(null, a0Var, i5.d.f10993a, null), new j2.e(18));
    }

    @Override
    public Object mo28get() {
        String packageName = ((Context) ((fd.a) this.f20280b).mo28get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public String h(t1 t1Var) {
        return null;
    }

    @Override
    public int h0(t1 t1Var) {
        return 0;
    }

    @Override
    public boolean h1(MessageObject messageObject) {
        return wl.a(messageObject);
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        return false;
    }

    @Override
    public void k0(int i10, int i11) {
        ((s4.h0) this.f20280b).s(i10, i11);
    }

    @Override
    public void l(float f7) {
        qg.z0 z0Var = (qg.z0) this.f20280b;
        pg.s0.e(z0Var.f41724a).k("-1", f7);
        z0Var.e.setBrushSize(f7);
    }

    @Override
    public boolean l0() {
        return e();
    }

    @Override
    public void l1(int i10, int i11) {
        ((s4.h0) this.f20280b).r(i10, i11, null);
    }

    @Override
    public boolean l2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void m(ah.a aVar) {
        switch (this.f20279a) {
            case 1:
                aVar.a(((vi) this.f20280b).getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                return;
            default:
                aVar.a(((hq0) this.f20280b).getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                return;
        }
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override
    public boolean needClickAt(View view, float f7, float f10) {
        int dp = AndroidUtilities.dp(9.0f);
        h61 h61Var = (h61) this.f20280b;
        float f11 = -dp;
        h61Var.f24529g.inset(f11, f11);
        boolean contains = h61Var.f24529g.contains(f7, f10);
        float f12 = dp;
        h61Var.f24529g.inset(f12, f12);
        return contains;
    }

    @Override
    public boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override
    public boolean o0(org.telegram.ui.Components.x5 x5Var) {
        return false;
    }

    @Override
    public void onClickAt(View view, float f7, float f10) {
        Runnable runnable = ((h61) this.f20280b).f24531j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onClickTouchDown(View view, float f7, float f10) {
        ((h61) this.f20280b).h.c(true);
    }

    @Override
    public void onClickTouchUp(View view, float f7, float f10) {
        ((h61) this.f20280b).h.c(false);
    }

    @Override
    public void onError(Object obj) {
        w0.d e = (w0.d) obj;
        kotlin.jvm.internal.i.e(e, "e");
        zd.m mVar = (zd.m) this.f20280b;
        if (mVar.w()) {
            mVar.resumeWith(v7.t7.a(e));
        }
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        return false;
    }

    @Override
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.i.e(result, "result");
        zd.m mVar = (zd.m) this.f20280b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    public void q(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.f20280b;
        int K = recyclerView.e.K();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < K; i15++) {
            View J = recyclerView.e.J(i15);
            s4.c1 U = RecyclerView.U(J);
            if (U != null && !U.r() && (i13 = U.f42677c) >= i10 && i13 < i14) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.f42683l) == 0) {
                    if (U.f42684m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.f42684m = arrayList;
                        U.f42685n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.f42684m.add(obj);
                }
                ((s4.p0) J.getLayoutParams()).f42783c = true;
            }
        }
        of.e eVar = recyclerView.f2835b;
        ArrayList arrayList2 = (ArrayList) eVar.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            s4.c1 c1Var = (s4.c1) arrayList2.get(size);
            if (c1Var != null && (i12 = c1Var.f42677c) >= i10 && i12 < i14) {
                c1Var.a(2);
                eVar.f(size);
            }
        }
        recyclerView.f2864x0 = true;
    }

    public void v(int i10, int i11) {
        RecyclerView recyclerView = (RecyclerView) this.f20280b;
        int K = recyclerView.e.K();
        for (int i12 = 0; i12 < K; i12++) {
            s4.c1 U = RecyclerView.U(recyclerView.e.J(i12));
            if (U != null && !U.r() && U.f42677c >= i10) {
                U.n(i11, false);
                recyclerView.f2858t0.f42836f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f2835b.e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            s4.c1 c1Var = (s4.c1) arrayList.get(i13);
            if (c1Var != null && c1Var.f42677c >= i10) {
                c1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2862w0 = true;
    }

    @Override
    public boolean v2(int i10) {
        return false;
    }

    @Override
    public String w(long j3) {
        return null;
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        return true;
    }

    public void x(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.f20280b;
        int K = recyclerView.e.K();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < K; i20++) {
            s4.c1 U = RecyclerView.U(recyclerView.e.J(i20));
            if (U != null && (i18 = U.f42677c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    U.n(i11 - i10, false);
                } else {
                    U.n(i14, false);
                }
                recyclerView.f2858t0.f42836f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f2835b.e;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            s4.c1 c1Var = (s4.c1) arrayList.get(i21);
            if (c1Var != null && (i17 = c1Var.f42677c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    c1Var.n(i11 - i10, false);
                } else {
                    c1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2862w0 = true;
    }

    public boolean y(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ia.y(android.view.MotionEvent):boolean");
    }

    @Override
    public r9 z2() {
        return null;
    }

    public ia(Object obj, int i10) {
        this.f20279a = i10;
        this.f20280b = obj;
    }

    public ia(TextView textView) {
        this.f20279a = 7;
        this.f20280b = new q1.g(textView);
    }

    @Override
    public float get() {
        qg.z0 z0Var = (qg.z0) this.f20280b;
        int i10 = z0Var.f41724a;
        pg.m currentBrush = z0Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return pg.s0.e(i10).f40997i;
        }
        return pg.s0.e(i10).f("-1", currentBrush.d());
    }

    public ia() {
        this.f20279a = 22;
        File file = new File(System.getProperty("java.io.tmpdir"));
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f20280b = new ArrayList();
    }

    public ia(Context context, l20 l20Var) {
        this.f20279a = 2;
        this.f20280b = new k20(context, l20Var);
    }

    @Override
    public void A(t1 t1Var) {
    }

    @Override
    public void C1(t1 t1Var) {
    }

    @Override
    public void D0(t1 t1Var) {
    }

    @Override
    public void F(t1 t1Var) {
    }

    @Override
    public void F0(t1 t1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(t1 t1Var) {
    }

    @Override
    public void K1(t1 t1Var) {
    }

    @Override
    public void L(t1 t1Var) {
    }

    @Override
    public void M1(MessageObject messageObject) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void N0(t1 t1Var) {
    }

    @Override
    public void R1() {
    }

    @Override
    public void T(t1 t1Var) {
    }

    @Override
    public void X0(t1 t1Var) {
    }

    @Override
    public void Z0(t1 t1Var) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void e2(t1 t1Var) {
    }

    @Override
    public void i0(t1 t1Var) {
    }

    @Override
    public void k() {
    }

    @Override
    public void k1() {
    }

    @Override
    public void m2(t1 t1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void o(t1 t1Var) {
    }

    @Override
    public void p() {
    }

    @Override
    public void q2() {
    }

    @Override
    public void r(t1 t1Var) {
    }

    @Override
    public void s() {
    }

    @Override
    public void t(t1 t1Var) {
    }

    @Override
    public void u(t1 t1Var) {
    }

    @Override
    public void x2() {
    }

    @Override
    public void y0(t1 t1Var) {
    }

    @Override
    public void z(t1 t1Var) {
    }

    @Override
    public void z0() {
    }

    @Override
    public void D1(t1 t1Var, boolean z10) {
    }

    @Override
    public void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void H1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void M(int i10, t1 t1Var) {
    }

    @Override
    public void R0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void T1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void g2(t1 t1Var, long j3) {
    }

    @Override
    public void i(t1 t1Var, bi.f fVar) {
    }

    @Override
    public void m1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void p1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void A0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void V0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void onClickTouchMove(View view, float f7, float f10) {
    }

    @Override
    public void onLongPressCancelled(View view, float f7, float f10) {
    }

    @Override
    public void onLongPressFinish(View view, float f7, float f10) {
    }

    @Override
    public void q0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void u1(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void y2(t1 t1Var, int i10, int i11) {
    }

    @Override
    public void U1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void t0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void j(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void t2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }
}
