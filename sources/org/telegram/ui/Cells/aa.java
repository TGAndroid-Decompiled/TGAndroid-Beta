package org.telegram.ui.Cells;

import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.location.Location;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.cj;
import org.telegram.messenger.fj;
import org.telegram.messenger.h10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.n10;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fr0;
import org.telegram.ui.vp0;
public final class aa implements m1, te.d, ne0, p90, wi.l, r0.m, hs0, ue.a, jg.y1, q5.b, x2.e1, com.google.android.gms.common.api.internal.q, hi.z, tg.q1, u2.m, com.google.android.gms.common.api.internal.n, v0.g, androidx.lifecycle.s0 {
    public static aa f30489c;
    public final int f30490a;
    public final Object f30491b;

    public aa(Object obj, int i7) {
        this.f30490a = i7;
        this.f30491b = obj;
    }

    public static aa F2() {
        if (f30489c == null) {
            Point point = org.telegram.messenger.g0.f24226q;
            f30489c = new aa(point.x, point.y);
        }
        return f30489c;
    }

    @Override
    public boolean A1(boolean z10, float f10, en0 en0Var) {
        return false;
    }

    @Override
    public j9 B2() {
        return null;
    }

    @Override
    public boolean C2() {
        return false;
    }

    @Override
    public String D(long j3) {
        return null;
    }

    @Override
    public void D0() {
        ((j51) this.f30491b).h.c(true);
    }

    @Override
    public void E1(RectF rectF) {
        ((ji.q) this.f30491b).l(rectF);
    }

    @Override
    public boolean F0(fj fjVar) {
        return true;
    }

    @Override
    public boolean G() {
        return false;
    }

    public ClipDescription G2() {
        return ((t0.h) this.f30491b).getDescription();
    }

    @Override
    public boolean H(float f10) {
        return false;
    }

