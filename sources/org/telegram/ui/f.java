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
public final class f implements s9, dr0, org.telegram.ui.web.u0, org.telegram.ui.Components.xm0, org.telegram.ui.Components.z4, org.telegram.ui.Components.hl0, org.telegram.ui.Components.pj0, org.telegram.ui.Cells.m1, p71, org.telegram.ui.Components.nt0, ll, ue.a, org.telegram.ui.Components.rj0, org.telegram.ui.Cells.o7, org.telegram.ui.Components.oo0, v4.e0, org.telegram.ui.Components.k8, org.telegram.ui.Components.j10, r0.m, ix0, bn0 {
    public final int f47359a;
    public final Object f47360b;

    public f(Object obj, int i7) {
        this.f47359a = i7;
        this.f47360b = obj;
    }

    @Override
    public void A(Editable editable) {
        qm0 qm0Var = (qm0) this.f47360b;
        org.telegram.ui.Components.wt wtVar = qm0Var.N;
        qm0Var.f51245a = editable;
        wtVar.setText(editable);
    }

    @Override
    public void C() {
        switch (this.f47359a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((h5) this.f47360b).f48154m1.M();
                return;
        }
    }

    @Override
    public void D() {
        int i7 = this.f47359a;
    }

    @Override
    public void D0() {
        if (org.telegram.messenger.g0.G3()) {
            ((f40) this.f47360b).o1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public void E0() {
        int i7 = this.f47359a;
    }

    @Override
    public void F(int i7, int i10) {
        ((v4.i0) this.f47360b).j(i7, i10);
    }

    @Override
    public void G(boolean z10) {
        Runnable runnable = ((xd) this.f47360b).T0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void G0(org.telegram.messenger.fj fjVar) {
        k3 k3Var = ((g4) this.f47360b).f47899v0[0];
        if (k3Var != null) {
            k3Var.f49135b.I0(true);
        }
    }

    @Override
    public boolean H1(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void J(String str) {
        g gVar = (g) this.f47360b;
        gVar.finishFragment(false);
        at atVar = gVar.f47823y;
        LaunchActivity launchActivity = (LaunchActivity) atVar.f45657b;
        String str2 = LaunchActivity.C1;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, launchActivity, null);
        u1Var.f30047j0 = false;
        u1Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.P).sendRequest(tL_auth_acceptLoginToken, new e00(5, u1Var, (g) atVar.f45658c));
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
    public boolean L0(long j3) {
        return false;
    }

    @Override
    public void M(float f10, float f11) {
        org.telegram.ui.ActionBar.s4 s4Var;
        switch (this.f47359a) {
            case 14:
                s4Var = ((org.telegram.ui.ActionBar.h2) ((vw) this.f47360b).f52861o0).parentLayout;
                ((ActionBarLayout) s4Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void M0(int i7, int i10) {
        ((v4.i0) this.f47360b).p(i7, i10);
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        org.telegram.messenger.g0.h3(new ai.w0(this, i7, 22), 50L);
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        fg0 fg0Var = (fg0) this.f47360b;
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        fg0Var.d = I0;
        fg0Var.G.setPadding(I0.f15889a, I0.f15890b, I0.f15891c, I0.d);
        fg0Var.F.requestLayout();
        return r0.l1.f56257b;
    }

    @Override
    public boolean Q0(float f10, float f11) {
        switch (this.f47359a) {
            case 14:
                return ((vw) this.f47360b).f52861o0.isInPreviewMode();
            default:
                oe0 oe0Var = (oe0) this.f47360b;
                View view = null;
                oe0Var.P = null;
                int childCount = oe0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = oe0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f10 >= childAt.getLeft() && f10 <= childAt.getRight() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                            view = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view != null && !oe0Var.Q.contains(view)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public void Q1(org.telegram.ui.Cells.r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override
    public void R0(int i7, int i10) {
        f50 f50Var = (f50) this.f47360b;
        f50Var.X = i7;
        org.telegram.messenger.g0.Z3(f50Var.f47522b);
    }

    @Override
    public CharacterStyle R1(org.telegram.ui.Cells.r1 r1Var) {
        return null;
    }

    @Override
    public boolean S(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public boolean T1(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.fj fjVar) {
        return false;
    }

    @Override
    public boolean U(org.telegram.ui.Cells.r1 r1Var) {
        return false;
    }

    @Override
    public float U0() {
        return i5.c.d(9.66f, ri.a.d(((xd) this.f47360b).V0), 0);
    }

    @Override
    public boolean V0(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean W() {
        return false;
    }

    @Override
    public boolean Y0() {
        return false;
    }

    @Override
    public int Z() {
        return 0;
    }

    @Override
    public boolean Z0(View view, float f10, float f11) {
        switch (this.f47359a) {
            case 14:
                return false;
            default:
                oe0 oe0Var = (oe0) this.f47360b;
                oe0.l(oe0Var, view, f10, f11);
                org.telegram.messenger.g0.r(oe0Var.I);
                oe0.m(oe0Var);
                oe0.n(oe0Var, f10, true, false);
                oe0Var.invalidate();
                oe0Var.R.a(true, true);
                return true;
        }
    }

    @Override
    public boolean Z1(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void a(int i7, boolean z10) {
        boolean z11;
        switch (this.f47359a) {
            case 6:
                t5 t5Var = ((n5) this.f47360b).d;
                t5Var.f52166e0 = i7;
                t5Var.J0(true);
                return;
            case 9:
                sb sbVar = ((qb) this.f47360b).f51145f;
                sbVar.E = i7;
                sbVar.d(true);
                return;
            default:
                eu euVar = (eu) this.f47360b;
                if (euVar.f47315f[0].f46975f != i7) {
                    if (i7 == euVar.f47314e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    euVar.f47320x = z11;
                    du duVar = euVar.f47315f[1];
                    duVar.f46975f = i7;
                    duVar.setVisibility(0);
                    euVar.r0(true);
                    euVar.f47317r = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public void a0() {
        ((nh0) this.f47360b).a();
    }

    @Override
    public void a1() {
        ui uiVar = (ui) this.f47360b;
        View view = uiVar.f52556a;
        if (view != null) {
            view.setPressed(false);
            uiVar.f52556a.setSelected(false);
        }
        View view2 = uiVar.f52561n;
        if (view2 != null && !uiVar.d) {
            view2.callOnClick();
            uiVar.d = true;
        }
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public jh.a c0() {
        return null;
    }

    @Override
    public boolean c1(String str, j9 j9Var) {
        return false;
    }

    @Override
    public fr0 c2() {
        return null;
    }

    @Override
    public boolean d() {
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        qc qcVar = (qc) this.f47360b;
        i6Var = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
        if (i6Var != null) {
            i6Var2 = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
            return i6Var2.d();
        }
        return org.telegram.ui.ActionBar.n6.I.q();
    }

    @Override
    public boolean d0(org.telegram.ui.Cells.r1 r1Var) {
        return false;
    }

    @Override
    public void dismiss() {
        ((f50) this.f47360b).f47530x.dismiss();
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public boolean e0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void e1(View view, float f10, float f11) {
        switch (this.f47359a) {
            case 14:
                return;
            default:
                oe0 oe0Var = (oe0) this.f47360b;
                oe0.l(oe0Var, view, f10, f11);
                oe0.n(oe0Var, f10, false, false);
                oe0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean mo23f(float f10, float f11, int i7, View view) {
        c00 c00Var = (c00) this.f47360b;
        if (view instanceof org.telegram.ui.Cells.i7) {
            c00.a(c00Var, ((org.telegram.ui.Cells.i7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.l7) {
            c00.a(c00Var, ((org.telegram.ui.Cells.l7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.h7) {
            c00.a(c00Var, ((org.telegram.ui.Cells.h7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.i2) {
            c00.a(c00Var, ((org.telegram.ui.Cells.i2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.u2) {
                if (!c00Var.f46340p0.V1()) {
                    org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
                    if (u2Var.Z(f10)) {
                        c00Var.f46334j0.F(u2Var);
                        return true;
                    }
                }
                c00.a(c00Var, ((org.telegram.ui.Cells.u2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public TextureView f0() {
        return null;
    }

    @Override
    public boolean f1(org.telegram.messenger.fj fjVar) {
        return org.telegram.ui.Cells.c0.a(fjVar);
    }

    @Override
    public boolean f2(long j3) {
        return false;
    }

    @Override
    public void g(float f10) {
        switch (this.f47359a) {
            case 6:
            case 9:
                return;
            default:
                eu euVar = (eu) this.f47360b;
                int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i7 != 0 || euVar.f47315f[1].getVisibility() == 0) {
                    if (euVar.f47317r) {
                        du duVar = euVar.f47315f[0];
                        duVar.setTranslationX((-f10) * duVar.getMeasuredWidth());
                        du[] duVarArr = euVar.f47315f;
                        duVarArr[1].setTranslationX(duVarArr[0].getMeasuredWidth() - (f10 * euVar.f47315f[0].getMeasuredWidth()));
                    } else {
                        du duVar2 = euVar.f47315f[0];
                        duVar2.setTranslationX(duVar2.getMeasuredWidth() * f10);
                        du[] duVarArr2 = euVar.f47315f;
                        duVarArr2[1].setTranslationX((f10 * duVarArr2[0].getMeasuredWidth()) - euVar.f47315f[0].getMeasuredWidth());
                    }
                    if (i7 == 0) {
                        du[] duVarArr3 = euVar.f47315f;
                        du duVar3 = duVarArr3[0];
                        duVarArr3[0] = duVarArr3[1];
                        duVarArr3[1] = duVar3;
                        duVar3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void g0(int i7, int i10) {
        ((v4.i0) this.f47360b).o(i7, i10);
    }

    @Override
    public void g1(int i7, int i10) {
        ((v4.i0) this.f47360b).n(i7, i10, null);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f47359a) {
            case 3:
                c4 c4Var = (c4) this.f47360b;
                int i7 = c4Var.f46370b;
                return String.valueOf(Math.round((c4Var.f46369a.getProgress() * (c4Var.f46371c - i7)) + i7));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f47359a) {
            case 14:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public boolean h1(int i7, View view) {
        switch (this.f47359a) {
            case 6:
                return false;
            case 9:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean h2(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public String i(org.telegram.ui.Cells.r1 r1Var) {
        return null;
    }

    @Override
    public boolean i0() {
        return false;
    }

    @Override
    public void j() {
        ((c00) this.f47360b).f46334j0.finish();
    }

    @Override
    public int j1() {
        xd xdVar = (xd) this.f47360b;
        return xdVar.W0 + xdVar.X0;
    }

    @Override
    public int k0(org.telegram.ui.Cells.r1 r1Var) {
        return 0;
    }

    @Override
    public void l1(boolean z10) {
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        qc qcVar = (qc) this.f47360b;
        i6Var = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
        if (i6Var instanceof pc) {
            i6Var2 = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
            qc qcVar2 = ((pc) i6Var2).f50802a;
            qcVar2.K = !qcVar2.K;
            qcVar2.k1();
            qcVar2.g1(false);
        }
        qcVar.b1(d(), false);
        qcVar.g1(false);
    }

    @Override
    public void m() {
        org.telegram.messenger.t0.u();
        boolean z10 = org.telegram.messenger.s2.f26721a;
        org.telegram.messenger.t0.r();
        vf.c.t(((ib) this.f47360b).f48684n.getParentActivity(), org.telegram.messenger.s2.f26726g);
    }

    @Override
    public boolean m0() {
        switch (this.f47359a) {
            case 14:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean m1() {
        switch (this.f47359a) {
            case 14:
                return false;
            default:
                return true;
        }
    }

    @Override
    public void n(boolean z10, float f10) {
        int i7;
        String a02;
        switch (this.f47359a) {
            case 3:
                c4 c4Var = (c4) this.f47360b;
                int round = Math.round(((c4Var.f46371c - i7) * f10) + c4Var.f46370b);
                if (round != org.telegram.messenger.bz.Z0) {
                    org.telegram.messenger.bz.Z0 = round;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                    edit.putInt("iv_font_size", org.telegram.messenger.bz.Z0);
                    edit.commit();
                    c4Var.f46373f.f47899v0[0].getAdapter().E.clear();
                    g4 g4Var = c4Var.f46373f;
                    for (int i10 = 0; i10 < 2; i10++) {
                        g4Var.f47899v0[i10].f49136c.f();
                        e4 e4Var = g4Var.f47899v0[i10].f49136c;
                        ArrayList arrayList = e4Var.d;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i11);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.f22779e.a(e4Var.M);
                        Utilities.f22779e.d(e4Var.M, 100L);
                    }
                    c4Var.invalidate();
                    return;
                }
                return;
            case 4:
            default:
                x90 x90Var = (x90) this.f47360b;
                z90 z90Var = x90Var.E;
                int round2 = Math.round(f10 * 100.0f);
                if (round2 != org.telegram.messenger.pc.c()) {
                    org.telegram.messenger.pc.f26218g = c8.l9.b(round2, 0, 100);
                    org.telegram.messenger.pc.k();
                    org.telegram.messenger.pc.d(false);
                    z90Var.d0();
                    ArrayList arrayList2 = z90Var.f54462s;
                    if (arrayList2.isEmpty()) {
                        z90Var.c0();
                    } else if (arrayList2.size() >= 2) {
                        if (org.telegram.messenger.pc.c() <= 0) {
                            a02 = org.telegram.messenger.gd.M0(2131748679, null);
                        } else if (org.telegram.messenger.pc.c() >= 100) {
                            a02 = org.telegram.messenger.gd.M0(2131748678, null);
                        } else {
                            a02 = org.telegram.messenger.gd.a0(null, null, 2131748680, String.format("%d%%", Integer.valueOf(org.telegram.messenger.pc.c())));
                        }
                        arrayList2.set(1, new u90(2, 0, a02, 0, 0));
                        z90Var.d.g(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            x90Var.performHapticFeedback(3, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                h5.f48152o1 = f10;
                org.telegram.ui.Components.au0 au0Var = ((h5) this.f47360b).f48154m1;
                au0Var.K();
                au0Var.M();
                return;
        }
    }

    @Override
    public boolean n0() {
        return false;
    }

    @Override
    public void o(View view, float f10, float f11) {
        switch (this.f47359a) {
            case 14:
                return;
            default:
                oe0 oe0Var = (oe0) this.f47360b;
                oe0.l(oe0Var, view, f10, f11);
                oe0.n(oe0Var, f10, false, true);
                org.telegram.messenger.g0.h3(oe0Var.I, 450L);
                View view2 = oe0Var.P;
                if (view2 != null) {
                    view2.performClick();
                }
                oe0Var.P = null;
                oe0Var.invalidate();
                oe0Var.R.a(false, true);
                return;
        }
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        ui uiVar = (ui) this.f47360b;
        View view = uiVar.f52556a;
        if (view != null) {
            view.setPressed(true);
            uiVar.f52556a.setSelected(true);
            uiVar.f52556a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        ui uiVar = (ui) this.f47360b;
        bn bnVar = uiVar.f52565x;
        if (uiVar.f52556a != null) {
            bnVar.f46014g9 = org.telegram.ui.Components.i9.b(bnVar, uiVar.f52564w, bnVar.f46076l6, bnVar.d(), bnVar.Ba);
            org.telegram.ui.ActionBar.h1 h1Var = bnVar.f46014g9;
            if (h1Var != null) {
                uiVar.f52557b = h1Var;
                h1Var.setOnDismissListener(new e0(uiVar, 2));
                bnVar.A0.C0();
                bnVar.C0.R = false;
                View view = uiVar.f52564w;
                bnVar.Ub(view);
                if (view != bnVar.f46237y1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bnVar.x8(false, z10, 0.3f);
                bnVar.G9(false);
                nk nkVar = bnVar.O3;
                if (nkVar != null) {
                    nkVar.d(1, true);
                }
                UndoView undoView = bnVar.N3;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                rj rjVar = bnVar.f45923a0;
                if (rjVar != null && rjVar.getEditField() != null) {
                    bnVar.f45923a0.getEditField().setAllowDrawCursor(false);
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
        ui uiVar = (ui) this.f47360b;
        if (!uiVar.f52559e && (view = uiVar.f52556a) != null) {
            view.callOnClick();
            uiVar.f52559e = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean p0(org.telegram.ui.Components.x5 x5Var) {
        return false;
    }

    @Override
    public boolean p2(org.telegram.ui.Cells.r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void r(float f10) {
        ((c00) this.f47360b).f46334j0.o(f10);
    }

    @Override
    public int r0() {
        switch (this.f47359a) {
            case 3:
                c4 c4Var = (c4) this.f47360b;
                return c4Var.f46371c - c4Var.f46370b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public void t(float f10, float f11) {
        int i7 = this.f47359a;
    }

    @Override
    public void t0() {
        int i7 = this.f47359a;
    }

    @Override
    public void u() {
        qm0 qm0Var = (qm0) this.f47360b;
        if (qm0Var.f51246b.size() == 0) {
            qm0Var.R.setPivotX(0.0f);
            qm0Var.R.setPivotY(0.0f);
            qm0Var.b0(false);
            return;
        }
        qm0Var.R.invalidate();
        qm0Var.b0(true);
    }

    @Override
    public void v0(int i7, boolean z10, boolean z11) {
        qm0 qm0Var = (qm0) this.f47360b;
        qm0Var.removeSelfFromStack();
        if (!z10) {
            qm0Var.a0(qm0Var.f51246b, qm0Var.f51247c, z11, i7);
        }
    }

    @Override
    public boolean v2(int i7) {
        return false;
    }

    public void w1(rd0 rd0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        de0 de0Var = (de0) this.f47360b;
        de0Var.O = true;
        ee0 ee0Var = de0Var.f46878h0;
        ee0Var.K = 0;
        ee0Var.F1(0, false);
        int i7 = Build.VERSION.SDK_INT;
        if (org.telegram.messenger.g0.N1()) {
            if (ee0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (ee0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i7 >= 28 && ee0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (i7 >= 26 && ee0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                z14 = false;
            } else {
                z14 = true;
            }
            be0 be0Var = de0Var.f46866a;
            if (be0Var != null && "888".equals(be0Var.getText())) {
                z11 = true;
                z12 = true;
                z13 = true;
                z14 = true;
            }
            if (ee0Var.f47206w) {
                ee0Var.f47199r.clear();
                if (!z11) {
                    ee0Var.f47199r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z12) {
                    ee0Var.f47199r.add("android.permission.CALL_PHONE");
                }
                if (!z13) {
                    ee0Var.f47199r.add("android.permission.READ_CALL_LOG");
                }
                if (!z14 && i7 >= 26) {
                    ee0Var.f47199r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!ee0Var.f47199r.isEmpty()) {
                    SharedPreferences g12 = org.telegram.messenger.mp.g1();
                    if (!g12.getBoolean("firstlogin", true) && !ee0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !ee0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            ee0Var.getParentActivity().requestPermissions((String[]) ee0Var.f47199r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    g12.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ee0Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751760, "Continue"), null);
                    int i10 = 2131623958;
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                    if (!z11 && (!z12 || !z13)) {
                        u1Var.U = org.telegram.messenger.gd.M0(2131754272, "AllowReadCallAndLog");
                    } else if (z12 && z13) {
                        u1Var.U = org.telegram.messenger.gd.M0(2131754273, "AllowReadCall");
                        i10 = 2131624067;
                    } else {
                        u1Var.U = org.telegram.messenger.gd.M0(2131754271, "AllowReadCallLog");
                    }
                    int i11 = org.telegram.ui.ActionBar.n6.L5;
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.n6.x0(null, i11, false), null);
                    alertDialog$Builder.n(i11, null);
                    ee0Var.h = ee0Var.showDialog(u1Var);
                    de0Var.O = true;
                    return;
                }
            }
            z10 = true;
        } else {
            z10 = true;
        }
        ce0 ce0Var = new ce0(0, this, rd0Var);
        rd0Var.h.f(z10, z10);
        org.telegram.messenger.g0.h3(ce0Var, 400L);
    }

    @Override
    public void x(View view, float f10, float f11) {
        switch (this.f47359a) {
            case 14:
                return;
            default:
                oe0 oe0Var = (oe0) this.f47360b;
                oe0.l(oe0Var, view, f10, f11);
                oe0.n(oe0Var, f10, false, true);
                org.telegram.messenger.g0.h3(oe0Var.I, 450L);
                oe0Var.P = null;
                oe0Var.invalidate();
                oe0Var.R.a(false, true);
                return;
        }
    }

    @Override
    public void x0(String str) {
        ((bn) ((di.i4) this.f47360b).f9008c).Ga(str, false);
    }

    @Override
    public boolean x1() {
        return false;
    }

    @Override
    public boolean y0(org.telegram.messenger.fj fjVar) {
        return true;
    }

    public void y1(Exception exc) {
        ml0 ml0Var = (ml0) this.f47360b;
        if (ml0Var.R0) {
            return;
        }
        ml0Var.N0(true, false);
        ml0Var.J0(false);
        if (!(exc instanceof tc.a) && !(exc instanceof tc.b)) {
            org.telegram.ui.Components.b5.t0(exc.getMessage(), ml0Var);
        } else {
            org.telegram.ui.Components.b5.t0(org.telegram.messenger.gd.M0(2131747211, null), ml0Var);
        }
    }

    @Override
    public String z(long j3) {
        return null;
    }

    @Override
    public boolean z1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        return false;
    }

    @Override
    public org.telegram.ui.Cells.k9 z2() {
        return null;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        org.telegram.messenger.fj messageObject;
        lb lbVar = (lb) this.f47360b;
        if ((view instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject()) != null) {
            long j3 = messageObject.J0;
            if (j3 != -1) {
                if (lbVar.f49520q0.contains(Long.valueOf(j3))) {
                    lbVar.f49520q0.remove(Long.valueOf(messageObject.J0));
                } else {
                    lbVar.f49520q0.add(Long.valueOf(messageObject.J0));
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
    public void B(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void C1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void E(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void H(org.telegram.messenger.fj fjVar) {
    }

    @Override
    public void I0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void K(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void K0(int i7) {
    }

    @Override
    public void L(org.telegram.messenger.cj cjVar) {
    }

    @Override
    public void L1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void N0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void O1(org.telegram.messenger.fj fjVar) {
    }

    @Override
    public void P(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void R(org.telegram.messenger.fj fjVar) {
    }

    @Override
    public void S0(org.telegram.messenger.ur urVar) {
    }

    @Override
    public void W0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void X0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void Y(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void h0(int i7) {
    }

    @Override
    public void j2(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void k(uh0 uh0Var) {
    }

    @Override
    public void l0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void o0(String str) {
    }

    @Override
    public void q(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void q2(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void s(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void w(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void y(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void z0(org.telegram.ui.Cells.r1 r1Var) {
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
    public void Q() {
    }

    @Override
    public void U1() {
    }

    @Override
    public void b0() {
    }

    @Override
    public void c() {
    }

    @Override
    public void d1() {
    }

    @Override
    public void i1() {
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void s2() {
    }

    @Override
    public void v() {
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
    public void F1(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
    }

    @Override
    public void I(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.p2 p2Var) {
    }

    @Override
    public void I1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void K1(org.telegram.ui.Cells.r1 r1Var, int i7) {
    }

    @Override
    public void O0(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void V(boolean z10, boolean z11) {
    }

    @Override
    public void X1(org.telegram.ui.Cells.r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void a2(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.i10 i10Var) {
    }

    @Override
    public void e2(String str, String str2) {
    }

    @Override
    public void k1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void l2(org.telegram.ui.Cells.r1 r1Var, long j3) {
    }

    @Override
    public void p1(org.telegram.ui.Cells.r1 r1Var, int i7) {
    }

    private final void A1(View view, float f10, float f11) {
    }

    private final void D1(View view, float f10, float f11) {
    }

    private final void E1(View view, float f10, float f11) {
    }

    @Override
    public void B0(org.telegram.ui.Cells.r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B1(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public void C0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public void H0(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public void N(org.telegram.ui.Cells.r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void T0(org.telegram.ui.Cells.r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void j0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public void q0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }

    @Override
    public void t1(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public void y2(org.telegram.ui.Cells.r1 r1Var, int i7, int i10) {
    }

    @Override
    public void Y1(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void p(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void u0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void w0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void g2(org.telegram.ui.Cells.r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void l(org.telegram.ui.Cells.r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void t2(org.telegram.ui.Cells.r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void X(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void S1(org.telegram.messenger.fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
