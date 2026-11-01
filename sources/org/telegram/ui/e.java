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
public final class e implements t9, ns0, org.telegram.ui.web.y0, org.telegram.ui.Components.nn0, org.telegram.ui.Components.q4, org.telegram.ui.Components.yl0, org.telegram.ui.Components.ik0, org.telegram.ui.Cells.l1, c91, org.telegram.ui.Components.iu0, gm, ge.a, org.telegram.ui.Components.kk0, org.telegram.ui.Cells.r7, org.telegram.ui.Components.fp0, s4.c0, org.telegram.ui.Components.a8, org.telegram.ui.Components.o10, r0.m, sy0, io0 {
    public final int f36702a;
    public final Object f36703b;

    public e(Object obj, int i10) {
        this.f36702a = i10;
        this.f36703b = obj;
    }

    @Override
    public boolean A1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.kj kjVar) {
        return false;
    }

    @Override
    public void B(Editable editable) {
        wn0 wn0Var = (wn0) this.f36703b;
        org.telegram.ui.Components.wt wtVar = wn0Var.M;
        wn0Var.f43131a = editable;
        wtVar.setText(editable);
    }

    @Override
    public void B0() {
        if (org.telegram.messenger.i0.H3()) {
            ((a50) this.f36703b).m1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public void C() {
        switch (this.f36702a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((g5) this.f36703b).f37353i1.M();
                return;
        }
    }

    @Override
    public void D() {
        int i10 = this.f36702a;
    }

    @Override
    public void E(int i10, int i11) {
        ((s4.g0) this.f36703b).j(i10, i11);
    }

    @Override
    public void E0(float f7) {
        switch (this.f36702a) {
            case 6:
            case 9:
                return;
            default:
                cv cvVar = (cv) this.f36703b;
                int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i10 != 0 || cvVar.f36418f[1].getVisibility() == 0) {
                    if (cvVar.f36420r) {
                        bv bvVar = cvVar.f36418f[0];
                        bvVar.setTranslationX((-f7) * bvVar.getMeasuredWidth());
                        bv[] bvVarArr = cvVar.f36418f;
                        bvVarArr[1].setTranslationX(bvVarArr[0].getMeasuredWidth() - (f7 * cvVar.f36418f[0].getMeasuredWidth()));
                    } else {
                        bv bvVar2 = cvVar.f36418f[0];
                        bvVar2.setTranslationX(bvVar2.getMeasuredWidth() * f7);
                        bv[] bvVarArr2 = cvVar.f36418f;
                        bvVarArr2[1].setTranslationX((f7 * bvVarArr2[0].getMeasuredWidth()) - cvVar.f36418f[0].getMeasuredWidth());
                    }
                    if (i10 == 0) {
                        bv[] bvVarArr3 = cvVar.f36418f;
                        bv bvVar3 = bvVarArr3[0];
                        bvVarArr3[0] = bvVarArr3[1];
                        bvVarArr3[1] = bvVar3;
                        bvVar3.setVisibility(8);
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
        Runnable runnable = ((le) this.f36703b).S0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void G0() {
        int i10 = this.f36702a;
    }

    @Override
    public boolean G1(int i10, View view) {
        switch (this.f36702a) {
            case 6:
                return false;
            case 9:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void H0(org.telegram.messenger.kj kjVar) {
        l3 l3Var = ((h4) this.f36703b).f37691u0[0];
        if (l3Var != null) {
            l3Var.f39061b.I0(true);
        }
    }

    @Override
    public ps0 H1() {
        return null;
    }

    @Override
    public boolean I0(long j10) {
        return false;
    }

    @Override
    public boolean I1() {
        switch (this.f36702a) {
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
        f fVar = (f) this.f36703b;
        fVar.finishFragment(false);
        qv qvVar = fVar.f36940y;
        LaunchActivity launchActivity = (LaunchActivity) qvVar.f40910b;
        Pattern pattern = LaunchActivity.D1;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, launchActivity, null);
        x1Var.f21489i0 = false;
        x1Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new org.telegram.ui.Components.t20(17, x1Var, (f) qvVar.f40911c));
    }

    @Override
    public boolean M0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public void M1(boolean z10) {
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        zc zcVar = (zc) this.f36703b;
        p6Var = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
        if (p6Var instanceof yc) {
            p6Var2 = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
            zc zcVar2 = ((yc) p6Var2).f43636a;
            zcVar2.J = !zcVar2.J;
            zcVar2.k1();
            zcVar2.g1(false);
        }
        zcVar.b1(a(), false);
        zcVar.g1(false);
    }

    @Override
    public void N(float f7, float f10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        switch (this.f36702a) {
            case 14:
                z4Var = ((org.telegram.ui.ActionBar.k2) ((sx) this.f36703b).f41487n0).parentLayout;
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
        ((s4.g0) this.f36703b).p(i10, i11);
    }

    @Override
    public boolean R(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        ih0 ih0Var = (ih0) this.f36703b;
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        ih0Var.d = I0;
        ih0Var.F.setPadding(I0.f7766a, I0.f7767b, I0.f7768c, I0.d);
        ih0Var.E.requestLayout();
        return r0.j1.f46142b;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public boolean S0(org.telegram.messenger.kj kjVar) {
        return org.telegram.ui.Cells.f1.a(kjVar);
    }

    @Override
    public boolean V0(float f7, float f10) {
        switch (this.f36702a) {
            case 14:
                return ((sx) this.f36703b).f41487n0.isInPreviewMode();
            default:
                qf0 qf0Var = (qf0) this.f36703b;
                View view = null;
                qf0Var.O = null;
                int childCount = qf0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = qf0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view != null && !qf0Var.P.contains(view)) {
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
        b60 b60Var = (b60) this.f36703b;
        b60Var.W = i10;
        org.telegram.messenger.i0.a4(b60Var.f35954b);
    }

    @Override
    public boolean Z(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        zc zcVar = (zc) this.f36703b;
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
        return i0.a.d(9.66f, ei.b.d(((le) this.f36703b).U0), 0);
    }

    public void a2(ve0 ve0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ff0 ff0Var = (ff0) this.f36703b;
        ff0Var.N = true;
        gf0 gf0Var = ff0Var.f37124a0;
        gf0Var.J = 0;
        gf0Var.w1(0, false);
        int i10 = Build.VERSION.SDK_INT;
        if (org.telegram.messenger.i0.N1()) {
            if (gf0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (gf0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i10 >= 28 && gf0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (i10 >= 26 && gf0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                z14 = false;
            } else {
                z14 = true;
            }
            df0 df0Var = ff0Var.f37123a;
            if (df0Var != null && "888".equals(df0Var.getText())) {
                z11 = true;
                z12 = true;
                z13 = true;
                z14 = true;
            }
            if (gf0Var.f37499w) {
                gf0Var.f37492r.clear();
                if (!z11) {
                    gf0Var.f37492r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z12) {
                    gf0Var.f37492r.add("android.permission.CALL_PHONE");
                }
                if (!z13) {
                    gf0Var.f37492r.add("android.permission.READ_CALL_LOG");
                }
                if (!z14 && i10 >= 26) {
                    gf0Var.f37492r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!gf0Var.f37492r.isEmpty()) {
                    SharedPreferences d12 = org.telegram.messenger.wp.d1();
                    if (!d12.getBoolean("firstlogin", true) && !gf0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !gf0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            gf0Var.getParentActivity().requestPermissions((String[]) gf0Var.f37492r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            return;
                        }
                    }
                    d12.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gf0Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751771, "Continue"), null);
                    int i11 = 2131623958;
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    if (!z11 && (!z12 || !z13)) {
                        x1Var.T = org.telegram.messenger.dd.L0(2131754274, "AllowReadCallAndLog");
                    } else if (z12 && z13) {
                        x1Var.T = org.telegram.messenger.dd.L0(2131754275, "AllowReadCall");
                        i11 = 2131624065;
                    } else {
                        x1Var.T = org.telegram.messenger.dd.L0(2131754273, "AllowReadCallLog");
                    }
                    int i12 = org.telegram.ui.ActionBar.t6.L5;
                    alertDialog$Builder.m(i11, 46, org.telegram.ui.ActionBar.t6.x0(null, i12, false), null);
                    alertDialog$Builder.n(i12, null);
                    gf0Var.h = gf0Var.showDialog(x1Var);
                    ff0Var.N = true;
                    return;
                }
            }
            z10 = true;
        } else {
            z10 = true;
        }
        ef0 ef0Var = new ef0(0, this, ve0Var);
        ve0Var.h.f(z10, z10);
        org.telegram.messenger.i0.h3(ef0Var, 400L);
    }

    @Override
    public boolean mo16b(float f7, float f10, int i10, View view) {
        y00 y00Var = (y00) this.f36703b;
        if (view instanceof org.telegram.ui.Cells.l7) {
            y00.a(y00Var, ((org.telegram.ui.Cells.l7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.o7) {
            y00.a(y00Var, ((org.telegram.ui.Cells.o7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.k7) {
            y00.a(y00Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.h2) {
            y00.a(y00Var, ((org.telegram.ui.Cells.h2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.v2) {
                if (!y00Var.f43514o0.f()) {
                    org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
                    if (v2Var.Z(f7)) {
                        y00Var.f43508i0.L(v2Var);
                        return true;
                    }
                }
                y00.a(y00Var, ((org.telegram.ui.Cells.v2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public void b0() {
        ((li0) this.f36703b).a();
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
        switch (this.f36702a) {
            case 6:
                t5 t5Var = ((m5) this.f36703b).d;
                t5Var.f41537d0 = i10;
                t5Var.J0(true);
                return;
            case 9:
                zb zbVar = ((xb) this.f36703b).f43299f;
                zbVar.D = i10;
                zbVar.d(true);
                return;
            default:
                cv cvVar = (cv) this.f36703b;
                if (cvVar.f36418f[0].f36120f != i10) {
                    if (i10 == cvVar.e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cvVar.f36423x = z11;
                    bv bvVar = cvVar.f36418f[1];
                    bvVar.f36120f = i10;
                    bvVar.setVisibility(0);
                    cvVar.r0(true);
                    cvVar.f36420r = z10;
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
        switch (this.f36702a) {
            case 14:
                return false;
            default:
                qf0 qf0Var = (qf0) this.f36703b;
                qf0.k(qf0Var, view, f7, f10);
                org.telegram.messenger.i0.r(qf0Var.H);
                qf0.l(qf0Var);
                qf0.m(qf0Var, f7, true, false);
                qf0Var.invalidate();
                qf0Var.Q.a(true, true);
                return true;
        }
    }

    public void d2(Exception exc) {
        qm0 qm0Var = (qm0) this.f36703b;
        if (qm0Var.Q0) {
            return;
        }
        qm0Var.N0(true, false);
        qm0Var.J0(false);
        if (!(exc instanceof nc.a) && !(exc instanceof nc.b)) {
            org.telegram.ui.Components.s4.v0(exc.getMessage(), qm0Var);
        } else {
            org.telegram.ui.Components.s4.v0(org.telegram.messenger.dd.L0(2131747420, null), qm0Var);
        }
    }

    @Override
    public void dismiss() {
        ((b60) this.f36703b).f35961x.dismiss();
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void e1() {
        oj ojVar = (oj) this.f36703b;
        View view = ojVar.f40171a;
        if (view != null) {
            view.setPressed(false);
            ojVar.f40171a.setSelected(false);
        }
        View view2 = ojVar.f40175n;
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
        ((y00) this.f36703b).f43508i0.finish();
    }

    @Override
    public int g1() {
        le leVar = (le) this.f36703b;
        return leVar.V0 + leVar.W0;
    }

    @Override
    public org.telegram.ui.Cells.l9 g2() {
        return null;
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f36702a) {
            case 3:
                d4 d4Var = (d4) this.f36703b;
                int i10 = d4Var.f36477b;
                return String.valueOf(Math.round((d4Var.f36476a.getProgress() * (d4Var.f36478c - i10)) + i10));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f36702a) {
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
        boolean z10 = org.telegram.messenger.v2.f18578a;
        org.telegram.messenger.w0.r();
        gf.f.r(((pb) this.f36703b).f40443n.getParentActivity(), org.telegram.messenger.v2.f18582g);
    }

    @Override
    public boolean j0() {
        switch (this.f36702a) {
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
        switch (this.f36702a) {
            case 3:
                d4 d4Var = (d4) this.f36703b;
                int round = Math.round(((d4Var.f36478c - i10) * f7) + d4Var.f36477b);
                if (round != org.telegram.messenger.uz.Z0) {
                    org.telegram.messenger.uz.Z0 = round;
                    SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
                    edit.putInt("iv_font_size", org.telegram.messenger.uz.Z0);
                    edit.commit();
                    d4Var.f36479f.f37691u0[0].getAdapter().D.clear();
                    h4 h4Var = d4Var.f36479f;
                    for (int i11 = 0; i11 < 2; i11++) {
                        h4Var.f37691u0[i11].f39062c.f();
                        f4 f4Var = h4Var.f37691u0[i11].f39062c;
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
                ya0 ya0Var = (ya0) this.f36703b;
                ab0 ab0Var = ya0Var.D;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != org.telegram.messenger.tc.c()) {
                    org.telegram.messenger.tc.f18241g = w7.u.b(round2, 0, 100);
                    org.telegram.messenger.tc.k();
                    org.telegram.messenger.tc.d(false);
                    ab0Var.d0();
                    ArrayList arrayList2 = ab0Var.f35741s;
                    if (arrayList2.isEmpty()) {
                        ab0Var.c0();
                    } else if (arrayList2.size() >= 2) {
                        if (org.telegram.messenger.tc.c() <= 0) {
                            a02 = org.telegram.messenger.dd.L0(2131748881, null);
                        } else if (org.telegram.messenger.tc.c() >= 100) {
                            a02 = org.telegram.messenger.dd.L0(2131748880, null);
                        } else {
                            a02 = org.telegram.messenger.dd.a0(null, null, 2131748882, String.format("%d%%", Integer.valueOf(org.telegram.messenger.tc.c())));
                        }
                        arrayList2.set(1, new va0(2, 0, a02, 0, 0));
                        ab0Var.d.g(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            ya0Var.performHapticFeedback(3, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                g5.f37352k1 = f7;
                org.telegram.ui.Components.vu0 vu0Var = ((g5) this.f36703b).f37353i1;
                vu0Var.K();
                vu0Var.M();
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
        switch (this.f36702a) {
            case 14:
                return;
            default:
                qf0 qf0Var = (qf0) this.f36703b;
                qf0.k(qf0Var, view, f7, f10);
                qf0.m(qf0Var, f7, false, true);
                org.telegram.messenger.i0.h3(qf0Var.H, 450L);
                View view2 = qf0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                qf0Var.O = null;
                qf0Var.invalidate();
                qf0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public boolean m0(org.telegram.ui.Components.o5 o5Var) {
        return false;
    }

    @Override
    public void n0(int i10, int i11) {
        ((s4.g0) this.f36703b).o(i10, i11);
    }

    @Override
    public void o1(View view, float f7, float f10) {
        switch (this.f36702a) {
            case 14:
                return;
            default:
                qf0 qf0Var = (qf0) this.f36703b;
                qf0.k(qf0Var, view, f7, f10);
                qf0.m(qf0Var, f7, false, false);
                qf0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        oj ojVar = (oj) this.f36703b;
        View view = ojVar.f40171a;
        if (view != null) {
            view.setPressed(true);
            ojVar.f40171a.setSelected(true);
            ojVar.f40171a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        oj ojVar = (oj) this.f36703b;
        un unVar = ojVar.f40179x;
        if (ojVar.f40171a != null) {
            unVar.f42051e9 = org.telegram.ui.Components.y8.b(unVar, ojVar.f40178w, unVar.f42108j6, unVar.b(), unVar.f42288xa);
            org.telegram.ui.ActionBar.k1 k1Var = unVar.f42051e9;
            if (k1Var != null) {
                ojVar.f40172b = k1Var;
                k1Var.setOnDismissListener(new e0(ojVar, 2));
                unVar.f42303z0.C0();
                unVar.B0.R = false;
                View view = ojVar.f40178w;
                unVar.Lb(view);
                if (view != unVar.f42279x1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                unVar.s8(false, z10, 0.3f);
                unVar.z9(false);
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
        oj ojVar = (oj) this.f36703b;
        if (!ojVar.e && (view = ojVar.f40171a) != null) {
            view.callOnClick();
            ojVar.e = true;
            return true;
        }
        return false;
    }

    @Override
    public void p(float f7) {
        ((y00) this.f36703b).f43508i0.a(f7);
    }

    @Override
    public int p0() {
        switch (this.f36702a) {
            case 3:
                d4 d4Var = (d4) this.f36703b;
                return d4Var.f36478c - d4Var.f36477b;
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
        int i10 = this.f36702a;
    }

    @Override
    public boolean r1() {
        return false;
    }

    @Override
    public void t0() {
        int i10 = this.f36702a;
    }

    @Override
    public void u(View view, float f7, float f10) {
        switch (this.f36702a) {
            case 14:
                return;
            default:
                qf0 qf0Var = (qf0) this.f36703b;
                qf0.k(qf0Var, view, f7, f10);
                qf0.m(qf0Var, f7, false, true);
                org.telegram.messenger.i0.h3(qf0Var.H, 450L);
                qf0Var.O = null;
                qf0Var.invalidate();
                qf0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void u0(int i10, boolean z10, boolean z11) {
        wn0 wn0Var = (wn0) this.f36703b;
        wn0Var.removeSelfFromStack();
        if (!z10) {
            wn0Var.a0(wn0Var.f43132b, wn0Var.f43133c, z11, i10);
        }
    }

    @Override
    public void v0(String str) {
        ((un) ((mg.s) this.f36703b).f13228c).ya(str, false);
    }

    @Override
    public boolean w0(org.telegram.messenger.kj kjVar) {
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
        ((s4.g0) this.f36703b).n(i10, i11, null);
    }

    @Override
    public void y() {
        wn0 wn0Var = (wn0) this.f36703b;
        if (wn0Var.f43132b.size() == 0) {
            wn0Var.Q.setPivotX(0.0f);
            wn0Var.Q.setPivotY(0.0f);
            wn0Var.b0(false);
            return;
        }
        wn0Var.Q.invalidate();
        wn0Var.b0(true);
    }

    @Override
    public CharacterStyle y1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        org.telegram.messenger.kj messageObject;
        sb sbVar = (sb) this.f36703b;
        if ((view instanceof org.telegram.ui.Cells.s0) && (messageObject = ((org.telegram.ui.Cells.s0) view).getMessageObject()) != null) {
            long j10 = messageObject.H0;
            if (j10 != -1) {
                if (sbVar.f41320p0.contains(Long.valueOf(j10))) {
                    sbVar.f41320p0.remove(Long.valueOf(messageObject.H0));
                } else {
                    sbVar.f41320p0.add(Long.valueOf(messageObject.H0));
                }
                sbVar.b1(true);
                sbVar.W0();
                sbVar.E.f();
                return;
            }
        }
        sbVar.U0(view, f7, f10);
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
    public void I(org.telegram.messenger.kj kjVar) {
    }

    @Override
    public void J(org.telegram.messenger.hj hjVar) {
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
    public void O(org.telegram.messenger.kj kjVar) {
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
    public void X0(org.telegram.messenger.js jsVar) {
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
    public void v1(org.telegram.messenger.kj kjVar) {
    }

    @Override
    public void w(si0 si0Var) {
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
    public void F1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.d20 d20Var) {
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
    public void z1(org.telegram.messenger.kj kjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