    @Override
    public boolean H1(r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    public void H2() {
        r2.p[] pVarArr;
        r2.p[] pVarArr2;
        r2.j jVar = (r2.j) this.f30491b;
        int i7 = jVar.I - 1;
        jVar.I = i7;
        if (i7 > 0) {
            return;
        }
        int i10 = 0;
        for (r2.p pVar : jVar.K) {
            pVar.b();
            i10 += pVar.Z.f60341a;
        }
        e2.m1[] m1VarArr = new e2.m1[i10];
        int i11 = 0;
        for (r2.p pVar2 : jVar.K) {
            pVar2.b();
            int i12 = pVar2.Z.f60341a;
            int i13 = 0;
            while (i13 < i12) {
                pVar2.b();
                m1VarArr[i11] = pVar2.Z.a(i13);
                i13++;
                i11++;
            }
        }
        jVar.J = new x2.r1(m1VarArr);
        jVar.H.V(jVar);
    }

    public boolean I2(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.aa.I2(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean J1() {
        return false;
    }

    public void J2() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f30491b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long L2 = L2();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + L2);
    }

    @Override
    public View K0() {
        return ((gu) this.f30491b).O1;
    }

    public void K2(long j3) {
        long L2 = L2();
        if (L2 != j3) {
            if (L2 != -1) {
                if (L2 == -2) {
                    L2 = -2;
                } else {
                    return;
                }
            }
            StringBuilder t6 = a8.p0.t(j3, "expected non-string scope or scope ", " but found ");
            t6.append(L2);
            throw new IOException(t6.toString());
        }
    }

    public long L2() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f30491b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public void M1(tg.d dVar) {
        ((vp0) this.f30491b).e0(dVar);
    }

    @Override
    public FrameLayout N() {
        return ((vp0) this.f30491b).d2.f43334f0;
    }

    @Override
    public long N1() {
        return ((vp0) this.f30491b).getCaptionsTrimStart();
    }

    @Override
    public boolean O0() {
        return false;
    }

    @Override
    public void P0() {
        ((j51) this.f30491b).h.c(false);
    }

    @Override
    public void P1() {
        ((gu) this.f30491b).M0();
    }

    @Override
    public org.telegram.ui.ActionBar.i6 Q() {
        return ((vp0) this.f30491b).A1;
    }

    @Override
    public FrameLayout Q0() {
        return (vp0) this.f30491b;
    }

    @Override
    public void Q1(r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override
    public boolean R0(long j3) {
        return false;
    }

    @Override
    public CharacterStyle R1(r1 r1Var) {
        return null;
    }

    @Override
    public tg.d S() {
        return ((vp0) this.f30491b).g0();
    }

    @Override
    public void S1(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        ba baVar = (ba) this.f30491b;
        f fVar = baVar.E;
        if (baVar.a()) {
            baVar.f30550y = 2;
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar, 5000L);
        }
    }

    @Override
    public void T(Object obj) {
        w0.d e10 = (w0.d) obj;
        kotlin.jvm.internal.j.e(e10, "e");
        zd.m mVar = (zd.m) this.f30491b;
        if (mVar.w()) {
            mVar.resumeWith(c8.z.a(e10));
        }
    }

    @Override
    public boolean T1(r1 r1Var, fj fjVar) {
        return false;
    }

    @Override
    public void U(float f10, float f11) {
        Runnable runnable = ((j51) this.f30491b).f36284j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void U0() {
        ((it0) this.f30491b).J.a(-1);
    }

    @Override
    public void V0(tg.n nVar) {
        ((vp0) this.f30491b).t0(nVar);
    }

    @Override
    public int V1() {
        return ((gu) this.f30491b).Q1;
    }

    @Override
    public boolean W1(int i7) {
        return true;
    }

    @Override
    public boolean X(r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public org.telegram.ui.ActionBar.y0 X0(String str) {
        org.telegram.ui.ActionBar.g5 g5Var = ((it0) this.f30491b).J;
        return g5Var.d(0, 0, null, str, true, true, g5Var.f29975n0);
    }

    @Override
    public boolean Y() {
        return false;
    }

    @Override
    public a0.h Y0() {
        return null;
    }

    @Override
    public boolean Z(r1 r1Var) {
        return false;
    }

    @Override
    public long Z0() {
        return ((vp0) this.f30491b).getCaptionsTrimEnd();
    }

    @Override
    public boolean a2(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        s6.c cVar = (s6.c) ((s6.e) obj).n();
        Parcel j12 = cVar.j1();
        n7.a.b(j12, (q6.p) this.f30491b);
        try {
            cVar.f306b.transact(1, j12, null, 1);
            j12.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th2) {
            j12.recycle();
            throw th2;
        }
    }

    @Override
    public void b() {
        a81 a81Var = ((gu) this.f30491b).n1;
        if (a81Var != null && a81Var.f33418x) {
            a81Var.f33397a.g0();
            a81Var.n();
            a81Var.f33408g0.d(true, true);
        }
    }

    @Override
    public boolean b0() {
        return false;
    }

    @Override
    public int b1() {
        return ((gu) this.f30491b).P1;
    }

    @Override
    public boolean c1(r1 r1Var, boolean z10) {
        return false;
    }

    @Override
    public fr0 c2() {
        return null;
    }

    @Override
    public boolean d() {
        return ((ba) this.f30491b).a();
    }

    @Override
    public float d2() {
        return 0.0f;
    }

    @Override
    public int e0() {
        return 0;
    }

    @Override
    public boolean f0() {
        gu guVar = (gu) this.f30491b;
        if (guVar.O1 == guVar.f35536m1 && guVar.f35547y1 && "inapp".equals(mp.u1(guVar.f30223a).D3)) {
            return false;
        }
        return true;
    }

    @Override
    public boolean f2(long j3) {
        return false;
    }

    @Override
    public void g(int i7, int i10, int i11, long j3) {
        ((MediaCodec) this.f30491b).queueInputBuffer(i7, 0, i10, j3, i11);
    }

    @Override
    public void g0(Object obj) {
        Location location;
        org.telegram.messenger.pa paVar = ((org.telegram.messenger.x9) obj).f27946a;
        List list = ((LocationResult) this.f30491b).f7356a;
        int size = list.size();
        if (size == 0) {
            location = null;
        } else {
            location = (Location) list.get(size - 1);
        }
        paVar.onLocationChanged(location);
    }

    @Override
    public boolean g1(fj fjVar) {
        return c0.a(fjVar);
    }

    @Override
    public void g2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
        ba baVar = (ba) this.f30491b;
        f fVar = baVar.E;
        if (baVar.a()) {
            baVar.f30550y = 0;
            r1Var.invalidate();
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar, 5000L);
        }
    }

    @Override
    public Object mo23get() {
        switch (this.f30490a) {
            case 11:
                return new i61((Context) ((org.telegram.ui.ActionBar.i5) this.f30491b).f29095a, new qb.a(28), new pb.b(28), 7);
            default:
                String packageName = ((Context) ((fd.a) this.f30491b).mo23get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    @Override
    public long getDuration() {
        return 0L;
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public void h(int i7, k2.d dVar, long j3, int i10) {
        ((MediaCodec) this.f30491b).queueSecureInputBuffer(i7, 0, dVar.f18219i, j3, i10);
    }

    @Override
    public jh.a h0() {
        return null;
    }

    @Override
    public boolean h1() {
        return false;
    }

    @Override
    public void h2(float f10) {
        tg.t0 t0Var = (tg.t0) this.f30491b;
        sg.j0.e(t0Var.f58233a).k("-1", f10);
        t0Var.f58236e.setBrushSize(f10);
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public tg.d i0() {
        tg.h0 h0Var = ((vp0) this.f30491b).J0;
        for (int i7 = 0; i7 < h0Var.getChildCount(); i7++) {
            if (h0Var.getChildAt(i7) instanceof tg.d) {
                return (tg.d) h0Var.getChildAt(i7);
            }
        }
        return null;
    }

    @Override
    public boolean i1() {
        return false;
    }

    @Override
    public void i2(x2.f1 f1Var) {
        r2.p pVar = (r2.p) f1Var;
        r2.j jVar = (r2.j) this.f30491b;
        jVar.H.i2(jVar);
    }

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public boolean j0(r1 r1Var) {
        return false;
    }

    @Override
    public Paint.FontMetricsInt j1() {
        return ((ti) this.f30491b).C2.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public boolean j2(r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public String k(r1 r1Var) {
        return null;
    }

    @Override
    public boolean k0(r1 r1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        yk0 yk0Var = (yk0) this.f30491b;
        yk0Var.f42511w.setPadding(I0.f15978a, I0.f15979b, I0.f15980c, I0.d);
        yk0Var.f42510s.requestLayout();
        return r0.l1.f56380b;
    }

    @Override
    public long n() {
        return 0L;
    }

    @Override
    public boolean n0() {
        return false;
    }

    @Override
    public e2.c1 n1() {
        return null;
    }

    @Override
    public androidx.lifecycle.p0 o(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override
    public boolean o1() {
        return false;
    }

    @Override
    public org.telegram.ui.ActionBar.y0 o2(int i7, Runnable runnable, String str, boolean z10, boolean z11) {
        it0 it0Var = (it0) this.f30491b;
        org.telegram.ui.ActionBar.y0 e10 = it0Var.J.e(0, i7, str);
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.n6.f29672p7;
            e10.d(it0Var.s0(i10), it0Var.s0(i10));
        }
        e10.setOnClickListener(new ua0(this, z11, runnable));
        return e10;
    }

    @Override
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.j.e(result, "result");
        zd.m mVar = (zd.m) this.f30491b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override
    public int p0(r1 r1Var) {
        return 0;
    }

    @Override
    public void p1(r1 r1Var, int i7) {
        ba baVar = (ba) this.f30491b;
        f fVar = baVar.E;
        if (baVar.a()) {
            baVar.f30550y = 2;
            r1Var.invalidate();
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar, 5000L);
        }
    }

    @Override
    public boolean p2(r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean q1(float f10, float f11) {
        int L = org.telegram.messenger.g0.L(9.0f);
        RectF rectF = ((j51) this.f30491b).f36282g;
        float f12 = -L;
        rectF.inset(f12, f12);
        boolean contains = rectF.contains(f10, f11);
        float f13 = L;
        rectF.inset(f13, f13);
        return contains;
    }

    @Override
    public boolean r0() {
        return d();
    }

    @Override
    public boolean r1(View view, float f10, float f11) {
        return false;
    }

    @Override
    public boolean r2() {
        return false;
    }

    @Override
    public boolean s0() {
        return true;
    }

    @Override
    public void s1(boolean z10) {
        ((ji.q) this.f30491b).setEditPillHidden(z10);
    }

    @Override
    public void s2(long j3) {
        l2.g0 g0Var;
        PhotoViewer photoViewer = ((vp0) this.f30491b).d2;
        h61 h61Var = photoViewer.G2;
        if (h61Var != null && (g0Var = h61Var.d) != null && g0Var.f0()) {
            photoViewer.G2.p0(j3);
        }
    }

    @Override
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.f30491b).setParameters(bundle);
    }

    @Override
    public long u0() {
        return ((vp0) this.f30491b).getCaptionsVideoPosition();
    }

    @Override
    public a0.h u1() {
        return null;
    }

    @Override
    public void v(int i7) {
        org.telegram.ui.Wallet.oa oaVar = (org.telegram.ui.Wallet.oa) this.f30491b;
        if (!oaVar.f44843r && i7 == oaVar.K) {
            oaVar.j0(oaVar.O.getText().toString().trim());
        }
    }

    @Override
    public boolean v0(org.telegram.ui.Components.x5 x5Var) {
        return false;
    }

    @Override
    public void v1() {
        gu guVar = (gu) this.f30491b;
        guVar.N1 = null;
        guVar.L0();
    }

    @Override
    public ji.q v2() {
        return (ji.q) this.f30491b;
    }

    @Override
    public void w(boolean z10) {
        vp0 vp0Var = (vp0) this.f30491b;
        PhotoViewer photoViewer = vp0Var.d2;
        h61 h61Var = photoViewer.G2;
        if (h61Var != null) {
            if (z10) {
                if (h61Var.d0()) {
                    vp0Var.f53016c2 = true;
                    photoViewer.n0();
                    photoViewer.G2.g0();
                }
            } else if (vp0Var.f53016c2) {
                vp0Var.f53016c2 = false;
                if (!photoViewer.H2 && !photoViewer.O1()) {
                    photoViewer.G2.h0();
                }
            }
        }
    }

    @Override
    public void w0(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public boolean x1() {
        return false;
    }

    @Override
    public void x2(int i7, int i10, CharSequence charSequence, boolean z10) {
        ti tiVar = (ti) this.f30491b;
        if (tiVar.b1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tiVar.b1().getText());
            spannableStringBuilder.replace(i7, i10 + i7, charSequence);
            if (z10) {
                org.telegram.messenger.j6.l(spannableStringBuilder, tiVar.b1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            tiVar.b1().setText(spannableStringBuilder);
            tiVar.b1().setSelection(i7 + charSequence.length());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public int y() {
        return 0;
    }

    @Override
    public View y0(LaunchActivity launchActivity) {
        return null;
    }

    @Override
    public void y1() {
        ((org.telegram.ui.Components.f9) this.f30491b).f35056a.invalidate();
    }

    @Override
    public boolean y2(int i7) {
        return false;
    }

    @Override
    public androidx.lifecycle.p0 z(Class cls, y1.b bVar) {
        androidx.lifecycle.m0 m0Var = null;
        for (y1.c cVar : (y1.c[]) this.f30491b) {
            if (cVar.f60786a.equals(cls)) {
                m0Var = new androidx.lifecycle.m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override
    public boolean z1(r1 r1Var, int i7) {
        if (i7 == ((ba) this.f30491b).f30550y) {
            return true;
        }
        return false;
    }

    public aa(boolean z10) {
        this.f30490a = 12;
        this.f30491b = new AtomicBoolean(z10);
    }

    public aa(int i7) {
        this.f30490a = i7;
        switch (i7) {
            case 14:
                this.f30491b = new ArrayDeque(16);
                return;
            default:
                this.f30491b = h9.i0.p();
                return;
        }
    }

    public aa(y1.c[] initializers) {
        this.f30490a = 29;
        kotlin.jvm.internal.j.e(initializers, "initializers");
        this.f30491b = initializers;
    }

    public aa(ArrayList arrayList) {
        this.f30490a = 26;
        this.f30491b = DesugarCollections.unmodifiableList(arrayList);
    }

    public aa(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f30490a = 19;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f30491b = new t0.g(uri, clipDescription, uri2);
        } else {
            this.f30491b = new i61(uri, clipDescription, uri2, 18);
        }
    }

    @Override
    public float get() {
        tg.t0 t0Var = (tg.t0) this.f30491b;
        int i7 = t0Var.f58233a;
        sg.h currentBrush = t0Var.f58236e.getCurrentBrush();
        if (currentBrush == null) {
            return sg.j0.e(i7).f57382i;
        }
        return sg.j0.e(i7).f("-1", currentBrush.d());
    }

    public aa(Context context, n10 n10Var) {
        this.f30490a = 5;
        this.f30491b = new m10(context, n10Var);
    }

    public aa(int i7, int i10) {
        this.f30490a = 28;
        this.f30491b = org.telegram.messenger.t0.f27013b.getSharedPreferences(a8.p0.m(i7, i10, "pip_floating_", "_"), 0);
    }

    @Override
    public void A(r1 r1Var) {
    }

    @Override
    public void B0(View view) {
    }

    @Override
    public void C(r1 r1Var) {
    }

    @Override
    public void C1(r1 r1Var) {
    }

    @Override
    public void D1(View view) {
    }

    @Override
    public void D2(int i7) {
    }

    @Override
    public void E(boolean z10) {
    }

    @Override
    public void E0(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void E2(String str) {
    }

    @Override
    public void F(r1 r1Var) {
    }

    @Override
    public void G0(r1 r1Var) {
    }

    @Override
    public void I(wi.o oVar) {
    }

    @Override
    public void J(r1 r1Var) {
    }

    @Override
    public void L0(r1 r1Var) {
    }

    @Override
    public void L1(r1 r1Var) {
    }

    @Override
    public void M(r1 r1Var) {
    }

    @Override
    public void N0(r1 r1Var) {
    }

    @Override
    public void O(cj cjVar) {
    }

    @Override
    public void O1(fj fjVar) {
    }

    @Override
    public void R(r1 r1Var) {
    }

    @Override
    public void S0(r1 r1Var) {
    }

    @Override
    public void W(fj fjVar) {
    }

    @Override
    public void c(long j3) {
    }

    @Override
    public void d0(r1 r1Var) {
    }

    @Override
    public void d1(float f10) {
    }

    @Override
    public void e1(r1 r1Var) {
    }

    @Override
    public void f1(r1 r1Var) {
    }

    @Override
    public void k2(r1 r1Var) {
    }

    @Override
    public void l(View view) {
    }

    @Override
    public void m0(int i7) {
    }

    @Override
    public void m2(ArrayList arrayList) {
    }

    @Override
    public void q0(r1 r1Var) {
    }

    @Override
    public void q2(r1 r1Var) {
    }

    @Override
    public void s(r1 r1Var) {
    }

    @Override
    public void t(r1 r1Var) {
    }

    @Override
    public void t0(String str) {
    }

    @Override
    public void z0(View view) {
    }

    @Override
    public void H0() {
    }

    @Override
    public void K() {
    }

    @Override
    public void T0() {
    }

    @Override
    public void U1() {
    }

    @Override
    public void a() {
    }

    @Override
    public void e() {
    }

    @Override
    public void f() {
    }

    @Override
    public void flush() {
    }

    @Override
    public void k1() {
    }

    @Override
    public void p() {
    }

    @Override
    public void shutdown() {
    }

    @Override
    public void start() {
    }

    @Override
    public void u2() {
    }

    @Override
    public void w1() {
    }

    @Override
    public void x() {
    }

    @Override
    public void z2() {
    }

    @Override
    public void F1(r1 r1Var, boolean z10) {
    }

    @Override
    public void I1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void K1(r1 r1Var, int i7) {
    }

    @Override
    public void L(r1 r1Var, org.telegram.messenger.p2 p2Var) {
    }

    @Override
    public void W0(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void Y1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void b2(r1 r1Var, h10 h10Var) {
    }

    @Override
    public void e2(String str, String str2) {
    }

    @Override
    public void l2(r1 r1Var, long j3) {
    }

    @Override
    public void m1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void n2(int i7, ArrayList arrayList) {
    }

    @Override
    public void u(float f10, float f11) {
    }

    @Override
    public void A2(r1 r1Var, int i7, int i10) {
    }

    @Override
    public void B(View view, float f10, float f11) {
    }

    @Override
    public void B1(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public void G1(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void I0(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void J0(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void M0(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public void P(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void X1(View view, float f10, float f11) {
    }

    @Override
    public void a0(TLRPC.BotInlineResult botInlineResult, boolean z10, int i7) {
    }

    @Override
    public void a1(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void o0(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void r(View view, float f10, float f11) {
    }

    @Override
    public void t1(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void t2(Canvas canvas, int i7, int i10) {
    }

    @Override
    public void x0(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void A0(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void C0(r1 r1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void Z1(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void q(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void m(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void w2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void c0(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }
}
