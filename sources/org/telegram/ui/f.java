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
public final class f implements s9, dr0, org.telegram.ui.web.u0, org.telegram.ui.Components.zm0, org.telegram.ui.Components.z4, org.telegram.ui.Components.jl0, org.telegram.ui.Components.rj0, org.telegram.ui.Cells.m1, n71, org.telegram.ui.Components.pt0, ll, ue.a, org.telegram.ui.Components.tj0, org.telegram.ui.Cells.n7, org.telegram.ui.Components.po0, v4.e0, org.telegram.ui.Components.i8, org.telegram.ui.Components.k10, r0.m, gx0, zm0 {
    public final int f47650a;
    public final Object f47651b;

    public f(Object obj, int i7) {
        this.f47650a = i7;
        this.f47651b = obj;
    }

    @Override
    public void B(View view, float f10, float f11) {
        switch (this.f47650a) {
            case 14:
                return;
            default:
                ne0 ne0Var = (ne0) this.f47651b;
                ne0.l(ne0Var, view, f10, f11);
                ne0.n(ne0Var, f10, false, true);
                org.telegram.messenger.g0.h3(ne0Var.I, 450L);
                ne0Var.P = null;
                ne0Var.invalidate();
                ne0Var.R.a(false, true);
                return;
        }
    }

    @Override
    public void B0(int i7, int i10) {
        e50 e50Var = (e50) this.f47651b;
        e50Var.X = i7;
        org.telegram.messenger.g0.Z3(e50Var.f47437b);
    }

    @Override
    public org.telegram.ui.Cells.j9 B2() {
        return null;
    }

    @Override
    public String D(long j3) {
        return null;
    }

    @Override
    public void D0() {
        int i7 = this.f47650a;
    }

