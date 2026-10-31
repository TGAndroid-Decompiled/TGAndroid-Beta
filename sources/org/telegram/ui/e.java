package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class e implements t9, os0, org.telegram.ui.web.y0, org.telegram.ui.Components.mn0, org.telegram.ui.Components.q4, org.telegram.ui.Components.xl0, org.telegram.ui.Components.hk0, org.telegram.ui.Cells.l1, e91, org.telegram.ui.Components.hu0, gm, ge.a, org.telegram.ui.Components.jk0, org.telegram.ui.Cells.r7, org.telegram.ui.Components.ep0, s4.c0, org.telegram.ui.Components.a8, org.telegram.ui.Components.o10, r0.m, ty0, ko0 {
    public final int f36876a;
    public final Object f36877b;

    public e(Object obj, int i10) {
        this.f36876a = i10;
        this.f36877b = obj;
    }

    @Override
    public boolean A1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.jj jjVar) {
        return false;
    }

    @Override
    public void B(Editable editable) {
        yn0 yn0Var = (yn0) this.f36877b;
        org.telegram.ui.Components.wt wtVar = yn0Var.M;
        yn0Var.f43864a = editable;
        wtVar.setText(editable);
    }

    @Override
    public void B0() {
        if (org.telegram.messenger.i0.H3()) {
            ((b50) this.f36877b).m1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public void C() {
        switch (this.f36876a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((g5) this.f36877b).f37425i1.M();
                return;
        }
    }

    @Override
    public void D() {
        int i10 = this.f36876a;
    }

    @Override
    public void E(int i10, int i11) {
        ((s4.g0) this.f36877b).j(i10, i11);
    }

    @Override
    public void E0(float f7) {
        switch (this.f36876a) {
            case 6:
            case 9:
                return;
            default:
                dv dvVar = (dv) this.f36877b;
                int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i10 != 0 || dvVar.f36841f[1].getVisibility() == 0) {
                    if (dvVar.f36843r) {
                        cv cvVar = dvVar.f36841f[0];
                        cvVar.setTranslationX((-f7) * cvVar.getMeasuredWidth());
                        cv[] cvVarArr = dvVar.f36841f;
                        cvVarArr[1].setTranslationX(cvVarArr[0].getMeasuredWidth() - (f7 * dvVar.f36841f[0].getMeasuredWidth()));
                    } else {
                        cv cvVar2 = dvVar.f36841f[0];
                        cvVar2.setTranslationX(cvVar2.getMeasuredWidth() * f7);
                        cv[] cvVarArr2 = dvVar.f36841f;
                        cvVarArr2[1].setTranslationX((f7 * cvVarArr2[0].getMeasuredWidth()) - dvVar.f36841f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        cv[] cvVarArr3 = dvVar.f36841f;
                        cv cvVar3 = cvVarArr3[0];
                        cvVarArr3[0] = cvVarArr3[1];
                        cvVarArr3[1] = cvVar3;
                        cvVar3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public boolean E1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void F(boolean z10) {
        Runnable runnable = ((le) this.f36877b).S0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void G0() {
        int i10 = this.f36876a;
    }

    @Override
    public boolean G1(int i10, View view) {
        switch (this.f36876a) {
            case 6:
                return false;
            case 9:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void H0(org.telegram.messenger.jj jjVar) {
        l3 l3Var = ((h4) this.f36877b).f37746u0[0];
        if (l3Var != null) {
            l3Var.f39038b.I0(true);
        }
    }

    @Override
    public qs0 H1() {
        return null;
    }

    @Override
    public boolean I0(long j10) {
        return false;
    }

    @Override
    public boolean I1() {
        switch (this.f36876a) {
            case 14:
                return false;
            default:
                return true;
        }
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        org.telegram.messenger.i0.h3(new ag.d3(this, i10, 13), 50L);
    }

    @Override
    public boolean K1(long j10) {
        return false;
    }

    @Override
    public void L(String str) {
        f fVar = (f) this.f36877b;
        fVar.finishFragment(false);
        rv rvVar = fVar.f37143y;
        LaunchActivity launchActivity = (LaunchActivity) rvVar.f41298b;
        Pattern pattern = LaunchActivity.D1;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, launchActivity, null);
        x1Var.f21488i0 = false;
        x1Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new org.telegram.ui.Components.t20(17, x1Var, (f) rvVar.f41299c));
    }

    @Override
    public boolean M0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public void M1(boolean z10) {
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        zc zcVar = (zc) this.f36877b;
        p6Var = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
        if (p6Var instanceof yc) {
            p6Var2 = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
            zc zcVar2 = ((yc) p6Var2).f43817a;
            zcVar2.J = !zcVar2.J;
            zcVar2.j1();
            zcVar2.f1(false);
        }
        zcVar.a1(a(), false);
        zcVar.f1(false);
    }

    @Override
    public void N(float f7, float f10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        switch (this.f36876a) {
            case 14:
                z4Var = ((org.telegram.ui.ActionBar.k2) ((tx) this.f36877b).f41967n0).parentLayout;
                ((ActionBarLayout) z4Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public boolean N1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean P(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public String P0() {
        return null;
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public void Q0(int i10, int i11) {
        ((s4.g0) this.f36877b).p(i10, i11);
    }

    @Override
    public boolean R(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        switch (this.f36876a) {
            case 24:
                kh0 kh0Var = (kh0) this.f36877b;
                i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
                kh0Var.d = I0;
                kh0Var.F.setPadding(I0.f7765a, I0.f7766b, I0.f7767c, I0.d);
                kh0Var.E.requestLayout();
                return r0.j1.f46131b;
            default:
                kt0 kt0Var = (kt0) this.f36877b;
                i0.c g10 = j1Var.f46132a.g(519);
                kt0Var.f38946r = g10;
                kt0Var.d.setPadding(g10.f7765a, g10.f7766b, g10.f7767c, g10.d);
                kt0Var.f38938c.requestLayout();
                return r0.j1.f46131b;
        }
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public boolean S0(org.telegram.messenger.jj jjVar) {
        return org.telegram.ui.Cells.f1.a(jjVar);
    }

    @Override
    public boolean V0(float f7, float f10) {
        switch (this.f36876a) {
            case 14:
                return ((tx) this.f36877b).f41967n0.isInPreviewMode();
            default:
                rf0 rf0Var = (rf0) this.f36877b;
                View view = null;
                rf0Var.O = null;
                int childCount = rf0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = rf0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view != null && !rf0Var.P.contains(view)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public int W() {
        return 0;
    }

    @Override
    public boolean W1(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public zg.a Y() {
        return null;
    }

    @Override
    public void Y0(int i10, int i11) {
        c60 c60Var = (c60) this.f36877b;
        c60Var.W = i10;
        org.telegram.messenger.i0.a4(c60Var.f36392b);
    }

    @Override
    public boolean Z(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        zc zcVar = (zc) this.f36877b;
        p6Var = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
        if (p6Var != null) {
            p6Var2 = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
            return p6Var2.a();
        }
        return org.telegram.ui.ActionBar.t6.I.q();
    }

    @Override
    public boolean a0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public float a1() {
        return i0.a.d(9.66f, ei.b.d(((le) this.f36877b).U0), 0);
    }

    public void a2(we0 we0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        gf0 gf0Var = (gf0) this.f36877b;
        gf0Var.N = true;
        hf0 hf0Var = gf0Var.f37534a0;
        hf0Var.J = 0;
        hf0Var.v1(0, false);
        int i10 = Build.VERSION.SDK_INT;
        if (org.telegram.messenger.i0.N1()) {
            if (hf0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (hf0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i10 >= 28 && hf0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (i10 >= 26 && hf0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                z14 = false;
            } else {
                z14 = true;
            }
            ef0 ef0Var = gf0Var.f37533a;
            if (ef0Var != null && "888".equals(ef0Var.getText())) {
                z11 = true;
                z12 = true;
                z13 = true;
                z14 = true;
            }
            if (hf0Var.f37946w) {
                hf0Var.f37939r.clear();
                if (!z11) {
                    hf0Var.f37939r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z12) {
                    hf0Var.f37939r.add("android.permission.CALL_PHONE");
                }
                if (!z13) {
                    hf0Var.f37939r.add("android.permission.READ_CALL_LOG");
                }
                if (!z14 && i10 >= 26) {
                    hf0Var.f37939r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!hf0Var.f37939r.isEmpty()) {
                    SharedPreferences d12 = org.telegram.messenger.vp.d1();
                    if (!d12.getBoolean("firstlogin", true) && !hf0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !hf0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            hf0Var.getParentActivity().requestPermissions((String[]) hf0Var.f37939r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            return;
                        }
                    }
                    d12.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hf0Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751771, "Continue"), null);
                    int i11 = 2131623958;
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    if (!z11 && (!z12 || !z13)) {
                        x1Var.T = org.telegram.messenger.cd.L0(2131754274, "AllowReadCallAndLog");
                    } else if (z12 && z13) {
                        x1Var.T = org.telegram.messenger.cd.L0(2131754275, "AllowReadCall");
                        i11 = 2131624065;
                    } else {
                        x1Var.T = org.telegram.messenger.cd.L0(2131754273, "AllowReadCallLog");
                    }
                    int i12 = org.telegram.ui.ActionBar.t6.L5;
                    alertDialog$Builder.m(i11, 46, org.telegram.ui.ActionBar.t6.x0(null, i12, false), null);
                    alertDialog$Builder.n(i12, null);
                    hf0Var.h = hf0Var.showDialog(x1Var);
                    gf0Var.N = true;
                    return;
                }
            }
            z10 = true;
        } else {
            z10 = true;
        }
        ff0 ff0Var = new ff0(0, this, we0Var);
        we0Var.h.f(z10, z10);
        org.telegram.messenger.i0.h3(ff0Var, 400L);
    }

    @Override
    public boolean mo16b(float f7, float f10, int i10, View view) {
        z00 z00Var = (z00) this.f36877b;
        if (view instanceof org.telegram.ui.Cells.l7) {
            z00.a(z00Var, ((org.telegram.ui.Cells.l7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.o7) {
            z00.a(z00Var, ((org.telegram.ui.Cells.o7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.k7) {
            z00.a(z00Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.h2) {
            z00.a(z00Var, ((org.telegram.ui.Cells.h2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.v2) {
                if (!z00Var.f43957o0.f()) {
                    org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
                    if (v2Var.Z(f7)) {
                        z00Var.f43951i0.L(v2Var);
                        return true;
                    }
                }
                z00.a(z00Var, ((org.telegram.ui.Cells.v2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public void b0() {
        ((ni0) this.f36877b).a();
    }

    @Override
    public boolean b1() {
        return false;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean c2(int i10) {
        return false;
    }

    @Override
    public void d(int i10, boolean z10) {
        boolean z11;
        switch (this.f36876a) {
            case 6:
                t5 t5Var = ((m5) this.f36877b).d;
                t5Var.f41719d0 = i10;
                t5Var.I0(true);
                return;
            case 9:
                zb zbVar = ((xb) this.f36877b).f43529f;
                zbVar.D = i10;
                zbVar.d(true);
                return;
            default:
                dv dvVar = (dv) this.f36877b;
                if (dvVar.f36841f[0].f36556f != i10) {
                    if (i10 == dvVar.e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    dvVar.f36846x = z11;
                    cv cvVar = dvVar.f36841f[1];
                    cvVar.f36556f = i10;
                    cvVar.setVisibility(0);
                    dvVar.q0(true);
                    dvVar.f36843r = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean d0() {
        return false;
    }

    @Override
    public boolean d1(View view, float f7, float f10) {
        switch (this.f36876a) {
            case 14:
                return false;
            default:
                rf0 rf0Var = (rf0) this.f36877b;
                rf0.k(rf0Var, view, f7, f10);
                org.telegram.messenger.i0.r(rf0Var.H);
                rf0.l(rf0Var);
                rf0.m(rf0Var, f7, true, false);
                rf0Var.invalidate();
                rf0Var.Q.a(true, true);
                return true;
        }
    }

    public void d2(Exception exc) {
        sm0 sm0Var = (sm0) this.f36877b;
        if (sm0Var.Q0) {
            return;
        }
        sm0Var.M0(true, false);
        sm0Var.I0(false);
        if (!(exc instanceof nc.a) && !(exc instanceof nc.b)) {
            org.telegram.ui.Components.s4.v0(exc.getMessage(), sm0Var);
        } else {
            org.telegram.ui.Components.s4.v0(org.telegram.messenger.cd.L0(2131747420, null), sm0Var);
        }
    }

    @Override
    public void dismiss() {
        ((c60) this.f36877b).f36399x.dismiss();
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void e1() {
        oj ojVar = (oj) this.f36877b;
        View view = ojVar.f40270a;
        if (view != null) {
            view.setPressed(false);
            ojVar.f40270a.setSelected(false);
        }
        View view2 = ojVar.f40274n;
        if (view2 != null && !ojVar.d) {
            view2.callOnClick();
            ojVar.d = true;
        }
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public int f0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override
    public void g() {
        ((z00) this.f36877b).f43951i0.finish();
    }

    @Override
    public int g1() {
        le leVar = (le) this.f36877b;
        return leVar.V0 + leVar.W0;
    }

    @Override
    public org.telegram.ui.Cells.l9 g2() {
        return null;
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f36876a) {
            case 3:
                d4 d4Var = (d4) this.f36877b;
                int i10 = d4Var.f36610b;
                return String.valueOf(Math.round((d4Var.f36609a.getProgress() * (d4Var.f36611c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f36876a) {
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
    public boolean h1(View view) {
        return false;
    }

    @Override
    public boolean i0() {
        return false;
    }

    @Override
    public boolean i1(String str, k9 k9Var) {
        return false;
    }

    @Override
    public void j() {
        org.telegram.messenger.w0.u();
        boolean z10 = org.telegram.messenger.v2.f18448a;
        org.telegram.messenger.w0.r();
        gf.f.r(((pb) this.f36877b).f40563n.getParentActivity(), org.telegram.messenger.v2.f18452g);
    }

    @Override
    public boolean j0() {
        switch (this.f36876a) {
            case 14:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean j1() {
        return false;
    }

    @Override
    public void k(boolean z10, float f7) {
        int i10;
        String a02;
        switch (this.f36876a) {
            case 3:
                d4 d4Var = (d4) this.f36877b;
                int round = Math.round(((d4Var.f36611c - i10) * f7) + d4Var.f36610b);
                if (round != org.telegram.messenger.tz.Z0) {
                    org.telegram.messenger.tz.Z0 = round;
                    SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                    edit.putInt("iv_font_size", org.telegram.messenger.tz.Z0);
                    edit.commit();
                    d4Var.f36612f.f37746u0[0].getAdapter().D.clear();
                    h4 h4Var = d4Var.f36612f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        h4Var.f37746u0[i11].f39039c.f();
                        f4 f4Var = h4Var.f37746u0[i11].f39039c;
                        ArrayList arrayList = f4Var.d;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i12);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.e.a(f4Var.L);
                        Utilities.e.d(f4Var.L, 100L);
                    }
                    d4Var.invalidate();
                    return;
                }
                return;
            case 4:
            default:
                za0 za0Var = (za0) this.f36877b;
                bb0 bb0Var = za0Var.D;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != org.telegram.messenger.sc.c()) {
                    org.telegram.messenger.sc.f17890g = w7.u.b(round2, 0, 100);
                    org.telegram.messenger.sc.k();
                    org.telegram.messenger.sc.d(false);
                    bb0Var.c0();
                    ArrayList arrayList2 = bb0Var.f36162s;
                    if (arrayList2.isEmpty()) {
                        bb0Var.b0();
                    } else if (arrayList2.size() >= 2) {
                        if (org.telegram.messenger.sc.c() <= 0) {
                            a02 = org.telegram.messenger.cd.L0(2131748881, null);
                        } else if (org.telegram.messenger.sc.c() >= 100) {
                            a02 = org.telegram.messenger.cd.L0(2131748880, null);
                        } else {
                            a02 = org.telegram.messenger.cd.a0(null, null, 2131748882, String.format("%d%%", Integer.valueOf(org.telegram.messenger.sc.c())));
                        }
                        arrayList2.set(1, new wa0(2, 0, a02, 0, 0));
                        bb0Var.d.g(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            za0Var.performHapticFeedback(3, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                g5.f37424k1 = f7;
                org.telegram.ui.Components.uu0 uu0Var = ((g5) this.f36877b).f37425i1;
                uu0Var.L();
                uu0Var.M();
                return;
        }
    }

    @Override
    public TextureView k0() {
        return null;
    }

    @Override
    public boolean k1(org.telegram.ui.Cells.q1 q1Var, int i10) {
        return false;
    }

    @Override
    public void m(View view, float f7, float f10) {
        switch (this.f36876a) {
            case 14:
                return;
            default:
                rf0 rf0Var = (rf0) this.f36877b;
                rf0.k(rf0Var, view, f7, f10);
                rf0.m(rf0Var, f7, false, true);
                org.telegram.messenger.i0.h3(rf0Var.H, 450L);
                View view2 = rf0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                rf0Var.O = null;
                rf0Var.invalidate();
                rf0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public boolean m0(org.telegram.ui.Components.o5 o5Var) {
        return false;
    }

    @Override
    public void n0(int i10, int i11) {
        ((s4.g0) this.f36877b).o(i10, i11);
    }

    @Override
    public void o1(View view, float f7, float f10) {
        switch (this.f36876a) {
            case 14:
                return;
            default:
                rf0 rf0Var = (rf0) this.f36877b;
                rf0.k(rf0Var, view, f7, f10);
                rf0.m(rf0Var, f7, false, false);
                rf0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        oj ojVar = (oj) this.f36877b;
        View view = ojVar.f40270a;
        if (view != null) {
            view.setPressed(true);
            ojVar.f40270a.setSelected(true);
            ojVar.f40270a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        boolean z10;
        oj ojVar = (oj) this.f36877b;
        un unVar = ojVar.f40278x;
        if (ojVar.f40270a != null) {
            unVar.f42240e9 = org.telegram.ui.Components.y8.b(unVar, ojVar.f40277w, unVar.f42297j6, unVar.b(), unVar.f42477xa);
            org.telegram.ui.ActionBar.k1 k1Var = unVar.f42240e9;
            if (k1Var != null) {
                ojVar.f40271b = k1Var;
                k1Var.setOnDismissListener(new e0(ojVar, 2));
                unVar.f42492z0.C0();
                unVar.B0.R = false;
                View view = ojVar.f40277w;
                unVar.Gb(view);
                if (view != unVar.f42468x1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                unVar.o8(false, z10, 0.3f);
                unVar.u9(false);
                il ilVar = unVar.N3;
                if (ilVar != null) {
                    ilVar.d(1, true);
                }
                UndoView undoView = unVar.M3;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                mk mkVar = unVar.Z;
                if (mkVar != null && mkVar.getEditField() != null) {
                    unVar.Z.getEditField().setAllowDrawCursor(false);
                }
            }
        }
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        oj ojVar = (oj) this.f36877b;
        if (!ojVar.e && (view = ojVar.f40270a) != null) {
            view.callOnClick();
            ojVar.e = true;
            return true;
        }
        return false;
    }

    @Override
    public void p(float f7) {
        ((z00) this.f36877b).f43951i0.a(f7);
    }

    @Override
    public int p0() {
        switch (this.f36876a) {
            case 3:
                d4 d4Var = (d4) this.f36877b;
                return d4Var.f36611c - d4Var.f36610b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public boolean p1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void r(float f7, float f10) {
        int i10 = this.f36876a;
    }

    @Override
    public boolean r1() {
        return false;
    }

    @Override
    public void t0() {
        int i10 = this.f36876a;
    }

    @Override
    public void u(View view, float f7, float f10) {
        switch (this.f36876a) {
            case 14:
                return;
            default:
                rf0 rf0Var = (rf0) this.f36877b;
                rf0.k(rf0Var, view, f7, f10);
                rf0.m(rf0Var, f7, false, true);
                org.telegram.messenger.i0.h3(rf0Var.H, 450L);
                rf0Var.O = null;
                rf0Var.invalidate();
                rf0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void u0(int i10, boolean z10, boolean z11) {
        yn0 yn0Var = (yn0) this.f36877b;
        yn0Var.removeSelfFromStack();
        if (!z10) {
            yn0Var.Z(yn0Var.f43865b, yn0Var.f43866c, z11, i10);
        }
    }

    @Override
    public void v0(String str) {
        ((un) ((mg.s) this.f36877b).f13227c).ta(str, false);
    }

    @Override
    public boolean w0(org.telegram.messenger.jj jjVar) {
        return true;
    }

    @Override
    public void w1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        gf.f.r(q1Var.getContext(), str);
    }

    @Override
    public String x(long j10) {
        return null;
    }

    @Override
    public void x1(int i10, int i11) {
        ((s4.g0) this.f36877b).n(i10, i11, null);
    }

    @Override
    public void y() {
        yn0 yn0Var = (yn0) this.f36877b;
        if (yn0Var.f43865b.size() == 0) {
            yn0Var.Q.setPivotX(0.0f);
            yn0Var.Q.setPivotY(0.0f);
            yn0Var.a0(false);
            return;
        }
        yn0Var.Q.invalidate();
        yn0Var.a0(true);
    }

    @Override
    public CharacterStyle y1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        org.telegram.messenger.jj messageObject;
        sb sbVar = (sb) this.f36877b;
        if ((view instanceof org.telegram.ui.Cells.s0) && (messageObject = ((org.telegram.ui.Cells.s0) view).getMessageObject()) != null) {
            long j10 = messageObject.H0;
            if (j10 != -1) {
                if (sbVar.f41444p0.contains(Long.valueOf(j10))) {
                    sbVar.f41444p0.remove(Long.valueOf(messageObject.H0));
                } else {
                    sbVar.f41444p0.add(Long.valueOf(messageObject.H0));
                }
                sbVar.a1(true);
                sbVar.V0();
                sbVar.E.f();
                return;
            }
        }
        sbVar.T0(view, f7, f10);
    }

    private final void k2(float f7) {
    }

    private final void l2(float f7) {
    }

    @Override
    public void A(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void C0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void F0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void I(org.telegram.messenger.jj jjVar) {
    }

    @Override
    public void J(org.telegram.messenger.gj gjVar) {
    }

    @Override
    public void J0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void M(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void N0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void O(org.telegram.messenger.jj jjVar) {
    }

    @Override
    public void O0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void P1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void T0(int i10) {
    }

    @Override
    public void U(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void X0(org.telegram.messenger.is isVar) {
    }

    @Override
    public void X1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void c0(int i10) {
    }

    @Override
    public void g0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void l0(String str) {
    }

    @Override
    public void m1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void n(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void q(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void t(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void u1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void v(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void v1(org.telegram.messenger.jj jjVar) {
    }

    @Override
    public void w(ui0 ui0Var) {
    }

    @Override
    public void x0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    private final void Q1() {
    }

    private final void R1() {
    }

    private final void V1() {
    }

    private final void Y1() {
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
    public void B1() {
    }

    @Override
    public void U0() {
    }

    @Override
    public void V() {
    }

    @Override
    public void Z1() {
    }

    @Override
    public void e2() {
    }

    @Override
    public void h0() {
    }

    @Override
    public void o() {
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void s() {
    }

    @Override
    public void t1() {
    }

    @Override
    public void y0() {
    }

    private final void O1(float f7, float f10) {
    }

    private final void T1(float f7, float f10) {
    }

    private final void U1(float f7, float f10) {
    }

    @Override
    public void C1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void F1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.c20 c20Var) {
    }

    @Override
    public void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.s2 s2Var) {
    }

    @Override
    public void J1(String str, String str2) {
    }

    @Override
    public void K0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void S1(org.telegram.ui.Cells.q1 q1Var, long j10) {
    }

    @Override
    public void W0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void X(boolean z10, boolean z11) {
    }

    @Override
    public void Z0(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document) {
    }

    @Override
    public void c1(org.telegram.ui.Cells.q1 q1Var, int i10) {
    }

    @Override
    public void n1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override
    public void q1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void s1(org.telegram.ui.Cells.q1 q1Var, int i10) {
    }

    private final void h2(View view, float f7, float f10) {
    }

    private final void i2(View view, float f7, float f10) {
    }

    private final void j2(View view, float f7, float f10) {
    }

    @Override
    public void A0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override
    public void D0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void L0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void e0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override
    public void f1(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override
    public void f2(org.telegram.ui.Cells.q1 q1Var, int i10, int i11) {
    }

    @Override
    public void l1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void o0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }

    @Override
    public void z0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void D1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void l(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void r0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void s0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void L1(org.telegram.ui.Cells.q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void b2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void i(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void T(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void z1(org.telegram.messenger.jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
