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
public final class f implements r9, dr0, org.telegram.ui.web.w0, org.telegram.ui.Components.lm0, org.telegram.ui.Components.t4, org.telegram.ui.Components.uk0, org.telegram.ui.Components.cj0, org.telegram.ui.Cells.l1, n71, org.telegram.ui.Components.et0, kl, ue.a, org.telegram.ui.Components.ej0, org.telegram.ui.Cells.n7, org.telegram.ui.Components.co0, v4.d0, org.telegram.ui.Components.f8, org.telegram.ui.Components.z00, r0.m, fx0, wm0 {
    public final int f45408a;
    public final Object f45409b;

    public f(Object obj, int i7) {
        this.f45408a = i7;
        this.f45409b = obj;
    }

    @Override
    public void A() {
        mm0 mm0Var = (mm0) this.f45409b;
        if (mm0Var.f47835b.size() == 0) {
            mm0Var.Q.setPivotX(0.0f);
            mm0Var.Q.setPivotY(0.0f);
            mm0Var.b0(false);
            return;
        }
        mm0Var.Q.invalidate();
        mm0Var.b0(true);
    }

    @Override
    public void B(Editable editable) {
        mm0 mm0Var = (mm0) this.f45409b;
        org.telegram.ui.Components.lt ltVar = mm0Var.M;
        mm0Var.f47834a = editable;
        ltVar.setText(editable);
    }

    @Override
    public void B1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override
    public void C0() {
        if (org.telegram.messenger.g0.I3()) {
            ((c40) this.f45409b).n1().k(0L, 33, null, null, null, null);
        }
    }

    @Override
    public CharacterStyle C1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public void D() {
        switch (this.f45408a) {
            case 3:
                return;
            case 4:
            default:
                return;
            case 5:
                ((h5) this.f45409b).f46221i1.M();
                return;
        }
    }

    @Override
    public void E(int i7, int i10) {
        ((v4.g0) this.f45409b).j(i7, i10);
    }

