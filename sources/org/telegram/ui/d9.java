package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class d9 implements org.telegram.ui.Components.ob {
    public final int f38544a;
    public final Object f38545b;

    public d9(Object obj, int i10) {
        this.f38544a = i10;
        this.f38545b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f38544a) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                return true;
            case 9:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void b(org.telegram.ui.Components.qc qcVar) {
        fh.e eVar;
        float f7;
        switch (this.f38544a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.ub ubVar = qcVar.e;
                wn wnVar = (wn) this.f38545b;
                eh.d c10 = wnVar.J.c(ubVar, null, true);
                if (qcVar.f31863l) {
                    eVar = new fh.e(wnVar.f45309ua);
                    eVar.e = new cg(1);
                    eVar.d(536870911, 536870911);
                    eVar.c(536870911, 536870911);
                    float dpf2 = AndroidUtilities.dpf2(0.66f);
                    float dpf22 = AndroidUtilities.dpf2(0.66f);
                    eVar.f10483f = dpf2;
                    eVar.h = dpf22;
                    eVar.b(536870912, 536870912);
                    eVar.f10484n = AndroidUtilities.dp(6.0f);
                    eVar.f10485r = AndroidUtilities.dp(2.0f);
                } else {
                    eVar = new fh.e(wnVar.f45309ua);
                    eVar.e = new gh.a(1);
                    float dpf23 = AndroidUtilities.dpf2(0.5f);
                    float dpf24 = AndroidUtilities.dpf2(0.5f);
                    eVar.f10483f = dpf23;
                    eVar.h = dpf24;
                }
                c10.v(eVar);
                if (qcVar.f31863l) {
                    f7 = 24.0f;
                } else {
                    f7 = 16.0f;
                }
                c10.x(AndroidUtilities.dp(f7));
                ubVar.setCustomBackground(c10);
                return;
            case 3:
                return;
            case 4:
                ey eyVar = (ey) this.f38545b;
                UndoView undoView = eyVar.f39102y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    eyVar.f39102y0[0].d(2, true);
                    return;
                }
                return;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                return;
        }
    }

    @Override
    public final void c(float f7) {
        switch (this.f38544a) {
            case 0:
                o9 o9Var = (o9) this.f38545b;
                o9Var.Q = Math.max(0.0f, (f7 - o9Var.R) - o9Var.P);
                o9Var.c0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f38545b;
                contactsActivity.f35492j0 = Math.max(0.0f, (f7 - contactsActivity.f35493k0) - contactsActivity.f35491i0);
                contactsActivity.f0();
                return;
            case 4:
                ey eyVar = (ey) this.f38545b;
                UndoView undoView = eyVar.f39102y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    eyVar.f39080u1 = Math.max(0.0f, (f7 - eyVar.f39013g4) - eyVar.f39028j4);
                    eyVar.g5();
                    return;
                }
                return;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                return;
        }
    }

    @Override
    public final void d(org.telegram.ui.Components.qc qcVar) {
        int i10 = this.f38544a;
    }

    @Override
    public final boolean e() {
        switch (this.f38544a) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                return true;
            case 9:
                if (((ProfileActivity) this.f38545b).f36148y5 == null) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int f(int i10) {
        int i11;
        int i12;
        int i13;
        qu0 qu0Var;
        int dp;
        float f7;
        int[] iArr;
        int[] iArr2;
        switch (this.f38544a) {
            case 0:
                o9 o9Var = (o9) this.f38545b;
                i11 = o9Var.R;
                i12 = o9Var.P;
                break;
            case 1:
                return ((bd) this.f38545b).O.getMeasuredHeight();
            case 2:
                wn wnVar = (wn) this.f38545b;
                mj mjVar = wnVar.v;
                if (i10 == 1) {
                    return 0;
                }
                if (i10 == 1313167187 && wnVar.f45046a1 != null) {
                    return Math.round(mjVar.d() + AndroidUtilities.dp(62.0f));
                }
                return Math.round(wnVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + wnVar.j9(org.telegram.ui.Components.b41.f26732c) + mjVar.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f38545b;
                i11 = contactsActivity.f35493k0;
                i12 = contactsActivity.f35491i0;
                break;
            case 4:
                ey eyVar = (ey) this.f38545b;
                if (eyVar.Y2 != 0) {
                    return AndroidUtilities.dp(60.0f) + eyVar.f39013g4;
                }
                return eyVar.t3();
            case 5:
                i12 = ((rg0) this.f38545b).K;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                zj0 zj0Var = (zj0) this.f38545b;
                int i14 = zj0Var.f46295x;
                if (zj0Var.j0()) {
                    i13 = 60;
                } else {
                    i13 = 0;
                }
                return AndroidUtilities.dp(i13 + 72) + i14;
            case 7:
                PhotoViewer photoViewer = ((ku0) this.f38545b).f40921t0;
                int i15 = 0;
                if (photoViewer.R4) {
                    qs0 qs0Var = photoViewer.U1;
                    if (qs0Var != null) {
                        i15 = qs0Var.L.f12064l;
                        if (qs0Var.getVisibility() == 0 && ((qu0Var = photoViewer.d) == null || !qu0Var.A())) {
                            i15 = org.telegram.messenger.t.D(12.0f, photoViewer.U1.getEditTextHeight(), i15);
                        }
                    }
                    bi.j5 j5Var = photoViewer.P0;
                    if (j5Var != null && j5Var.getVisibility() == 0) {
                        qs0 qs0Var2 = photoViewer.U1;
                        if (qs0Var2 == null || !qs0Var2.L.c()) {
                            return i15 + photoViewer.P0.getHeight();
                        }
                        return i15;
                    }
                    return i15;
                }
                di.i4 i4Var = photoViewer.f35705i0;
                if (i4Var != null && i4Var.getVisibility() == 0) {
                    i15 = (int) ((photoViewer.f35705i0.getAlpha() * photoViewer.f35705i0.getHeight()) + 0);
                }
                org.telegram.ui.Components.g40 g40Var = photoViewer.l1;
                if (g40Var != null && g40Var.c()) {
                    if (AndroidUtilities.isTablet() || photoViewer.f35670e0.getMeasuredHeight() > photoViewer.f35670e0.getMeasuredWidth()) {
                        return (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i15);
                    }
                    return i15;
                }
                return i15;
            case 8:
                return ((PremiumPreviewFragment) this.f38545b).f35907o0.d;
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) this.f38545b;
                int i16 = 0;
                if (profileActivity.f36148y5 == null) {
                    dp = profileActivity.f36156z6 + profileActivity.f36149y6;
                } else {
                    dp = ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f36148y5.getTranslationY()) - (((1.0f - profileActivity.f36155z5[1].getAlpha()) * AndroidUtilities.dp(72.0f)) * profileActivity.N.o0(9, false))) - (((1.0f - profileActivity.f36155z5[0].getAlpha()) * AndroidUtilities.dp(72.0f)) * profileActivity.N.o0(8, true)))) + profileActivity.f36156z6 + profileActivity.f36149y6;
                }
                xz0 xz0Var = profileActivity.N;
                if (xz0Var != null && xz0Var.f26925a0 != null) {
                    f7 = xz0Var.o0(14, false);
                } else {
                    f7 = 0.0f;
                }
                if (f7 > 0.0f) {
                    org.telegram.ui.Components.ws0 ws0Var = profileActivity.N.f26925a0;
                    View view = profileActivity.fragmentView;
                    FrameLayout frameLayout = ws0Var.f53293r;
                    if (view != null && frameLayout != null && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                        view.getLocationInWindow(new int[2]);
                        frameLayout.getLocationInWindow(new int[2]);
                        i16 = Math.max(0, (int) (frameLayout.getAlpha() * ((view.getHeight() + iArr[1]) - iArr2[1])));
                    }
                    return AndroidUtilities.lerp(dp, Math.max(dp, i16), Math.min(1.0f, f7));
                }
                return dp;
            default:
                cf1 cf1Var = (cf1) this.f38545b;
                r41 r41Var = cf1Var.f38319o0;
                if (r41Var != null && r41Var.getVisibility() == 0) {
                    return cf1Var.f38319o0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f38544a) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return false;
            case 4:
                return false;
            case 5:
                return false;
            case 6:
                return false;
            case 7:
                return false;
            case 8:
                return false;
            case 9:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final int h(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        int i11;
        int max;
        int max2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.k kVar5;
        PhotoViewer photoViewer;
        switch (this.f38544a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                wn wnVar = (wn) this.f38545b;
                kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, wnVar.J9);
                break;
            case 3:
                return 0;
            case 4:
                ey eyVar = (ey) this.f38545b;
                kVar4 = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
                int i15 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                tx txVar = eyVar.f39105z0;
                if (txVar != null && txVar.getVisibility() == 0) {
                    i13 = eyVar.f39105z0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.ws wsVar = eyVar.J1;
                if (wsVar != null) {
                    i14 = wsVar.getHeight();
                } else {
                    i14 = 0;
                }
                int i17 = i16 + i14;
                sw swVar = eyVar.E0;
                if (swVar != null && eyVar.G0) {
                    i15 = (int) ((1.0f - swVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + i17 + i15;
            case 5:
                return 0;
            case 6:
                return 0;
            case 7:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (((ku0) this.f38545b).f40921t0.V1.getAlpha() * photoViewer.V1.getEditTextHeight()));
            case 8:
                return 0;
            case 9:
                max2 = AndroidUtilities.statusBarHeight;
                max = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                break;
            default:
                return 0;
        }
        return max + max2;
    }

    private final void A(org.telegram.ui.Components.qc qcVar) {
    }

    private final void B(org.telegram.ui.Components.qc qcVar) {
    }

    private final void C(org.telegram.ui.Components.qc qcVar) {
    }

    private final void D(org.telegram.ui.Components.qc qcVar) {
    }

    private final void E(org.telegram.ui.Components.qc qcVar) {
    }

    private final void F(org.telegram.ui.Components.qc qcVar) {
    }

    private final void G(org.telegram.ui.Components.qc qcVar) {
    }

    private final void H(org.telegram.ui.Components.qc qcVar) {
    }

    private final void I(org.telegram.ui.Components.qc qcVar) {
    }

    private final void J(org.telegram.ui.Components.qc qcVar) {
    }

    private final void i(float f7) {
    }

    private final void j(float f7) {
    }

    private final void k(float f7) {
    }

    private final void l(float f7) {
    }

    private final void m(float f7) {
    }

    private final void n(float f7) {
    }

    private final void o(float f7) {
    }

    private final void p(float f7) {
    }

    private final void q(org.telegram.ui.Components.qc qcVar) {
    }

    private final void r(org.telegram.ui.Components.qc qcVar) {
    }

    private final void s(org.telegram.ui.Components.qc qcVar) {
    }

    private final void t(org.telegram.ui.Components.qc qcVar) {
    }

    private final void u(org.telegram.ui.Components.qc qcVar) {
    }

    private final void v(org.telegram.ui.Components.qc qcVar) {
    }

    private final void w(org.telegram.ui.Components.qc qcVar) {
    }

    private final void x(org.telegram.ui.Components.qc qcVar) {
    }

    private final void y(org.telegram.ui.Components.qc qcVar) {
    }

    private final void z(org.telegram.ui.Components.qc qcVar) {
    }
}
