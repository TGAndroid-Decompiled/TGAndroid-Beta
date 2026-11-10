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
public final class f implements r9, gr0, org.telegram.ui.web.w0, org.telegram.ui.Components.lm0, org.telegram.ui.Components.s4, org.telegram.ui.Components.uk0, org.telegram.ui.Components.cj0, org.telegram.ui.Cells.l1, p71, org.telegram.ui.Components.ft0, ml, ue.a, org.telegram.ui.Components.ej0, org.telegram.ui.Cells.n7, org.telegram.ui.Components.co0, v4.d0, org.telegram.ui.Components.e8, org.telegram.ui.Components.y00, r0.m, kx0, zm0 {
    public final int f45463a;
    public final Object f45464b;

    public f(Object obj, int i7) {
        this.f45463a = i7;
        this.f45464b = obj;
    }

    @Override
    public void A() {
        pm0 pm0Var = (pm0) this.f45464b;
        if (pm0Var.f48794b.size() == 0) {
            pm0Var.Q.setPivotX(0.0f);
            pm0Var.Q.setPivotY(0.0f);
            pm0Var.b0(false);
            return;
        }
        pm0Var.Q.invalidate();
        pm0Var.b0(true);
    }

    @Override
    public void B(Editable editable) {
        pm0 pm0Var = (pm0) this.f45464b;
        org.telegram.ui.Components.kt ktVar = pm0Var.M;
        pm0Var.f48793a = editable;
        ktVar.setText(editable);
    }