    @Override
    public boolean E1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.ij ijVar) {
        return false;
    }

    @Override
    public void F(boolean z9) {
        Runnable runnable = ((zd) this.f45409b).S0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void F0(float f10) {
        switch (this.f45408a) {
            case 6:
            case 9:
                return;
            default:
                au auVar = (au) this.f45409b;
                int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i7 != 0 || auVar.f44099f[1].getVisibility() == 0) {
                    if (auVar.f44101r) {
                        zt ztVar = auVar.f44099f[0];
                        ztVar.setTranslationX((-f10) * ztVar.getMeasuredWidth());
                        zt[] ztVarArr = auVar.f44099f;
                        ztVarArr[1].setTranslationX(ztVarArr[0].getMeasuredWidth() - (f10 * auVar.f44099f[0].getMeasuredWidth()));
                    } else {
                        zt ztVar2 = auVar.f44099f[0];
                        ztVar2.setTranslationX(ztVar2.getMeasuredWidth() * f10);
                        zt[] ztVarArr2 = auVar.f44099f;
                        ztVarArr2[1].setTranslationX((f10 * ztVarArr2[0].getMeasuredWidth()) - auVar.f44099f[0].getMeasuredWidth());
                    }
                    if (i7 == 0) {
                        zt[] ztVarArr3 = auVar.f44099f;
                        zt ztVar3 = ztVarArr3[0];
                        ztVarArr3[0] = ztVarArr3[1];
                        ztVarArr3[1] = ztVar3;
                        ztVar3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void H0() {
        int i7 = this.f45408a;
    }

    @Override
    public void I0(org.telegram.messenger.ij ijVar) {
        k3 k3Var = ((g4) this.f45409b).f45819u0[0];
        if (k3Var != null) {
            k3Var.f47085b.I0(true);
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
        g gVar = (g) this.f45409b;
        gVar.finishFragment(false);
        pu puVar = gVar.f45740y;
        LaunchActivity launchActivity = (LaunchActivity) puVar.f48954b;
        String str2 = LaunchActivity.B1;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, launchActivity, null);
        u1Var.f28572i0 = false;
        u1Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new h50(3, u1Var, (g) puVar.f48955c));
    }

    @Override
    public void M0(int i7, int i10) {
        ((v4.g0) this.f45409b).p(i7, i10);
    }

    @Override
    public fr0 N1() {
        return null;
    }

    @Override
    public void O(float f10, float f11) {
        org.telegram.ui.ActionBar.q4 q4Var;
        switch (this.f45408a) {
            case 14:
                q4Var = ((org.telegram.ui.ActionBar.f2) ((pw) this.f45409b).f48966n0).parentLayout;
                ((ActionBarLayout) q4Var).r();
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
        bg0 bg0Var = (bg0) this.f45409b;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        bg0Var.d = I0;
        bg0Var.F.setPadding(I0.f15120a, I0.f15121b, I0.f15122c, I0.d);
        bg0Var.E.requestLayout();
        return r0.k1.f54200b;
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
        switch (this.f45408a) {
            case 14:
                return ((pw) this.f45409b).f48966n0.isInPreviewMode();
            default:
                le0 le0Var = (le0) this.f45409b;
                View view = null;
                le0Var.O = null;
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
                if (view != null && !le0Var.P.contains(view)) {
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
        d50 d50Var = (d50) this.f45409b;
        d50Var.W = i7;
        org.telegram.messenger.g0.b4(d50Var.f44952b);
    }

    public void X1(pd0 pd0Var) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        be0 be0Var = (be0) this.f45409b;
        be0Var.N = true;
        ce0 ce0Var = be0Var.f44304g0;
        ce0Var.J = 0;
        ce0Var.F1(0, false);
        int i7 = Build.VERSION.SDK_INT;
        if (org.telegram.messenger.g0.N1()) {
            if (ce0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (ce0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i7 >= 28 && ce0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (i7 >= 26 && ce0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                z13 = false;
            } else {
                z13 = true;
            }
            zd0 zd0Var = be0Var.f44293a;
            if (zd0Var != null && "888".equals(zd0Var.getText())) {
                z10 = true;
                z11 = true;
                z12 = true;
                z13 = true;
            }
            if (ce0Var.f44790w) {
                ce0Var.f44783r.clear();
                if (!z10) {
                    ce0Var.f44783r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z11) {
                    ce0Var.f44783r.add("android.permission.CALL_PHONE");
                }
                if (!z12) {
                    ce0Var.f44783r.add("android.permission.READ_CALL_LOG");
                }
                if (!z13 && i7 >= 26) {
                    ce0Var.f44783r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!ce0Var.f44783r.isEmpty()) {
                    SharedPreferences e12 = org.telegram.messenger.qp.e1();
                    if (!e12.getBoolean("firstlogin", true) && !ce0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !ce0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            ce0Var.getParentActivity().requestPermissions((String[]) ce0Var.f44783r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    e12.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, "Continue"), null);
                    int i10 = 2131623958;
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    if (!z10 && (!z11 || !z12)) {
                        u1Var.T = org.telegram.messenger.id.M0(2131754274, "AllowReadCallAndLog");
                    } else if (z11 && z12) {
                        u1Var.T = org.telegram.messenger.id.M0(2131754275, "AllowReadCall");
                        i10 = 2131624066;
                    } else {
                        u1Var.T = org.telegram.messenger.id.M0(2131754273, "AllowReadCallLog");
                    }
                    int i11 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
                    alertDialog$Builder.n(i11, null);
                    ce0Var.h = ce0Var.showDialog(u1Var);
                    be0Var.N = true;
                    return;
                }
            }
            z9 = true;
        } else {
            z9 = true;
        }
        ae0 ae0Var = new ae0(0, this, pd0Var);
        pd0Var.h.f(z9, z9);
        org.telegram.messenger.g0.i3(ae0Var, 400L);
    }

    @Override
    public float Y0() {
        return jg.g.e(9.66f, oi.a.d(((zd) this.f45409b).U0), 0);
    }

    public void Y1(Exception exc) {
        hl0 hl0Var = (hl0) this.f45409b;
        if (hl0Var.Q0) {
            return;
        }
        hl0Var.N0(true, false);
        hl0Var.J0(false);
        if (!(exc instanceof tc.a) && !(exc instanceof tc.b)) {
            org.telegram.ui.Components.v4.t0(exc.getMessage(), hl0Var);
        } else {
            org.telegram.ui.Components.v4.t0(org.telegram.messenger.id.M0(2131747405, null), hl0Var);
        }
    }

    @Override
    public jh.a Z() {
        return null;
    }

    @Override
    public boolean a() {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        rc rcVar = (rc) this.f45409b;
        f6Var = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
        if (f6Var != null) {
            f6Var2 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            return f6Var2.a();
        }
        return org.telegram.ui.ActionBar.k6.I.q();
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
        switch (this.f45408a) {
            case 6:
                t5 t5Var = ((n5) this.f45409b).d;
                t5Var.f49918d0 = i7;
                t5Var.J0(true);
                return;
            case 9:
                tb tbVar = ((rb) this.f45409b).f49428f;
                tbVar.D = i7;
                tbVar.d(true);
                return;
            default:
                au auVar = (au) this.f45409b;
                if (auVar.f44099f[0].f52680f != i7) {
                    if (i7 == auVar.f44098e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    auVar.f44104x = z10;
                    zt ztVar = auVar.f44099f[1];
                    ztVar.f52680f = i7;
                    ztVar.setVisibility(0);
                    auVar.r0(true);
                    auVar.f44101r = z9;
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
        int i7 = this.f45408a;
    }

    @Override
    public void c0() {
        ((hh0) this.f45409b).a();
    }

    @Override
    public boolean c1(View view, float f10, float f11) {
        switch (this.f45408a) {
            case 14:
                return false;
            default:
                le0 le0Var = (le0) this.f45409b;
                le0.k(le0Var, view, f10, f11);
                org.telegram.messenger.g0.r(le0Var.H);
                le0.l(le0Var);
                le0.m(le0Var, f10, true, false);
                le0Var.invalidate();
                le0Var.Q.a(true, true);
                return true;
        }
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public void d1() {
        ti tiVar = (ti) this.f45409b;
        View view = tiVar.f50065a;
        if (view != null) {
            view.setPressed(false);
            tiVar.f50065a.setSelected(false);
        }
        View view2 = tiVar.f50070n;
        if (view2 != null && !tiVar.d) {
            view2.callOnClick();
            tiVar.d = true;
        }
    }

    @Override
    public void dismiss() {
        ((d50) this.f45409b).f44960x.dismiss();
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
        zd zdVar = (zd) this.f45409b;
        return zdVar.V0 + zdVar.W0;
    }

    @Override
    public boolean mo19f(float f10, float f11, int i7, View view) {
        yz yzVar = (yz) this.f45409b;
        if (view instanceof org.telegram.ui.Cells.h7) {
            yz.a(yzVar, ((org.telegram.ui.Cells.h7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.k7) {
            yz.a(yzVar, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.g7) {
            yz.a(yzVar, ((org.telegram.ui.Cells.g7) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof org.telegram.ui.Cells.h2) {
            yz.a(yzVar, ((org.telegram.ui.Cells.h2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof org.telegram.ui.Cells.t2) {
                if (!yzVar.f52377o0.i()) {
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                    if (t2Var.Z(f10)) {
                        yzVar.f52371i0.O(t2Var);
                        return true;
                    }
                }
                yz.a(yzVar, ((org.telegram.ui.Cells.t2) view).getMessage(), view, 0);
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
        switch (this.f45408a) {
            case 3:
                c4 c4Var = (c4) this.f45409b;
                int i7 = c4Var.f44538b;
                return String.valueOf(Math.round((c4Var.f44537a.getProgress() * (c4Var.f44539c - i7)) + i7));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override
    public long getLongPressDuration() {
        switch (this.f45408a) {
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
        ((yz) this.f45409b).f52371i0.finish();
    }

    @Override
    public boolean j0() {
        switch (this.f45408a) {
            case 14:
                return true;
            default:
                return false;
        }
    }

    @Override
    public void k() {
        org.telegram.messenger.t0.u();
        boolean z9 = org.telegram.messenger.r2.f25212a;
        org.telegram.messenger.t0.r();
        vf.c.t(((jb) this.f45409b).f46918n.getParentActivity(), org.telegram.messenger.r2.f25217g);
    }

    @Override
    public boolean k0() {
        return false;
    }

    @Override
    public void k1(int i7, int i10) {
        ((v4.g0) this.f45409b).n(i7, i10, null);
    }

    @Override
    public org.telegram.ui.Cells.j9 k2() {
        return null;
    }

    @Override
    public void l(boolean z9, float f10) {
        int i7;
        String a02;
        switch (this.f45408a) {
            case 3:
                c4 c4Var = (c4) this.f45409b;
                int round = Math.round(((c4Var.f44539c - i7) * f10) + c4Var.f44538b);
                if (round != org.telegram.messenger.iz.Z0) {
                    org.telegram.messenger.iz.Z0 = round;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    edit.putInt("iv_font_size", org.telegram.messenger.iz.Z0);
                    edit.commit();
                    c4Var.f44541f.f45819u0[0].getAdapter().D.clear();
                    g4 g4Var = c4Var.f44541f;
                    for (int i10 = 0; i10 < 2; i10++) {
                        g4Var.f45819u0[i10].f47086c.f();
                        e4 e4Var = g4Var.f45819u0[i10].f47086c;
                        ArrayList arrayList = e4Var.d;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i11);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.f21336e.a(e4Var.L);
                        Utilities.f21336e.d(e4Var.L, 100L);
                    }
                    c4Var.invalidate();
                    return;
                }
                return;
            case 4:
            default:
                u90 u90Var = (u90) this.f45409b;
                w90 w90Var = u90Var.D;
                int round2 = Math.round(f10 * 100.0f);
                if (round2 != org.telegram.messenger.sc.c()) {
                    org.telegram.messenger.sc.f25448g = c8.j9.b(round2, 0, 100);
                    org.telegram.messenger.sc.k();
                    org.telegram.messenger.sc.d(false);
                    w90Var.d0();
                    ArrayList arrayList2 = w90Var.f50990s;
                    if (arrayList2.isEmpty()) {
                        w90Var.c0();
                    } else if (arrayList2.size() >= 2) {
                        if (org.telegram.messenger.sc.c() <= 0) {
                            a02 = org.telegram.messenger.id.M0(2131748872, null);
                        } else if (org.telegram.messenger.sc.c() >= 100) {
                            a02 = org.telegram.messenger.id.M0(2131748871, null);
                        } else {
                            a02 = org.telegram.messenger.id.a0(null, null, 2131748873, String.format("%d%%", Integer.valueOf(org.telegram.messenger.sc.c())));
                        }
                        arrayList2.set(1, new r90(2, 0, a02, 0, 0));
                        w90Var.d.g(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            u90Var.performHapticFeedback(3, 1);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                h5.f46220k1 = f10;
                org.telegram.ui.Components.rt0 rt0Var = ((h5) this.f45409b).f46221i1;
                rt0Var.L();
                rt0Var.M();
                return;
        }
    }

    @Override
    public TextureView l0() {
        return null;
    }

    @Override
    public void l1(View view, float f10, float f11) {
        switch (this.f45408a) {
            case 14:
                return;
            default:
                le0 le0Var = (le0) this.f45409b;
                le0.k(le0Var, view, f10, f11);
                le0.m(le0Var, f10, false, false);
                le0Var.invalidate();
                return;
        }
    }

    @Override
    public void m(View view, float f10, float f11) {
        switch (this.f45408a) {
            case 14:
                return;
            default:
                le0 le0Var = (le0) this.f45409b;
                le0.k(le0Var, view, f10, f11);
                le0.m(le0Var, f10, false, true);
                org.telegram.messenger.g0.i3(le0Var.H, 450L);
                View view2 = le0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                le0Var.O = null;
                le0Var.invalidate();
                le0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public boolean m1(int i7, View view) {
        switch (this.f45408a) {
            case 6:
                return false;
            case 9:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean n0(org.telegram.ui.Components.r5 r5Var) {
        return false;
    }

    @Override
    public boolean n1() {
        return false;
    }

    @Override
    public void o0(int i7, int i10) {
        ((v4.g0) this.f45409b).o(i7, i10);
    }

    @Override
    public boolean o1() {
        switch (this.f45408a) {
            case 14:
                return false;
            default:
                return true;
        }
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        ti tiVar = (ti) this.f45409b;
        View view = tiVar.f50065a;
        if (view != null) {
            view.setPressed(true);
            tiVar.f50065a.setSelected(true);
            tiVar.f50065a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
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
        ti tiVar = (ti) this.f45409b;
        an anVar = tiVar.f50074x;
        if (tiVar.f50065a != null) {
            anVar.f43787e9 = org.telegram.ui.Components.d9.b(anVar, tiVar.f50073w, anVar.f43848j6, anVar.b(), anVar.f44028xa);
            org.telegram.ui.ActionBar.g1 g1Var = anVar.f43787e9;
            if (g1Var != null) {
                tiVar.f50066b = g1Var;
                g1Var.setOnDismissListener(new e0(tiVar, 2));
                anVar.f44043z0.C0();
                anVar.B0.R = false;
                View view = tiVar.f50073w;
                anVar.Qb(view);
                if (view != anVar.f44019x1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                anVar.v8(false, z9, 0.3f);
                anVar.E9(false);
                mk mkVar = anVar.N3;
                if (mkVar != null) {
                    mkVar.d(1, true);
                }
                UndoView undoView = anVar.M3;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                qj qjVar = anVar.Z;
                if (qjVar != null && qjVar.getEditField() != null) {
                    anVar.Z.getEditField().setAllowDrawCursor(false);
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
        ti tiVar = (ti) this.f45409b;
        if (!tiVar.f50068e && (view = tiVar.f50065a) != null) {
            view.callOnClick();
            tiVar.f50068e = true;
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
        ((yz) this.f45409b).f52371i0.A(f10);
    }

    @Override
    public int q0() {
        switch (this.f45408a) {
            case 3:
                c4 c4Var = (c4) this.f45409b;
                return c4Var.f44539c - c4Var.f44538b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override
    public void s(float f10, float f11) {
        int i7 = this.f45408a;
    }

    @Override
    public void t0() {
        int i7 = this.f45408a;
    }

    @Override
    public void t1(boolean z9) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        rc rcVar = (rc) this.f45409b;
        f6Var = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
        if (f6Var instanceof qc) {
            f6Var2 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            rc rcVar2 = ((qc) f6Var2).f49188a;
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
        mm0 mm0Var = (mm0) this.f45409b;
        mm0Var.removeSelfFromStack();
        if (!z9) {
            mm0Var.a0(mm0Var.f47835b, mm0Var.f47836c, z10, i7);
        }
    }

    @Override
    public void w(View view, float f10, float f11) {
        switch (this.f45408a) {
            case 14:
                return;
            default:
                le0 le0Var = (le0) this.f45409b;
                le0.k(le0Var, view, f10, f11);
                le0.m(le0Var, f10, false, true);
                org.telegram.messenger.g0.i3(le0Var.H, 450L);
                le0Var.O = null;
                le0Var.invalidate();
                le0Var.Q.a(false, true);
                return;
        }
    }

    @Override
    public void w0(String str) {
        ((an) ((bi.g5) this.f45409b).f3941c).Da(str, false);
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
        mb mbVar = (mb) this.f45409b;
        if ((view instanceof org.telegram.ui.Cells.t0) && (messageObject = ((org.telegram.ui.Cells.t0) view).getMessageObject()) != null) {
            long j3 = messageObject.H0;
            if (j3 != -1) {
                if (mbVar.f47759p0.contains(Long.valueOf(j3))) {
                    mbVar.f47759p0.remove(Long.valueOf(messageObject.H0));
                } else {
                    mbVar.f47759p0.add(Long.valueOf(messageObject.H0));
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
    public void t(oh0 oh0Var) {
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