    @Override
    public void E(boolean z10) {
        Runnable runnable = ((xd) this.f47651b).T0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public boolean F0(org.telegram.messenger.fj fjVar) {
        return true;
    }

    @Override
    public void H(String str) {
        g gVar = (g) this.f47651b;
        gVar.finishFragment(false);
        zs zsVar = gVar.f48009y;
        LaunchActivity launchActivity = (LaunchActivity) zsVar.f54713b;
        String str2 = LaunchActivity.C1;
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, launchActivity, null);
        t1Var.f30091j0 = false;
        t1Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.P).sendRequest(tL_auth_acceptLoginToken, new d00(5, t1Var, (g) zsVar.f54714c));
    }

    @Override
    public boolean H1(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        org.telegram.messenger.g0.h3(new ai.u0(this, i7, 24), 50L);
    }

    @Override
    public boolean J1() {
        return false;
    }

    @Override
    public float K0() {
        return i5.c.d(9.66f, ri.a.d(((xd) this.f47651b).V0), 0);
    }

    @Override
    public boolean O0() {
        return false;
    }

    @Override
    public void P0() {
        int i7 = this.f47650a;
    }

    @Override
    public void Q() {
        ((lh0) this.f47651b).a();
    }

    @Override
    public void Q0() {
        ui uiVar = (ui) this.f47651b;
        View view = uiVar.f52667a;
        if (view != null) {
            view.setPressed(false);
            uiVar.f52667a.setSelected(false);
        }
        View view2 = uiVar.f52672n;
        if (view2 != null && !uiVar.d) {
            view2.callOnClick();
            uiVar.d = true;
        }
    }

    @Override
    public void Q1(org.telegram.ui.Cells.r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override
    public boolean R0(long j3) {
        return false;
    }

    @Override
    public CharacterStyle R1(org.telegram.ui.Cells.r1 r1Var) {
        return null;
    }

    @Override
    public TextureView T() {
        return null;
    }

    @Override
    public int T0() {
        xd xdVar = (xd) this.f47651b;
        return xdVar.W0 + xdVar.X0;
    }

    @Override
    public boolean T1(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.fj fjVar) {
        return false;
    }

    @Override
    public void U(float f10, float f11) {
        org.telegram.ui.ActionBar.r4 r4Var;
        switch (this.f47650a) {
            case 14:
                r4Var = ((org.telegram.ui.ActionBar.g2) ((uw) this.f47651b).f52741o0).parentLayout;
                ((ActionBarLayout) r4Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public boolean U0(View view) {
        return false;
    }

    @Override
    public void V(int i7, int i10) {
        ((v4.i0) this.f47651b).o(i7, i10);
    }

    @Override
    public void V0(int i7, int i10) {
        ((v4.i0) this.f47651b).n(i7, i10, null);
    }

    @Override
    public boolean X(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void X1(View view, float f10, float f11) {
        switch (this.f47650a) {
            case 14:
                return;
            default:
                ne0 ne0Var = (ne0) this.f47651b;
                ne0.l(ne0Var, view, f10, f11);
                ne0.n(ne0Var, f10, false, false);
                ne0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean Y() {
        return false;
    }

    @Override
    public boolean Y0(int i7, View view) {
        switch (this.f47650a) {
            case 6:
                return false;
            case 9:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Z(org.telegram.ui.Cells.r1 r1Var) {
        return false;
    }

    @Override
    public boolean Z0(String str, k9 k9Var) {
        return false;
    }

    @Override
    public void a(int i7, boolean z10) {
        boolean z11;
        switch (this.f47650a) {
            case 6:
                t5 t5Var = ((n5) this.f47651b).d;
                t5Var.f52247e0 = i7;
                t5Var.J0(true);
                return;
            case 9:
                sb sbVar = ((qb) this.f47651b).f51396f;
                sbVar.E = i7;
                sbVar.d(true);
                return;
            default:
                du duVar = (du) this.f47651b;
                if (duVar.f47231f[0].f46877f != i7) {
                    if (i7 == duVar.f47230e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    duVar.f47236x = z11;
                    cu cuVar = duVar.f47231f[1];
                    cuVar.f46877f = i7;
                    cuVar.setVisibility(0);
                    duVar.r0(true);
                    duVar.f47233r = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public int a0() {
        switch (this.f47650a) {
            case 3:
                c4 c4Var = (c4) this.f47651b;
                return c4Var.f46702c - c4Var.f46701b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public boolean a2(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean b() {
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        qc qcVar = (qc) this.f47651b;
        i6Var = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
        if (i6Var != null) {
            i6Var2 = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
            return i6Var2.b();
        }
        return org.telegram.ui.ActionBar.n6.I.q();
    }

    @Override
    public boolean b0() {
        return false;
    }

    @Override
    public void b1(boolean z10) {
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        qc qcVar = (qc) this.f47651b;
        i6Var = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
        if (i6Var instanceof pc) {
            i6Var2 = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
            qc qcVar2 = ((pc) i6Var2).f50967a;
            qcVar2.K = !qcVar2.K;
            qcVar2.k1();
            qcVar2.g1(false);
        }
        qcVar.b1(b(), false);
        qcVar.g1(false);
    }

    @Override
    public void c(float f10) {
        switch (this.f47650a) {
            case 6:
            case 9:
                return;
            default:
                du duVar = (du) this.f47651b;
                int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i7 != 0 || duVar.f47231f[1].getVisibility() == 0) {
                    if (duVar.f47233r) {
                        cu cuVar = duVar.f47231f[0];
                        cuVar.setTranslationX((-f10) * cuVar.getMeasuredWidth());
                        cu[] cuVarArr = duVar.f47231f;
                        cuVarArr[1].setTranslationX(cuVarArr[0].getMeasuredWidth() - (f10 * duVar.f47231f[0].getMeasuredWidth()));
                    } else {
                        cu cuVar2 = duVar.f47231f[0];
                        cuVar2.setTranslationX(cuVar2.getMeasuredWidth() * f10);
                        cu[] cuVarArr2 = duVar.f47231f;
                        cuVarArr2[1].setTranslationX((f10 * cuVarArr2[0].getMeasuredWidth()) - duVar.f47231f[0].getMeasuredWidth());
                    }
                    if (i7 == 0) {
                        cu[] cuVarArr3 = duVar.f47231f;
                        cu cuVar3 = cuVarArr3[0];
                        cuVarArr3[0] = cuVarArr3[1];
                        cuVarArr3[1] = cuVar3;
                        cuVar3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public boolean c1(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
        return false;
    }

    @Override
    public fr0 c2() {
        return null;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public void dismiss() {
        ((e50) this.f47651b).f47445x.dismiss();
    }

    @Override
    public int e0() {
        return 0;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean f2(long j3) {
        return false;
    }

    @Override
    public boolean mo24g(float f10, float f11, int i7, View view) {
        b00 b00Var = (b00) this.f47651b;
        if (view instanceof org.telegram.ui.Cells.h7) {
            b00.a(b00Var, ((org.telegram.ui.Cells.h7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.k7) {
            b00.a(b00Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.g7) {
            b00.a(b00Var, ((org.telegram.ui.Cells.g7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.i2) {
            b00.a(b00Var, ((org.telegram.ui.Cells.i2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.u2) {
                if (!b00Var.f45863p0.i0()) {
                    org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
                    if (u2Var.b0(f10)) {
                        b00Var.f45857j0.y(u2Var);
                        return true;
                    }
                }
                b00.a(b00Var, ((org.telegram.ui.Cells.u2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public void g0(int i7, boolean z10, boolean z11) {
        om0 om0Var = (om0) this.f47651b;
        om0Var.removeSelfFromStack();
        if (!z10) {
            om0Var.a0(om0Var.f50718b, om0Var.f50719c, z11, i7);
        }
    }

    @Override
    public boolean g1(org.telegram.messenger.fj fjVar) {
        return org.telegram.ui.Cells.c0.a(fjVar);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f47650a) {
            case 3:
                c4 c4Var = (c4) this.f47651b;
                int i7 = c4Var.f46701b;
                return String.valueOf(Math.round((c4Var.f46700a.getProgress() * (c4Var.f46702c - i7)) + i7));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f47650a) {
            case 14:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override
    public void h() {
        ((b00) this.f47651b).f45857j0.finish();
    }

    @Override
    public jh.a h0() {
        return null;
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public void i0(String str) {
        ((bn) ((di.i4) this.f47651b).f8999c).Ga(str, false);
    }

    @Override
    public void j(boolean z10, float f10) {
        int i7;
        String a02;
        switch (this.f47650a) {
            case 3:
                c4 c4Var = (c4) this.f47651b;
                int round = Math.round(((c4Var.f46702c - i7) * f10) + c4Var.f46701b);
                if (round != org.telegram.messenger.bz.Z0) {
                    org.telegram.messenger.bz.Z0 = round;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                    edit.putInt("iv_font_size", org.telegram.messenger.bz.Z0);
                    edit.commit();
                    c4Var.f46704f.f48084v0[0].getAdapter().E.clear();
                    g4 g4Var = c4Var.f46704f;
                    for (int i10 = 0; i10 < 2; i10++) {
                        g4Var.f48084v0[i10].f49289c.f();
                        e4 e4Var = g4Var.f48084v0[i10].f49289c;
                        ArrayList arrayList = e4Var.d;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i11);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.f22877e.a(e4Var.M);
                        Utilities.f22877e.d(e4Var.M, 100L);
                    }
                    c4Var.invalidate();
                    return;
                }
                return;
            case 4:
            default:
                w90 w90Var = (w90) this.f47651b;
                y90 y90Var = w90Var.E;
                int round2 = Math.round(f10 * 100.0f);
                if (round2 != org.telegram.messenger.pc.c()) {
                    org.telegram.messenger.pc.f26312g = c8.m9.b(round2, 0, 100);
                    org.telegram.messenger.pc.k();
                    org.telegram.messenger.pc.d(false);
                    y90Var.d0();
                    ArrayList arrayList2 = y90Var.f54325s;
                    if (arrayList2.isEmpty()) {
                        y90Var.c0();
                    } else if (arrayList2.size() >= 2) {
                        if (org.telegram.messenger.pc.c() <= 0) {
                            a02 = org.telegram.messenger.gd.N0(2131748678, null);
                        } else if (org.telegram.messenger.pc.c() >= 100) {
                            a02 = org.telegram.messenger.gd.N0(2131748677, null);
                        } else {
                            a02 = org.telegram.messenger.gd.a0(null, null, 2131748679, String.format("%d%%", Integer.valueOf(org.telegram.messenger.pc.c())));
                        }
                        arrayList2.set(1, new t90(2, 0, a02, 0, 0));
                        y90Var.d.g(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            w90Var.performHapticFeedback(3, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                h5.f48428o1 = f10;
                org.telegram.ui.Components.cu0 cu0Var = ((h5) this.f47651b).f48430m1;
                cu0Var.K();
                cu0Var.M();
                return;
        }
    }

    @Override
    public boolean j0(org.telegram.ui.Cells.r1 r1Var) {
        return false;
    }

    @Override
    public boolean j2(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public String k(org.telegram.ui.Cells.r1 r1Var) {
        return null;
    }

    @Override
    public boolean k0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void l(float f10) {
        ((b00) this.f47651b).f45857j0.v(f10);
    }

    @Override
    public void l0() {
        if (org.telegram.messenger.g0.G3()) {
            ((e40) this.f47651b).o1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        dg0 dg0Var = (dg0) this.f47651b;
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        dg0Var.d = I0;
        dg0Var.G.setPadding(I0.f15978a, I0.f15979b, I0.f15980c, I0.d);
        dg0Var.F.requestLayout();
        return r0.l1.f56380b;
    }

    @Override
    public boolean n0() {
        return false;
    }

    @Override
    public void o() {
        om0 om0Var = (om0) this.f47651b;
        if (om0Var.f50718b.size() == 0) {
            om0Var.R.setPivotX(0.0f);
            om0Var.R.setPivotY(0.0f);
            om0Var.b0(false);
            return;
        }
        om0Var.R.invalidate();
        om0Var.b0(true);
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        ui uiVar = (ui) this.f47651b;
        View view = uiVar.f52667a;
        if (view != null) {
            view.setPressed(true);
            uiVar.f52667a.setSelected(true);
            uiVar.f52667a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        ui uiVar = (ui) this.f47651b;
        bn bnVar = uiVar.f52676x;
        if (uiVar.f52667a != null) {
            bnVar.f46209g9 = org.telegram.ui.Components.h9.b(bnVar, uiVar.f52675w, bnVar.f46271l6, bnVar.b(), bnVar.Ba);
            org.telegram.ui.ActionBar.g1 g1Var = bnVar.f46209g9;
            if (g1Var != null) {
                uiVar.f52668b = g1Var;
                g1Var.setOnDismissListener(new d0(uiVar, 2));
                bnVar.A0.C0();
                bnVar.C0.R = false;
                View view = uiVar.f52675w;
                bnVar.Ub(view);
                if (view != bnVar.f46432y1) {
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
                rj rjVar = bnVar.f46118a0;
                if (rjVar != null && rjVar.getEditField() != null) {
                    bnVar.f46118a0.getEditField().setAllowDrawCursor(false);
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
        ui uiVar = (ui) this.f47651b;
        if (!uiVar.f52670e && (view = uiVar.f52667a) != null) {
            view.callOnClick();
            uiVar.f52670e = true;
            return true;
        }
        return false;
    }

    @Override
    public void p() {
        org.telegram.messenger.t0.u();
        boolean z10 = org.telegram.messenger.s2.f26829a;
        org.telegram.messenger.t0.r();
        vf.c.t(((ib) this.f47651b).f48771n.getParentActivity(), org.telegram.messenger.s2.f26834g);
    }

    @Override
    public int p0(org.telegram.ui.Cells.r1 r1Var) {
        return 0;
    }

    @Override
    public boolean p2(org.telegram.ui.Cells.r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean q1(float f10, float f11) {
        switch (this.f47650a) {
            case 14:
                return ((uw) this.f47651b).f52741o0.isInPreviewMode();
            default:
                ne0 ne0Var = (ne0) this.f47651b;
                View view = null;
                ne0Var.P = null;
                int childCount = ne0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = ne0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f10 >= childAt.getLeft() && f10 <= childAt.getRight() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                            view = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view != null && !ne0Var.Q.contains(view)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public void r(View view, float f10, float f11) {
        switch (this.f47650a) {
            case 14:
                return;
            default:
                ne0 ne0Var = (ne0) this.f47651b;
                ne0.l(ne0Var, view, f10, f11);
                ne0.n(ne0Var, f10, false, true);
                org.telegram.messenger.g0.h3(ne0Var.I, 450L);
                View view2 = ne0Var.P;
                if (view2 != null) {
                    view2.performClick();
                }
                ne0Var.P = null;
                ne0Var.invalidate();
                ne0Var.R.a(false, true);
                return;
        }
    }

    @Override
    public boolean r0() {
        return false;
    }

    @Override
    public boolean r1(View view, float f10, float f11) {
        switch (this.f47650a) {
            case 14:
                return false;
            default:
                ne0 ne0Var = (ne0) this.f47651b;
                ne0.l(ne0Var, view, f10, f11);
                org.telegram.messenger.g0.r(ne0Var.I);
                ne0.m(ne0Var);
                ne0.n(ne0Var, f10, true, false);
                ne0Var.invalidate();
                ne0Var.R.a(true, true);
                return true;
        }
    }

    @Override
    public boolean r2() {
        switch (this.f47650a) {
            case 14:
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean s0() {
        switch (this.f47650a) {
            case 14:
                return true;
            default:
                return false;
        }
    }

    @Override
    public void u(float f10, float f11) {
        int i7 = this.f47650a;
    }

    @Override
    public void u0(org.telegram.messenger.fj fjVar) {
        k3 k3Var = ((g4) this.f47651b).f48084v0[0];
        if (k3Var != null) {
            k3Var.f49288b.I0(true);
        }
    }

    public void u1(pd0 pd0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ce0 ce0Var = (ce0) this.f47651b;
        ce0Var.O = true;
        de0 de0Var = ce0Var.f46781h0;
        de0Var.K = 0;
        de0Var.F1(0, false);
        int i7 = Build.VERSION.SDK_INT;
        if (org.telegram.messenger.g0.N1()) {
            if (de0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (de0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i7 >= 28 && de0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (i7 >= 26 && de0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                z14 = false;
            } else {
                z14 = true;
            }
            ae0 ae0Var = ce0Var.f46769a;
            if (ae0Var != null && "888".equals(ae0Var.getText())) {
                z11 = true;
                z12 = true;
                z13 = true;
                z14 = true;
            }
            if (de0Var.f47078w) {
                de0Var.f47071r.clear();
                if (!z11) {
                    de0Var.f47071r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z12) {
                    de0Var.f47071r.add("android.permission.CALL_PHONE");
                }
                if (!z13) {
                    de0Var.f47071r.add("android.permission.READ_CALL_LOG");
                }
                if (!z14 && i7 >= 26) {
                    de0Var.f47071r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!de0Var.f47071r.isEmpty()) {
                    SharedPreferences g12 = org.telegram.messenger.mp.g1();
                    if (!g12.getBoolean("firstlogin", true) && !de0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !de0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            de0Var.getParentActivity().requestPermissions((String[]) de0Var.f47071r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    g12.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751759, "Continue"), null);
                    int i10 = 2131623958;
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    if (!z11 && (!z12 || !z13)) {
                        t1Var.U = org.telegram.messenger.gd.N0(2131754271, "AllowReadCallAndLog");
                    } else if (z12 && z13) {
                        t1Var.U = org.telegram.messenger.gd.N0(2131754272, "AllowReadCall");
                        i10 = 2131624067;
                    } else {
                        t1Var.U = org.telegram.messenger.gd.N0(2131754270, "AllowReadCallLog");
                    }
                    int i11 = org.telegram.ui.ActionBar.n6.L5;
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.n6.x0(null, i11, false), null);
                    alertDialog$Builder.n(i11, null);
                    de0Var.h = de0Var.showDialog(t1Var);
                    ce0Var.O = true;
                    return;
                }
            }
            z10 = true;
        } else {
            z10 = true;
        }
        be0 be0Var = new be0(0, this, pd0Var);
        pd0Var.h.f(z10, z10);
        org.telegram.messenger.g0.h3(be0Var, 400L);
    }

    @Override
    public void v(Editable editable) {
        om0 om0Var = (om0) this.f47651b;
        org.telegram.ui.Components.wt wtVar = om0Var.N;
        om0Var.f50717a = editable;
        wtVar.setText(editable);
    }

    @Override
    public boolean v0(org.telegram.ui.Components.x5 x5Var) {
        return false;
    }

    public void v1(Exception exc) {
        kl0 kl0Var = (kl0) this.f47651b;
        if (kl0Var.R0) {
            return;
        }
        kl0Var.N0(true, false);
        kl0Var.J0(false);
        if (!(exc instanceof tc.a) && !(exc instanceof tc.b)) {
            org.telegram.ui.Components.b5.t0(exc.getMessage(), kl0Var);
        } else {
            org.telegram.ui.Components.b5.t0(org.telegram.messenger.gd.N0(2131747210, null), kl0Var);
        }
    }

    @Override
    public void w() {
        switch (this.f47650a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((h5) this.f47651b).f48430m1.M();
                return;
        }
    }

    @Override
    public String w0() {
        return null;
    }

    @Override
    public boolean x1() {
        return false;
    }

    @Override
    public void y() {
        int i7 = this.f47650a;
    }

    @Override
    public void y0(int i7, int i10) {
        ((v4.i0) this.f47651b).p(i7, i10);
    }

    @Override
    public boolean y2(int i7) {
        return false;
    }

    @Override
    public void z(int i7, int i10) {
        ((v4.i0) this.f47651b).j(i7, i10);
    }

    @Override
    public boolean z1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        return false;
    }

    @Override
    public void g(float f10, float f11, int i7, View view) {
        org.telegram.messenger.fj messageObject;
        lb lbVar = (lb) this.f47651b;
        if ((view instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject()) != null) {
            long j3 = messageObject.J0;
            if (j3 != -1) {
                if (lbVar.f49699q0.contains(Long.valueOf(j3))) {
                    lbVar.f49699q0.remove(Long.valueOf(messageObject.J0));
                } else {
                    lbVar.f49699q0.add(Long.valueOf(messageObject.J0));
                }
                lbVar.b1(true);
                lbVar.W0();
                lbVar.F.f();
                return;
            }
        }
        lbVar.U0(view, f10, f11);
    }

    private final void D1(float f10) {
    }

    private final void E1(float f10) {
    }

    @Override
    public void A(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void C(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void C1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void E0(org.telegram.messenger.ur urVar) {
    }

    @Override
    public void F(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void G(org.telegram.messenger.fj fjVar) {
    }

    @Override
    public void G0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void J(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void L0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void L1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void M(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void N0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void O(org.telegram.messenger.cj cjVar) {
    }

    @Override
    public void O1(org.telegram.messenger.fj fjVar) {
    }

    @Override
    public void R(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void S0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void W(org.telegram.messenger.fj fjVar) {
    }

    @Override
    public void d0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void e1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void f1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void k2(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void m0(int i7) {
    }

    @Override
    public void n(sh0 sh0Var) {
    }

    @Override
    public void q0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void q2(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void s(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void t(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override
    public void t0(String str) {
    }

    @Override
    public void z0(int i7) {
    }

    private final void G1() {
    }

    private final void M1() {
    }

    private final void N1() {
    }

    private final void P1() {
    }

    private final void V1() {
    }

    private final void h1() {
    }

    private final void i1() {
    }

    private final void o1() {
    }

    private final void s1() {
    }

    @Override
    public void H0() {
    }

    @Override
    public void K() {
    }

    @Override
    public void S() {
    }

    @Override
    public void U1() {
    }

    @Override
    public void X0() {
    }

    @Override
    public void e() {
    }

    @Override
    public void k1() {
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void u2() {
    }

    @Override
    public void x() {
    }

    @Override
    public void z2() {
    }

    private final void d1(float f10, float f11) {
    }

    private final void j1(float f10, float f11) {
    }

    private final void n1(float f10, float f11) {
    }

    @Override
    public void F1(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
    }

    @Override
    public void I1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void K1(org.telegram.ui.Cells.r1 r1Var, int i7) {
    }

    @Override
    public void L(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.p2 p2Var) {
    }

    @Override
    public void N(boolean z10, boolean z11) {
    }

    @Override
    public void W0(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void Y1(org.telegram.ui.Cells.r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void b2(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.h10 h10Var) {
    }

    @Override
    public void e2(String str, String str2) {
    }

    @Override
    public void l2(org.telegram.ui.Cells.r1 r1Var, long j3) {
    }

    @Override
    public void m1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void p1(org.telegram.ui.Cells.r1 r1Var, int i7) {
    }

    private final void A1(View view, float f10, float f11) {
    }

    private final void w1(View view, float f10, float f11) {
    }

    private final void y1(View view, float f10, float f11) {
    }

    @Override
    public void A2(org.telegram.ui.Cells.r1 r1Var, int i7, int i10) {
    }

    @Override
    public void B1(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public void I0(org.telegram.ui.Cells.r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void J0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public void M0(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public void P(org.telegram.ui.Cells.r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void a1(org.telegram.ui.Cells.r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(View view, float f10, float f11) {
    }

    @Override
    public void o0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public void t1(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public void x0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override
    public void A0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void C0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void Z1(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void q(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void g2(org.telegram.ui.Cells.r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void m(org.telegram.ui.Cells.r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void w2(org.telegram.ui.Cells.r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void c0(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void S1(org.telegram.messenger.fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
