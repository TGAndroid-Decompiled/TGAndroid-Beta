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
public final class f implements r9, tq0, org.telegram.ui.web.v0, org.telegram.ui.Components.om0, org.telegram.ui.Components.r4, org.telegram.ui.Components.yk0, org.telegram.ui.Components.gj0, org.telegram.ui.Cells.l1, d71, org.telegram.ui.Components.dt0, gl, re.a, org.telegram.ui.Components.ij0, org.telegram.ui.Cells.m7, org.telegram.ui.Components.eo0, u4.d0, org.telegram.ui.Components.d8, org.telegram.ui.Components.u00, r0.m, xw0, rm0 {
    public final int f45114a;
    public final Object f45115b;

    public f(Object obj, int i3) {
        this.f45114a = i3;
        this.f45115b = obj;
    }

    @Override
    public void A() {
        int i3 = this.f45114a;
    }

    @Override
    public void C0() {
        if (org.telegram.messenger.g0.I3()) {
            ((x30) this.f45115b).m1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public void D() {
        switch (this.f45114a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((j5) this.f45115b).f46497j1.M();
                return;
        }
    }

    @Override
    public void E(int i3, int i10) {
        ((u4.h0) this.f45115b).j(i3, i10);
    }

    @Override
    public void E1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        sf.c.t(q1Var.getContext(), str);
    }

    @Override
    public void F(boolean z10) {
        Runnable runnable = ((xd) this.f45115b).T0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void F0(float f10) {
        switch (this.f45114a) {
            case 6:
            case 9:
                return;
            default:
                yt ytVar = (yt) this.f45115b;
                int i3 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i3 != 0 || ytVar.f52403f[1].getVisibility() == 0) {
                    if (ytVar.f52405r) {
                        xt xtVar = ytVar.f52403f[0];
                        xtVar.setTranslationX((-f10) * xtVar.getMeasuredWidth());
                        xt[] xtVarArr = ytVar.f52403f;
                        xtVarArr[1].setTranslationX(xtVarArr[0].getMeasuredWidth() - (f10 * ytVar.f52403f[0].getMeasuredWidth()));
                    } else {
                        xt xtVar2 = ytVar.f52403f[0];
                        xtVar2.setTranslationX(xtVar2.getMeasuredWidth() * f10);
                        xt[] xtVarArr2 = ytVar.f52403f;
                        xtVarArr2[1].setTranslationX((f10 * xtVarArr2[0].getMeasuredWidth()) - ytVar.f52403f[0].getMeasuredWidth());
                    }
                    if (i3 == 0) {
                        xt[] xtVarArr3 = ytVar.f52403f;
                        xt xtVar3 = xtVarArr3[0];
                        xtVarArr3[0] = xtVarArr3[1];
                        xtVarArr3[1] = xtVar3;
                        xtVar3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public CharacterStyle G1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public void H0() {
        int i3 = this.f45114a;
    }

    @Override
    public void I0(org.telegram.messenger.zi ziVar) {
        l3 l3Var = ((i4) this.f45115b).f46100v0[0];
        if (l3Var != null) {
            l3Var.f47083b.I0(true);
        }
    }

    @Override
    public boolean I1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.zi ziVar) {
        return false;
    }

    @Override
    public boolean J0(long j10) {
        return false;
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        org.telegram.messenger.g0.i3(new cg.l0(this, i3, 18), 50L);
    }

    @Override
    public void M(String str) {
        g gVar = (g) this.f45115b;
        gVar.finishFragment(false);
        org.telegram.ui.Components.i41 i41Var = gVar.f45422y;
        LaunchActivity launchActivity = (LaunchActivity) i41Var.f34591b;
        String str2 = LaunchActivity.E1;
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, launchActivity, null);
        s1Var.f28546j0 = false;
        s1Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.P).sendRequest(tL_auth_acceptLoginToken, new xy(6, s1Var, (g) i41Var.f34592c));
    }

    @Override
    public String M0() {
        return null;
    }

    @Override
    public void O(float f10, float f11) {
        org.telegram.ui.ActionBar.q4 q4Var;
        switch (this.f45114a) {
            case 14:
                q4Var = ((org.telegram.ui.ActionBar.d2) ((mw) this.f45115b).f47801o0).parentLayout;
                ((ActionBarLayout) q4Var).r();
                return;
            default:
                return;
        }
    }

    @Override
    public void O0(int i3, int i10) {
        ((u4.h0) this.f45115b).p(i3, i10);
    }

    public void O1(md0 md0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        wd0 wd0Var = (wd0) this.f45115b;
        wd0Var.O = true;
        xd0 xd0Var = wd0Var.f50785b0;
        xd0Var.K = 0;
        xd0Var.w1(0, false);
        int i3 = Build.VERSION.SDK_INT;
        if (org.telegram.messenger.g0.N1()) {
            if (xd0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (xd0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i3 >= 28 && xd0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (i3 >= 26 && xd0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                z14 = false;
            } else {
                z14 = true;
            }
            ud0 ud0Var = wd0Var.f50782a;
            if (ud0Var != null && "888".equals(ud0Var.getText())) {
                z11 = true;
                z12 = true;
                z13 = true;
                z14 = true;
            }
            if (xd0Var.f51975w) {
                xd0Var.f51968r.clear();
                if (!z11) {
                    xd0Var.f51968r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z12) {
                    xd0Var.f51968r.add("android.permission.CALL_PHONE");
                }
                if (!z13) {
                    xd0Var.f51968r.add("android.permission.READ_CALL_LOG");
                }
                if (!z14 && i3 >= 26) {
                    xd0Var.f51968r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!xd0Var.f51968r.isEmpty()) {
                    SharedPreferences e12 = org.telegram.messenger.hp.e1();
                    if (!e12.getBoolean("firstlogin", true) && !xd0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !xd0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            xd0Var.getParentActivity().requestPermissions((String[]) xd0Var.f51968r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    e12.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd0Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751771, "Continue"), null);
                    int i10 = 2131623958;
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    if (!z11 && (!z12 || !z13)) {
                        s1Var.U = org.telegram.messenger.bd.M0(2131754274, "AllowReadCallAndLog");
                    } else if (z12 && z13) {
                        s1Var.U = org.telegram.messenger.bd.M0(2131754275, "AllowReadCall");
                        i10 = 2131624066;
                    } else {
                        s1Var.U = org.telegram.messenger.bd.M0(2131754273, "AllowReadCallLog");
                    }
                    int i11 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
                    alertDialog$Builder.n(i11, null);
                    xd0Var.h = xd0Var.showDialog(s1Var);
                    wd0Var.O = true;
                    return;
                }
            }
            z10 = true;
        } else {
            z10 = true;
        }
        vd0 vd0Var = new vd0(0, this, md0Var);
        md0Var.h.f(z10, z10);
        org.telegram.messenger.g0.i3(vd0Var, 400L);
    }

    @Override
    public boolean P0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean P1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean Q(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        vf0 vf0Var = (vf0) this.f45115b;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        vf0Var.d = I0;
        vf0Var.G.setPadding(I0.f14495a, I0.f14496b, I0.f14497c, I0.d);
        vf0Var.F.requestLayout();
        return r0.k1.f54025b;
    }

    public void R1(Exception exc) {
        dl0 dl0Var = (dl0) this.f45115b;
        if (dl0Var.R0) {
            return;
        }
        dl0Var.N0(true, false);
        dl0Var.J0(false);
        if (!(exc instanceof qc.a) && !(exc instanceof qc.b)) {
            org.telegram.ui.Components.t4.v0(exc.getMessage(), dl0Var);
        } else {
            org.telegram.ui.Components.t4.v0(org.telegram.messenger.bd.M0(2131747412, null), dl0Var);
        }
    }

    @Override
    public boolean S(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public vq0 S1() {
        return null;
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public boolean U0(float f10, float f11) {
        switch (this.f45114a) {
            case 14:
                return ((mw) this.f45115b).f47801o0.isInPreviewMode();
            default:
                ge0 ge0Var = (ge0) this.f45115b;
                View view = null;
                ge0Var.P = null;
                int childCount = ge0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = ge0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f10 >= childAt.getLeft() && f10 <= childAt.getRight() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                            view = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                if (view != null && !ge0Var.Q.contains(view)) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public boolean V1(long j10) {
        return false;
    }

    @Override
    public void W0(int i3, int i10) {
        y40 y40Var = (y40) this.f45115b;
        y40Var.X = i3;
        org.telegram.messenger.g0.b4(y40Var.f52181b);
    }

    @Override
    public int X() {
        return 0;
    }

    @Override
    public boolean X0(org.telegram.messenger.zi ziVar) {
        return org.telegram.ui.Cells.f1.a(ziVar);
    }

    @Override
    public boolean Y0() {
        return false;
    }

    @Override
    public boolean Y1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public kh.a Z() {
        return null;
    }

    @Override
    public boolean Z0(View view, float f10, float f11) {
        switch (this.f45114a) {
            case 14:
                return false;
            default:
                ge0 ge0Var = (ge0) this.f45115b;
                ge0.k(ge0Var, view, f10, f11);
                org.telegram.messenger.g0.r(ge0Var.I);
                ge0.l(ge0Var);
                ge0.m(ge0Var, f10, true, false);
                ge0Var.invalidate();
                ge0Var.R.a(true, true);
                return true;
        }
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        pc pcVar = (pc) this.f45115b;
        e6Var = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
        if (e6Var != null) {
            e6Var2 = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
            return e6Var2.a();
        }
        return org.telegram.ui.ActionBar.k6.I.q();
    }

    @Override
    public void a0() {
        ((dh0) this.f45115b).a();
    }

    @Override
    public void a1() {
        pi piVar = (pi) this.f45115b;
        View view = piVar.f48589a;
        if (view != null) {
            view.setPressed(false);
            piVar.f48589a.setSelected(false);
        }
        View view2 = piVar.f48594n;
        if (view2 != null && !piVar.d) {
            view2.callOnClick();
            piVar.d = true;
        }
    }

    @Override
    public boolean mo20b(float f10, float f11, int i3, View view) {
        wz wzVar = (wz) this.f45115b;
        if (view instanceof org.telegram.ui.Cells.g7) {
            wz.a(wzVar, ((org.telegram.ui.Cells.g7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.j7) {
            wz.a(wzVar, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.f7) {
            wz.a(wzVar, ((org.telegram.ui.Cells.f7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.h2) {
            wz.a(wzVar, ((org.telegram.ui.Cells.h2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.t2) {
                if (!wzVar.f51656p0.I()) {
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                    if (t2Var.Z(f10)) {
                        wzVar.f51650j0.Y(t2Var);
                        return true;
                    }
                }
                wz.a(wzVar, ((org.telegram.ui.Cells.t2) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public boolean b0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public boolean d0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void dismiss() {
        ((y40) this.f45115b).f52189x.dismiss();
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public boolean e1(String str, i9 i9Var) {
        return false;
    }

    @Override
    public boolean e2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void f(int i3, boolean z10) {
        boolean z11;
        switch (this.f45114a) {
            case 6:
                v5 v5Var = ((p5) this.f45115b).d;
                v5Var.f50386e0 = i3;
                v5Var.J0(true);
                return;
            case 9:
                rb rbVar = ((pb) this.f45115b).f48505f;
                rbVar.E = i3;
                rbVar.d(true);
                return;
            default:
                yt ytVar = (yt) this.f45115b;
                if (ytVar.f52403f[0].f52100f != i3) {
                    if (i3 == ytVar.f52402e.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ytVar.f52408x = z11;
                    xt xtVar = ytVar.f52403f[1];
                    xtVar.f52100f = i3;
                    xtVar.setVisibility(0);
                    ytVar.r0(true);
                    ytVar.f52405r = z10;
                    return;
                }
                return;
        }
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public String g(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public boolean g0() {
        switch (this.f45114a) {
            case 14:
                return true;
            default:
                return false;
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f45114a) {
            case 3:
                d4 d4Var = (d4) this.f45115b;
                int i3 = d4Var.f44534b;
                return String.valueOf(Math.round((d4Var.f44533a.getProgress() * (d4Var.f44535c - i3)) + i3));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f45114a) {
            case 14:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override
    public void h() {
        ((wz) this.f45115b).f51650j0.finish();
    }

    @Override
    public float h1() {
        return k2.p1.d(9.66f, pi.a.d(((xd) this.f45115b).V0), 0);
    }

    @Override
    public TextureView i0() {
        return null;
    }

    @Override
    public void j() {
        org.telegram.messenger.t0.u();
        boolean z10 = org.telegram.messenger.r2.f25040a;
        org.telegram.messenger.t0.r();
        sf.c.t(((hb) this.f45115b).f45891n.getParentActivity(), org.telegram.messenger.r2.f25045g);
    }

    @Override
    public int j0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override
    public void j1(int i3, int i10) {
        ((u4.h0) this.f45115b).n(i3, i10, null);
    }

    @Override
    public void k(boolean z10, float f10) {
        int i3;
        String a02;
        switch (this.f45114a) {
            case 3:
                d4 d4Var = (d4) this.f45115b;
                int round = Math.round(((d4Var.f44535c - i3) * f10) + d4Var.f44534b);
                if (round != org.telegram.messenger.az.Z0) {
                    org.telegram.messenger.az.Z0 = round;
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                    edit.putInt("iv_font_size", org.telegram.messenger.az.Z0);
                    edit.commit();
                    d4Var.f44537f.f46100v0[0].getAdapter().E.clear();
                    i4 i4Var = d4Var.f44537f;
                    for (int i10 = 0; i10 < 2; i10++) {
                        i4Var.f46100v0[i10].f47084c.f();
                        g4 g4Var = i4Var.f46100v0[i10].f47084c;
                        ArrayList arrayList = g4Var.d;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i11);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.f21387e.a(g4Var.M);
                        Utilities.f21387e.e(g4Var.M, 100L);
                    }
                    d4Var.invalidate();
                    return;
                }
                return;
            case 4:
            default:
                r90 r90Var = (r90) this.f45115b;
                t90 t90Var = r90Var.E;
                int round2 = Math.round(f10 * 100.0f);
                if (round2 != org.telegram.messenger.lc.c()) {
                    org.telegram.messenger.lc.f23967g = b8.be.b(round2, 0, 100);
                    org.telegram.messenger.lc.k();
                    org.telegram.messenger.lc.d(false);
                    t90Var.d0();
                    ArrayList arrayList2 = t90Var.f49748s;
                    if (arrayList2.isEmpty()) {
                        t90Var.c0();
                    } else if (arrayList2.size() >= 2) {
                        if (org.telegram.messenger.lc.c() <= 0) {
                            a02 = org.telegram.messenger.bd.M0(2131748879, null);
                        } else if (org.telegram.messenger.lc.c() >= 100) {
                            a02 = org.telegram.messenger.bd.M0(2131748878, null);
                        } else {
                            a02 = org.telegram.messenger.bd.a0(null, null, 2131748880, String.format("%d%%", Integer.valueOf(org.telegram.messenger.lc.c())));
                        }
                        arrayList2.set(1, new o90(2, 0, a02, 0, 0));
                        t90Var.d.g(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            r90Var.performHapticFeedback(3, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                j5.f46496l1 = f10;
                org.telegram.ui.Components.qt0 qt0Var = ((j5) this.f45115b).f46497j1;
                qt0Var.L();
                qt0Var.M();
                return;
        }
    }

    @Override
    public boolean k1(int i3, View view) {
        switch (this.f45114a) {
            case 6:
                return false;
            case 9:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void l0(int i3, int i10) {
        ((u4.h0) this.f45115b).o(i3, i10);
    }

    @Override
    public void l1(boolean z10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        pc pcVar = (pc) this.f45115b;
        e6Var = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
        if (e6Var instanceof oc) {
            e6Var2 = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
            pc pcVar2 = ((oc) e6Var2).f48256a;
            pcVar2.K = !pcVar2.K;
            pcVar2.k1();
            pcVar2.g1(false);
        }
        pcVar.b1(a(), false);
        pcVar.g1(false);
    }

    @Override
    public void m() {
        hm0 hm0Var = (hm0) this.f45115b;
        if (hm0Var.f45936b.size() == 0) {
            hm0Var.R.setPivotX(0.0f);
            hm0Var.R.setPivotY(0.0f);
            hm0Var.b0(false);
            return;
        }
        hm0Var.R.invalidate();
        hm0Var.b0(true);
    }

    @Override
    public boolean m0() {
        return false;
    }

    @Override
    public int m1() {
        xd xdVar = (xd) this.f45115b;
        return xdVar.W0 + xdVar.X0;
    }

    @Override
    public boolean m2(int i3) {
        return false;
    }

    @Override
    public boolean n1() {
        return false;
    }

    @Override
    public void o(View view, float f10, float f11) {
        switch (this.f45114a) {
            case 14:
                return;
            default:
                ge0 ge0Var = (ge0) this.f45115b;
                ge0.k(ge0Var, view, f10, f11);
                ge0.m(ge0Var, f10, false, true);
                org.telegram.messenger.g0.i3(ge0Var.I, 450L);
                View view2 = ge0Var.P;
                if (view2 != null) {
                    view2.performClick();
                }
                ge0Var.P = null;
                ge0Var.invalidate();
                ge0Var.R.a(false, true);
                return;
        }
    }

    @Override
    public boolean o0(org.telegram.ui.Components.p5 p5Var) {
        return false;
    }

    @Override
    public void o1(View view, float f10, float f11) {
        switch (this.f45114a) {
            case 14:
                return;
            default:
                ge0 ge0Var = (ge0) this.f45115b;
                ge0.k(ge0Var, view, f10, f11);
                ge0.m(ge0Var, f10, false, false);
                ge0Var.invalidate();
                return;
        }
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        pi piVar = (pi) this.f45115b;
        View view = piVar.f48589a;
        if (view != null) {
            view.setPressed(true);
            piVar.f48589a.setSelected(true);
            piVar.f48589a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        pi piVar = (pi) this.f45115b;
        wm wmVar = piVar.f48598x;
        if (piVar.f48589a != null) {
            wmVar.f51316f9 = org.telegram.ui.Components.b9.b(wmVar, piVar.f48597w, wmVar.f51376k6, wmVar.b(), wmVar.f51557ya);
            org.telegram.ui.ActionBar.f1 f1Var = wmVar.f51316f9;
            if (f1Var != null) {
                piVar.f48590b = f1Var;
                f1Var.setOnDismissListener(new f0(piVar, 2));
                wmVar.A0.C0();
                wmVar.C0.R = false;
                View view = piVar.f48597w;
                wmVar.Qb(view);
                if (view != wmVar.f51549y1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wmVar.v8(false, z10, 0.3f);
                wmVar.E9(false);
                ik ikVar = wmVar.O3;
                if (ikVar != null) {
                    ikVar.d(1, true);
                }
                UndoView undoView = wmVar.N3;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                mj mjVar = wmVar.f51237a0;
                if (mjVar != null && mjVar.getEditField() != null) {
                    wmVar.f51237a0.getEditField().setAllowDrawCursor(false);
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
        pi piVar = (pi) this.f45115b;
        if (!piVar.f48592e && (view = piVar.f48589a) != null) {
            view.callOnClick();
            piVar.f48592e = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean p1(org.telegram.ui.Cells.q1 q1Var, int i3) {
        return false;
    }

    @Override
    public int q0() {
        switch (this.f45114a) {
            case 3:
                d4 d4Var = (d4) this.f45115b;
                return d4Var.f44535c - d4Var.f44534b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public org.telegram.ui.Cells.i9 q2() {
        return null;
    }

    @Override
    public void r(float f10) {
        ((wz) this.f45115b).f51650j0.m(f10);
    }

    @Override
    public boolean s1() {
        switch (this.f45114a) {
            case 14:
                return false;
            default:
                return true;
        }
    }

    @Override
    public void t(float f10, float f11) {
        int i3 = this.f45114a;
    }

    @Override
    public void u(Editable editable) {
        hm0 hm0Var = (hm0) this.f45115b;
        org.telegram.ui.Components.jt jtVar = hm0Var.N;
        hm0Var.f45935a = editable;
        jtVar.setText(editable);
    }

    @Override
    public void u0() {
        int i3 = this.f45114a;
    }

    @Override
    public void v0(int i3, boolean z10, boolean z11) {
        hm0 hm0Var = (hm0) this.f45115b;
        hm0Var.removeSelfFromStack();
        if (!z10) {
            hm0Var.a0(hm0Var.f45936b, hm0Var.f45937c, z11, i3);
        }
    }

    @Override
    public void w0(String str) {
        ((wm) ((ci.o4) this.f45115b).f5683c).Da(str, false);
    }

    @Override
    public boolean w1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void x(View view, float f10, float f11) {
        switch (this.f45114a) {
            case 14:
                return;
            default:
                ge0 ge0Var = (ge0) this.f45115b;
                ge0.k(ge0Var, view, f10, f11);
                ge0.m(ge0Var, f10, false, true);
                org.telegram.messenger.g0.i3(ge0Var.I, 450L);
                ge0Var.P = null;
                ge0Var.invalidate();
                ge0Var.R.a(false, true);
                return;
        }
    }

    @Override
    public boolean x0(org.telegram.messenger.zi ziVar) {
        return true;
    }

    @Override
    public boolean y1() {
        return false;
    }

    @Override
    public String z(long j10) {
        return null;
    }

    @Override
    public void b(float f10, float f11, int i3, View view) {
        org.telegram.messenger.zi messageObject;
        kb kbVar = (kb) this.f45115b;
        if ((view instanceof org.telegram.ui.Cells.t0) && (messageObject = ((org.telegram.ui.Cells.t0) view).getMessageObject()) != null) {
            long j10 = messageObject.H0;
            if (j10 != -1) {
                if (kbVar.f46877q0.contains(Long.valueOf(j10))) {
                    kbVar.f46877q0.remove(Long.valueOf(messageObject.H0));
                } else {
                    kbVar.f46877q0.add(Long.valueOf(messageObject.H0));
                }
                kbVar.b1(true);
                kbVar.W0();
                kbVar.F.f();
                return;
            }
        }
        kbVar.U0(view, f10, f11);
    }

    private final void c2(float f10) {
    }

    private final void d2(float f10) {
    }

    @Override
    public void A1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void B(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void C(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void C1(org.telegram.messenger.zi ziVar) {
    }

    @Override
    public void D0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void G(org.telegram.messenger.zi ziVar) {
    }

    @Override
    public void G0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void I(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void J(org.telegram.messenger.wi wiVar) {
    }

    @Override
    public void K0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void N(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void P(org.telegram.messenger.zi ziVar) {
    }

    @Override
    public void Q0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void S0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void T0(int i3) {
    }

    @Override
    public void V(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void V0(org.telegram.messenger.rr rrVar) {
    }

    @Override
    public void Z1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void e0(int i3) {
    }

    @Override
    public void f2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void k0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void l(lh0 lh0Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void p(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void s(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void t1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void w(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void y(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void y0(org.telegram.ui.Cells.q1 q1Var) {
    }

    private final void B1() {
    }

    private final void J1() {
    }

    private final void L1() {
    }

    private final void g2() {
    }

    private final void j2() {
    }

    private final void k2() {
    }

    private final void l2() {
    }

    private final void n2() {
    }

    private final void v1() {
    }

    @Override
    public void K1() {
    }

    @Override
    public void W() {
    }

    @Override
    public void c0() {
    }

    @Override
    public void c1() {
    }

    @Override
    public void g1() {
    }

    @Override
    public void h2() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void q() {
    }

    @Override
    public void v() {
    }

    @Override
    public void z0() {
    }

    private final void D1(float f10, float f11) {
    }

    private final void F1(float f10, float f11) {
    }

    private final void q1(float f10, float f11) {
    }

    @Override
    public void H(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
    }

    @Override
    public void L0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void M1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void Q1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.g10 g10Var) {
    }

    @Override
    public void U1(String str, String str2) {
    }

    @Override
    public void Y(boolean z10, boolean z11) {
    }

    @Override
    public void a2(org.telegram.ui.Cells.q1 q1Var, long j10) {
    }

    @Override
    public void d1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void f1(org.telegram.ui.Cells.q1 q1Var, int i3) {
    }

    @Override
    public void u1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override
    public void x1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void z1(org.telegram.ui.Cells.q1 q1Var, int i3) {
    }

    private final void T1(View view, float f10, float f11) {
    }

    private final void X1(View view, float f10, float f11) {
    }

    private final void b2(View view, float f10, float f11) {
    }

    @Override
    public void A0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void E0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void N0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void h0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void i1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void p0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void p2(org.telegram.ui.Cells.q1 q1Var, int i3, int i10) {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }

    @Override
    public void r1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void N1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    @Override
    public void s0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void t0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void W1(org.telegram.ui.Cells.q1 q1Var, int i3, float f10, float f11, boolean z10) {
    }

    @Override
    public void i(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    @Override
    public void i2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
    }

    @Override
    public void H1(org.telegram.messenger.zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
    }
}
