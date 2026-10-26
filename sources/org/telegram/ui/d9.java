package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class d9 implements org.telegram.ui.Components.ob {
    public final int f38774a;
    public final Object f38775b;

    public d9(Object obj, int i10) {
        this.f38774a = i10;
        this.f38775b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f38774a) {
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
        switch (this.f38774a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.ub ubVar = qcVar.e;
                un unVar = (un) this.f38775b;
                eh.d c10 = unVar.J.c(ubVar, null, true);
                if (qcVar.f31891l) {
                    eVar = new fh.e(unVar.f44388qa);
                    eVar.e = new cg(1);
                    eVar.d(536870911, 536870911);
                    eVar.c(536870911, 536870911);
                    float dpf2 = AndroidUtilities.dpf2(0.66f);
                    float dpf22 = AndroidUtilities.dpf2(0.66f);
                    eVar.f10484f = dpf2;
                    eVar.h = dpf22;
                    eVar.b(536870912, 536870912);
                    eVar.f10485n = AndroidUtilities.dp(6.0f);
                    eVar.f10486r = AndroidUtilities.dp(2.0f);
                } else {
                    eVar = new fh.e(unVar.f44388qa);
                    eVar.e = new gh.a(1);
                    float dpf23 = AndroidUtilities.dpf2(0.5f);
                    float dpf24 = AndroidUtilities.dpf2(0.5f);
                    eVar.f10484f = dpf23;
                    eVar.h = dpf24;
                }
                c10.v(eVar);
                if (qcVar.f31891l) {
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
                cy cyVar = (cy) this.f38775b;
                UndoView undoView = cyVar.f38690y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    cyVar.f38690y0[0].d(2, true);
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
        switch (this.f38774a) {
            case 0:
                o9 o9Var = (o9) this.f38775b;
                o9Var.Q = Math.max(0.0f, (f7 - o9Var.R) - o9Var.P);
                o9Var.c0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f38775b;
                contactsActivity.f35468j0 = Math.max(0.0f, (f7 - contactsActivity.f35469k0) - contactsActivity.f35467i0);
                contactsActivity.f0();
                return;
            case 4:
                cy cyVar = (cy) this.f38775b;
                UndoView undoView = cyVar.f38690y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    cyVar.f38668u1 = Math.max(0.0f, (f7 - cyVar.f38601g4) - cyVar.f38616j4);
                    cyVar.g5();
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
        int i10 = this.f38774a;
    }

    @Override
    public final boolean e() {
        switch (this.f38774a) {
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
                if (((ProfileActivity) this.f38775b).f36124y5 == null) {
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
        ou0 ou0Var;
        int dp;
        float f7;
        int[] iArr;
        int[] iArr2;
        switch (this.f38774a) {
            case 0:
                o9 o9Var = (o9) this.f38775b;
                i11 = o9Var.R;
                i12 = o9Var.P;
                break;
            case 1:
                return ((bd) this.f38775b).O.getMeasuredHeight();
            case 2:
                un unVar = (un) this.f38775b;
                jj jjVar = unVar.v;
                if (i10 == 1) {
                    return 0;
                }
                if (i10 == 1313167187 && unVar.f44181a1 != null) {
                    return Math.round(jjVar.d() + AndroidUtilities.dp(62.0f));
                }
                return Math.round(unVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + unVar.g9(org.telegram.ui.Components.a41.f26410c) + jjVar.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f38775b;
                i11 = contactsActivity.f35469k0;
                i12 = contactsActivity.f35467i0;
                break;
            case 4:
                cy cyVar = (cy) this.f38775b;
                if (cyVar.Y2 != 0) {
                    return AndroidUtilities.dp(60.0f) + cyVar.f38601g4;
                }
                return cyVar.t3();
            case 5:
                i12 = ((pg0) this.f38775b).K;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                xj0 xj0Var = (xj0) this.f38775b;
                int i14 = xj0Var.f45791x;
                if (xj0Var.j0()) {
                    i13 = 60;
                } else {
                    i13 = 0;
                }
                return AndroidUtilities.dp(i13 + 72) + i14;
            case 7:
                PhotoViewer photoViewer = ((iu0) this.f38775b).f40357t0;
                int i15 = 0;
                if (photoViewer.R4) {
                    os0 os0Var = photoViewer.U1;
                    if (os0Var != null) {
                        i15 = os0Var.L.f12065l;
                        if (os0Var.getVisibility() == 0 && ((ou0Var = photoViewer.d) == null || !ou0Var.A())) {
                            i15 = org.telegram.messenger.t.D(12.0f, photoViewer.U1.getEditTextHeight(), i15);
                        }
                    }
                    bi.j5 j5Var = photoViewer.P0;
                    if (j5Var != null && j5Var.getVisibility() == 0) {
                        os0 os0Var2 = photoViewer.U1;
                        if (os0Var2 == null || !os0Var2.L.c()) {
                            return i15 + photoViewer.P0.getHeight();
                        }
                        return i15;
                    }
                    return i15;
                }
                di.i4 i4Var = photoViewer.f35681i0;
                if (i4Var != null && i4Var.getVisibility() == 0) {
                    i15 = (int) ((photoViewer.f35681i0.getAlpha() * photoViewer.f35681i0.getHeight()) + 0);
                }
                org.telegram.ui.Components.g40 g40Var = photoViewer.l1;
                if (g40Var != null && g40Var.c()) {
                    if (AndroidUtilities.isTablet() || photoViewer.f35646e0.getMeasuredHeight() > photoViewer.f35646e0.getMeasuredWidth()) {
                        return (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i15);
                    }
                    return i15;
                }
                return i15;
            case 8:
                return ((PremiumPreviewFragment) this.f38775b).f35883o0.d;
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) this.f38775b;
                int i16 = 0;
                if (profileActivity.f36124y5 == null) {
                    dp = profileActivity.f36132z6 + profileActivity.f36125y6;
                } else {
                    dp = ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f36124y5.getTranslationY()) - (((1.0f - profileActivity.f36131z5[1].getAlpha()) * AndroidUtilities.dp(72.0f)) * profileActivity.N.o0(9, false))) - (((1.0f - profileActivity.f36131z5[0].getAlpha()) * AndroidUtilities.dp(72.0f)) * profileActivity.N.o0(8, true)))) + profileActivity.f36132z6 + profileActivity.f36125y6;
                }
                vz0 vz0Var = profileActivity.N;
                if (vz0Var != null && vz0Var.f26637a0 != null) {
                    f7 = vz0Var.o0(14, false);
                } else {
                    f7 = 0.0f;
                }
                if (f7 > 0.0f) {
                    org.telegram.ui.Components.vs0 vs0Var = profileActivity.N.f26637a0;
                    View view = profileActivity.fragmentView;
                    FrameLayout frameLayout = vs0Var.f53235r;
                    if (view != null && frameLayout != null && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                        view.getLocationInWindow(new int[2]);
                        frameLayout.getLocationInWindow(new int[2]);
                        i16 = Math.max(0, (int) (frameLayout.getAlpha() * ((view.getHeight() + iArr[1]) - iArr2[1])));
                    }
                    return AndroidUtilities.lerp(dp, Math.max(dp, i16), Math.min(1.0f, f7));
                }
                return dp;
            default:
                af1 af1Var = (af1) this.f38775b;
                o41 o41Var = af1Var.f37765o0;
                if (o41Var != null && o41Var.getVisibility() == 0) {
                    return af1Var.f37765o0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f38774a) {
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
        switch (this.f38774a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                un unVar = (un) this.f38775b;
                kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, unVar.F9);
                break;
            case 3:
                return 0;
            case 4:
                cy cyVar = (cy) this.f38775b;
                kVar4 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                int i15 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                qx qxVar = cyVar.f38693z0;
                if (qxVar != null && qxVar.getVisibility() == 0) {
                    i13 = cyVar.f38693z0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.ws wsVar = cyVar.J1;
                if (wsVar != null) {
                    i14 = wsVar.getHeight();
                } else {
                    i14 = 0;
                }
                int i17 = i16 + i14;
                qw qwVar = cyVar.E0;
                if (qwVar != null && cyVar.G0) {
                    i15 = (int) ((1.0f - qwVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + i17 + i15;
            case 5:
                return 0;
            case 6:
                return 0;
            case 7:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (((iu0) this.f38775b).f40357t0.V1.getAlpha() * photoViewer.V1.getEditTextHeight()));
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