    @Override
    public void B1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override
    public void C0() {
        if (org.telegram.messenger.g0.I3()) {
            ((f40) this.f45464b).n1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public CharacterStyle C1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public void D() {
        switch (this.f45463a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((h5) this.f45464b).l1.M();
                return;
        }
    }

    @Override
    public void E(int i7, int i10) {
        ((v4.g0) this.f45464b).j(i7, i10);
    }

    @Override
    public boolean E1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.ij ijVar) {
        return false;
    }

    @Override
    public void F(boolean z9) {
        Runnable runnable = ((zd) this.f45464b).S0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void F0(float f10) {
        switch (this.f45463a) {
            case 6:
            case 9:
                return;
            default:
                du duVar = (du) this.f45464b;
                int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i7 != 0 || duVar.f45054f[1].getVisibility() == 0) {
                    if (duVar.f45056r) {
                        cu cuVar = duVar.f45054f[0];
                        cuVar.setTranslationX((-f10) * cuVar.getMeasuredWidth());
                        cu[] cuVarArr = duVar.f45054f;
                        cuVarArr[1].setTranslationX(cuVarArr[0].getMeasuredWidth() - (f10 * duVar.f45054f[0].getMeasuredWidth()));
                    } else {
                        cu cuVar2 = duVar.f45054f[0];
                        cuVar2.setTranslationX(cuVar2.getMeasuredWidth() * f10);
                        cu[] cuVarArr2 = duVar.f45054f;
                        cuVarArr2[1].setTranslationX((f10 * cuVarArr2[0].getMeasuredWidth()) - duVar.f45054f[0].getMeasuredWidth());
                    }
                    if (i7 == 0) {
                        cu[] cuVarArr3 = duVar.f45054f;
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
    public void H0() {
        int i7 = this.f45463a;
    }

    @Override
    public void I0(org.telegram.messenger.ij ijVar) {
        k3 k3Var = ((g4) this.f45464b).f45971u0[0];
        if (k3Var != null) {
            k3Var.f47142b.I0(true);
        }
    }

    @Override
    public boolean J0(long j3) {
        return false;
    }

    @Override
    public boolean J1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        org.telegram.messenger.g0.i3(new bg.m0(this, i7, 18), 50L);
    }

    @Override
    public void M(String str) {
        g gVar = (g) this.f45464b;
        gVar.finishFragment(false);
        su suVar = gVar.f45891y;
        LaunchActivity launchActivity = (LaunchActivity) suVar.f49958b;
        String str2 = LaunchActivity.B1;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, launchActivity, null);
        u1Var.f28558i0 = false;
        u1Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new k50(3, u1Var, (g) suVar.f49959c));
    }

    @Override
    public void M0(int i7, int i10) {
        ((v4.g0) this.f45464b).p(i7, i10);
    }

    @Override
    public ir0 N1() {
        return null;
    }

    @Override
    public void O(float f10, float f11) {
        org.telegram.ui.ActionBar.r4 r4Var;
        switch (this.f45463a) {
            case 14:
                r4Var = ((org.telegram.ui.ActionBar.f2) ((sw) this.f45464b).f49970n0).parentLayout;
                ((ActionBarLayout) r4Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public boolean O0(org.telegram.ui.Cells.q1 q1Var, boolean z9) {
        return false;
    }

    @Override
    public boolean Q(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z9) {
        return false;
    }

    @Override
    public boolean Q1(long j3) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public String R0() {
        return null;
    }

    @Override
    public boolean S(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        eg0 eg0Var = (eg0) this.f45464b;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        eg0Var.d = I0;
        eg0Var.F.setPadding(I0.f15122a, I0.f15123b, I0.f15124c, I0.d);
        eg0Var.E.requestLayout();
        return r0.k1.f54212b;
    }

    @Override
    public boolean S1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public boolean U0(float f10, float f11) {
        switch (this.f45463a) {
            case 14:
                return ((sw) this.f45464b).f49970n0.isInPreviewMode();
            default:
                oe0 oe0Var = (oe0) this.f45464b;
                View view = null;
                oe0Var.O = null;
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
                if (view != null && !oe0Var.P.contains(view)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public boolean W0(org.telegram.messenger.ij ijVar) {
        return org.telegram.ui.Cells.f1.a(ijVar);
    }

    @Override
    public int X() {
        return 0;
    }

    @Override
    public void X0(int i7, int i10) {
        g50 g50Var = (g50) this.f45464b;
        g50Var.W = i7;
        org.telegram.messenger.g0.b4(g50Var.f45979b);
    }

    public void X1(sd0 sd0Var) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ee0 ee0Var = (ee0) this.f45464b;
        ee0Var.N = true;
        fe0 fe0Var = ee0Var.f45255g0;
        fe0Var.J = 0;
        fe0Var.F1(0, false);
        int i7 = Build.VERSION.SDK_INT;
        if (org.telegram.messenger.g0.N1()) {
            if (fe0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (fe0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i7 >= 28 && fe0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (i7 >= 26 && fe0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                z13 = false;
            } else {
                z13 = true;
            }
            ce0 ce0Var = ee0Var.f45244a;
            if (ce0Var != null && "888".equals(ce0Var.getText())) {
                z10 = true;
                z11 = true;
                z12 = true;
                z13 = true;
            }
            if (fe0Var.f45721w) {
                fe0Var.f45714r.clear();
                if (!z10) {
                    fe0Var.f45714r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z11) {
                    fe0Var.f45714r.add("android.permission.CALL_PHONE");
                }
                if (!z12) {
                    fe0Var.f45714r.add("android.permission.READ_CALL_LOG");
                }
                if (!z13 && i7 >= 26) {
                    fe0Var.f45714r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!fe0Var.f45714r.isEmpty()) {
                    SharedPreferences e12 = org.telegram.messenger.qp.e1();
                    if (!e12.getBoolean("firstlogin", true) && !fe0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !fe0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            fe0Var.getParentActivity().requestPermissions((String[]) fe0Var.f45714r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    e12.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fe0Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, "Continue"), null);
                    int i10 = 2131623958;
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                    if (!z10 && (!z11 || !z12)) {
                        u1Var.T = org.telegram.messenger.id.M0(2131754274, "AllowReadCallAndLog");
                    } else if (z11 && z12) {
                        u1Var.T = org.telegram.messenger.id.M0(2131754275, "AllowReadCall");
                        i10 = 2131624066;
                    } else {
                        u1Var.T = org.telegram.messenger.id.M0(2131754273, "AllowReadCallLog");
                    }
                    int i11 = org.telegram.ui.ActionBar.m6.L5;
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.m6.x0(null, i11, false), null);
                    alertDialog$Builder.n(i11, null);
                    fe0Var.h = fe0Var.showDialog(u1Var);
                    ee0Var.N = true;
                    return;
                }
            }
            z9 = true;
        } else {
            z9 = true;
        }
        de0 de0Var = new de0(0, this, sd0Var);
        sd0Var.h.f(z9, z9);
        org.telegram.messenger.g0.i3(de0Var, 400L);
    }

    @Override
    public float Y0() {
        return jg.g.e(9.66f, oi.a.d(((zd) this.f45464b).U0), 0);
    }

    public void Y1(Exception exc) {
        kl0 kl0Var = (kl0) this.f45464b;
        if (kl0Var.Q0) {
            return;
        }
        kl0Var.N0(true, false);
        kl0Var.J0(false);
        if (!(exc instanceof tc.a) && !(exc instanceof tc.b)) {
            org.telegram.ui.Components.u4.t0(exc.getMessage(), kl0Var);
        } else {
            org.telegram.ui.Components.u4.t0(org.telegram.messenger.id.M0(2131747404, null), kl0Var);
        }
    }

    @Override
    public jh.a Z() {
        return null;
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        rc rcVar = (rc) this.f45464b;
        h6Var = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
        if (h6Var != null) {
            h6Var2 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            return h6Var2.a();
        }
        return org.telegram.ui.ActionBar.m6.I.q();
    }

    @Override
    public boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public boolean a1() {
        return false;
    }

    @Override
    public void b(int i7, boolean z9) {
        boolean z10;
        switch (this.f45463a) {
            case 6:
                t5 t5Var = ((n5) this.f45464b).d;
                t5Var.f50118d0 = i7;
                t5Var.J0(true);
                return;
            case 9:
                tb tbVar = ((rb) this.f45464b).f49331f;
                tbVar.D = i7;
                tbVar.d(true);
                return;
            default:
                du duVar = (du) this.f45464b;
                if (duVar.f45054f[0].f44811f != i7) {
                    if (i7 == duVar.f45053e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    duVar.f45059x = z10;
                    cu cuVar = duVar.f45054f[1];
                    cuVar.f44811f = i7;
                    cuVar.setVisibility(0);
                    duVar.r0(true);
                    duVar.f45056r = z9;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean b0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean b2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void c() {
        int i7 = this.f45463a;
    }

    @Override
    public void c0() {
        ((kh0) this.f45464b).a();
    }

    @Override
    public boolean c1(View view, float f10, float f11) {
        switch (this.f45463a) {
            case 14:
                return false;
            default:
                oe0 oe0Var = (oe0) this.f45464b;
                oe0.k(oe0Var, view, f10, f11);
                org.telegram.messenger.g0.r(oe0Var.H);
                oe0.l(oe0Var);
                oe0.m(oe0Var, f10, true, false);
                oe0Var.invalidate();
                oe0Var.Q.a(true, true);
                return true;
        }
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public void d1() {
        vi viVar = (vi) this.f45464b;
        View view = viVar.f50738a;
        if (view != null) {
            view.setPressed(false);
            viVar.f50738a.setSelected(false);
        }
        View view2 = viVar.f50743n;
        if (view2 != null && !viVar.d) {
            view2.callOnClick();
            viVar.d = true;
        }
    }

    @Override
    public void dismiss() {
        ((g50) this.f45464b).f45987x.dismiss();
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public int e1() {
        zd zdVar = (zd) this.f45464b;
        return zdVar.V0 + zdVar.W0;
    }

    @Override
    public boolean mo19f(float f10, float f11, int i7, View view) {
        b00 b00Var = (b00) this.f45464b;
        if (view instanceof org.telegram.ui.Cells.h7) {
            b00.a(b00Var, ((org.telegram.ui.Cells.h7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.k7) {
            b00.a(b00Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.g7) {
            b00.a(b00Var, ((org.telegram.ui.Cells.g7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.h2) {
            b00.a(b00Var, ((org.telegram.ui.Cells.h2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.t2) {
                if (!b00Var.f43879o0.i()) {
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                    if (t2Var.Z(f10)) {
                        b00Var.f43873i0.O(t2Var);
                        return true;
                    }
                }
                b00.a(b00Var, ((org.telegram.ui.Cells.t2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public boolean g2(int i7) {
        return false;
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f45463a) {
            case 3:
                c4 c4Var = (c4) this.f45464b;
                int i7 = c4Var.f44216b;
                return String.valueOf(Math.round((c4Var.f44215a.getProgress() * (c4Var.f44217c - i7)) + i7));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f45463a) {
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
    public int h0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override
    public boolean h1(String str, j9 j9Var) {
        return false;
    }

    @Override
    public void i() {
        ((b00) this.f45464b).f43873i0.finish();
    }

    @Override
    public boolean j0() {
        switch (this.f45463a) {
            case 14:
                return true;
            default:
                return false;
        }
    }

    @Override
    public void k() {
        org.telegram.messenger.t0.u();
        boolean z9 = org.telegram.messenger.r2.f25216a;
        org.telegram.messenger.t0.r();
        vf.c.t(((jb) this.f45464b).f46893n.getParentActivity(), org.telegram.messenger.r2.f25221g);
    }

    @Override
    public boolean k0() {
        return false;
    }

    @Override
    public void k1(int i7, int i10) {
        ((v4.g0) this.f45464b).n(i7, i10, null);
    }

    @Override
    public org.telegram.ui.Cells.j9 k2() {
        return null;
    }

    @Override
    public void l(boolean z9, float f10) {
        int i7;
        String a02;
        switch (this.f45463a) {
            case 3:
                c4 c4Var = (c4) this.f45464b;
                int round = Math.round(((c4Var.f44217c - i7) * f10) + c4Var.f44216b);
                if (round != org.telegram.messenger.iz.Z0) {
                    org.telegram.messenger.iz.Z0 = round;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    edit.putInt("iv_font_size", org.telegram.messenger.iz.Z0);
                    edit.commit();
                    c4Var.f44219f.f45971u0[0].getAdapter().D.clear();
                    g4 g4Var = c4Var.f44219f;
                    for (int i10 = 0; i10 < 2; i10++) {
                        g4Var.f45971u0[i10].f47143c.f();
                        e4 e4Var = g4Var.f45971u0[i10].f47143c;
                        ArrayList arrayList = e4Var.d;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i11);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.f21341e.a(e4Var.L);
                        Utilities.f21341e.d(e4Var.L, 100L);
                    }
                    c4Var.invalidate();
                    return;
                }
                return;
            case 4:
            default:
                x90 x90Var = (x90) this.f45464b;
                z90 z90Var = x90Var.D;
                int round2 = Math.round(f10 * 100.0f);
                if (round2 != org.telegram.messenger.sc.c()) {
                    org.telegram.messenger.sc.f25452g = c8.j9.b(round2, 0, 100);
                    org.telegram.messenger.sc.k();
                    org.telegram.messenger.sc.d(false);
                    z90Var.d0();
                    ArrayList arrayList2 = z90Var.f52341s;
                    if (arrayList2.isEmpty()) {
                        z90Var.c0();
                    } else if (arrayList2.size() >= 2) {
                        if (org.telegram.messenger.sc.c() <= 0) {
                            a02 = org.telegram.messenger.id.M0(2131748871, null);
                        } else if (org.telegram.messenger.sc.c() >= 100) {
                            a02 = org.telegram.messenger.id.M0(2131748870, null);
                        } else {
                            a02 = org.telegram.messenger.id.a0(null, null, 2131748872, String.format("%d%%", Integer.valueOf(org.telegram.messenger.sc.c())));
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
                h5.n1 = f10;
                org.telegram.ui.Components.st0 st0Var = ((h5) this.f45464b).l1;
                st0Var.L();
                st0Var.M();
                return;
        }
    }

    @Override
    public TextureView l0() {
        return null;
    }

    @Override
    public void l1(View view, float f10, float f11) {
        switch (this.f45463a) {
            case 14:
                return;
            default:
                oe0 oe0Var = (oe0) this.f45464b;
                oe0.k(oe0Var, view, f10, f11);
                oe0.m(oe0Var, f10, false, false);
                oe0Var.invalidate();
                return;
        }
    }

    @Override
    public void m(View view, float f10, float f11) {
        switch (this.f45463a) {
            case 14:
                return;
            default:
                oe0 oe0Var = (oe0) this.f45464b;
                oe0.k(oe0Var, view, f10, f11);
                oe0.m(oe0Var, f10, false, true);
                org.telegram.messenger.g0.i3(oe0Var.H, 450L);
                View view2 = oe0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                oe0Var.O = null;
                oe0Var.invalidate();
                oe0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public boolean m1(int i7, View view) {
        switch (this.f45463a) {
            case 6:
                return false;
            case 9:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean n0(org.telegram.ui.Components.q5 q5Var) {
        return false;
    }

    @Override
    public boolean n1() {
        return false;
    }

    @Override
    public void o0(int i7, int i10) {
        ((v4.g0) this.f45464b).o(i7, i10);
    }

    @Override
    public boolean o1() {
        switch (this.f45463a) {
            case 14:
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        vi viVar = (vi) this.f45464b;
        View view = viVar.f50738a;
        if (view != null) {
            view.setPressed(true);
            viVar.f50738a.setSelected(true);
            viVar.f50738a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        boolean z9;
        vi viVar = (vi) this.f45464b;
        cn cnVar = viVar.f50747x;
        if (viVar.f50738a != null) {
            cnVar.f44483e9 = org.telegram.ui.Components.c9.b(cnVar, viVar.f50746w, cnVar.f44545j6, cnVar.b(), cnVar.f44750za);
            org.telegram.ui.ActionBar.g1 g1Var = cnVar.f44483e9;
            if (g1Var != null) {
                viVar.f50739b = g1Var;
                g1Var.setOnDismissListener(new e0(viVar, 2));
                cnVar.f44741z0.C0();
                cnVar.B0.R = false;
                View view = viVar.f50746w;
                cnVar.Tb(view);
                if (view != cnVar.f44717x1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                cnVar.w8(false, z9, 0.3f);
                cnVar.F9(false);
                ok okVar = cnVar.N3;
                if (okVar != null) {
                    okVar.d(1, true);
                }
                UndoView undoView = cnVar.M3;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                sj sjVar = cnVar.Z;
                if (sjVar != null && sjVar.getEditField() != null) {
                    cnVar.Z.getEditField().setAllowDrawCursor(false);
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
        vi viVar = (vi) this.f45464b;
        if (!viVar.f50741e && (view = viVar.f50738a) != null) {
            view.callOnClick();
            viVar.f50741e = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        return false;
    }

    @Override
    public void q(float f10) {
        ((b00) this.f45464b).f43873i0.A(f10);
    }

    @Override
    public int q0() {
        switch (this.f45463a) {
            case 3:
                c4 c4Var = (c4) this.f45464b;
                return c4Var.f44217c - c4Var.f44216b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public void s(float f10, float f11) {
        int i7 = this.f45463a;
    }

    @Override
    public void t0() {
        int i7 = this.f45463a;
    }

    @Override
    public void t1(boolean z9) {
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        rc rcVar = (rc) this.f45464b;
        h6Var = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
        if (h6Var instanceof qc) {
            h6Var2 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            rc rcVar2 = ((qc) h6Var2).f49011a;
            rcVar2.J = !rcVar2.J;
            rcVar2.k1();
            rcVar2.g1(false);
        }
        rcVar.b1(a(), false);
        rcVar.g1(false);
    }

    @Override
    public boolean u1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void v0(int i7, boolean z9, boolean z10) {
        pm0 pm0Var = (pm0) this.f45464b;
        pm0Var.removeSelfFromStack();
        if (!z9) {
            pm0Var.a0(pm0Var.f48794b, pm0Var.f48795c, z10, i7);
        }
    }

    @Override
    public void w(View view, float f10, float f11) {
        switch (this.f45463a) {
            case 14:
                return;
            default:
                oe0 oe0Var = (oe0) this.f45464b;
                oe0.k(oe0Var, view, f10, f11);
                oe0.m(oe0Var, f10, false, true);
                org.telegram.messenger.g0.i3(oe0Var.H, 450L);
                oe0Var.O = null;
                oe0Var.invalidate();
                oe0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void w0(String str) {
        ((cn) ((bi.g5) this.f45464b).f3938c).Fa(str, false);
    }

    @Override
    public boolean w1() {
        return false;
    }

    @Override
    public boolean x0(org.telegram.messenger.ij ijVar) {
        return true;
    }

    @Override
    public String y(long j3) {
        return null;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        org.telegram.messenger.ij messageObject;
        mb mbVar = (mb) this.f45464b;
        if ((view instanceof org.telegram.ui.Cells.t0) && (messageObject = ((org.telegram.ui.Cells.t0) view).getMessageObject()) != null) {
            long j3 = messageObject.H0;
            if (j3 != -1) {
                if (mbVar.f47892p0.contains(Long.valueOf(j3))) {
                    mbVar.f47892p0.remove(Long.valueOf(messageObject.H0));
                } else {
                    mbVar.f47892p0.add(Long.valueOf(messageObject.H0));
                }
                mbVar.b1(true);
                mbVar.W0();
                mbVar.E.f();
                return;
            }
        }
        mbVar.U0(view, f10, f11);
    }

    private final void h2(float f10) {
    }

    private final void l2(float f10) {
    }

    @Override
    public void A1(org.telegram.messenger.ij ijVar) {
    }

    @Override
    public void C(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void D0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void G0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void I(org.telegram.messenger.ij ijVar) {
    }

    @Override
    public void J(org.telegram.messenger.fj fjVar) {
    }

    @Override
    public void K0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void N(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void P(org.telegram.messenger.ij ijVar) {
    }

    @Override
    public void P0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void Q0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void T0(int i7) {
    }

    @Override
    public void U1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void V(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void V0(org.telegram.messenger.zr zrVar) {
    }

    @Override
    public void c2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void d0(int i7) {
    }

    @Override
    public void i0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void m0(String str) {
    }

    @Override
    public void o(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void r(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void r1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void t(rh0 rh0Var) {
    }

    @Override
    public void v(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void x(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void y0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void y1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    private final void G1() {
    }

    private final void L1() {
    }

    private final void T1() {
    }

    private final void V1() {
    }

    private final void m2() {
    }

    private final void n2() {
    }

    private final void o2() {
    }

    private final void p2() {
    }

    private final void q2() {
    }

    @Override
    public void F1() {
    }

    @Override
    public void W() {
    }

    @Override
    public void Z0() {
    }

    @Override
    public void e2() {
    }

    @Override
    public void f0() {
    }

    @Override
    public void i1() {
    }

    @Override
    public void i2() {
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void p() {
    }

    @Override
    public void u() {
    }

    @Override
    public void z0() {
    }

    private final void M1(float f10, float f11) {
    }

    private final void O1(float f10, float f11) {
    }

    private final void z1(float f10, float f11) {
    }

    @Override
    public void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
    }

    @Override
    public void H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void K1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o10 o10Var) {
    }

    @Override
    public void L0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void P1(String str, String str2) {
    }

    @Override
    public void W1(org.telegram.ui.Cells.q1 q1Var, long j3) {
    }

    @Override
    public void Y(boolean z9, boolean z10) {
    }

    @Override
    public void b1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void g1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    @Override
    public void s1(org.telegram.ui.Cells.q1 q1Var, boolean z9) {
    }

    @Override
    public void v1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void x1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    private final void Z1(View view, float f10, float f11) {
    }

    private final void a2(View view, float f10, float f11) {
    }

    private final void d2(View view, float f10, float f11) {
    }

    @Override
    public void A0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z9) {
    }

    @Override
    public void B0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void E0(org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10) {
    }

    @Override
    public void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void N0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z9) {
    }

    @Override
    public void g0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void j1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void j2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
    }

    @Override
    public void p0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void q1(org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10) {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }

    @Override
    public void I1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void s0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void u0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z9) {
    }

    @Override
    public void R1(org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11, boolean z9) {
    }

    @Override
    public void f2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    @Override
    public void j(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }

    @Override
    public void D1(org.telegram.messenger.ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
