package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class f implements s9, br0, org.telegram.ui.web.u0, org.telegram.ui.Components.pm0, org.telegram.ui.Components.r4, org.telegram.ui.Components.zk0, org.telegram.ui.Components.hj0, org.telegram.ui.Cells.l1, l71, org.telegram.ui.Components.ft0, kl, ue.a, org.telegram.ui.Components.jj0, org.telegram.ui.Cells.m7, org.telegram.ui.Components.fo0, v4.d0, org.telegram.ui.Components.c8, org.telegram.ui.Components.c10, r0.m, ex0, ym0 {
    public final int f46929a;
    public final Object f46930b;

    public f(Object obj, int i7) {
        this.f46929a = i7;
        this.f46930b = obj;
    }

    @Override
    public void A(Editable editable) {
        om0 om0Var = (om0) this.f46930b;
        org.telegram.ui.Components.rt rtVar = om0Var.N;
        om0Var.f49994a = editable;
        rtVar.setText(editable);
    }

    @Override
    public void C() {
        switch (this.f46929a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((h5) this.f46930b).f47602m1.M();
                return;
        }
    }

    @Override
    public void D() {
        int i7 = this.f46929a;
    }

    @Override
    public void D0(float f10) {
        switch (this.f46929a) {
            case 6:
            case 9:
                return;
            default:
                cu cuVar = (cu) this.f46930b;
                int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i7 != 0 || cuVar.f46221f[1].getVisibility() == 0) {
                    if (cuVar.f46223r) {
                        bu buVar = cuVar.f46221f[0];
                        buVar.setTranslationX((-f10) * buVar.getMeasuredWidth());
                        bu[] buVarArr = cuVar.f46221f;
                        buVarArr[1].setTranslationX(buVarArr[0].getMeasuredWidth() - (f10 * cuVar.f46221f[0].getMeasuredWidth()));
                    } else {
                        bu buVar2 = cuVar.f46221f[0];
                        buVar2.setTranslationX(buVar2.getMeasuredWidth() * f10);
                        bu[] buVarArr2 = cuVar.f46221f;
                        buVarArr2[1].setTranslationX((f10 * buVarArr2[0].getMeasuredWidth()) - cuVar.f46221f[0].getMeasuredWidth());
                    }
                    if (i7 == 0) {
                        bu[] buVarArr3 = cuVar.f46221f;
                        bu buVar3 = buVarArr3[0];
                        buVarArr3[0] = buVarArr3[1];
                        buVarArr3[1] = buVar3;
                        buVar3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void E(int i7, int i10) {
        ((v4.h0) this.f46930b).j(i7, i10);
    }

    @Override
    public void E0() {
        int i7 = this.f46929a;
    }

    @Override
    public void F(boolean z10) {
        Runnable runnable = ((xd) this.f46930b).T0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void G0(org.telegram.messenger.gj gjVar) {
        k3 k3Var = ((g4) this.f46930b).f47326v0[0];
        if (k3Var != null) {
            k3Var.f48503b.I0(true);
        }
    }

    @Override
    public boolean H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public String J0() {
        return null;
    }

    @Override
    public boolean J1() {
        return false;
    }

    @Override
    public void K0(int i7, int i10) {
        ((v4.h0) this.f46930b).p(i7, i10);
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        org.telegram.messenger.g0.i3(new ai.w0(this, i7, 19), 50L);
    }

    @Override
    public boolean L0(long j3) {
        return false;
    }

    @Override
    public void M(String str) {
        g gVar = (g) this.f46930b;
        gVar.finishFragment(false);
        tr trVar = gVar.f47247y;
        LaunchActivity launchActivity = (LaunchActivity) trVar.f51654b;
        String str2 = LaunchActivity.C1;
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, launchActivity, null);
        t1Var.f29637j0 = false;
        t1Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.P).sendRequest(tL_auth_acceptLoginToken, new b00(5, t1Var, (g) trVar.f51655c));
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        bg0 bg0Var = (bg0) this.f46930b;
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        bg0Var.d = I0;
        bg0Var.G.setPadding(I0.f15574a, I0.f15575b, I0.f15576c, I0.d);
        bg0Var.F.requestLayout();
        return r0.k1.f55681b;
    }

    @Override
    public void O(float f10, float f11) {
        org.telegram.ui.ActionBar.o4 o4Var;
        switch (this.f46929a) {
            case 14:
                o4Var = ((org.telegram.ui.ActionBar.e2) ((rw) this.f46930b).f51038o0).parentLayout;
                ((ActionBarLayout) o4Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public boolean Q(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean Q0(float f10, float f11) {
        switch (this.f46929a) {
            case 14:
                return ((rw) this.f46930b).f51038o0.isInPreviewMode();
            default:
                le0 le0Var = (le0) this.f46930b;
                View view = null;
                le0Var.P = null;
                int childCount = le0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = le0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f10 >= childAt.getLeft() && f10 <= childAt.getRight() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                            view = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view != null && !le0Var.Q.contains(view)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public void Q1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public void R0(int i7, int i10) {
        c50 c50Var = (c50) this.f46930b;
        c50Var.X = i7;
        org.telegram.messenger.g0.a4(c50Var.f46007b);
    }

    @Override
    public CharacterStyle R1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public boolean S(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public boolean T1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.gj gjVar) {
        return false;
    }

    @Override
    public float U0() {
        return i5.c.d(9.66f, ri.a.d(((xd) this.f46930b).V0), 0);
    }

    @Override
    public boolean V0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public int X() {
        return 0;
    }

    @Override
    public boolean Y0() {
        return false;
    }

    @Override
    public jh.a Z() {
        return null;
    }

    @Override
    public boolean Z0(View view, float f10, float f11) {
        switch (this.f46929a) {
            case 14:
                return false;
            default:
                le0 le0Var = (le0) this.f46930b;
                le0.k(le0Var, view, f10, f11);
                org.telegram.messenger.g0.r(le0Var.I);
                le0.l(le0Var);
                le0.m(le0Var, f10, true, false);
                le0Var.invalidate();
                le0Var.R.a(true, true);
                return true;
        }
    }

    @Override
    public boolean Z1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        qc qcVar = (qc) this.f46930b;
        e6Var = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
        if (e6Var != null) {
            e6Var2 = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
            return e6Var2.a();
        }
        return org.telegram.ui.ActionBar.j6.I.q();
    }

    @Override
    public boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public void a1() {
        ti tiVar = (ti) this.f46930b;
        View view = tiVar.f51592a;
        if (view != null) {
            view.setPressed(false);
            tiVar.f51592a.setSelected(false);
        }
        View view2 = tiVar.f51597n;
        if (view2 != null && !tiVar.d) {
            view2.callOnClick();
            tiVar.d = true;
        }
    }

    @Override
    public void b(int i7, boolean z10) {
        boolean z11;
        switch (this.f46929a) {
            case 6:
                t5 t5Var = ((n5) this.f46930b).d;
                t5Var.f51363e0 = i7;
                t5Var.J0(true);
                return;
            case 9:
                sb sbVar = ((qb) this.f46930b).f50538f;
                sbVar.E = i7;
                sbVar.d(true);
                return;
            default:
                cu cuVar = (cu) this.f46930b;
                if (cuVar.f46221f[0].f45826f != i7) {
                    if (i7 == cuVar.f46220e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cuVar.f46226x = z11;
                    bu buVar = cuVar.f46221f[1];
                    buVar.f45826f = i7;
                    buVar.setVisibility(0);
                    cuVar.r0(true);
                    cuVar.f46223r = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public void b0() {
        ((jh0) this.f46930b).a();
    }

    @Override
    public int b1() {
        xd xdVar = (xd) this.f46930b;
        return xdVar.W0 + xdVar.X0;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean c0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public dr0 c2() {
        return null;
    }

    @Override
    public boolean d1(String str, j9 j9Var) {
        return false;
    }

    @Override
    public void dismiss() {
        ((c50) this.f46930b).f46015x.dismiss();
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void e1(View view, float f10, float f11) {
        switch (this.f46929a) {
            case 14:
                return;
            default:
                le0 le0Var = (le0) this.f46930b;
                le0.k(le0Var, view, f10, f11);
                le0.m(le0Var, f10, false, false);
                le0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean mo0f(float f10, float f11, int i7, View view) {
        zz zzVar = (zz) this.f46930b;
        if (view instanceof org.telegram.ui.Cells.g7) {
            zz.a(zzVar, ((org.telegram.ui.Cells.g7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.j7) {
            zz.a(zzVar, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.f7) {
            zz.a(zzVar, ((org.telegram.ui.Cells.f7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.h2) {
            zz.a(zzVar, ((org.telegram.ui.Cells.h2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.t2) {
                if (!zzVar.f54093p0.g0()) {
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                    if (t2Var.b0(f10)) {
                        zzVar.f54087j0.D(t2Var);
                        return true;
                    }
                }
                zz.a(zzVar, ((org.telegram.ui.Cells.t2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public boolean f1(org.telegram.messenger.gj gjVar) {
        return org.telegram.ui.Cells.y0.a(gjVar);
    }

    @Override
    public boolean f2(long j3) {
        return false;
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public TextureView g0() {
        return null;
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f46929a) {
            case 3:
                c4 c4Var = (c4) this.f46930b;
                int i7 = c4Var.f45881b;
                return String.valueOf(Math.round((c4Var.f45880a.getProgress() * (c4Var.f45882c - i7)) + i7));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f46929a) {
            case 14:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override
    public String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public void h1(int i7, int i10) {
        ((v4.h0) this.f46930b).n(i7, i10, null);
    }

    @Override
    public boolean h2(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public void i() {
        ((zz) this.f46930b).f54087j0.finish();
    }

    @Override
    public int i0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override
    public boolean j1(int i7, View view) {
        switch (this.f46929a) {
            case 6:
                return false;
            case 9:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void k() {
        org.telegram.messenger.t0.u();
        boolean z10 = org.telegram.messenger.r2.f26206a;
        org.telegram.messenger.t0.r();
        vf.c.t(((ib) this.f46930b).f48003n.getParentActivity(), org.telegram.messenger.r2.f26211g);
    }

    @Override
    public boolean k0() {
        switch (this.f46929a) {
            case 14:
                return true;
            default:
                return false;
        }
    }

    @Override
    public void l(boolean z10, float f10) {
        int i7;
        String a02;
        switch (this.f46929a) {
            case 3:
                c4 c4Var = (c4) this.f46930b;
                int round = Math.round(((c4Var.f45882c - i7) * f10) + c4Var.f45881b);
                if (round != org.telegram.messenger.gz.Z0) {
                    org.telegram.messenger.gz.Z0 = round;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                    edit.putInt("iv_font_size", org.telegram.messenger.gz.Z0);
                    edit.commit();
                    c4Var.f45884f.f47326v0[0].getAdapter().E.clear();
                    g4 g4Var = c4Var.f45884f;
                    for (int i10 = 0; i10 < 2; i10++) {
                        g4Var.f47326v0[i10].f48504c.f();
                        e4 e4Var = g4Var.f47326v0[i10].f48504c;
                        ArrayList arrayList = e4Var.d;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i11);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.f22416e.a(e4Var.M);
                        Utilities.f22416e.d(e4Var.M, 100L);
                    }
                    c4Var.invalidate();
                    return;
                }
                return;
            case 4:
            default:
                v90 v90Var = (v90) this.f46930b;
                x90 x90Var = v90Var.E;
                int round2 = Math.round(f10 * 100.0f);
                if (round2 != org.telegram.messenger.qc.c()) {
                    org.telegram.messenger.qc.f26071g = c8.i9.b(round2, 0, 100);
                    org.telegram.messenger.qc.k();
                    org.telegram.messenger.qc.d(false);
                    x90Var.d0();
                    ArrayList arrayList2 = x90Var.f53131s;
                    if (arrayList2.isEmpty()) {
                        x90Var.c0();
                    } else if (arrayList2.size() >= 2) {
                        if (org.telegram.messenger.qc.c() <= 0) {
                            a02 = org.telegram.messenger.hd.M0(2131748871, null);
                        } else if (org.telegram.messenger.qc.c() >= 100) {
                            a02 = org.telegram.messenger.hd.M0(2131748870, null);
                        } else {
                            a02 = org.telegram.messenger.hd.a0(null, null, 2131748872, String.format("%d%%", Integer.valueOf(org.telegram.messenger.qc.c())));
                        }
                        arrayList2.set(1, new s90(2, 0, a02, 0, 0));
                        x90Var.d.g(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            v90Var.performHapticFeedback(3, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                h5.f47600o1 = f10;
                org.telegram.ui.Components.st0 st0Var = ((h5) this.f46930b).f47602m1;
                st0Var.K();
                st0Var.M();
                return;
        }
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public boolean l1() {
        switch (this.f46929a) {
            case 14:
                return false;
            default:
                return true;
        }
    }

    @Override
    public void m0(int i7, int i10) {
        ((v4.h0) this.f46930b).o(i7, i10);
    }

    @Override
    public void m1(boolean z10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        qc qcVar = (qc) this.f46930b;
        e6Var = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
        if (e6Var instanceof pc) {
            e6Var2 = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
            qc qcVar2 = ((pc) e6Var2).f50217a;
            qcVar2.K = !qcVar2.K;
            qcVar2.k1();
            qcVar2.g1(false);
        }
        qcVar.b1(a(), false);
        qcVar.g1(false);
    }

    @Override
    public void n(View view, float f10, float f11) {
        switch (this.f46929a) {
            case 14:
                return;
            default:
                le0 le0Var = (le0) this.f46930b;
                le0.k(le0Var, view, f10, f11);
                le0.m(le0Var, f10, false, true);
                org.telegram.messenger.g0.i3(le0Var.I, 450L);
                View view2 = le0Var.P;
                if (view2 != null) {
                    view2.performClick();
                }
                le0Var.P = null;
                le0Var.invalidate();
                le0Var.R.a(false, true);
                return;
        }
    }

    @Override
    public boolean o0(org.telegram.ui.Components.p5 p5Var) {
        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        ti tiVar = (ti) this.f46930b;
        View view = tiVar.f51592a;
        if (view != null) {
            view.setPressed(true);
            tiVar.f51592a.setSelected(true);
            tiVar.f51592a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        boolean z10;
        ti tiVar = (ti) this.f46930b;
        an anVar = tiVar.f51601x;
        if (tiVar.f51592a != null) {
            anVar.f45196f9 = org.telegram.ui.Components.a9.b(anVar, tiVar.f51600w, anVar.f45258k6, anVar.b(), anVar.Aa);
            org.telegram.ui.ActionBar.g1 g1Var = anVar.f45196f9;
            if (g1Var != null) {
                tiVar.f51593b = g1Var;
                g1Var.setOnDismissListener(new d0(tiVar, 2));
                anVar.A0.C0();
                anVar.C0.R = false;
                View view = tiVar.f51600w;
                anVar.Ub(view);
                if (view != anVar.f45430y1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                anVar.x8(false, z10, 0.3f);
                anVar.G9(false);
                mk mkVar = anVar.O3;
                if (mkVar != null) {
                    mkVar.d(1, true);
                }
                UndoView undoView = anVar.N3;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                qj qjVar = anVar.f45117a0;
                if (qjVar != null && qjVar.getEditField() != null) {
                    anVar.f45117a0.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        ti tiVar = (ti) this.f46930b;
        if (!tiVar.f51595e && (view = tiVar.f51592a) != null) {
            view.callOnClick();
            tiVar.f51595e = true;
            return true;
        }
        return false;
    }

    @Override
    public int p0() {
        switch (this.f46929a) {
            case 3:
                c4 c4Var = (c4) this.f46930b;
                return c4Var.f45882c - c4Var.f45881b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public boolean p2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void q(float f10) {
        ((zz) this.f46930b).f54087j0.A(f10);
    }

    @Override
    public void s(float f10, float f11) {
        int i7 = this.f46929a;
    }

    @Override
    public void s0() {
        int i7 = this.f46929a;
    }

    @Override
    public void t0(int i7, boolean z10, boolean z11) {
        om0 om0Var = (om0) this.f46930b;
        om0Var.removeSelfFromStack();
        if (!z10) {
            om0Var.a0(om0Var.f49995b, om0Var.f49996c, z11, i7);
        }
    }

    @Override
    public void v(View view, float f10, float f11) {
        switch (this.f46929a) {
            case 14:
                return;
            default:
                le0 le0Var = (le0) this.f46930b;
                le0.k(le0Var, view, f10, f11);
                le0.m(le0Var, f10, false, true);
                org.telegram.messenger.g0.i3(le0Var.I, 450L);
                le0Var.P = null;
                le0Var.invalidate();
                le0Var.R.a(false, true);
                return;
        }
    }

    @Override
    public void v0(String str) {
        ((an) ((di.f4) this.f46930b).f8537c).Ga(str, false);
    }

    @Override
    public boolean v2(int i7) {
        return false;
    }

    public void w1(pd0 pd0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        be0 be0Var = (be0) this.f46930b;
        be0Var.O = true;
        ce0 ce0Var = be0Var.f45693h0;
        ce0Var.K = 0;
        ce0Var.F1(0, false);
        int i7 = Build.VERSION.SDK_INT;
        if (org.telegram.messenger.g0.N1()) {
            if (ce0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (ce0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i7 >= 28 && ce0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (i7 >= 26 && ce0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                z14 = false;
            } else {
                z14 = true;
            }
            zd0 zd0Var = be0Var.f45681a;
            if (zd0Var != null && "888".equals(zd0Var.getText())) {
                z11 = true;
                z12 = true;
                z13 = true;
                z14 = true;
            }
            if (ce0Var.f46103w) {
                ce0Var.f46096r.clear();
                if (!z11) {
                    ce0Var.f46096r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z12) {
                    ce0Var.f46096r.add("android.permission.CALL_PHONE");
                }
                if (!z13) {
                    ce0Var.f46096r.add("android.permission.READ_CALL_LOG");
                }
                if (!z14 && i7 >= 26) {
                    ce0Var.f46096r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!ce0Var.f46096r.isEmpty()) {
                    SharedPreferences e12 = org.telegram.messenger.np.e1();
                    if (!e12.getBoolean("firstlogin", true) && !ce0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !ce0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            ce0Var.getParentActivity().requestPermissions((String[]) ce0Var.f46096r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    e12.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751771, "Continue"), null);
                    int i10 = 2131623958;
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    if (!z11 && (!z12 || !z13)) {
                        t1Var.U = org.telegram.messenger.hd.M0(2131754274, "AllowReadCallAndLog");
                    } else if (z12 && z13) {
                        t1Var.U = org.telegram.messenger.hd.M0(2131754275, "AllowReadCall");
                        i10 = 2131624067;
                    } else {
                        t1Var.U = org.telegram.messenger.hd.M0(2131754273, "AllowReadCallLog");
                    }
                    int i11 = org.telegram.ui.ActionBar.j6.L5;
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.j6.x0(null, i11, false), null);
                    alertDialog$Builder.n(i11, null);
                    ce0Var.h = ce0Var.showDialog(t1Var);
                    be0Var.O = true;
                    return;
                }
            }
            z10 = true;
        } else {
            z10 = true;
        }
        ae0 ae0Var = new ae0(0, this, pd0Var);
        pd0Var.h.f(z10, z10);
        org.telegram.messenger.g0.i3(ae0Var, 400L);
    }

    @Override
    public String x(long j3) {
        return null;
    }

    @Override
    public void x0() {
        if (org.telegram.messenger.g0.H3()) {
            ((c40) this.f46930b).n1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public boolean x1() {
        return false;
    }

    @Override
    public void y() {
        om0 om0Var = (om0) this.f46930b;
        if (om0Var.f49995b.size() == 0) {
            om0Var.R.setPivotX(0.0f);
            om0Var.R.setPivotY(0.0f);
            om0Var.b0(false);
            return;
        }
        om0Var.R.invalidate();
        om0Var.b0(true);
    }

    @Override
    public boolean y0(org.telegram.messenger.gj gjVar) {
        return true;
    }

    public void y1(Exception exc) {
        kl0 kl0Var = (kl0) this.f46930b;
        if (kl0Var.R0) {
            return;
        }
        kl0Var.N0(true, false);
        kl0Var.J0(false);
        if (!(exc instanceof tc.a) && !(exc instanceof tc.b)) {
            org.telegram.ui.Components.t4.t0(exc.getMessage(), kl0Var);
        } else {
            org.telegram.ui.Components.t4.t0(org.telegram.messenger.hd.M0(2131747404, null), kl0Var);
        }
    }

    @Override
    public boolean z1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        return false;
    }

    @Override
    public org.telegram.ui.Cells.i9 z2() {
        return null;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        org.telegram.messenger.gj messageObject;
        lb lbVar = (lb) this.f46930b;
        if ((view instanceof org.telegram.ui.Cells.t0) && (messageObject = ((org.telegram.ui.Cells.t0) view).getMessageObject()) != null) {
            long j3 = messageObject.J0;
            if (j3 != -1) {
                if (lbVar.f48946q0.contains(Long.valueOf(j3))) {
                    lbVar.f48946q0.remove(Long.valueOf(messageObject.J0));
                } else {
                    lbVar.f48946q0.add(Long.valueOf(messageObject.J0));
                }
                lbVar.b1(true);
                lbVar.W0();
                lbVar.F.f();
                return;
            }
        }
        lbVar.U0(view, f10, f11);
    }

    private final void G1(float f10) {
    }

    private final void M1(float f10) {
    }

    @Override
    public void B(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void C1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void I(org.telegram.messenger.gj gjVar) {
    }

    @Override
    public void I0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void J(org.telegram.messenger.dj djVar) {
    }

    @Override
    public void L1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void N(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void N0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void O1(org.telegram.messenger.gj gjVar) {
    }

    @Override
    public void P(org.telegram.messenger.gj gjVar) {
    }

    @Override
    public void P0(int i7) {
    }

    @Override
    public void S0(org.telegram.messenger.wr wrVar) {
    }

    @Override
    public void V(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void W0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void X0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void d(qh0 qh0Var) {
    }

    @Override
    public void e0(int i7) {
    }

    @Override
    public void j0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void j2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void o(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void q2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void r(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void u(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void w(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void z0(org.telegram.ui.Cells.q1 q1Var) {
    }

    private final void N1() {
    }

    private final void P1() {
    }

    private final void V1() {
    }

    private final void W1() {
    }

    private final void b2() {
    }

    private final void o1() {
    }

    private final void q1() {
    }

    private final void u1() {
    }

    private final void v1() {
    }

    @Override
    public void A0() {
    }

    @Override
    public void U1() {
    }

    @Override
    public void W() {
    }

    @Override
    public void d0() {
    }

    @Override
    public void g1() {
    }

    @Override
    public void i1() {
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void p() {
    }

    @Override
    public void s2() {
    }

    @Override
    public void t() {
    }

    @Override
    public void x2() {
    }

    private final void n1(float f10, float f11) {
    }

    private final void r1(float f10, float f11) {
    }

    private final void s1(float f10, float f11) {
    }

    @Override
    public void F1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override
    public void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
    }

    @Override
    public void I1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void K1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    @Override
    public void O0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void X1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void Y(boolean z10, boolean z11) {
    }

    @Override
    public void a2(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.l10 l10Var) {
    }

    @Override
    public void e2(String str, String str2) {
    }

    @Override
    public void k1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void l2(org.telegram.ui.Cells.q1 q1Var, long j3) {
    }

    @Override
    public void p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    private final void A1(View view, float f10, float f11) {
    }

    private final void D1(View view, float f10, float f11) {
    }

    private final void E1(View view, float f10, float f11) {
    }

    @Override
    public void B0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void C0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void H0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void T0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void h0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void q0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }

    @Override
    public void t1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void y2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
    }

    @Override
    public void Y1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void u0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void w0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void g2(org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void j(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void t2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void S1(org.telegram.messenger.gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
