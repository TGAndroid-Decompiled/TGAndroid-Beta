package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class b9 implements org.telegram.ui.Components.ob {
    public final int f35615a;
    public final Object f35616b;

    public b9(Object obj, int i10) {
        this.f35615a = i10;
        this.f35616b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f35615a) {
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
            default:
                return true;
        }
    }

    @Override
    public final void b(org.telegram.ui.Components.qc qcVar) {
        switch (this.f35615a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.ub ubVar = qcVar.e;
                sn snVar = (sn) this.f35616b;
                dh.d c10 = snVar.J.c(ubVar, null, true);
                eh.e eVar = new eh.e(snVar.f41226ea);
                eVar.e = new ci.i1(20);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f8663f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                ubVar.setCustomBackground(c10);
                return;
            case 3:
                return;
            case 4:
                ey eyVar = (ey) this.f35616b;
                UndoView undoView = eyVar.f36756y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    eyVar.f36756y0[0].e(2, true);
                    return;
                }
                return;
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                return;
        }
    }

    @Override
    public final void c(float f7) {
        switch (this.f35615a) {
            case 0:
                m9 m9Var = (m9) this.f35616b;
                m9Var.V = Math.max(0.0f, (f7 - m9Var.W) - m9Var.U);
                m9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f35616b;
                contactsActivity.f33089p0 = Math.max(0.0f, (f7 - contactsActivity.f33090q0) - contactsActivity.f33088o0);
                contactsActivity.i0();
                return;
            case 4:
                ey eyVar = (ey) this.f35616b;
                UndoView undoView = eyVar.f36756y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    eyVar.f36735u1 = Math.max(0.0f, (f7 - eyVar.f36668g4) - eyVar.f36683j4);
                    eyVar.V4();
                    return;
                }
                return;
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                return;
        }
    }

    @Override
    public final void d(org.telegram.ui.Components.qc qcVar) {
        int i10 = this.f35615a;
    }

    @Override
    public final boolean e() {
        switch (this.f35615a) {
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
                if (((ProfileActivity) this.f35616b).f33721u5 == null) {
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
        ju0 ju0Var;
        int dp;
        float f7;
        int[] iArr;
        int[] iArr2;
        switch (this.f35615a) {
            case 0:
                m9 m9Var = (m9) this.f35616b;
                i11 = m9Var.W;
                i12 = m9Var.U;
                break;
            case 1:
                return ((dd) this.f35616b).O.getMeasuredHeight();
            case 2:
                sn snVar = (sn) this.f35616b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(snVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + snVar.b9(org.telegram.ui.Components.l31.f28067c) + snVar.v.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f35616b;
                i11 = contactsActivity.f33090q0;
                i12 = contactsActivity.f33088o0;
                break;
            case 4:
                ey eyVar = (ey) this.f35616b;
                if (eyVar.Y2 != 0) {
                    return AndroidUtilities.dp(60.0f) + eyVar.f36668g4;
                }
                return eyVar.k3();
            case 5:
                i12 = ((pg0) this.f35616b).L;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((du0) this.f35616b).E0;
                int i13 = 0;
                if (photoViewer.R4) {
                    js0 js0Var = photoViewer.U1;
                    if (js0Var != null) {
                        i13 = js0Var.L.f8787l;
                        if (js0Var.getVisibility() == 0 && ((ju0Var = photoViewer.d) == null || !ju0Var.A())) {
                            i13 = org.telegram.messenger.g0.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                        }
                    }
                    ai.n5 n5Var = photoViewer.P0;
                    if (n5Var != null && n5Var.getVisibility() == 0) {
                        js0 js0Var2 = photoViewer.U1;
                        if (js0Var2 == null || !js0Var2.L.c()) {
                            return i13 + photoViewer.P0.getHeight();
                        }
                        return i13;
                    }
                    return i13;
                }
                ci.i4 i4Var = photoViewer.f33308i0;
                if (i4Var != null && i4Var.getVisibility() == 0) {
                    i13 = (int) ((photoViewer.f33308i0.getAlpha() * photoViewer.f33308i0.getHeight()) + 0);
                }
                org.telegram.ui.Components.e40 e40Var = photoViewer.l1;
                if (e40Var != null && e40Var.c()) {
                    if (AndroidUtilities.isTablet() || photoViewer.f33273e0.getMeasuredHeight() > photoViewer.f33273e0.getMeasuredWidth()) {
                        return (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13);
                    }
                    return i13;
                }
                return i13;
            case 7:
                return ((PremiumPreviewFragment) this.f35616b).f33510o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f35616b;
                int i14 = 0;
                if (profileActivity.f33721u5 == null) {
                    dp = profileActivity.f33673n6 + profileActivity.f33665m6;
                } else {
                    dp = ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f33721u5.getTranslationY()) - (profileActivity.f33728v5[1].getTranslationY() * profileActivity.O.h0(9, false))) - (profileActivity.f33728v5[0].getTranslationY() * profileActivity.O.h0(8, true)))) + profileActivity.f33673n6 + profileActivity.f33665m6;
                }
                pz0 pz0Var = profileActivity.O;
                if (pz0Var != null && pz0Var.V != null) {
                    f7 = pz0Var.h0(14, false);
                } else {
                    f7 = 0.0f;
                }
                if (f7 > 0.0f) {
                    org.telegram.ui.Components.is0 is0Var = profileActivity.O.V;
                    View view = profileActivity.fragmentView;
                    FrameLayout frameLayout = is0Var.f50522r;
                    if (view != null && frameLayout != null && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                        view.getLocationInWindow(new int[2]);
                        frameLayout.getLocationInWindow(new int[2]);
                        i14 = Math.max(0, (int) (frameLayout.getAlpha() * ((view.getHeight() + iArr[1]) - iArr2[1])));
                    }
                    return AndroidUtilities.lerp(dp, Math.max(dp, i14), Math.min(1.0f, f7));
                }
                return dp;
            default:
                te1 te1Var = (te1) this.f35616b;
                l41 l41Var = te1Var.f41735o0;
                if (l41Var != null && l41Var.getVisibility() == 0) {
                    return te1Var.f41735o0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f35615a) {
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
        switch (this.f35615a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                sn snVar = (sn) this.f35616b;
                kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, snVar.f41411t9);
                break;
            case 3:
                return 0;
            case 4:
                ey eyVar = (ey) this.f35616b;
                kVar4 = ((org.telegram.ui.ActionBar.n2) eyVar).actionBar;
                int i15 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.n2) eyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                cw cwVar = eyVar.f36759z0;
                if (cwVar != null && cwVar.getVisibility() == 0) {
                    i13 = eyVar.f36759z0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.us usVar = eyVar.J1;
                if (usVar != null) {
                    i14 = usVar.getHeight();
                } else {
                    i14 = 0;
                }
                int i17 = i16 + i14;
                vw vwVar = eyVar.E0;
                if (vwVar != null && eyVar.G0) {
                    i15 = (int) ((1.0f - vwVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + i17 + i15;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (((du0) this.f35616b).E0.V1.getAlpha() * photoViewer.V1.getEditTextHeight()));
            case 7:
                return 0;
            case 8:
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

    private final void p(org.telegram.ui.Components.qc qcVar) {
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
